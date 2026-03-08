import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        //  7/25/2019 13:45:00
        appointmentDateDescription = appointmentDateDescription.replace(" ", ":");
        String cadenaConvertida = appointmentDateDescription.replace("/",":");
        String[] elementos = cadenaConvertida.split(":");

        return LocalDateTime.of(convertirCadenaAEntero(elementos[2]), convertirCadenaAEntero(elementos[0]),
                convertirCadenaAEntero(elementos[1]), convertirCadenaAEntero(elementos[3]),
                convertirCadenaAEntero(elementos[4]), convertirCadenaAEntero(elementos[5]));
    }

    private int convertirCadenaAEntero(String cadena){
        return Integer.parseInt(cadena);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime actual = LocalDateTime.now();
        return actual.isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hora = appointmentDate.getHour();

        return (hora >= 12 && hora < 18);
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DayOfWeek diaSemana = appointmentDate.getDayOfWeek();
        char primeraLetra = diaSemana.toString().charAt(0);
        String diaSemanaConvertido = primeraLetra + diaSemana.toString().substring(1).toLowerCase();

        Month mes = appointmentDate.getMonth();
        primeraLetra = mes.toString().charAt(0);
        String mesConvertido = primeraLetra + mes.toString().substring(1).toLowerCase();

        int diaMes = appointmentDate.getDayOfMonth();

        int anio = appointmentDate.getYear();

        int hora = appointmentDate.getHour();
        int minuto = appointmentDate.getMinute();
        String minutoConvertido;
        if(minuto < 10){
            minutoConvertido = "0"+minuto;
        }else{
            minutoConvertido = String.valueOf(minuto);
        }

        String horaConvertida;
        if(hora > 12){
            horaConvertida = (hora - 12) + ":" + minutoConvertido + " PM.";
        }else{
            horaConvertida = hora + ":" + minutoConvertido + " AM.";
        }


        return "You have an appointment on " + diaSemanaConvertido + ", " + mesConvertido + " " + diaMes + ", " + anio + ", at " + horaConvertida;
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDateTime.now().getYear(), 9, 15);
    }
}
