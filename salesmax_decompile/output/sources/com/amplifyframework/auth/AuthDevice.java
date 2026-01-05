package com.amplifyframework.auth;

import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class AuthDevice {
    private final String id;
    private final String name;

    private AuthDevice(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public static AuthDevice fromId(String str) {
        return fromId(str, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthDevice.class != obj.getClass()) {
            return false;
        }
        AuthDevice authDevice = (AuthDevice) obj;
        return s6c.m47909a(getId(), authDevice.getId()) && s6c.m47909a(getName(), authDevice.getName());
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return s6c.m47910b(getId(), getName());
    }

    public String toString() {
        return "AuthDevice{id='" + this.id + "', name='" + this.name + "'}";
    }

    public static AuthDevice fromId(String str, String str2) {
        Objects.requireNonNull(str);
        return new AuthDevice(str, str2);
    }
}
