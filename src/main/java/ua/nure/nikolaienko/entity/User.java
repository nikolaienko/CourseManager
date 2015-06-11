// ============================================================================
//  File          : User
//  Created       : 23.05.15   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Nikolaienko Vlasyslav, Ukraine
// ============================================================================
package ua.nure.nikolaienko.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author by Nikolaienko Vladyslav on 23.05.15.
 * @version 1.0
 */
@Entity
//@Table(name = "USERS")
public class User {
    @GeneratedValue
    @Id
    private Long id;
    @Column(unique = true)
    private String login;
    private String password;
    private boolean enabled;
    @OneToMany()
    private Set<Course> courses = new HashSet<Course>(0);

    public User() {
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
