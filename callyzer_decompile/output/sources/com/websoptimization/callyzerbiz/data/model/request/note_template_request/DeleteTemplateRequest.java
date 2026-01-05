package com.websoptimization.callyzerbiz.data.model.request.note_template_request;

import ai.AbstractC0151h;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class DeleteTemplateRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7370b;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC4485b("id")
    private final List<String> f44165id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteTemplateRequest(List<String> id2, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(id2, "id");
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.f44165id = id2;
        this.f7370b = userSimDetail;
    }

    /* renamed from: N */
    public final List m4712N() {
        return this.f44165id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteTemplateRequest)) {
            return false;
        }
        DeleteTemplateRequest deleteTemplateRequest = (DeleteTemplateRequest) obj;
        return AbstractC4154l.m8918a(this.f44165id, deleteTemplateRequest.f44165id) && AbstractC4154l.m8918a(this.f7370b, deleteTemplateRequest.f7370b);
    }

    public final int hashCode() {
        return this.f7370b.hashCode() + (this.f44165id.hashCode() * 31);
    }

    public final String toString() {
        return "DeleteTemplateRequest(id=" + this.f44165id + ", userSimDetail=" + this.f7370b + ")";
    }
}
