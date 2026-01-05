package com.amplifyframework.storage;

import org.apache.http.cookie.ClientCookie;
import p001o.id5;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public abstract class StoragePath {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final StoragePath fromIdentityId(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "identityIdPathResolver");
            return new IdentityIdProvidedStoragePath(xk7Var);
        }

        public final StoragePath fromString(String str) {
            sq8.m48649h(str, ClientCookie.PATH_ATTR);
            return new StringStoragePath(str);
        }
    }

    public static final StoragePath fromIdentityId(xk7 xk7Var) {
        return Companion.fromIdentityId(xk7Var);
    }

    public static final StoragePath fromString(String str) {
        return Companion.fromString(str);
    }
}
