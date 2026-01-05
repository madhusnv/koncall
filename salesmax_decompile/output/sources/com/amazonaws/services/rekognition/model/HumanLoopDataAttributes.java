package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class HumanLoopDataAttributes implements Serializable {
    private List<String> contentClassifiers;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HumanLoopDataAttributes)) {
            return false;
        }
        HumanLoopDataAttributes humanLoopDataAttributes = (HumanLoopDataAttributes) obj;
        if ((humanLoopDataAttributes.getContentClassifiers() == null) ^ (getContentClassifiers() == null)) {
            return false;
        }
        return humanLoopDataAttributes.getContentClassifiers() == null || humanLoopDataAttributes.getContentClassifiers().equals(getContentClassifiers());
    }

    public List<String> getContentClassifiers() {
        return this.contentClassifiers;
    }

    public int hashCode() {
        return 31 + (getContentClassifiers() == null ? 0 : getContentClassifiers().hashCode());
    }

    public void setContentClassifiers(Collection<String> collection) {
        if (collection == null) {
            this.contentClassifiers = null;
        } else {
            this.contentClassifiers = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContentClassifiers() != null) {
            sb.append("ContentClassifiers: " + getContentClassifiers());
        }
        sb.append("}");
        return sb.toString();
    }

    public HumanLoopDataAttributes withContentClassifiers(String... strArr) {
        if (getContentClassifiers() == null) {
            this.contentClassifiers = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.contentClassifiers.add(str);
        }
        return this;
    }

    public HumanLoopDataAttributes withContentClassifiers(Collection<String> collection) {
        setContentClassifiers(collection);
        return this;
    }
}
