package p000;

import com.google.android.gms.actions.SearchIntents;
import com.google.gson.Gson;
import java.util.Map;
import p001o.a2e;
import p001o.e9g;
import p001o.f9g;
import p001o.h84;
import p001o.j01;
import p001o.jgg;
import p001o.n64;
import p001o.nl7;
import p001o.qm1;
import p001o.rl1;
import p001o.sq8;
import p001o.tn8;
import p001o.uia;
import p001o.ule;
import p001o.uq8;
import p001o.wre;
import p001o.xle;
import p001o.xr3;
import p001o.y3i;
import p001o.zqe;

/* renamed from: c */
/* loaded from: classes.dex */
public final class C2675c implements tn8 {

    /* renamed from: a */
    public final boolean f10579a;

    /* renamed from: c$a */
    public static final class a extends jgg implements nl7 {

        /* renamed from: a */
        public int f10580a;

        public a(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new a(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f10580a;
            if (i == 0) {
                wre.m54934b(obj);
                j01 j01VarM32992a = j01.f29455d.m32992a();
                this.f10580a = 1;
                obj = j01VarM32992a.m32991t(this);
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
            return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public C2675c(boolean z) {
        this.f10579a = z;
    }

    @Override // p001o.tn8
    public zqe intercept(tn8.InterfaceC17165a interfaceC17165a) {
        xle xleVarM51730a;
        a2e a2eVarMo56683a;
        String string;
        sq8.m48649h(interfaceC17165a, "chain");
        ule uleVarRequest = interfaceC17165a.request();
        String strM51734e = uleVarRequest.m51734e("Content-Type");
        boolean z = false;
        if ((strM51734e != null && e9g.m24597K(strM51734e, "application/json", false, 2, null)) && (xleVarM51730a = uleVarRequest.m51730a()) != null) {
            rl1 rl1Var = new rl1();
            xleVarM51730a.mo18955i(rl1Var);
            y3i y3iVar = y3i.f54824a;
            Object objFromJson = new Gson().fromJson(rl1Var.m46909T(), (Class<Object>) Object.class);
            if (objFromJson instanceof Map) {
                Object obj = ((Map) objFromJson).get(SearchIntents.EXTRA_QUERY);
                String str = obj instanceof String ? (String) obj : null;
                if (str != null && (string = f9g.Z0(str).toString()) != null && e9g.m24597K(string, "mutation", false, 2, null)) {
                    z = true;
                }
                if (z && this.f10579a) {
                    zqe.C18696a c18696aM59764q = new zqe.C18696a().m59764q(uleVarRequest);
                    xr3 xr3VarMo20973b = interfaceC17165a.mo20973b();
                    if (xr3VarMo20973b == null || (a2eVarMo56683a = xr3VarMo20973b.mo56683a()) == null) {
                        a2eVarMo56683a = a2e.HTTP_1_1;
                    }
                    return c18696aM59764q.m59762o(a2eVarMo56683a).m59752e(403).m59759l("Mutations are blocked.").m59750c();
                }
            }
        }
        zqe zqeVarMo20972a = interfaceC17165a.mo20972a(uleVarRequest);
        if (zqeVarMo20972a.m59739h() == 401) {
            uia.m51627b(uia.f48971a, "mutation-interceptor", "Response returned : " + zqeVarMo20972a, null, null, 12, null);
            qm1.m45641b(null, new a(null), 1, null);
        }
        return zqeVarMo20972a;
    }
}
