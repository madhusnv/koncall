package com.websoptimization.callyzerbiz.data.model.request;

import a2.AbstractC0030c;
import ai.AbstractC0151h;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadNoteSaveRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7356b;

    @InterfaceC4485b("callBackTime")
    private final LocalDateTime callBackTime;

    @InterfaceC4485b("callLog")
    private final LeadCallLogNoteRequest callLog;

    @InterfaceC4485b("leadId")
    private final String leadId;

    @InterfaceC4485b("leadStatus")
    private final String leadStatus;

    @InterfaceC4485b("note")
    private final String note;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadNoteSaveRequest(C4802m userSimDetails, String leadId, String note, String leadStatus, LocalDateTime localDateTime, LeadCallLogNoteRequest callLog) {
        super(userSimDetails);
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        AbstractC4154l.m8923f(leadId, "leadId");
        AbstractC4154l.m8923f(note, "note");
        AbstractC4154l.m8923f(leadStatus, "leadStatus");
        AbstractC4154l.m8923f(callLog, "callLog");
        this.f7356b = userSimDetails;
        this.leadId = leadId;
        this.note = note;
        this.leadStatus = leadStatus;
        this.callBackTime = localDateTime;
        this.callLog = callLog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadNoteSaveRequest)) {
            return false;
        }
        LeadNoteSaveRequest leadNoteSaveRequest = (LeadNoteSaveRequest) obj;
        return AbstractC4154l.m8918a(this.f7356b, leadNoteSaveRequest.f7356b) && AbstractC4154l.m8918a(this.leadId, leadNoteSaveRequest.leadId) && AbstractC4154l.m8918a(this.note, leadNoteSaveRequest.note) && AbstractC4154l.m8918a(this.leadStatus, leadNoteSaveRequest.leadStatus) && AbstractC4154l.m8918a(this.callBackTime, leadNoteSaveRequest.callBackTime) && AbstractC4154l.m8918a(this.callLog, leadNoteSaveRequest.callLog);
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.f7356b.hashCode() * 31, 31, this.leadId), 31, this.note), 31, this.leadStatus);
        LocalDateTime localDateTime = this.callBackTime;
        return this.callLog.hashCode() + ((iM113d + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.leadId;
        String str2 = this.note;
        String str3 = this.leadStatus;
        LocalDateTime localDateTime = this.callBackTime;
        LeadCallLogNoteRequest leadCallLogNoteRequest = this.callLog;
        StringBuilder sb2 = new StringBuilder("LeadNoteSaveRequest(userSimDetails=");
        sb2.append(this.f7356b);
        sb2.append(", leadId=");
        sb2.append(str);
        sb2.append(", note=");
        a1.m14319B(sb2, str2, ", leadStatus=", str3, ", callBackTime=");
        sb2.append(localDateTime);
        sb2.append(", callLog=");
        sb2.append(leadCallLogNoteRequest);
        sb2.append(")");
        return sb2.toString();
    }
}
