package qc;

import bd.C0645a;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6364n;
import tc.InterfaceC7116a;
import uc.C7394a;
import zb.InterfaceC8916j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.k */
/* loaded from: classes.dex */
public final class C6165k implements InterfaceC8916j {

    /* renamed from: a */
    public final Object f30039a;

    /* renamed from: b */
    public Object f30040b;

    /* renamed from: c */
    public final InterfaceC7116a f30041c;

    /* renamed from: d */
    public final C7394a f30042d;

    /* renamed from: e */
    public final C0645a f30043e;

    public C6165k(Object obj, Object obj2, InterfaceC7116a protocolRequest, C7394a c7394a, C0645a executionContext) {
        AbstractC4154l.m8923f(protocolRequest, "protocolRequest");
        AbstractC4154l.m8923f(executionContext, "executionContext");
        this.f30039a = obj;
        this.f30040b = obj2;
        this.f30041c = protocolRequest;
        this.f30042d = c7394a;
        this.f30043e = executionContext;
    }

    @Override // zb.InterfaceC8914h
    /* renamed from: a */
    public final C7394a mo12201a() {
        return this.f30042d;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: b */
    public final C0645a mo12202b() {
        return this.f30043e;
    }

    @Override // zb.InterfaceC8916j
    /* renamed from: c */
    public final Object mo12203c() {
        return this.f30040b;
    }

    @Override // zb.InterfaceC8913g
    /* renamed from: d */
    public final InterfaceC7116a mo12204d() {
        return this.f30041c;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: e */
    public final Object mo12205e() {
        return this.f30039a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6165k)) {
            return false;
        }
        C6165k c6165k = (C6165k) obj;
        return AbstractC4154l.m8918a(this.f30039a, c6165k.f30039a) && AbstractC4154l.m8918a(this.f30040b, c6165k.f30040b) && AbstractC4154l.m8918a(this.f30041c, c6165k.f30041c) && AbstractC4154l.m8918a(this.f30042d, c6165k.f30042d) && AbstractC4154l.m8918a(this.f30043e, c6165k.f30043e);
    }

    public final int hashCode() {
        Object obj = this.f30039a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f30040b;
        int iHashCode2 = (this.f30041c.hashCode() + (((obj2 == null ? 0 : obj2.hashCode()) + iHashCode) * 31)) * 31;
        C7394a c7394a = this.f30042d;
        return this.f30043e.hashCode() + ((iHashCode2 + (c7394a != null ? c7394a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HttpAttemptInterceptorContext(request=" + this.f30039a + ", response=" + ((Object) C6364n.m12364b(this.f30040b)) + ", protocolRequest=" + this.f30041c + ", protocolResponse=" + this.f30042d + ", executionContext=" + this.f30043e + ')';
    }
}
