package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class KnownGender implements Serializable {

    /* renamed from: type, reason: collision with root package name */
    private String f58088type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof KnownGender)) {
            return false;
        }
        KnownGender knownGender = (KnownGender) obj;
        if ((knownGender.getType() == null) ^ (getType() == null)) {
            return false;
        }
        return knownGender.getType() == null || knownGender.getType().equals(getType());
    }

    public String getType() {
        return this.f58088type;
    }

    public int hashCode() {
        return 31 + (getType() == null ? 0 : getType().hashCode());
    }

    public void setType(String str) {
        this.f58088type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) {
            sb.append("Type: " + getType());
        }
        sb.append("}");
        return sb.toString();
    }

    public KnownGender withType(String str) {
        this.f58088type = str;
        return this;
    }

    public void setType(KnownGenderType knownGenderType) {
        this.f58088type = knownGenderType.toString();
    }

    public KnownGender withType(KnownGenderType knownGenderType) {
        this.f58088type = knownGenderType.toString();
        return this;
    }
}
