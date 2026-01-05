package com.websoptimization.callyzerbiz.data.model.response.edit_lead_response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadCallHistory {

    @InterfaceC4485b("callBackTime")
    private final LocalDateTime callBackTime;

    @InterfaceC4485b("callDateTime")
    private final LocalDateTime callDateTime;

    @InterfaceC4485b("callStatus")
    private final String callStatus;

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("callerName")
    private final String callerName;

    @InterfaceC4485b("callerNumber")
    private final String callerNumber;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("duration")
    private final int duration;

    @InterfaceC4485b("durationInString")
    private final String durationInString;

    @InterfaceC4485b("note")
    private final String note;

    @InterfaceC4485b("noteModifiedDateTime")
    private final LocalDateTime noteModifiedDateTime;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    public LeadCallHistory(String toNumber, int i10, LocalDateTime localDateTime, LocalDateTime callDateTime, String callType, String callerName, String callerNumber, int i11, String str, String str2, LocalDateTime noteModifiedDateTime, String str3) {
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(callDateTime, "callDateTime");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(callerName, "callerName");
        AbstractC4154l.m8923f(callerNumber, "callerNumber");
        AbstractC4154l.m8923f(noteModifiedDateTime, "noteModifiedDateTime");
        this.toNumber = toNumber;
        this.countryCode = i10;
        this.callBackTime = localDateTime;
        this.callDateTime = callDateTime;
        this.callType = callType;
        this.callerName = callerName;
        this.callerNumber = callerNumber;
        this.duration = i11;
        this.note = str;
        this.durationInString = str2;
        this.noteModifiedDateTime = noteModifiedDateTime;
        this.callStatus = str3;
    }

    /* renamed from: a */
    public final LocalDateTime m4879a() {
        return this.callBackTime;
    }

    /* renamed from: b */
    public final LocalDateTime m4880b() {
        return this.callDateTime;
    }

    /* renamed from: c */
    public final String m4881c() {
        return this.callStatus;
    }

    /* renamed from: d */
    public final String m4882d() {
        return this.callType;
    }

    /* renamed from: e */
    public final String m4883e() {
        return this.callerName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadCallHistory)) {
            return false;
        }
        LeadCallHistory leadCallHistory = (LeadCallHistory) obj;
        return AbstractC4154l.m8918a(this.toNumber, leadCallHistory.toNumber) && this.countryCode == leadCallHistory.countryCode && AbstractC4154l.m8918a(this.callBackTime, leadCallHistory.callBackTime) && AbstractC4154l.m8918a(this.callDateTime, leadCallHistory.callDateTime) && AbstractC4154l.m8918a(this.callType, leadCallHistory.callType) && AbstractC4154l.m8918a(this.callerName, leadCallHistory.callerName) && AbstractC4154l.m8918a(this.callerNumber, leadCallHistory.callerNumber) && this.duration == leadCallHistory.duration && AbstractC4154l.m8918a(this.note, leadCallHistory.note) && AbstractC4154l.m8918a(this.durationInString, leadCallHistory.durationInString) && AbstractC4154l.m8918a(this.noteModifiedDateTime, leadCallHistory.noteModifiedDateTime) && AbstractC4154l.m8918a(this.callStatus, leadCallHistory.callStatus);
    }

    /* renamed from: f */
    public final String m4884f() {
        return this.callerNumber;
    }

    /* renamed from: g */
    public final int m4885g() {
        return this.countryCode;
    }

    /* renamed from: h */
    public final int m4886h() {
        return this.duration;
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.countryCode, this.toNumber.hashCode() * 31, 31);
        LocalDateTime localDateTime = this.callBackTime;
        int iM4556c2 = AbstractC1452a.m4556c(this.duration, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(m0.m7370c(this.callDateTime, (iM4556c + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31, 31), 31, this.callType), 31, this.callerName), 31, this.callerNumber), 31);
        String str = this.note;
        int iHashCode = (iM4556c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.durationInString;
        int iM7370c = m0.m7370c(this.noteModifiedDateTime, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.callStatus;
        return iM7370c + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m4887i() {
        return this.note;
    }

    /* renamed from: j */
    public final String m4888j() {
        return this.toNumber;
    }

    public final String toString() {
        String str = this.toNumber;
        int i10 = this.countryCode;
        LocalDateTime localDateTime = this.callBackTime;
        LocalDateTime localDateTime2 = this.callDateTime;
        String str2 = this.callType;
        String str3 = this.callerName;
        String str4 = this.callerNumber;
        int i11 = this.duration;
        String str5 = this.note;
        String str6 = this.durationInString;
        LocalDateTime localDateTime3 = this.noteModifiedDateTime;
        String str7 = this.callStatus;
        StringBuilder sbM125p = AbstractC0030c.m125p(i10, "LeadCallHistory(toNumber=", str, ", countryCode=", ", callBackTime=");
        sbM125p.append(localDateTime);
        sbM125p.append(", callDateTime=");
        sbM125p.append(localDateTime2);
        sbM125p.append(", callType=");
        a1.m14319B(sbM125p, str2, ", callerName=", str3, ", callerNumber=");
        AbstractC1452a.m4551B(sbM125p, str4, ", duration=", i11, ", note=");
        a1.m14319B(sbM125p, str5, ", durationInString=", str6, ", noteModifiedDateTime=");
        sbM125p.append(localDateTime3);
        sbM125p.append(", callStatus=");
        sbM125p.append(str7);
        sbM125p.append(")");
        return sbM125p.toString();
    }
}
