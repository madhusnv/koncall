package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class TrainingData implements Serializable {
    private List<Asset> assets;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TrainingData)) {
            return false;
        }
        TrainingData trainingData = (TrainingData) obj;
        if ((trainingData.getAssets() == null) ^ (getAssets() == null)) {
            return false;
        }
        return trainingData.getAssets() == null || trainingData.getAssets().equals(getAssets());
    }

    public List<Asset> getAssets() {
        return this.assets;
    }

    public int hashCode() {
        return 31 + (getAssets() == null ? 0 : getAssets().hashCode());
    }

    public void setAssets(Collection<Asset> collection) {
        if (collection == null) {
            this.assets = null;
        } else {
            this.assets = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssets() != null) {
            sb.append("Assets: " + getAssets());
        }
        sb.append("}");
        return sb.toString();
    }

    public TrainingData withAssets(Asset... assetArr) {
        if (getAssets() == null) {
            this.assets = new ArrayList(assetArr.length);
        }
        for (Asset asset : assetArr) {
            this.assets.add(asset);
        }
        return this;
    }

    public TrainingData withAssets(Collection<Asset> collection) {
        setAssets(collection);
        return this;
    }
}
