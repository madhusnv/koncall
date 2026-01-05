package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import ym.InterfaceC8701l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadCallLogNoteResponse {

    @InterfaceC4485b("note")
    private final String note;

    @InterfaceC8701l
    @InterfaceC4485b("noteModifiedDateTime")
    private final LocalDateTime noteModifiedDateTime;

    @InterfaceC4485b("reminderDateTime")
    private final LocalDateTime reminderDateTime;

    @InterfaceC4485b("status")
    private final String status;

    public LeadCallLogNoteResponse(String note, String status, LocalDateTime localDateTime, LocalDateTime noteModifiedDateTime) {
        AbstractC4154l.m8923f(note, "note");
        AbstractC4154l.m8923f(status, "status");
        AbstractC4154l.m8923f(noteModifiedDateTime, "noteModifiedDateTime");
        this.note = note;
        this.status = status;
        this.reminderDateTime = localDateTime;
        this.noteModifiedDateTime = noteModifiedDateTime;
    }

    /* renamed from: a */
    public final String m4799a() {
        return this.note;
    }

    /* renamed from: b */
    public final LocalDateTime m4800b() {
        return this.noteModifiedDateTime;
    }

    /* renamed from: c */
    public final LocalDateTime m4801c() {
        return this.reminderDateTime;
    }

    /* renamed from: d */
    public final String m4802d() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadCallLogNoteResponse)) {
            return false;
        }
        LeadCallLogNoteResponse leadCallLogNoteResponse = (LeadCallLogNoteResponse) obj;
        return AbstractC4154l.m8918a(this.note, leadCallLogNoteResponse.note) && AbstractC4154l.m8918a(this.status, leadCallLogNoteResponse.status) && AbstractC4154l.m8918a(this.reminderDateTime, leadCallLogNoteResponse.reminderDateTime) && AbstractC4154l.m8918a(this.noteModifiedDateTime, leadCallLogNoteResponse.noteModifiedDateTime);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(this.note.hashCode() * 31, 31, this.status);
        LocalDateTime localDateTime = this.reminderDateTime;
        return this.noteModifiedDateTime.hashCode() + ((iM113d + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.note;
        String str2 = this.status;
        LocalDateTime localDateTime = this.reminderDateTime;
        LocalDateTime localDateTime2 = this.noteModifiedDateTime;
        StringBuilder sbM127r = AbstractC0030c.m127r("LeadCallLogNoteResponse(note=", str, ", status=", str2, ", reminderDateTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(", noteModifiedDateTime=");
        sbM127r.append(localDateTime2);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
