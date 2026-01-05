package com.google.firebase.messaging;

import ak.C0172k;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import hj.InterfaceC2960b;
import java.util.Arrays;
import java.util.List;
import ji.C3773g;
import nj.InterfaceC5077c;
import oj.InterfaceC5395g;
import pg.da;
import pj.InterfaceC5970a;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;
import qi.C6234q;
import qi.InterfaceC6220c;
import rj.InterfaceC6558d;
import ue.InterfaceC7424f;
import zj.C8985b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C6234q c6234q, InterfaceC6220c interfaceC6220c) {
        C3773g c3773g = (C3773g) interfaceC6220c.mo12234a(C3773g.class);
        if (interfaceC6220c.mo12234a(InterfaceC5970a.class) == null) {
            return new FirebaseMessaging(c3773g, interfaceC6220c.mo12236c(C8985b.class), interfaceC6220c.mo12236c(InterfaceC5395g.class), (InterfaceC6558d) interfaceC6220c.mo12234a(InterfaceC6558d.class), interfaceC6220c.mo12240g(c6234q), (InterfaceC5077c) interfaceC6220c.mo12234a(InterfaceC5077c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C6219b> getComponents() {
        C6234q c6234q = new C6234q(InterfaceC2960b.class, InterfaceC7424f.class);
        C6218a c6218aM12231a = C6219b.m12231a(FirebaseMessaging.class);
        c6218aM12231a.f30206a = LIBRARY_NAME;
        c6218aM12231a.m12227a(C6228k.m12246a(C3773g.class));
        c6218aM12231a.m12227a(new C6228k(0, 0, InterfaceC5970a.class));
        c6218aM12231a.m12227a(new C6228k(0, 1, C8985b.class));
        c6218aM12231a.m12227a(new C6228k(0, 1, InterfaceC5395g.class));
        c6218aM12231a.m12227a(C6228k.m12246a(InterfaceC6558d.class));
        c6218aM12231a.m12227a(new C6228k(c6234q, 0, 1));
        c6218aM12231a.m12227a(C6228k.m12246a(InterfaceC5077c.class));
        c6218aM12231a.f30212g = new C0172k(c6234q, 2);
        c6218aM12231a.m12230d(1);
        return Arrays.asList(c6218aM12231a.m12228b(), da.m11591a(LIBRARY_NAME, "25.0.0"));
    }
}
