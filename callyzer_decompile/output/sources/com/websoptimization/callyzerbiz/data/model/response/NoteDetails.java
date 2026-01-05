package com.websoptimization.callyzerbiz.data.model.response;

import a2.AbstractC0030c;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import ym.InterfaceC8701l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class NoteDetails {

    @InterfaceC4485b("note")
    private final String note;

    @InterfaceC8701l
    @InterfaceC4485b("noteModifiedDateTime")
    private final LocalDateTime noteModifiedDateTime;

    @InterfaceC4485b("updatedBy")
    private final String updatedBy;

    public NoteDetails(String str, String updatedBy, LocalDateTime noteModifiedDateTime) {
        AbstractC4154l.m8923f(updatedBy, "updatedBy");
        AbstractC4154l.m8923f(noteModifiedDateTime, "noteModifiedDateTime");
        this.note = str;
        this.updatedBy = updatedBy;
        this.noteModifiedDateTime = noteModifiedDateTime;
    }

    /* renamed from: a */
    public final String m4827a() {
        return this.note;
    }

    /* renamed from: b */
    public final LocalDateTime m4828b() {
        return this.noteModifiedDateTime;
    }

    /* renamed from: c */
    public final String m4829c() {
        return this.updatedBy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoteDetails)) {
            return false;
        }
        NoteDetails noteDetails = (NoteDetails) obj;
        return AbstractC4154l.m8918a(this.note, noteDetails.note) && AbstractC4154l.m8918a(this.updatedBy, noteDetails.updatedBy) && AbstractC4154l.m8918a(this.noteModifiedDateTime, noteDetails.noteModifiedDateTime);
    }

    public final int hashCode() {
        String str = this.note;
        return this.noteModifiedDateTime.hashCode() + AbstractC0030c.m113d((str == null ? 0 : str.hashCode()) * 31, 31, this.updatedBy);
    }

    public final String toString() {
        String str = this.note;
        String str2 = this.updatedBy;
        LocalDateTime localDateTime = this.noteModifiedDateTime;
        StringBuilder sbM127r = AbstractC0030c.m127r("NoteDetails(note=", str, ", updatedBy=", str2, ", noteModifiedDateTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    public /* synthetic */ NoteDetails(String str, String str2, LocalDateTime localDateTime, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : str, str2, localDateTime);
    }
}
