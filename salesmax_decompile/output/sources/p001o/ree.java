package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class ree implements g6f, qee {

    /* renamed from: h */
    public static final C16595a f43446h = new C16595a(null);

    /* renamed from: a */
    public int f43447a;

    /* renamed from: b */
    public tee f43448b;

    /* renamed from: c */
    public sc0 f43449c;

    /* renamed from: d */
    public nl7 f43450d;

    /* renamed from: e */
    public int f43451e;

    /* renamed from: f */
    public jb8 f43452f;

    /* renamed from: g */
    public kb8 f43453g;

    /* renamed from: o.ree$a */
    public static final class C16595a {
        public C16595a() {
        }

        public /* synthetic */ C16595a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m46619a(gwf gwfVar, List list, tee teeVar) {
            sq8.m48649h(gwfVar, "slots");
            sq8.m48649h(list, "anchors");
            sq8.m48649h(teeVar, "newOwner");
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object objP0 = gwfVar.P0((sc0) list.get(i), 0);
                    ree reeVar = objP0 instanceof ree ? (ree) objP0 : null;
                    if (reeVar != null) {
                        reeVar.m46599g(teeVar);
                    }
                }
            }
        }
    }

    /* renamed from: o.ree$b */
    public static final class C16596b extends kf9 implements xk7 {

        /* renamed from: b */
        public final /* synthetic */ int f43455b;

        /* renamed from: c */
        public final /* synthetic */ jb8 f43456c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16596b(int i, jb8 jb8Var) {
            super(1);
            this.f43455b = i;
            this.f43456c = jb8Var;
        }

        /* renamed from: a */
        public final void m46620a(ap3 ap3Var) {
            sq8.m48649h(ap3Var, "composition");
            if (ree.this.f43451e == this.f43455b && sq8.m48644c(this.f43456c, ree.this.f43452f) && (ap3Var instanceof fp3)) {
                jb8 jb8Var = this.f43456c;
                int i = this.f43455b;
                ree reeVar = ree.this;
                Object[] objArrM33470e = jb8Var.m33470e();
                int[] iArrM33472g = jb8Var.m33472g();
                int iM33471f = jb8Var.m33471f();
                int i2 = 0;
                for (int i3 = 0; i3 < iM33471f; i3++) {
                    Object obj = objArrM33470e[i3];
                    sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i4 = iArrM33472g[i3];
                    boolean z = i4 != i;
                    if (z) {
                        fp3 fp3Var = (fp3) ap3Var;
                        fp3Var.m27281D(obj, reeVar);
                        im5 im5Var = obj instanceof im5 ? (im5) obj : null;
                        if (im5Var != null) {
                            fp3Var.m27280C(im5Var);
                            kb8 kb8Var = reeVar.f43453g;
                            if (kb8Var != null) {
                                kb8Var.m35358k(im5Var);
                                if (kb8Var.m35355h() == 0) {
                                    reeVar.f43453g = null;
                                }
                            }
                        }
                    }
                    if (!z) {
                        if (i2 != i3) {
                            objArrM33470e[i2] = obj;
                            iArrM33472g[i2] = i4;
                        }
                        i2++;
                    }
                }
                for (int i5 = i2; i5 < iM33471f; i5++) {
                    objArrM33470e[i5] = null;
                }
                jb8Var.f30086a = i2;
                if (this.f43456c.m33471f() == 0) {
                    ree.this.f43452f = null;
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m46620a((ap3) obj);
            return y3i.f54824a;
        }
    }

    public ree(tee teeVar) {
        this.f43448b = teeVar;
    }

    /* renamed from: A */
    public final void m46594A(boolean z) {
        if (z) {
            this.f43447a |= 8;
        } else {
            this.f43447a &= -9;
        }
    }

    /* renamed from: B */
    public final void m46595B(boolean z) {
        if (z) {
            this.f43447a |= 32;
        } else {
            this.f43447a &= -33;
        }
    }

    /* renamed from: C */
    public final void m46596C(boolean z) {
        if (z) {
            this.f43447a |= 16;
        } else {
            this.f43447a &= -17;
        }
    }

    /* renamed from: D */
    public final void m46597D(boolean z) {
        if (z) {
            this.f43447a |= 1;
        } else {
            this.f43447a &= -2;
        }
    }

    /* renamed from: E */
    public final void m46598E(int i) {
        this.f43451e = i;
        m46596C(false);
    }

    @Override // p001o.g6f
    /* renamed from: a */
    public void mo28099a(nl7 nl7Var) {
        sq8.m48649h(nl7Var, "block");
        this.f43450d = nl7Var;
    }

    /* renamed from: g */
    public final void m46599g(tee teeVar) {
        sq8.m48649h(teeVar, "owner");
        this.f43448b = teeVar;
    }

    /* renamed from: h */
    public final void m46600h(un3 un3Var) {
        y3i y3iVar;
        sq8.m48649h(un3Var, "composer");
        nl7 nl7Var = this.f43450d;
        if (nl7Var != null) {
            nl7Var.invoke(un3Var, 1);
            y3iVar = y3i.f54824a;
        } else {
            y3iVar = null;
        }
        if (y3iVar == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    /* renamed from: i */
    public final xk7 m46601i(int i) {
        jb8 jb8Var = this.f43452f;
        if (jb8Var == null || m46607o()) {
            return null;
        }
        Object[] objArrM33470e = jb8Var.m33470e();
        int[] iArrM33472g = jb8Var.m33472g();
        int iM33471f = jb8Var.m33471f();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= iM33471f) {
                break;
            }
            sq8.m48647f(objArrM33470e[i2], "null cannot be cast to non-null type kotlin.Any");
            if (iArrM33472g[i2] != i) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return new C16596b(i, jb8Var);
        }
        return null;
    }

    @Override // p001o.qee
    public void invalidate() {
        tee teeVar = this.f43448b;
        if (teeVar != null) {
            teeVar.mo27287d(this, null);
        }
    }

    /* renamed from: j */
    public final sc0 m46602j() {
        return this.f43449c;
    }

    /* renamed from: k */
    public final boolean m46603k() {
        return this.f43450d != null;
    }

    /* renamed from: l */
    public final boolean m46604l() {
        return (this.f43447a & 2) != 0;
    }

    /* renamed from: m */
    public final boolean m46605m() {
        return (this.f43447a & 8) != 0;
    }

    /* renamed from: n */
    public final boolean m46606n() {
        return (this.f43447a & 32) != 0;
    }

    /* renamed from: o */
    public final boolean m46607o() {
        return (this.f43447a & 16) != 0;
    }

    /* renamed from: p */
    public final boolean m46608p() {
        return (this.f43447a & 1) != 0;
    }

    /* renamed from: q */
    public final boolean m46609q() {
        if (this.f43448b == null) {
            return false;
        }
        sc0 sc0Var = this.f43449c;
        return sc0Var != null ? sc0Var.m48145b() : false;
    }

    /* renamed from: r */
    public final lv8 m46610r(Object obj) {
        lv8 lv8VarMo27287d;
        tee teeVar = this.f43448b;
        return (teeVar == null || (lv8VarMo27287d = teeVar.mo27287d(this, obj)) == null) ? lv8.IGNORED : lv8VarMo27287d;
    }

    /* renamed from: s */
    public final boolean m46611s() {
        return this.f43453g != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:14:0x001c->B:34:?, LOOP_END, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m46612t(lb8 lb8Var) {
        kb8 kb8Var;
        boolean z;
        boolean z2;
        if (lb8Var != null && (kb8Var = this.f43453g) != null && lb8Var.m36857r()) {
            if (lb8Var.isEmpty()) {
                z2 = true;
                if (!z2) {
                    return false;
                }
            } else {
                for (Object obj : lb8Var) {
                    if (!(obj instanceof im5)) {
                        z = false;
                        if (z) {
                            z2 = false;
                            break;
                        }
                    } else {
                        im5 im5Var = (im5) obj;
                        pxf pxfVarMo30769a = im5Var.mo30769a();
                        if (pxfVarMo30769a == null) {
                            pxfVarMo30769a = qxf.m45957h();
                        }
                        if (pxfVarMo30769a.mo32849b(im5Var.mo30770q().mo30775a(), kb8Var.m35353f(im5Var))) {
                            z = true;
                        }
                        if (z) {
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
        }
        return true;
    }

    /* renamed from: u */
    public final boolean m46613u(Object obj) {
        sq8.m48649h(obj, "instance");
        if (m46606n()) {
            return false;
        }
        jb8 jb8Var = this.f43452f;
        if (jb8Var == null) {
            jb8Var = new jb8();
            this.f43452f = jb8Var;
        }
        if (jb8Var.m33467b(obj, this.f43451e) == this.f43451e) {
            return true;
        }
        if (obj instanceof im5) {
            kb8 kb8Var = this.f43453g;
            if (kb8Var == null) {
                kb8Var = new kb8(0, 1, null);
                this.f43453g = kb8Var;
            }
            kb8Var.m35359l(obj, ((im5) obj).mo30770q().mo30775a());
        }
        return false;
    }

    /* renamed from: v */
    public final void m46614v() {
        tee teeVar = this.f43448b;
        if (teeVar != null) {
            teeVar.mo27290g(this);
        }
        this.f43448b = null;
        this.f43452f = null;
        this.f43453g = null;
    }

    /* renamed from: w */
    public final void m46615w() {
        jb8 jb8Var;
        tee teeVar = this.f43448b;
        if (teeVar == null || (jb8Var = this.f43452f) == null) {
            return;
        }
        m46595B(true);
        try {
            Object[] objArrM33470e = jb8Var.m33470e();
            int[] iArrM33472g = jb8Var.m33472g();
            int iM33471f = jb8Var.m33471f();
            for (int i = 0; i < iM33471f; i++) {
                Object obj = objArrM33470e[i];
                sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.Any");
                int i2 = iArrM33472g[i];
                teeVar.mo27284a(obj);
            }
        } finally {
            m46595B(false);
        }
    }

    /* renamed from: x */
    public final void m46616x() {
        m46596C(true);
    }

    /* renamed from: y */
    public final void m46617y(sc0 sc0Var) {
        this.f43449c = sc0Var;
    }

    /* renamed from: z */
    public final void m46618z(boolean z) {
        if (z) {
            this.f43447a |= 4;
        } else {
            this.f43447a &= -5;
        }
    }
}
