package com.websoptimization.callyzerbiz.data.model.request;

import ai.AbstractC0151h;
import com.websoptimization.callyzerbiz.data.model.db.SyncCallLogNote;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class NotesSyncRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7359b;

    @InterfaceC4485b("callLogs")
    private final List<SyncCallLogNote> callLogs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotesSyncRequest(C4802m userSimDetails, List<SyncCallLogNote> callLogs) {
        super(userSimDetails);
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        AbstractC4154l.m8923f(callLogs, "callLogs");
        this.f7359b = userSimDetails;
        this.callLogs = callLogs;
    }

    /* renamed from: N */
    public final List m4680N() {
        return this.callLogs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotesSyncRequest)) {
            return false;
        }
        NotesSyncRequest notesSyncRequest = (NotesSyncRequest) obj;
        return AbstractC4154l.m8918a(this.f7359b, notesSyncRequest.f7359b) && AbstractC4154l.m8918a(this.callLogs, notesSyncRequest.callLogs);
    }

    public final int hashCode() {
        return this.callLogs.hashCode() + (this.f7359b.hashCode() * 31);
    }

    public final String toString() {
        return "NotesSyncRequest(userSimDetails=" + this.f7359b + ", callLogs=" + this.callLogs + ")";
    }
}
