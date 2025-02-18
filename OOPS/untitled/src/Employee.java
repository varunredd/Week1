//Encapsulation

public class Employee {

    private int    age;
    private String name;
    private String employeeId;

    public void setAge ( int age ) {
        this.age = age;
    }

    public int getAge ( ) {
        return this.age;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getName ( ) {
        return this.name;
    }

    public void setEmployeeId ( String employeeId ) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId ( ) {
        return this.employeeId;
    }

}
