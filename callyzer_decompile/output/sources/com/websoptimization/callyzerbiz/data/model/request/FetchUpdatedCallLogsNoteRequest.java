package com.websoptimization.callyzerbiz.data.model.request;

import ai.AbstractC0151h;
import i0.m0;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import mm.C4802m;
import ym.InterfaceC8701l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FetchUpdatedCallLogsNoteRequest extends AbstractC0151h {

    /* renamed from: b */
    public final C4802m f7350b;

    @InterfaceC8701l
    @InterfaceC4485b("fromDateTime")
    private final LocalDateTime fromDateTime;

    @InterfaceC8701l
    @InterfaceC4485b("toDateTime")
    private final LocalDateTime toDateTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchUpdatedCallLogsNoteRequest(C4802m userSimDetails, LocalDateTime fromDateTime, LocalDateTime toDateTime) {
        super(userSimDetails);
        AbstractC4154l.m8923f(userSimDetails, "userSimDetails");
        AbstractC4154l.m8923f(fromDateTime, "fromDateTime");
        AbstractC4154l.m8923f(toDateTime, "toDateTime");
        this.f7350b = userSimDetails;
        this.fromDateTime = fromDateTime;
        this.toDateTime = toDateTime;
    }

    /* renamed from: N */
    public final LocalDateTime m4659N() {
        return this.fromDateTime;
    }

    /* renamed from: O */
    public final LocalDateTime m4660O() {
        return this.toDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchUpdatedCallLogsNoteRequest)) {
            return false;
        }
        FetchUpdatedCallLogsNoteRequest fetchUpdatedCallLogsNoteRequest = (FetchUpdatedCallLogsNoteRequest) obj;
        return AbstractC4154l.m8918a(this.f7350b, fetchUpdatedCallLogsNoteRequest.f7350b) && AbstractC4154l.m8918a(this.fromDateTime, fetchUpdatedCallLogsNoteRequest.fromDateTime) && AbstractC4154l.m8918a(this.toDateTime, fetchUpdatedCallLogsNoteRequest.toDateTime);
    }

    public final int hashCode() {
        return this.toDateTime.hashCode() + m0.m7370c(this.fromDateTime, this.f7350b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FetchUpdatedCallLogsNoteRequest(userSimDetails=" + this.f7350b + ", fromDateTime=" + this.fromDateTime + ", toDateTime=" + this.toDateTime + ")";
    }
}
