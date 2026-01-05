package p001o;

import com.google.android.gms.common.api.Api;
import p001o.im5;
import p001o.xwf;

/* loaded from: classes2.dex */
public final class hm5 implements d5g, im5 {

    /* renamed from: a */
    public final uk7 f27126a;

    /* renamed from: b */
    public final pxf f27127b;

    /* renamed from: c */
    public C13996a f27128c;

    /* renamed from: o.hm5$a */
    public static final class C13996a extends f5g implements im5.InterfaceC14318a {

        /* renamed from: h */
        public static final a f27129h = new a(null);

        /* renamed from: i */
        public static final int f27130i = 8;

        /* renamed from: j */
        public static final Object f27131j = new Object();

        /* renamed from: c */
        public int f27132c;

        /* renamed from: d */
        public int f27133d;

        /* renamed from: e */
        public kb8 f27134e;

        /* renamed from: f */
        public Object f27135f = f27131j;

        /* renamed from: g */
        public int f27136g;

        /* renamed from: o.hm5$a$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final Object m30786a() {
                return C13996a.f27131j;
            }
        }

        @Override // p001o.im5.InterfaceC14318a
        /* renamed from: a */
        public Object mo30775a() {
            return this.f27135f;
        }

        @Override // p001o.im5.InterfaceC14318a
        /* renamed from: b */
        public Object[] mo30776b() {
            Object[] objArrM35354g;
            kb8 kb8Var = this.f27134e;
            return (kb8Var == null || (objArrM35354g = kb8Var.m35354g()) == null) ? new Object[0] : objArrM35354g;
        }

        @Override // p001o.f5g
        /* renamed from: c */
        public void mo26181c(f5g f5gVar) {
            sq8.m48649h(f5gVar, "value");
            C13996a c13996a = (C13996a) f5gVar;
            this.f27134e = c13996a.f27134e;
            this.f27135f = c13996a.f27135f;
            this.f27136g = c13996a.f27136g;
        }

        @Override // p001o.f5g
        /* renamed from: d */
        public f5g mo26182d() {
            return new C13996a();
        }

        /* renamed from: j */
        public final Object m30777j() {
            return this.f27135f;
        }

        /* renamed from: k */
        public final kb8 m30778k() {
            return this.f27134e;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m30779l(im5 im5Var, xwf xwfVar) {
            boolean z;
            boolean z2;
            sq8.m48649h(im5Var, "derivedState");
            sq8.m48649h(xwfVar, "snapshot");
            synchronized (exf.m25775G()) {
                z = false;
                if (this.f27132c == xwfVar.mo39744f()) {
                    z2 = this.f27133d != xwfVar.mo17683j();
                }
            }
            if (this.f27135f != f27131j && (!z2 || this.f27136g == m30780m(im5Var, xwfVar))) {
                z = true;
            }
            if (z && z2) {
                synchronized (exf.m25775G()) {
                    this.f27132c = xwfVar.mo39744f();
                    this.f27133d = xwfVar.mo17683j();
                    y3i y3iVar = y3i.f54824a;
                }
            }
            return z;
        }

        /* renamed from: m */
        public final int m30780m(im5 im5Var, xwf xwfVar) {
            kb8 kb8Var;
            sq8.m48649h(im5Var, "derivedState");
            sq8.m48649h(xwfVar, "snapshot");
            synchronized (exf.m25775G()) {
                kb8Var = this.f27134e;
            }
            int iM42710a = 7;
            if (kb8Var != null) {
                fqb fqbVarM45950a = qxf.m45950a();
                int iM27354o = fqbVarM45950a.m27354o();
                int i = 0;
                if (iM27354o > 0) {
                    Object[] objArrM27353n = fqbVarM45950a.m27353n();
                    int i2 = 0;
                    do {
                        ((jm5) objArrM27353n[i2]).mo27217a(im5Var);
                        i2++;
                    } while (i2 < iM27354o);
                }
                try {
                    int iM35355h = kb8Var.m35355h();
                    for (int i3 = 0; i3 < iM35355h; i3++) {
                        Object obj = kb8Var.m35354g()[i3];
                        sq8.m48647f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        d5g d5gVar = (d5g) obj;
                        if (((Number) kb8Var.m35356i()[i3]).intValue() == 1) {
                            f5g f5gVarM30771s = d5gVar instanceof hm5 ? ((hm5) d5gVar).m30771s(xwfVar) : exf.m25773E(d5gVar.mo22332n(), xwfVar);
                            iM42710a = (((iM42710a * 31) + ov.m42710a(f5gVarM30771s)) * 31) + f5gVarM30771s.m26184f();
                        }
                    }
                    y3i y3iVar = y3i.f54824a;
                    int iM27354o2 = fqbVarM45950a.m27354o();
                    if (iM27354o2 > 0) {
                        Object[] objArrM27353n2 = fqbVarM45950a.m27353n();
                        do {
                            ((jm5) objArrM27353n2[i]).mo27218b(im5Var);
                            i++;
                        } while (i < iM27354o2);
                    }
                } catch (Throwable th) {
                    int iM27354o3 = fqbVarM45950a.m27354o();
                    if (iM27354o3 > 0) {
                        Object[] objArrM27353n3 = fqbVarM45950a.m27353n();
                        do {
                            ((jm5) objArrM27353n3[i]).mo27218b(im5Var);
                            i++;
                        } while (i < iM27354o3);
                    }
                    throw th;
                }
            }
            return iM42710a;
        }

        /* renamed from: n */
        public final void m30781n(Object obj) {
            this.f27135f = obj;
        }

        /* renamed from: o */
        public final void m30782o(int i) {
            this.f27136g = i;
        }

        /* renamed from: p */
        public final void m30783p(int i) {
            this.f27132c = i;
        }

        /* renamed from: q */
        public final void m30784q(int i) {
            this.f27133d = i;
        }

        /* renamed from: r */
        public final void m30785r(kb8 kb8Var) {
            this.f27134e = kb8Var;
        }
    }

