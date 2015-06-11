// ============================================================================
//  File          : Part
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

/**
 * @author by Nikolaienko Vladyslav on 09.06.15.
 * @version 1.0
 */

//@Table(name = "PARTS")
@Entity
public class Part {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String type;
    private String description;
    private boolean isConfirm;
    private String href;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(boolean isConfirm) {
        this.isConfirm = isConfirm;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
