package com.websoptimization.callyzerbiz.data.model.request.lead_request;

import j$.time.LocalDate;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CreatedDate {

    @InterfaceC4485b("endDate")
    private final LocalDate endDate;

    @InterfaceC4485b("startDate")
    private final LocalDate startDate;

    /* JADX WARN: Multi-variable type inference failed */
    public CreatedDate() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: a */
    public final LocalDate m4695a() {
        return this.endDate;
    }

    /* renamed from: b */
    public final LocalDate m4696b() {
        return this.startDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatedDate)) {
            return false;
        }
        CreatedDate createdDate = (CreatedDate) obj;
        return AbstractC4154l.m8918a(this.startDate, createdDate.startDate) && AbstractC4154l.m8918a(this.endDate, createdDate.endDate);
    }

    public final int hashCode() {
        LocalDate localDate = this.startDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.endDate;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public final String toString() {
        return "CreatedDate(startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
    }

    public CreatedDate(LocalDate localDate, LocalDate localDate2) {
        this.startDate = localDate;
        this.endDate = localDate2;
    }

    public /* synthetic */ CreatedDate(LocalDate localDate, LocalDate localDate2, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : localDate, (i10 & 2) != 0 ? null : localDate2);
    }
}
