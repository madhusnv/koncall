package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class GroundTruthManifest implements Serializable {
    private S3Object s3Object;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GroundTruthManifest)) {
            return false;
        }
        GroundTruthManifest groundTruthManifest = (GroundTruthManifest) obj;
        if ((groundTruthManifest.getS3Object() == null) ^ (getS3Object() == null)) {
            return false;
        }
        return groundTruthManifest.getS3Object() == null || groundTruthManifest.getS3Object().equals(getS3Object());
    }

    public S3Object getS3Object() {
        return this.s3Object;
    }

    public int hashCode() {
        return 31 + (getS3Object() == null ? 0 : getS3Object().hashCode());
    }

    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS3Object() != null) {
            sb.append("S3Object: " + getS3Object());
        }
        sb.append("}");
        return sb.toString();
    }

    public GroundTruthManifest withS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
        return this;
    }
}
