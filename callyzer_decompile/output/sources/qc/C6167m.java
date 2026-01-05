package qc;

import bd.C0645a;
import kotlin.jvm.internal.AbstractC4154l;
import zb.InterfaceC8915i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.m */
/* loaded from: classes.dex */
public final class C6167m implements InterfaceC8915i {

    /* renamed from: a */
    public Object f30049a;

    /* renamed from: b */
    public final C0645a f30050b;

    public C6167m(C0645a executionContext, Object obj) {
        AbstractC4154l.m8923f(executionContext, "executionContext");
        this.f30049a = obj;
        this.f30050b = executionContext;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: b */
    public final C0645a mo12202b() {
        return this.f30050b;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: e */
    public final Object mo12205e() {
        return this.f30049a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6167m)) {
            return false;
        }
        C6167m c6167m = (C6167m) obj;
        return AbstractC4154l.m8918a(this.f30049a, c6167m.f30049a) && AbstractC4154l.m8918a(this.f30050b, c6167m.f30050b);
    }

    public final int hashCode() {
        Object obj = this.f30049a;
        return this.f30050b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "HttpInputInterceptorContext(request=" + this.f30049a + ", executionContext=" + this.f30050b + ')';
    }
}
