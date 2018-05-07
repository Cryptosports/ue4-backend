/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.tokenplay.ue4.model.db.tables.Tue4GearSectionConfiguration;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class GearSectionConfigurationRecord extends UpdatableRecordImpl<GearSectionConfigurationRecord> implements
    Record4<String, String, String, String> {

    private static final long serialVersionUID = 214205385;

    /**
     * Setter for <code>tue4_gear_section_configuration.gsc_id</code>.
     */
    public void setGscId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>tue4_gear_section_configuration.gsc_id</code>.
     */
    @NotNull
    public String getGscId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>tue4_gear_section_configuration.gsc_ges_id</code>.
     */
    public void setGscGesId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tue4_gear_section_configuration.gsc_ges_id</code>.
     */
    @NotNull
    public String getGscGesId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tue4_gear_section_configuration.gsc_property_name</code>.
     */
    public void setGscPropertyName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tue4_gear_section_configuration.gsc_property_name</code>.
     */
    @NotNull
    public String getGscPropertyName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tue4_gear_section_configuration.gsc_value</code>.
     */
    public void setGscValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tue4_gear_section_configuration.gsc_value</code>.
     */
    @NotNull
    public String getGscValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Tue4GearSectionConfiguration.GEAR_SECTION_CONFIGURATION.GSC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tue4GearSectionConfiguration.GEAR_SECTION_CONFIGURATION.GSC_GES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Tue4GearSectionConfiguration.GEAR_SECTION_CONFIGURATION.GSC_PROPERTY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Tue4GearSectionConfiguration.GEAR_SECTION_CONFIGURATION.GSC_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGscId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGscGesId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGscPropertyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getGscValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGscId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGscGesId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGscPropertyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGscValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GearSectionConfigurationRecord value1(String value) {
        setGscId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GearSectionConfigurationRecord value2(String value) {
        setGscGesId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GearSectionConfigurationRecord value3(String value) {
        setGscPropertyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GearSectionConfigurationRecord value4(String value) {
        setGscValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GearSectionConfigurationRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GearSectionConfigurationRecord
     */
    public GearSectionConfigurationRecord() {
        super(Tue4GearSectionConfiguration.GEAR_SECTION_CONFIGURATION);
    }

    /**
     * Create a detached, initialised GearSectionConfigurationRecord
     */
    public GearSectionConfigurationRecord(String id, String gesId, String propertyName, String value) {
        super(Tue4GearSectionConfiguration.GEAR_SECTION_CONFIGURATION);

        set(0, id);
        set(1, gesId);
        set(2, propertyName);
        set(3, value);
    }
}