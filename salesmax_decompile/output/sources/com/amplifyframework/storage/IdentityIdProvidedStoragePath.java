package com.amplifyframework.storage;

import com.amplifyframework.annotations.InternalAmplifyApi;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class IdentityIdProvidedStoragePath extends StoragePath {
    private final xk7 identityIdPathResolver;

    public IdentityIdProvidedStoragePath(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "identityIdPathResolver");
        this.identityIdPathResolver = xk7Var;
    }

    private final xk7 component1() {
        return this.identityIdPathResolver;
    }

    public static /* synthetic */ IdentityIdProvidedStoragePath copy$default(IdentityIdProvidedStoragePath identityIdProvidedStoragePath, xk7 xk7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            xk7Var = identityIdProvidedStoragePath.identityIdPathResolver;
        }
        return identityIdProvidedStoragePath.copy(xk7Var);
    }

    public final IdentityIdProvidedStoragePath copy(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "identityIdPathResolver");
        return new IdentityIdProvidedStoragePath(xk7Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdentityIdProvidedStoragePath) && sq8.m48644c(this.identityIdPathResolver, ((IdentityIdProvidedStoragePath) obj).identityIdPathResolver);
    }

    public int hashCode() {
        return this.identityIdPathResolver.hashCode();
    }

    @InternalAmplifyApi
    public final String resolvePath(String str) {
        sq8.m48649h(str, "identityId");
        return (String) this.identityIdPathResolver.invoke(str);
    }

    public String toString() {
        return "IdentityIdProvidedStoragePath(identityIdPathResolver=" + this.identityIdPathResolver + ")";
    }
}
