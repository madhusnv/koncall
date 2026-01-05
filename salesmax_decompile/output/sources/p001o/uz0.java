package p001o;

import java.util.Iterator;
import java.util.List;
import p001o.fmh;

/* loaded from: classes3.dex */
public final class uz0 implements jw7 {

    /* renamed from: a */
    public final jw7 f49676a;

    /* renamed from: b */
    public final un8 f49677b;

    /* renamed from: c */
    public final qdc f49678c;

    /* renamed from: d */
    public final h86 f49679d;

    /* renamed from: o.uz0$a */
    public static final class C17487a extends o64 {

        /* renamed from: a */
        public Object f49680a;

        /* renamed from: b */
        public Object f49681b;

        /* renamed from: c */
        public Object f49682c;

        /* renamed from: d */
        public Object f49683d;

        /* renamed from: e */
        public Object f49684e;

        /* renamed from: f */
        public Object f49685f;

        /* renamed from: g */
        public Object f49686g;

        /* renamed from: h */
        public long f49687h;

        /* renamed from: q */
        public /* synthetic */ Object f49688q;

        /* renamed from: x */
        public int f49690x;

        public C17487a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f49688q = obj;
            this.f49690x |= Integer.MIN_VALUE;
            return uz0.this.mo21441a(null, this);
        }
    }

    public uz0(jw7 jw7Var, un8 un8Var, qdc qdcVar, h86 h86Var) {
        sq8.m48649h(jw7Var, "inner");
        sq8.m48649h(un8Var, "interceptors");
        sq8.m48649h(qdcVar, "authConfig");
        this.f49676a = jw7Var;
        this.f49677b = un8Var;
        this.f49678c = qdcVar;
        this.f49679d = h86Var;
    }

    /* renamed from: d */
    public static final String m52172d(b86 b86Var) {
        return "resolved endpoint: " + b86Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0298 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0348 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0349 A[PHI: r2
      0x0349: PHI (r2v51 java.lang.Object) = (r2v49 java.lang.Object), (r2v1 java.lang.Object) binds: [B:72:0x0346, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0102 A[SYNTHETIC] */
    @Override // p001o.jw7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo21441a(zdc zdcVar, n64 n64Var) {
        C17487a c17487a;
        uz0 uz0Var;
        Iterator it;
        Object next;
        vz0 vz0Var;
        zdc zdcVar2;
        uz0 uz0Var2;
        qy7 qy7Var;
        c01 c01Var;
        qx0 qx0Var;
        long j;
        ib8 ib8Var;
        qy7 qy7VarM57643d;
        long jM27092b;
        qx0 qx0Var2;
        ib8 ib8Var2;
        qx0 qx0Var3;
        c01 c01Var2;
        zdc zdcVar3;
        uz0 uz0Var3;
        String strMo26336c;
        Object next2;
        qx0 qx0VarM50736a;
        srf srfVar;
        qy7 qy7VarM57651l;
        long jM27092b2;
        q48 q48VarMo19994c;
        zdc zdcVar4;
        zdc zdcVar5 = zdcVar;
        if (n64Var instanceof C17487a) {
            c17487a = (C17487a) n64Var;
            int i = c17487a.f49690x;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17487a.f49690x = i - Integer.MIN_VALUE;
            } else {
                c17487a = new C17487a(n64Var);
            }
        }
        Object objMo18118a = c17487a.f49688q;
        Object objM51918f = uq8.m51918f();
        switch (c17487a.f49690x) {
            case 0:
                wre.m54934b(objMo18118a);
                f01 f01VarM45204b = this.f49678c.m45204b();
                c17487a.f49680a = this;
                c17487a.f49681b = zdcVar5;
                c17487a.f49690x = 1;
                objMo18118a = f01VarM45204b.mo18118a(zdcVar5, c17487a);
                if (objMo18118a == objM51918f) {
                    return objM51918f;
                }
                uz0Var = this;
                List list = (List) objMo18118a;
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                    } else {
                        next = it.next();
                        if (uz0Var.f49678c.m45205c().containsKey(d01.m22166d(((vz0) next).mo53621a()))) {
                        }
                    }
                }
                vz0Var = (vz0) next;
                if (vz0Var != null) {
                    throw new IllegalStateException(("no auth scheme found for operation; candidates: " + list).toString());
                }
                c01 c01Var3 = (c01) uz0Var.f49678c.m45205c().get(d01.m22166d(vz0Var.mo53621a()));
                if (c01Var3 == null) {
                    throw new IllegalStateException(("auth scheme " + ((Object) d01.m22171i(vz0Var.mo53621a())) + " not configured").toString());
                }
                rx0 rx0Var = new rx0();
                rx0Var.m47216b("auth.scheme_id", c01Var3.mo19992a());
                tob tobVarM47215a = rx0Var.m47215a();
                tx0.m50739d(zdcVar5.m59254c(), vz0Var.getAttributes());
                nb8 nb8VarMo19993b = c01Var3.mo19993b(uz0Var.f49678c.m45206d());
                qy7 qy7VarM57644e = t38.m49218b(zdcVar5.m59254c()).m57644e();
                long jM27092b3 = fmh.C13489a.f23681a.m27092b();
                jl6 jl6VarM59254c = zdcVar5.m59254c();
                c17487a.f49680a = uz0Var;
                c17487a.f49681b = zdcVar5;
                c17487a.f49682c = c01Var3;
                c17487a.f49683d = tobVarM47215a;
                c17487a.f49684e = qy7VarM57644e;
                c17487a.f49687h = jM27092b3;
                c17487a.f49690x = 2;
                Object objResolve = nb8VarMo19993b.resolve(jl6VarM59254c, c17487a);
                if (objResolve == objM51918f) {
                    return objM51918f;
                }
                zdcVar2 = zdcVar5;
                uz0Var2 = uz0Var;
                qy7Var = qy7VarM57644e;
                c01Var = c01Var3;
                qx0Var = tobVarM47215a;
                objMo18118a = objResolve;
                j = jM27092b3;
                jmh jmhVar = new jmh((ib8) objMo18118a, fmh.C13489a.a.m27095h(j), null);
                ry7.m47288a(qy7Var, jmhVar.m34107a(), qx0Var, null);
                ib8Var = (ib8) jmhVar.m34108b();
                y7f.m57345i(ib8Var, zdcVar2.m59254c());
                rne rneVar = new rne(zdcVar2.m59254c(), a48.m16410f((z38) zdcVar2.m59255d(), false, 1, null), ib8Var);
                if (uz0Var2.f49679d != null) {
                    qy7VarM57643d = t38.m49218b(zdcVar2.m59254c()).m57643d();
                    qx0 qx0VarM49217a = t38.m49217a(zdcVar2.m59254c());
                    jM27092b = fmh.C13489a.f23681a.m27092b();
                    h86 h86Var = uz0Var2.f49679d;
                    c17487a.f49680a = uz0Var2;
                    c17487a.f49681b = zdcVar2;
                    c17487a.f49682c = c01Var;
                    c17487a.f49683d = qx0Var;
                    c17487a.f49684e = ib8Var;
                    c17487a.f49685f = qy7VarM57643d;
                    c17487a.f49686g = qx0VarM49217a;
                    c17487a.f49687h = jM27092b;
                    c17487a.f49690x = 3;
                    Object objMo29972a = h86Var.mo29972a(rneVar, c17487a);
                    if (objMo29972a == objM51918f) {
                        return objM51918f;
                    }
                    objMo18118a = objMo29972a;
                    qx0Var2 = qx0VarM49217a;
                    jmh jmhVar2 = new jmh((b86) objMo18118a, fmh.C13489a.a.m27095h(jM27092b), null);
                    ry7.m47288a(qy7VarM57643d, jmhVar2.m34107a(), qx0Var2, null);
                    final b86 b86Var = (b86) jmhVar2.m34108b();
                    q74 context = c17487a.getContext();
                    uk7 uk7Var = new uk7() { // from class: o.tz0
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return uz0.m52172d(b86Var);
                        }
                    };
                    fja fjaVar = fja.Debug;
                    strMo26336c = kge.m35689b(uz0.class).mo26336c();
                    if (strMo26336c != null) {
                        throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                    }
                    v74.m52399d(context, fjaVar, strMo26336c, null, uk7Var);
                    sdc.m48264b(zdcVar2, b86Var);
                    Iterator it2 = bsf.m19699a(b86Var).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (d01.m22169g(((vz0) next2).mo53621a(), c01Var.mo19992a())) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    vz0 vz0Var2 = (vz0) next2;
                    if (vz0Var2 == null || (qx0VarM50736a = vz0Var2.getAttributes()) == null) {
                        qx0VarM50736a = tx0.m50736a();
                    }
                    tx0.m50739d(zdcVar2.m59254c(), qx0VarM50736a);
                    tx0.m50739d(zdcVar2.m59254c(), b86Var.m18275a());
                }
                ib8Var2 = ib8Var;
                un8 un8Var = uz0Var2.f49677b;
                y38 y38VarM16409e = a48.m16409e((z38) zdcVar2.m59255d(), true);
                c17487a.f49680a = uz0Var2;
                c17487a.f49681b = zdcVar2;
                c17487a.f49682c = c01Var;
                c17487a.f49683d = qx0Var;
                c17487a.f49684e = ib8Var2;
                c17487a.f49685f = null;
                c17487a.f49686g = null;
                c17487a.f49690x = 4;
                objMo18118a = un8Var.m51812h(y38VarM16409e, c17487a);
                if (objMo18118a != objM51918f) {
                    return objM51918f;
                }
                qx0Var3 = qx0Var;
                c01Var2 = c01Var;
                zdcVar3 = zdcVar2;
                uz0Var3 = uz0Var2;
                zdc zdcVarM59252b = zdc.m59252b(zdcVar3, null, f48.m26053c((y38) objMo18118a), 1, null);
                uz0Var3.f49677b.m51824t(a48.m16410f((z38) zdcVarM59252b.m59255d(), false, 1, null));
                srfVar = new srf((z38) zdcVarM59252b.m59255d(), ib8Var2, zdcVarM59252b.m59254c());
                qy7VarM57651l = t38.m49218b(zdcVar3.m59254c()).m57651l();
                jM27092b2 = fmh.C13489a.f23681a.m27092b();
                q48VarMo19994c = c01Var2.mo19994c();
                c17487a.f49680a = uz0Var3;
                c17487a.f49681b = zdcVar3;
                c17487a.f49682c = c01Var2;
                c17487a.f49683d = qx0Var3;
                c17487a.f49684e = zdcVarM59252b;
                c17487a.f49685f = qy7VarM57651l;
                c17487a.f49687h = jM27092b2;
                c17487a.f49690x = 5;
                if (q48VarMo19994c.mo22493a(srfVar, c17487a) != objM51918f) {
                    return objM51918f;
                }
                zdcVar4 = zdcVarM59252b;
                jmh jmhVar3 = new jmh(y3i.f54824a, fmh.C13489a.a.m27095h(jM27092b2), null);
                ry7.m47288a(qy7VarM57651l, jmhVar3.m34107a(), qx0Var3, null);
                jmhVar3.m34108b();
                if (sq8.m48644c(c01Var2.mo19992a(), "aws.auth#sigv4a")) {
                    po1.m43953b(zdcVar3.m59254c(), pwf.SIGV4A_SIGNING);
                }
                uz0Var3.f49677b.m51818n(a48.m16410f((z38) zdcVar4.m59255d(), false, 1, null));
                jw7 jw7Var = uz0Var3.f49676a;
                c17487a.f49680a = null;
                c17487a.f49681b = null;
                c17487a.f49682c = null;
                c17487a.f49683d = null;
                c17487a.f49684e = null;
                c17487a.f49685f = null;
                c17487a.f49690x = 6;
                objMo18118a = jw7Var.mo21441a(zdcVar4, c17487a);
                return objMo18118a != objM51918f ? objM51918f : objMo18118a;
            case 1:
                zdcVar5 = (zdc) c17487a.f49681b;
                uz0Var = (uz0) c17487a.f49680a;
                wre.m54934b(objMo18118a);
                List list2 = (List) objMo18118a;
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                vz0Var = (vz0) next;
                if (vz0Var != null) {
                }
                break;
            case 2:
                j = c17487a.f49687h;
                qy7Var = (qy7) c17487a.f49684e;
                qx0 qx0Var4 = (qx0) c17487a.f49683d;
                c01 c01Var4 = (c01) c17487a.f49682c;
                zdc zdcVar6 = (zdc) c17487a.f49681b;
                uz0 uz0Var4 = (uz0) c17487a.f49680a;
                wre.m54934b(objMo18118a);
                zdcVar2 = zdcVar6;
                uz0Var2 = uz0Var4;
                qx0Var = qx0Var4;
                c01Var = c01Var4;
                jmh jmhVar4 = new jmh((ib8) objMo18118a, fmh.C13489a.a.m27095h(j), null);
                ry7.m47288a(qy7Var, jmhVar4.m34107a(), qx0Var, null);
                ib8Var = (ib8) jmhVar4.m34108b();
                y7f.m57345i(ib8Var, zdcVar2.m59254c());
                rne rneVar2 = new rne(zdcVar2.m59254c(), a48.m16410f((z38) zdcVar2.m59255d(), false, 1, null), ib8Var);
                if (uz0Var2.f49679d != null) {
                }
                ib8Var2 = ib8Var;
                un8 un8Var2 = uz0Var2.f49677b;
                y38 y38VarM16409e2 = a48.m16409e((z38) zdcVar2.m59255d(), true);
                c17487a.f49680a = uz0Var2;
                c17487a.f49681b = zdcVar2;
                c17487a.f49682c = c01Var;
                c17487a.f49683d = qx0Var;
                c17487a.f49684e = ib8Var2;
                c17487a.f49685f = null;
                c17487a.f49686g = null;
                c17487a.f49690x = 4;
                objMo18118a = un8Var2.m51812h(y38VarM16409e2, c17487a);
                if (objMo18118a != objM51918f) {
                }
                break;
            case 3:
                jM27092b = c17487a.f49687h;
                qx0Var2 = (qx0) c17487a.f49686g;
                qy7VarM57643d = (qy7) c17487a.f49685f;
                ib8Var = (ib8) c17487a.f49684e;
                qx0Var = (qx0) c17487a.f49683d;
                c01Var = (c01) c17487a.f49682c;
                zdcVar2 = (zdc) c17487a.f49681b;
                uz0Var2 = (uz0) c17487a.f49680a;
                wre.m54934b(objMo18118a);
                jmh jmhVar22 = new jmh((b86) objMo18118a, fmh.C13489a.a.m27095h(jM27092b), null);
                ry7.m47288a(qy7VarM57643d, jmhVar22.m34107a(), qx0Var2, null);
                final b86 b86Var2 = (b86) jmhVar22.m34108b();
                q74 context2 = c17487a.getContext();
                uk7 uk7Var2 = new uk7() { // from class: o.tz0
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return uz0.m52172d(b86Var2);
                    }
                };
                fja fjaVar2 = fja.Debug;
                strMo26336c = kge.m35689b(uz0.class).mo26336c();
                if (strMo26336c != null) {
                }
                break;
            case 4:
                ib8Var2 = (ib8) c17487a.f49684e;
                qx0 qx0Var5 = (qx0) c17487a.f49683d;
                c01 c01Var5 = (c01) c17487a.f49682c;
                zdc zdcVar7 = (zdc) c17487a.f49681b;
                uz0 uz0Var5 = (uz0) c17487a.f49680a;
                wre.m54934b(objMo18118a);
                c01Var2 = c01Var5;
                zdcVar3 = zdcVar7;
                uz0Var3 = uz0Var5;
                qx0Var3 = qx0Var5;
                zdc zdcVarM59252b2 = zdc.m59252b(zdcVar3, null, f48.m26053c((y38) objMo18118a), 1, null);
                uz0Var3.f49677b.m51824t(a48.m16410f((z38) zdcVarM59252b2.m59255d(), false, 1, null));
                srfVar = new srf((z38) zdcVarM59252b2.m59255d(), ib8Var2, zdcVarM59252b2.m59254c());
                qy7VarM57651l = t38.m49218b(zdcVar3.m59254c()).m57651l();
                jM27092b2 = fmh.C13489a.f23681a.m27092b();
                q48VarMo19994c = c01Var2.mo19994c();
                c17487a.f49680a = uz0Var3;
                c17487a.f49681b = zdcVar3;
                c17487a.f49682c = c01Var2;
                c17487a.f49683d = qx0Var3;
                c17487a.f49684e = zdcVarM59252b2;
                c17487a.f49685f = qy7VarM57651l;
                c17487a.f49687h = jM27092b2;
                c17487a.f49690x = 5;
                if (q48VarMo19994c.mo22493a(srfVar, c17487a) != objM51918f) {
                }
                break;
            case 5:
                jM27092b2 = c17487a.f49687h;
                qy7VarM57651l = (qy7) c17487a.f49685f;
                zdcVar4 = (zdc) c17487a.f49684e;
                qx0Var3 = (qx0) c17487a.f49683d;
                c01Var2 = (c01) c17487a.f49682c;
                zdcVar3 = (zdc) c17487a.f49681b;
                uz0Var3 = (uz0) c17487a.f49680a;
                wre.m54934b(objMo18118a);
                jmh jmhVar32 = new jmh(y3i.f54824a, fmh.C13489a.a.m27095h(jM27092b2), null);
                ry7.m47288a(qy7VarM57651l, jmhVar32.m34107a(), qx0Var3, null);
                jmhVar32.m34108b();
                if (sq8.m48644c(c01Var2.mo19992a(), "aws.auth#sigv4a")) {
                }
                uz0Var3.f49677b.m51818n(a48.m16410f((z38) zdcVar4.m59255d(), false, 1, null));
                jw7 jw7Var2 = uz0Var3.f49676a;
                c17487a.f49680a = null;
                c17487a.f49681b = null;
                c17487a.f49682c = null;
                c17487a.f49683d = null;
                c17487a.f49684e = null;
                c17487a.f49685f = null;
                c17487a.f49690x = 6;
                objMo18118a = jw7Var2.mo21441a(zdcVar4, c17487a);
                if (objMo18118a != objM51918f) {
                }
                break;
            case 6:
                wre.m54934b(objMo18118a);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
