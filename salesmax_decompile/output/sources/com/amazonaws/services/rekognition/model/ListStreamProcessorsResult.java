package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ListStreamProcessorsResult implements Serializable {
    private String nextToken;
    private List<StreamProcessor> streamProcessors;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListStreamProcessorsResult)) {
            return false;
        }
        ListStreamProcessorsResult listStreamProcessorsResult = (ListStreamProcessorsResult) obj;
        if ((listStreamProcessorsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listStreamProcessorsResult.getNextToken() != null && !listStreamProcessorsResult.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listStreamProcessorsResult.getStreamProcessors() == null) ^ (getStreamProcessors() == null)) {
            return false;
        }
        return listStreamProcessorsResult.getStreamProcessors() == null || listStreamProcessorsResult.getStreamProcessors().equals(getStreamProcessors());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<StreamProcessor> getStreamProcessors() {
        return this.streamProcessors;
    }

    public int hashCode() {
        return (((getNextToken() == null ? 0 : getNextToken().hashCode()) + 31) * 31) + (getStreamProcessors() != null ? getStreamProcessors().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setStreamProcessors(Collection<StreamProcessor> collection) {
        if (collection == null) {
            this.streamProcessors = null;
        } else {
            this.streamProcessors = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getStreamProcessors() != null) {
            sb.append("StreamProcessors: " + getStreamProcessors());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListStreamProcessorsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListStreamProcessorsResult withStreamProcessors(StreamProcessor... streamProcessorArr) {
        if (getStreamProcessors() == null) {
            this.streamProcessors = new ArrayList(streamProcessorArr.length);
        }
        for (StreamProcessor streamProcessor : streamProcessorArr) {
            this.streamProcessors.add(streamProcessor);
        }
        return this;
    }

    public ListStreamProcessorsResult withStreamProcessors(Collection<StreamProcessor> collection) {
        setStreamProcessors(collection);
        return this;
    }
}
