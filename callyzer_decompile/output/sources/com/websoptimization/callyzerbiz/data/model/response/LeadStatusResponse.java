package com.websoptimization.callyzerbiz.data.model.response;

import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadStatusResponse {

    @InterfaceC4485b("isReminderMandatory")
    private final boolean isReminderMandatory;

    @InterfaceC4485b("leadStatus")
    private final String leadStatus;

    public LeadStatusResponse(String leadStatus, boolean z6) {
        AbstractC4154l.m8923f(leadStatus, "leadStatus");
        this.leadStatus = leadStatus;
        this.isReminderMandatory = z6;
    }

    /* renamed from: a */
    public final String m4818a() {
        return this.leadStatus;
    }

    /* renamed from: b */
    public final boolean m4819b() {
        return this.isReminderMandatory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadStatusResponse)) {
            return false;
        }
        LeadStatusResponse leadStatusResponse = (LeadStatusResponse) obj;
        return AbstractC4154l.m8918a(this.leadStatus, leadStatusResponse.leadStatus) && this.isReminderMandatory == leadStatusResponse.isReminderMandatory;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isReminderMandatory) + (this.leadStatus.hashCode() * 31);
    }

    public final String toString() {
        return "LeadStatusResponse(leadStatus=" + this.leadStatus + ", isReminderMandatory=" + this.isReminderMandatory + ")";
    }
}
