package com.websoptimization.callyzerbiz.data.model.response.message_template;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class MessageTemplateResponse {

    @InterfaceC4485b("createdDateTime")
    private LocalDateTime createdDateTime;

    @InterfaceC4485b("documents")
    private List<Documents> documents;

    @InterfaceC4485b("messageTemplateId")
    private String messageTemplateId;

    @InterfaceC4485b("modifyDateTime")
    private LocalDateTime modifyDateTime;

    @InterfaceC4485b("subTemplates")
    private List<TemplateContentResponse> subTemplates;

    @InterfaceC4485b("tags")
    private List<String> tags;

    @InterfaceC4485b(MessageBundle.TITLE_ENTRY)
    private String title;

    public MessageTemplateResponse(String title, String messageTemplateId, LocalDateTime createdDateTime, LocalDateTime localDateTime, List<TemplateContentResponse> subTemplates, List<Documents> list, List<String> tags) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        AbstractC4154l.m8923f(createdDateTime, "createdDateTime");
        AbstractC4154l.m8923f(subTemplates, "subTemplates");
        AbstractC4154l.m8923f(tags, "tags");
        this.title = title;
        this.messageTemplateId = messageTemplateId;
        this.createdDateTime = createdDateTime;
        this.modifyDateTime = localDateTime;
        this.subTemplates = subTemplates;
        this.documents = list;
        this.tags = tags;
    }

    /* renamed from: a */
    public final LocalDateTime m4987a() {
        return this.createdDateTime;
    }

    /* renamed from: b */
    public final List m4988b() {
        return this.documents;
    }

    /* renamed from: c */
    public final String m4989c() {
        return this.messageTemplateId;
    }

    /* renamed from: d */
    public final LocalDateTime m4990d() {
        return this.modifyDateTime;
    }

    /* renamed from: e */
    public final List m4991e() {
        return this.subTemplates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTemplateResponse)) {
            return false;
        }
        MessageTemplateResponse messageTemplateResponse = (MessageTemplateResponse) obj;
        return AbstractC4154l.m8918a(this.title, messageTemplateResponse.title) && AbstractC4154l.m8918a(this.messageTemplateId, messageTemplateResponse.messageTemplateId) && AbstractC4154l.m8918a(this.createdDateTime, messageTemplateResponse.createdDateTime) && AbstractC4154l.m8918a(this.modifyDateTime, messageTemplateResponse.modifyDateTime) && AbstractC4154l.m8918a(this.subTemplates, messageTemplateResponse.subTemplates) && AbstractC4154l.m8918a(this.documents, messageTemplateResponse.documents) && AbstractC4154l.m8918a(this.tags, messageTemplateResponse.tags);
    }

    /* renamed from: f */
    public final List m4992f() {
        return this.tags;
    }

    /* renamed from: g */
    public final String m4993g() {
        return this.title;
    }

    public final int hashCode() {
        int iM7370c = m0.m7370c(this.createdDateTime, AbstractC0030c.m113d(this.title.hashCode() * 31, 31, this.messageTemplateId), 31);
        LocalDateTime localDateTime = this.modifyDateTime;
        int iM4559f = AbstractC1452a.m4559f(this.subTemplates, (iM7370c + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31, 31);
        List<Documents> list = this.documents;
        return this.tags.hashCode() + ((iM4559f + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.messageTemplateId;
        LocalDateTime localDateTime = this.createdDateTime;
        LocalDateTime localDateTime2 = this.modifyDateTime;
        List<TemplateContentResponse> list = this.subTemplates;
        List<Documents> list2 = this.documents;
        List<String> list3 = this.tags;
        StringBuilder sbM127r = AbstractC0030c.m127r("MessageTemplateResponse(title=", str, ", messageTemplateId=", str2, ", createdDateTime=");
        sbM127r.append(localDateTime);
        sbM127r.append(", modifyDateTime=");
        sbM127r.append(localDateTime2);
        sbM127r.append(", subTemplates=");
        sbM127r.append(list);
        sbM127r.append(", documents=");
        sbM127r.append(list2);
        sbM127r.append(", tags=");
        return AbstractC5601a.m11240k(")", sbM127r, list3);
    }
}