    /* renamed from: o.hm5$b */
    public static final class C13997b extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ kb8 f27138b;

        /* renamed from: c */
        public final /* synthetic */ int f27139c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13997b(kb8 kb8Var, int i) {
            super(1);
            this.f27138b = kb8Var;
            this.f27139c = i;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m69018invoke(obj);
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69018invoke(Object obj) {
            sq8.m48649h(obj, "it");
            if (obj == hm5.this) {
                throw new IllegalStateException("A derived state calculation cannot read itself".toString());
            }
            if (obj instanceof d5g) {
                Object objM56939a = rxf.f44242a.m56939a();
                sq8.m48646e(objM56939a);
                int iIntValue = ((Number) objM56939a).intValue();
                kb8 kb8Var = this.f27138b;
                int i = iIntValue - this.f27139c;
                Integer num = (Integer) kb8Var.m35353f(obj);
                kb8Var.m35359l(obj, Integer.valueOf(Math.min(i, num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER)));
            }
        }
    }

    public hm5(uk7 uk7Var, pxf pxfVar) {
        sq8.m48649h(uk7Var, "calculation");
        this.f27126a = uk7Var;
        this.f27127b = pxfVar;
        this.f27128c = new C13996a();
    }

    @Override // p001o.im5
    /* renamed from: a */
    public pxf mo30769a() {
        return this.f27127b;
    }

    @Override // p001o.p4g
    public Object getValue() {
        xwf.C18260a c18260a = xwf.f54441e;
        xk7 xk7VarMo17681h = c18260a.m56928b().mo17681h();
        if (xk7VarMo17681h != null) {
            xk7VarMo17681h.invoke(this);
        }
        return m30772t((C13996a) exf.m25772D(this.f27128c), c18260a.m56928b(), true, this.f27126a).m30777j();
    }

    @Override // p001o.d5g
    /* renamed from: n */
    public f5g mo22332n() {
        return this.f27128c;
    }

    @Override // p001o.im5
    /* renamed from: q */
    public im5.InterfaceC14318a mo30770q() {
        return m30772t((C13996a) exf.m25772D(this.f27128c), xwf.f54441e.m56928b(), false, this.f27126a);
    }

    @Override // p001o.d5g
    /* renamed from: r */
    public void mo22333r(f5g f5gVar) {
        sq8.m48649h(f5gVar, "value");
        this.f27128c = (C13996a) f5gVar;
    }

