package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Asset implements Serializable {
    private GroundTruthManifest groundTruthManifest;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        if ((asset.getGroundTruthManifest() == null) ^ (getGroundTruthManifest() == null)) {
            return false;
        }
        return asset.getGroundTruthManifest() == null || asset.getGroundTruthManifest().equals(getGroundTruthManifest());
    }

    public GroundTruthManifest getGroundTruthManifest() {
        return this.groundTruthManifest;
    }

    public int hashCode() {
        return 31 + (getGroundTruthManifest() == null ? 0 : getGroundTruthManifest().hashCode());
    }

    public void setGroundTruthManifest(GroundTruthManifest groundTruthManifest) {
        this.groundTruthManifest = groundTruthManifest;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroundTruthManifest() != null) {
            sb.append("GroundTruthManifest: " + getGroundTruthManifest());
        }
        sb.append("}");
        return sb.toString();
    }

    public Asset withGroundTruthManifest(GroundTruthManifest groundTruthManifest) {
        this.groundTruthManifest = groundTruthManifest;
        return this;
    }
}
