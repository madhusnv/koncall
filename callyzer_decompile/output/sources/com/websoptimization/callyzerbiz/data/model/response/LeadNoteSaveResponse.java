package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import ym.InterfaceC8701l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadNoteSaveResponse {

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("dateTime")
    private final LocalDateTime dateTime;

    @InterfaceC4485b("duration")
    private final long duration;

    @InterfaceC4485b("fromNumber")
    private final String fromNumber;

    @InterfaceC4485b("isNoteUpdate")
    private final boolean isNoteUpdate;

    @InterfaceC8701l
    @InterfaceC4485b("noteModifiedDateTime")
    private final LocalDateTime noteModifiedDateTime;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    public LeadNoteSaveResponse(String fromNumber, String toNumber, int i10, LocalDateTime dateTime, String callType, long j6, boolean z6, LocalDateTime noteModifiedDateTime) {
        AbstractC4154l.m8923f(fromNumber, "fromNumber");
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(noteModifiedDateTime, "noteModifiedDateTime");
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
        this.countryCode = i10;
        this.dateTime = dateTime;
        this.callType = callType;
        this.duration = j6;
        this.isNoteUpdate = z6;
        this.noteModifiedDateTime = noteModifiedDateTime;
    }

    /* renamed from: a */
    public final String m4803a() {
        return this.callType;
    }

    /* renamed from: b */
    public final int m4804b() {
        return this.countryCode;
    }

    /* renamed from: c */
    public final LocalDateTime m4805c() {
        return this.dateTime;
    }

    /* renamed from: d */
    public final long m4806d() {
        return this.duration;
    }

    /* renamed from: e */
    public final String m4807e() {
        return this.fromNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadNoteSaveResponse)) {
            return false;
        }
        LeadNoteSaveResponse leadNoteSaveResponse = (LeadNoteSaveResponse) obj;
        return AbstractC4154l.m8918a(this.fromNumber, leadNoteSaveResponse.fromNumber) && AbstractC4154l.m8918a(this.toNumber, leadNoteSaveResponse.toNumber) && this.countryCode == leadNoteSaveResponse.countryCode && AbstractC4154l.m8918a(this.dateTime, leadNoteSaveResponse.dateTime) && AbstractC4154l.m8918a(this.callType, leadNoteSaveResponse.callType) && this.duration == leadNoteSaveResponse.duration && this.isNoteUpdate == leadNoteSaveResponse.isNoteUpdate && AbstractC4154l.m8918a(this.noteModifiedDateTime, leadNoteSaveResponse.noteModifiedDateTime);
    }

    /* renamed from: f */
    public final LocalDateTime m4808f() {
        return this.noteModifiedDateTime;
    }

    /* renamed from: g */
    public final String m4809g() {
        return this.toNumber;
    }

    /* renamed from: h */
    public final boolean m4810h() {
        return this.isNoteUpdate;
    }

    public final int hashCode() {
        return this.noteModifiedDateTime.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4557d(AbstractC0030c.m113d(m0.m7370c(this.dateTime, AbstractC1452a.m4556c(this.countryCode, AbstractC0030c.m113d(this.fromNumber.hashCode() * 31, 31, this.toNumber), 31), 31), 31, this.callType), 31, this.duration), 31, this.isNoteUpdate);
    }

    public final String toString() {
        String str = this.fromNumber;
        String str2 = this.toNumber;
        int i10 = this.countryCode;
        LocalDateTime localDateTime = this.dateTime;
        String str3 = this.callType;
        long j6 = this.duration;
        boolean z6 = this.isNoteUpdate;
        LocalDateTime localDateTime2 = this.noteModifiedDateTime;
        StringBuilder sbM127r = AbstractC0030c.m127r("LeadNoteSaveResponse(fromNumber=", str, ", toNumber=", str2, ", countryCode=");
        sbM127r.append(i10);
        sbM127r.append(", dateTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(", callType=");
        sbM127r.append(str3);
        sbM127r.append(", duration=");
        sbM127r.append(j6);
        sbM127r.append(", isNoteUpdate=");
        sbM127r.append(z6);
        sbM127r.append(", noteModifiedDateTime=");
        sbM127r.append(localDateTime2);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
