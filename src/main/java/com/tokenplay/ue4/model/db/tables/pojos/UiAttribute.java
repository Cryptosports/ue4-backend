/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class UiAttribute implements Serializable {

    private static final long serialVersionUID = -538300297;

    private String id;
    private String name;
    private String description;

    public UiAttribute() {
    }

    public UiAttribute(UiAttribute value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
    }

    public UiAttribute(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @NotNull
    public String getUatId() {
        return this.id;
    }

    public void setUatId(String id) {
        this.id = id;
    }

    @NotNull
    public String getUatName() {
        return this.name;
    }

    public void setUatName(String name) {
        this.name = name;
    }

    public String getUatDescription() {
        return this.description;
    }

    public void setUatDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UiAttribute (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}