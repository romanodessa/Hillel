import java.util.HashSet;

public class Employee {
    private String name;
    private int age;
    private String projectName;
    private HashSet<String> skills = new HashSet<String>();

    public Employee(String name, int age, String projectName, HashSet<String> skills) {
        this.name = name;
        this.age = age;
        this.projectName = projectName;
        this.skills = skills;
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

    public HashSet<String> getSkills() {
        return skills;
    }

    public void setSkills(HashSet<String> skills) {
        this.skills = skills;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void removeSkill(String skill){
        skills.remove(skill);
    }
}