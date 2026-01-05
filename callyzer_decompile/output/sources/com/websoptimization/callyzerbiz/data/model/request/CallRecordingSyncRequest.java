package com.websoptimization.callyzerbiz.data.model.request;

import ai.AbstractC0151h;
import com.websoptimization.callyzerbiz.data.model.db.SyncCallLogCallRecording;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallRecordingSyncRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7346b;

    @InterfaceC4485b("callLogs")
    private final List<SyncCallLogCallRecording> callLogs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRecordingSyncRequest(C4802m userSimDetails, List<SyncCallLogCallRecording> callLogs) {
        super(userSimDetails);
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        AbstractC4154l.m8923f(callLogs, "callLogs");
        this.f7346b = userSimDetails;
        this.callLogs = callLogs;
    }

    /* renamed from: N */
    public final List m4643N() {
        return this.callLogs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallRecordingSyncRequest)) {
            return false;
        }
        CallRecordingSyncRequest callRecordingSyncRequest = (CallRecordingSyncRequest) obj;
        return AbstractC4154l.m8918a(this.f7346b, callRecordingSyncRequest.f7346b) && AbstractC4154l.m8918a(this.callLogs, callRecordingSyncRequest.callLogs);
    }

    public final int hashCode() {
        return this.callLogs.hashCode() + (this.f7346b.hashCode() * 31);
    }

    public final String toString() {
        return "CallRecordingSyncRequest(userSimDetails=" + this.f7346b + ", callLogs=" + this.callLogs + ")";
    }
}
