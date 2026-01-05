package com.google.firebase.installations;

import a1.c0;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ji.C3773g;
import mk.C4764c;
import oj.C5392d;
import oj.InterfaceC5393e;
import pg.da;
import pi.InterfaceC5966a;
import pi.InterfaceC5967b;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;
import qi.C6234q;
import qi.InterfaceC6220c;
import ri.ExecutorC6553k;
import rj.InterfaceC6558d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC6558d lambda$getComponents$0(InterfaceC6220c interfaceC6220c) {
        return new C1401a((C3773g) interfaceC6220c.mo12234a(C3773g.class), interfaceC6220c.mo12236c(InterfaceC5393e.class), (ExecutorService) interfaceC6220c.mo12237d(new C6234q(InterfaceC5966a.class, ExecutorService.class)), new ExecutorC6553k((Executor) interfaceC6220c.mo12237d(new C6234q(InterfaceC5967b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6219b> getComponents() {
        C6218a c6218aM12231a = C6219b.m12231a(InterfaceC6558d.class);
        c6218aM12231a.f30206a = LIBRARY_NAME;
        c6218aM12231a.m12227a(C6228k.m12246a(C3773g.class));
        c6218aM12231a.m12227a(new C6228k(0, 1, InterfaceC5393e.class));
        c6218aM12231a.m12227a(new C6228k(new C6234q(InterfaceC5966a.class, ExecutorService.class), 1, 0));
        c6218aM12231a.m12227a(new C6228k(new C6234q(InterfaceC5967b.class, Executor.class), 1, 0));
        c6218aM12231a.f30212g = new C4764c(8);
        C6219b c6219bM12228b = c6218aM12231a.m12228b();
        C5392d c5392d = new C5392d(0);
        C6218a c6218aM12231a2 = C6219b.m12231a(C5392d.class);
        c6218aM12231a2.f30208c = 1;
        c6218aM12231a2.f30212g = new c0(19, c5392d);
        return Arrays.asList(c6219bM12228b, c6218aM12231a2.m12228b(), da.m11591a(LIBRARY_NAME, "19.0.0"));
    }
}
