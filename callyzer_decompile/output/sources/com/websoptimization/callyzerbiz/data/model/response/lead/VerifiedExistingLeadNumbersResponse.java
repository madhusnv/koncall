package com.websoptimization.callyzerbiz.data.model.response.lead;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class VerifiedExistingLeadNumbersResponse {

    @InterfaceC4485b("verifiedNumbers")
    private final List<VerifiedExistingLeadNumbers> verifiedExistingLeadNumbers;

    public VerifiedExistingLeadNumbersResponse(List<VerifiedExistingLeadNumbers> verifiedExistingLeadNumbers) {
        AbstractC4154l.m8923f(verifiedExistingLeadNumbers, "verifiedExistingLeadNumbers");
        this.verifiedExistingLeadNumbers = verifiedExistingLeadNumbers;
    }

    /* renamed from: a */
    public final List m4936a() {
        return this.verifiedExistingLeadNumbers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerifiedExistingLeadNumbersResponse) && AbstractC4154l.m8918a(this.verifiedExistingLeadNumbers, ((VerifiedExistingLeadNumbersResponse) obj).verifiedExistingLeadNumbers);
    }

    public final int hashCode() {
        return this.verifiedExistingLeadNumbers.hashCode();
    }

    public final String toString() {
        return m0.m7380m("VerifiedExistingLeadNumbersResponse(verifiedExistingLeadNumbers=", ")", this.verifiedExistingLeadNumbers);
    }
}
