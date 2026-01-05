package com.amplifyframework.auth.cognito;

import com.amplifyframework.annotations.InternalAmplifyApi;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class PasswordProtectionSettings {
    private final int length;
    private final boolean requiresLower;
    private final boolean requiresNumber;
    private final boolean requiresSpecial;
    private final boolean requiresUpper;

    public PasswordProtectionSettings(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.length = i;
        this.requiresNumber = z;
        this.requiresSpecial = z2;
        this.requiresUpper = z3;
        this.requiresLower = z4;
    }

    public static /* synthetic */ PasswordProtectionSettings copy$default(PasswordProtectionSettings passwordProtectionSettings, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = passwordProtectionSettings.length;
        }
        if ((i2 & 2) != 0) {
            z = passwordProtectionSettings.requiresNumber;
        }
        boolean z5 = z;
        if ((i2 & 4) != 0) {
            z2 = passwordProtectionSettings.requiresSpecial;
        }
        boolean z6 = z2;
        if ((i2 & 8) != 0) {
            z3 = passwordProtectionSettings.requiresUpper;
        }
        boolean z7 = z3;
        if ((i2 & 16) != 0) {
            z4 = passwordProtectionSettings.requiresLower;
        }
        return passwordProtectionSettings.copy(i, z5, z6, z7, z4);
    }

    public final int component1() {
        return this.length;
    }

    public final boolean component2() {
        return this.requiresNumber;
    }

    public final boolean component3() {
        return this.requiresSpecial;
    }

    public final boolean component4() {
        return this.requiresUpper;
    }

    public final boolean component5() {
        return this.requiresLower;
    }

    public final PasswordProtectionSettings copy(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        return new PasswordProtectionSettings(i, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordProtectionSettings)) {
            return false;
        }
        PasswordProtectionSettings passwordProtectionSettings = (PasswordProtectionSettings) obj;
        return this.length == passwordProtectionSettings.length && this.requiresNumber == passwordProtectionSettings.requiresNumber && this.requiresSpecial == passwordProtectionSettings.requiresSpecial && this.requiresUpper == passwordProtectionSettings.requiresUpper && this.requiresLower == passwordProtectionSettings.requiresLower;
    }

    public final int getLength() {
        return this.length;
    }

    public final boolean getRequiresLower() {
        return this.requiresLower;
    }

    public final boolean getRequiresNumber() {
        return this.requiresNumber;
    }

    public final boolean getRequiresSpecial() {
        return this.requiresSpecial;
    }

    public final boolean getRequiresUpper() {
        return this.requiresUpper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.length) * 31;
        boolean z = this.requiresNumber;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.requiresSpecial;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.requiresUpper;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.requiresLower;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public String toString() {
        return "PasswordProtectionSettings(length=" + this.length + ", requiresNumber=" + this.requiresNumber + ", requiresSpecial=" + this.requiresSpecial + ", requiresUpper=" + this.requiresUpper + ", requiresLower=" + this.requiresLower + ")";
    }
}
