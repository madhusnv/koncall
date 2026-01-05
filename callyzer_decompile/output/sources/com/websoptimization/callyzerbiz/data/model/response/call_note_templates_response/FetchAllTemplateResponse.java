package com.websoptimization.callyzerbiz.data.model.response.call_note_templates_response;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchAllTemplateResponse {

    @InterfaceC4485b("pageNo")
    private final int pageNo;

    @InterfaceC4485b("pageSize")
    private final int pageSize;

    @InterfaceC4485b("templates")
    private List<TemplateResponse> templates;

    @InterfaceC4485b("total")
    private final int totalSize;

    public FetchAllTemplateResponse(List<TemplateResponse> templates, int i10, int i11, int i12) {
        AbstractC4154l.m8923f(templates, "templates");
        this.templates = templates;
        this.pageNo = i10;
        this.pageSize = i11;
        this.totalSize = i12;
    }

    /* renamed from: a */
    public final List m4848a() {
        return this.templates;
    }

    /* renamed from: b */
    public final int m4849b() {
        return this.totalSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchAllTemplateResponse)) {
            return false;
        }
        FetchAllTemplateResponse fetchAllTemplateResponse = (FetchAllTemplateResponse) obj;
        return AbstractC4154l.m8918a(this.templates, fetchAllTemplateResponse.templates) && this.pageNo == fetchAllTemplateResponse.pageNo && this.pageSize == fetchAllTemplateResponse.pageSize && this.totalSize == fetchAllTemplateResponse.totalSize;
    }

    public final int hashCode() {
        return Integer.hashCode(this.totalSize) + AbstractC1452a.m4556c(this.pageSize, AbstractC1452a.m4556c(this.pageNo, this.templates.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FetchAllTemplateResponse(templates=" + this.templates + ", pageNo=" + this.pageNo + ", pageSize=" + this.pageSize + ", totalSize=" + this.totalSize + ")";
    }
}
