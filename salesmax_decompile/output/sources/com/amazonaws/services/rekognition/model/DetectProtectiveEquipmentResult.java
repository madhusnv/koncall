package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectProtectiveEquipmentResult implements Serializable {
    private List<ProtectiveEquipmentPerson> persons;
    private String protectiveEquipmentModelVersion;
    private ProtectiveEquipmentSummary summary;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectProtectiveEquipmentResult)) {
            return false;
        }
        DetectProtectiveEquipmentResult detectProtectiveEquipmentResult = (DetectProtectiveEquipmentResult) obj;
        if ((detectProtectiveEquipmentResult.getProtectiveEquipmentModelVersion() == null) ^ (getProtectiveEquipmentModelVersion() == null)) {
            return false;
        }
        if (detectProtectiveEquipmentResult.getProtectiveEquipmentModelVersion() != null && !detectProtectiveEquipmentResult.getProtectiveEquipmentModelVersion().equals(getProtectiveEquipmentModelVersion())) {
            return false;
        }
        if ((detectProtectiveEquipmentResult.getPersons() == null) ^ (getPersons() == null)) {
            return false;
        }
        if (detectProtectiveEquipmentResult.getPersons() != null && !detectProtectiveEquipmentResult.getPersons().equals(getPersons())) {
            return false;
        }
        if ((detectProtectiveEquipmentResult.getSummary() == null) ^ (getSummary() == null)) {
            return false;
        }
        return detectProtectiveEquipmentResult.getSummary() == null || detectProtectiveEquipmentResult.getSummary().equals(getSummary());
    }

    public List<ProtectiveEquipmentPerson> getPersons() {
        return this.persons;
    }

    public String getProtectiveEquipmentModelVersion() {
        return this.protectiveEquipmentModelVersion;
    }

    public ProtectiveEquipmentSummary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (((((getProtectiveEquipmentModelVersion() == null ? 0 : getProtectiveEquipmentModelVersion().hashCode()) + 31) * 31) + (getPersons() == null ? 0 : getPersons().hashCode())) * 31) + (getSummary() != null ? getSummary().hashCode() : 0);
    }

    public void setPersons(Collection<ProtectiveEquipmentPerson> collection) {
        if (collection == null) {
            this.persons = null;
        } else {
            this.persons = new ArrayList(collection);
        }
    }

    public void setProtectiveEquipmentModelVersion(String str) {
        this.protectiveEquipmentModelVersion = str;
    }

    public void setSummary(ProtectiveEquipmentSummary protectiveEquipmentSummary) {
        this.summary = protectiveEquipmentSummary;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProtectiveEquipmentModelVersion() != null) {
            sb.append("ProtectiveEquipmentModelVersion: " + getProtectiveEquipmentModelVersion() + ",");
        }
        if (getPersons() != null) {
            sb.append("Persons: " + getPersons() + ",");
        }
        if (getSummary() != null) {
            sb.append("Summary: " + getSummary());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectProtectiveEquipmentResult withPersons(ProtectiveEquipmentPerson... protectiveEquipmentPersonArr) {
        if (getPersons() == null) {
            this.persons = new ArrayList(protectiveEquipmentPersonArr.length);
        }
        for (ProtectiveEquipmentPerson protectiveEquipmentPerson : protectiveEquipmentPersonArr) {
            this.persons.add(protectiveEquipmentPerson);
        }
        return this;
    }

    public DetectProtectiveEquipmentResult withProtectiveEquipmentModelVersion(String str) {
        this.protectiveEquipmentModelVersion = str;
        return this;
    }

    public DetectProtectiveEquipmentResult withSummary(ProtectiveEquipmentSummary protectiveEquipmentSummary) {
        this.summary = protectiveEquipmentSummary;
        return this;
    }

    public DetectProtectiveEquipmentResult withPersons(Collection<ProtectiveEquipmentPerson> collection) {
        setPersons(collection);
        return this;
    }
}
