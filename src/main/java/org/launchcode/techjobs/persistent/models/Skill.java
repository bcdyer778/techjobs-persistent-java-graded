package org.launchcode.techjobs.persistent.models;

@Entity
public class Skill extends AbstractEntity {
    public Skill() {
    }

    @NotBlank(message="Please enter a skill.")
    @Size(min = 1, max = 750, message = "Skill description may not be more than 750 characters.")
    private String description;


    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();


    public Skill(String description) {
        this.description = description;
    }

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

}