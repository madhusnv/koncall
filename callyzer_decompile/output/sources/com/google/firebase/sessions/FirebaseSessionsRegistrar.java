package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d6.C1612b;
import fk.AbstractC2315u;
import fk.C2303i;
import fk.C2307m;
import fk.C2309o;
import fk.C2313s;
import fk.C2314t;
import fk.C2317w;
import fk.C2318x;
import fk.InterfaceC2312r;
import fk.i1;
import fk.m0;
import fk.w0;
import fk.y0;
import hk.C2961a;
import hk.InterfaceC2963c;
import java.util.List;
import ji.C3773g;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import pg.da;
import pi.InterfaceC5966a;
import pi.InterfaceC5967b;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;
import qi.C6234q;
import qi.InterfaceC6220c;
import qj.InterfaceC6237b;
import rj.InterfaceC6558d;
import tx.AbstractC7262v;
import ue.InterfaceC7424f;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Keep
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final C2317w Companion = new C2317w();
    private static final C6234q appContext = C6234q.m12250a(Context.class);
    private static final C6234q firebaseApp = C6234q.m12250a(C3773g.class);
    private static final C6234q firebaseInstallationsApi = C6234q.m12250a(InterfaceC6558d.class);
    private static final C6234q backgroundDispatcher = new C6234q(InterfaceC5966a.class, AbstractC7262v.class);
    private static final C6234q blockingDispatcher = new C6234q(InterfaceC5967b.class, AbstractC7262v.class);
    private static final C6234q transportFactory = C6234q.m12250a(InterfaceC7424f.class);
    private static final C6234q firebaseSessionsComponent = C6234q.m12250a(InterfaceC2312r.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2309o getComponents$lambda$0(InterfaceC6220c interfaceC6220c) {
        return (C2309o) ((C2303i) ((InterfaceC2312r) interfaceC6220c.mo12237d(firebaseSessionsComponent))).f10434p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2312r getComponents$lambda$1(InterfaceC6220c interfaceC6220c) {
        Object objMo12237d = interfaceC6220c.mo12237d(appContext);
        AbstractC4154l.m8922e(objMo12237d, "get(...)");
        Object objMo12237d2 = interfaceC6220c.mo12237d(backgroundDispatcher);
        AbstractC4154l.m8922e(objMo12237d2, "get(...)");
        Object objMo12237d3 = interfaceC6220c.mo12237d(blockingDispatcher);
        AbstractC4154l.m8922e(objMo12237d3, "get(...)");
        Object objMo12237d4 = interfaceC6220c.mo12237d(firebaseApp);
        AbstractC4154l.m8922e(objMo12237d4, "get(...)");
        Object objMo12237d5 = interfaceC6220c.mo12237d(firebaseInstallationsApi);
        AbstractC4154l.m8922e(objMo12237d5, "get(...)");
        InterfaceC6237b interfaceC6237bMo12240g = interfaceC6220c.mo12240g(transportFactory);
        AbstractC4154l.m8922e(interfaceC6237bMo12240g, "getProvider(...)");
        C2303i c2303i = new C2303i();
        c2303i.f10419a = m0.m5980a((C3773g) objMo12237d4);
        m0 m0VarM5980a = m0.m5980a((Context) objMo12237d);
        c2303i.f10420b = m0VarM5980a;
        c2303i.f10421c = C2961a.m7243a(new C2307m(m0VarM5980a, 2));
        c2303i.f10422d = C2961a.m7243a(AbstractC2315u.f10493a);
        c2303i.f10423e = m0.m5980a((InterfaceC6558d) objMo12237d5);
        c2303i.f10424f = C2961a.m7243a(new C2307m(c2303i.f10419a, 1));
        m0 m0VarM5980a2 = m0.m5980a((InterfaceC7564h) objMo12237d3);
        c2303i.f10425g = m0VarM5980a2;
        c2303i.f10426h = C2961a.m7243a(new C2313s(c2303i.f10424f, m0VarM5980a2));
        c2303i.f10427i = m0.m5980a((InterfaceC7564h) objMo12237d2);
        c2303i.f10428j = C2961a.m7243a(new y0(c2303i.f10421c, C2961a.m7243a(new w0(c2303i.f10422d, c2303i.f10423e, c2303i.f10424f, c2303i.f10426h, C2961a.m7243a(new C2314t(c2303i.f10427i, c2303i.f10422d, C2961a.m7243a(new C2313s(c2303i.f10420b, c2303i.f10425g, 0)))))), 1));
        InterfaceC2963c interfaceC2963cM7243a = C2961a.m7243a(AbstractC2315u.f10494b);
        c2303i.f10429k = interfaceC2963cM7243a;
        c2303i.f10430l = C2961a.m7243a(new y0(c2303i.f10422d, interfaceC2963cM7243a, 0));
        c2303i.f10431m = C2961a.m7243a(new w0(c2303i.f10419a, c2303i.f10423e, c2303i.f10428j, C2961a.m7243a(new C2307m(m0.m5980a(interfaceC6237bMo12240g), 0)), c2303i.f10427i));
        c2303i.f10432n = C2961a.m7243a(new C2314t(c2303i.f10420b, c2303i.f10425g, C2961a.m7243a(new m0(0, c2303i.f10430l))));
        InterfaceC2963c interfaceC2963cM7243a2 = C2961a.m7243a(new i1(c2303i.f10428j, c2303i.f10430l, c2303i.f10431m, c2303i.f10422d, c2303i.f10432n, C2961a.m7243a(new C2313s(c2303i.f10420b, c2303i.f10429k, 1)), c2303i.f10427i));
        c2303i.f10433o = interfaceC2963cM7243a2;
        c2303i.f10434p = C2961a.m7243a(new C2318x(c2303i.f10419a, c2303i.f10428j, c2303i.f10427i, C2961a.m7243a(new m0(1, interfaceC2963cM7243a2))));
        return c2303i;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6219b> getComponents() {
        C6218a c6218aM12231a = C6219b.m12231a(C2309o.class);
        c6218aM12231a.f30206a = LIBRARY_NAME;
        c6218aM12231a.m12227a(C6228k.m12247b(firebaseSessionsComponent));
        c6218aM12231a.f30212g = new C1612b(26);
        c6218aM12231a.m12230d(2);
        C6219b c6219bM12228b = c6218aM12231a.m12228b();
        C6218a c6218aM12231a2 = C6219b.m12231a(InterfaceC2312r.class);
        c6218aM12231a2.f30206a = "fire-sessions-component";
        c6218aM12231a2.m12227a(C6228k.m12247b(appContext));
        c6218aM12231a2.m12227a(C6228k.m12247b(backgroundDispatcher));
        c6218aM12231a2.m12227a(C6228k.m12247b(blockingDispatcher));
        c6218aM12231a2.m12227a(C6228k.m12247b(firebaseApp));
        c6218aM12231a2.m12227a(C6228k.m12247b(firebaseInstallationsApi));
        c6218aM12231a2.m12227a(new C6228k(transportFactory, 1, 1));
        c6218aM12231a2.f30212g = new C1612b(27);
        return pe.m10834i(c6219bM12228b, c6218aM12231a2.m12228b(), da.m11591a(LIBRARY_NAME, "3.0.0"));
    }
}
