package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectModerationLabelsResult implements Serializable {
    private HumanLoopActivationOutput humanLoopActivationOutput;
    private List<ModerationLabel> moderationLabels;
    private String moderationModelVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DetectModerationLabelsResult)) {
            return false;
        }
        DetectModerationLabelsResult detectModerationLabelsResult = (DetectModerationLabelsResult) obj;
        if ((detectModerationLabelsResult.getModerationLabels() == null) ^ (getModerationLabels() == null)) {
            return false;
        }
        if (detectModerationLabelsResult.getModerationLabels() != null && !detectModerationLabelsResult.getModerationLabels().equals(getModerationLabels())) {
            return false;
        }
        if ((detectModerationLabelsResult.getModerationModelVersion() == null) ^ (getModerationModelVersion() == null)) {
            return false;
        }
        if (detectModerationLabelsResult.getModerationModelVersion() != null && !detectModerationLabelsResult.getModerationModelVersion().equals(getModerationModelVersion())) {
            return false;
        }
        if ((detectModerationLabelsResult.getHumanLoopActivationOutput() == null) ^ (getHumanLoopActivationOutput() == null)) {
            return false;
        }
        return detectModerationLabelsResult.getHumanLoopActivationOutput() == null || detectModerationLabelsResult.getHumanLoopActivationOutput().equals(getHumanLoopActivationOutput());
    }

    public HumanLoopActivationOutput getHumanLoopActivationOutput() {
        return this.humanLoopActivationOutput;
    }

    public List<ModerationLabel> getModerationLabels() {
        return this.moderationLabels;
    }

    public String getModerationModelVersion() {
        return this.moderationModelVersion;
    }

    public int hashCode() {
        return (((((getModerationLabels() == null ? 0 : getModerationLabels().hashCode()) + 31) * 31) + (getModerationModelVersion() == null ? 0 : getModerationModelVersion().hashCode())) * 31) + (getHumanLoopActivationOutput() != null ? getHumanLoopActivationOutput().hashCode() : 0);
    }

    public void setHumanLoopActivationOutput(HumanLoopActivationOutput humanLoopActivationOutput) {
        this.humanLoopActivationOutput = humanLoopActivationOutput;
    }

    public void setModerationLabels(Collection<ModerationLabel> collection) {
        if (collection == null) {
            this.moderationLabels = null;
        } else {
            this.moderationLabels = new ArrayList(collection);
        }
    }

    public void setModerationModelVersion(String str) {
        this.moderationModelVersion = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getModerationLabels() != null) {
            sb.append("ModerationLabels: " + getModerationLabels() + ",");
        }
        if (getModerationModelVersion() != null) {
            sb.append("ModerationModelVersion: " + getModerationModelVersion() + ",");
        }
        if (getHumanLoopActivationOutput() != null) {
            sb.append("HumanLoopActivationOutput: " + getHumanLoopActivationOutput());
        }
        sb.append("}");
        return sb.toString();
    }

    public DetectModerationLabelsResult withHumanLoopActivationOutput(HumanLoopActivationOutput humanLoopActivationOutput) {
        this.humanLoopActivationOutput = humanLoopActivationOutput;
        return this;
    }

    public DetectModerationLabelsResult withModerationLabels(ModerationLabel... moderationLabelArr) {
        if (getModerationLabels() == null) {
            this.moderationLabels = new ArrayList(moderationLabelArr.length);
        }
        for (ModerationLabel moderationLabel : moderationLabelArr) {
            this.moderationLabels.add(moderationLabel);
        }
        return this;
    }

    public DetectModerationLabelsResult withModerationModelVersion(String str) {
        this.moderationModelVersion = str;
        return this;
    }

    public DetectModerationLabelsResult withModerationLabels(Collection<ModerationLabel> collection) {
        setModerationLabels(collection);
        return this;
    }
}