    /* renamed from: s */
    public final f5g m30771s(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        return m30772t((C13996a) exf.m25773E(this.f27128c, xwfVar), xwfVar, false, this.f27126a);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x015a A[Catch: all -> 0x0184, TRY_LEAVE, TryCatch #0 {, blocks: (B:54:0x011b, B:56:0x012d, B:58:0x0133, B:63:0x0141, B:64:0x015a), top: B:80:0x011b }] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C13996a m30772t(C13996a c13996a, xwf xwfVar, boolean z, uk7 uk7Var) {
        fqb fqbVarM45950a;
        xwf.C18260a c18260a;
        int i = 1;
        int i2 = 0;
        if (c13996a.m30779l(this, xwfVar)) {
            if (z) {
                fqbVarM45950a = qxf.m45950a();
                int iM27354o = fqbVarM45950a.m27354o();
                if (iM27354o > 0) {
                    Object[] objArrM27353n = fqbVarM45950a.m27353n();
                    int i3 = 0;
                    do {
                        ((jm5) objArrM27353n[i3]).mo27217a(this);
                        i3++;
                    } while (i3 < iM27354o);
                }
                try {
                    kb8 kb8VarM30778k = c13996a.m30778k();
                    Integer num = (Integer) rxf.f44242a.m56939a();
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (kb8VarM30778k != null) {
                        int iM35355h = kb8VarM30778k.m35355h();
                        for (int i4 = 0; i4 < iM35355h; i4++) {
                            Object obj = kb8VarM30778k.m35354g()[i4];
                            sq8.m48647f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            d5g d5gVar = (d5g) obj;
                            rxf.f44242a.m56940b(Integer.valueOf(((Number) kb8VarM30778k.m35356i()[i4]).intValue() + iIntValue));
                            xk7 xk7VarMo17681h = xwfVar.mo17681h();
                            if (xk7VarMo17681h != null) {
                                xk7VarMo17681h.invoke(d5gVar);
                            }
                        }
                    }
                    rxf.f44242a.m56940b(Integer.valueOf(iIntValue));
                    y3i y3iVar = y3i.f54824a;
                    int iM27354o2 = fqbVarM45950a.m27354o();
                    if (iM27354o2 > 0) {
                        Object[] objArrM27353n2 = fqbVarM45950a.m27353n();
                        do {
                            ((jm5) objArrM27353n2[i2]).mo27218b(this);
                            i2++;
                        } while (i2 < iM27354o2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c13996a;
        }
        Integer num2 = (Integer) rxf.f44242a.m56939a();
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        kb8 kb8Var = new kb8(0, 1, null);
        fqbVarM45950a = qxf.m45950a();
        int iM27354o3 = fqbVarM45950a.m27354o();
        if (iM27354o3 > 0) {
            Object[] objArrM27353n3 = fqbVarM45950a.m27353n();
            int i5 = 0;
            do {
                ((jm5) objArrM27353n3[i5]).mo27217a(this);
                i5++;
            } while (i5 < iM27354o3);
        }
        try {
            rxf.f44242a.m56940b(Integer.valueOf(iIntValue2 + 1));
            Object objM56930d = xwf.f54441e.m56930d(new C13997b(kb8Var, iIntValue2), null, uk7Var);
            rxf.f44242a.m56940b(Integer.valueOf(iIntValue2));
            int iM27354o4 = fqbVarM45950a.m27354o();
            if (iM27354o4 > 0) {
                Object[] objArrM27353n4 = fqbVarM45950a.m27353n();
                int i6 = 0;
                do {
                    ((jm5) objArrM27353n4[i6]).mo27218b(this);
                    i6++;
                } while (i6 < iM27354o4);
            }
            synchronized (exf.m25775G()) {
                c18260a = xwf.f54441e;
                xwf xwfVarM56928b = c18260a.m56928b();
                if (c13996a.m30777j() == C13996a.f27129h.m30786a()) {
                    c13996a = (C13996a) exf.m25781M(this.f27128c, this, xwfVarM56928b);
                    c13996a.m30785r(kb8Var);
                    c13996a.m30782o(c13996a.m30780m(this, xwfVarM56928b));
                    c13996a.m30783p(xwfVar.mo39744f());
                    c13996a.m30784q(xwfVar.mo17683j());
                    c13996a.m30781n(objM56930d);
                } else {
                    pxf pxfVarMo30769a = mo30769a();
                    if (pxfVarMo30769a == null || !pxfVarMo30769a.mo32849b(objM56930d, c13996a.m30777j())) {
                        i = 0;
                    }
                    if (i != 0) {
                        c13996a.m30785r(kb8Var);
                        c13996a.m30782o(c13996a.m30780m(this, xwfVarM56928b));
                        c13996a.m30783p(xwfVar.mo39744f());
                        c13996a.m30784q(xwfVar.mo17683j());
                    }
                }
            }
            if (iIntValue2 == 0) {
                c18260a.m56929c();
            }
            return c13996a;
        } finally {
            int iM27354o5 = fqbVarM45950a.m27354o();
            if (iM27354o5 > 0) {
                Object[] objArrM27353n5 = fqbVarM45950a.m27353n();
                do {
                    ((jm5) objArrM27353n5[i2]).mo27218b(this);
                    i2++;
                } while (i2 < iM27354o5);
            }
        }
    }

    public String toString() {
        return "DerivedState(value=" + m30773u() + ")@" + hashCode();
    }

    /* renamed from: u */
    public final String m30773u() {
        C13996a c13996a = (C13996a) exf.m25772D(this.f27128c);
        return c13996a.m30779l(this, xwf.f54441e.m56928b()) ? String.valueOf(c13996a.m30777j()) : "<Not calculated>";
    }
}
