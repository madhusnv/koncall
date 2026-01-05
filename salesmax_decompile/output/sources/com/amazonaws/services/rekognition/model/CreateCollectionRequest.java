package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class CreateCollectionRequest extends AmazonWebServiceRequest implements Serializable {
    private String collectionId;
    private Map<String, String> tags;

    public CreateCollectionRequest() {
    }

    public CreateCollectionRequest addTagsEntry(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        if (!this.tags.containsKey(str)) {
            this.tags.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public CreateCollectionRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateCollectionRequest)) {
            return false;
        }
        CreateCollectionRequest createCollectionRequest = (CreateCollectionRequest) obj;
        if ((createCollectionRequest.getCollectionId() == null) ^ (getCollectionId() == null)) {
            return false;
        }
        if (createCollectionRequest.getCollectionId() != null && !createCollectionRequest.getCollectionId().equals(getCollectionId())) {
            return false;
        }
        if ((createCollectionRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return createCollectionRequest.getTags() == null || createCollectionRequest.getTags().equals(getTags());
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((getCollectionId() == null ? 0 : getCollectionId().hashCode()) + 31) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCollectionId() != null) {
            sb.append("CollectionId: " + getCollectionId() + ",");
        }
        if (getTags() != null) {
            sb.append("Tags: " + getTags());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateCollectionRequest withCollectionId(String str) {
        this.collectionId = str;
        return this;
    }

    public CreateCollectionRequest withTags(Map<String, String> map) {
        this.tags = map;
        return this;
    }

    public CreateCollectionRequest(String str) {
        setCollectionId(str);
    }
}
