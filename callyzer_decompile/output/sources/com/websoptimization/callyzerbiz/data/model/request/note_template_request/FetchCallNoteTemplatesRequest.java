package com.websoptimization.callyzerbiz.data.model.request.note_template_request;

import ai.AbstractC0151h;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchCallNoteTemplatesRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7371b;

    @InterfaceC4485b("lastSyncedTime")
    private final LocalDateTime lastSyncedTime;

    @InterfaceC4485b("pageNo")
    private final int pageNo;

    @InterfaceC4485b("pageSize")
    private final int pageSize;

    @InterfaceC4485b("templateType")
    private final String templateType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchCallNoteTemplatesRequest(String str, LocalDateTime localDateTime, int i10, int i11, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.templateType = str;
        this.lastSyncedTime = localDateTime;
        this.pageNo = i10;
        this.pageSize = i11;
        this.f7371b = userSimDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchCallNoteTemplatesRequest)) {
            return false;
        }
        FetchCallNoteTemplatesRequest fetchCallNoteTemplatesRequest = (FetchCallNoteTemplatesRequest) obj;
        return AbstractC4154l.m8918a(this.templateType, fetchCallNoteTemplatesRequest.templateType) && AbstractC4154l.m8918a(this.lastSyncedTime, fetchCallNoteTemplatesRequest.lastSyncedTime) && this.pageNo == fetchCallNoteTemplatesRequest.pageNo && this.pageSize == fetchCallNoteTemplatesRequest.pageSize && AbstractC4154l.m8918a(this.f7371b, fetchCallNoteTemplatesRequest.f7371b);
    }

    public final int hashCode() {
        String str = this.templateType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalDateTime localDateTime = this.lastSyncedTime;
        return this.f7371b.hashCode() + AbstractC1452a.m4556c(this.pageSize, AbstractC1452a.m4556c(this.pageNo, (iHashCode + (localDateTime != null ? localDateTime.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "FetchCallNoteTemplatesRequest(templateType=" + this.templateType + ", lastSyncedTime=" + this.lastSyncedTime + ", pageNo=" + this.pageNo + ", pageSize=" + this.pageSize + ", userSimDetail=" + this.f7371b + ")";
    }
}
