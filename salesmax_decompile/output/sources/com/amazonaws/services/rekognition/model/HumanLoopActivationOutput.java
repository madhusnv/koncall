package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class HumanLoopActivationOutput implements Serializable {
    private String humanLoopActivationConditionsEvaluationResults;
    private List<String> humanLoopActivationReasons;
    private String humanLoopArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HumanLoopActivationOutput)) {
            return false;
        }
        HumanLoopActivationOutput humanLoopActivationOutput = (HumanLoopActivationOutput) obj;
        if ((humanLoopActivationOutput.getHumanLoopArn() == null) ^ (getHumanLoopArn() == null)) {
            return false;
        }
        if (humanLoopActivationOutput.getHumanLoopArn() != null && !humanLoopActivationOutput.getHumanLoopArn().equals(getHumanLoopArn())) {
            return false;
        }
        if ((humanLoopActivationOutput.getHumanLoopActivationReasons() == null) ^ (getHumanLoopActivationReasons() == null)) {
            return false;
        }
        if (humanLoopActivationOutput.getHumanLoopActivationReasons() != null && !humanLoopActivationOutput.getHumanLoopActivationReasons().equals(getHumanLoopActivationReasons())) {
            return false;
        }
        if ((humanLoopActivationOutput.getHumanLoopActivationConditionsEvaluationResults() == null) ^ (getHumanLoopActivationConditionsEvaluationResults() == null)) {
            return false;
        }
        return humanLoopActivationOutput.getHumanLoopActivationConditionsEvaluationResults() == null || humanLoopActivationOutput.getHumanLoopActivationConditionsEvaluationResults().equals(getHumanLoopActivationConditionsEvaluationResults());
    }

    public String getHumanLoopActivationConditionsEvaluationResults() {
        return this.humanLoopActivationConditionsEvaluationResults;
    }

    public List<String> getHumanLoopActivationReasons() {
        return this.humanLoopActivationReasons;
    }

    public String getHumanLoopArn() {
        return this.humanLoopArn;
    }

    public int hashCode() {
        return (((((getHumanLoopArn() == null ? 0 : getHumanLoopArn().hashCode()) + 31) * 31) + (getHumanLoopActivationReasons() == null ? 0 : getHumanLoopActivationReasons().hashCode())) * 31) + (getHumanLoopActivationConditionsEvaluationResults() != null ? getHumanLoopActivationConditionsEvaluationResults().hashCode() : 0);
    }

    public void setHumanLoopActivationConditionsEvaluationResults(String str) {
        this.humanLoopActivationConditionsEvaluationResults = str;
    }

    public void setHumanLoopActivationReasons(Collection<String> collection) {
        if (collection == null) {
            this.humanLoopActivationReasons = null;
        } else {
            this.humanLoopActivationReasons = new ArrayList(collection);
        }
    }

    public void setHumanLoopArn(String str) {
        this.humanLoopArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHumanLoopArn() != null) {
            sb.append("HumanLoopArn: " + getHumanLoopArn() + ",");
        }
        if (getHumanLoopActivationReasons() != null) {
            sb.append("HumanLoopActivationReasons: " + getHumanLoopActivationReasons() + ",");
        }
        if (getHumanLoopActivationConditionsEvaluationResults() != null) {
            sb.append("HumanLoopActivationConditionsEvaluationResults: " + getHumanLoopActivationConditionsEvaluationResults());
        }
        sb.append("}");
        return sb.toString();
    }

    public HumanLoopActivationOutput withHumanLoopActivationConditionsEvaluationResults(String str) {
        this.humanLoopActivationConditionsEvaluationResults = str;
        return this;
    }

    public HumanLoopActivationOutput withHumanLoopActivationReasons(String... strArr) {
        if (getHumanLoopActivationReasons() == null) {
            this.humanLoopActivationReasons = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.humanLoopActivationReasons.add(str);
        }
        return this;
    }

    public HumanLoopActivationOutput withHumanLoopArn(String str) {
        this.humanLoopArn = str;
        return this;
    }

    public HumanLoopActivationOutput withHumanLoopActivationReasons(Collection<String> collection) {
        setHumanLoopActivationReasons(collection);
        return this;
    }
}
