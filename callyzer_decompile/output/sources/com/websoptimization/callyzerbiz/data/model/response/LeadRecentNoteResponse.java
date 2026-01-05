package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadRecentNoteResponse {

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

    @InterfaceC4485b("noteModifiedDateTime")
    private final LocalDateTime noteModifiedDateTime;

    @InterfaceC4485b("toNumber")
    private final String toNumber;

    public LeadRecentNoteResponse(LocalDateTime callTime, String callType, String toNumber, String callerName, String callerNumber, String duration, String note, LocalDateTime noteModifiedDateTime, int i10) {
        AbstractC4154l.m8923f(callTime, "callTime");
        AbstractC4154l.m8923f(callType, "callType");
        AbstractC4154l.m8923f(toNumber, "toNumber");
        AbstractC4154l.m8923f(callerName, "callerName");
        AbstractC4154l.m8923f(callerNumber, "callerNumber");
        AbstractC4154l.m8923f(duration, "duration");
        AbstractC4154l.m8923f(note, "note");
        AbstractC4154l.m8923f(noteModifiedDateTime, "noteModifiedDateTime");
        this.callTime = callTime;
        this.callType = callType;
        this.toNumber = toNumber;
        this.callerName = callerName;
        this.callerNumber = callerNumber;
        this.duration = duration;
        this.note = note;
        this.noteModifiedDateTime = noteModifiedDateTime;
        this.countryCode = i10;
    }

    /* renamed from: a */
    public final LocalDateTime m4811a() {
        return this.callTime;
    }

    /* renamed from: b */
    public final String m4812b() {
        return this.callType;
    }

    /* renamed from: c */
    public final String m4813c() {
        return this.callerName;
    }

    /* renamed from: d */
    public final String m4814d() {
        return this.callerNumber;
    }

    /* renamed from: e */
    public final int m4815e() {
        return this.countryCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadRecentNoteResponse)) {
            return false;
        }
        LeadRecentNoteResponse leadRecentNoteResponse = (LeadRecentNoteResponse) obj;
        return AbstractC4154l.m8918a(this.callTime, leadRecentNoteResponse.callTime) && AbstractC4154l.m8918a(this.callType, leadRecentNoteResponse.callType) && AbstractC4154l.m8918a(this.toNumber, leadRecentNoteResponse.toNumber) && AbstractC4154l.m8918a(this.callerName, leadRecentNoteResponse.callerName) && AbstractC4154l.m8918a(this.callerNumber, leadRecentNoteResponse.callerNumber) && AbstractC4154l.m8918a(this.duration, leadRecentNoteResponse.duration) && AbstractC4154l.m8918a(this.note, leadRecentNoteResponse.note) && AbstractC4154l.m8918a(this.noteModifiedDateTime, leadRecentNoteResponse.noteModifiedDateTime) && this.countryCode == leadRecentNoteResponse.countryCode;
    }

    /* renamed from: f */
    public final String m4816f() {
        return this.duration;
    }

    /* renamed from: g */
    public final String m4817g() {
        return this.note;
    }

    public final int hashCode() {
        return Integer.hashCode(this.countryCode) + m0.m7370c(this.noteModifiedDateTime, AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.callTime.hashCode() * 31, 31, this.callType), 31, this.toNumber), 31, this.callerName), 31, this.callerNumber), 31, this.duration), 31, this.note), 31);
    }

    public final String toString() {
        LocalDateTime localDateTime = this.callTime;
        String str = this.callType;
        String str2 = this.toNumber;
        String str3 = this.callerName;
        String str4 = this.callerNumber;
        String str5 = this.duration;
        String str6 = this.note;
        LocalDateTime localDateTime2 = this.noteModifiedDateTime;
        int i10 = this.countryCode;
        StringBuilder sb2 = new StringBuilder("LeadRecentNoteResponse(callTime=");
        sb2.append(localDateTime);
        sb2.append(", callType=");
        sb2.append(str);
        sb2.append(", toNumber=");
        a1.m14319B(sb2, str2, ", callerName=", str3, ", callerNumber=");
        a1.m14319B(sb2, str4, ", duration=", str5, ", note=");
        sb2.append(str6);
        sb2.append(", noteModifiedDateTime=");
        sb2.append(localDateTime2);
        sb2.append(", countryCode=");
        return AbstractC5601a.m11233d(i10, ")", sb2);
    }
}
