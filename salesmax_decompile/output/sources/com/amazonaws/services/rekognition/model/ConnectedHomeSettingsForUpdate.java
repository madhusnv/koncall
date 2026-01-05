package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ConnectedHomeSettingsForUpdate implements Serializable {
    private List<String> labels;
    private Float minConfidence;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ConnectedHomeSettingsForUpdate)) {
            return false;
        }
        ConnectedHomeSettingsForUpdate connectedHomeSettingsForUpdate = (ConnectedHomeSettingsForUpdate) obj;
        if ((connectedHomeSettingsForUpdate.getLabels() == null) ^ (getLabels() == null)) {
            return false;
        }
        if (connectedHomeSettingsForUpdate.getLabels() != null && !connectedHomeSettingsForUpdate.getLabels().equals(getLabels())) {
            return false;
        }
        if ((connectedHomeSettingsForUpdate.getMinConfidence() == null) ^ (getMinConfidence() == null)) {
            return false;
        }
        return connectedHomeSettingsForUpdate.getMinConfidence() == null || connectedHomeSettingsForUpdate.getMinConfidence().equals(getMinConfidence());
    }

    public List<String> getLabels() {
        return this.labels;
    }

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    public int hashCode() {
        return (((getLabels() == null ? 0 : getLabels().hashCode()) + 31) * 31) + (getMinConfidence() != null ? getMinConfidence().hashCode() : 0);
    }

    public void setLabels(Collection<String> collection) {
        if (collection == null) {
            this.labels = null;
        } else {
            this.labels = new ArrayList(collection);
        }
    }

    public void setMinConfidence(Float f) {
        this.minConfidence = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLabels() != null) {
            sb.append("Labels: " + getLabels() + ",");
        }
        if (getMinConfidence() != null) {
            sb.append("MinConfidence: " + getMinConfidence());
        }
        sb.append("}");
        return sb.toString();
    }

    public ConnectedHomeSettingsForUpdate withLabels(String... strArr) {
        if (getLabels() == null) {
            this.labels = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.labels.add(str);
        }
        return this;
    }

    public ConnectedHomeSettingsForUpdate withMinConfidence(Float f) {
        this.minConfidence = f;
        return this;
    }

    public ConnectedHomeSettingsForUpdate withLabels(Collection<String> collection) {
        setLabels(collection);
        return this;
    }
}
