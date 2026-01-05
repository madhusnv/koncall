package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;
import ym.InterfaceC8701l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchUpdatedCallLogsNoteResponse {

    @InterfaceC4485b("callType")
    private final String callType;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("dateTime")
    private final String dateTime;

    @InterfaceC4485b("duration")
    private final int duration;

    @InterfaceC4485b("fromNumber")
    private final String fromNumber;

    @InterfaceC8701l
    @InterfaceC4485b("noteModifiedDateTime")
    private final LocalDateTime noteModifiedDateTime;

    @InterfaceC4485b("notes")
    private final String notes;

    @InterfaceC4485b("toName")
    private final String toName;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    public FetchUpdatedCallLogsNoteResponse(String toName, String callType, String str, String fromNumber, String toNumber, String dateTime, int i10, int i11, LocalDateTime noteModifiedDateTime) {
        AbstractC4154l.m8923f(toName, "toName");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(fromNumber, "fromNumber");
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        AbstractC4154l.m8923f(noteModifiedDateTime, "noteModifiedDateTime");
        this.toName = toName;
        this.callType = callType;
        this.notes = str;
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
        this.dateTime = dateTime;
        this.duration = i10;
        this.countryCode = i11;
        this.noteModifiedDateTime = noteModifiedDateTime;
    }

    /* renamed from: a */
    public final String m4784a() {
        return this.callType;
    }

    /* renamed from: b */
    public final String m4785b() {
        return this.dateTime;
    }

    /* renamed from: c */
    public final String m4786c() {
        return this.fromNumber;
    }

    /* renamed from: d */
    public final LocalDateTime m4787d() {
        return this.noteModifiedDateTime;
    }

    /* renamed from: e */
    public final String m4788e() {
        return this.notes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchUpdatedCallLogsNoteResponse)) {
            return false;
        }
        FetchUpdatedCallLogsNoteResponse fetchUpdatedCallLogsNoteResponse = (FetchUpdatedCallLogsNoteResponse) obj;
        return AbstractC4154l.m8918a(this.toName, fetchUpdatedCallLogsNoteResponse.toName) && AbstractC4154l.m8918a(this.callType, fetchUpdatedCallLogsNoteResponse.callType) && AbstractC4154l.m8918a(this.notes, fetchUpdatedCallLogsNoteResponse.notes) && AbstractC4154l.m8918a(this.fromNumber, fetchUpdatedCallLogsNoteResponse.fromNumber) && AbstractC4154l.m8918a(this.toNumber, fetchUpdatedCallLogsNoteResponse.toNumber) && AbstractC4154l.m8918a(this.dateTime, fetchUpdatedCallLogsNoteResponse.dateTime) && this.duration == fetchUpdatedCallLogsNoteResponse.duration && this.countryCode == fetchUpdatedCallLogsNoteResponse.countryCode && AbstractC4154l.m8918a(this.noteModifiedDateTime, fetchUpdatedCallLogsNoteResponse.noteModifiedDateTime);
    }

    /* renamed from: f */
    public final String m4789f() {
        return this.toNumber;
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(this.toName.hashCode() * 31, 31, this.callType);
        String str = this.notes;
        return this.noteModifiedDateTime.hashCode() + AbstractC1452a.m4556c(this.countryCode, AbstractC1452a.m4556c(this.duration, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d((iM113d + (str == null ? 0 : str.hashCode())) * 31, 31, this.fromNumber), 31, this.toNumber), 31, this.dateTime), 31), 31);
    }

    public final String toString() {
        String str = this.toName;
        String str2 = this.callType;
        String str3 = this.notes;
        String str4 = this.fromNumber;
        String str5 = this.toNumber;
        String str6 = this.dateTime;
        int i10 = this.duration;
        int i11 = this.countryCode;
        LocalDateTime localDateTime = this.noteModifiedDateTime;
        StringBuilder sbM127r = AbstractC0030c.m127r("FetchUpdatedCallLogsNoteResponse(toName=", str, ", callType=", str2, ", notes=");
        a1.m14319B(sbM127r, str3, ", fromNumber=", str4, ", toNumber=");
        a1.m14319B(sbM127r, str5, ", dateTime=", str6, ", duration=");
        sbM127r.append(i10);
        sbM127r.append(", countryCode=");
        sbM127r.append(i11);
        sbM127r.append(", noteModifiedDateTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    public /* synthetic */ FetchUpdatedCallLogsNoteResponse(String str, String str2, String str3, String str4, String str5, String str6, int i10, int i11, LocalDateTime localDateTime, int i12, AbstractC4148f abstractC4148f) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, str4, str5, str6, i10, i11, localDateTime);
    }
}
