package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class RecognizeCelebritiesResult implements Serializable {
    private List<Celebrity> celebrityFaces;
    private String orientationCorrection;
    private List<ComparedFace> unrecognizedFaces;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RecognizeCelebritiesResult)) {
            return false;
        }
        RecognizeCelebritiesResult recognizeCelebritiesResult = (RecognizeCelebritiesResult) obj;
        if ((recognizeCelebritiesResult.getCelebrityFaces() == null) ^ (getCelebrityFaces() == null)) {
            return false;
        }
        if (recognizeCelebritiesResult.getCelebrityFaces() != null && !recognizeCelebritiesResult.getCelebrityFaces().equals(getCelebrityFaces())) {
            return false;
        }
        if ((recognizeCelebritiesResult.getUnrecognizedFaces() == null) ^ (getUnrecognizedFaces() == null)) {
            return false;
        }
        if (recognizeCelebritiesResult.getUnrecognizedFaces() != null && !recognizeCelebritiesResult.getUnrecognizedFaces().equals(getUnrecognizedFaces())) {
            return false;
        }
        if ((recognizeCelebritiesResult.getOrientationCorrection() == null) ^ (getOrientationCorrection() == null)) {
            return false;
        }
        return recognizeCelebritiesResult.getOrientationCorrection() == null || recognizeCelebritiesResult.getOrientationCorrection().equals(getOrientationCorrection());
    }

    public List<Celebrity> getCelebrityFaces() {
        return this.celebrityFaces;
    }

    public String getOrientationCorrection() {
        return this.orientationCorrection;
    }

    public List<ComparedFace> getUnrecognizedFaces() {
        return this.unrecognizedFaces;
    }

    public int hashCode() {
        return (((((getCelebrityFaces() == null ? 0 : getCelebrityFaces().hashCode()) + 31) * 31) + (getUnrecognizedFaces() == null ? 0 : getUnrecognizedFaces().hashCode())) * 31) + (getOrientationCorrection() != null ? getOrientationCorrection().hashCode() : 0);
    }

    public void setCelebrityFaces(Collection<Celebrity> collection) {
        if (collection == null) {
            this.celebrityFaces = null;
        } else {
            this.celebrityFaces = new ArrayList(collection);
        }
    }

    public void setOrientationCorrection(String str) {
        this.orientationCorrection = str;
    }

    public void setUnrecognizedFaces(Collection<ComparedFace> collection) {
        if (collection == null) {
            this.unrecognizedFaces = null;
        } else {
            this.unrecognizedFaces = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCelebrityFaces() != null) {
            sb.append("CelebrityFaces: " + getCelebrityFaces() + ",");
        }
        if (getUnrecognizedFaces() != null) {
            sb.append("UnrecognizedFaces: " + getUnrecognizedFaces() + ",");
        }
        if (getOrientationCorrection() != null) {
            sb.append("OrientationCorrection: " + getOrientationCorrection());
        }
        sb.append("}");
        return sb.toString();
    }

    public RecognizeCelebritiesResult withCelebrityFaces(Celebrity... celebrityArr) {
        if (getCelebrityFaces() == null) {
            this.celebrityFaces = new ArrayList(celebrityArr.length);
        }
        for (Celebrity celebrity : celebrityArr) {
            this.celebrityFaces.add(celebrity);
        }
        return this;
    }

    public RecognizeCelebritiesResult withOrientationCorrection(String str) {
        this.orientationCorrection = str;
        return this;
    }

    public RecognizeCelebritiesResult withUnrecognizedFaces(ComparedFace... comparedFaceArr) {
        if (getUnrecognizedFaces() == null) {
            this.unrecognizedFaces = new ArrayList(comparedFaceArr.length);
        }
        for (ComparedFace comparedFace : comparedFaceArr) {
            this.unrecognizedFaces.add(comparedFace);
        }
        return this;
    }

    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    public RecognizeCelebritiesResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
        return this;
    }

    public RecognizeCelebritiesResult withCelebrityFaces(Collection<Celebrity> collection) {
        setCelebrityFaces(collection);
        return this;
    }

    public RecognizeCelebritiesResult withUnrecognizedFaces(Collection<ComparedFace> collection) {
        setUnrecognizedFaces(collection);
        return this;
    }
}
