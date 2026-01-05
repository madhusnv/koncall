package com.google.firebase.crashlytics;

import a1.c0;
import com.google.firebase.components.ComponentRegistrar;
import dk.InterfaceC1732a;
import dy.C1855c;
import gk.C2620a;
import gk.C2622c;
import gk.EnumC2623d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import ji.C3773g;
import kotlin.jvm.internal.AbstractC4154l;
import ni.InterfaceC5073b;
import pg.da;
import pi.InterfaceC5966a;
import pi.InterfaceC5967b;
import pi.InterfaceC5968c;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;
import qi.C6234q;
import rj.InterfaceC6558d;
import si.C6847c;
import ti.C7162b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: d */
    public static final /* synthetic */ int f7138d = 0;

    /* renamed from: a */
    public final C6234q f7139a = new C6234q(InterfaceC5966a.class, ExecutorService.class);

    /* renamed from: b */
    public final C6234q f7140b = new C6234q(InterfaceC5967b.class, ExecutorService.class);

    /* renamed from: c */
    public final C6234q f7141c = new C6234q(InterfaceC5968c.class, ExecutorService.class);

    static {
        EnumC2623d subscriberName = EnumC2623d.CRASHLYTICS;
        C2622c c2622c = C2622c.f14197a;
        AbstractC4154l.m8923f(subscriberName, "subscriberName");
        Map map = C2622c.f14198b;
        if (map.containsKey(subscriberName)) {
            subscriberName.toString();
        } else {
            map.put(subscriberName, new C2620a(new C1855c(true)));
            subscriberName.toString();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C6218a c6218aM12231a = C6219b.m12231a(C6847c.class);
        c6218aM12231a.f30206a = "fire-cls";
        c6218aM12231a.m12227a(C6228k.m12246a(C3773g.class));
        c6218aM12231a.m12227a(C6228k.m12246a(InterfaceC6558d.class));
        c6218aM12231a.m12227a(new C6228k(this.f7139a, 1, 0));
        c6218aM12231a.m12227a(new C6228k(this.f7140b, 1, 0));
        c6218aM12231a.m12227a(new C6228k(this.f7141c, 1, 0));
        c6218aM12231a.m12227a(new C6228k(0, 2, C7162b.class));
        c6218aM12231a.m12227a(new C6228k(0, 2, InterfaceC5073b.class));
        c6218aM12231a.m12227a(new C6228k(0, 2, InterfaceC1732a.class));
        c6218aM12231a.f30212g = new c0(20, this);
        c6218aM12231a.m12230d(2);
        return Arrays.asList(c6218aM12231a.m12228b(), da.m11591a("fire-cls", "20.0.0"));
    }
}
