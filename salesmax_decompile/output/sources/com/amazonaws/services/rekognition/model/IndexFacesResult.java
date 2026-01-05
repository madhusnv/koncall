package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class IndexFacesResult implements Serializable {
    private String faceModelVersion;
    private List<FaceRecord> faceRecords;
    private String orientationCorrection;
    private List<UnindexedFace> unindexedFaces;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IndexFacesResult)) {
            return false;
        }
        IndexFacesResult indexFacesResult = (IndexFacesResult) obj;
        if ((indexFacesResult.getFaceRecords() == null) ^ (getFaceRecords() == null)) {
            return false;
        }
        if (indexFacesResult.getFaceRecords() != null && !indexFacesResult.getFaceRecords().equals(getFaceRecords())) {
            return false;
        }
        if ((indexFacesResult.getOrientationCorrection() == null) ^ (getOrientationCorrection() == null)) {
            return false;
        }
        if (indexFacesResult.getOrientationCorrection() != null && !indexFacesResult.getOrientationCorrection().equals(getOrientationCorrection())) {
            return false;
        }
        if ((indexFacesResult.getFaceModelVersion() == null) ^ (getFaceModelVersion() == null)) {
            return false;
        }
        if (indexFacesResult.getFaceModelVersion() != null && !indexFacesResult.getFaceModelVersion().equals(getFaceModelVersion())) {
            return false;
        }
        if ((indexFacesResult.getUnindexedFaces() == null) ^ (getUnindexedFaces() == null)) {
            return false;
        }
        return indexFacesResult.getUnindexedFaces() == null || indexFacesResult.getUnindexedFaces().equals(getUnindexedFaces());
    }

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    public List<FaceRecord> getFaceRecords() {
        return this.faceRecords;
    }

    public String getOrientationCorrection() {
        return this.orientationCorrection;
    }

    public List<UnindexedFace> getUnindexedFaces() {
        return this.unindexedFaces;
    }

    public int hashCode() {
        return (((((((getFaceRecords() == null ? 0 : getFaceRecords().hashCode()) + 31) * 31) + (getOrientationCorrection() == null ? 0 : getOrientationCorrection().hashCode())) * 31) + (getFaceModelVersion() == null ? 0 : getFaceModelVersion().hashCode())) * 31) + (getUnindexedFaces() != null ? getUnindexedFaces().hashCode() : 0);
    }

    public void setFaceModelVersion(String str) {
        this.faceModelVersion = str;
    }

    public void setFaceRecords(Collection<FaceRecord> collection) {
        if (collection == null) {
            this.faceRecords = null;
        } else {
            this.faceRecords = new ArrayList(collection);
        }
    }

    public void setOrientationCorrection(String str) {
        this.orientationCorrection = str;
    }

    public void setUnindexedFaces(Collection<UnindexedFace> collection) {
        if (collection == null) {
            this.unindexedFaces = null;
        } else {
            this.unindexedFaces = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFaceRecords() != null) {
            sb.append("FaceRecords: " + getFaceRecords() + ",");
        }
        if (getOrientationCorrection() != null) {
            sb.append("OrientationCorrection: " + getOrientationCorrection() + ",");
        }
        if (getFaceModelVersion() != null) {
            sb.append("FaceModelVersion: " + getFaceModelVersion() + ",");
        }
        if (getUnindexedFaces() != null) {
            sb.append("UnindexedFaces: " + getUnindexedFaces());
        }
        sb.append("}");
        return sb.toString();
    }

    public IndexFacesResult withFaceModelVersion(String str) {
        this.faceModelVersion = str;
        return this;
    }

    public IndexFacesResult withFaceRecords(FaceRecord... faceRecordArr) {
        if (getFaceRecords() == null) {
            this.faceRecords = new ArrayList(faceRecordArr.length);
        }
        for (FaceRecord faceRecord : faceRecordArr) {
            this.faceRecords.add(faceRecord);
        }
        return this;
    }

    public IndexFacesResult withOrientationCorrection(String str) {
        this.orientationCorrection = str;
        return this;
    }

    public IndexFacesResult withUnindexedFaces(UnindexedFace... unindexedFaceArr) {
        if (getUnindexedFaces() == null) {
            this.unindexedFaces = new ArrayList(unindexedFaceArr.length);
        }
        for (UnindexedFace unindexedFace : unindexedFaceArr) {
            this.unindexedFaces.add(unindexedFace);
        }
        return this;
    }

    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    public IndexFacesResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
        return this;
    }

    public IndexFacesResult withFaceRecords(Collection<FaceRecord> collection) {
        setFaceRecords(collection);
        return this;
    }

    public IndexFacesResult withUnindexedFaces(Collection<UnindexedFace> collection) {
        setUnindexedFaces(collection);
        return this;
    }
}
