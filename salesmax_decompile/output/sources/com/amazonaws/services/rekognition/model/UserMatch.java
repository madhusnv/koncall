package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class UserMatch implements Serializable {
    private Float similarity;
    private MatchedUser user;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UserMatch)) {
            return false;
        }
        UserMatch userMatch = (UserMatch) obj;
        if ((userMatch.getSimilarity() == null) ^ (getSimilarity() == null)) {
            return false;
        }
        if (userMatch.getSimilarity() != null && !userMatch.getSimilarity().equals(getSimilarity())) {
            return false;
        }
        if ((userMatch.getUser() == null) ^ (getUser() == null)) {
            return false;
        }
        return userMatch.getUser() == null || userMatch.getUser().equals(getUser());
    }

    public Float getSimilarity() {
        return this.similarity;
    }

    public MatchedUser getUser() {
        return this.user;
    }

    public int hashCode() {
        return (((getSimilarity() == null ? 0 : getSimilarity().hashCode()) + 31) * 31) + (getUser() != null ? getUser().hashCode() : 0);
    }

    public void setSimilarity(Float f) {
        this.similarity = f;
    }

    public void setUser(MatchedUser matchedUser) {
        this.user = matchedUser;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSimilarity() != null) {
            sb.append("Similarity: " + getSimilarity() + ",");
        }
        if (getUser() != null) {
            sb.append("User: " + getUser());
        }
        sb.append("}");
        return sb.toString();
    }

    public UserMatch withSimilarity(Float f) {
        this.similarity = f;
        return this;
    }

    public UserMatch withUser(MatchedUser matchedUser) {
        this.user = matchedUser;
        return this;
    }
}
