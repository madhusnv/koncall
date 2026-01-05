package p001o;

import android.content.Context;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.fb2;
import p001o.g32;
import p001o.nid;
import p001o.za2;

/* loaded from: classes2.dex */
public final class nid {

    /* renamed from: i */
    public static final C15589a f36881i = new C15589a(null);

    /* renamed from: j */
    public static final nid f36882j = new nid();

    /* renamed from: a */
    public final Object f36883a = new Object();

    /* renamed from: b */
    public fb2.InterfaceC13380b f36884b;

    /* renamed from: c */
    public zfa f36885c;

    /* renamed from: d */
    public zfa f36886d;

    /* renamed from: e */
    public final sca f36887e;

    /* renamed from: f */
    public eb2 f36888f;

    /* renamed from: g */
    public Context f36889g;

    /* renamed from: h */
    public final Map f36890h;

    /* renamed from: o.nid$a */
    public static final class C15589a {

        /* renamed from: o.nid$a$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ Context f36891a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context) {
                super(1);
                this.f36891a = context;
            }

            @Override // p001o.xk7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final nid invoke(eb2 eb2Var) {
                nid nidVar = nid.f36882j;
                sq8.m48648g(eb2Var, "cameraX");
                nidVar.m40655w(eb2Var);
                nid nidVar2 = nid.f36882j;
                Context contextM33287a = j64.m33287a(this.f36891a);
                sq8.m48648g(contextM33287a, "getApplicationContext(context)");
                nidVar2.m40656x(contextM33287a);
                return nid.f36882j;
            }
        }

        public C15589a() {
        }

        public /* synthetic */ C15589a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public static final nid m40659c(xk7 xk7Var, Object obj) {
            sq8.m48649h(xk7Var, "$tmp0");
            return (nid) xk7Var.invoke(obj);
        }

        /* renamed from: b */
        public final zfa m40660b(Context context) {
            sq8.m48649h(context, "context");
            fgd.m26663g(context);
            zfa zfaVarM40653s = nid.f36882j.m40653s(context);
            final a aVar = new a(context);
            zfa zfaVarM19412G = bn7.m19412G(zfaVarM40653s, new zl7() { // from class: o.mid
                @Override // p001o.zl7
                public final Object apply(Object obj) {
                    return nid.C15589a.m40659c(aVar, obj);
                }
            }, gb2.m28293a());
            sq8.m48648g(zfaVarM19412G, "context: Context): Liste…tExecutor()\n            )");
            return zfaVarM19412G;
        }
    }

    /* renamed from: o.nid$b */
    public static final class C15590b implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ g32.C13614a f36892a;

        /* renamed from: b */
        public final /* synthetic */ eb2 f36893b;

        public C15590b(g32.C13614a c13614a, eb2 eb2Var) {
            this.f36892a = c13614a;
            this.f36893b = eb2Var;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            sq8.m48649h(th, "t");
            this.f36892a.m28008f(th);
        }

