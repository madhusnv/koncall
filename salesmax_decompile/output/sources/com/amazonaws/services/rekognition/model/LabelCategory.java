package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class LabelCategory implements Serializable {
    private String name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LabelCategory)) {
            return false;
        }
        LabelCategory labelCategory = (LabelCategory) obj;
        if ((labelCategory.getName() == null) ^ (getName() == null)) {
            return false;
        }
        return labelCategory.getName() == null || labelCategory.getName().equals(getName());
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return 31 + (getName() == null ? 0 : getName().hashCode());
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) {
            sb.append("Name: " + getName());
        }
        sb.append("}");
        return sb.toString();
    }

    public LabelCategory withName(String str) {
        this.name = str;
        return this;
    }
}
