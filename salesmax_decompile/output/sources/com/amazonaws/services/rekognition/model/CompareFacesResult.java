package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class CompareFacesResult implements Serializable {
    private List<CompareFacesMatch> faceMatches;
    private ComparedSourceImageFace sourceImageFace;
    private String sourceImageOrientationCorrection;
    private String targetImageOrientationCorrection;
    private List<ComparedFace> unmatchedFaces;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CompareFacesResult)) {
            return false;
        }
        CompareFacesResult compareFacesResult = (CompareFacesResult) obj;
        if ((compareFacesResult.getSourceImageFace() == null) ^ (getSourceImageFace() == null)) {
            return false;
        }
        if (compareFacesResult.getSourceImageFace() != null && !compareFacesResult.getSourceImageFace().equals(getSourceImageFace())) {
            return false;
        }
        if ((compareFacesResult.getFaceMatches() == null) ^ (getFaceMatches() == null)) {
            return false;
        }
        if (compareFacesResult.getFaceMatches() != null && !compareFacesResult.getFaceMatches().equals(getFaceMatches())) {
            return false;
        }
        if ((compareFacesResult.getUnmatchedFaces() == null) ^ (getUnmatchedFaces() == null)) {
            return false;
        }
        if (compareFacesResult.getUnmatchedFaces() != null && !compareFacesResult.getUnmatchedFaces().equals(getUnmatchedFaces())) {
            return false;
        }
        if ((compareFacesResult.getSourceImageOrientationCorrection() == null) ^ (getSourceImageOrientationCorrection() == null)) {
            return false;
        }
        if (compareFacesResult.getSourceImageOrientationCorrection() != null && !compareFacesResult.getSourceImageOrientationCorrection().equals(getSourceImageOrientationCorrection())) {
            return false;
        }
        if ((compareFacesResult.getTargetImageOrientationCorrection() == null) ^ (getTargetImageOrientationCorrection() == null)) {
            return false;
        }
        return compareFacesResult.getTargetImageOrientationCorrection() == null || compareFacesResult.getTargetImageOrientationCorrection().equals(getTargetImageOrientationCorrection());
    }

    public List<CompareFacesMatch> getFaceMatches() {
        return this.faceMatches;
    }

    public ComparedSourceImageFace getSourceImageFace() {
        return this.sourceImageFace;
    }

    public String getSourceImageOrientationCorrection() {
        return this.sourceImageOrientationCorrection;
    }

    public String getTargetImageOrientationCorrection() {
        return this.targetImageOrientationCorrection;
    }

    public List<ComparedFace> getUnmatchedFaces() {
        return this.unmatchedFaces;
    }

    public int hashCode() {
        return (((((((((getSourceImageFace() == null ? 0 : getSourceImageFace().hashCode()) + 31) * 31) + (getFaceMatches() == null ? 0 : getFaceMatches().hashCode())) * 31) + (getUnmatchedFaces() == null ? 0 : getUnmatchedFaces().hashCode())) * 31) + (getSourceImageOrientationCorrection() == null ? 0 : getSourceImageOrientationCorrection().hashCode())) * 31) + (getTargetImageOrientationCorrection() != null ? getTargetImageOrientationCorrection().hashCode() : 0);
    }

    public void setFaceMatches(Collection<CompareFacesMatch> collection) {
        if (collection == null) {
            this.faceMatches = null;
        } else {
            this.faceMatches = new ArrayList(collection);
        }
    }

    public void setSourceImageFace(ComparedSourceImageFace comparedSourceImageFace) {
        this.sourceImageFace = comparedSourceImageFace;
    }

    public void setSourceImageOrientationCorrection(String str) {
        this.sourceImageOrientationCorrection = str;
    }

    public void setTargetImageOrientationCorrection(String str) {
        this.targetImageOrientationCorrection = str;
    }

    public void setUnmatchedFaces(Collection<ComparedFace> collection) {
        if (collection == null) {
            this.unmatchedFaces = null;
        } else {
            this.unmatchedFaces = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceImageFace() != null) {
            sb.append("SourceImageFace: " + getSourceImageFace() + ",");
        }
        if (getFaceMatches() != null) {
            sb.append("FaceMatches: " + getFaceMatches() + ",");
        }
        if (getUnmatchedFaces() != null) {
            sb.append("UnmatchedFaces: " + getUnmatchedFaces() + ",");
        }
        if (getSourceImageOrientationCorrection() != null) {
            sb.append("SourceImageOrientationCorrection: " + getSourceImageOrientationCorrection() + ",");
        }
        if (getTargetImageOrientationCorrection() != null) {
            sb.append("TargetImageOrientationCorrection: " + getTargetImageOrientationCorrection());
        }
        sb.append("}");
        return sb.toString();
    }

    public CompareFacesResult withFaceMatches(CompareFacesMatch... compareFacesMatchArr) {
        if (getFaceMatches() == null) {
            this.faceMatches = new ArrayList(compareFacesMatchArr.length);
        }
        for (CompareFacesMatch compareFacesMatch : compareFacesMatchArr) {
            this.faceMatches.add(compareFacesMatch);
        }
        return this;
    }

    public CompareFacesResult withSourceImageFace(ComparedSourceImageFace comparedSourceImageFace) {
        this.sourceImageFace = comparedSourceImageFace;
        return this;
    }

    public CompareFacesResult withSourceImageOrientationCorrection(String str) {
        this.sourceImageOrientationCorrection = str;
        return this;
    }

    public CompareFacesResult withTargetImageOrientationCorrection(String str) {
        this.targetImageOrientationCorrection = str;
        return this;
    }

    public CompareFacesResult withUnmatchedFaces(ComparedFace... comparedFaceArr) {
        if (getUnmatchedFaces() == null) {
            this.unmatchedFaces = new ArrayList(comparedFaceArr.length);
        }
        for (ComparedFace comparedFace : comparedFaceArr) {
            this.unmatchedFaces.add(comparedFace);
        }
        return this;
    }

    public void setSourceImageOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.sourceImageOrientationCorrection = orientationCorrection.toString();
    }

    public void setTargetImageOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.targetImageOrientationCorrection = orientationCorrection.toString();
    }

    public CompareFacesResult withSourceImageOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.sourceImageOrientationCorrection = orientationCorrection.toString();
        return this;
    }

    public CompareFacesResult withTargetImageOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.targetImageOrientationCorrection = orientationCorrection.toString();
        return this;
    }

    public CompareFacesResult withFaceMatches(Collection<CompareFacesMatch> collection) {
        setFaceMatches(collection);
        return this;
    }

    public CompareFacesResult withUnmatchedFaces(Collection<ComparedFace> collection) {
        setUnmatchedFaces(collection);
        return this;
    }
}
