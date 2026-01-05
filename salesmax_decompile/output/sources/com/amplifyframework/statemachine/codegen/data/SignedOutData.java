package com.amplifyframework.statemachine.codegen.data;

import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.lo3;
import p001o.p8g;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class SignedOutData {
    public static final Companion Companion = new Companion(null);
    private final GlobalSignOutErrorData globalSignOutErrorData;
    private final boolean hasError;
    private final HostedUIErrorData hostedUIErrorData;
    private final String lastKnownUsername;
    private final RevokeTokenErrorData revokeTokenErrorData;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return SignedOutData$$serializer.INSTANCE;
        }
    }

    public SignedOutData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SignedOutData copy$default(SignedOutData signedOutData, String str, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signedOutData.lastKnownUsername;
        }
        if ((i & 2) != 0) {
            hostedUIErrorData = signedOutData.hostedUIErrorData;
        }
        if ((i & 4) != 0) {
            globalSignOutErrorData = signedOutData.globalSignOutErrorData;
        }
        if ((i & 8) != 0) {
            revokeTokenErrorData = signedOutData.revokeTokenErrorData;
        }
        return signedOutData.copy(str, hostedUIErrorData, globalSignOutErrorData, revokeTokenErrorData);
    }

    public static /* synthetic */ void getGlobalSignOutErrorData$annotations() {
    }

    public static /* synthetic */ void getHostedUIErrorData$annotations() {
    }

    public static /* synthetic */ void getRevokeTokenErrorData$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self(SignedOutData signedOutData, lo3 lo3Var, uef uefVar) {
        boolean z = false;
        if (lo3Var.mo37569r(uefVar, 0) || signedOutData.lastKnownUsername != null) {
            lo3Var.mo37571z(uefVar, 0, p8g.f39602a, signedOutData.lastKnownUsername);
        }
        if (lo3Var.mo37569r(uefVar, 1)) {
            z = true;
        } else {
            if (signedOutData.hasError != ((signedOutData.hostedUIErrorData == null && signedOutData.globalSignOutErrorData == null && signedOutData.revokeTokenErrorData == null) ? false : true)) {
            }
        }
        if (z) {
            lo3Var.mo37561e(uefVar, 1, signedOutData.hasError);
        }
    }

    public final String component1() {
        return this.lastKnownUsername;
    }

    public final HostedUIErrorData component2() {
        return this.hostedUIErrorData;
    }

    public final GlobalSignOutErrorData component3() {
        return this.globalSignOutErrorData;
    }

    public final RevokeTokenErrorData component4() {
        return this.revokeTokenErrorData;
    }

    public final SignedOutData copy(String str, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData) {
        return new SignedOutData(str, hostedUIErrorData, globalSignOutErrorData, revokeTokenErrorData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignedOutData)) {
            return false;
        }
        SignedOutData signedOutData = (SignedOutData) obj;
        return sq8.m48644c(this.lastKnownUsername, signedOutData.lastKnownUsername) && sq8.m48644c(this.hostedUIErrorData, signedOutData.hostedUIErrorData) && sq8.m48644c(this.globalSignOutErrorData, signedOutData.globalSignOutErrorData) && sq8.m48644c(this.revokeTokenErrorData, signedOutData.revokeTokenErrorData);
    }

    public final GlobalSignOutErrorData getGlobalSignOutErrorData() {
        return this.globalSignOutErrorData;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final HostedUIErrorData getHostedUIErrorData() {
        return this.hostedUIErrorData;
    }

    public final String getLastKnownUsername() {
        return this.lastKnownUsername;
    }

    public final RevokeTokenErrorData getRevokeTokenErrorData() {
        return this.revokeTokenErrorData;
    }

    public int hashCode() {
        String str = this.lastKnownUsername;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        HostedUIErrorData hostedUIErrorData = this.hostedUIErrorData;
        int iHashCode2 = (iHashCode + (hostedUIErrorData == null ? 0 : hostedUIErrorData.hashCode())) * 31;
        GlobalSignOutErrorData globalSignOutErrorData = this.globalSignOutErrorData;
        int iHashCode3 = (iHashCode2 + (globalSignOutErrorData == null ? 0 : globalSignOutErrorData.hashCode())) * 31;
        RevokeTokenErrorData revokeTokenErrorData = this.revokeTokenErrorData;
        return iHashCode3 + (revokeTokenErrorData != null ? revokeTokenErrorData.hashCode() : 0);
    }

    public String toString() {
        return "SignedOutData(lastKnownUsername=" + this.lastKnownUsername + ", hostedUIErrorData=" + this.hostedUIErrorData + ", globalSignOutErrorData=" + this.globalSignOutErrorData + ", revokeTokenErrorData=" + this.revokeTokenErrorData + ")";
    }

    public /* synthetic */ SignedOutData(int i, String str, boolean z, fff fffVar) {
        if ((i & 0) != 0) {
            tbd.m49692a(i, 0, SignedOutData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.lastKnownUsername = null;
        } else {
            this.lastKnownUsername = str;
        }
        this.hostedUIErrorData = null;
        this.globalSignOutErrorData = null;
        this.revokeTokenErrorData = null;
        if ((i & 2) == 0) {
            this.hasError = false;
        } else {
            this.hasError = z;
        }
    }

    public SignedOutData(String str, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData) {
        this.lastKnownUsername = str;
        this.hostedUIErrorData = hostedUIErrorData;
        this.globalSignOutErrorData = globalSignOutErrorData;
        this.revokeTokenErrorData = revokeTokenErrorData;
        this.hasError = (hostedUIErrorData == null && globalSignOutErrorData == null && revokeTokenErrorData == null) ? false : true;
    }

    public /* synthetic */ SignedOutData(String str, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : hostedUIErrorData, (i & 4) != 0 ? null : globalSignOutErrorData, (i & 8) != 0 ? null : revokeTokenErrorData);
    }
}
