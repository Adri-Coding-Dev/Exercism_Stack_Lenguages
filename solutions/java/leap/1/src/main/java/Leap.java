class Leap {

    boolean isLeapYear(int year) {
        if((year % 4 == 0) && year % 100 != 0 || (year % 400 == 0)){
            System.out.println("El numero es bisiesto");
            return true;
        }else{
            System.out.println("El numero NO es es bisiesto");
            return false;
        }
    }

}
