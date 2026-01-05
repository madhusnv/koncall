package sc;

import bd.C0645a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sc.v */
/* loaded from: classes.dex */
public final class C6802v {

    /* renamed from: a */
    public final C0645a f32331a;

    /* renamed from: b */
    public final Object f32332b;

    public C6802v(C0645a context, Object obj) {
        AbstractC4154l.m8923f(context, "context");
        this.f32331a = context;
        this.f32332b = obj;
    }

    /* renamed from: a */
    public static C6802v m12982a(C6802v c6802v, Object obj) {
        C0645a context = c6802v.f32331a;
        c6802v.getClass();
        AbstractC4154l.m8923f(context, "context");
        return new C6802v(context, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6802v)) {
            return false;
        }
        C6802v c6802v = (C6802v) obj;
        return AbstractC4154l.m8918a(this.f32331a, c6802v.f32331a) && AbstractC4154l.m8918a(this.f32332b, c6802v.f32332b);
    }

    public final int hashCode() {
        int iHashCode = this.f32331a.hashCode() * 31;
        Object obj = this.f32332b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "OperationRequest(context=" + this.f32331a + ", subject=" + this.f32332b + ')';
    }
}
