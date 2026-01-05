package com.websoptimization.callyzerbiz.data.model.response.call_note_templates_response;

import a2.AbstractC0030c;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.i18n.MessageBundle;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class TemplateResponse {

    @InterfaceC4485b("createdDateTime")
    private final LocalDateTime createdDateTime;

    @InterfaceC4485b("description")
    private final String description;

    @InterfaceC4485b("modifyDateTime")
    private final LocalDateTime modifyDateTime;

    @InterfaceC4485b("noteTemplateId")
    private String noteTemplateId;

    @InterfaceC4485b("templateType")
    private final String templateType;

    @InterfaceC4485b(MessageBundle.TITLE_ENTRY)
    private final String title;

    public TemplateResponse(String title, String description, LocalDateTime createdDateTime, LocalDateTime localDateTime, String templateType, String noteTemplateId) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        AbstractC4154l.m8923f(createdDateTime, "createdDateTime");
        AbstractC4154l.m8923f(templateType, "templateType");
        AbstractC4154l.m8923f(noteTemplateId, "noteTemplateId");
        this.title = title;
        this.description = description;
        this.createdDateTime = createdDateTime;
        this.modifyDateTime = localDateTime;
        this.templateType = templateType;
        this.noteTemplateId = noteTemplateId;
    }

    /* renamed from: a */
    public final LocalDateTime m4850a() {
        return this.createdDateTime;
    }

    /* renamed from: b */
    public final String m4851b() {
        return this.description;
    }

    /* renamed from: c */
    public final LocalDateTime m4852c() {
        return this.modifyDateTime;
    }

    /* renamed from: d */
    public final String m4853d() {
        return this.noteTemplateId;
    }

    /* renamed from: e */
    public final String m4854e() {
        return this.templateType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateResponse)) {
            return false;
        }
        TemplateResponse templateResponse = (TemplateResponse) obj;
        return AbstractC4154l.m8918a(this.title, templateResponse.title) && AbstractC4154l.m8918a(this.description, templateResponse.description) && AbstractC4154l.m8918a(this.createdDateTime, templateResponse.createdDateTime) && AbstractC4154l.m8918a(this.modifyDateTime, templateResponse.modifyDateTime) && AbstractC4154l.m8918a(this.templateType, templateResponse.templateType) && AbstractC4154l.m8918a(this.noteTemplateId, templateResponse.noteTemplateId);
    }

    /* renamed from: f */
    public final String m4855f() {
        return this.title;
    }

    public final int hashCode() {
        int iM7370c = m0.m7370c(this.createdDateTime, AbstractC0030c.m113d(this.title.hashCode() * 31, 31, this.description), 31);
        LocalDateTime localDateTime = this.modifyDateTime;
        return this.noteTemplateId.hashCode() + AbstractC0030c.m113d((iM7370c + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31, 31, this.templateType);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.description;
        LocalDateTime localDateTime = this.createdDateTime;
        LocalDateTime localDateTime2 = this.modifyDateTime;
        String str3 = this.templateType;
        String str4 = this.noteTemplateId;
        StringBuilder sbM127r = AbstractC0030c.m127r("TemplateResponse(title=", str, ", description=", str2, ", createdDateTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(", modifyDateTime=");
        sbM127r.append(localDateTime2);
        sbM127r.append(", templateType=");
        return AbstractC0030c.m124o(sbM127r, str3, ", noteTemplateId=", str4, ")");
    }
}
