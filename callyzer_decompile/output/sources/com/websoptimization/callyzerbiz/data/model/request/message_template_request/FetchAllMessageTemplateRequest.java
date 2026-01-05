package com.websoptimization.callyzerbiz.data.model.request.message_template_request;

import ai.AbstractC0151h;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchAllMessageTemplateRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7368b;

    @InterfaceC4485b("lastSyncedTime")
    private final LocalDateTime lastSyncedTime;

    @InterfaceC4485b("pageNo")
    private final int pageNo;

    @InterfaceC4485b("pageSize")
    private final int pageSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchAllMessageTemplateRequest(LocalDateTime localDateTime, int i10, int i11, C4802m userSimDetail) {
        super(userSimDetail);
        AbstractC4154l.m8923f(userSimDetail, "userSimDetail");
        this.lastSyncedTime = localDateTime;
        this.pageNo = i10;
        this.pageSize = i11;
        this.f7368b = userSimDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchAllMessageTemplateRequest)) {
            return false;
        }
        FetchAllMessageTemplateRequest fetchAllMessageTemplateRequest = (FetchAllMessageTemplateRequest) obj;
        return AbstractC4154l.m8918a(this.lastSyncedTime, fetchAllMessageTemplateRequest.lastSyncedTime) && this.pageNo == fetchAllMessageTemplateRequest.pageNo && this.pageSize == fetchAllMessageTemplateRequest.pageSize && AbstractC4154l.m8918a(this.f7368b, fetchAllMessageTemplateRequest.f7368b);
    }

    public final int hashCode() {
        LocalDateTime localDateTime = this.lastSyncedTime;
        return this.f7368b.hashCode() + AbstractC1452a.m4556c(this.pageSize, AbstractC1452a.m4556c(this.pageNo, (localDateTime == null ? 0 : localDateTime.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "FetchAllMessageTemplateRequest(lastSyncedTime=" + this.lastSyncedTime + ", pageNo=" + this.pageNo + ", pageSize=" + this.pageSize + ", userSimDetail=" + this.f7368b + ")";
    }
}