        @Override // p001o.qm7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            this.f36892a.m28005c(this.f36893b);
        }
    }

    /* renamed from: o.nid$c */
    public static final class C15591c extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ eb2 f36894a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15591c(eb2 eb2Var) {
            super(1);
            this.f36894a = eb2Var;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zfa invoke(Void r1) {
            return this.f36894a.m24683i();
        }
    }

    public nid() {
        zfa zfaVarM19430p = bn7.m19430p(null);
        sq8.m48648g(zfaVarM19430p, "immediateFuture<Void>(null)");
        this.f36886d = zfaVarM19430p;
        this.f36887e = new sca();
        this.f36890h = new HashMap();
    }

    /* renamed from: t */
    public static final Object m40646t(nid nidVar, eb2 eb2Var, g32.C13614a c13614a) {
        sq8.m48649h(nidVar, "this$0");
        sq8.m48649h(eb2Var, "$cameraX");
        sq8.m48649h(c13614a, "completer");
        synchronized (nidVar.f36883a) {
            rm7 rm7VarM46957a = rm7.m46957a(nidVar.f36886d);
            final C15591c c15591c = new C15591c(eb2Var);
            rm7 rm7VarM46961e = rm7VarM46957a.m46961e(new wr0() { // from class: o.lid
                @Override // p001o.wr0
                public final zfa apply(Object obj) {
                    return nid.m40647u(c15591c, obj);
                }
            }, gb2.m28293a());
            sq8.m48648g(rm7VarM46961e, "cameraX = CameraX(contex…                        )");
            bn7.m19424j(rm7VarM46961e, new C15590b(c13614a, eb2Var), gb2.m28293a());
            y3i y3iVar = y3i.f54824a;
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* renamed from: u */
    public static final zfa m40647u(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return (zfa) xk7Var.invoke(obj);
    }

    /* renamed from: n */
    public final g72 m40648n(xca xcaVar, oa2 oa2Var, w8i... w8iVarArr) {
        sq8.m48649h(xcaVar, "lifecycleOwner");
        sq8.m48649h(oa2Var, "cameraSelector");
        sq8.m48649h(w8iVarArr, "useCases");
        vsh.m53384a("CX:bindToLifecycle");
        try {
            if (m40652r() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            m40654v(1);
            ei9 ei9Var = ei9.f21731f;
            sq8.m48648g(ei9Var, "DEFAULT");
            sq8.m48648g(ei9Var, "DEFAULT");
            return m40649o(xcaVar, oa2Var, null, ei9Var, ei9Var, null, ch3.m21246k(), (w8i[]) Arrays.copyOf(w8iVarArr, w8iVarArr.length));
        } finally {
            vsh.m53385b();
        }
    }

    /* renamed from: o */
    public final g72 m40649o(xca xcaVar, oa2 oa2Var, oa2 oa2Var2, ei9 ei9Var, ei9 ei9Var2, eyi eyiVar, List list, w8i... w8iVarArr) {
        v92 v92Var;
        ore oreVar;
        sq8.m48649h(xcaVar, "lifecycleOwner");
        sq8.m48649h(oa2Var, "primaryCameraSelector");
        sq8.m48649h(ei9Var, "primaryLayoutSettings");
        sq8.m48649h(ei9Var2, "secondaryLayoutSettings");
        sq8.m48649h(list, "effects");
        sq8.m48649h(w8iVarArr, "useCases");
        vsh.m53384a("CX:bindToLifecycle-internal");
        try {
            elh.m25220a();
            eb2 eb2Var = this.f36888f;
            sq8.m48646e(eb2Var);
            v92 v92VarM41866e = oa2Var.m41866e(eb2Var.m24681f().m36829a());
            sq8.m48648g(v92VarM41866e, "primaryCameraSelector.se…cameraRepository.cameras)");
            boolean z = true;
            v92VarM41866e.mo26126q(true);
            t92 t92VarM40651q = m40651q(oa2Var);
            sq8.m48647f(t92VarM40651q, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
            ore oreVar2 = (ore) t92VarM40651q;
            if (oa2Var2 != null) {
                eb2 eb2Var2 = this.f36888f;
                sq8.m48646e(eb2Var2);
                v92 v92VarM41866e2 = oa2Var2.m41866e(eb2Var2.m24681f().m36829a());
                v92VarM41866e2.mo26126q(false);
                t92 t92VarM40651q2 = m40651q(oa2Var2);
                sq8.m48647f(t92VarM40651q2, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
                oreVar = (ore) t92VarM40651q2;
                v92Var = v92VarM41866e2;
            } else {
                v92Var = null;
                oreVar = null;
            }
            rca rcaVarM48191c = this.f36887e.m48191c(xcaVar, za2.m59038A(oreVar2, oreVar));
            Collection collectionM48193e = this.f36887e.m48193e();
            for (w8i w8iVar : gp0.m29255V(w8iVarArr)) {
                for (Object obj : collectionM48193e) {
                    sq8.m48648g(obj, "lifecycleCameras");
                    rca rcaVar = (rca) obj;
                    if (rcaVar.m46519t(w8iVar) && !sq8.m48644c(rcaVar, rcaVarM48191c)) {
                        h8g h8gVar = h8g.f26398a;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{w8iVar}, 1));
                        sq8.m48648g(str, "format(format, *args)");
                        throw new IllegalStateException(str);
                    }
                    z = true;
                }
            }
            if (rcaVarM48191c == null) {
                sca scaVar = this.f36887e;
                eb2 eb2Var3 = this.f36888f;
                sq8.m48646e(eb2Var3);
                b92 b92VarMo42955d = eb2Var3.m24680e().mo42955d();
                eb2 eb2Var4 = this.f36888f;
                sq8.m48646e(eb2Var4);
                m92 m92VarM24679d = eb2Var4.m24679d();
                eb2 eb2Var5 = this.f36888f;
                sq8.m48646e(eb2Var5);
                rcaVarM48191c = scaVar.m48190b(xcaVar, new za2(v92VarM41866e, v92Var, oreVar2, oreVar, ei9Var, ei9Var2, b92VarMo42955d, m92VarM24679d, eb2Var5.m24682h()));
            }
            if (w8iVarArr.length != 0) {
                z = false;
            }
            if (z) {
                sq8.m48646e(rcaVarM48191c);
            } else {
                sca scaVar2 = this.f36887e;
                sq8.m48646e(rcaVarM48191c);
                List listM21249n = ch3.m21249n(Arrays.copyOf(w8iVarArr, w8iVarArr.length));
                eb2 eb2Var6 = this.f36888f;
                sq8.m48646e(eb2Var6);
                scaVar2.m48189a(rcaVarM48191c, eyiVar, list, listM21249n, eb2Var6.m24680e().mo42955d());
            }
            return rcaVarM48191c;
        } finally {
            vsh.m53385b();
        }
    }

    /* renamed from: p */
    public final u82 m40650p(oa2 oa2Var, t92 t92Var) {
        Iterator it = oa2Var.m41864c().iterator();
        u82 u82Var = null;
        while (it.hasNext()) {
            Object next = it.next();
            sq8.m48648g(next, "cameraSelector.cameraFilterSet");
            r92 r92Var = (r92) next;
            if (!sq8.m48644c(r92Var.getIdentifier(), r92.f43174a)) {
                w82 w82VarM32533a = ip6.m32533a(r92Var.getIdentifier());
                Context context = this.f36889g;
                sq8.m48646e(context);
                u82 u82VarMo52453a = w82VarM32533a.mo52453a(t92Var, context);
                if (u82VarMo52453a == null) {
                    continue;
                } else {
                    if (u82Var != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    u82Var = u82VarMo52453a;
                }
            }
        }
        return u82Var == null ? x82.m55810a() : u82Var;
    }

    /* renamed from: q */
    public t92 m40651q(oa2 oa2Var) {
        Object oreVar;
        sq8.m48649h(oa2Var, "cameraSelector");
        vsh.m53384a("CX:getCameraInfo");
        try {
            eb2 eb2Var = this.f36888f;
            sq8.m48646e(eb2Var);
            u92 u92VarMo26122j = oa2Var.m41866e(eb2Var.m24681f().m36829a()).mo26122j();
            sq8.m48648g(u92VarMo26122j, "cameraSelector.select(mC…meras).cameraInfoInternal");
            u82 u82VarM40650p = m40650p(oa2Var, u92VarMo26122j);
            za2.AbstractC18596b abstractC18596bM59079a = za2.AbstractC18596b.m59079a(u92VarMo26122j.mo38380b(), u82VarM40650p.mo51198Q());
            sq8.m48648g(abstractC18596bM59079a, "create(\n                …ilityId\n                )");
            synchronized (this.f36883a) {
                oreVar = this.f36890h.get(abstractC18596bM59079a);
                if (oreVar == null) {
                    oreVar = new ore(u92VarMo26122j, u82VarM40650p);
                    this.f36890h.put(abstractC18596bM59079a, oreVar);
                }
                y3i y3iVar = y3i.f54824a;
            }
            return (ore) oreVar;
        } finally {
            vsh.m53385b();
        }
    }

    /* renamed from: r */
    public final int m40652r() {
        eb2 eb2Var = this.f36888f;
        if (eb2Var == null) {
            return 0;
        }
        sq8.m48646e(eb2Var);
        return eb2Var.m24680e().mo42955d().mo18287c();
    }

    /* renamed from: s */
    public final zfa m40653s(Context context) {
        synchronized (this.f36883a) {
            zfa zfaVar = this.f36885c;
            if (zfaVar != null) {
                sq8.m48647f(zfaVar, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
                return zfaVar;
            }
            final eb2 eb2Var = new eb2(context, this.f36884b);
            zfa zfaVarM28002a = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.kid
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return nid.m40646t(this.f32280a, eb2Var, c13614a);
                }
            });
            this.f36885c = zfaVarM28002a;
            sq8.m48647f(zfaVarM28002a, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
            return zfaVarM28002a;
        }
    }

    /* renamed from: v */
    public final void m40654v(int i) {
        eb2 eb2Var = this.f36888f;
        if (eb2Var == null) {
            return;
        }
        sq8.m48646e(eb2Var);
        eb2Var.m24680e().mo42955d().mo18288d(i);
    }

    /* renamed from: w */
    public final void m40655w(eb2 eb2Var) {
        this.f36888f = eb2Var;
    }

    /* renamed from: x */
    public final void m40656x(Context context) {
        this.f36889g = context;
    }

    /* renamed from: y */
    public void m40657y() {
        vsh.m53384a("CX:unbindAll");
        try {
            elh.m25220a();
            m40654v(0);
            this.f36887e.m48199k();
            y3i y3iVar = y3i.f54824a;
        } finally {
            vsh.m53385b();
        }
    }
}
