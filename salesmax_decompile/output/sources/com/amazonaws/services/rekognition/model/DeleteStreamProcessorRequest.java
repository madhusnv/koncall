package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class DeleteStreamProcessorRequest extends AmazonWebServiceRequest implements Serializable {
    private String name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteStreamProcessorRequest)) {
            return false;
        }
        DeleteStreamProcessorRequest deleteStreamProcessorRequest = (DeleteStreamProcessorRequest) obj;
        if ((deleteStreamProcessorRequest.getName() == null) ^ (getName() == null)) {
            return false;
        }
        return deleteStreamProcessorRequest.getName() == null || deleteStreamProcessorRequest.getName().equals(getName());
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return 31 + (getName() == null ? 0 : getName().hashCode());
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) {
            sb.append("Name: " + getName());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteStreamProcessorRequest withName(String str) {
        this.name = str;
        return this;
    }
}
