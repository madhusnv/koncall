package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignOutData {
    private final String browserPackage;
    private final boolean bypassCancel;
    private final boolean globalSignOut;

    public SignOutData() {
        this(false, null, false, 7, null);
    }

    public static /* synthetic */ SignOutData copy$default(SignOutData signOutData, boolean z6, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = signOutData.globalSignOut;
        }
        if ((i10 & 2) != 0) {
            str = signOutData.browserPackage;
        }
        if ((i10 & 4) != 0) {
            z10 = signOutData.bypassCancel;
        }
        return signOutData.copy(z6, str, z10);
    }

    public final boolean component1() {
        return this.globalSignOut;
    }

    public final String component2() {
        return this.browserPackage;
    }

    public final boolean component3() {
        return this.bypassCancel;
    }

    public final SignOutData copy(boolean z6, String str, boolean z10) {
        return new SignOutData(z6, str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignOutData)) {
            return false;
        }
        SignOutData signOutData = (SignOutData) obj;
        return this.globalSignOut == signOutData.globalSignOut && AbstractC4154l.m8918a(this.browserPackage, signOutData.browserPackage) && this.bypassCancel == signOutData.bypassCancel;
    }

    public final String getBrowserPackage() {
        return this.browserPackage;
    }

    public final boolean getBypassCancel() {
        return this.bypassCancel;
    }

    public final boolean getGlobalSignOut() {
        return this.globalSignOut;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.globalSignOut) * 31;
        String str = this.browserPackage;
        return Boolean.hashCode(this.bypassCancel) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        boolean z6 = this.globalSignOut;
        String str = this.browserPackage;
        boolean z10 = this.bypassCancel;
        StringBuilder sb2 = new StringBuilder("SignOutData(globalSignOut=");
        sb2.append(z6);
        sb2.append(", browserPackage=");
        sb2.append(str);
        sb2.append(", bypassCancel=");
        return AbstractC5601a.m11242m(sb2, z10, ")");
    }

    public SignOutData(boolean z6, String str, boolean z10) {
        this.globalSignOut = z6;
        this.browserPackage = str;
        this.bypassCancel = z10;
    }

    public /* synthetic */ SignOutData(boolean z6, String str, boolean z10, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? false : z6, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z10);
    }
}
