// ============================================================================
//  File          : Course
//  Created       : 23.05.15   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Nikolaienko Vlasyslav, Ukraine
// ============================================================================
package ua.nure.nikolaienko.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author by Nikolaienko Vladyslav on 23.05.15.
 * @version 1.0
 */
//@Table(name = "COURSES")
@Entity
public class Course {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String description;
    @OneToMany()
    private List<Week> weeks = new ArrayList<>();
    private String priority;

    public Course() {

    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public List<Week> getWeeks() {
        return weeks;
    }

    public void setWeeks(List<Week> weeks) {
        this.weeks = weeks;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
