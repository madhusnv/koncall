package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class GetCelebrityInfoRequest extends AmazonWebServiceRequest implements Serializable {
    private String id;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCelebrityInfoRequest)) {
            return false;
        }
        GetCelebrityInfoRequest getCelebrityInfoRequest = (GetCelebrityInfoRequest) obj;
        if ((getCelebrityInfoRequest.getId() == null) ^ (getId() == null)) {
            return false;
        }
        return getCelebrityInfoRequest.getId() == null || getCelebrityInfoRequest.getId().equals(getId());
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return 31 + (getId() == null ? 0 : getId().hashCode());
    }

    public void setId(String str) {
        this.id = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null) {
            sb.append("Id: " + getId());
        }
        sb.append("}");
        return sb.toString();
    }

    public GetCelebrityInfoRequest withId(String str) {
        this.id = str;
        return this;
    }
}
