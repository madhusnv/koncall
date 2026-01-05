package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class DatasetChanges implements Serializable {
    private ByteBuffer groundTruth;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DatasetChanges)) {
            return false;
        }
        DatasetChanges datasetChanges = (DatasetChanges) obj;
        if ((datasetChanges.getGroundTruth() == null) ^ (getGroundTruth() == null)) {
            return false;
        }
        return datasetChanges.getGroundTruth() == null || datasetChanges.getGroundTruth().equals(getGroundTruth());
    }

    public ByteBuffer getGroundTruth() {
        return this.groundTruth;
    }

    public int hashCode() {
        return 31 + (getGroundTruth() == null ? 0 : getGroundTruth().hashCode());
    }

    public void setGroundTruth(ByteBuffer byteBuffer) {
        this.groundTruth = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroundTruth() != null) {
            sb.append("GroundTruth: " + getGroundTruth());
        }
        sb.append("}");
        return sb.toString();
    }

    public DatasetChanges withGroundTruth(ByteBuffer byteBuffer) {
        this.groundTruth = byteBuffer;
        return this;
    }
}
