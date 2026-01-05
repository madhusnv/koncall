package com.websoptimization.callyzerbiz.data.model.request.note_template_request;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.i18n.MessageBundle;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class TemplateRequest {

    @InterfaceC4485b("appNoteTemplateId")
    private final String appNoteTemplateId;

    @InterfaceC4485b("description")
    private final String description;

    @InterfaceC4485b("modifyDateTime")
    private final LocalDateTime modifyDateTime;

    @InterfaceC4485b("noteTemplateId")
    private final String noteTemplateId;

    @InterfaceC4485b(MessageBundle.TITLE_ENTRY)
    private final String title;

    public TemplateRequest(String title, String description, LocalDateTime localDateTime, String appNoteTemplateId, String noteTemplateId) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        AbstractC4154l.m8923f(appNoteTemplateId, "appNoteTemplateId");
        AbstractC4154l.m8923f(noteTemplateId, "noteTemplateId");
        this.title = title;
        this.description = description;
        this.modifyDateTime = localDateTime;
        this.appNoteTemplateId = appNoteTemplateId;
        this.noteTemplateId = noteTemplateId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateRequest)) {
            return false;
        }
        TemplateRequest templateRequest = (TemplateRequest) obj;
        return AbstractC4154l.m8918a(this.title, templateRequest.title) && AbstractC4154l.m8918a(this.description, templateRequest.description) && AbstractC4154l.m8918a(this.modifyDateTime, templateRequest.modifyDateTime) && AbstractC4154l.m8918a(this.appNoteTemplateId, templateRequest.appNoteTemplateId) && AbstractC4154l.m8918a(this.noteTemplateId, templateRequest.noteTemplateId);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(this.title.hashCode() * 31, 31, this.description);
        LocalDateTime localDateTime = this.modifyDateTime;
        return this.noteTemplateId.hashCode() + AbstractC0030c.m113d((iM113d + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31, 31, this.appNoteTemplateId);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.description;
        LocalDateTime localDateTime = this.modifyDateTime;
        String str3 = this.appNoteTemplateId;
        String str4 = this.noteTemplateId;
        StringBuilder sbM127r = AbstractC0030c.m127r("TemplateRequest(title=", str, ", description=", str2, ", modifyDateTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(", appNoteTemplateId=");
        sbM127r.append(str3);
        sbM127r.append(", noteTemplateId=");
        return AbstractC1452a.m4564k(sbM127r, str4, ")");
    }
}
