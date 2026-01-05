package h1;

import ai.AbstractC0151h;
import g1.C2440t;
import gx.AbstractC2747a;
import k2.C3953b;
import kotlin.jvm.internal.AbstractC4154l;
import u2.C7320q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a */
    public final AbstractC0151h f15588a;

    /* renamed from: b */
    public final s1 f15589b;

    /* renamed from: c */
    public final String f15590c;

    /* renamed from: d */
    public final k2.e1 f15591d;

    /* renamed from: e */
    public final k2.e1 f15592e;

    /* renamed from: f */
    public final k2.c1 f15593f = new k2.c1(0);

    /* renamed from: g */
    public final k2.c1 f15594g = new k2.c1(Long.MIN_VALUE);

    /* renamed from: h */
    public final k2.e1 f15595h;

    /* renamed from: i */
    public final C7320q f15596i;

    /* renamed from: j */
    public final C7320q f15597j;

    /* renamed from: k */
    public final k2.e1 f15598k;

    /* renamed from: l */
    public final k2.c0 f15599l;

    public s1(AbstractC0151h abstractC0151h, s1 s1Var, String str) {
        this.f15588a = abstractC0151h;
        this.f15589b = s1Var;
        this.f15590c = str;
        this.f15591d = C3953b.m8517t(abstractC0151h.mo345y());
        this.f15592e = C3953b.m8517t(new o1(abstractC0151h.mo345y(), abstractC0151h.mo345y()));
        Boolean bool = Boolean.FALSE;
        this.f15595h = C3953b.m8517t(bool);
        this.f15596i = new C7320q();
        this.f15597j = new C7320q();
        this.f15598k = C3953b.m8517t(bool);
        this.f15599l = C3953b.m8512o(new C2440t(this, 1));
        abstractC0151h.mo322J(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6852a(java.lang.Object r11, k2.InterfaceC3962k r12, int r13) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.s1.m6852a(java.lang.Object, k2.k, int):void");
    }

    /* renamed from: b */
    public final long m6853b() {
        C7320q c7320q = this.f15596i;
        int size = c7320q.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, ((p1) c7320q.get(i10)).f15546m.m8531f());
        }
        C7320q c7320q2 = this.f15597j;
        int size2 = c7320q2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, ((s1) c7320q2.get(i11)).m6853b());
        }
        return jMax;
    }

    /* renamed from: c */
    public final void m6854c() {
        C7320q c7320q = this.f15596i;
        int size = c7320q.size();
        for (int i10 = 0; i10 < size; i10++) {
            p1 p1Var = (p1) c7320q.get(i10);
            p1Var.f15540f = null;
            p1Var.f15539e = null;
            p1Var.f15543j = false;
        }
        C7320q c7320q2 = this.f15597j;
        int size2 = c7320q2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((s1) c7320q2.get(i11)).m6854c();
        }
    }

    /* renamed from: d */
    public final boolean m6855d() {
        C7320q c7320q = this.f15596i;
        int size = c7320q.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((p1) c7320q.get(i10)).f15539e != null) {
                return true;
            }
        }
        C7320q c7320q2 = this.f15597j;
        int size2 = c7320q2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((s1) c7320q2.get(i11)).m6855d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final long m6856e() {
        s1 s1Var = this.f15589b;
        return s1Var != null ? s1Var.m6856e() : this.f15593f.m8531f();
    }

    /* renamed from: f */
    public final n1 m6857f() {
        return (n1) this.f15592e.getValue();
    }

    /* renamed from: g */
    public final boolean m6858g() {
        return ((Boolean) this.f15598k.getValue()).booleanValue();
    }

    /* renamed from: h */
    public final void m6859h(boolean z6, long j6) {
        k2.c1 c1Var = this.f15594g;
        long jM8531f = c1Var.m8531f();
        AbstractC0151h abstractC0151h = this.f15588a;
        if (jM8531f == Long.MIN_VALUE) {
            c1Var.m8532g(j6);
            ((k2.e1) abstractC0151h.f482a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((k2.e1) abstractC0151h.f482a).getValue()).booleanValue()) {
            ((k2.e1) abstractC0151h.f482a).setValue(Boolean.TRUE);
        }
        this.f15595h.setValue(Boolean.FALSE);
        C7320q c7320q = this.f15596i;
        int size = c7320q.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            p1 p1Var = (p1) c7320q.get(i10);
            k2.e1 e1Var = p1Var.f15541g;
            k2.e1 e1Var2 = p1Var.f15541g;
            if (!((Boolean) e1Var.getValue()).booleanValue()) {
                long jMo6805c = z6 ? p1Var.m6842b().mo6805c() : j6;
                p1Var.m6845f(p1Var.m6842b().mo6809g(jMo6805c));
                p1Var.f15545l = p1Var.m6842b().mo6807e(jMo6805c);
                if (p1Var.m6842b().m6808f(jMo6805c)) {
                    e1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) e1Var2.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        C7320q c7320q2 = this.f15597j;
        int size2 = c7320q2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            s1 s1Var = (s1) c7320q2.get(i11);
            k2.e1 e1Var3 = s1Var.f15591d;
            AbstractC0151h abstractC0151h2 = s1Var.f15588a;
            if (!AbstractC4154l.m8918a(e1Var3.getValue(), abstractC0151h2.mo345y())) {
                s1Var.m6859h(z6, j6);
            }
            if (!AbstractC4154l.m8918a(s1Var.f15591d.getValue(), abstractC0151h2.mo345y())) {
                z10 = false;
            }
        }
        if (z10) {
            m6860i();
        }
    }

    /* renamed from: i */
    public final void m6860i() {
        this.f15594g.m8532g(Long.MIN_VALUE);
        AbstractC0151h abstractC0151h = this.f15588a;
        if (abstractC0151h instanceof j0) {
            abstractC0151h.mo319G(this.f15591d.getValue());
        }
        m6865n(0L);
        ((k2.e1) abstractC0151h.f482a).setValue(Boolean.FALSE);
        C7320q c7320q = this.f15597j;
        int size = c7320q.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s1) c7320q.get(i10)).m6860i();
        }
    }

    /* renamed from: j */
    public final void m6861j(float f6) {
        C7320q c7320q = this.f15596i;
        int size = c7320q.size();
        for (int i10 = 0; i10 < size; i10++) {
            p1 p1Var = (p1) c7320q.get(i10);
            p1Var.getClass();
            if (f6 == -4.0f || f6 == -5.0f) {
                k1 k1Var = p1Var.f15540f;
                if (k1Var != null) {
                    p1Var.m6842b().m6829a(k1Var.f15497c);
                    p1Var.f15539e = null;
                    p1Var.f15540f = null;
                }
                Object obj = f6 == -4.0f ? p1Var.m6842b().f15498d : p1Var.m6842b().f15497c;
                p1Var.m6842b().m6829a(obj);
                p1Var.m6842b().m6830i(obj);
                p1Var.m6845f(obj);
                p1Var.f15546m.m8532g(p1Var.m6842b().mo6805c());
            } else {
                p1Var.f15542h.m8491g(f6);
            }
        }
        C7320q c7320q2 = this.f15597j;
        int size2 = c7320q2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((s1) c7320q2.get(i11)).m6861j(f6);
        }
    }

    /* renamed from: k */
    public final void m6862k(Object obj, Object obj2) {
        this.f15594g.m8532g(Long.MIN_VALUE);
        AbstractC0151h abstractC0151h = this.f15588a;
        ((k2.e1) abstractC0151h.f482a).setValue(Boolean.FALSE);
        boolean zM6858g = m6858g();
        k2.e1 e1Var = this.f15591d;
        if (!zM6858g || !AbstractC4154l.m8918a(abstractC0151h.mo345y(), obj) || !AbstractC4154l.m8918a(e1Var.getValue(), obj2)) {
            if (!AbstractC4154l.m8918a(abstractC0151h.mo345y(), obj) && (abstractC0151h instanceof j0)) {
                abstractC0151h.mo319G(obj);
            }
            e1Var.setValue(obj2);
            this.f15598k.setValue(Boolean.TRUE);
            this.f15592e.setValue(new o1(obj, obj2));
        }
        C7320q c7320q = this.f15597j;
        int size = c7320q.size();
        for (int i10 = 0; i10 < size; i10++) {
            s1 s1Var = (s1) c7320q.get(i10);
            AbstractC4154l.m8921d(s1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (s1Var.m6858g()) {
                s1Var.m6862k(s1Var.f15588a.mo345y(), s1Var.f15591d.getValue());
            }
        }
        C7320q c7320q2 = this.f15596i;
        int size2 = c7320q2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((p1) c7320q2.get(i11)).m6844e(0L);
        }
    }

    /* renamed from: l */
    public final void m6863l(long j6) {
        k2.c1 c1Var = this.f15594g;
        if (c1Var.m8531f() == Long.MIN_VALUE) {
            c1Var.m8532g(j6);
        }
        m6865n(j6);
        this.f15595h.setValue(Boolean.FALSE);
        C7320q c7320q = this.f15596i;
        int size = c7320q.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p1) c7320q.get(i10)).m6844e(j6);
        }
        C7320q c7320q2 = this.f15597j;
        int size2 = c7320q2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            s1 s1Var = (s1) c7320q2.get(i11);
            if (!AbstractC4154l.m8918a(s1Var.f15591d.getValue(), s1Var.f15588a.mo345y())) {
                s1Var.m6863l(j6);
            }
        }
    }

    /* renamed from: m */
    public final void m6864m(p0 p0Var) {
        C7320q c7320q = this.f15596i;
        int size = c7320q.size();
        for (int i10 = 0; i10 < size; i10++) {
            p1 p1Var = (p1) c7320q.get(i10);
            k2.e1 e1Var = p1Var.f15544k;
            if (!AbstractC4154l.m8918a(p1Var.m6842b().f15497c, p1Var.m6842b().f15498d)) {
                p1Var.f15540f = p1Var.m6842b();
                p1Var.f15539e = p0Var;
            }
            p1Var.f15538d.setValue(new k1(p1Var.f15548p, p1Var.f15535a, e1Var.getValue(), e1Var.getValue(), p1Var.f15545l.mo6833c()));
            p1Var.f15546m.m8532g(p1Var.m6842b().mo6805c());
            p1Var.f15543j = true;
        }
        C7320q c7320q2 = this.f15597j;
        int size2 = c7320q2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((s1) c7320q2.get(i11)).m6864m(p0Var);
        }
    }

    /* renamed from: n */
    public final void m6865n(long j6) {
        if (this.f15589b == null) {
            this.f15593f.m8532g(j6);
        }
    }

    /* renamed from: o */
    public final void m6866o() {
        k1 k1Var;
        C7320q c7320q = this.f15596i;
        int size = c7320q.size();
        for (int i10 = 0; i10 < size; i10++) {
            p1 p1Var = (p1) c7320q.get(i10);
            p0 p0Var = p1Var.f15539e;
            if (p0Var != null && (k1Var = p1Var.f15540f) != null) {
                long jM6748l = AbstractC2747a.m6748l(p0Var.f15533g * p0Var.f15530d);
                Object objMo6809g = k1Var.mo6809g(jM6748l);
                if (p1Var.f15543j) {
                    p1Var.m6842b().m6830i(objMo6809g);
                }
                p1Var.m6842b().m6829a(objMo6809g);
                p1Var.f15546m.m8532g(p1Var.m6842b().mo6805c());
                if (p1Var.f15542h.m8490f() == -2.0f || p1Var.f15543j) {
                    p1Var.m6845f(objMo6809g);
                } else {
                    p1Var.m6844e(p1Var.f15549q.m6856e());
                }
                if (jM6748l >= p0Var.f15533g) {
                    p1Var.f15539e = null;
                    p1Var.f15540f = null;
                } else {
                    p0Var.f15529c = false;
                }
            }
        }
        C7320q c7320q2 = this.f15597j;
        int size2 = c7320q2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((s1) c7320q2.get(i11)).m6866o();
        }
    }

    /* renamed from: p */
    public final void m6867p(Object obj) {
        k2.e1 e1Var = this.f15591d;
        if (AbstractC4154l.m8918a(e1Var.getValue(), obj)) {
            return;
        }
        this.f15592e.setValue(new o1(e1Var.getValue(), obj));
        AbstractC0151h abstractC0151h = this.f15588a;
        if (!AbstractC4154l.m8918a(abstractC0151h.mo345y(), e1Var.getValue())) {
            abstractC0151h.mo319G(e1Var.getValue());
        }
        e1Var.setValue(obj);
        if (this.f15594g.m8531f() == Long.MIN_VALUE) {
            this.f15595h.setValue(Boolean.TRUE);
        }
        C7320q c7320q = this.f15596i;
        int size = c7320q.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p1) c7320q.get(i10)).f15542h.m8491g(-2.0f);
        }
    }

    public final String toString() {
        C7320q c7320q = this.f15596i;
        int size = c7320q.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((p1) c7320q.get(i10)) + ", ";
        }
        return str;
    }
}
