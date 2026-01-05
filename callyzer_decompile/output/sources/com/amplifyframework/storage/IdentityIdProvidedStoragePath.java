package com.amplifyframework.storage;

import com.amplifyframework.annotations.InternalAmplifyApi;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class IdentityIdProvidedStoragePath extends StoragePath {
    private final InterfaceC2139c identityIdPathResolver;

    public IdentityIdProvidedStoragePath(InterfaceC2139c identityIdPathResolver) {
        AbstractC4154l.m8923f(identityIdPathResolver, "identityIdPathResolver");
        this.identityIdPathResolver = identityIdPathResolver;
    }

    private final InterfaceC2139c component1() {
        return this.identityIdPathResolver;
    }

    public static /* synthetic */ IdentityIdProvidedStoragePath copy$core_release$default(IdentityIdProvidedStoragePath identityIdProvidedStoragePath, InterfaceC2139c interfaceC2139c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2139c = identityIdProvidedStoragePath.identityIdPathResolver;
        }
        return identityIdProvidedStoragePath.copy$core_release(interfaceC2139c);
    }

    public final IdentityIdProvidedStoragePath copy$core_release(InterfaceC2139c identityIdPathResolver) {
        AbstractC4154l.m8923f(identityIdPathResolver, "identityIdPathResolver");
        return new IdentityIdProvidedStoragePath(identityIdPathResolver);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdentityIdProvidedStoragePath) && AbstractC4154l.m8918a(this.identityIdPathResolver, ((IdentityIdProvidedStoragePath) obj).identityIdPathResolver);
    }

    public int hashCode() {
        return this.identityIdPathResolver.hashCode();
    }

    @InternalAmplifyApi
    public final String resolvePath(String identityId) {
        AbstractC4154l.m8923f(identityId, "identityId");
        return (String) this.identityIdPathResolver.invoke(identityId);
    }

    public String toString() {
        return "IdentityIdProvidedStoragePath(identityIdPathResolver=" + this.identityIdPathResolver + ")";
    }
}
