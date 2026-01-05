package com.websoptimization.callyzerbiz.data.model.response.lead;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LastCallDetails {

    @InterfaceC4485b("callTime")
    private final LocalDateTime callTime;

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("callerName")
    private final String callerName;

    @InterfaceC4485b("callerNumber")
    private final String callerNumber;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("duration")
    private final String duration;

    @InterfaceC4485b("note")
    private final String note;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    public LastCallDetails(String callType, String toNumber, int i10, String callerName, String callerNumber, String duration, String str, LocalDateTime callTime) {
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(callerName, "callerName");
        AbstractC4154l.m8923f(callerNumber, "callerNumber");
        AbstractC4154l.m8923f(duration, "duration");
        AbstractC4154l.m8923f(callTime, "callTime");
        this.callType = callType;
        this.toNumber = toNumber;
        this.countryCode = i10;
        this.callerName = callerName;
        this.callerNumber = callerNumber;
        this.duration = duration;
        this.note = str;
        this.callTime = callTime;
    }

    /* renamed from: a */
    public static LastCallDetails m4903a(LastCallDetails lastCallDetails, String str) {
        String callType = lastCallDetails.callType;
        String toNumber = lastCallDetails.toNumber;
        int i10 = lastCallDetails.countryCode;
        String callerName = lastCallDetails.callerName;
        String callerNumber = lastCallDetails.callerNumber;
        String duration = lastCallDetails.duration;
        LocalDateTime callTime = lastCallDetails.callTime;
        lastCallDetails.getClass();
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(callerName, "callerName");
        AbstractC4154l.m8923f(callerNumber, "callerNumber");
        AbstractC4154l.m8923f(duration, "duration");
        AbstractC4154l.m8923f(callTime, "callTime");
        return new LastCallDetails(callType, toNumber, i10, callerName, callerNumber, duration, str, callTime);
    }

    /* renamed from: b */
    public final LocalDateTime m4904b() {
        return this.callTime;
    }

    /* renamed from: c */
    public final String m4905c() {
        return this.callType;
    }

    /* renamed from: d */
    public final String m4906d() {
        return this.callerName;
    }

    /* renamed from: e */
    public final String m4907e() {
        return this.callerNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastCallDetails)) {
            return false;
        }
        LastCallDetails lastCallDetails = (LastCallDetails) obj;
        return AbstractC4154l.m8918a(this.callType, lastCallDetails.callType) && AbstractC4154l.m8918a(this.toNumber, lastCallDetails.toNumber) && this.countryCode == lastCallDetails.countryCode && AbstractC4154l.m8918a(this.callerName, lastCallDetails.callerName) && AbstractC4154l.m8918a(this.callerNumber, lastCallDetails.callerNumber) && AbstractC4154l.m8918a(this.duration, lastCallDetails.duration) && AbstractC4154l.m8918a(this.note, lastCallDetails.note) && AbstractC4154l.m8918a(this.callTime, lastCallDetails.callTime);
    }

    /* renamed from: f */
    public final int m4908f() {
        return this.countryCode;
    }

    /* renamed from: g */
    public final String m4909g() {
        return this.duration;
    }

    /* renamed from: h */
    public final String m4910h() {
        return this.note;
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4556c(this.countryCode, AbstractC0030c.m113d(this.callType.hashCode() * 31, 31, this.toNumber), 31), 31, this.callerName), 31, this.callerNumber), 31, this.duration);
        String str = this.note;
        return this.callTime.hashCode() + ((iM113d + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* renamed from: i */
    public final String m4911i() {
        return this.toNumber;
    }

    public final String toString() {
        String str = this.callType;
        String str2 = this.toNumber;
        int i10 = this.countryCode;
        String str3 = this.callerName;
        String str4 = this.callerNumber;
        String str5 = this.duration;
        String str6 = this.note;
        LocalDateTime localDateTime = this.callTime;
        StringBuilder sbM127r = AbstractC0030c.m127r("LastCallDetails(callType=", str, ", toNumber=", str2, ", countryCode=");
        AbstractC1452a.m4550A(sbM127r, i10, ", callerName=", str3, ", callerNumber=");
        a1.m14319B(sbM127r, str4, ", duration=", str5, ", note=");
        sbM127r.append(str6);
        sbM127r.append(", callTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
