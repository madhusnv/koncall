package com.amplifyframework.auth.cognito;

import a2.AbstractC0030c;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.sun.mail.util.AbstractC1452a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class PasswordProtectionSettings {
    private final int length;
    private final boolean requiresLower;
    private final boolean requiresNumber;
    private final boolean requiresSpecial;
    private final boolean requiresUpper;

    public PasswordProtectionSettings(int i10, boolean z6, boolean z10, boolean z11, boolean z12) {
        this.length = i10;
        this.requiresNumber = z6;
        this.requiresSpecial = z10;
        this.requiresUpper = z11;
        this.requiresLower = z12;
    }

    public static /* synthetic */ PasswordProtectionSettings copy$default(PasswordProtectionSettings passwordProtectionSettings, int i10, boolean z6, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = passwordProtectionSettings.length;
        }
        if ((i11 & 2) != 0) {
            z6 = passwordProtectionSettings.requiresNumber;
        }
        if ((i11 & 4) != 0) {
            z10 = passwordProtectionSettings.requiresSpecial;
        }
        if ((i11 & 8) != 0) {
            z11 = passwordProtectionSettings.requiresUpper;
        }
        if ((i11 & 16) != 0) {
            z12 = passwordProtectionSettings.requiresLower;
        }
        boolean z13 = z12;
        boolean z14 = z10;
        return passwordProtectionSettings.copy(i10, z6, z14, z11, z13);
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

    public final PasswordProtectionSettings copy(int i10, boolean z6, boolean z10, boolean z11, boolean z12) {
        return new PasswordProtectionSettings(i10, z6, z10, z11, z12);
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

    public int hashCode() {
        return Boolean.hashCode(this.requiresLower) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(Integer.hashCode(this.length) * 31, 31, this.requiresNumber), 31, this.requiresSpecial), 31, this.requiresUpper);
    }

    public String toString() {
        int i10 = this.length;
        boolean z6 = this.requiresNumber;
        boolean z10 = this.requiresSpecial;
        boolean z11 = this.requiresUpper;
        boolean z12 = this.requiresLower;
        StringBuilder sb2 = new StringBuilder("PasswordProtectionSettings(length=");
        sb2.append(i10);
        sb2.append(", requiresNumber=");
        sb2.append(z6);
        sb2.append(", requiresSpecial=");
        AbstractC0030c.m133x(sb2, z10, ", requiresUpper=", z11, ", requiresLower=");
        return AbstractC5601a.m11242m(sb2, z12, ")");
    }
}
