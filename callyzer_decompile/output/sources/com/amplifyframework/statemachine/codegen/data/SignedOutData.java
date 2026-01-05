package com.amplifyframework.statemachine.codegen.data;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import jy.a1;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignedOutData {
    public static final Companion Companion = new Companion(null);
    private final GlobalSignOutErrorData globalSignOutErrorData;
    private final boolean hasError;
    private final HostedUIErrorData hostedUIErrorData;
    private final String lastKnownUsername;
    private final RevokeTokenErrorData revokeTokenErrorData;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC2401a serializer() {
            return SignedOutData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    public SignedOutData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SignedOutData copy$default(SignedOutData signedOutData, String str, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = signedOutData.lastKnownUsername;
        }
        if ((i10 & 2) != 0) {
            hostedUIErrorData = signedOutData.hostedUIErrorData;
        }
        if ((i10 & 4) != 0) {
            globalSignOutErrorData = signedOutData.globalSignOutErrorData;
        }
        if ((i10 & 8) != 0) {
            revokeTokenErrorData = signedOutData.revokeTokenErrorData;
        }
        return signedOutData.copy(str, hostedUIErrorData, globalSignOutErrorData, revokeTokenErrorData);
    }

    public static final void write$Self$aws_auth_cognito_release(SignedOutData signedOutData, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
        if (interfaceC3365b.mo7694i(interfaceC3055f) || signedOutData.lastKnownUsername != null) {
            interfaceC3365b.mo7695n(interfaceC3055f, 0, a1.f19869a, signedOutData.lastKnownUsername);
        }
        if (!interfaceC3365b.mo7694i(interfaceC3055f)) {
            if (signedOutData.hasError == ((signedOutData.hostedUIErrorData == null && signedOutData.globalSignOutErrorData == null && signedOutData.revokeTokenErrorData == null) ? false : true)) {
                return;
            }
        }
        boolean z6 = signedOutData.hasError;
        C4597u c4597u = (C4597u) interfaceC3365b;
        c4597u.m9440s(interfaceC3055f, 1);
        c4597u.mo7717j(z6);
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
        return AbstractC4154l.m8918a(this.lastKnownUsername, signedOutData.lastKnownUsername) && AbstractC4154l.m8918a(this.hostedUIErrorData, signedOutData.hostedUIErrorData) && AbstractC4154l.m8918a(this.globalSignOutErrorData, signedOutData.globalSignOutErrorData) && AbstractC4154l.m8918a(this.revokeTokenErrorData, signedOutData.revokeTokenErrorData);
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

    public /* synthetic */ SignedOutData(int i10, String str, boolean z6, w0 w0Var) {
        if ((i10 & 1) == 0) {
            this.lastKnownUsername = null;
        } else {
            this.lastKnownUsername = str;
        }
        this.hostedUIErrorData = null;
        this.globalSignOutErrorData = null;
        this.revokeTokenErrorData = null;
        if ((i10 & 2) == 0) {
            this.hasError = false;
        } else {
            this.hasError = z6;
        }
    }

    public SignedOutData(String str, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData) {
        this.lastKnownUsername = str;
        this.hostedUIErrorData = hostedUIErrorData;
        this.globalSignOutErrorData = globalSignOutErrorData;
        this.revokeTokenErrorData = revokeTokenErrorData;
        this.hasError = (hostedUIErrorData == null && globalSignOutErrorData == null && revokeTokenErrorData == null) ? false : true;
    }

    public /* synthetic */ SignedOutData(String str, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : hostedUIErrorData, (i10 & 4) != 0 ? null : globalSignOutErrorData, (i10 & 8) != 0 ? null : revokeTokenErrorData);
    }

    public static /* synthetic */ void getGlobalSignOutErrorData$annotations() {
    }

    public static /* synthetic */ void getHostedUIErrorData$annotations() {
    }

    public static /* synthetic */ void getRevokeTokenErrorData$annotations() {
    }
}
