package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ValidationData implements Serializable {
    private List<Asset> assets;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ValidationData)) {
            return false;
        }
        ValidationData validationData = (ValidationData) obj;
        if ((validationData.getAssets() == null) ^ (getAssets() == null)) {
            return false;
        }
        return validationData.getAssets() == null || validationData.getAssets().equals(getAssets());
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

    public ValidationData withAssets(Asset... assetArr) {
        if (getAssets() == null) {
            this.assets = new ArrayList(assetArr.length);
        }
        for (Asset asset : assetArr) {
            this.assets.add(asset);
        }
        return this;
    }

    public ValidationData withAssets(Collection<Asset> collection) {
        setAssets(collection);
        return this;
    }
}
