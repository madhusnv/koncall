package com.websoptimization.callyzerbiz.data.model.response.lead;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class VerifiedExistingLeadNumbers {

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("isActive")
    private final boolean isActive;

    @InterfaceC4485b("isExist")
    private final boolean isExist;

    @InterfaceC4485b("leadId")
    private final String leadId;

    @InterfaceC4485b("number")
    private final String number;

    public VerifiedExistingLeadNumbers(String number, int i10, boolean z6, boolean z10, String str) {
        AbstractC4154l.m8923f(number, "number");
        this.number = number;
        this.countryCode = i10;
        this.isExist = z6;
        this.isActive = z10;
        this.leadId = str;
    }

    /* renamed from: a */
    public final String m4933a() {
        return this.number;
    }

    /* renamed from: b */
    public final boolean m4934b() {
        return this.isActive;
    }

    /* renamed from: c */
    public final boolean m4935c() {
        return this.isExist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifiedExistingLeadNumbers)) {
            return false;
        }
        VerifiedExistingLeadNumbers verifiedExistingLeadNumbers = (VerifiedExistingLeadNumbers) obj;
        return AbstractC4154l.m8918a(this.number, verifiedExistingLeadNumbers.number) && this.countryCode == verifiedExistingLeadNumbers.countryCode && this.isExist == verifiedExistingLeadNumbers.isExist && this.isActive == verifiedExistingLeadNumbers.isActive && AbstractC4154l.m8918a(this.leadId, verifiedExistingLeadNumbers.leadId);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.countryCode, this.number.hashCode() * 31, 31), 31, this.isExist), 31, this.isActive);
        String str = this.leadId;
        return iM4558e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.number;
        int i10 = this.countryCode;
        boolean z6 = this.isExist;
        boolean z10 = this.isActive;
        String str2 = this.leadId;
        StringBuilder sbM125p = AbstractC0030c.m125p(i10, "VerifiedExistingLeadNumbers(number=", str, ", countryCode=", ", isExist=");
        AbstractC0030c.m133x(sbM125p, z6, ", isActive=", z10, ", leadId=");
        return AbstractC1452a.m4564k(sbM125p, str2, ")");
    }

    public /* synthetic */ VerifiedExistingLeadNumbers(String str, int i10, boolean z6, boolean z10, String str2, int i11, AbstractC4148f abstractC4148f) {
        this(str, i10, z6, z10, (i11 & 16) != 0 ? null : str2);
    }
}
