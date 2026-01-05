package com.amplifyframework.auth;

import com.sun.mail.util.AbstractC1452a;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthUser {
    private String userId;
    private String username;

    public AuthUser(String str, String str2) {
        Objects.requireNonNull(str);
        this.userId = str;
        Objects.requireNonNull(str2);
        this.username = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AuthUser.class == obj.getClass()) {
            AuthUser authUser = (AuthUser) obj;
            if (Objects.equals(getUserId(), authUser.getUserId()) && Objects.equals(getUsername(), authUser.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return Objects.hash(getUserId(), getUsername());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AuthUser{userId='");
        sb2.append(this.userId);
        sb2.append("', username='");
        return AbstractC1452a.m4564k(sb2, this.username, "'}");
    }
}
