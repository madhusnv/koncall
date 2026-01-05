package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class DisassociateFacesResult implements Serializable {
    private List<DisassociatedFace> disassociatedFaces;
    private List<UnsuccessfulFaceDisassociation> unsuccessfulFaceDisassociations;
    private String userStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DisassociateFacesResult)) {
            return false;
        }
        DisassociateFacesResult disassociateFacesResult = (DisassociateFacesResult) obj;
        if ((disassociateFacesResult.getDisassociatedFaces() == null) ^ (getDisassociatedFaces() == null)) {
            return false;
        }
        if (disassociateFacesResult.getDisassociatedFaces() != null && !disassociateFacesResult.getDisassociatedFaces().equals(getDisassociatedFaces())) {
            return false;
        }
        if ((disassociateFacesResult.getUnsuccessfulFaceDisassociations() == null) ^ (getUnsuccessfulFaceDisassociations() == null)) {
            return false;
        }
        if (disassociateFacesResult.getUnsuccessfulFaceDisassociations() != null && !disassociateFacesResult.getUnsuccessfulFaceDisassociations().equals(getUnsuccessfulFaceDisassociations())) {
            return false;
        }
        if ((disassociateFacesResult.getUserStatus() == null) ^ (getUserStatus() == null)) {
            return false;
        }
        return disassociateFacesResult.getUserStatus() == null || disassociateFacesResult.getUserStatus().equals(getUserStatus());
    }

    public List<DisassociatedFace> getDisassociatedFaces() {
        return this.disassociatedFaces;
    }

    public List<UnsuccessfulFaceDisassociation> getUnsuccessfulFaceDisassociations() {
        return this.unsuccessfulFaceDisassociations;
    }

    public String getUserStatus() {
        return this.userStatus;
    }

    public int hashCode() {
        return (((((getDisassociatedFaces() == null ? 0 : getDisassociatedFaces().hashCode()) + 31) * 31) + (getUnsuccessfulFaceDisassociations() == null ? 0 : getUnsuccessfulFaceDisassociations().hashCode())) * 31) + (getUserStatus() != null ? getUserStatus().hashCode() : 0);
    }

    public void setDisassociatedFaces(Collection<DisassociatedFace> collection) {
        if (collection == null) {
            this.disassociatedFaces = null;
        } else {
            this.disassociatedFaces = new ArrayList(collection);
        }
    }

    public void setUnsuccessfulFaceDisassociations(Collection<UnsuccessfulFaceDisassociation> collection) {
        if (collection == null) {
            this.unsuccessfulFaceDisassociations = null;
        } else {
            this.unsuccessfulFaceDisassociations = new ArrayList(collection);
        }
    }

    public void setUserStatus(String str) {
        this.userStatus = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDisassociatedFaces() != null) {
            sb.append("DisassociatedFaces: " + getDisassociatedFaces() + ",");
        }
        if (getUnsuccessfulFaceDisassociations() != null) {
            sb.append("UnsuccessfulFaceDisassociations: " + getUnsuccessfulFaceDisassociations() + ",");
        }
        if (getUserStatus() != null) {
            sb.append("UserStatus: " + getUserStatus());
        }
        sb.append("}");
        return sb.toString();
    }

    public DisassociateFacesResult withDisassociatedFaces(DisassociatedFace... disassociatedFaceArr) {
        if (getDisassociatedFaces() == null) {
            this.disassociatedFaces = new ArrayList(disassociatedFaceArr.length);
        }
        for (DisassociatedFace disassociatedFace : disassociatedFaceArr) {
            this.disassociatedFaces.add(disassociatedFace);
        }
        return this;
    }

    public DisassociateFacesResult withUnsuccessfulFaceDisassociations(UnsuccessfulFaceDisassociation... unsuccessfulFaceDisassociationArr) {
        if (getUnsuccessfulFaceDisassociations() == null) {
            this.unsuccessfulFaceDisassociations = new ArrayList(unsuccessfulFaceDisassociationArr.length);
        }
        for (UnsuccessfulFaceDisassociation unsuccessfulFaceDisassociation : unsuccessfulFaceDisassociationArr) {
            this.unsuccessfulFaceDisassociations.add(unsuccessfulFaceDisassociation);
        }
        return this;
    }

    public DisassociateFacesResult withUserStatus(String str) {
        this.userStatus = str;
        return this;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
    }

    public DisassociateFacesResult withUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
        return this;
    }

    public DisassociateFacesResult withDisassociatedFaces(Collection<DisassociatedFace> collection) {
        setDisassociatedFaces(collection);
        return this;
    }

    public DisassociateFacesResult withUnsuccessfulFaceDisassociations(Collection<UnsuccessfulFaceDisassociation> collection) {
        setUnsuccessfulFaceDisassociations(collection);
        return this;
    }
}
