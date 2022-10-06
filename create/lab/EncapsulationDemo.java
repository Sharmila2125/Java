//Encapsulation 

class EncapsulationDemo{
private int id;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpID(){
        return id;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpID(int newValue){
        id = newValue;
    }


    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("sharmila");
         obj.setEmpAge(21);
         obj.setEmpID(112);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee ID: " + obj.getEmpID());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}