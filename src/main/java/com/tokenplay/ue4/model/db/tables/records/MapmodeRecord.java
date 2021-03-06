/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.tokenplay.ue4.model.db.tables.Tue4Mapmode;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class MapmodeRecord extends UpdatableRecordImpl<MapmodeRecord> implements Record7<String, String, Boolean, Boolean, String, String, Long> {

    private static final long serialVersionUID = -1567207477;

    /**
     * Setter for <code>tue4_mapmode.mam_gam_id</code>.
     */
    public void setMamGamId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>tue4_mapmode.mam_gam_id</code>.
     */
    @NotNull
    public String getMamGamId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>tue4_mapmode.mam_map_id</code>.
     */
    public void setMamMapId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tue4_mapmode.mam_map_id</code>.
     */
    @NotNull
    public String getMamMapId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tue4_mapmode.mam_enabled</code>.
     */
    public void setMamEnabled(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>tue4_mapmode.mam_enabled</code>.
     */
    public Boolean getMamEnabled() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>tue4_mapmode.mam_ai_enabled</code>.
     */
    public void setMamAiEnabled(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>tue4_mapmode.mam_ai_enabled</code>.
     */
    public Boolean getMamAiEnabled() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>tue4_mapmode.mam_srv_id</code>.
     */
    public void setMamSrvId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>tue4_mapmode.mam_srv_id</code>.
     */
    public String getMamSrvId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>tue4_mapmode.mam_id</code>.
     */
    public void setMamId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>tue4_mapmode.mam_id</code>.
     */
    @NotNull
    public String getMamId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>tue4_mapmode.mam_match_time</code>.
     */
    public void setMamMatchTime(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>tue4_mapmode.mam_match_time</code>.
     */
    public Long getMamMatchTime() {
        return (Long) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Boolean, Boolean, String, String, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Boolean, Boolean, String, String, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Tue4Mapmode.MAPMODE.MAM_GAM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tue4Mapmode.MAPMODE.MAM_MAP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return Tue4Mapmode.MAPMODE.MAM_ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Tue4Mapmode.MAPMODE.MAM_AI_ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Tue4Mapmode.MAPMODE.MAM_SRV_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Tue4Mapmode.MAPMODE.MAM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return Tue4Mapmode.MAPMODE.MAM_MATCH_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getMamGamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getMamMapId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getMamEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getMamAiEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMamSrvId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getMamMatchTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getMamGamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMamMapId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getMamEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getMamAiEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMamSrvId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getMamMatchTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MapmodeRecord value1(String value) {
        setMamGamId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MapmodeRecord value2(String value) {
        setMamMapId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MapmodeRecord value3(Boolean value) {
        setMamEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MapmodeRecord value4(Boolean value) {
        setMamAiEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MapmodeRecord value5(String value) {
        setMamSrvId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MapmodeRecord value6(String value) {
        setMamId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MapmodeRecord value7(Long value) {
        setMamMatchTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MapmodeRecord values(String value1, String value2, Boolean value3, Boolean value4, String value5, String value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MapmodeRecord
     */
    public MapmodeRecord() {
        super(Tue4Mapmode.MAPMODE);
    }

    /**
     * Create a detached, initialised MapmodeRecord
     */
    public MapmodeRecord(String gamId, String mapId, Boolean enabled, Boolean aiEnabled, String srvId, String id, Long matchTime) {
        super(Tue4Mapmode.MAPMODE);

        set(0, gamId);
        set(1, mapId);
        set(2, enabled);
        set(3, aiEnabled);
        set(4, srvId);
        set(5, id);
        set(6, matchTime);
    }
}
