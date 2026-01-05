package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class EvaluationResult implements Serializable {
    private Float f1Score;
    private Summary summary;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EvaluationResult)) {
            return false;
        }
        EvaluationResult evaluationResult = (EvaluationResult) obj;
        if ((evaluationResult.getF1Score() == null) ^ (getF1Score() == null)) {
            return false;
        }
        if (evaluationResult.getF1Score() != null && !evaluationResult.getF1Score().equals(getF1Score())) {
            return false;
        }
        if ((evaluationResult.getSummary() == null) ^ (getSummary() == null)) {
            return false;
        }
        return evaluationResult.getSummary() == null || evaluationResult.getSummary().equals(getSummary());
    }

    public Float getF1Score() {
        return this.f1Score;
    }

    public Summary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (((getF1Score() == null ? 0 : getF1Score().hashCode()) + 31) * 31) + (getSummary() != null ? getSummary().hashCode() : 0);
    }

    public void setF1Score(Float f) {
        this.f1Score = f;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getF1Score() != null) {
            sb.append("F1Score: " + getF1Score() + ",");
        }
        if (getSummary() != null) {
            sb.append("Summary: " + getSummary());
        }
        sb.append("}");
        return sb.toString();
    }

    public EvaluationResult withF1Score(Float f) {
        this.f1Score = f;
        return this;
    }

    public EvaluationResult withSummary(Summary summary) {
        this.summary = summary;
        return this;
    }
}
