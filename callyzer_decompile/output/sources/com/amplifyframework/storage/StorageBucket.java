package com.amplifyframework.storage;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class StorageBucket {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final StorageBucket fromBucketInfo(BucketInfo bucketInfo) {
            AbstractC4154l.m8923f(bucketInfo, "bucketInfo");
            return new ResolvedStorageBucket(bucketInfo);
        }

        public final StorageBucket fromOutputs(String name) {
            AbstractC4154l.m8923f(name, "name");
            return new OutputsStorageBucket(name);
        }

        private Companion() {
        }
    }

    public static final StorageBucket fromBucketInfo(BucketInfo bucketInfo) {
        return Companion.fromBucketInfo(bucketInfo);
    }

    public static final StorageBucket fromOutputs(String str) {
        return Companion.fromOutputs(str);
    }
}
