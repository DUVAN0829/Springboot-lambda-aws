package co.duvan.lambda.app.model;

public class Character {

    private Long id;
    private String name;
    private Long healtPoint;
    private String[] skills;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHealtPoint() {
        return healtPoint;
    }

    public void setHealtPoint(Long healtPoint) {
        this.healtPoint = healtPoint;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}
