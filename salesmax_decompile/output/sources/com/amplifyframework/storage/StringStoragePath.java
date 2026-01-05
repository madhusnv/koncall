package com.amplifyframework.storage;

import com.amplifyframework.annotations.InternalAmplifyApi;
import org.apache.http.cookie.ClientCookie;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class StringStoragePath extends StoragePath {
    private final String path;

    public StringStoragePath(String str) {
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        this.path = str;
    }

    private final String component1() {
        return this.path;
    }

    public static /* synthetic */ StringStoragePath copy$default(StringStoragePath stringStoragePath, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringStoragePath.path;
        }
        return stringStoragePath.copy(str);
    }

    public final StringStoragePath copy(String str) {
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        return new StringStoragePath(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StringStoragePath) && sq8.m48644c(this.path, ((StringStoragePath) obj).path);
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    @InternalAmplifyApi
    public final String resolvePath() {
        return this.path;
    }

    public String toString() {
        return "StringStoragePath(path=" + this.path + ")";
    }
}
