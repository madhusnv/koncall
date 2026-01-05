package com.amplifyframework.storage;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class StoragePath {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final StoragePath fromIdentityId(InterfaceC2139c identityIdPathResolver) {
            AbstractC4154l.m8923f(identityIdPathResolver, "identityIdPathResolver");
            return new IdentityIdProvidedStoragePath(identityIdPathResolver);
        }

        public final StoragePath fromString(String path) {
            AbstractC4154l.m8923f(path, "path");
            return new StringStoragePath(path);
        }

        private Companion() {
        }
    }

    public static final StoragePath fromIdentityId(InterfaceC2139c interfaceC2139c) {
        return Companion.fromIdentityId(interfaceC2139c);
    }

    public static final StoragePath fromString(String str) {
        return Companion.fromString(str);
    }
}
