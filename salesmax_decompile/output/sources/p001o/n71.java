package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public abstract class n71 {

    /* renamed from: o.n71$a */
    public /* synthetic */ class C15520a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36489a;

        static {
            int[] iArr = new int[ofc.values().length];
            try {
                iArr[ofc.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ofc.Windows.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36489a = iArr;
        }
    }

    /* renamed from: o.n71$b */
    public static final class C15521b extends jgg implements nl7 {

        /* renamed from: a */
        public int f36490a;

        /* renamed from: b */
        public /* synthetic */ Object f36491b;

        /* renamed from: c */
        public final /* synthetic */ dth f36492c;

        /* renamed from: d */
        public final /* synthetic */ r71 f36493d;

        /* renamed from: e */
        public final /* synthetic */ r9d f36494e;

        /* renamed from: f */
        public final /* synthetic */ String f36495f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15521b(dth dthVar, n64 n64Var, r71 r71Var, r9d r9dVar, String str) {
            super(2, n64Var);
            this.f36492c = dthVar;
            this.f36493d = r71Var;
            this.f36494e = r9dVar;
            this.f36495f = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C15521b c15521b = new C15521b(this.f36492c, n64Var, this.f36493d, this.f36494e, this.f36495f);
            c15521b.f36491b = obj;
            return c15521b;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f36490a;
            if (i == 0) {
                wre.m54934b(obj);
                h84 h84Var = (h84) this.f36491b;
                r71 r71VarM40197g = this.f36493d;
                if (r71VarM40197g == null) {
                    r71VarM40197g = n71.m40197g(this.f36494e, this.f36495f);
                }
                qja qjaVarM52400e = v74.m52400e(h84Var.mo6529D(), "AwsConfigParser");
                z74 z74VarM28153a = g7f.f24695a.m28153a();
                C15523d c15523d = new C15523d(qjaVarM52400e, this.f36494e, r71VarM40197g, null);
                this.f36490a = 1;
                obj = pm1.m43867g(z74VarM28153a, c15523d, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C15521b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.n71$c */
    public static final class C15522c extends o64 {

        /* renamed from: a */
        public Object f36496a;

        /* renamed from: b */
        public /* synthetic */ Object f36497b;

        /* renamed from: c */
        public int f36498c;

        public C15522c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f36497b = obj;
            this.f36498c |= Integer.MIN_VALUE;
            return n71.m40192b(null, null, null, this);
        }
    }

    /* renamed from: o.n71$d */
    public static final class C15523d extends jgg implements nl7 {

        /* renamed from: a */
        public Object f36499a;

        /* renamed from: b */
        public Object f36500b;

        /* renamed from: c */
        public Object f36501c;

        /* renamed from: d */
        public Object f36502d;

        /* renamed from: e */
        public int f36503e;

        /* renamed from: f */
        public int f36504f;

        /* renamed from: g */
        public final /* synthetic */ qja f36505g;

        /* renamed from: h */
        public final /* synthetic */ r9d f36506h;

        /* renamed from: q */
        public final /* synthetic */ r71 f36507q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15523d(qja qjaVar, r9d r9dVar, r71 r71Var, n64 n64Var) {
            super(2, n64Var);
            this.f36505g = qjaVar;
            this.f36506h = r9dVar;
            this.f36507q = r71Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C15523d(this.f36505g, this.f36506h, this.f36507q, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Map[] mapArr;
            qja qjaVar;
            sz6 sz6Var;
            int i;
            Map[] mapArr2;
            qja qjaVar2;
            sz6 sz6Var2;
            Map[] mapArr3;
            Map[] mapArr4;
            Object objM51918f = uq8.m51918f();
            int i2 = this.f36504f;
            int i3 = 1;
            if (i2 == 0) {
                wre.m54934b(obj);
                mapArr = new Map[2];
                qjaVar = this.f36505g;
                sz6Var = sz6.CONFIGURATION;
                r9d r9dVar = this.f36506h;
                String strM46303a = this.f36507q.m46303a();
                this.f36499a = mapArr;
                this.f36500b = mapArr;
                this.f36501c = qjaVar;
                this.f36502d = sz6Var;
                this.f36503e = 0;
                this.f36504f = 1;
                obj = r9dVar.mo18076d(strM46303a, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
                i = 0;
                mapArr2 = mapArr;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = this.f36503e;
                    sz6Var2 = (sz6) this.f36502d;
                    qjaVar2 = (qja) this.f36501c;
                    mapArr3 = (Map[]) this.f36500b;
                    mapArr4 = (Map[]) this.f36499a;
                    wre.m54934b(obj);
                    byte[] bArr = (byte[]) obj;
                    mapArr3[i3] = p71.m43062e(qjaVar2, sz6Var2, bArr != null ? e9g.m24600r(bArr) : null);
                    return p71.m43064g(n71.m40194d(mapArr4), this.f36507q);
                }
                i = this.f36503e;
                sz6Var = (sz6) this.f36502d;
                qjaVar = (qja) this.f36501c;
                Map[] mapArr5 = (Map[]) this.f36500b;
                Map[] mapArr6 = (Map[]) this.f36499a;
                wre.m54934b(obj);
                mapArr2 = mapArr5;
                mapArr = mapArr6;
            }
            byte[] bArr2 = (byte[]) obj;
            mapArr2[i] = p71.m43062e(qjaVar, sz6Var, bArr2 != null ? e9g.m24600r(bArr2) : null);
            qjaVar2 = this.f36505g;
            sz6 sz6Var3 = sz6.CREDENTIAL;
            r9d r9dVar2 = this.f36506h;
            String strM46304b = this.f36507q.m46304b();
            this.f36499a = mapArr;
            this.f36500b = mapArr;
            this.f36501c = qjaVar2;
            this.f36502d = sz6Var3;
            this.f36503e = 1;
            this.f36504f = 2;
            Object objMo18076d = r9dVar2.mo18076d(strM46304b, this);
            if (objMo18076d == objM51918f) {
                return objM51918f;
            }
            sz6Var2 = sz6Var3;
            obj = objMo18076d;
            mapArr3 = mapArr;
            mapArr4 = mapArr3;
            byte[] bArr3 = (byte[]) obj;
            mapArr3[i3] = p71.m43062e(qjaVar2, sz6Var2, bArr3 != null ? e9g.m24600r(bArr3) : null);
            return p71.m43064g(n71.m40194d(mapArr4), this.f36507q);
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C15523d) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: a */
    public static final String m40191a(hwc hwcVar) {
        if (hwcVar.m31229c() == null || hwcVar.m31230d() == null) {
            return null;
        }
        return ((String) hwcVar.m31229c()) + ((String) hwcVar.m31230d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:45:0x00d1, B:47:0x00d5, B:49:0x00e7, B:48:0x00df), top: B:52:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:45:0x00d1, B:47:0x00d5, B:49:0x00e7, B:48:0x00df), top: B:52:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.n64, o.n71$c] */
    /* JADX WARN: Type inference failed for: r1v3, types: [o.dth] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m40192b(r9d r9dVar, String str, r71 r71Var, n64 n64Var) throws Throwable {
        ?? c15522c;
        dth dthVar;
        q74 tdhVar;
        vdh vdhVarM54242K;
        g64 g64VarMo40626b;
        if (n64Var instanceof C15522c) {
            C15522c c15522c2 = (C15522c) n64Var;
            int i = c15522c2.f36498c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15522c2.f36498c = i - Integer.MIN_VALUE;
                c15522c = c15522c2;
            } else {
                c15522c = new C15522c(n64Var);
            }
        }
        Object objM43867g = c15522c.f36497b;
        Object objM51918f = uq8.m51918f();
        int i2 = c15522c.f36498c;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dthVar = (dth) c15522c.f36496a;
                try {
                    wre.m54934b(objM43867g);
                    dthVar.close();
                    return objM43867g;
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
            }
            wre.m54934b(objM43867g);
            qx0 qx0VarM50736a = tx0.m50736a();
            uzf uzfVar = uzf.INTERNAL;
            e66 e66Var = e66.f21035a;
            dth dthVarMo31126a = xdh.m56098a(c15522c.getContext()).mo40628d().mo34509a("AwsSharedConfig").mo31126a("loadAwsSharedConfig", qx0VarM50736a, uzfVar, udh.m51389a(c15522c.getContext()));
            try {
                wdh wdhVar = (wdh) c15522c.getContext().get(wdh.f51822c);
                x54 x54VarMo28089a = (wdhVar == null || (vdhVarM54242K = wdhVar.m54242K()) == null || (g64VarMo40626b = vdhVarM54242K.mo40626b()) == null) ? null : g64VarMo40626b.mo28089a();
                if (x54VarMo28089a != null) {
                    tdhVar = new tdh(x54VarMo28089a);
                } else {
                    tdhVar = (tdh) c15522c.getContext().get(tdh.f46909c);
                    if (tdhVar == null) {
                        tdhVar = e66Var;
                    }
                }
                q74 q74VarPlus = e66Var.plus(new eth(dthVarMo31126a)).plus(tdhVar);
                C15521b c15521b = new C15521b(dthVarMo31126a, null, r71Var, r9dVar, str);
                c15522c.f36496a = dthVarMo31126a;
                c15522c.f36498c = 1;
                objM43867g = pm1.m43867g(q74VarPlus, c15521b, c15522c);
                if (objM43867g == objM51918f) {
                    return objM51918f;
                }
                dthVar = dthVarMo31126a;
                dthVar.close();
                return objM43867g;
            } catch (Exception e2) {
                e = e2;
                dthVar = dthVarMo31126a;
                if (e instanceof CancellationException) {
                }
                throw e;
            } catch (Throwable th) {
                th = th;
                c15522c = dthVarMo31126a;
                c15522c.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m40193c(r9d r9dVar, String str, r71 r71Var, n64 n64Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            r71Var = null;
        }
        return m40192b(r9dVar, str, r71Var, n64Var);
    }

    /* renamed from: d */
    public static final Map m40194d(Map... mapArr) {
        sq8.m48649h(mapArr, "maps");
        Map mapM31053c = hsa.m31053c();
        for (wq3 wq3Var : wq3.values()) {
            ArrayList arrayList = new ArrayList();
            for (Map map : mapArr) {
                Map map2 = (Map) map.get(wq3Var);
                if (map2 != null) {
                    arrayList.add(map2);
                }
            }
            mapM31053c.put(wq3Var, m40195e(arrayList));
        }
        return hsa.m31052b(mapM31053c);
    }

    /* renamed from: e */
    public static final Map m40195e(List list) {
        Map mapM32681h;
        Map mapM31053c = hsa.m31053c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                vq3 vq3Var = (vq3) mapM31053c.get(entry.getKey());
                if (vq3Var == null || (mapM32681h = vq3Var.m53207e()) == null) {
                    mapM32681h = isa.m32681h();
                }
                vq3 vq3Var2 = new vq3((String) entry.getKey(), isa.m32687n(mapM32681h, ((vq3) entry.getValue()).m53207e()), ((vq3) entry.getValue()).m53208f());
                mapM31053c.put(vq3Var2.m53205b(), vq3Var2);
            }
        }
        return hsa.m31052b(mapM31053c);
    }

    /* renamed from: f */
    public static final String m40196f(String str, r9d r9dVar) {
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        sq8.m48649h(r9dVar, "platform");
        if (!f9g.I0(f9g.Z0(str).toString(), '~', false, 2, null)) {
            return str;
        }
        String strM40198h = m40198h(r9dVar);
        if (strM40198h == null) {
            throw new IllegalStateException("Unable to determine user home directory".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strM40198h);
        String strSubstring = str.substring(1);
        sq8.m48648g(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    /* renamed from: g */
    public static final r71 m40197g(r9d r9dVar, String str) {
        sq8.m48649h(r9dVar, "platform");
        if (str == null && (str = (String) bj6.m19237f(o81.f37890a.m41742o(), r9dVar)) == null) {
            str = CookieSpecs.DEFAULT;
        }
        return new r71(str, m40196f(sz6.CONFIGURATION.path(r9dVar), r9dVar), m40196f(sz6.CREDENTIAL.path(r9dVar), r9dVar));
    }

    /* renamed from: h */
    public static final String m40198h(r9d r9dVar) {
        int i = C15520a.f36489a[r9dVar.mo26793a().m42086a().ordinal()];
        if (i != 1 && i != 2) {
            String strMo26798i = r9dVar.mo26798i("HOME");
            return strMo26798i == null ? r9dVar.mo26796e("user.home") : strMo26798i;
        }
        String strMo26798i2 = r9dVar.mo26798i("HOME");
        if (strMo26798i2 != null) {
            return strMo26798i2;
        }
        String strMo26798i3 = r9dVar.mo26798i("USERPROFILE");
        if (strMo26798i3 != null) {
            return strMo26798i3;
        }
        String strM40191a = m40191a(vyh.m53620a(r9dVar.mo26798i("HOMEDRIVE"), r9dVar.mo26798i("HOMEPATH")));
        return strM40191a == null ? r9dVar.mo26796e("user.home") : strM40191a;
    }
}
