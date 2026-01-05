package qc;

import bd.C0645a;
import kotlin.jvm.internal.AbstractC4154l;
import tc.InterfaceC7116a;
import uc.C7394a;
import zb.InterfaceC8914h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.p */
/* loaded from: classes.dex */
public final class C6170p implements InterfaceC8914h {

    /* renamed from: a */
    public final Object f30060a;

    /* renamed from: b */
    public final InterfaceC7116a f30061b;

    /* renamed from: c */
    public C7394a f30062c;

    /* renamed from: d */
    public final C0645a f30063d;

    public C6170p(Object obj, InterfaceC7116a protocolRequest, C7394a c7394a, C0645a executionContext) {
        AbstractC4154l.m8923f(protocolRequest, "protocolRequest");
        AbstractC4154l.m8923f(executionContext, "executionContext");
        this.f30060a = obj;
        this.f30061b = protocolRequest;
        this.f30062c = c7394a;
        this.f30063d = executionContext;
    }

    @Override // zb.InterfaceC8914h
    /* renamed from: a */
    public final C7394a mo12201a() {
        return this.f30062c;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: b */
    public final C0645a mo12202b() {
        return this.f30063d;
    }

    @Override // zb.InterfaceC8913g
    /* renamed from: d */
    public final InterfaceC7116a mo12204d() {
        return this.f30061b;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: e */
    public final Object mo12205e() {
        return this.f30060a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6170p)) {
            return false;
        }
        C6170p c6170p = (C6170p) obj;
        return AbstractC4154l.m8918a(this.f30060a, c6170p.f30060a) && AbstractC4154l.m8918a(this.f30061b, c6170p.f30061b) && AbstractC4154l.m8918a(this.f30062c, c6170p.f30062c) && AbstractC4154l.m8918a(this.f30063d, c6170p.f30063d);
    }

    public final int hashCode() {
        Object obj = this.f30060a;
        return this.f30063d.hashCode() + ((this.f30062c.hashCode() + ((this.f30061b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HttpProtocolResponseInterceptorContext(request=" + this.f30060a + ", protocolRequest=" + this.f30061b + ", protocolResponse=" + this.f30062c + ", executionContext=" + this.f30063d + ')';
    }
}
