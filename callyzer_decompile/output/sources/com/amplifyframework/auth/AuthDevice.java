package com.amplifyframework.auth;

import com.sun.mail.util.AbstractC1452a;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthDevice {

    /* renamed from: id, reason: collision with root package name */
    private final String f43716id;
    private final String name;

    private AuthDevice(String str, String str2) {
        this.f43716id = str;
        this.name = str2;
    }

    public static AuthDevice fromId(String str) {
        return fromId(str, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AuthDevice.class == obj.getClass()) {
            AuthDevice authDevice = (AuthDevice) obj;
            if (Objects.equals(getId(), authDevice.getId()) && Objects.equals(getName(), authDevice.getName())) {
                return true;
            }
        }
        return false;
    }

    public String getId() {
        return this.f43716id;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AuthDevice{id='");
        sb2.append(this.f43716id);
        sb2.append("', name='");
        return AbstractC1452a.m4564k(sb2, this.name, "'}");
    }

    public static AuthDevice fromId(String str, String str2) {
        Objects.requireNonNull(str);
        return new AuthDevice(str, str2);
    }
}
