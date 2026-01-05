package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class GetFaceLivenessSessionResultsResult implements Serializable {
    private List<AuditImage> auditImages;
    private Float confidence;
    private AuditImage referenceImage;
    private String sessionId;
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetFaceLivenessSessionResultsResult)) {
            return false;
        }
        GetFaceLivenessSessionResultsResult getFaceLivenessSessionResultsResult = (GetFaceLivenessSessionResultsResult) obj;
        if ((getFaceLivenessSessionResultsResult.getSessionId() == null) ^ (getSessionId() == null)) {
            return false;
        }
        if (getFaceLivenessSessionResultsResult.getSessionId() != null && !getFaceLivenessSessionResultsResult.getSessionId().equals(getSessionId())) {
            return false;
        }
        if ((getFaceLivenessSessionResultsResult.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (getFaceLivenessSessionResultsResult.getStatus() != null && !getFaceLivenessSessionResultsResult.getStatus().equals(getStatus())) {
            return false;
        }
        if ((getFaceLivenessSessionResultsResult.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (getFaceLivenessSessionResultsResult.getConfidence() != null && !getFaceLivenessSessionResultsResult.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((getFaceLivenessSessionResultsResult.getReferenceImage() == null) ^ (getReferenceImage() == null)) {
            return false;
        }
        if (getFaceLivenessSessionResultsResult.getReferenceImage() != null && !getFaceLivenessSessionResultsResult.getReferenceImage().equals(getReferenceImage())) {
            return false;
        }
        if ((getFaceLivenessSessionResultsResult.getAuditImages() == null) ^ (getAuditImages() == null)) {
            return false;
        }
        return getFaceLivenessSessionResultsResult.getAuditImages() == null || getFaceLivenessSessionResultsResult.getAuditImages().equals(getAuditImages());
    }

    public List<AuditImage> getAuditImages() {
        return this.auditImages;
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public AuditImage getReferenceImage() {
        return this.referenceImage;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((getSessionId() == null ? 0 : getSessionId().hashCode()) + 31) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getReferenceImage() == null ? 0 : getReferenceImage().hashCode())) * 31) + (getAuditImages() != null ? getAuditImages().hashCode() : 0);
    }

    public void setAuditImages(Collection<AuditImage> collection) {
        if (collection == null) {
            this.auditImages = null;
        } else {
            this.auditImages = new ArrayList(collection);
        }
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setReferenceImage(AuditImage auditImage) {
        this.referenceImage = auditImage;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSessionId() != null) {
            sb.append("SessionId: " + getSessionId() + ",");
        }
        if (getStatus() != null) {
            sb.append("Status: " + getStatus() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getReferenceImage() != null) {
            sb.append("ReferenceImage: " + getReferenceImage() + ",");
        }
        if (getAuditImages() != null) {
            sb.append("AuditImages: " + getAuditImages());
        }
        sb.append("}");
        return sb.toString();
    }

    public GetFaceLivenessSessionResultsResult withAuditImages(AuditImage... auditImageArr) {
        if (getAuditImages() == null) {
            this.auditImages = new ArrayList(auditImageArr.length);
        }
        for (AuditImage auditImage : auditImageArr) {
            this.auditImages.add(auditImage);
        }
        return this;
    }

    public GetFaceLivenessSessionResultsResult withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public GetFaceLivenessSessionResultsResult withReferenceImage(AuditImage auditImage) {
        this.referenceImage = auditImage;
        return this;
    }

    public GetFaceLivenessSessionResultsResult withSessionId(String str) {
        this.sessionId = str;
        return this;
    }

    public GetFaceLivenessSessionResultsResult withStatus(String str) {
        this.status = str;
        return this;
    }

    public void setStatus(LivenessSessionStatus livenessSessionStatus) {
        this.status = livenessSessionStatus.toString();
    }

    public GetFaceLivenessSessionResultsResult withStatus(LivenessSessionStatus livenessSessionStatus) {
        this.status = livenessSessionStatus.toString();
        return this;
    }

    public GetFaceLivenessSessionResultsResult withAuditImages(Collection<AuditImage> collection) {
        setAuditImages(collection);
        return this;
    }
}
