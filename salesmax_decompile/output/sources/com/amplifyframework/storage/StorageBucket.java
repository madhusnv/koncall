package com.amplifyframework.storage;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class StorageBucket {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final StorageBucket fromBucketInfo(BucketInfo bucketInfo) {
            sq8.m48649h(bucketInfo, "bucketInfo");
            return new ResolvedStorageBucket(bucketInfo);
        }

        public final StorageBucket fromOutputs(String str) {
            sq8.m48649h(str, "name");
            return new OutputsStorageBucket(str);
        }
    }

    public static final StorageBucket fromBucketInfo(BucketInfo bucketInfo) {
        return Companion.fromBucketInfo(bucketInfo);
    }

    public static final StorageBucket fromOutputs(String str) {
        return Companion.fromOutputs(str);
    }
}
