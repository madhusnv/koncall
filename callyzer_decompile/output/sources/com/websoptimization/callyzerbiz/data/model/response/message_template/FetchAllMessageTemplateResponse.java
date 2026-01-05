package com.websoptimization.callyzerbiz.data.model.response.message_template;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchAllMessageTemplateResponse {

    @InterfaceC4485b("pageNo")
    private final int pageNo;

    @InterfaceC4485b("pageSize")
    private final int pageSize;

    @InterfaceC4485b("templates")
    private final List<MessageTemplateResponse> templates;

    @InterfaceC4485b("total")
    private final int total;

    public FetchAllMessageTemplateResponse(List<MessageTemplateResponse> templates, int i10, int i11, int i12) {
        AbstractC4154l.m8923f(templates, "templates");
        this.templates = templates;
        this.total = i10;
        this.pageNo = i11;
        this.pageSize = i12;
    }

    /* renamed from: a */
    public final List m4984a() {
        return this.templates;
    }

    /* renamed from: b */
    public final int m4985b() {
        return this.total;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchAllMessageTemplateResponse)) {
            return false;
        }
        FetchAllMessageTemplateResponse fetchAllMessageTemplateResponse = (FetchAllMessageTemplateResponse) obj;
        return AbstractC4154l.m8918a(this.templates, fetchAllMessageTemplateResponse.templates) && this.total == fetchAllMessageTemplateResponse.total && this.pageNo == fetchAllMessageTemplateResponse.pageNo && this.pageSize == fetchAllMessageTemplateResponse.pageSize;
    }

    public final int hashCode() {
        return Integer.hashCode(this.pageSize) + AbstractC1452a.m4556c(this.pageNo, AbstractC1452a.m4556c(this.total, this.templates.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FetchAllMessageTemplateResponse(templates=" + this.templates + ", total=" + this.total + ", pageNo=" + this.pageNo + ", pageSize=" + this.pageSize + ")";
    }
}
