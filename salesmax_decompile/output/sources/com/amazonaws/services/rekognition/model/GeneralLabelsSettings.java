package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class GeneralLabelsSettings implements Serializable {
    private List<String> labelCategoryExclusionFilters;
    private List<String> labelCategoryInclusionFilters;
    private List<String> labelExclusionFilters;
    private List<String> labelInclusionFilters;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GeneralLabelsSettings)) {
            return false;
        }
        GeneralLabelsSettings generalLabelsSettings = (GeneralLabelsSettings) obj;
        if ((generalLabelsSettings.getLabelInclusionFilters() == null) ^ (getLabelInclusionFilters() == null)) {
            return false;
        }
        if (generalLabelsSettings.getLabelInclusionFilters() != null && !generalLabelsSettings.getLabelInclusionFilters().equals(getLabelInclusionFilters())) {
            return false;
        }
        if ((generalLabelsSettings.getLabelExclusionFilters() == null) ^ (getLabelExclusionFilters() == null)) {
            return false;
        }
        if (generalLabelsSettings.getLabelExclusionFilters() != null && !generalLabelsSettings.getLabelExclusionFilters().equals(getLabelExclusionFilters())) {
            return false;
        }
        if ((generalLabelsSettings.getLabelCategoryInclusionFilters() == null) ^ (getLabelCategoryInclusionFilters() == null)) {
            return false;
        }
        if (generalLabelsSettings.getLabelCategoryInclusionFilters() != null && !generalLabelsSettings.getLabelCategoryInclusionFilters().equals(getLabelCategoryInclusionFilters())) {
            return false;
        }
        if ((generalLabelsSettings.getLabelCategoryExclusionFilters() == null) ^ (getLabelCategoryExclusionFilters() == null)) {
            return false;
        }
        return generalLabelsSettings.getLabelCategoryExclusionFilters() == null || generalLabelsSettings.getLabelCategoryExclusionFilters().equals(getLabelCategoryExclusionFilters());
    }

    public List<String> getLabelCategoryExclusionFilters() {
        return this.labelCategoryExclusionFilters;
    }

    public List<String> getLabelCategoryInclusionFilters() {
        return this.labelCategoryInclusionFilters;
    }

    public List<String> getLabelExclusionFilters() {
        return this.labelExclusionFilters;
    }

    public List<String> getLabelInclusionFilters() {
        return this.labelInclusionFilters;
    }

    public int hashCode() {
        return (((((((getLabelInclusionFilters() == null ? 0 : getLabelInclusionFilters().hashCode()) + 31) * 31) + (getLabelExclusionFilters() == null ? 0 : getLabelExclusionFilters().hashCode())) * 31) + (getLabelCategoryInclusionFilters() == null ? 0 : getLabelCategoryInclusionFilters().hashCode())) * 31) + (getLabelCategoryExclusionFilters() != null ? getLabelCategoryExclusionFilters().hashCode() : 0);
    }

    public void setLabelCategoryExclusionFilters(Collection<String> collection) {
        if (collection == null) {
            this.labelCategoryExclusionFilters = null;
        } else {
            this.labelCategoryExclusionFilters = new ArrayList(collection);
        }
    }

    public void setLabelCategoryInclusionFilters(Collection<String> collection) {
        if (collection == null) {
            this.labelCategoryInclusionFilters = null;
        } else {
            this.labelCategoryInclusionFilters = new ArrayList(collection);
        }
    }

    public void setLabelExclusionFilters(Collection<String> collection) {
        if (collection == null) {
            this.labelExclusionFilters = null;
        } else {
            this.labelExclusionFilters = new ArrayList(collection);
        }
    }

    public void setLabelInclusionFilters(Collection<String> collection) {
        if (collection == null) {
            this.labelInclusionFilters = null;
        } else {
            this.labelInclusionFilters = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLabelInclusionFilters() != null) {
            sb.append("LabelInclusionFilters: " + getLabelInclusionFilters() + ",");
        }
        if (getLabelExclusionFilters() != null) {
            sb.append("LabelExclusionFilters: " + getLabelExclusionFilters() + ",");
        }
        if (getLabelCategoryInclusionFilters() != null) {
            sb.append("LabelCategoryInclusionFilters: " + getLabelCategoryInclusionFilters() + ",");
        }
        if (getLabelCategoryExclusionFilters() != null) {
            sb.append("LabelCategoryExclusionFilters: " + getLabelCategoryExclusionFilters());
        }
        sb.append("}");
        return sb.toString();
    }

    public GeneralLabelsSettings withLabelCategoryExclusionFilters(String... strArr) {
        if (getLabelCategoryExclusionFilters() == null) {
            this.labelCategoryExclusionFilters = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.labelCategoryExclusionFilters.add(str);
        }
        return this;
    }

    public GeneralLabelsSettings withLabelCategoryInclusionFilters(String... strArr) {
        if (getLabelCategoryInclusionFilters() == null) {
            this.labelCategoryInclusionFilters = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.labelCategoryInclusionFilters.add(str);
        }
        return this;
    }

    public GeneralLabelsSettings withLabelExclusionFilters(String... strArr) {
        if (getLabelExclusionFilters() == null) {
            this.labelExclusionFilters = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.labelExclusionFilters.add(str);
        }
        return this;
    }

    public GeneralLabelsSettings withLabelInclusionFilters(String... strArr) {
        if (getLabelInclusionFilters() == null) {
            this.labelInclusionFilters = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.labelInclusionFilters.add(str);
        }
        return this;
    }

    public GeneralLabelsSettings withLabelCategoryExclusionFilters(Collection<String> collection) {
        setLabelCategoryExclusionFilters(collection);
        return this;
    }

    public GeneralLabelsSettings withLabelCategoryInclusionFilters(Collection<String> collection) {
        setLabelCategoryInclusionFilters(collection);
        return this;
    }

    public GeneralLabelsSettings withLabelExclusionFilters(Collection<String> collection) {
        setLabelExclusionFilters(collection);
        return this;
    }

    public GeneralLabelsSettings withLabelInclusionFilters(Collection<String> collection) {
        setLabelInclusionFilters(collection);
        return this;
    }
}
