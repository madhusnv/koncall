package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadCallLogNoteCallLog {

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("dateTime")
    private final LocalDateTime dateTime;

    @InterfaceC4485b("duration")
    private final int duration;

    @InterfaceC4485b("fromNumber")
    private final String fromNumber;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    public LeadCallLogNoteCallLog(String callType, String toNumber, int i10, LocalDateTime dateTime, String fromNumber, int i11) {
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        AbstractC4154l.m8923f(fromNumber, "fromNumber");
        this.callType = callType;
        this.toNumber = toNumber;
        this.duration = i10;
        this.dateTime = dateTime;
        this.fromNumber = fromNumber;
        this.countryCode = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadCallLogNoteCallLog)) {
            return false;
        }
        LeadCallLogNoteCallLog leadCallLogNoteCallLog = (LeadCallLogNoteCallLog) obj;
        return AbstractC4154l.m8918a(this.callType, leadCallLogNoteCallLog.callType) && AbstractC4154l.m8918a(this.toNumber, leadCallLogNoteCallLog.toNumber) && this.duration == leadCallLogNoteCallLog.duration && AbstractC4154l.m8918a(this.dateTime, leadCallLogNoteCallLog.dateTime) && AbstractC4154l.m8918a(this.fromNumber, leadCallLogNoteCallLog.fromNumber) && this.countryCode == leadCallLogNoteCallLog.countryCode;
    }

    public final int hashCode() {
        return Integer.hashCode(this.countryCode) + AbstractC0030c.m113d(m0.m7370c(this.dateTime, AbstractC1452a.m4556c(this.duration, AbstractC0030c.m113d(this.callType.hashCode() * 31, 31, this.toNumber), 31), 31), 31, this.fromNumber);
    }

    public final String toString() {
        String str = this.callType;
        String str2 = this.toNumber;
        int i10 = this.duration;
        LocalDateTime localDateTime = this.dateTime;
        String str3 = this.fromNumber;
        int i11 = this.countryCode;
        StringBuilder sbM127r = AbstractC0030c.m127r("LeadCallLogNoteCallLog(callType=", str, ", toNumber=", str2, ", duration=");
        sbM127r.append(i10);
        sbM127r.append(", dateTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(", fromNumber=");
        sbM127r.append(str3);
        sbM127r.append(", countryCode=");
        sbM127r.append(i11);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
