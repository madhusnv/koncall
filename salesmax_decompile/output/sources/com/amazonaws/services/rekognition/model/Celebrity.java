package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class Celebrity implements Serializable {
    private ComparedFace face;
    private String id;
    private KnownGender knownGender;
    private Float matchConfidence;
    private String name;
    private List<String> urls;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Celebrity)) {
            return false;
        }
        Celebrity celebrity = (Celebrity) obj;
        if ((celebrity.getUrls() == null) ^ (getUrls() == null)) {
            return false;
        }
        if (celebrity.getUrls() != null && !celebrity.getUrls().equals(getUrls())) {
            return false;
        }
        if ((celebrity.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (celebrity.getName() != null && !celebrity.getName().equals(getName())) {
            return false;
        }
        if ((celebrity.getId() == null) ^ (getId() == null)) {
            return false;
        }
        if (celebrity.getId() != null && !celebrity.getId().equals(getId())) {
            return false;
        }
        if ((celebrity.getFace() == null) ^ (getFace() == null)) {
            return false;
        }
        if (celebrity.getFace() != null && !celebrity.getFace().equals(getFace())) {
            return false;
        }
        if ((celebrity.getMatchConfidence() == null) ^ (getMatchConfidence() == null)) {
            return false;
        }
        if (celebrity.getMatchConfidence() != null && !celebrity.getMatchConfidence().equals(getMatchConfidence())) {
            return false;
        }
        if ((celebrity.getKnownGender() == null) ^ (getKnownGender() == null)) {
            return false;
        }
        return celebrity.getKnownGender() == null || celebrity.getKnownGender().equals(getKnownGender());
    }

    public ComparedFace getFace() {
        return this.face;
    }

    public String getId() {
        return this.id;
    }

    public KnownGender getKnownGender() {
        return this.knownGender;
    }

    public Float getMatchConfidence() {
        return this.matchConfidence;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        return (((((((((((getUrls() == null ? 0 : getUrls().hashCode()) + 31) * 31) + (getName() == null ? 0 : getName().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31) + (getFace() == null ? 0 : getFace().hashCode())) * 31) + (getMatchConfidence() == null ? 0 : getMatchConfidence().hashCode())) * 31) + (getKnownGender() != null ? getKnownGender().hashCode() : 0);
    }

    public void setFace(ComparedFace comparedFace) {
        this.face = comparedFace;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setKnownGender(KnownGender knownGender) {
        this.knownGender = knownGender;
    }

    public void setMatchConfidence(Float f) {
        this.matchConfidence = f;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUrls(Collection<String> collection) {
        if (collection == null) {
            this.urls = null;
        } else {
            this.urls = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUrls() != null) {
            sb.append("Urls: " + getUrls() + ",");
        }
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getId() != null) {
            sb.append("Id: " + getId() + ",");
        }
        if (getFace() != null) {
            sb.append("Face: " + getFace() + ",");
        }
        if (getMatchConfidence() != null) {
            sb.append("MatchConfidence: " + getMatchConfidence() + ",");
        }
        if (getKnownGender() != null) {
            sb.append("KnownGender: " + getKnownGender());
        }
        sb.append("}");
        return sb.toString();
    }

    public Celebrity withFace(ComparedFace comparedFace) {
        this.face = comparedFace;
        return this;
    }

    public Celebrity withId(String str) {
        this.id = str;
        return this;
    }

    public Celebrity withKnownGender(KnownGender knownGender) {
        this.knownGender = knownGender;
        return this;
    }

    public Celebrity withMatchConfidence(Float f) {
        this.matchConfidence = f;
        return this;
    }

    public Celebrity withName(String str) {
        this.name = str;
        return this;
    }

    public Celebrity withUrls(String... strArr) {
        if (getUrls() == null) {
            this.urls = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.urls.add(str);
        }
        return this;
    }

    public Celebrity withUrls(Collection<String> collection) {
        setUrls(collection);
        return this;
    }
}
