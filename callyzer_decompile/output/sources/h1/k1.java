package h1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 implements InterfaceC2775f {

    /* renamed from: a */
    public final z1 f15495a;

    /* renamed from: b */
    public final x1 f15496b;

    /* renamed from: c */
    public Object f15497c;

    /* renamed from: d */
    public Object f15498d;

    /* renamed from: e */
    public AbstractC2785p f15499e;

    /* renamed from: f */
    public AbstractC2785p f15500f;

    /* renamed from: g */
    public final AbstractC2785p f15501g;

    /* renamed from: h */
    public long f15502h;

    /* renamed from: i */
    public AbstractC2785p f15503i;

    public k1(InterfaceC2779j interfaceC2779j, x1 x1Var, Object obj, Object obj2, AbstractC2785p abstractC2785p) {
        this.f15495a = interfaceC2779j.mo6766a(x1Var);
        this.f15496b = x1Var;
        this.f15497c = obj2;
        this.f15498d = obj;
        this.f15499e = (AbstractC2785p) x1Var.f15661a.invoke(obj);
        InterfaceC2139c interfaceC2139c = x1Var.f15661a;
        this.f15500f = (AbstractC2785p) interfaceC2139c.invoke(obj2);
        this.f15501g = abstractC2785p != null ? AbstractC2773d.m6788k(abstractC2785p) : ((AbstractC2785p) interfaceC2139c.invoke(obj)).mo6833c();
        this.f15502h = -1L;
    }

    /* renamed from: a */
    public final void m6829a(Object obj) {
        if (AbstractC4154l.m8918a(obj, this.f15498d)) {
            return;
        }
        this.f15498d = obj;
        this.f15499e = (AbstractC2785p) this.f15496b.f15661a.invoke(obj);
        this.f15503i = null;
        this.f15502h = -1L;
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: b */
    public final boolean mo6804b() {
        return this.f15495a.mo6777b();
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: c */
    public final long mo6805c() {
        if (this.f15502h < 0) {
            this.f15502h = this.f15495a.mo6771m(this.f15499e, this.f15500f, this.f15501g);
        }
        return this.f15502h;
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: d */
    public final x1 mo6806d() {
        return this.f15496b;
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: e */
    public final AbstractC2785p mo6807e(long j6) {
        if (!m6808f(j6)) {
            return this.f15495a.mo2744n(j6, this.f15499e, this.f15500f, this.f15501g);
        }
        AbstractC2785p abstractC2785p = this.f15503i;
        if (abstractC2785p != null) {
            return abstractC2785p;
        }
        AbstractC2785p abstractC2785pMo6884G = this.f15495a.mo6884G(this.f15499e, this.f15500f, this.f15501g);
        this.f15503i = abstractC2785pMo6884G;
        return abstractC2785pMo6884G;
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: g */
    public final Object mo6809g(long j6) {
        if (m6808f(j6)) {
            return this.f15497c;
        }
        AbstractC2785p abstractC2785pMo2730B = this.f15495a.mo2730B(j6, this.f15499e, this.f15500f, this.f15501g);
        int iMo6832b = abstractC2785pMo2730B.mo6832b();
        for (int i10 = 0; i10 < iMo6832b; i10++) {
            if (Float.isNaN(abstractC2785pMo2730B.mo6831a(i10))) {
                n0.m6840b("AnimationVector cannot contain a NaN. " + abstractC2785pMo2730B + ". Animation: " + this + ", playTimeNanos: " + j6);
            }
        }
        return this.f15496b.f15662b.invoke(abstractC2785pMo2730B);
    }

    @Override // h1.InterfaceC2775f
    /* renamed from: h */
    public final Object mo6810h() {
        return this.f15497c;
    }

    /* renamed from: i */
    public final void m6830i(Object obj) {
        if (AbstractC4154l.m8918a(this.f15497c, obj)) {
            return;
        }
        this.f15497c = obj;
        this.f15500f = (AbstractC2785p) this.f15496b.f15661a.invoke(obj);
        this.f15503i = null;
        this.f15502h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f15498d + " -> " + this.f15497c + ",initial velocity: " + this.f15501g + ", duration: " + (mo6805c() / 1000000) + " ms,animationSpec: " + this.f15495a;
    }
}
