package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadVerifiedNumberResponse {

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("firstName")
    private final String firstName;

    @InterfaceC4485b("isAssignedToMe")
    private final boolean isAssignedToMe;

    @InterfaceC4485b("lastName")
    private final String lastName;

    @InterfaceC4485b("leadId")
    private final String leadId;

    @InterfaceC4485b("number")
    private final String number;

    public LeadVerifiedNumberResponse(String number, int i10, boolean z6, String str, String firstName, String lastName) {
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(firstName, "firstName");
        AbstractC4154l.m8923f(lastName, "lastName");
        this.number = number;
        this.countryCode = i10;
        this.isAssignedToMe = z6;
        this.leadId = str;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /* renamed from: a */
    public final int m4821a() {
        return this.countryCode;
    }

    /* renamed from: b */
    public final String m4822b() {
        return this.firstName;
    }

    /* renamed from: c */
    public final String m4823c() {
        return this.lastName;
    }

    /* renamed from: d */
    public final String m4824d() {
        return this.leadId;
    }

    /* renamed from: e */
    public final String m4825e() {
        return this.number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadVerifiedNumberResponse)) {
            return false;
        }
        LeadVerifiedNumberResponse leadVerifiedNumberResponse = (LeadVerifiedNumberResponse) obj;
        return AbstractC4154l.m8918a(this.number, leadVerifiedNumberResponse.number) && this.countryCode == leadVerifiedNumberResponse.countryCode && this.isAssignedToMe == leadVerifiedNumberResponse.isAssignedToMe && AbstractC4154l.m8918a(this.leadId, leadVerifiedNumberResponse.leadId) && AbstractC4154l.m8918a(this.firstName, leadVerifiedNumberResponse.firstName) && AbstractC4154l.m8918a(this.lastName, leadVerifiedNumberResponse.lastName);
    }

    /* renamed from: f */
    public final boolean m4826f() {
        return this.isAssignedToMe;
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.countryCode, this.number.hashCode() * 31, 31), 31, this.isAssignedToMe);
        String str = this.leadId;
        return this.lastName.hashCode() + AbstractC0030c.m113d((iM4558e + (str == null ? 0 : str.hashCode())) * 31, 31, this.firstName);
    }

    public final String toString() {
        String str = this.number;
        int i10 = this.countryCode;
        boolean z6 = this.isAssignedToMe;
        String str2 = this.leadId;
        String str3 = this.firstName;
        String str4 = this.lastName;
        StringBuilder sbM125p = AbstractC0030c.m125p(i10, "LeadVerifiedNumberResponse(number=", str, ", countryCode=", ", isAssignedToMe=");
        AbstractC4801l.m9751y(sbM125p, z6, ", leadId=", str2, ", firstName=");
        return AbstractC0030c.m124o(sbM125p, str3, ", lastName=", str4, ")");
    }

    public /* synthetic */ LeadVerifiedNumberResponse(String str, int i10, boolean z6, String str2, String str3, String str4, int i11, AbstractC4148f abstractC4148f) {
        this(str, i10, z6, (i11 & 8) != 0 ? null : str2, str3, str4);
    }
}
