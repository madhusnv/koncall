package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallLogNoteResponse {

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("dateTime")
    private final String dateTime;

    @InterfaceC4485b("duration")
    private final long duration;

    @InterfaceC4485b("isNoteUpdate")
    private final boolean isNoteUpdated;

    @InterfaceC4485b("toNumber")
    private final String number;

    @InterfaceC4485b("fromNumber")
    private final String simNumber;

    public CallLogNoteResponse(String number, String simNumber, int i10, String callType, String dateTime, long j6, boolean z6) {
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        this.number = number;
        this.simNumber = simNumber;
        this.countryCode = i10;
        this.callType = callType;
        this.dateTime = dateTime;
        this.duration = j6;
        this.isNoteUpdated = z6;
    }

    /* renamed from: a */
    public final String m4740a() {
        return this.callType;
    }

    /* renamed from: b */
    public final String m4741b() {
        return this.dateTime;
    }

    /* renamed from: c */
    public final String m4742c() {
        return this.number;
    }

    /* renamed from: d */
    public final String m4743d() {
        return this.simNumber;
    }

    /* renamed from: e */
    public final boolean m4744e() {
        return this.isNoteUpdated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallLogNoteResponse)) {
            return false;
        }
        CallLogNoteResponse callLogNoteResponse = (CallLogNoteResponse) obj;
        return AbstractC4154l.m8918a(this.number, callLogNoteResponse.number) && AbstractC4154l.m8918a(this.simNumber, callLogNoteResponse.simNumber) && this.countryCode == callLogNoteResponse.countryCode && AbstractC4154l.m8918a(this.callType, callLogNoteResponse.callType) && AbstractC4154l.m8918a(this.dateTime, callLogNoteResponse.dateTime) && this.duration == callLogNoteResponse.duration && this.isNoteUpdated == callLogNoteResponse.isNoteUpdated;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isNoteUpdated) + AbstractC1452a.m4557d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4556c(this.countryCode, AbstractC0030c.m113d(this.number.hashCode() * 31, 31, this.simNumber), 31), 31, this.callType), 31, this.dateTime), 31, this.duration);
    }

    public final String toString() {
        String str = this.number;
        String str2 = this.simNumber;
        int i10 = this.countryCode;
        String str3 = this.callType;
        String str4 = this.dateTime;
        long j6 = this.duration;
        boolean z6 = this.isNoteUpdated;
        StringBuilder sbM127r = AbstractC0030c.m127r("CallLogNoteResponse(number=", str, ", simNumber=", str2, ", countryCode=");
        AbstractC1452a.m4550A(sbM127r, i10, ", callType=", str3, ", dateTime=");
        sbM127r.append(str4);
        sbM127r.append(", duration=");
        sbM127r.append(j6);
        sbM127r.append(", isNoteUpdated=");
        sbM127r.append(z6);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
