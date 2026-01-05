package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectTextResult implements Serializable {
    private List<TextDetection> textDetections;
    private String textModelVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectTextResult)) {
            return false;
        }
        DetectTextResult detectTextResult = (DetectTextResult) obj;
        if ((detectTextResult.getTextDetections() == null) ^ (getTextDetections() == null)) {
            return false;
        }
        if (detectTextResult.getTextDetections() != null && !detectTextResult.getTextDetections().equals(getTextDetections())) {
            return false;
        }
        if ((detectTextResult.getTextModelVersion() == null) ^ (getTextModelVersion() == null)) {
            return false;
        }
        return detectTextResult.getTextModelVersion() == null || detectTextResult.getTextModelVersion().equals(getTextModelVersion());
    }

    public List<TextDetection> getTextDetections() {
        return this.textDetections;
    }

    public String getTextModelVersion() {
        return this.textModelVersion;
    }

    public int hashCode() {
        return (((getTextDetections() == null ? 0 : getTextDetections().hashCode()) + 31) * 31) + (getTextModelVersion() != null ? getTextModelVersion().hashCode() : 0);
    }

    public void setTextDetections(Collection<TextDetection> collection) {
        if (collection == null) {
            this.textDetections = null;
        } else {
            this.textDetections = new ArrayList(collection);
        }
    }

    public void setTextModelVersion(String str) {
        this.textModelVersion = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTextDetections() != null) {
            sb.append("TextDetections: " + getTextDetections() + ",");
        }
        if (getTextModelVersion() != null) {
            sb.append("TextModelVersion: " + getTextModelVersion());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectTextResult withTextDetections(TextDetection... textDetectionArr) {
        if (getTextDetections() == null) {
            this.textDetections = new ArrayList(textDetectionArr.length);
        }
        for (TextDetection textDetection : textDetectionArr) {
            this.textDetections.add(textDetection);
        }
        return this;
    }

    public DetectTextResult withTextModelVersion(String str) {
        this.textModelVersion = str;
        return this;
    }

    public DetectTextResult withTextDetections(Collection<TextDetection> collection) {
        setTextDetections(collection);
        return this;
    }
}
