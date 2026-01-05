package h1;

import com.skydoves.balloon.internals.DefinitionKt;
import k2.C3953b;
import kotlin.jvm.internal.AbstractC4154l;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p1 implements k2.h2 {

    /* renamed from: a */
    public final x1 f15535a;

    /* renamed from: b */
    public final k2.e1 f15536b;

    /* renamed from: c */
    public final k2.e1 f15537c;

    /* renamed from: d */
    public final k2.e1 f15538d;

    /* renamed from: e */
    public p0 f15539e;

    /* renamed from: f */
    public k1 f15540f;

    /* renamed from: g */
    public final k2.e1 f15541g;

    /* renamed from: h */
    public final k2.a1 f15542h;

    /* renamed from: j */
    public boolean f15543j;

    /* renamed from: k */
    public final k2.e1 f15544k;

    /* renamed from: l */
    public AbstractC2785p f15545l;

    /* renamed from: m */
    public final k2.c1 f15546m;

    /* renamed from: n */
    public boolean f15547n;

    /* renamed from: p */
    public final a1 f15548p;

    /* renamed from: q */
    public final /* synthetic */ s1 f15549q;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public p1(s1 s1Var, Object obj, AbstractC2785p abstractC2785p, x1 x1Var) {
        this.f15549q = s1Var;
        this.f15535a = x1Var;
        k2.e1 e1VarM8517t = C3953b.m8517t(obj);
        this.f15536b = e1VarM8517t;
        Object objInvoke = null;
        this.f15537c = C3953b.m8517t(AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7));
        this.f15538d = C3953b.m8517t(new k1(m6843d(), x1Var, obj, e1VarM8517t.getValue(), abstractC2785p));
        this.f15541g = C3953b.m8517t(Boolean.TRUE);
        this.f15542h = new k2.a1(-1.0f);
        this.f15544k = C3953b.m8517t(obj);
        this.f15545l = abstractC2785p;
        this.f15546m = new k2.c1(m6842b().mo6805c());
        Float f6 = (Float) h2.f15452a.get(x1Var);
        if (f6 != null) {
            float fFloatValue = f6.floatValue();
            AbstractC2785p abstractC2785p2 = (AbstractC2785p) x1Var.f15661a.invoke(obj);
            int iMo6832b = abstractC2785p2.mo6832b();
            for (int i10 = 0; i10 < iMo6832b; i10++) {
                abstractC2785p2.mo6835e(fFloatValue, i10);
            }
            objInvoke = this.f15535a.f15662b.invoke(abstractC2785p2);
        }
        this.f15548p = AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, objInvoke, 3);
    }

    /* renamed from: b */
    public final k1 m6842b() {
        return (k1) this.f15538d.getValue();
    }

    /* renamed from: d */
    public final InterfaceC2794y m6843d() {
        return (InterfaceC2794y) this.f15537c.getValue();
    }

    /* renamed from: e */
    public final void m6844e(long j6) {
        if (this.f15542h.m8490f() == -1.0f) {
            this.f15547n = true;
            if (AbstractC4154l.m8918a(m6842b().f15497c, m6842b().f15498d)) {
                m6845f(m6842b().f15497c);
            } else {
                m6845f(m6842b().mo6809g(j6));
                this.f15545l = m6842b().mo6807e(j6);
            }
        }
    }

    /* renamed from: f */
    public final void m6845f(Object obj) {
        this.f15544k.setValue(obj);
    }

    /* renamed from: g */
    public final void m6846g(Object obj, boolean z6) {
        k1 k1Var = this.f15540f;
        Object obj2 = k1Var != null ? k1Var.f15497c : null;
        k2.e1 e1Var = this.f15536b;
        boolean zM8918a = AbstractC4154l.m8918a(obj2, e1Var.getValue());
        k2.c1 c1Var = this.f15546m;
        k2.e1 e1Var2 = this.f15538d;
        if (zM8918a) {
            e1Var2.setValue(new k1(this.f15548p, this.f15535a, obj, obj, this.f15545l.mo6833c()));
            this.f15543j = true;
            c1Var.m8532g(m6842b().mo6805c());
            return;
        }
        InterfaceC2794y interfaceC2794yM6843d = (!z6 || this.f15547n || (m6843d() instanceof a1)) ? m6843d() : this.f15548p;
        s1 s1Var = this.f15549q;
        long jM6856e = s1Var.m6856e();
        k2.e1 e1Var3 = s1Var.f15595h;
        e1Var2.setValue(new k1(jM6856e <= 0 ? interfaceC2794yM6843d : new b1(interfaceC2794yM6843d, s1Var.m6856e()), this.f15535a, obj, e1Var.getValue(), this.f15545l));
        c1Var.m8532g(m6842b().mo6805c());
        this.f15543j = false;
        e1Var3.setValue(Boolean.TRUE);
        if (s1Var.m6858g()) {
            C7320q c7320q = s1Var.f15596i;
            int size = c7320q.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                p1 p1Var = (p1) c7320q.get(i10);
                jMax = Math.max(jMax, p1Var.f15546m.m8531f());
                p1Var.m6844e(0L);
            }
            e1Var3.setValue(Boolean.FALSE);
        }
    }

    @Override // k2.h2
    public final Object getValue() {
        return this.f15544k.getValue();
    }

    /* renamed from: h */
    public final void m6847h(Object obj, Object obj2, InterfaceC2794y interfaceC2794y) {
        this.f15536b.setValue(obj2);
        this.f15537c.setValue(interfaceC2794y);
        if (AbstractC4154l.m8918a(m6842b().f15498d, obj) && AbstractC4154l.m8918a(m6842b().f15497c, obj2)) {
            return;
        }
        m6846g(obj, false);
    }

    /* renamed from: i */
    public final void m6848i(Object obj, InterfaceC2794y interfaceC2794y) {
        if (this.f15543j) {
            k1 k1Var = this.f15540f;
            if (AbstractC4154l.m8918a(obj, k1Var != null ? k1Var.f15497c : null)) {
                return;
            }
        }
        k2.e1 e1Var = this.f15536b;
        boolean zM8918a = AbstractC4154l.m8918a(e1Var.getValue(), obj);
        k2.a1 a1Var = this.f15542h;
        if (zM8918a && a1Var.m8490f() == -1.0f) {
            return;
        }
        e1Var.setValue(obj);
        this.f15537c.setValue(interfaceC2794y);
        Object value = a1Var.m8490f() == -3.0f ? obj : this.f15544k.getValue();
        k2.e1 e1Var2 = this.f15541g;
        m6846g(value, !((Boolean) e1Var2.getValue()).booleanValue());
        e1Var2.setValue(Boolean.valueOf(a1Var.m8490f() == -3.0f));
        if (a1Var.m8490f() >= DefinitionKt.NO_Float_VALUE) {
            m6845f(m6842b().mo6809g((long) (a1Var.m8490f() * m6842b().mo6805c())));
        } else if (a1Var.m8490f() == -3.0f) {
            m6845f(obj);
        }
        this.f15543j = false;
        a1Var.m8491g(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.f15544k.getValue() + ", target: " + this.f15536b.getValue() + ", spec: " + m6843d();
    }
}
