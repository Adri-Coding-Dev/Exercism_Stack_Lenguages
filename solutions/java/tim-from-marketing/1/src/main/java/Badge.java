class Badge {
    public String print(Integer id, String name, String department) {
        String espacio = " - ";
        String idConverted;
        String departmentConverted;

        if(id == null){
            idConverted = "";
        }else{
            idConverted = "[" + id + "]" + espacio;
        }

        if(department == null){
            departmentConverted = "OWNER";
        }else{
            departmentConverted = department.toUpperCase();
        }

        return idConverted + name + espacio + departmentConverted;
    }
}
