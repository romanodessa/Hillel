import java.util.HashMap;

public class Employee {
    private String name;
    private int age;
    private String projectName;
    private HashMap<String, String> skills = new HashMap<String, String>();

    public Employee(String name, int age, String projectName, HashMap<String, String> skills) {
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

    public HashMap<String, String> getSkills() {
        return skills;
    }

    public void setSkills(HashMap<String, String> skills) {
        this.skills = skills;
    }

    public void addSkill(String skill, String description) {
        skills.put(skill, description);
    }

    public void removeSkill(String skill){
        skills.remove(skill);
    }
}