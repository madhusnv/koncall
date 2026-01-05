package com.websoptimization.callyzerbiz.data.model.db;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import nm.C5107b;
import ym.InterfaceC8701l;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class SyncCallLogNote {

    /* renamed from: a */
    public final EnumC8994d f7342a;

    /* renamed from: b */
    public final int f7343b;

    @InterfaceC4485b("callType")
    private final String callTypeInString;

    @InterfaceC4485b("countryCode")
    private final int countryCode;

    @InterfaceC4485b("dateTime")
    private final String dateTime;

    @InterfaceC4485b("duration")
    private final long duration;

    @InterfaceC8701l
    @InterfaceC4485b("noteModifiedDateTime")
    private LocalDateTime noteModifiedDateTime;

    @InterfaceC4485b("note")
    private final String notes;

    @InterfaceC4485b("toNumber")
    private final String number;

    @InterfaceC4485b("fromNumber")
    private final String simNumber;

    public SyncCallLogNote(String number, String simNumber, EnumC8994d callType, String dateTime, long j6, int i10, String str, LocalDateTime localDateTime, int i11) {
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        this.number = number;
        this.simNumber = simNumber;
        this.f7342a = callType;
        this.dateTime = dateTime;
        this.duration = j6;
        this.countryCode = i10;
        this.notes = str;
        this.noteModifiedDateTime = localDateTime;
        this.f7343b = i11;
        this.callTypeInString = callType.getTypeName();
    }

    /* renamed from: a */
    public static SyncCallLogNote m4630a(SyncCallLogNote syncCallLogNote) {
        String number = syncCallLogNote.number;
        String simNumber = syncCallLogNote.simNumber;
        EnumC8994d callType = syncCallLogNote.f7342a;
        String dateTime = syncCallLogNote.dateTime;
        long j6 = syncCallLogNote.duration;
        int i10 = syncCallLogNote.countryCode;
        LocalDateTime localDateTime = syncCallLogNote.noteModifiedDateTime;
        int i11 = syncCallLogNote.f7343b;
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(dateTime, "dateTime");
        return new SyncCallLogNote(number, simNumber, callType, dateTime, j6, i10, "", localDateTime, i11);
    }

    /* renamed from: b */
    public final String m4631b() {
        return this.notes;
    }

    /* renamed from: c */
    public final boolean m4632c(C5107b c5107b) {
        return this.number.contentEquals(c5107b.f25010a) && this.dateTime.contentEquals(c5107b.f25012c) && this.simNumber.contentEquals(c5107b.f25011b) && this.callTypeInString.contentEquals(c5107b.f25013d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncCallLogNote)) {
            return false;
        }
        SyncCallLogNote syncCallLogNote = (SyncCallLogNote) obj;
        return AbstractC4154l.m8918a(this.number, syncCallLogNote.number) && AbstractC4154l.m8918a(this.simNumber, syncCallLogNote.simNumber) && this.f7342a == syncCallLogNote.f7342a && AbstractC4154l.m8918a(this.dateTime, syncCallLogNote.dateTime) && this.duration == syncCallLogNote.duration && this.countryCode == syncCallLogNote.countryCode && AbstractC4154l.m8918a(this.notes, syncCallLogNote.notes) && AbstractC4154l.m8918a(this.noteModifiedDateTime, syncCallLogNote.noteModifiedDateTime) && this.f7343b == syncCallLogNote.f7343b;
    }

    public final int hashCode() {
        int iM4556c = AbstractC1452a.m4556c(this.countryCode, AbstractC1452a.m4557d(AbstractC0030c.m113d((this.f7342a.hashCode() + AbstractC0030c.m113d(this.number.hashCode() * 31, 31, this.simNumber)) * 31, 31, this.dateTime), 31, this.duration), 31);
        String str = this.notes;
        int iHashCode = (iM4556c + (str == null ? 0 : str.hashCode())) * 31;
        LocalDateTime localDateTime = this.noteModifiedDateTime;
        return Integer.hashCode(this.f7343b) + ((iHashCode + (localDateTime != null ? localDateTime.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.number;
        String str2 = this.simNumber;
        String str3 = this.dateTime;
        long j6 = this.duration;
        int i10 = this.countryCode;
        String str4 = this.notes;
        LocalDateTime localDateTime = this.noteModifiedDateTime;
        StringBuilder sbM127r = AbstractC0030c.m127r("SyncCallLogNote(number=", str, ", simNumber=", str2, ", callType=");
        sbM127r.append(this.f7342a);
        sbM127r.append(", dateTime=");
        sbM127r.append(str3);
        sbM127r.append(", duration=");
        sbM127r.append(j6);
        sbM127r.append(", countryCode=");
        sbM127r.append(i10);
        sbM127r.append(", notes=");
        sbM127r.append(str4);
        sbM127r.append(", noteModifiedDateTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(", callLogId=");
        sbM127r.append(this.f7343b);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    public /* synthetic */ SyncCallLogNote(String str, String str2, EnumC8994d enumC8994d, String str3, long j6, int i10, String str4, LocalDateTime localDateTime, int i11, int i12, AbstractC4148f abstractC4148f) {
        this(str, str2, enumC8994d, str3, j6, i10, str4, (i12 & 128) != 0 ? null : localDateTime, i11);
    }
}
