package com.amplifyframework.storage;

import com.amplifyframework.annotations.InternalAmplifyApi;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class OutputsStorageBucket extends StorageBucket {
    private final String name;

    public OutputsStorageBucket(String name) {
        AbstractC4154l.m8923f(name, "name");
        this.name = name;
    }

    public static /* synthetic */ OutputsStorageBucket copy$core_release$default(OutputsStorageBucket outputsStorageBucket, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = outputsStorageBucket.name;
        }
        return outputsStorageBucket.copy$core_release(str);
    }

    public final String component1() {
        return this.name;
    }

    public final OutputsStorageBucket copy$core_release(String name) {
        AbstractC4154l.m8923f(name, "name");
        return new OutputsStorageBucket(name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OutputsStorageBucket) && AbstractC4154l.m8918a(this.name, ((OutputsStorageBucket) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return AbstractC5601a.m11238i("OutputsStorageBucket(name=", this.name, ")");
    }
}
