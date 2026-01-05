package com.websoptimization.callyzerbiz.data.model.response.edit_lead_response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadCallHistoryCountDetails {

    @InterfaceC4485b("maxDate")
    private final LocalDateTime maxDate;

    @InterfaceC4485b("minDate")
    private final LocalDateTime minDate;

    @InterfaceC4485b("totalCall")
    private final int totalCall;

    @InterfaceC4485b("totalCallDuration")
    private final int totalCallDuration;

    @InterfaceC4485b("totalCallDurationInString")
    private final String totalCallDurationInString;

    @InterfaceC4485b("totalIncoming")
    private final int totalIncoming;

    @InterfaceC4485b("totalIncomingDuration")
    private final int totalIncomingDuration;

    @InterfaceC4485b("totalIncomingDurationInString")
    private final String totalIncomingDurationInString;

    @InterfaceC4485b("totalMissed")
    private final int totalMissed;

    @InterfaceC4485b("totalOutgoing")
    private final int totalOutgoing;

    @InterfaceC4485b("totalOutgoingDuration")
    private final int totalOutgoingDuration;

    @InterfaceC4485b("totalOutgoingDurationInString")
    private final String totalOutgoingDurationInString;

    @InterfaceC4485b("totalRejected")
    private final int totalRejected;

    public LeadCallHistoryCountDetails(int i10, int i11, String totalIncomingDurationInString, int i12, int i13, String totalOutgoingDurationInString, int i14, int i15, int i16, int i17, String totalCallDurationInString, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        AbstractC4154l.m8923f(totalIncomingDurationInString, "totalIncomingDurationInString");
        AbstractC4154l.m8923f(totalOutgoingDurationInString, "totalOutgoingDurationInString");
        AbstractC4154l.m8923f(totalCallDurationInString, "totalCallDurationInString");
        this.totalIncoming = i10;
        this.totalIncomingDuration = i11;
        this.totalIncomingDurationInString = totalIncomingDurationInString;
        this.totalOutgoing = i12;
        this.totalOutgoingDuration = i13;
        this.totalOutgoingDurationInString = totalOutgoingDurationInString;
        this.totalMissed = i14;
        this.totalRejected = i15;
        this.totalCall = i16;
        this.totalCallDuration = i17;
        this.totalCallDurationInString = totalCallDurationInString;
        this.minDate = localDateTime;
        this.maxDate = localDateTime2;
    }

    /* renamed from: a */
    public final LocalDateTime m4889a() {
        return this.maxDate;
    }

    /* renamed from: b */
    public final LocalDateTime m4890b() {
        return this.minDate;
    }

    /* renamed from: c */
    public final int m4891c() {
        return this.totalCall;
    }

    /* renamed from: d */
    public final int m4892d() {
        return this.totalCallDuration;
    }

    /* renamed from: e */
    public final int m4893e() {
        return this.totalIncoming;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadCallHistoryCountDetails)) {
            return false;
        }
        LeadCallHistoryCountDetails leadCallHistoryCountDetails = (LeadCallHistoryCountDetails) obj;
        return this.totalIncoming == leadCallHistoryCountDetails.totalIncoming && this.totalIncomingDuration == leadCallHistoryCountDetails.totalIncomingDuration && AbstractC4154l.m8918a(this.totalIncomingDurationInString, leadCallHistoryCountDetails.totalIncomingDurationInString) && this.totalOutgoing == leadCallHistoryCountDetails.totalOutgoing && this.totalOutgoingDuration == leadCallHistoryCountDetails.totalOutgoingDuration && AbstractC4154l.m8918a(this.totalOutgoingDurationInString, leadCallHistoryCountDetails.totalOutgoingDurationInString) && this.totalMissed == leadCallHistoryCountDetails.totalMissed && this.totalRejected == leadCallHistoryCountDetails.totalRejected && this.totalCall == leadCallHistoryCountDetails.totalCall && this.totalCallDuration == leadCallHistoryCountDetails.totalCallDuration && AbstractC4154l.m8918a(this.totalCallDurationInString, leadCallHistoryCountDetails.totalCallDurationInString) && AbstractC4154l.m8918a(this.minDate, leadCallHistoryCountDetails.minDate) && AbstractC4154l.m8918a(this.maxDate, leadCallHistoryCountDetails.maxDate);
    }

    /* renamed from: f */
    public final int m4894f() {
        return this.totalIncomingDuration;
    }

    /* renamed from: g */
    public final int m4895g() {
        return this.totalMissed;
    }

    /* renamed from: h */
    public final int m4896h() {
        return this.totalOutgoing;
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC1452a.m4556c(this.totalCallDuration, AbstractC1452a.m4556c(this.totalCall, AbstractC1452a.m4556c(this.totalRejected, AbstractC1452a.m4556c(this.totalMissed, AbstractC0030c.m113d(AbstractC1452a.m4556c(this.totalOutgoingDuration, AbstractC1452a.m4556c(this.totalOutgoing, AbstractC0030c.m113d(AbstractC1452a.m4556c(this.totalIncomingDuration, Integer.hashCode(this.totalIncoming) * 31, 31), 31, this.totalIncomingDurationInString), 31), 31), 31, this.totalOutgoingDurationInString), 31), 31), 31), 31), 31, this.totalCallDurationInString);
        LocalDateTime localDateTime = this.minDate;
        int iHashCode = (iM113d + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.maxDate;
        return iHashCode + (localDateTime2 != null ? localDateTime2.hashCode() : 0);
    }

    /* renamed from: i */
    public final int m4897i() {
        return this.totalOutgoingDuration;
    }

    /* renamed from: j */
    public final int m4898j() {
        return this.totalRejected;
    }

    public final String toString() {
        int i10 = this.totalIncoming;
        int i11 = this.totalIncomingDuration;
        String str = this.totalIncomingDurationInString;
        int i12 = this.totalOutgoing;
        int i13 = this.totalOutgoingDuration;
        String str2 = this.totalOutgoingDurationInString;
        int i14 = this.totalMissed;
        int i15 = this.totalRejected;
        int i16 = this.totalCall;
        int i17 = this.totalCallDuration;
        String str3 = this.totalCallDurationInString;
        LocalDateTime localDateTime = this.minDate;
        LocalDateTime localDateTime2 = this.maxDate;
        StringBuilder sbM4566m = AbstractC1452a.m4566m(i10, i11, "LeadCallHistoryCountDetails(totalIncoming=", ", totalIncomingDuration=", ", totalIncomingDurationInString=");
        AbstractC1452a.m4551B(sbM4566m, str, ", totalOutgoing=", i12, ", totalOutgoingDuration=");
        AbstractC1452a.m4550A(sbM4566m, i13, ", totalOutgoingDurationInString=", str2, ", totalMissed=");
        sbM4566m.append(i14);
        sbM4566m.append(", totalRejected=");
        sbM4566m.append(i15);
        sbM4566m.append(", totalCall=");
        sbM4566m.append(i16);
        sbM4566m.append(", totalCallDuration=");
        sbM4566m.append(i17);
        sbM4566m.append(", totalCallDurationInString=");
        sbM4566m.append(str3);
        sbM4566m.append(", minDate=");
        sbM4566m.append(localDateTime);
        sbM4566m.append(", maxDate=");
        sbM4566m.append(localDateTime2);
        sbM4566m.append(")");
        return sbM4566m.toString();
    }
}
