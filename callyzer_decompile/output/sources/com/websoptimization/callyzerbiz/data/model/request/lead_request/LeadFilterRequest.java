package com.websoptimization.callyzerbiz.data.model.request.lead_request;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class LeadFilterRequest {

    @InterfaceC4485b("dynamicProperties")
    private Map<String, ? extends Object> dynamicProperties;

    @InterfaceC4485b("staticProperties")
    private StaticProperties staticProperties;

    public LeadFilterRequest(StaticProperties staticProperties, Map<String, ? extends Object> map) {
        this.staticProperties = staticProperties;
        this.dynamicProperties = map;
    }

    /* renamed from: a */
    public static LeadFilterRequest m4697a(LeadFilterRequest leadFilterRequest, StaticProperties staticProperties) {
        Map<String, ? extends Object> map = leadFilterRequest.dynamicProperties;
        leadFilterRequest.getClass();
        return new LeadFilterRequest(staticProperties, map);
    }

    /* renamed from: b */
    public final Map m4698b() {
        return this.dynamicProperties;
    }

    /* renamed from: c */
    public final StaticProperties m4699c() {
        return this.staticProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFilterRequest)) {
            return false;
        }
        LeadFilterRequest leadFilterRequest = (LeadFilterRequest) obj;
        return AbstractC4154l.m8918a(this.staticProperties, leadFilterRequest.staticProperties) && AbstractC4154l.m8918a(this.dynamicProperties, leadFilterRequest.dynamicProperties);
    }

    public final int hashCode() {
        StaticProperties staticProperties = this.staticProperties;
        int iHashCode = (staticProperties == null ? 0 : staticProperties.hashCode()) * 31;
        Map<String, ? extends Object> map = this.dynamicProperties;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "LeadFilterRequest(staticProperties=" + this.staticProperties + ", dynamicProperties=" + this.dynamicProperties + ")";
    }

    public /* synthetic */ LeadFilterRequest(StaticProperties staticProperties, Map map, int i10, AbstractC4148f abstractC4148f) {
        this((i10 & 1) != 0 ? null : staticProperties, map);
    }
}
