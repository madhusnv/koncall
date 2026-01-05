package com.amplifyframework.statemachine.codegen.data;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SignOutData {
    private final String browserPackage;
    private final boolean bypassCancel;
    private final boolean globalSignOut;

    public SignOutData() {
        this(false, null, false, 7, null);
    }

    public static /* synthetic */ SignOutData copy$default(SignOutData signOutData, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = signOutData.globalSignOut;
        }
        if ((i & 2) != 0) {
            str = signOutData.browserPackage;
        }
        if ((i & 4) != 0) {
            z2 = signOutData.bypassCancel;
        }
        return signOutData.copy(z, str, z2);
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

    public final SignOutData copy(boolean z, String str, boolean z2) {
        return new SignOutData(z, str, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignOutData)) {
            return false;
        }
        SignOutData signOutData = (SignOutData) obj;
        return this.globalSignOut == signOutData.globalSignOut && sq8.m48644c(this.browserPackage, signOutData.browserPackage) && this.bypassCancel == signOutData.bypassCancel;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.globalSignOut;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.browserPackage;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z2 = this.bypassCancel;
        return iHashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "SignOutData(globalSignOut=" + this.globalSignOut + ", browserPackage=" + this.browserPackage + ", bypassCancel=" + this.bypassCancel + ")";
    }

    public SignOutData(boolean z, String str, boolean z2) {
        this.globalSignOut = z;
        this.browserPackage = str;
        this.bypassCancel = z2;
    }

    public /* synthetic */ SignOutData(boolean z, String str, boolean z2, int i, id5 id5Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2);
    }
}
