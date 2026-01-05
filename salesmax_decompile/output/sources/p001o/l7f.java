package p001o;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public abstract class l7f {

    /* renamed from: o.l7f$a */
    public static final class C15013a extends o64 {

        /* renamed from: a */
        public Object f33372a;

        /* renamed from: b */
        public Object f33373b;

        /* renamed from: c */
        public /* synthetic */ Object f33374c;

        /* renamed from: d */
        public int f33375d;

        public C15013a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f33374c = obj;
            this.f33375d |= Integer.MIN_VALUE;
            return l7f.m36668b(null, this);
        }
    }

    /* renamed from: o.l7f$b */
    public static final class C15014b extends jgg implements nl7 {

        /* renamed from: a */
        public int f33376a;

        /* renamed from: b */
        public /* synthetic */ Object f33377b;

        /* renamed from: c */
        public final /* synthetic */ dth f33378c;

        /* renamed from: d */
        public final /* synthetic */ jw7 f33379d;

        /* renamed from: e */
        public final /* synthetic */ zdc f33380e;

        /* renamed from: f */
        public final /* synthetic */ nl7 f33381f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15014b(dth dthVar, n64 n64Var, jw7 jw7Var, zdc zdcVar, nl7 nl7Var) {
            super(2, n64Var);
            this.f33378c = dthVar;
            this.f33379d = jw7Var;
            this.f33380e = zdcVar;
            this.f33381f = nl7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C15014b c15014b = new C15014b(this.f33378c, n64Var, this.f33379d, this.f33380e, this.f33381f);
            c15014b.f33377b = obj;
            return c15014b;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f33376a;
            if (i == 0) {
                wre.m54934b(obj);
                jw7 jw7Var = this.f33379d;
                zdc zdcVar = this.f33380e;
                this.f33376a = 1;
                obj = jw7Var.mo21441a(zdcVar, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        wre.m54934b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            nl7 nl7Var = this.f33381f;
            this.f33376a = 2;
            bj8.m19245c(6);
            obj = nl7Var.invoke(obj, this);
            bj8.m19245c(7);
            return obj == objM51918f ? objM51918f : obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C15014b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.l7f$c */
    public static final class C15015c extends o64 {

        /* renamed from: a */
        public Object f33382a;

        /* renamed from: b */
        public Object f33383b;

        /* renamed from: c */
        public /* synthetic */ Object f33384c;

        /* renamed from: d */
        public int f33385d;

        public C15015c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f33384c = obj;
            this.f33385d |= Integer.MIN_VALUE;
            return l7f.m36669c(null, null, null, null, this);
        }
    }

    /* renamed from: o.l7f$d */
    public static final class C15016d extends jgg implements nl7 {

        /* renamed from: a */
        public int f33386a;

        /* renamed from: b */
        public /* synthetic */ Object f33387b;

        public C15016d(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C15016d c15016d = new C15016d(n64Var);
            c15016d.f33387b = obj;
            return c15016d;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f33386a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return this.f33387b;
        }

        @Override // p001o.nl7
        public final Object invoke(Object obj, n64 n64Var) {
            return ((C15016d) create(obj, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m36668b(jl6 jl6Var, n64 n64Var) {
        C15013a c15013a;
        jl6 jl6Var2;
        Iterator it;
        p69 p69VarM58846k;
        if (n64Var instanceof C15013a) {
            c15013a = (C15013a) n64Var;
            int i = c15013a.f33375d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15013a.f33375d = i - Integer.MIN_VALUE;
            } else {
                c15013a = new C15013a(n64Var);
            }
        }
        Object obj = c15013a.f33374c;
        Object objM51918f = uq8.m51918f();
        int i2 = c15013a.f33375d;
        if (i2 == 0) {
            wre.m54934b(obj);
            List list = (List) jl6Var.mo18191b(s38.f44646a.m47569e());
            if (list != null) {
                Iterator it2 = list.iterator();
                jl6Var2 = jl6Var;
                it = it2;
            }
            p69VarM58846k = z69.m58846k(jl6Var.mo6529D());
            c15013a.f33372a = null;
            c15013a.f33373b = null;
            c15013a.f33375d = 2;
            if (z69.m58842g(p69VarM58846k, c15013a) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return y3i.f54824a;
        }
        it = (Iterator) c15013a.f33373b;
        jl6 jl6Var3 = (jl6) c15013a.f33372a;
        wre.m54934b(obj);
        jl6Var2 = jl6Var3;
        while (it.hasNext()) {
            o18 o18Var = (o18) it.next();
            c15013a.f33372a = jl6Var2;
            c15013a.f33373b = it;
            c15013a.f33375d = 1;
            if (q18.m44672b(o18Var, c15013a) == objM51918f) {
                return objM51918f;
            }
        }
        jl6Var = jl6Var2;
        p69VarM58846k = z69.m58846k(jl6Var.mo6529D());
        c15013a.f33372a = null;
        c15013a.f33373b = null;
        c15013a.f33375d = 2;
        if (z69.m58842g(p69VarM58846k, c15013a) == objM51918f) {
        }
        return y3i.f54824a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d A[Catch: all -> 0x0106, TryCatch #1 {all -> 0x0106, blocks: (B:51:0x0109, B:53:0x010d, B:55:0x011f, B:54:0x0117, B:25:0x0092, B:27:0x00a0, B:29:0x00a6, B:31:0x00ac, B:34:0x00b4, B:39:0x00cc, B:35:0x00ba, B:38:0x00ca), top: B:63:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117 A[Catch: all -> 0x0106, TryCatch #1 {all -> 0x0106, blocks: (B:51:0x0109, B:53:0x010d, B:55:0x011f, B:54:0x0117, B:25:0x0092, B:27:0x00a0, B:29:0x00a6, B:31:0x00ac, B:34:0x00b4, B:39:0x00cc, B:35:0x00ba, B:38:0x00ca), top: B:63:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.dth] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m36669c(j7f j7fVar, jw7 jw7Var, Object obj, nl7 nl7Var, n64 n64Var) throws Throwable {
        C15015c c15015c;
        dth dthVar;
        q74 tdhVar;
        vdh vdhVarM54242K;
        g64 g64VarMo40626b;
        j7f j7fVar2 = j7fVar;
        if (n64Var instanceof C15015c) {
            c15015c = (C15015c) n64Var;
            int i = c15015c.f33385d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15015c.f33385d = i - Integer.MIN_VALUE;
            } else {
                c15015c = new C15015c(n64Var);
            }
        }
        Object objM43867g = c15015c.f33384c;
        Object objM51918f = uq8.m51918f();
        ?? r4 = c15015c.f33385d;
        try {
            try {
                if (r4 != 0) {
                    if (r4 != 1) {
                        if (r4 == 2) {
                            Object obj2 = c15015c.f33382a;
                            wre.m54934b(objM43867g);
                            return obj2;
                        }
                        if (r4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) c15015c.f33382a;
                        wre.m54934b(objM43867g);
                        throw th;
                    }
                    dth dthVar2 = (dth) c15015c.f33383b;
                    j7f j7fVar3 = (j7f) c15015c.f33382a;
                    try {
                        wre.m54934b(objM43867g);
                        dthVar = dthVar2;
                        j7fVar2 = j7fVar3;
                        dthVar.close();
                        jl6 jl6VarM33381a = j7fVar2.m33381a();
                        c15015c.f33382a = objM43867g;
                        c15015c.f33383b = null;
                        c15015c.f33385d = 2;
                        return m36668b(jl6VarM33381a, c15015c) != objM51918f ? objM51918f : objM43867g;
                    } catch (Exception e) {
                        e = e;
                        dthVar = dthVar2;
                        if (e instanceof CancellationException) {
                        }
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        r4 = dthVar2;
                        r4.close();
                        throw th;
                    }
                }
                wre.m54934b(objM43867g);
                jw7 jw7VarM57344h = y7f.m57344h(j7fVar.m33383c(), jw7Var, j7fVar2);
                zdc zdcVar = new zdc(j7fVar.m33381a(), obj);
                hwc hwcVarM21085a = cec.m21085a(j7fVar);
                dthVar = (dth) hwcVarM21085a.m31227a();
                q74 q74Var = (q74) hwcVarM21085a.m31228b();
                try {
                    wdh wdhVar = (wdh) c15015c.getContext().get(wdh.f51822c);
                    x54 x54VarMo28089a = (wdhVar == null || (vdhVarM54242K = wdhVar.m54242K()) == null || (g64VarMo40626b = vdhVarM54242K.mo40626b()) == null) ? null : g64VarMo40626b.mo28089a();
                    if (x54VarMo28089a != null) {
                        tdhVar = new tdh(x54VarMo28089a);
                    } else {
                        tdhVar = (tdh) c15015c.getContext().get(tdh.f46909c);
                        if (tdhVar == null) {
                            tdhVar = e66.f21035a;
                        }
                    }
                    q74 q74VarPlus = q74Var.plus(new eth(dthVar)).plus(tdhVar);
                    C15014b c15014b = new C15014b(dthVar, null, jw7VarM57344h, zdcVar, nl7Var);
                    c15015c.f33382a = j7fVar2;
                    c15015c.f33383b = dthVar;
                    c15015c.f33385d = 1;
                    objM43867g = pm1.m43867g(q74VarPlus, c15014b, c15015c);
                    if (objM43867g == objM51918f) {
                        return objM51918f;
                    }
                    dthVar.close();
                    jl6 jl6VarM33381a2 = j7fVar2.m33381a();
                    c15015c.f33382a = objM43867g;
                    c15015c.f33383b = null;
                    c15015c.f33385d = 2;
                    if (m36668b(jl6VarM33381a2, c15015c) != objM51918f) {
                    }
                } catch (Exception e2) {
                    e = e2;
                    if (e instanceof CancellationException) {
                        dthVar.Z0(vzf.ERROR);
                        fth.m27471a(dthVar, e, true);
                    } else {
                        fth.m27472b(dthVar, "cancelled", ml1.m39301a(true));
                    }
                    throw e;
                }
            } catch (Throwable th3) {
                jl6 jl6VarM33381a3 = j7fVar2.m33381a();
                c15015c.f33382a = th3;
                c15015c.f33383b = null;
                c15015c.f33385d = 3;
                if (m36668b(jl6VarM33381a3, c15015c) == objM51918f) {
                    return objM51918f;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: d */
    public static final String m36670d(jl6 jl6Var) {
        sq8.m48649h(jl6Var, "<this>");
        return (String) tx0.m50737b(jl6Var, s38.f44646a.m47573i());
    }

    /* renamed from: e */
    public static final Object m36671e(j7f j7fVar, jw7 jw7Var, Object obj, n64 n64Var) {
        return m36669c(j7fVar, jw7Var, obj, new C15016d(null), n64Var);
    }
}
