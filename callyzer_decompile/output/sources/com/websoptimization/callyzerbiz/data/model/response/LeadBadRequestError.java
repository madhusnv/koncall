package com.websoptimization.callyzerbiz.data.model.response;

import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadBadRequestError {

    @InterfaceC4485b("errorMessage")
    private String errorMessage;

    @InterfaceC4485b("modelName")
    private String modelName;

    public LeadBadRequestError(String modelName, String errorMessage) {
        AbstractC4154l.m8923f(modelName, "modelName");
        AbstractC4154l.m8923f(errorMessage, "errorMessage");
        this.modelName = modelName;
        this.errorMessage = errorMessage;
    }

    /* renamed from: a */
    public final String m4797a() {
        return this.errorMessage;
    }

    /* renamed from: b */
    public final String m4798b() {
        return this.modelName;
    }
}
