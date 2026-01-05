package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DistributeDataset implements Serializable {
    private String arn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DistributeDataset)) {
            return false;
        }
        DistributeDataset distributeDataset = (DistributeDataset) obj;
        if ((distributeDataset.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        return distributeDataset.getArn() == null || distributeDataset.getArn().equals(getArn());
    }

    public String getArn() {
        return this.arn;
    }

    public int hashCode() {
        return 31 + (getArn() == null ? 0 : getArn().hashCode());
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null) {
            sb.append("Arn: " + getArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public DistributeDataset withArn(String str) {
        this.arn = str;
        return this;
    }
}
