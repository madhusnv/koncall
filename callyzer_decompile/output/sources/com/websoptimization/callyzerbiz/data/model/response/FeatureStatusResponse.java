package com.websoptimization.callyzerbiz.data.model.response;

import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FeatureStatusResponse {

    @InterfaceC4485b("callRecording")
    private final boolean callRecording;

    @InterfaceC4485b("callSync")
    private final boolean callSync;

    @InterfaceC4485b("lead")
    private final boolean lead;

    public FeatureStatusResponse(boolean z6, boolean z10, boolean z11) {
        this.callSync = z6;
        this.lead = z10;
        this.callRecording = z11;
    }

    /* renamed from: a */
    public final boolean m4781a() {
        return this.callRecording;
    }

    /* renamed from: b */
    public final boolean m4782b() {
        return this.callSync;
    }

    /* renamed from: c */
    public final boolean m4783c() {
        return this.lead;
    }
}
