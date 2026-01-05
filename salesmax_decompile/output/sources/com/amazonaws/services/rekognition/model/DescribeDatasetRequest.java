package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DescribeDatasetRequest extends AmazonWebServiceRequest implements Serializable {
    private String datasetArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeDatasetRequest)) {
            return false;
        }
        DescribeDatasetRequest describeDatasetRequest = (DescribeDatasetRequest) obj;
        if ((describeDatasetRequest.getDatasetArn() == null) ^ (getDatasetArn() == null)) {
            return false;
        }
        return describeDatasetRequest.getDatasetArn() == null || describeDatasetRequest.getDatasetArn().equals(getDatasetArn());
    }

    public String getDatasetArn() {
        return this.datasetArn;
    }

    public int hashCode() {
        return 31 + (getDatasetArn() == null ? 0 : getDatasetArn().hashCode());
    }

    public void setDatasetArn(String str) {
        this.datasetArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDatasetArn() != null) {
            sb.append("DatasetArn: " + getDatasetArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeDatasetRequest withDatasetArn(String str) {
        this.datasetArn = str;
        return this;
    }
}
