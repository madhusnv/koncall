package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.auth.AuthProvider;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class HostedUIProviderInfo {
    private final AuthProvider authProvider;
    private final String idpIdentifier;

    /* JADX WARN: Multi-variable type inference failed */
    public HostedUIProviderInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HostedUIProviderInfo copy$default(HostedUIProviderInfo hostedUIProviderInfo, AuthProvider authProvider, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            authProvider = hostedUIProviderInfo.authProvider;
        }
        if ((i & 2) != 0) {
            str = hostedUIProviderInfo.idpIdentifier;
        }
        return hostedUIProviderInfo.copy(authProvider, str);
    }

    public final AuthProvider component1() {
        return this.authProvider;
    }

    public final String component2() {
        return this.idpIdentifier;
    }

    public final HostedUIProviderInfo copy(AuthProvider authProvider, String str) {
        return new HostedUIProviderInfo(authProvider, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostedUIProviderInfo)) {
            return false;
        }
        HostedUIProviderInfo hostedUIProviderInfo = (HostedUIProviderInfo) obj;
        return sq8.m48644c(this.authProvider, hostedUIProviderInfo.authProvider) && sq8.m48644c(this.idpIdentifier, hostedUIProviderInfo.idpIdentifier);
    }

    public final AuthProvider getAuthProvider() {
        return this.authProvider;
    }

    public final String getIdpIdentifier() {
        return this.idpIdentifier;
    }

    public int hashCode() {
        AuthProvider authProvider = this.authProvider;
        int iHashCode = (authProvider == null ? 0 : authProvider.hashCode()) * 31;
        String str = this.idpIdentifier;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "HostedUIProviderInfo(authProvider=" + this.authProvider + ", idpIdentifier=" + this.idpIdentifier + ")";
    }

    public HostedUIProviderInfo(AuthProvider authProvider, String str) {
        this.authProvider = authProvider;
        this.idpIdentifier = str;
    }

    public /* synthetic */ HostedUIProviderInfo(AuthProvider authProvider, String str, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : authProvider, (i & 2) != 0 ? null : str);
    }
}
