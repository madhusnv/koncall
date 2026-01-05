package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gm.C2657z;
import hj.InterfaceC2959a;
import hj.InterfaceC2960b;
import java.util.Arrays;
import java.util.List;
import pg.da;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;
import qi.C6234q;
import qi.InterfaceC6220c;
import ue.InterfaceC7424f;
import ve.C7707a;
import xe.C8365q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC7424f lambda$getComponents$0(InterfaceC6220c interfaceC6220c) {
        C8365q.m15537b((Context) interfaceC6220c.mo12234a(Context.class));
        return C8365q.m15536a().m15538c(C7707a.f37228f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC7424f lambda$getComponents$1(InterfaceC6220c interfaceC6220c) {
        C8365q.m15537b((Context) interfaceC6220c.mo12234a(Context.class));
        return C8365q.m15536a().m15538c(C7707a.f37228f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC7424f lambda$getComponents$2(InterfaceC6220c interfaceC6220c) {
        C8365q.m15537b((Context) interfaceC6220c.mo12234a(Context.class));
        return C8365q.m15536a().m15538c(C7707a.f37227e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6219b> getComponents() {
        C6218a c6218aM12231a = C6219b.m12231a(InterfaceC7424f.class);
        c6218aM12231a.f30206a = LIBRARY_NAME;
        c6218aM12231a.m12227a(C6228k.m12246a(Context.class));
        c6218aM12231a.f30212g = new C2657z(8);
        C6219b c6219bM12228b = c6218aM12231a.m12228b();
        C6218a c6218aM12232b = C6219b.m12232b(new C6234q(InterfaceC2959a.class, InterfaceC7424f.class));
        c6218aM12232b.m12227a(C6228k.m12246a(Context.class));
        c6218aM12232b.f30212g = new C2657z(9);
        C6219b c6219bM12228b2 = c6218aM12232b.m12228b();
        C6218a c6218aM12232b2 = C6219b.m12232b(new C6234q(InterfaceC2960b.class, InterfaceC7424f.class));
        c6218aM12232b2.m12227a(C6228k.m12246a(Context.class));
        c6218aM12232b2.f30212g = new C2657z(10);
        return Arrays.asList(c6219bM12228b, c6219bM12228b2, c6218aM12232b2.m12228b(), da.m11591a(LIBRARY_NAME, "19.0.0"));
    }
}
