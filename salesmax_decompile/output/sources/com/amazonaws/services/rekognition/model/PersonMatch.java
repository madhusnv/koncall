package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class PersonMatch implements Serializable {
    private List<FaceMatch> faceMatches;
    private PersonDetail person;
    private Long timestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PersonMatch)) {
            return false;
        }
        PersonMatch personMatch = (PersonMatch) obj;
        if ((personMatch.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (personMatch.getTimestamp() != null && !personMatch.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((personMatch.getPerson() == null) ^ (getPerson() == null)) {
            return false;
        }
        if (personMatch.getPerson() != null && !personMatch.getPerson().equals(getPerson())) {
            return false;
        }
        if ((personMatch.getFaceMatches() == null) ^ (getFaceMatches() == null)) {
            return false;
        }
        return personMatch.getFaceMatches() == null || personMatch.getFaceMatches().equals(getFaceMatches());
    }

    public List<FaceMatch> getFaceMatches() {
        return this.faceMatches;
    }

    public PersonDetail getPerson() {
        return this.person;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((getTimestamp() == null ? 0 : getTimestamp().hashCode()) + 31) * 31) + (getPerson() == null ? 0 : getPerson().hashCode())) * 31) + (getFaceMatches() != null ? getFaceMatches().hashCode() : 0);
    }

    public void setFaceMatches(Collection<FaceMatch> collection) {
        if (collection == null) {
            this.faceMatches = null;
        } else {
            this.faceMatches = new ArrayList(collection);
        }
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
            sb.append("Person: " + getPerson() + ",");
        }
        if (getFaceMatches() != null) {
            sb.append("FaceMatches: " + getFaceMatches());
        }
        sb.append("}");
        return sb.toString();
    }

    public PersonMatch withFaceMatches(FaceMatch... faceMatchArr) {
        if (getFaceMatches() == null) {
            this.faceMatches = new ArrayList(faceMatchArr.length);
        }
        for (FaceMatch faceMatch : faceMatchArr) {
            this.faceMatches.add(faceMatch);
        }
        return this;
    }

    public PersonMatch withPerson(PersonDetail personDetail) {
        this.person = personDetail;
        return this;
    }

    public PersonMatch withTimestamp(Long l) {
        this.timestamp = l;
        return this;
    }

    public PersonMatch withFaceMatches(Collection<FaceMatch> collection) {
        setFaceMatches(collection);
        return this;
    }
}
