package design.pattern.objectFactory;

public class EmployeeFactory {
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("Android"))
            return new AndroidDeveloper();
        else if (empType.trim().equalsIgnoreCase("Web"))
            return new WebDeveloper();
        else if(empType.trim().equalsIgnoreCase("UI"))
            return new UIDeveloper();
        else return null;
    }
}
