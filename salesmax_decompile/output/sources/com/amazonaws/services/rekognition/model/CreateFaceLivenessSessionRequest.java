package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class CreateFaceLivenessSessionRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private String kmsKeyId;
    private CreateFaceLivenessSessionRequestSettings settings;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateFaceLivenessSessionRequest)) {
            return false;
        }
        CreateFaceLivenessSessionRequest createFaceLivenessSessionRequest = (CreateFaceLivenessSessionRequest) obj;
        if ((createFaceLivenessSessionRequest.getKmsKeyId() == null) ^ (getKmsKeyId() == null)) {
            return false;
        }
        if (createFaceLivenessSessionRequest.getKmsKeyId() != null && !createFaceLivenessSessionRequest.getKmsKeyId().equals(getKmsKeyId())) {
            return false;
        }
        if ((createFaceLivenessSessionRequest.getSettings() == null) ^ (getSettings() == null)) {
            return false;
        }
        if (createFaceLivenessSessionRequest.getSettings() != null && !createFaceLivenessSessionRequest.getSettings().equals(getSettings())) {
            return false;
        }
        if ((createFaceLivenessSessionRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        return createFaceLivenessSessionRequest.getClientRequestToken() == null || createFaceLivenessSessionRequest.getClientRequestToken().equals(getClientRequestToken());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CreateFaceLivenessSessionRequestSettings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return (((((getKmsKeyId() == null ? 0 : getKmsKeyId().hashCode()) + 31) * 31) + (getSettings() == null ? 0 : getSettings().hashCode())) * 31) + (getClientRequestToken() != null ? getClientRequestToken().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
    }

    public void setKmsKeyId(String str) {
        this.kmsKeyId = str;
    }

    public void setSettings(CreateFaceLivenessSessionRequestSettings createFaceLivenessSessionRequestSettings) {
        this.settings = createFaceLivenessSessionRequestSettings;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKmsKeyId() != null) {
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        }
        if (getSettings() != null) {
            sb.append("Settings: " + getSettings() + ",");
        }
        if (getClientRequestToken() != null) {
            sb.append("ClientRequestToken: " + getClientRequestToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateFaceLivenessSessionRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public CreateFaceLivenessSessionRequest withKmsKeyId(String str) {
        this.kmsKeyId = str;
        return this;
    }

    public CreateFaceLivenessSessionRequest withSettings(CreateFaceLivenessSessionRequestSettings createFaceLivenessSessionRequestSettings) {
        this.settings = createFaceLivenessSessionRequestSettings;
        return this;
    }
}
