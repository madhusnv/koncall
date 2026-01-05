package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonServiceException;

/* loaded from: classes5.dex */
public class HumanLoopQuotaExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1;
    private String quotaCode;
    private String resourceType;
    private String serviceCode;

    public HumanLoopQuotaExceededException(String str) {
        super(str);
    }

    public String getQuotaCode() {
        return this.quotaCode;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public void setQuotaCode(String str) {
        this.quotaCode = str;
    }

    public void setResourceType(String str) {
        this.resourceType = str;
    }

    public void setServiceCode(String str) {
        this.serviceCode = str;
    }
}
