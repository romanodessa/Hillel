public class Main {


    public static void main(String[] args) {


        MyCompany myCompany = new MyCompany();
        myCompany.addEmployee("Serj", 25, "Hillel");
        myCompany.addEmployee("Alex", 30, "Hillel");
        myCompany.addEmployee("Serj", 33, "Hillel");

        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName());
        }

        myCompany.deleteEmployeeByName("Serj");

        System.out.println();
        System.out.println("After deleted Serj");

        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName());
        }
        System.out.println();
        System.out.println("After Update Employee ProjectName");
        myCompany.editEmployeeProjectName("Alex","Test Project");
        //  printEmployee(myCompany.getAllEmployees());
        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName()+" "+currentEmployee.getProjectName());
        }

        System.out.println();
        System.out.println("After Set New Project name");
        myCompany.editEmployeeProjectName("Alex","First Project");
        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName()+" "+currentEmployee.getProjectName());
        }
        //System.out.println(myCompany.getEmployeeByName("Test Name").getName());

    }


    //        new Employee();
//        new Employee("", 20, "");

//        ArrayList<Object> listOfObjects = new ArrayList<Object>();
//        listOfObjects.add("Test");
//        listOfObjects.add(new Employee());

//        ArrayList<Employee> employeeList = new ArrayList<Employee>();
//        employeeList.add(new Employee("Serj", 25, "Hillel"));
//        employeeList.add(new Employee("Alex", 30, "Electric Cloud"));
//        employeeList.add(new Employee("Serj", 45, "Sigma"));

}