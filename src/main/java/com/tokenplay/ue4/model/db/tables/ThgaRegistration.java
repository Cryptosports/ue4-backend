/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables;


import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import com.tokenplay.ue4.model.db.DefaultSchema;
import com.tokenplay.ue4.model.db.Indexes;
import com.tokenplay.ue4.model.db.Keys;
import com.tokenplay.ue4.model.db.tables.records.RegistrationRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class Tue4Registration extends TableImpl<RegistrationRecord> {

    private static final long serialVersionUID = 73496491;

    /**
     * The reference instance of <code>tue4_registration</code>
     */
    public static final Tue4Registration REGISTRATION = new Tue4Registration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RegistrationRecord> getRecordType() {
        return RegistrationRecord.class;
    }

    /**
     * The column <code>tue4_registration.reg_pil_id</code>.
     */
    public final TableField<RegistrationRecord, String> REG_PIL_ID = createField("reg_pil_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this,
        "");

    /**
     * The column <code>tue4_registration.reg_cha_id</code>.
     */
    public final TableField<RegistrationRecord, String> REG_CHA_ID = createField("reg_cha_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this,
        "");

    /**
     * The column <code>tue4_registration.reg_date_registered</code>.
     */
    public final TableField<RegistrationRecord, OffsetDateTime> REG_DATE_REGISTERED = createField("reg_date_registered",
        org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>tue4_registration.reg_score</code>.
     */
    public final TableField<RegistrationRecord, Long> REG_SCORE = createField("reg_score", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>tue4_registration</code> table reference
     */
    public Tue4Registration() {
        this(DSL.name("tue4_registration"), null);
    }

    /**
     * Create an aliased <code>tue4_registration</code> table reference
     */
    public Tue4Registration(String alias) {
        this(DSL.name(alias), REGISTRATION);
    }

    /**
     * Create an aliased <code>tue4_registration</code> table reference
     */
    public Tue4Registration(Name alias) {
        this(alias, REGISTRATION);
    }

    private Tue4Registration(Name alias, Table<RegistrationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4Registration(Name alias, Table<RegistrationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_16768_Kue4_CHA_REG_FK, Indexes.REGISTRATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RegistrationRecord> getPrimaryKey() {
        return Keys.REGISTRATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RegistrationRecord>> getKeys() {
        return Arrays.<UniqueKey<RegistrationRecord>>asList(Keys.REGISTRATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RegistrationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RegistrationRecord, ?>>asList(Keys.REGISTRATION__Tue4_REGISTRATION_REG_PIL_ID_FKEY,
            Keys.REGISTRATION__Tue4_REGISTRATION_REG_CHA_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4Registration as(String alias) {
        return new Tue4Registration(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4Registration as(Name alias) {
        return new Tue4Registration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4Registration rename(String name) {
        return new Tue4Registration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4Registration rename(Name name) {
        return new Tue4Registration(name, null);
    }
}
