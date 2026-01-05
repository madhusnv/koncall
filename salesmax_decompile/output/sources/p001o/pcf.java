package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.alb;

/* loaded from: classes2.dex */
public final class pcf {

    /* renamed from: a */
    public final alb.AbstractC12216c f39815a;

    /* renamed from: b */
    public final boolean f39816b;

    /* renamed from: c */
    public final zh9 f39817c;

    /* renamed from: d */
    public final kcf f39818d;

    /* renamed from: e */
    public boolean f39819e;

    /* renamed from: f */
    public pcf f39820f;

    /* renamed from: g */
    public final int f39821g;

    /* renamed from: o.pcf$a */
    public static final class C16055a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ hue f39822a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16055a(hue hueVar) {
            super(1);
            this.f39822a = hueVar;
        }

        /* renamed from: a */
        public final void m43375a(ycf ycfVar) {
            sq8.m48649h(ycfVar, "$this$fakeSemanticsNode");
            wcf.m54226b(ycfVar, this.f39822a.m31150n());
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m43375a((ycf) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pcf$b */
    public static final class C16056b extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ String f39823a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16056b(String str) {
            super(1);
            this.f39823a = str;
        }

        /* renamed from: a */
        public final void m43376a(ycf ycfVar) {
            sq8.m48649h(ycfVar, "$this$fakeSemanticsNode");
            wcf.m54225a(ycfVar, this.f39823a);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m43376a((ycf) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pcf$c */
    public static final class C16057c extends alb.AbstractC12216c implements ncf {

        /* renamed from: L */
        public final /* synthetic */ xk7 f39824L;

        public C16057c(xk7 xk7Var) {
            this.f39824L = xk7Var;
        }

        @Override // p001o.ncf
        /* renamed from: c */
        public void mo40256c(ycf ycfVar) {
            sq8.m48649h(ycfVar, "<this>");
            this.f39824L.invoke(ycfVar);
        }
    }

    /* renamed from: o.pcf$d */
    public static final class C16058d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C16058d f39825a = new C16058d();

        public C16058d() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(zh9 zh9Var) {
            sq8.m48649h(zh9Var, "it");
            kcf kcfVarM59446x = zh9Var.m59446x();
            boolean z = false;
            if (kcfVarM59446x != null && kcfVarM59446x.m35420v()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.pcf$e */
    public static final class C16059e extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C16059e f39826a = new C16059e();

        public C16059e() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(zh9 zh9Var) {
            sq8.m48649h(zh9Var, "it");
            kcf kcfVarM59446x = zh9Var.m59446x();
            boolean z = false;
            if (kcfVarM59446x != null && kcfVarM59446x.m35420v()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.pcf$f */
    public static final class C16060f extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C16060f f39827a = new C16060f();

        public C16060f() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(zh9 zh9Var) {
            sq8.m48649h(zh9Var, "it");
            return Boolean.valueOf(zh9Var.m59428U().m4993q(zzb.m60153a(8)));
        }
    }

    public pcf(alb.AbstractC12216c abstractC12216c, boolean z, zh9 zh9Var, kcf kcfVar) {
        sq8.m48649h(abstractC12216c, "outerSemanticsNode");
        sq8.m48649h(zh9Var, "layoutNode");
        sq8.m48649h(kcfVar, "unmergedConfig");
        this.f39815a = abstractC12216c;
        this.f39816b = z;
        this.f39817c = zh9Var;
        this.f39818d = kcfVar;
        this.f39821g = zh9Var.m59433Z();
    }

    /* renamed from: B */
    public static /* synthetic */ List m43347B(pcf pcfVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return pcfVar.m43349A(z);
    }

    /* renamed from: g */
    public static /* synthetic */ List m43348g(pcf pcfVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return pcfVar.m43355f(list);
    }

    /* renamed from: A */
    public final List m43349A(boolean z) {
        if (this.f39819e) {
            return ch3.m21246k();
        }
        ArrayList arrayList = new ArrayList();
        m43353d(this.f39817c, arrayList);
        if (z) {
            m43351b(arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final pcf m43350a() {
        return new pcf(this.f39815a, true, this.f39817c, this.f39818d);
    }

    /* renamed from: b */
    public final void m43351b(List list) {
        hue hueVarM45104h = qcf.m45104h(this);
        if (hueVarM45104h != null && this.f39818d.m35420v() && (!list.isEmpty())) {
            list.add(m43352c(hueVarM45104h, new C16055a(hueVarM45104h)));
        }
        kcf kcfVar = this.f39818d;
        tcf tcfVar = tcf.f46841a;
        if (kcfVar.m35414e(tcfVar.m49716c()) && (!list.isEmpty()) && this.f39818d.m35420v()) {
            List list2 = (List) lcf.m36963a(this.f39818d, tcfVar.m49716c());
            String str = list2 != null ? (String) kh3.h0(list2) : null;
            if (str != null) {
                list.add(0, m43352c(null, new C16056b(str)));
            }
        }
    }

    /* renamed from: c */
    public final pcf m43352c(hue hueVar, xk7 xk7Var) {
        kcf kcfVar = new kcf();
        kcfVar.m35412A(false);
        kcfVar.m35422y(false);
        xk7Var.invoke(kcfVar);
        pcf pcfVar = new pcf(new C16057c(xk7Var), false, new zh9(true, hueVar != null ? qcf.m45105i(this) : qcf.m45101e(this)), kcfVar);
        pcfVar.f39819e = true;
        pcfVar.f39820f = this;
        return pcfVar;
    }

    /* renamed from: d */
    public final void m43353d(zh9 zh9Var, List list) {
        fqb fqbVarD0 = zh9Var.d0();
        int iM27354o = fqbVarD0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarD0.m27353n();
            int i = 0;
            do {
                zh9 zh9Var2 = (zh9) objArrM27353n[i];
                if (zh9Var2.m59428U().m4993q(zzb.m60153a(8))) {
                    list.add(qcf.m45097a(zh9Var2, this.f39816b));
                } else {
                    m43353d(zh9Var2, list);
                }
                i++;
            } while (i < iM27354o);
        }
    }

    /* renamed from: e */
    public final xzb m43354e() {
        if (this.f39819e) {
            pcf pcfVarM43364p = m43364p();
            if (pcfVarM43364p != null) {
                return pcfVarM43364p.m43354e();
            }
            return null;
        }
        rk5 rk5VarM45103g = qcf.m45103g(this.f39817c);
        if (rk5VarM45103g == null) {
            rk5VarM45103g = this.f39815a;
        }
        return sk5.m48435g(rk5VarM45103g, zzb.m60153a(8));
    }

    /* renamed from: f */
    public final List m43355f(List list) {
        List listM43347B = m43347B(this, false, 1, null);
        int size = listM43347B.size();
        for (int i = 0; i < size; i++) {
            pcf pcfVar = (pcf) listM43347B.get(i);
            if (pcfVar.m43371w()) {
                list.add(pcfVar);
            } else if (!pcfVar.f39818d.m35419r()) {
                pcfVar.m43355f(list);
            }
        }
        return list;
    }

    /* renamed from: h */
    public final mfe m43356h() {
        mfe mfeVarM40599b;
        xzb xzbVarM43354e = m43354e();
        if (xzbVarM43354e != null) {
            if (!xzbVarM43354e.mo39062f()) {
                xzbVarM43354e = null;
            }
            if (xzbVarM43354e != null && (mfeVarM40599b = nh9.m40599b(xzbVarM43354e)) != null) {
                return mfeVarM40599b;
            }
        }
        return mfe.f35356e.m38953a();
    }

    /* renamed from: i */
    public final mfe m43357i() {
        mfe mfeVarM40600c;
        xzb xzbVarM43354e = m43354e();
        if (xzbVarM43354e != null) {
            if (!xzbVarM43354e.mo39062f()) {
                xzbVarM43354e = null;
            }
            if (xzbVarM43354e != null && (mfeVarM40600c = nh9.m40600c(xzbVarM43354e)) != null) {
                return mfeVarM40600c;
            }
        }
        return mfe.f35356e.m38953a();
    }

    /* renamed from: j */
    public final List m43358j() {
        return m43359k(!this.f39816b, false);
    }

    /* renamed from: k */
    public final List m43359k(boolean z, boolean z2) {
        return (z || !this.f39818d.m35419r()) ? m43371w() ? m43348g(this, null, 1, null) : m43349A(z2) : ch3.m21246k();
    }

    /* renamed from: l */
    public final kcf m43360l() {
        if (!m43371w()) {
            return this.f39818d;
        }
        kcf kcfVarM35415j = this.f39818d.m35415j();
        m43374z(kcfVarM35415j);
        return kcfVarM35415j;
    }

    /* renamed from: m */
    public final int m43361m() {
        return this.f39821g;
    }

    /* renamed from: n */
    public final th9 m43362n() {
        return this.f39817c;
    }

    /* renamed from: o */
    public final zh9 m43363o() {
        return this.f39817c;
    }

    /* renamed from: p */
    public final pcf m43364p() {
        pcf pcfVar = this.f39820f;
        if (pcfVar != null) {
            return pcfVar;
        }
        zh9 zh9VarM45102f = this.f39816b ? qcf.m45102f(this.f39817c, C16059e.f39826a) : null;
        if (zh9VarM45102f == null) {
            zh9VarM45102f = qcf.m45102f(this.f39817c, C16060f.f39827a);
        }
        if (zh9VarM45102f == null) {
            return null;
        }
        return qcf.m45097a(zh9VarM45102f, this.f39816b);
    }

    /* renamed from: q */
    public final long m43365q() {
        xzb xzbVarM43354e = m43354e();
        if (xzbVarM43354e != null) {
            if (!xzbVarM43354e.mo39062f()) {
                xzbVarM43354e = null;
            }
            if (xzbVarM43354e != null) {
                return nh9.m40602e(xzbVarM43354e);
            }
        }
        return s9c.f45035b.m48063c();
    }

    /* renamed from: r */
    public final List m43366r() {
        return m43359k(false, true);
    }

    /* renamed from: s */
    public final long m43367s() {
        xzb xzbVarM43354e = m43354e();
        return xzbVarM43354e != null ? xzbVarM43354e.mo39063i() : ml8.f35642a.m39313a();
    }

    /* renamed from: t */
    public final mfe m43368t() {
        rk5 rk5VarM45103g;
        if (!this.f39818d.m35420v() || (rk5VarM45103g = qcf.m45103g(this.f39817c)) == null) {
            rk5VarM45103g = this.f39815a;
        }
        return ocf.m41991c(rk5VarM45103g.mo17377h(), ocf.m41989a(this.f39818d));
    }

    /* renamed from: u */
    public final kcf m43369u() {
        return this.f39818d;
    }

    /* renamed from: v */
    public final boolean m43370v() {
        return this.f39819e;
    }

    /* renamed from: w */
    public final boolean m43371w() {
        return this.f39816b && this.f39818d.m35420v();
    }

    /* renamed from: x */
    public final boolean m43372x() {
        xzb xzbVarM43354e = m43354e();
        if (xzbVarM43354e != null) {
            return xzbVarM43354e.d1();
        }
        return false;
    }

    /* renamed from: y */
    public final boolean m43373y() {
        return !this.f39819e && m43366r().isEmpty() && qcf.m45102f(this.f39817c, C16058d.f39825a) == null;
    }

    /* renamed from: z */
    public final void m43374z(kcf kcfVar) {
        if (this.f39818d.m35419r()) {
            return;
        }
        List listM43347B = m43347B(this, false, 1, null);
        int size = listM43347B.size();
        for (int i = 0; i < size; i++) {
            pcf pcfVar = (pcf) listM43347B.get(i);
            if (!pcfVar.m43371w()) {
                kcfVar.m35421w(pcfVar.f39818d);
                pcfVar.m43374z(kcfVar);
            }
        }
    }
}
