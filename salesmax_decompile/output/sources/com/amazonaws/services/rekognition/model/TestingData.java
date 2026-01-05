package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class TestingData implements Serializable {
    private List<Asset> assets;
    private Boolean autoCreate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TestingData)) {
            return false;
        }
        TestingData testingData = (TestingData) obj;
        if ((testingData.getAssets() == null) ^ (getAssets() == null)) {
            return false;
        }
        if (testingData.getAssets() != null && !testingData.getAssets().equals(getAssets())) {
            return false;
        }
        if ((testingData.getAutoCreate() == null) ^ (getAutoCreate() == null)) {
            return false;
        }
        return testingData.getAutoCreate() == null || testingData.getAutoCreate().equals(getAutoCreate());
    }

    public List<Asset> getAssets() {
        return this.assets;
    }

    public Boolean getAutoCreate() {
        return this.autoCreate;
    }

    public int hashCode() {
        return (((getAssets() == null ? 0 : getAssets().hashCode()) + 31) * 31) + (getAutoCreate() != null ? getAutoCreate().hashCode() : 0);
    }

    public Boolean isAutoCreate() {
        return this.autoCreate;
    }

    public void setAssets(Collection<Asset> collection) {
        if (collection == null) {
            this.assets = null;
        } else {
            this.assets = new ArrayList(collection);
        }
    }

    public void setAutoCreate(Boolean bool) {
        this.autoCreate = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssets() != null) {
            sb.append("Assets: " + getAssets() + ",");
        }
        if (getAutoCreate() != null) {
            sb.append("AutoCreate: " + getAutoCreate());
        }
        sb.append("}");
        return sb.toString();
    }

    public TestingData withAssets(Asset... assetArr) {
        if (getAssets() == null) {
            this.assets = new ArrayList(assetArr.length);
        }
        for (Asset asset : assetArr) {
            this.assets.add(asset);
        }
        return this;
    }

    public TestingData withAutoCreate(Boolean bool) {
        this.autoCreate = bool;
        return this;
    }

    public TestingData withAssets(Collection<Asset> collection) {
        setAssets(collection);
        return this;
    }
}
