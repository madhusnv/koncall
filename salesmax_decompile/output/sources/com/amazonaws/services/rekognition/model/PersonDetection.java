package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class PersonDetection implements Serializable {
    private PersonDetail person;
    private Long timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PersonDetection)) {
            return false;
        }
        PersonDetection personDetection = (PersonDetection) obj;
        if ((personDetection.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (personDetection.getTimestamp() != null && !personDetection.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((personDetection.getPerson() == null) ^ (getPerson() == null)) {
            return false;
        }
        return personDetection.getPerson() == null || personDetection.getPerson().equals(getPerson());
    }

    public PersonDetail getPerson() {
        return this.person;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((getTimestamp() == null ? 0 : getTimestamp().hashCode()) + 31) * 31) + (getPerson() != null ? getPerson().hashCode() : 0);
    }

    public void setPerson(PersonDetail personDetail) {
        this.person = personDetail;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimestamp() != null) {
            sb.append("Timestamp: " + getTimestamp() + ",");
        }
        if (getPerson() != null) {
            sb.append("Person: " + getPerson());
        }
        sb.append("}");
        return sb.toString();
    }

    public PersonDetection withPerson(PersonDetail personDetail) {
        this.person = personDetail;
        return this;
    }

    public PersonDetection withTimestamp(Long l) {
        this.timestamp = l;
        return this;
    }
}
