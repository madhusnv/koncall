package com.websoptimization.callyzerbiz.data.model.response;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallRecordingSuggestedPathResponse {

    @InterfaceC4485b("suggestedPaths")
    private final List<String> suggestedPaths;

    public CallRecordingSuggestedPathResponse(List<String> suggestedPaths) {
        AbstractC4154l.m8923f(suggestedPaths, "suggestedPaths");
        this.suggestedPaths = suggestedPaths;
    }

    /* renamed from: a */
    public final List m4765a() {
        return this.suggestedPaths;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallRecordingSuggestedPathResponse) && AbstractC4154l.m8918a(this.suggestedPaths, ((CallRecordingSuggestedPathResponse) obj).suggestedPaths);
    }

    public final int hashCode() {
        return this.suggestedPaths.hashCode();
    }

    public final String toString() {
        return m0.m7380m("CallRecordingSuggestedPathResponse(suggestedPaths=", ")", this.suggestedPaths);
    }
}
