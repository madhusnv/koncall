package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ProtectiveEquipmentSummary implements Serializable {
    private List<Integer> personsIndeterminate;
    private List<Integer> personsWithRequiredEquipment;
    private List<Integer> personsWithoutRequiredEquipment;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProtectiveEquipmentSummary)) {
            return false;
        }
        ProtectiveEquipmentSummary protectiveEquipmentSummary = (ProtectiveEquipmentSummary) obj;
        if ((protectiveEquipmentSummary.getPersonsWithRequiredEquipment() == null) ^ (getPersonsWithRequiredEquipment() == null)) {
            return false;
        }
        if (protectiveEquipmentSummary.getPersonsWithRequiredEquipment() != null && !protectiveEquipmentSummary.getPersonsWithRequiredEquipment().equals(getPersonsWithRequiredEquipment())) {
            return false;
        }
        if ((protectiveEquipmentSummary.getPersonsWithoutRequiredEquipment() == null) ^ (getPersonsWithoutRequiredEquipment() == null)) {
            return false;
        }
        if (protectiveEquipmentSummary.getPersonsWithoutRequiredEquipment() != null && !protectiveEquipmentSummary.getPersonsWithoutRequiredEquipment().equals(getPersonsWithoutRequiredEquipment())) {
            return false;
        }
        if ((protectiveEquipmentSummary.getPersonsIndeterminate() == null) ^ (getPersonsIndeterminate() == null)) {
            return false;
        }
        return protectiveEquipmentSummary.getPersonsIndeterminate() == null || protectiveEquipmentSummary.getPersonsIndeterminate().equals(getPersonsIndeterminate());
    }

    public List<Integer> getPersonsIndeterminate() {
        return this.personsIndeterminate;
    }

    public List<Integer> getPersonsWithRequiredEquipment() {
        return this.personsWithRequiredEquipment;
    }

    public List<Integer> getPersonsWithoutRequiredEquipment() {
        return this.personsWithoutRequiredEquipment;
    }

    public int hashCode() {
        return (((((getPersonsWithRequiredEquipment() == null ? 0 : getPersonsWithRequiredEquipment().hashCode()) + 31) * 31) + (getPersonsWithoutRequiredEquipment() == null ? 0 : getPersonsWithoutRequiredEquipment().hashCode())) * 31) + (getPersonsIndeterminate() != null ? getPersonsIndeterminate().hashCode() : 0);
    }

    public void setPersonsIndeterminate(Collection<Integer> collection) {
        if (collection == null) {
            this.personsIndeterminate = null;
        } else {
            this.personsIndeterminate = new ArrayList(collection);
        }
    }

    public void setPersonsWithRequiredEquipment(Collection<Integer> collection) {
        if (collection == null) {
            this.personsWithRequiredEquipment = null;
        } else {
            this.personsWithRequiredEquipment = new ArrayList(collection);
        }
    }

    public void setPersonsWithoutRequiredEquipment(Collection<Integer> collection) {
        if (collection == null) {
            this.personsWithoutRequiredEquipment = null;
        } else {
            this.personsWithoutRequiredEquipment = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPersonsWithRequiredEquipment() != null) {
            sb.append("PersonsWithRequiredEquipment: " + getPersonsWithRequiredEquipment() + ",");
        }
        if (getPersonsWithoutRequiredEquipment() != null) {
            sb.append("PersonsWithoutRequiredEquipment: " + getPersonsWithoutRequiredEquipment() + ",");
        }
        if (getPersonsIndeterminate() != null) {
            sb.append("PersonsIndeterminate: " + getPersonsIndeterminate());
        }
        sb.append("}");
        return sb.toString();
    }

    public ProtectiveEquipmentSummary withPersonsIndeterminate(Integer... numArr) {
        if (getPersonsIndeterminate() == null) {
            this.personsIndeterminate = new ArrayList(numArr.length);
        }
        for (Integer num : numArr) {
            this.personsIndeterminate.add(num);
        }
        return this;
    }

    public ProtectiveEquipmentSummary withPersonsWithRequiredEquipment(Integer... numArr) {
        if (getPersonsWithRequiredEquipment() == null) {
            this.personsWithRequiredEquipment = new ArrayList(numArr.length);
        }
        for (Integer num : numArr) {
            this.personsWithRequiredEquipment.add(num);
        }
        return this;
    }

    public ProtectiveEquipmentSummary withPersonsWithoutRequiredEquipment(Integer... numArr) {
        if (getPersonsWithoutRequiredEquipment() == null) {
            this.personsWithoutRequiredEquipment = new ArrayList(numArr.length);
        }
        for (Integer num : numArr) {
            this.personsWithoutRequiredEquipment.add(num);
        }
        return this;
    }

    public ProtectiveEquipmentSummary withPersonsIndeterminate(Collection<Integer> collection) {
        setPersonsIndeterminate(collection);
        return this;
    }

    public ProtectiveEquipmentSummary withPersonsWithRequiredEquipment(Collection<Integer> collection) {
        setPersonsWithRequiredEquipment(collection);
        return this;
    }

    public ProtectiveEquipmentSummary withPersonsWithoutRequiredEquipment(Collection<Integer> collection) {
        setPersonsWithoutRequiredEquipment(collection);
        return this;
    }
}
