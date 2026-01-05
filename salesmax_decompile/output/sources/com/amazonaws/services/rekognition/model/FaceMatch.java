package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class FaceMatch implements Serializable {
    private Face face;
    private Float similarity;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FaceMatch)) {
            return false;
        }
        FaceMatch faceMatch = (FaceMatch) obj;
        if ((faceMatch.getSimilarity() == null) ^ (getSimilarity() == null)) {
            return false;
        }
        if (faceMatch.getSimilarity() != null && !faceMatch.getSimilarity().equals(getSimilarity())) {
            return false;
        }
        if ((faceMatch.getFace() == null) ^ (getFace() == null)) {
            return false;
        }
        return faceMatch.getFace() == null || faceMatch.getFace().equals(getFace());
    }

    public Face getFace() {
        return this.face;
    }

    public Float getSimilarity() {
        return this.similarity;
    }

    public int hashCode() {
        return (((getSimilarity() == null ? 0 : getSimilarity().hashCode()) + 31) * 31) + (getFace() != null ? getFace().hashCode() : 0);
    }

    public void setFace(Face face) {
        this.face = face;
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

    public FaceMatch withFace(Face face) {
        this.face = face;
        return this;
    }

    public FaceMatch withSimilarity(Float f) {
        this.similarity = f;
        return this;
    }
}
