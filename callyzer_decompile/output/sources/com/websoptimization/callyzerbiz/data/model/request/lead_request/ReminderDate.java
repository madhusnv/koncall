package com.websoptimization.callyzerbiz.data.model.request.lead_request;

import j$.time.LocalDate;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class ReminderDate {

    @InterfaceC4485b("dateCondition")
    private final String dateCondition;

    @InterfaceC4485b("endDate")
    private final LocalDate endDate;

    @InterfaceC4485b("startDate")
    private final LocalDate startDate;

    public ReminderDate() {
        this(null, null, null, 7, null);
    }

    /* renamed from: a */
    public final LocalDate m4700a() {
        return this.endDate;
    }

    /* renamed from: b */
    public final LocalDate m4701b() {
        return this.startDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderDate)) {
            return false;
        }
        ReminderDate reminderDate = (ReminderDate) obj;
        return AbstractC4154l.m8918a(this.dateCondition, reminderDate.dateCondition) && AbstractC4154l.m8918a(this.startDate, reminderDate.startDate) && AbstractC4154l.m8918a(this.endDate, reminderDate.endDate);
    }

    public final int hashCode() {
        String str = this.dateCondition;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalDate localDate = this.startDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.endDate;
        return iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public final String toString() {
        return "ReminderDate(dateCondition=" + this.dateCondition + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
    }

    public ReminderDate(String str, LocalDate localDate, LocalDate localDate2) {
        this.dateCondition = str;
        this.startDate = localDate;
        this.endDate = localDate2;
    }

    public /* synthetic */ ReminderDate(String str, LocalDate localDate, LocalDate localDate2, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : localDate, (i10 & 4) != 0 ? null : localDate2);
    }
}
