package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DeleteFacesResult implements Serializable {
    private List<String> deletedFaces;
    private List<UnsuccessfulFaceDeletion> unsuccessfulFaceDeletions;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteFacesResult)) {
            return false;
        }
        DeleteFacesResult deleteFacesResult = (DeleteFacesResult) obj;
        if ((deleteFacesResult.getDeletedFaces() == null) ^ (getDeletedFaces() == null)) {
            return false;
        }
        if (deleteFacesResult.getDeletedFaces() != null && !deleteFacesResult.getDeletedFaces().equals(getDeletedFaces())) {
            return false;
        }
        if ((deleteFacesResult.getUnsuccessfulFaceDeletions() == null) ^ (getUnsuccessfulFaceDeletions() == null)) {
            return false;
        }
        return deleteFacesResult.getUnsuccessfulFaceDeletions() == null || deleteFacesResult.getUnsuccessfulFaceDeletions().equals(getUnsuccessfulFaceDeletions());
    }

    public List<String> getDeletedFaces() {
        return this.deletedFaces;
    }

    public List<UnsuccessfulFaceDeletion> getUnsuccessfulFaceDeletions() {
        return this.unsuccessfulFaceDeletions;
    }

    public int hashCode() {
        return (((getDeletedFaces() == null ? 0 : getDeletedFaces().hashCode()) + 31) * 31) + (getUnsuccessfulFaceDeletions() != null ? getUnsuccessfulFaceDeletions().hashCode() : 0);
    }

    public void setDeletedFaces(Collection<String> collection) {
        if (collection == null) {
            this.deletedFaces = null;
        } else {
            this.deletedFaces = new ArrayList(collection);
        }
    }

    public void setUnsuccessfulFaceDeletions(Collection<UnsuccessfulFaceDeletion> collection) {
        if (collection == null) {
            this.unsuccessfulFaceDeletions = null;
        } else {
            this.unsuccessfulFaceDeletions = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeletedFaces() != null) {
            sb.append("DeletedFaces: " + getDeletedFaces() + ",");
        }
        if (getUnsuccessfulFaceDeletions() != null) {
            sb.append("UnsuccessfulFaceDeletions: " + getUnsuccessfulFaceDeletions());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteFacesResult withDeletedFaces(String... strArr) {
        if (getDeletedFaces() == null) {
            this.deletedFaces = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.deletedFaces.add(str);
        }
        return this;
    }

    public DeleteFacesResult withUnsuccessfulFaceDeletions(UnsuccessfulFaceDeletion... unsuccessfulFaceDeletionArr) {
        if (getUnsuccessfulFaceDeletions() == null) {
            this.unsuccessfulFaceDeletions = new ArrayList(unsuccessfulFaceDeletionArr.length);
        }
        for (UnsuccessfulFaceDeletion unsuccessfulFaceDeletion : unsuccessfulFaceDeletionArr) {
            this.unsuccessfulFaceDeletions.add(unsuccessfulFaceDeletion);
        }
        return this;
    }

    public DeleteFacesResult withDeletedFaces(Collection<String> collection) {
        setDeletedFaces(collection);
        return this;
    }

    public DeleteFacesResult withUnsuccessfulFaceDeletions(Collection<UnsuccessfulFaceDeletion> collection) {
        setUnsuccessfulFaceDeletions(collection);
        return this;
    }
}
