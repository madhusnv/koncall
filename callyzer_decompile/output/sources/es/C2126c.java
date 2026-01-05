package es;

import com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.DynamicFieldResponse;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: es.c */
/* loaded from: classes3.dex */
public final class C2126c {

    /* renamed from: a */
    public final EnumC2125b f9926a;

    /* renamed from: b */
    public final DynamicFieldResponse f9927b;

    public C2126c(EnumC2125b type, DynamicFieldResponse dynamicFieldResponse) {
        AbstractC4154l.m8923f(type, "type");
        this.f9926a = type;
        this.f9927b = dynamicFieldResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2126c)) {
            return false;
        }
        C2126c c2126c = (C2126c) obj;
        return this.f9926a == c2126c.f9926a && AbstractC4154l.m8918a(this.f9927b, c2126c.f9927b);
    }

    public final int hashCode() {
        return this.f9927b.hashCode() + (this.f9926a.hashCode() * 31);
    }

    public final String toString() {
        return "DynamicFieldUiData(type=" + this.f9926a + ", data=" + this.f9927b + ")";
    }
}
