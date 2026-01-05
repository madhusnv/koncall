package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class AssociateFacesResult implements Serializable {
    private List<AssociatedFace> associatedFaces;
    private List<UnsuccessfulFaceAssociation> unsuccessfulFaceAssociations;
    private String userStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssociateFacesResult)) {
            return false;
        }
        AssociateFacesResult associateFacesResult = (AssociateFacesResult) obj;
        if ((associateFacesResult.getAssociatedFaces() == null) ^ (getAssociatedFaces() == null)) {
            return false;
        }
        if (associateFacesResult.getAssociatedFaces() != null && !associateFacesResult.getAssociatedFaces().equals(getAssociatedFaces())) {
            return false;
        }
        if ((associateFacesResult.getUnsuccessfulFaceAssociations() == null) ^ (getUnsuccessfulFaceAssociations() == null)) {
            return false;
        }
        if (associateFacesResult.getUnsuccessfulFaceAssociations() != null && !associateFacesResult.getUnsuccessfulFaceAssociations().equals(getUnsuccessfulFaceAssociations())) {
            return false;
        }
        if ((associateFacesResult.getUserStatus() == null) ^ (getUserStatus() == null)) {
            return false;
        }
        return associateFacesResult.getUserStatus() == null || associateFacesResult.getUserStatus().equals(getUserStatus());
    }

    public List<AssociatedFace> getAssociatedFaces() {
        return this.associatedFaces;
    }

    public List<UnsuccessfulFaceAssociation> getUnsuccessfulFaceAssociations() {
        return this.unsuccessfulFaceAssociations;
    }

    public String getUserStatus() {
        return this.userStatus;
    }

    public int hashCode() {
        return (((((getAssociatedFaces() == null ? 0 : getAssociatedFaces().hashCode()) + 31) * 31) + (getUnsuccessfulFaceAssociations() == null ? 0 : getUnsuccessfulFaceAssociations().hashCode())) * 31) + (getUserStatus() != null ? getUserStatus().hashCode() : 0);
    }

    public void setAssociatedFaces(Collection<AssociatedFace> collection) {
        if (collection == null) {
            this.associatedFaces = null;
        } else {
            this.associatedFaces = new ArrayList(collection);
        }
    }

    public void setUnsuccessfulFaceAssociations(Collection<UnsuccessfulFaceAssociation> collection) {
        if (collection == null) {
            this.unsuccessfulFaceAssociations = null;
        } else {
            this.unsuccessfulFaceAssociations = new ArrayList(collection);
        }
    }

    public void setUserStatus(String str) {
        this.userStatus = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssociatedFaces() != null) {
            sb.append("AssociatedFaces: " + getAssociatedFaces() + ",");
        }
        if (getUnsuccessfulFaceAssociations() != null) {
            sb.append("UnsuccessfulFaceAssociations: " + getUnsuccessfulFaceAssociations() + ",");
        }
        if (getUserStatus() != null) {
            sb.append("UserStatus: " + getUserStatus());
        }
        sb.append("}");
        return sb.toString();
    }

    public AssociateFacesResult withAssociatedFaces(AssociatedFace... associatedFaceArr) {
        if (getAssociatedFaces() == null) {
            this.associatedFaces = new ArrayList(associatedFaceArr.length);
        }
        for (AssociatedFace associatedFace : associatedFaceArr) {
            this.associatedFaces.add(associatedFace);
        }
        return this;
    }

    public AssociateFacesResult withUnsuccessfulFaceAssociations(UnsuccessfulFaceAssociation... unsuccessfulFaceAssociationArr) {
        if (getUnsuccessfulFaceAssociations() == null) {
            this.unsuccessfulFaceAssociations = new ArrayList(unsuccessfulFaceAssociationArr.length);
        }
        for (UnsuccessfulFaceAssociation unsuccessfulFaceAssociation : unsuccessfulFaceAssociationArr) {
            this.unsuccessfulFaceAssociations.add(unsuccessfulFaceAssociation);
        }
        return this;
    }

    public AssociateFacesResult withUserStatus(String str) {
        this.userStatus = str;
        return this;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
    }

    public AssociateFacesResult withUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
        return this;
    }

    public AssociateFacesResult withAssociatedFaces(Collection<AssociatedFace> collection) {
        setAssociatedFaces(collection);
        return this;
    }

    public AssociateFacesResult withUnsuccessfulFaceAssociations(Collection<UnsuccessfulFaceAssociation> collection) {
        setUnsuccessfulFaceAssociations(collection);
        return this;
    }
}
