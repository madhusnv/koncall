package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class CompareFacesMatch implements Serializable {
    private ComparedFace face;
    private Float similarity;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CompareFacesMatch)) {
            return false;
        }
        CompareFacesMatch compareFacesMatch = (CompareFacesMatch) obj;
        if ((compareFacesMatch.getSimilarity() == null) ^ (getSimilarity() == null)) {
            return false;
        }
        if (compareFacesMatch.getSimilarity() != null && !compareFacesMatch.getSimilarity().equals(getSimilarity())) {
            return false;
        }
        if ((compareFacesMatch.getFace() == null) ^ (getFace() == null)) {
            return false;
        }
        return compareFacesMatch.getFace() == null || compareFacesMatch.getFace().equals(getFace());
    }

    public ComparedFace getFace() {
        return this.face;
    }

    public Float getSimilarity() {
        return this.similarity;
    }

    public int hashCode() {
        return (((getSimilarity() == null ? 0 : getSimilarity().hashCode()) + 31) * 31) + (getFace() != null ? getFace().hashCode() : 0);
    }

    public void setFace(ComparedFace comparedFace) {
        this.face = comparedFace;
    }

    public void setSimilarity(Float f) {
        this.similarity = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSimilarity() != null) {
            sb.append("Similarity: " + getSimilarity() + ",");
        }
        if (getFace() != null) {
            sb.append("Face: " + getFace());
        }
        sb.append("}");
        return sb.toString();
    }

    public CompareFacesMatch withFace(ComparedFace comparedFace) {
        this.face = comparedFace;
        return this;
    }

    public CompareFacesMatch withSimilarity(Float f) {
        this.similarity = f;
        return this;
    }
}
