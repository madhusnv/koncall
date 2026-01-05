package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadCallLogNoteRequest {

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("countryCode")
    private final int countyCode;

    @InterfaceC4485b("dateTime")
    private final LocalDateTime dateTime;

    @InterfaceC4485b("duration")
    private final long duration;

    @InterfaceC4485b("fromNumber")
    private final String fromNumber;

    @InterfaceC4485b("toName")
    private final String toName;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    public LeadCallLogNoteRequest(String toNumber, String callType, long j6, LocalDateTime dateTime, String fromNumber, String toName, int i10) {
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        AbstractC4154l.m8923f(fromNumber, "fromNumber");
        AbstractC4154l.m8923f(toName, "toName");
        this.toNumber = toNumber;
        this.callType = callType;
        this.duration = j6;
        this.dateTime = dateTime;
        this.fromNumber = fromNumber;
        this.toName = toName;
        this.countyCode = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadCallLogNoteRequest)) {
            return false;
        }
        LeadCallLogNoteRequest leadCallLogNoteRequest = (LeadCallLogNoteRequest) obj;
        return AbstractC4154l.m8918a(this.toNumber, leadCallLogNoteRequest.toNumber) && AbstractC4154l.m8918a(this.callType, leadCallLogNoteRequest.callType) && this.duration == leadCallLogNoteRequest.duration && AbstractC4154l.m8918a(this.dateTime, leadCallLogNoteRequest.dateTime) && AbstractC4154l.m8918a(this.fromNumber, leadCallLogNoteRequest.fromNumber) && AbstractC4154l.m8918a(this.toName, leadCallLogNoteRequest.toName) && this.countyCode == leadCallLogNoteRequest.countyCode;
    }

    public final int hashCode() {
        return Integer.hashCode(this.countyCode) + AbstractC0030c.m113d(AbstractC0030c.m113d(m0.m7370c(this.dateTime, AbstractC1452a.m4557d(AbstractC0030c.m113d(this.toNumber.hashCode() * 31, 31, this.callType), 31, this.duration), 31), 31, this.fromNumber), 31, this.toName);
    }

    public final String toString() {
        String str = this.toNumber;
        String str2 = this.callType;
        long j6 = this.duration;
        LocalDateTime localDateTime = this.dateTime;
        String str3 = this.fromNumber;
        String str4 = this.toName;
        int i10 = this.countyCode;
        StringBuilder sbM127r = AbstractC0030c.m127r("LeadCallLogNoteRequest(toNumber=", str, ", callType=", str2, ", duration=");
        sbM127r.append(j6);
        sbM127r.append(", dateTime=");
        sbM127r.append(localDateTime);
        a1.m14319B(sbM127r, ", fromNumber=", str3, ", toName=", str4);
        sbM127r.append(", countyCode=");
        sbM127r.append(i10);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
