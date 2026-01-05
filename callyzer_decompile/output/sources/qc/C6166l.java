package qc;

import bd.C0645a;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6364n;
import tc.C7122g;
import tc.InterfaceC7116a;
import uc.C7394a;
import zb.InterfaceC8916j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.l */
/* loaded from: classes.dex */
public final class C6166l implements InterfaceC8916j {

    /* renamed from: a */
    public final Object f30044a;

    /* renamed from: b */
    public Object f30045b;

    /* renamed from: c */
    public final InterfaceC7116a f30046c;

    /* renamed from: d */
    public final C7394a f30047d;

    /* renamed from: e */
    public final C0645a f30048e;

    public C6166l(Object obj, Object obj2, C7122g c7122g, C7394a c7394a, C0645a executionContext) {
        AbstractC4154l.m8923f(executionContext, "executionContext");
        this.f30044a = obj;
        this.f30045b = obj2;
        this.f30046c = c7122g;
        this.f30047d = c7394a;
        this.f30048e = executionContext;
    }

    @Override // zb.InterfaceC8914h
    /* renamed from: a */
    public final C7394a mo12201a() {
        return this.f30047d;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: b */
    public final C0645a mo12202b() {
        return this.f30048e;
    }

    @Override // zb.InterfaceC8916j
    /* renamed from: c */
    public final Object mo12203c() {
        return this.f30045b;
    }

    @Override // zb.InterfaceC8913g
    /* renamed from: d */
    public final InterfaceC7116a mo12204d() {
        return this.f30046c;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: e */
    public final Object mo12205e() {
        return this.f30044a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6166l)) {
            return false;
        }
        C6166l c6166l = (C6166l) obj;
        return AbstractC4154l.m8918a(this.f30044a, c6166l.f30044a) && AbstractC4154l.m8918a(this.f30045b, c6166l.f30045b) && AbstractC4154l.m8918a(this.f30046c, c6166l.f30046c) && AbstractC4154l.m8918a(this.f30047d, c6166l.f30047d) && AbstractC4154l.m8918a(this.f30048e, c6166l.f30048e);
    }

    public final int hashCode() {
        Object obj = this.f30044a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f30045b;
        int iHashCode2 = ((obj2 == null ? 0 : obj2.hashCode()) + iHashCode) * 31;
        InterfaceC7116a interfaceC7116a = this.f30046c;
        int iHashCode3 = (iHashCode2 + (interfaceC7116a == null ? 0 : interfaceC7116a.hashCode())) * 31;
        C7394a c7394a = this.f30047d;
        return this.f30048e.hashCode() + ((iHashCode3 + (c7394a != null ? c7394a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HttpFinalInterceptorContext(request=" + this.f30044a + ", response=" + ((Object) C6364n.m12364b(this.f30045b)) + ", protocolRequest=" + this.f30046c + ", protocolResponse=" + this.f30047d + ", executionContext=" + this.f30048e + ')';
    }
}
