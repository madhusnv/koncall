package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class GetCelebrityInfoResult implements Serializable {
    private KnownGender knownGender;
    private String name;
    private List<String> urls;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCelebrityInfoResult)) {
            return false;
        }
        GetCelebrityInfoResult getCelebrityInfoResult = (GetCelebrityInfoResult) obj;
        if ((getCelebrityInfoResult.getUrls() == null) ^ (getUrls() == null)) {
            return false;
        }
        if (getCelebrityInfoResult.getUrls() != null && !getCelebrityInfoResult.getUrls().equals(getUrls())) {
            return false;
        }
        if ((getCelebrityInfoResult.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (getCelebrityInfoResult.getName() != null && !getCelebrityInfoResult.getName().equals(getName())) {
            return false;
        }
        if ((getCelebrityInfoResult.getKnownGender() == null) ^ (getKnownGender() == null)) {
            return false;
        }
        return getCelebrityInfoResult.getKnownGender() == null || getCelebrityInfoResult.getKnownGender().equals(getKnownGender());
    }

    public KnownGender getKnownGender() {
        return this.knownGender;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        return (((((getUrls() == null ? 0 : getUrls().hashCode()) + 31) * 31) + (getName() == null ? 0 : getName().hashCode())) * 31) + (getKnownGender() != null ? getKnownGender().hashCode() : 0);
    }

    public void setKnownGender(KnownGender knownGender) {
        this.knownGender = knownGender;
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
        if (getKnownGender() != null) {
            sb.append("KnownGender: " + getKnownGender());
        }
        sb.append("}");
        return sb.toString();
    }

    public GetCelebrityInfoResult withKnownGender(KnownGender knownGender) {
        this.knownGender = knownGender;
        return this;
    }

    public GetCelebrityInfoResult withName(String str) {
        this.name = str;
        return this;
    }

    public GetCelebrityInfoResult withUrls(String... strArr) {
        if (getUrls() == null) {
            this.urls = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.urls.add(str);
        }
        return this;
    }

    public GetCelebrityInfoResult withUrls(Collection<String> collection) {
        setUrls(collection);
        return this;
    }
}
