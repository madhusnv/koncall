package com.websoptimization.callyzerbiz.data.model.response.message_template;

import a2.AbstractC0030c;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.i18n.MessageBundle;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class TemplateContentResponse {

    @InterfaceC4485b("createdDateTime")
    private LocalDateTime createdDateTime;

    @InterfaceC4485b("description")
    private String description;

    @InterfaceC4485b("instruction")
    private String instruction;

    @InterfaceC4485b("submessageTemplateId")
    private String subMessageTemplateId;

    @InterfaceC4485b(MessageBundle.TITLE_ENTRY)
    private String title;

    public TemplateContentResponse(String subMessageTemplateId, String title, String str, String description, LocalDateTime createdDateTime) {
        AbstractC4154l.m8923f(subMessageTemplateId, "subMessageTemplateId");
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(description, "description");
        AbstractC4154l.m8923f(createdDateTime, "createdDateTime");
        this.subMessageTemplateId = subMessageTemplateId;
        this.title = title;
        this.instruction = str;
        this.description = description;
        this.createdDateTime = createdDateTime;
    }

    /* renamed from: a */
    public final LocalDateTime m4994a() {
        return this.createdDateTime;
    }

    /* renamed from: b */
    public final String m4995b() {
        return this.description;
    }

    /* renamed from: c */
    public final String m4996c() {
        return this.instruction;
    }

    /* renamed from: d */
    public final String m4997d() {
        return this.subMessageTemplateId;
    }

    /* renamed from: e */
    public final String m4998e() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateContentResponse)) {
            return false;
        }
        TemplateContentResponse templateContentResponse = (TemplateContentResponse) obj;
        return AbstractC4154l.m8918a(this.subMessageTemplateId, templateContentResponse.subMessageTemplateId) && AbstractC4154l.m8918a(this.title, templateContentResponse.title) && AbstractC4154l.m8918a(this.instruction, templateContentResponse.instruction) && AbstractC4154l.m8918a(this.description, templateContentResponse.description) && AbstractC4154l.m8918a(this.createdDateTime, templateContentResponse.createdDateTime);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(this.subMessageTemplateId.hashCode() * 31, 31, this.title);
        String str = this.instruction;
        return this.createdDateTime.hashCode() + AbstractC0030c.m113d((iM113d + (str == null ? 0 : str.hashCode())) * 31, 31, this.description);
    }

    public final String toString() {
        String str = this.subMessageTemplateId;
        String str2 = this.title;
        String str3 = this.instruction;
        String str4 = this.description;
        LocalDateTime localDateTime = this.createdDateTime;
        StringBuilder sbM127r = AbstractC0030c.m127r("TemplateContentResponse(subMessageTemplateId=", str, ", title=", str2, ", instruction=");
        a1.m14319B(sbM127r, str3, ", description=", str4, ", createdDateTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(")");
        return sbM127r.toString();
    }

    public /* synthetic */ TemplateContentResponse(String str, String str2, String str3, String str4, LocalDateTime localDateTime, int i10, AbstractC4148f abstractC4148f) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, str4, localDateTime);
    }
}
