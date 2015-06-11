// ============================================================================
//  File          : Week
//  Created       : 09.06.15   
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
import java.util.Date;
import java.util.List;

/**
 * @author by Nikolaienko Vladyslav on 09.06.15.
 * @version 1.0
 */
//@Table(name = "WEEKS")
@Entity
public class Week {
    @GeneratedValue
    @Id
    private Long id;
    private Integer number;
    private Date due;
    private Integer estimate;
    private boolean isConfirm;
    @OneToMany()
    private List<Part> parts = new ArrayList<>();

    public Week() {
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public Integer getEstimate() {
        return estimate;
    }

    public void setEstimate(Integer estimate) {
        this.estimate = estimate;
    }

    public boolean isConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(boolean isConfirm) {
        this.isConfirm = isConfirm;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

}
