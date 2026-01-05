package p001o;

/* loaded from: classes2.dex */
public abstract class xwf {

    /* renamed from: e */
    public static final C18260a f54441e = new C18260a(null);

    /* renamed from: f */
    public static final int f54442f = 8;

    /* renamed from: a */
    public axf f54443a;

    /* renamed from: b */
    public int f54444b;

    /* renamed from: c */
    public boolean f54445c;

    /* renamed from: d */
    public int f54446d;

    /* renamed from: o.xwf$a */
    public static final class C18260a {

        /* renamed from: o.xwf$a$a */
        public static final class a implements o9c {

            /* renamed from: a */
            public final /* synthetic */ nl7 f54447a;

            public a(nl7 nl7Var) {
                this.f54447a = nl7Var;
            }

            @Override // p001o.o9c
            public final void dispose() {
                nl7 nl7Var = this.f54447a;
                synchronized (exf.m25775G()) {
                    exf.f22344h.remove(nl7Var);
                    y3i y3iVar = y3i.f54824a;
                }
            }
        }

        /* renamed from: o.xwf$a$b */
        public static final class b implements o9c {

            /* renamed from: a */
            public final /* synthetic */ xk7 f54448a;

            public b(xk7 xk7Var) {
                this.f54448a = xk7Var;
            }

            @Override // p001o.o9c
            public final void dispose() {
                xk7 xk7Var = this.f54448a;
                synchronized (exf.m25775G()) {
                    exf.f22345i.remove(xk7Var);
                }
                exf.m25820z();
            }
        }

        public C18260a() {
        }

        public /* synthetic */ C18260a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final xwf m56927a() {
            return exf.m25771C((xwf) exf.f22338b.m56939a(), null, false, 6, null);
        }

        /* renamed from: b */
        public final xwf m56928b() {
            return exf.m25774F();
        }

        /* renamed from: c */
        public final void m56929c() {
            exf.m25774F().mo17687o();
        }

        /* renamed from: d */
        public final Object m56930d(xk7 xk7Var, xk7 xk7Var2, uk7 uk7Var) {
            xwf mwhVar;
            sq8.m48649h(uk7Var, "block");
            if (xk7Var == null && xk7Var2 == null) {
                return uk7Var.invoke();
            }
            xwf xwfVar = (xwf) exf.f22338b.m56939a();
            if (xwfVar == null || (xwfVar instanceof aqb)) {
                mwhVar = new mwh(xwfVar instanceof aqb ? (aqb) xwfVar : null, xk7Var, xk7Var2, true, false);
            } else {
                if (xk7Var == null) {
                    return uk7Var.invoke();
                }
                mwhVar = xwfVar.mo17691x(xk7Var);
            }
            try {
                xwf xwfVarM56921l = mwhVar.m56921l();
                try {
                    return uk7Var.invoke();
                } finally {
                    mwhVar.m56923s(xwfVarM56921l);
                }
            } finally {
                mwhVar.mo17680d();
            }
        }

        /* renamed from: e */
        public final o9c m56931e(nl7 nl7Var) {
            sq8.m48649h(nl7Var, "observer");
            exf.m25819y(exf.f22337a);
            synchronized (exf.m25775G()) {
                exf.f22344h.add(nl7Var);
            }
            return new a(nl7Var);
        }

        /* renamed from: f */
        public final o9c m56932f(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "observer");
            synchronized (exf.m25775G()) {
                exf.f22345i.add(xk7Var);
            }
            exf.m25820z();
            return new b(xk7Var);
        }

        /* renamed from: g */
        public final void m56933g() {
            boolean z;
            synchronized (exf.m25775G()) {
                lb8 lb8VarMo17665E = ((rt7) exf.f22346j.get()).mo17665E();
                z = false;
                if (lb8VarMo17665E != null) {
                    if (lb8VarMo17665E.m36857r()) {
                        z = true;
                    }
                }
            }
            if (z) {
                exf.m25820z();
            }
        }

        /* renamed from: h */
        public final aqb m56934h(xk7 xk7Var, xk7 xk7Var2) {
            aqb aqbVarMo17676P;
            xwf xwfVarM25774F = exf.m25774F();
            aqb aqbVar = xwfVarM25774F instanceof aqb ? (aqb) xwfVarM25774F : null;
            if (aqbVar == null || (aqbVarMo17676P = aqbVar.mo17676P(xk7Var, xk7Var2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return aqbVarMo17676P;
        }
    }

    public /* synthetic */ xwf(int i, axf axfVar, id5 id5Var) {
        this(i, axfVar);
    }

    /* renamed from: b */
    public final void m56919b() {
        synchronized (exf.m25775G()) {
            mo17679c();
            mo17689r();
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: c */
    public void mo17679c() {
        exf.f22340d = exf.f22340d.m17955r(mo39744f());
    }

    /* renamed from: d */
    public void mo17680d() {
        this.f54445c = true;
        synchronized (exf.m25775G()) {
            m56922q();
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: e */
    public final boolean m56920e() {
        return this.f54445c;
    }

    /* renamed from: f */
    public int mo39744f() {
        return this.f54444b;
    }

    /* renamed from: g */
    public axf mo39745g() {
        return this.f54443a;
    }

    /* renamed from: h */
    public abstract xk7 mo17681h();

    /* renamed from: i */
    public abstract boolean mo17682i();

    /* renamed from: j */
    public int mo17683j() {
        return 0;
    }

    /* renamed from: k */
    public abstract xk7 mo17684k();

    /* renamed from: l */
    public xwf m56921l() {
        xwf xwfVar = (xwf) exf.f22338b.m56939a();
        exf.f22338b.m56940b(this);
        return xwfVar;
    }

    /* renamed from: m */
    public abstract void mo17685m(xwf xwfVar);

    /* renamed from: n */
    public abstract void mo17686n(xwf xwfVar);

    /* renamed from: o */
    public abstract void mo17687o();

    /* renamed from: p */
    public abstract void mo17688p(d5g d5gVar);

    /* renamed from: q */
    public final void m56922q() {
        int i = this.f54446d;
        if (i >= 0) {
            exf.m25791W(i);
            this.f54446d = -1;
        }
    }

    /* renamed from: r */
    public void mo17689r() {
        m56922q();
    }

    /* renamed from: s */
    public void m56923s(xwf xwfVar) {
        exf.f22338b.m56940b(xwfVar);
    }

    /* renamed from: t */
    public final void m56924t(boolean z) {
        this.f54445c = z;
    }

    /* renamed from: u */
    public void mo39746u(int i) {
        this.f54444b = i;
    }

    /* renamed from: v */
    public void mo39747v(axf axfVar) {
        sq8.m48649h(axfVar, "<set-?>");
        this.f54443a = axfVar;
    }

    /* renamed from: w */
    public void mo17690w(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    /* renamed from: x */
    public abstract xwf mo17691x(xk7 xk7Var);

    /* renamed from: y */
    public final int m56925y() {
        int i = this.f54446d;
        this.f54446d = -1;
        return i;
    }

    /* renamed from: z */
    public final void m56926z() {
        if (!(!this.f54445c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }

    public xwf(int i, axf axfVar) {
        this.f54443a = axfVar;
        this.f54444b = i;
        this.f54446d = i != 0 ? exf.a0(i, mo39745g()) : -1;
    }
}
