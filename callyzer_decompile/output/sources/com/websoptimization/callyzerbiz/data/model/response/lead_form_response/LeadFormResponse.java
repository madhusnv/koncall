package com.websoptimization.callyzerbiz.data.model.response.lead_form_response;

import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadFormResponse {

    @InterfaceC4485b("dynamicComponents")
    private final DynamicComponents dynamicComponents;

    @InterfaceC4485b("versionId")
    private final String versionId;

    public LeadFormResponse(String versionId, DynamicComponents dynamicComponents) {
        AbstractC4154l.m8923f(versionId, "versionId");
        AbstractC4154l.m8923f(dynamicComponents, "dynamicComponents");
        this.versionId = versionId;
        this.dynamicComponents = dynamicComponents;
    }

    /* renamed from: a */
    public final DynamicComponents m4971a() {
        return this.dynamicComponents;
    }

    /* renamed from: b */
    public final String m4972b() {
        return this.versionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormResponse)) {
            return false;
        }
        LeadFormResponse leadFormResponse = (LeadFormResponse) obj;
        return AbstractC4154l.m8918a(this.versionId, leadFormResponse.versionId) && AbstractC4154l.m8918a(this.dynamicComponents, leadFormResponse.dynamicComponents);
    }

    public final int hashCode() {
        return this.dynamicComponents.hashCode() + (this.versionId.hashCode() * 31);
    }

    public final String toString() {
        return "LeadFormResponse(versionId=" + this.versionId + ", dynamicComponents=" + this.dynamicComponents + ")";
    }
}
