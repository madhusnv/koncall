package p001o;

import java.util.Iterator;
import p001o.dx7;
import p001o.l8i;
import p001o.m18;
import p001o.z81;

/* loaded from: classes3.dex */
public abstract class ngd {

    /* renamed from: o.ngd$a */
    public static final class C15581a extends o64 {

        /* renamed from: a */
        public Object f36824a;

        /* renamed from: b */
        public Object f36825b;

        /* renamed from: c */
        public Object f36826c;

        /* renamed from: d */
        public Object f36827d;

        /* renamed from: e */
        public Object f36828e;

        /* renamed from: f */
        public /* synthetic */ Object f36829f;

        /* renamed from: g */
        public int f36830g;

        public C15581a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f36829f = obj;
            this.f36830g |= Integer.MIN_VALUE;
            return ngd.m40545a(null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m40545a(z38 z38Var, jl6 jl6Var, qc4 qc4Var, h86 h86Var, v81 v81Var, xk7 xk7Var, n64 n64Var) {
        C15581a c15581a;
        jl6 jl6Var2;
        xk7 xk7Var2;
        z38 z38Var2;
        ic4 ic4Var;
        v81 v81Var2;
        Iterator it;
        Object next;
        vz0 vz0Var;
        b86 b86Var;
        if (n64Var instanceof C15581a) {
            c15581a = (C15581a) n64Var;
            int i = c15581a.f36830g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15581a.f36830g = i - Integer.MIN_VALUE;
            } else {
                c15581a = new C15581a(n64Var);
            }
        }
        Object objResolve = c15581a.f36829f;
        Object objM51918f = uq8.m51918f();
        int i2 = c15581a.f36830g;
        if (i2 == 0) {
            wre.m54934b(objResolve);
            z38Var.m58672i(m18.C15196d.f34631a);
            qx0 qx0VarM34001d = jl6Var.m34001d();
            c15581a.f36824a = z38Var;
            c15581a.f36825b = jl6Var;
            c15581a.f36826c = h86Var;
            c15581a.f36827d = v81Var;
            c15581a.f36828e = xk7Var;
            c15581a.f36830g = 1;
            objResolve = qc4Var.resolve(qx0VarM34001d, c15581a);
            if (objResolve == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b86Var = (b86) c15581a.f36824a;
                    wre.m54934b(objResolve);
                    y38 y38Var = (y38) ((a91) objResolve).m16689a();
                    o38 method = y38Var.getMethod();
                    l8i.C15037b c15037b = l8i.f33466k;
                    l8i.C15036a c15036a = new l8i.C15036a();
                    c15036a.m36775p(b86Var.m18277c().m36759f());
                    c15036a.m36773n(b86Var.m18277c().m36755b());
                    c15036a.m36774o(ml1.m39304d(b86Var.m18277c().m36758e()));
                    c15036a.m36767h().m48006c(y38Var.getUrl().m36757d());
                    c15036a.m36766g().m20274h(y38Var.getUrl().m36756c());
                    return f48.m26052b(method, c15036a.m36761b(), y38Var.getHeaders(), m18.C15196d.f34631a, null, 16, null);
                }
                ic4Var = (ic4) c15581a.f36828e;
                xk7Var2 = (xk7) c15581a.f36827d;
                v81Var2 = (v81) c15581a.f36826c;
                jl6Var2 = (jl6) c15581a.f36825b;
                z38Var2 = (z38) c15581a.f36824a;
                wre.m54934b(objResolve);
                b86 b86Var2 = (b86) objResolve;
                sdc.m48263a(z38Var2, jl6Var2, b86Var2);
                it = bsf.m19699a(b86Var2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (d01.m22169g(((vz0) next).mo53621a(), d01.f18915b.m22174b())) {
                        break;
                    }
                }
                vz0Var = (vz0) next;
                if (vz0Var != null || (qx0VarM50736a = vz0Var.getAttributes()) == null) {
                    qx0 qx0VarM50736a = tx0.m50736a();
                }
                z81.C18573b c18573b = z81.f56654o;
                z81.C18572a c18572a = new z81.C18572a();
                x81 x81Var = x81.f53319a;
                c18572a.m58923x((String) qx0VarM50736a.mo18191b(x81Var.m55806j()));
                c18572a.m58924y((String) qx0VarM50736a.mo18191b(x81Var.m55808l()));
                c18572a.m58917r(ic4Var);
                c18572a.m58898B(u81.X_AMZ_CONTENT_SHA256);
                c18572a.m58897A(t81.HTTP_REQUEST_VIA_QUERY_PARAMS);
                c18572a.m58919t(dx7.C13056g.f20626b);
                xk7Var2.invoke(c18572a);
                z81 z81VarM58901b = c18572a.m58901b();
                y38 y38VarM58665b = z38Var2.m58665b();
                c15581a.f36824a = b86Var2;
                c15581a.f36825b = null;
                c15581a.f36826c = null;
                c15581a.f36827d = null;
                c15581a.f36828e = null;
                c15581a.f36830g = 3;
                objResolve = v81Var2.mo18582c(y38VarM58665b, z81VarM58901b, c15581a);
                if (objResolve != objM51918f) {
                    return objM51918f;
                }
                b86Var = b86Var2;
                y38 y38Var2 = (y38) ((a91) objResolve).m16689a();
                o38 method2 = y38Var2.getMethod();
                l8i.C15037b c15037b2 = l8i.f33466k;
                l8i.C15036a c15036a2 = new l8i.C15036a();
                c15036a2.m36775p(b86Var.m18277c().m36759f());
                c15036a2.m36773n(b86Var.m18277c().m36755b());
                c15036a2.m36774o(ml1.m39304d(b86Var.m18277c().m36758e()));
                c15036a2.m36767h().m48006c(y38Var2.getUrl().m36757d());
                c15036a2.m36766g().m20274h(y38Var2.getUrl().m36756c());
                return f48.m26052b(method2, c15036a2.m36761b(), y38Var2.getHeaders(), m18.C15196d.f34631a, null, 16, null);
            }
            xk7Var = (xk7) c15581a.f36828e;
            v81Var = (v81) c15581a.f36827d;
            h86Var = (h86) c15581a.f36826c;
            jl6Var = (jl6) c15581a.f36825b;
            z38Var = (z38) c15581a.f36824a;
            wre.m54934b(objResolve);
        }
        ic4 ic4Var2 = (ic4) objResolve;
        rne rneVar = new rne(jl6Var, z38Var.m58665b(), ic4Var2);
        c15581a.f36824a = z38Var;
        c15581a.f36825b = jl6Var;
        c15581a.f36826c = v81Var;
        c15581a.f36827d = xk7Var;
        c15581a.f36828e = ic4Var2;
        c15581a.f36830g = 2;
        objResolve = h86Var.mo29972a(rneVar, c15581a);
        if (objResolve == objM51918f) {
            return objM51918f;
        }
        jl6Var2 = jl6Var;
        xk7Var2 = xk7Var;
        v81 v81Var3 = v81Var;
        z38Var2 = z38Var;
        ic4Var = ic4Var2;
        v81Var2 = v81Var3;
        b86 b86Var22 = (b86) objResolve;
        sdc.m48263a(z38Var2, jl6Var2, b86Var22);
        it = bsf.m19699a(b86Var22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        vz0Var = (vz0) next;
        if (vz0Var != null) {
            qx0 qx0VarM50736a2 = tx0.m50736a();
            z81.C18573b c18573b2 = z81.f56654o;
            z81.C18572a c18572a2 = new z81.C18572a();
            x81 x81Var2 = x81.f53319a;
            c18572a2.m58923x((String) qx0VarM50736a2.mo18191b(x81Var2.m55806j()));
            c18572a2.m58924y((String) qx0VarM50736a2.mo18191b(x81Var2.m55808l()));
            c18572a2.m58917r(ic4Var);
            c18572a2.m58898B(u81.X_AMZ_CONTENT_SHA256);
            c18572a2.m58897A(t81.HTTP_REQUEST_VIA_QUERY_PARAMS);
            c18572a2.m58919t(dx7.C13056g.f20626b);
            xk7Var2.invoke(c18572a2);
            z81 z81VarM58901b2 = c18572a2.m58901b();
            y38 y38VarM58665b2 = z38Var2.m58665b();
            c15581a.f36824a = b86Var22;
            c15581a.f36825b = null;
            c15581a.f36826c = null;
            c15581a.f36827d = null;
            c15581a.f36828e = null;
            c15581a.f36830g = 3;
            objResolve = v81Var2.mo18582c(y38VarM58665b2, z81VarM58901b2, c15581a);
            if (objResolve != objM51918f) {
            }
        }
        y38 y38Var22 = (y38) ((a91) objResolve).m16689a();
        o38 method22 = y38Var22.getMethod();
        l8i.C15037b c15037b22 = l8i.f33466k;
        l8i.C15036a c15036a22 = new l8i.C15036a();
        c15036a22.m36775p(b86Var.m18277c().m36759f());
        c15036a22.m36773n(b86Var.m18277c().m36755b());
        c15036a22.m36774o(ml1.m39304d(b86Var.m18277c().m36758e()));
        c15036a22.m36767h().m48006c(y38Var22.getUrl().m36757d());
        c15036a22.m36766g().m20274h(y38Var22.getUrl().m36756c());
        return f48.m26052b(method22, c15036a22.m36761b(), y38Var22.getHeaders(), m18.C15196d.f34631a, null, 16, null);
    }
}
