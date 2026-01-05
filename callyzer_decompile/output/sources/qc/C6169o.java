package qc;

import bd.C0645a;
import kotlin.jvm.internal.AbstractC4154l;
import tc.InterfaceC7116a;
import zb.InterfaceC8913g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.o */
/* loaded from: classes.dex */
public final class C6169o implements InterfaceC8913g {

    /* renamed from: a */
    public final Object f30057a;

    /* renamed from: b */
    public InterfaceC7116a f30058b;

    /* renamed from: c */
    public final C0645a f30059c;

    public C6169o(Object obj, InterfaceC7116a protocolRequest, C0645a executionContext) {
        AbstractC4154l.m8923f(protocolRequest, "protocolRequest");
        AbstractC4154l.m8923f(executionContext, "executionContext");
        this.f30057a = obj;
        this.f30058b = protocolRequest;
        this.f30059c = executionContext;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: b */
    public final C0645a mo12202b() {
        return this.f30059c;
    }

    @Override // zb.InterfaceC8913g
    /* renamed from: d */
    public final InterfaceC7116a mo12204d() {
        return this.f30058b;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: e */
    public final Object mo12205e() {
        return this.f30057a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6169o)) {
            return false;
        }
        C6169o c6169o = (C6169o) obj;
        return AbstractC4154l.m8918a(this.f30057a, c6169o.f30057a) && AbstractC4154l.m8918a(this.f30058b, c6169o.f30058b) && AbstractC4154l.m8918a(this.f30059c, c6169o.f30059c);
    }

    public final int hashCode() {
        Object obj = this.f30057a;
        return this.f30059c.hashCode() + ((this.f30058b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "HttpProtocolRequestInterceptorContext(request=" + this.f30057a + ", protocolRequest=" + this.f30058b + ", executionContext=" + this.f30059c + ')';
    }
}
