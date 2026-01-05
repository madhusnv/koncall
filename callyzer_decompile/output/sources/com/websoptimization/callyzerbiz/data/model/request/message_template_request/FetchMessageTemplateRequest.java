package com.websoptimization.callyzerbiz.data.model.request.message_template_request;

import ai.AbstractC0151h;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchMessageTemplateRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7369b;

    @InterfaceC4485b("messageTemplateId")
    private final String messageTemplateId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchMessageTemplateRequest(String messageTemplateId, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.messageTemplateId = messageTemplateId;
        this.f7369b = userSimDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchMessageTemplateRequest)) {
            return false;
        }
        FetchMessageTemplateRequest fetchMessageTemplateRequest = (FetchMessageTemplateRequest) obj;
        return AbstractC4154l.m8918a(this.messageTemplateId, fetchMessageTemplateRequest.messageTemplateId) && AbstractC4154l.m8918a(this.f7369b, fetchMessageTemplateRequest.f7369b);
    }

    public final int hashCode() {
        return this.f7369b.hashCode() + (this.messageTemplateId.hashCode() * 31);
    }

    public final String toString() {
        return "FetchMessageTemplateRequest(messageTemplateId=" + this.messageTemplateId + ", userSimDetail=" + this.f7369b + ")";
    }
}
