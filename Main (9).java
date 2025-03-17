interface Emp_Details1{
  void emp_details1();
}

 class Emp1 implements Emp_Details1 {
    public void emp_details1(){ 
      
      int emp_id = 101;
      String emp_name="akash";
      double emp_sal=500000.21;
      String emp_loc="Banglore";
      String emp_company="Google";
      
      System.out.println("EMPLOYEE_DETAILS");
      System.out.println("-------------------");
...
