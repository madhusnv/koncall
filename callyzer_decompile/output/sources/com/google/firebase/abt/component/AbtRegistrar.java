package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gm.C2657z;
import java.util.Arrays;
import java.util.List;
import li.C4477a;
import ni.InterfaceC5073b;
import pg.da;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;
import qi.InterfaceC6220c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C4477a lambda$getComponents$0(InterfaceC6220c interfaceC6220c) {
        return new C4477a((Context) interfaceC6220c.mo12234a(Context.class), interfaceC6220c.mo12236c(InterfaceC5073b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6219b> getComponents() {
        C6218a c6218aM12231a = C6219b.m12231a(C4477a.class);
        c6218aM12231a.f30206a = LIBRARY_NAME;
        c6218aM12231a.m12227a(C6228k.m12246a(Context.class));
        c6218aM12231a.m12227a(new C6228k(0, 1, InterfaceC5073b.class));
        c6218aM12231a.f30212g = new C2657z(20);
        return Arrays.asList(c6218aM12231a.m12228b(), da.m11591a(LIBRARY_NAME, "21.1.1"));
    }
}
