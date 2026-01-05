package com.amplifyframework.storage;

import com.amplifyframework.annotations.InternalAmplifyApi;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class OutputsStorageBucket extends StorageBucket {
    private final String name;

    public OutputsStorageBucket(String str) {
        sq8.m48649h(str, "name");
        this.name = str;
    }

    public static /* synthetic */ OutputsStorageBucket copy$default(OutputsStorageBucket outputsStorageBucket, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = outputsStorageBucket.name;
        }
        return outputsStorageBucket.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final OutputsStorageBucket copy(String str) {
        sq8.m48649h(str, "name");
        return new OutputsStorageBucket(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OutputsStorageBucket) && sq8.m48644c(this.name, ((OutputsStorageBucket) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return "OutputsStorageBucket(name=" + this.name + ")";
    }
}
