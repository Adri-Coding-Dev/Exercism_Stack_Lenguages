public class LogLine {
    private String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public String getLogLine(){
        return this.logLine;
    }

    public LogLevel getLogLevel() {
        String logLine = getLogLine();
        String logLevelState = logLine.substring(1,4);
        switch (logLevelState){
            case "TRC":
                return LogLevel.TRACE;

            case "DBG":
                return LogLevel.DEBUG;

            case "INF":
                return LogLevel.INFO;

            case "WRN":
                return LogLevel.WARNING;

            case "ERR":
                return LogLevel.ERROR;

            case "FTL":
                return LogLevel.FATAL;

            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        String logLine = getLogLine();
        LogLevel ll = getLogLevel();

        switch (ll){
            case TRACE -> {
                return logLine.replace(logLine.substring(0,7),"1:");
            }

            case DEBUG -> {
                return logLine.replace(logLine.substring(0,7),"2:");
            }

            case INFO -> {
                return logLine.replace(logLine.substring(0,7),"4:");
            }

            case WARNING -> {
                return logLine.replace(logLine.substring(0,7),"5:");
            }

            case ERROR -> {
                return logLine.replace(logLine.substring(0,7),"6:");
            }

            case FATAL -> {
                return logLine.replace(logLine.substring(0,7),"42:");
            }

            case UNKNOWN -> {
                return logLine.replace(logLine.substring(0,7),"0:");
            }
        }

        return null;
    }
}
