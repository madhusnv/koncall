package p001o;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.CancellationException;
import p001o.vre;

/* loaded from: classes3.dex */
public final class ose implements ueb {

    /* renamed from: a */
    public final vse f38827a;

    /* renamed from: b */
    public final tse f38828b;

    /* renamed from: c */
    public final un8 f38829c;

    /* renamed from: o.ose$a */
    public static final class C15885a extends jgg implements nl7 {

        /* renamed from: a */
        public int f38830a;

        /* renamed from: b */
        public /* synthetic */ Object f38831b;

        /* renamed from: c */
        public final /* synthetic */ dth f38832c;

        /* renamed from: d */
        public final /* synthetic */ ose f38833d;

        /* renamed from: e */
        public final /* synthetic */ zdc f38834e;

        /* renamed from: f */
        public final /* synthetic */ jw7 f38835f;

        /* renamed from: g */
        public final /* synthetic */ ege f38836g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15885a(dth dthVar, n64 n64Var, ose oseVar, zdc zdcVar, jw7 jw7Var, ege egeVar) {
            super(2, n64Var);
            this.f38832c = dthVar;
            this.f38833d = oseVar;
            this.f38834e = zdcVar;
            this.f38835f = jw7Var;
            this.f38836g = egeVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C15885a c15885a = new C15885a(this.f38832c, n64Var, this.f38833d, this.f38834e, this.f38835f, this.f38836g);
            c15885a.f38831b = obj;
            return c15885a;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Object objM42632f;
            Object objM51918f = uq8.m51918f();
            int i = this.f38830a;
            if (i == 0) {
                wre.m54934b(obj);
                ose oseVar = this.f38833d;
                zdc zdcVar = this.f38834e;
                jw7 jw7Var = this.f38835f;
                int i2 = this.f38836g.f21602a;
                this.f38830a = 1;
                objM42632f = oseVar.m42632f(zdcVar, jw7Var, i2, this);
                if (objM42632f == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                objM42632f = ((vre) obj).m53359j();
            }
            return vre.m53350a(objM42632f);
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C15885a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.ose$b */
    public static final class C15886b extends o64 {

        /* renamed from: a */
        public Object f38837a;

        /* renamed from: b */
        public Object f38838b;

        /* renamed from: c */
        public Object f38839c;

        /* renamed from: d */
        public /* synthetic */ Object f38840d;

        /* renamed from: f */
        public int f38842f;

        public C15886b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f38840d = obj;
            this.f38842f |= Integer.MIN_VALUE;
            return ose.this.mo36732b(null, null, this);
        }
    }

    /* renamed from: o.ose$c */
    public static final class C15887c extends jgg implements xk7 {

        /* renamed from: a */
        public Object f38843a;

        /* renamed from: b */
        public int f38844b;

        /* renamed from: c */
        public final /* synthetic */ ege f38845c;

        /* renamed from: d */
        public final /* synthetic */ ose f38846d;

        /* renamed from: e */
        public final /* synthetic */ zdc f38847e;

        /* renamed from: f */
        public final /* synthetic */ jw7 f38848f;

        /* renamed from: o.ose$c$a */
        public static final class a implements uk7 {

            /* renamed from: a */
            public final /* synthetic */ ege f38849a;

            public a(ege egeVar) {
                this.f38849a = egeVar;
            }

            @Override // p001o.uk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "retrying request, attempt " + this.f38849a.f21602a;
            }
        }

        /* renamed from: o.ose$c$b */
        public static final class b extends jgg implements nl7 {

            /* renamed from: a */
            public int f38850a;

            /* renamed from: b */
            public /* synthetic */ Object f38851b;

            /* renamed from: c */
            public final /* synthetic */ dth f38852c;

            /* renamed from: d */
            public final /* synthetic */ ose f38853d;

            /* renamed from: e */
            public final /* synthetic */ zdc f38854e;

            /* renamed from: f */
            public final /* synthetic */ ege f38855f;

            /* renamed from: g */
            public final /* synthetic */ jw7 f38856g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(dth dthVar, n64 n64Var, ose oseVar, zdc zdcVar, ege egeVar, jw7 jw7Var) {
                super(2, n64Var);
                this.f38852c = dthVar;
                this.f38853d = oseVar;
                this.f38854e = zdcVar;
                this.f38855f = egeVar;
                this.f38856g = jw7Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                b bVar = new b(this.f38852c, n64Var, this.f38853d, this.f38854e, this.f38855f, this.f38856g);
                bVar.f38851b = obj;
                return bVar;
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                Object objM42632f;
                Object objM51918f = uq8.m51918f();
                int i = this.f38850a;
                if (i == 0) {
                    wre.m54934b(obj);
                    h84 h84Var = (h84) this.f38851b;
                    ob9 ob9VarM35689b = kge.m35689b(this.f38853d.f38827a.getClass());
                    if (sq8.m48644c(ob9VarM35689b, kge.m35689b(m3g.class))) {
                        po1.m43953b(this.f38854e.m59254c(), pwf.RETRY_MODE_STANDARD);
                    } else if (sq8.m48644c(ob9VarM35689b, kge.m35689b(zv.class))) {
                        po1.m43953b(this.f38854e.m59254c(), pwf.RETRY_MODE_ADAPTIVE);
                    }
                    if (this.f38855f.f21602a > 1) {
                        q74 q74VarMo6529D = h84Var.mo6529D();
                        a aVar = new a(this.f38855f);
                        fja fjaVar = fja.Debug;
                        String strMo26336c = kge.m35689b(ose.class).mo26336c();
                        if (strMo26336c == null) {
                            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                        }
                        v74.m52399d(q74VarMo6529D, fjaVar, strMo26336c, null, aVar);
                    }
                    zdc zdcVarM16966a = aec.m16966a(this.f38854e);
                    ose oseVar = this.f38853d;
                    jw7 jw7Var = this.f38856g;
                    int i2 = this.f38855f.f21602a;
                    this.f38850a = 1;
                    objM42632f = oseVar.m42632f(zdcVarM16966a, jw7Var, i2, this);
                    if (objM42632f == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    objM42632f = ((vre) obj).m53359j();
                }
                this.f38855f.f21602a++;
                wre.m54934b(objM42632f);
                return objM42632f;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15887c(ege egeVar, ose oseVar, zdc zdcVar, jw7 jw7Var, n64 n64Var) {
            super(1, n64Var);
            this.f38845c = egeVar;
            this.f38846d = oseVar;
            this.f38847e = zdcVar;
            this.f38848f = jw7Var;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C15887c(this.f38845c, this.f38846d, this.f38847e, this.f38848f, n64Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:6:0x000f, B:41:0x00da, B:43:0x00de, B:45:0x00f0, B:44:0x00e8), top: B:50:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e8 A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:6:0x000f, B:41:0x00da, B:43:0x00de, B:45:0x00f0, B:44:0x00e8), top: B:50:0x0007 }] */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v1, types: [o.dth] */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            dth dthVar;
            Exception e;
            q74 tdhVar;
            vdh vdhVarM54242K;
            g64 g64VarMo40626b;
            ?? M51918f = uq8.m51918f();
            int i = this.f38844b;
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dthVar = (dth) this.f38843a;
                    try {
                        wre.m54934b(obj);
                        dthVar.close();
                        return obj;
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
                }
                wre.m54934b(obj);
                String str = "Attempt-" + this.f38845c.f21602a;
                ose oseVar = this.f38846d;
                zdc zdcVar = this.f38847e;
                ege egeVar = this.f38845c;
                jw7 jw7Var = this.f38848f;
                qx0 qx0VarM50736a = tx0.m50736a();
                uzf uzfVar = uzf.INTERNAL;
                e66 e66Var = e66.f21035a;
                String strMo26336c = kge.m35689b(ose.class).mo26336c();
                if (strMo26336c == null) {
                    throw new IllegalArgumentException("withSpan<T> cannot be used on an anonymous object".toString());
                }
                dth dthVarMo31126a = xdh.m56098a(getContext()).mo40628d().mo34509a(strMo26336c).mo31126a(str, qx0VarM50736a, uzfVar, udh.m51389a(getContext()));
                try {
                    wdh wdhVar = (wdh) getContext().get(wdh.f51822c);
                    x54 x54VarMo28089a = (wdhVar == null || (vdhVarM54242K = wdhVar.m54242K()) == null || (g64VarMo40626b = vdhVarM54242K.mo40626b()) == null) ? null : g64VarMo40626b.mo28089a();
                    if (x54VarMo28089a != null) {
                        tdhVar = new tdh(x54VarMo28089a);
                    } else {
                        tdhVar = (tdh) getContext().get(tdh.f46909c);
                        if (tdhVar == null) {
                            tdhVar = e66Var;
                        }
                    }
                    q74 q74VarPlus = e66Var.plus(new eth(dthVarMo31126a)).plus(tdhVar);
                    b bVar = new b(dthVarMo31126a, null, oseVar, zdcVar, egeVar, jw7Var);
                    this.f38843a = dthVarMo31126a;
                    this.f38844b = 1;
                    Object objM43867g = pm1.m43867g(q74VarPlus, bVar, this);
                    if (objM43867g == M51918f) {
                        return M51918f;
                    }
                    dthVar = dthVarMo31126a;
                    obj = objM43867g;
                    dthVar.close();
                    return obj;
                } catch (Exception e3) {
                    dthVar = dthVarMo31126a;
                    e = e3;
                    if (e instanceof CancellationException) {
                    }
                    throw e;
                } catch (Throwable th) {
                    M51918f = dthVarMo31126a;
                    th = th;
                    M51918f.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C15887c) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.ose$d */
    public static final class C15888d extends o64 {

        /* renamed from: a */
        public Object f38857a;

        /* renamed from: b */
        public Object f38858b;

        /* renamed from: c */
        public Object f38859c;

        /* renamed from: d */
        public int f38860d;

        /* renamed from: e */
        public /* synthetic */ Object f38861e;

        /* renamed from: g */
        public int f38863g;

        public C15888d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f38861e = obj;
            this.f38863g |= Integer.MIN_VALUE;
            Object objM42632f = ose.this.m42632f(null, null, 0, this);
            return objM42632f == uq8.m51918f() ? objM42632f : vre.m53350a(objM42632f);
        }
    }

    public ose(vse vseVar, tse tseVar, un8 un8Var) {
        sq8.m48649h(vseVar, "strategy");
        sq8.m48649h(tseVar, "policy");
        sq8.m48649h(un8Var, "interceptors");
        this.f38827a = vseVar;
        this.f38828b = tseVar;
        this.f38829c = un8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0175 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:62:0x0171, B:64:0x0175, B:66:0x0187, B:65:0x017f), top: B:71:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:62:0x0171, B:64:0x0175, B:66:0x0187, B:65:0x017f), top: B:71:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // p001o.ueb
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo36732b(zdc zdcVar, jw7 jw7Var, n64 n64Var) throws Throwable {
        C15886b c15886b;
        zdc zdcVar2;
        ose oseVar;
        jw7 jw7Var2;
        dth dthVar;
        q74 tdhVar;
        vdh vdhVarM54242K;
        g64 g64VarMo40626b;
        Object objM17024a;
        if (n64Var instanceof C15886b) {
            c15886b = (C15886b) n64Var;
            int i = c15886b.f38842f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15886b.f38842f = i - Integer.MIN_VALUE;
            } else {
                c15886b = new C15886b(n64Var);
            }
        }
        Object objM51810f = c15886b.f38840d;
        Object objM51918f = uq8.m51918f();
        int i2 = c15886b.f38842f;
        if (i2 == 0) {
            wre.m54934b(objM51810f);
            un8 un8Var = this.f38829c;
            y38 y38VarM16409e = a48.m16409e((z38) zdcVar.m59255d(), true);
            c15886b.f38837a = this;
            zdcVar2 = zdcVar;
            c15886b.f38838b = zdcVar2;
            c15886b.f38839c = jw7Var;
            c15886b.f38842f = 1;
            objM51810f = un8Var.m51810f(y38VarM16409e, c15886b);
            if (objM51810f == objM51918f) {
                return objM51918f;
            }
            oseVar = this;
            jw7Var2 = jw7Var;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    wre.m54934b(objM51810f);
                    objM17024a = agc.m17024a((zfc) objM51810f);
                    wre.m54934b(objM17024a);
                    return objM17024a;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dthVar = (dth) c15886b.f38837a;
                try {
                    try {
                        wre.m54934b(objM51810f);
                        dthVar.close();
                        objM17024a = ((vre) objM51810f).m53359j();
                        wre.m54934b(objM17024a);
                        return objM17024a;
                    } catch (Exception e) {
                        e = e;
                        if (e instanceof CancellationException) {
                            dthVar.Z0(vzf.ERROR);
                            fth.m27471a(dthVar, e, true);
                        } else {
                            fth.m27472b(dthVar, "cancelled", ml1.m39301a(true));
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    th = th;
                    dthVar.close();
                    throw th;
                }
            }
            jw7 jw7Var3 = (jw7) c15886b.f38839c;
            zdcVar2 = (zdc) c15886b.f38838b;
            ose oseVar2 = (ose) c15886b.f38837a;
            wre.m54934b(objM51810f);
            jw7Var2 = jw7Var3;
            oseVar = oseVar2;
        }
        zdc zdcVarM59252b = zdc.m59252b(zdcVar2, null, f48.m26053c((y38) objM51810f), 1, null);
        ege egeVar = new ege();
        egeVar.f21602a = 1;
        if (pse.m44134b((z38) zdcVarM59252b.m59255d())) {
            idd iddVar = new idd(oseVar.f38828b, c15886b.getContext());
            vse vseVar = oseVar.f38827a;
            C15887c c15887c = new C15887c(egeVar, oseVar, zdcVarM59252b, jw7Var2, null);
            c15886b.f38837a = null;
            c15886b.f38838b = null;
            c15886b.f38839c = null;
            c15886b.f38842f = 2;
            objM51810f = vseVar.mo38251a(iddVar, c15887c, c15886b);
            if (objM51810f == objM51918f) {
                return objM51918f;
            }
            objM17024a = agc.m17024a((zfc) objM51810f);
            wre.m54934b(objM17024a);
            return objM17024a;
        }
        qx0 qx0VarM50736a = tx0.m50736a();
        uzf uzfVar = uzf.INTERNAL;
        e66 e66Var = e66.f21035a;
        String strMo26336c = kge.m35689b(ose.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("withSpan<T> cannot be used on an anonymous object".toString());
        }
        dth dthVarMo31126a = xdh.m56098a(c15886b.getContext()).mo40628d().mo34509a(strMo26336c).mo31126a("Non-retryable attempt", qx0VarM50736a, uzfVar, udh.m51389a(c15886b.getContext()));
        try {
            wdh wdhVar = (wdh) c15886b.getContext().get(wdh.f51822c);
            x54 x54VarMo28089a = (wdhVar == null || (vdhVarM54242K = wdhVar.m54242K()) == null || (g64VarMo40626b = vdhVarM54242K.mo40626b()) == null) ? null : g64VarMo40626b.mo28089a();
            if (x54VarMo28089a != null) {
                tdhVar = new tdh(x54VarMo28089a);
            } else {
                tdhVar = (tdh) c15886b.getContext().get(tdh.f46909c);
                if (tdhVar == null) {
                    tdhVar = e66Var;
                }
            }
            q74 q74VarPlus = e66Var.plus(new eth(dthVarMo31126a)).plus(tdhVar);
            C15885a c15885a = new C15885a(dthVarMo31126a, null, oseVar, zdcVarM59252b, jw7Var2, egeVar);
            c15886b.f38837a = dthVarMo31126a;
            c15886b.f38838b = null;
            c15886b.f38839c = null;
            c15886b.f38842f = 3;
            objM51810f = pm1.m43867g(q74VarPlus, c15885a, c15886b);
            if (objM51810f == objM51918f) {
                return objM51918f;
            }
            dthVar = dthVarMo31126a;
            dthVar.close();
            objM17024a = ((vre) objM51810f).m53359j();
            wre.m54934b(objM17024a);
            return objM17024a;
        } catch (Exception e2) {
            e = e2;
            dthVar = dthVarMo31126a;
            if (e instanceof CancellationException) {
            }
            throw e;
        } catch (Throwable th2) {
            th = th2;
            dthVar = dthVarMo31126a;
            dthVar.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m42632f(zdc zdcVar, jw7 jw7Var, int i, n64 n64Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C15888d c15888d;
        ose oseVar;
        Object objM53351b;
        int i2;
        ose oseVar2;
        List listM21246k;
        o18 o18Var;
        y38 y38VarM16410f;
        Object objM51807c;
        if (n64Var instanceof C15888d) {
            c15888d = (C15888d) n64Var;
            int i3 = c15888d.f38863g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c15888d.f38863g = i3 - Integer.MIN_VALUE;
            } else {
                c15888d = new C15888d(n64Var);
            }
        }
        Object objMo21441a = c15888d.f38861e;
        Object objM51918f = uq8.m51918f();
        int i4 = c15888d.f38863g;
        if (i4 == 0) {
            wre.m54934b(objMo21441a);
            Object objM51820p = this.f38829c.m51820p(a48.m16410f((z38) zdcVar.m59255d(), false, 1, null));
            if (!vre.m53357h(objM51820p)) {
                objM53351b = vre.m53351b(objM51820p);
                i2 = i;
                oseVar2 = this;
                listM21246k = (List) zdcVar.m59254c().mo18191b(s38.f44646a.m47569e());
                if (listM21246k == null) {
                    listM21246k = ch3.m21246k();
                }
                o18Var = (o18) kh3.i0(listM21246k, i2 - 1);
                y38VarM16410f = a48.m16410f((z38) zdcVar.m59255d(), false, 1, null);
                un8 un8Var = oseVar2.f38829c;
                g48 g48VarM41347f = o18Var == null ? o18Var.m41347f() : null;
                c15888d.f38857a = oseVar2;
                c15888d.f38858b = o18Var;
                c15888d.f38859c = y38VarM16410f;
                c15888d.f38863g = 2;
                objM51807c = un8Var.m51807c(objM53351b, y38VarM16410f, g48VarM41347f, c15888d);
                if (objM51807c == objM51918f) {
                    return objM51918f;
                }
                oseVar2.f38829c.m51814j(objM51807c, y38VarM16410f, o18Var != null ? o18Var.m41347f() : null);
                return objM51807c;
            }
            try {
                c15888d.f38857a = this;
                c15888d.f38858b = zdcVar;
                c15888d.f38860d = i;
                c15888d.f38863g = 1;
                objMo21441a = jw7Var.mo21441a(zdcVar, c15888d);
                if (objMo21441a == objM51918f) {
                    return objM51918f;
                }
                oseVar = this;
            } catch (Throwable th) {
                th = th;
                oseVar = this;
                vre.C17665a c17665a = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
                int i5 = i;
                oseVar2 = oseVar;
                i2 = i5;
                listM21246k = (List) zdcVar.m59254c().mo18191b(s38.f44646a.m47569e());
                if (listM21246k == null) {
                }
                o18Var = (o18) kh3.i0(listM21246k, i2 - 1);
                y38VarM16410f = a48.m16410f((z38) zdcVar.m59255d(), false, 1, null);
                un8 un8Var2 = oseVar2.f38829c;
                if (o18Var == null) {
                }
                c15888d.f38857a = oseVar2;
                c15888d.f38858b = o18Var;
                c15888d.f38859c = y38VarM16410f;
                c15888d.f38863g = 2;
                objM51807c = un8Var2.m51807c(objM53351b, y38VarM16410f, g48VarM41347f, c15888d);
                if (objM51807c == objM51918f) {
                }
                oseVar2.f38829c.m51814j(objM51807c, y38VarM16410f, o18Var != null ? o18Var.m41347f() : null);
                return objM51807c;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y38VarM16410f = (y38) c15888d.f38859c;
                o18Var = (o18) c15888d.f38858b;
                oseVar2 = (ose) c15888d.f38857a;
                wre.m54934b(objMo21441a);
                objM51807c = ((vre) objMo21441a).m53359j();
                oseVar2.f38829c.m51814j(objM51807c, y38VarM16410f, o18Var != null ? o18Var.m41347f() : null);
                return objM51807c;
            }
            i = c15888d.f38860d;
            zdcVar = (zdc) c15888d.f38858b;
            oseVar = (ose) c15888d.f38857a;
            try {
                wre.m54934b(objMo21441a);
            } catch (Throwable th2) {
                th = th2;
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
                int i52 = i;
                oseVar2 = oseVar;
                i2 = i52;
                listM21246k = (List) zdcVar.m59254c().mo18191b(s38.f44646a.m47569e());
                if (listM21246k == null) {
                }
                o18Var = (o18) kh3.i0(listM21246k, i2 - 1);
                y38VarM16410f = a48.m16410f((z38) zdcVar.m59255d(), false, 1, null);
                un8 un8Var22 = oseVar2.f38829c;
                if (o18Var == null) {
                }
                c15888d.f38857a = oseVar2;
                c15888d.f38858b = o18Var;
                c15888d.f38859c = y38VarM16410f;
                c15888d.f38863g = 2;
                objM51807c = un8Var22.m51807c(objM53351b, y38VarM16410f, g48VarM41347f, c15888d);
                if (objM51807c == objM51918f) {
                }
                oseVar2.f38829c.m51814j(objM51807c, y38VarM16410f, o18Var != null ? o18Var.m41347f() : null);
                return objM51807c;
            }
        }
        objM53351b = vre.m53351b(objMo21441a);
        int i522 = i;
        oseVar2 = oseVar;
        i2 = i522;
        listM21246k = (List) zdcVar.m59254c().mo18191b(s38.f44646a.m47569e());
        if (listM21246k == null) {
        }
        o18Var = (o18) kh3.i0(listM21246k, i2 - 1);
        y38VarM16410f = a48.m16410f((z38) zdcVar.m59255d(), false, 1, null);
        un8 un8Var222 = oseVar2.f38829c;
        if (o18Var == null) {
        }
        c15888d.f38857a = oseVar2;
        c15888d.f38858b = o18Var;
        c15888d.f38859c = y38VarM16410f;
        c15888d.f38863g = 2;
        objM51807c = un8Var222.m51807c(objM53351b, y38VarM16410f, g48VarM41347f, c15888d);
        if (objM51807c == objM51918f) {
        }
        oseVar2.f38829c.m51814j(objM51807c, y38VarM16410f, o18Var != null ? o18Var.m41347f() : null);
        return objM51807c;
    }
}
