package com.amplifyframework.storage;

import com.amplifyframework.annotations.InternalAmplifyApi;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StringStoragePath extends StoragePath {
    private final String path;

    public StringStoragePath(String path) {
        AbstractC4154l.m8923f(path, "path");
        this.path = path;
    }

    private final String component1() {
        return this.path;
    }

    public static /* synthetic */ StringStoragePath copy$core_release$default(StringStoragePath stringStoragePath, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stringStoragePath.path;
        }
        return stringStoragePath.copy$core_release(str);
    }

    public final StringStoragePath copy$core_release(String path) {
        AbstractC4154l.m8923f(path, "path");
        return new StringStoragePath(path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StringStoragePath) && AbstractC4154l.m8918a(this.path, ((StringStoragePath) obj).path);
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    @InternalAmplifyApi
    public final String resolvePath() {
        return this.path;
    }

    public String toString() {
        return AbstractC5601a.m11238i("StringStoragePath(path=", this.path, ")");
    }
}
