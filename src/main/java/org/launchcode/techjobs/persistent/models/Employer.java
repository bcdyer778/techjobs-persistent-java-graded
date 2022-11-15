package org.launchcode.techjobs.persistent.models;

import java.util.ArrayList;
import java.util.Objects;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message="Please enter a location.")
    @Size(min=3, max=100, message="Location must be between 3 and 100 characters.")
    public String location;

    @OneToMany
    @JoinColumn(name="employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public Employer(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
