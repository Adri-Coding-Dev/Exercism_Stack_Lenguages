import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    Map<Integer,String> countryCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return countryCodes;
    }

    public void setDialingCode(Integer code, String country) {
        countryCodes.put(code, country);

    }

    public String getCountry(Integer code) {
        return countryCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!countryCodes.containsKey(code) && !countryCodes.containsValue(country)){
            setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        return countryCodes.entrySet().stream().filter(e -> e.getValue().equals(country)).map(Map.Entry::getKey).findFirst().orElse(null);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
        if(oldCode != null){
            countryCodes.remove(oldCode);
            countryCodes.put(code,country);
        }
    }
}
