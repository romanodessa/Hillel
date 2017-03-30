public class Employee {
    private String name;
    private int age;
    private String projectName;

    public Employee(String name, int age, String projectName) {
        this.name = name;
        this.age = age;
        this.projectName = projectName;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}