import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    Map<Integer,String> countryCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return countryCodes;
    }

    public void setDialingCode(Integer code, String country) {
        if(countryCodes.containsKey(code)){
            countryCodes.remove(code);
            countryCodes.put(code, country);
        }else{
            countryCodes.put(code, country);
        }

    }

    public String getCountry(Integer code) {
        return countryCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!countryCodes.containsKey(code) && !countryCodes.containsValue(country)){
            countryCodes.put(code, country);
        } else if (countryCodes.containsKey(code)) {

        }
    }

    public Integer findDialingCode(String country) {
        if(!countryCodes.containsValue(country)){
            return null;
        }else{
            return null;
        }
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(countryCodes.containsValue(country) && countryCodes.containsKey(code)){
            countryCodes.remove(code);
            countryCodes.remove(country);
            countryCodes.put(code,country);
        }
    }
}
