package qc;

import bd.C0645a;
import kotlin.jvm.internal.AbstractC4154l;
import pc.C5884l;
import qw.C6364n;
import tc.InterfaceC7116a;
import uc.C7394a;
import zb.InterfaceC8916j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.n */
/* loaded from: classes.dex */
public final class C6168n implements InterfaceC8916j {

    /* renamed from: a */
    public final Object f30051a;

    /* renamed from: b */
    public final Object f30052b;

    /* renamed from: c */
    public final C5884l f30053c;

    /* renamed from: d */
    public final C0645a f30054d;

    /* renamed from: e */
    public final InterfaceC7116a f30055e;

    /* renamed from: f */
    public final C7394a f30056f;

    public C6168n(Object obj, Object obj2, C5884l c5884l, C0645a executionContext) {
        AbstractC4154l.m8923f(executionContext, "executionContext");
        this.f30051a = obj;
        this.f30052b = obj2;
        this.f30053c = c5884l;
        this.f30054d = executionContext;
        this.f30055e = c5884l.f28690a;
        this.f30056f = c5884l.f28691b;
    }

    @Override // zb.InterfaceC8914h
    /* renamed from: a */
    public final C7394a mo12201a() {
        return this.f30056f;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: b */
    public final C0645a mo12202b() {
        return this.f30054d;
    }

    @Override // zb.InterfaceC8916j
    /* renamed from: c */
    public final Object mo12203c() {
        return this.f30052b;
    }

    @Override // zb.InterfaceC8913g
    /* renamed from: d */
    public final InterfaceC7116a mo12204d() {
        return this.f30055e;
    }

    @Override // zb.InterfaceC8915i
    /* renamed from: e */
    public final Object mo12205e() {
        return this.f30051a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6168n)) {
            return false;
        }
        C6168n c6168n = (C6168n) obj;
        return AbstractC4154l.m8918a(this.f30051a, c6168n.f30051a) && AbstractC4154l.m8918a(this.f30052b, c6168n.f30052b) && AbstractC4154l.m8918a(this.f30053c, c6168n.f30053c) && AbstractC4154l.m8918a(this.f30054d, c6168n.f30054d);
    }

    public final int hashCode() {
        Object obj = this.f30051a;
        return this.f30054d.hashCode() + ((this.f30053c.hashCode() + ((this.f30052b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HttpInputOutputInterceptorContext(request=" + this.f30051a + ", response=" + ((Object) C6364n.m12364b(this.f30052b)) + ", call=" + this.f30053c + ", executionContext=" + this.f30054d + ')';
    }
}
