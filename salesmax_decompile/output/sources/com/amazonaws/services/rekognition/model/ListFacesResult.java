package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ListFacesResult implements Serializable {
    private String faceModelVersion;
    private List<Face> faces;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListFacesResult)) {
            return false;
        }
        ListFacesResult listFacesResult = (ListFacesResult) obj;
        if ((listFacesResult.getFaces() == null) ^ (getFaces() == null)) {
            return false;
        }
        if (listFacesResult.getFaces() != null && !listFacesResult.getFaces().equals(getFaces())) {
            return false;
        }
        if ((listFacesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listFacesResult.getNextToken() != null && !listFacesResult.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listFacesResult.getFaceModelVersion() == null) ^ (getFaceModelVersion() == null)) {
            return false;
        }
        return listFacesResult.getFaceModelVersion() == null || listFacesResult.getFaceModelVersion().equals(getFaceModelVersion());
    }

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    public List<Face> getFaces() {
        return this.faces;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getFaces() == null ? 0 : getFaces().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getFaceModelVersion() != null ? getFaceModelVersion().hashCode() : 0);
    }

    public void setFaceModelVersion(String str) {
        this.faceModelVersion = str;
    }

    public void setFaces(Collection<Face> collection) {
        if (collection == null) {
            this.faces = null;
        } else {
            this.faces = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFaces() != null) {
            sb.append("Faces: " + getFaces() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getFaceModelVersion() != null) {
            sb.append("FaceModelVersion: " + getFaceModelVersion());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListFacesResult withFaceModelVersion(String str) {
        this.faceModelVersion = str;
        return this;
    }

    public ListFacesResult withFaces(Face... faceArr) {
        if (getFaces() == null) {
            this.faces = new ArrayList(faceArr.length);
        }
        for (Face face : faceArr) {
            this.faces.add(face);
        }
        return this;
    }

    public ListFacesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListFacesResult withFaces(Collection<Face> collection) {
        setFaces(collection);
        return this;
    }
}
