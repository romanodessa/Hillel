import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MyCompany {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public ArrayList<Employee> getAllEmployees() {
        return employeeList;
    }

    public void addEmployee(String employeeName, int age, String projectName, HashSet<String> skills) {
        employeeList.add(new Employee(employeeName, age, projectName, skills));
    }

    public void deleteEmployeeByName(String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.remove(i);
            }
        }
    }

    public void deleteEmployeeOlder(int desiredAge) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getAge()<desiredAge) {
                employeeList.remove(i);
            }
        }
    }

    public Employee getEmployeeByName(String employeeName) {
        Employee employeeToReturn = null;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeToReturn = employeeList.get(i);
            } else {
                employeeToReturn = new Employee("Not found", 0, "Not found",new HashSet<String>(Arrays.asList("Not found")));
            }
        }
        return employeeToReturn;
    }

    public void setEmployeeProjectName(String employeeName, String projectName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).setProjectName(projectName);
            }

        }
    }

    public void updateEmployeeName(String employeeName, String employeeNewName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).setProjectName(employeeNewName);
            }
        }
    }

    public void clearProjectName(String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).setProjectName("");
            }
        }
    }

    public void addEmployeeSkill (String employeeName, String skill) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).addSkill(skill);
            }
        }
    }

    public void removeEmployeeSkill (String employeeName, String skill) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).removeSkill(skill);
            }
        }
    }

    public void getEmployeeSkills (String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).getSkills();
            }
        }
    }
}