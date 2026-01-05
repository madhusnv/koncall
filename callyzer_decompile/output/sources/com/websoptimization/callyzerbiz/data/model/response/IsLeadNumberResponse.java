package com.websoptimization.callyzerbiz.data.model.response;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class IsLeadNumberResponse {

    @InterfaceC4485b("verifiedNumbers")
    private final List<LeadVerifiedNumberResponse> leadNumbers;

    public IsLeadNumberResponse(List<LeadVerifiedNumberResponse> leadNumbers) {
        AbstractC4154l.m8923f(leadNumbers, "leadNumbers");
        this.leadNumbers = leadNumbers;
    }

    /* renamed from: a */
    public final List m4796a() {
        return this.leadNumbers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IsLeadNumberResponse) && AbstractC4154l.m8918a(this.leadNumbers, ((IsLeadNumberResponse) obj).leadNumbers);
    }

    public final int hashCode() {
        return this.leadNumbers.hashCode();
    }

    public final String toString() {
        return m0.m7380m("IsLeadNumberResponse(leadNumbers=", ")", this.leadNumbers);
    }
}
