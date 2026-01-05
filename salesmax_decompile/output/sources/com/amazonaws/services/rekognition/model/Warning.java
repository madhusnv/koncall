package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class Warning implements Serializable {
    private String errorCode;
    private String message;
    private List<Section> sections;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Warning)) {
            return false;
        }
        Warning warning = (Warning) obj;
        if ((warning.getErrorCode() == null) ^ (getErrorCode() == null)) {
            return false;
        }
        if (warning.getErrorCode() != null && !warning.getErrorCode().equals(getErrorCode())) {
            return false;
        }
        if ((warning.getMessage() == null) ^ (getMessage() == null)) {
            return false;
        }
        if (warning.getMessage() != null && !warning.getMessage().equals(getMessage())) {
            return false;
        }
        if ((warning.getSections() == null) ^ (getSections() == null)) {
            return false;
        }
        return warning.getSections() == null || warning.getSections().equals(getSections());
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return this.message;
    }

    public List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return (((((getErrorCode() == null ? 0 : getErrorCode().hashCode()) + 31) * 31) + (getMessage() == null ? 0 : getMessage().hashCode())) * 31) + (getSections() != null ? getSections().hashCode() : 0);
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setSections(Collection<Section> collection) {
        if (collection == null) {
            this.sections = null;
        } else {
            this.sections = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getErrorCode() != null) {
            sb.append("ErrorCode: " + getErrorCode() + ",");
        }
        if (getMessage() != null) {
            sb.append("Message: " + getMessage() + ",");
        }
        if (getSections() != null) {
            sb.append("Sections: " + getSections());
        }
        sb.append("}");
        return sb.toString();
    }

    public Warning withErrorCode(String str) {
        this.errorCode = str;
        return this;
    }

    public Warning withMessage(String str) {
        this.message = str;
        return this;
    }

    public Warning withSections(Section... sectionArr) {
        if (getSections() == null) {
            this.sections = new ArrayList(sectionArr.length);
        }
        for (Section section : sectionArr) {
            this.sections.add(section);
        }
        return this;
    }

    public Warning withSections(Collection<Section> collection) {
        setSections(collection);
        return this;
    }
}
