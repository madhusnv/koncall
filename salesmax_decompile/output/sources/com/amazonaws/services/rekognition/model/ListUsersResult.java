package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ListUsersResult implements Serializable {
    private String nextToken;
    private List<User> users;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListUsersResult)) {
            return false;
        }
        ListUsersResult listUsersResult = (ListUsersResult) obj;
        if ((listUsersResult.getUsers() == null) ^ (getUsers() == null)) {
            return false;
        }
        if (listUsersResult.getUsers() != null && !listUsersResult.getUsers().equals(getUsers())) {
            return false;
        }
        if ((listUsersResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listUsersResult.getNextToken() == null || listUsersResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((getUsers() == null ? 0 : getUsers().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setUsers(Collection<User> collection) {
        if (collection == null) {
            this.users = null;
        } else {
            this.users = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUsers() != null) {
            sb.append("Users: " + getUsers() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListUsersResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListUsersResult withUsers(User... userArr) {
        if (getUsers() == null) {
            this.users = new ArrayList(userArr.length);
        }
        for (User user : userArr) {
            this.users.add(user);
        }
        return this;
    }

    public ListUsersResult withUsers(Collection<User> collection) {
        setUsers(collection);
        return this;
    }
}
