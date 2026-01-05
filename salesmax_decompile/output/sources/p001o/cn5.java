package p001o;

import p001o.m28;

/* loaded from: classes3.dex */
public final class cn5 implements jw7 {

    /* renamed from: a */
    public final jw7 f18369a;

    /* renamed from: b */
    public final m28 f18370b;

    /* renamed from: c */
    public final un8 f18371c;

    /* renamed from: o.cn5$a */
    public static final class C12713a extends o64 {

        /* renamed from: a */
        public Object f18372a;

        /* renamed from: b */
        public Object f18373b;

        /* renamed from: c */
        public Object f18374c;

        /* renamed from: d */
        public /* synthetic */ Object f18375d;

        /* renamed from: f */
        public int f18377f;

        public C12713a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f18375d = obj;
            this.f18377f |= Integer.MIN_VALUE;
            return cn5.this.mo21441a(null, this);
        }
    }

    public cn5(jw7 jw7Var, m28 m28Var, un8 un8Var) {
        sq8.m48649h(jw7Var, "inner");
        sq8.m48649h(m28Var, "deserializer");
        sq8.m48649h(un8Var, "interceptors");
        this.f18369a = jw7Var;
        this.f18370b = m28Var;
        this.f18371c = un8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.jw7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo21441a(zdc zdcVar, n64 n64Var) {
        C12713a c12713a;
        cn5 cn5Var;
        zdc zdcVar2;
        o18 o18Var;
        o18 o18VarM41344c;
        m28 m28Var;
        cn5 cn5Var2;
        zdc zdcVar3;
        if (n64Var instanceof C12713a) {
            c12713a = (C12713a) n64Var;
            int i = c12713a.f18377f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12713a.f18377f = i - Integer.MIN_VALUE;
            } else {
                c12713a = new C12713a(n64Var);
            }
        }
        Object objMo21441a = c12713a.f18375d;
        Object objM51918f = uq8.m51918f();
        int i2 = c12713a.f18377f;
        if (i2 == 0) {
            wre.m54934b(objMo21441a);
            jw7 jw7Var = this.f18369a;
            c12713a.f18372a = this;
            c12713a.f18373b = zdcVar;
            c12713a.f18377f = 1;
            objMo21441a = jw7Var.mo21441a(zdcVar, c12713a);
            if (objMo21441a == objM51918f) {
                return objM51918f;
            }
            cn5Var = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o18VarM41344c = (o18) c12713a.f18373b;
                        cn5Var2 = (cn5) c12713a.f18372a;
                        wre.m54934b(objMo21441a);
                        cn5Var2.f18371c.m51815k(objMo21441a, o18VarM41344c);
                        return objMo21441a;
                    }
                    o18VarM41344c = (o18) c12713a.f18374c;
                    zdcVar3 = (zdc) c12713a.f18373b;
                    cn5Var2 = (cn5) c12713a.f18372a;
                    wre.m54934b(objMo21441a);
                    objMo21441a = ((m28.InterfaceC15203a) cn5Var2.f18370b).mo16296b(zdcVar3.m59254c(), o18VarM41344c, (byte[]) objMo21441a);
                    cn5Var2.f18371c.m51815k(objMo21441a, o18VarM41344c);
                    return objMo21441a;
                }
                o18Var = (o18) c12713a.f18374c;
                zdc zdcVar4 = (zdc) c12713a.f18373b;
                cn5 cn5Var3 = (cn5) c12713a.f18372a;
                wre.m54934b(objMo21441a);
                zdcVar2 = zdcVar4;
                cn5Var = cn5Var3;
                o18VarM41344c = o18.m41344c(o18Var, null, (g48) objMo21441a, 1, null);
                cn5Var.f18371c.m51821q(o18VarM41344c);
                m28Var = cn5Var.f18370b;
                if (m28Var instanceof m28.InterfaceC15203a) {
                    if (!(m28Var instanceof m28.InterfaceC15204b)) {
                        throw new szb();
                    }
                    jl6 jl6VarM59254c = zdcVar2.m59254c();
                    c12713a.f18372a = cn5Var;
                    c12713a.f18373b = o18VarM41344c;
                    c12713a.f18374c = null;
                    c12713a.f18377f = 4;
                    objMo21441a = ((m28.InterfaceC15204b) m28Var).mo38219a(jl6VarM59254c, o18VarM41344c, c12713a);
                    if (objMo21441a == objM51918f) {
                        return objM51918f;
                    }
                    cn5Var2 = cn5Var;
                    cn5Var2.f18371c.m51815k(objMo21441a, o18VarM41344c);
                    return objMo21441a;
                }
                m18 body = o18VarM41344c.m41347f().getBody();
                c12713a.f18372a = cn5Var;
                c12713a.f18373b = zdcVar2;
                c12713a.f18374c = o18VarM41344c;
                c12713a.f18377f = 3;
                objMo21441a = n18.m39980a(body, c12713a);
                if (objMo21441a == objM51918f) {
                    return objM51918f;
                }
                cn5Var2 = cn5Var;
                zdcVar3 = zdcVar2;
                objMo21441a = ((m28.InterfaceC15203a) cn5Var2.f18370b).mo16296b(zdcVar3.m59254c(), o18VarM41344c, (byte[]) objMo21441a);
                cn5Var2.f18371c.m51815k(objMo21441a, o18VarM41344c);
                return objMo21441a;
            }
            zdcVar = (zdc) c12713a.f18373b;
            cn5Var = (cn5) c12713a.f18372a;
            wre.m54934b(objMo21441a);
        }
        o18 o18Var2 = (o18) objMo21441a;
        un8 un8Var = cn5Var.f18371c;
        c12713a.f18372a = cn5Var;
        c12713a.f18373b = zdcVar;
        c12713a.f18374c = o18Var2;
        c12713a.f18377f = 2;
        Object objM51809e = un8Var.m51809e(o18Var2, c12713a);
        if (objM51809e == objM51918f) {
            return objM51918f;
        }
        zdcVar2 = zdcVar;
        o18Var = o18Var2;
        objMo21441a = objM51809e;
        o18VarM41344c = o18.m41344c(o18Var, null, (g48) objMo21441a, 1, null);
        cn5Var.f18371c.m51821q(o18VarM41344c);
        m28Var = cn5Var.f18370b;
        if (m28Var instanceof m28.InterfaceC15203a) {
        }
    }
}
