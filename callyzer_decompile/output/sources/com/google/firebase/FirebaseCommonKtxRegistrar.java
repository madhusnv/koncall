package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import ji.C3774h;
import og.pe;
import pi.InterfaceC5966a;
import pi.InterfaceC5967b;
import pi.InterfaceC5968c;
import pi.InterfaceC5969d;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;
import qi.C6234q;
import tx.AbstractC7262v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6219b> getComponents() {
        C6218a c6218aM12232b = C6219b.m12232b(new C6234q(InterfaceC5966a.class, AbstractC7262v.class));
        c6218aM12232b.m12227a(new C6228k(new C6234q(InterfaceC5966a.class, Executor.class), 1, 0));
        c6218aM12232b.f30212g = C3774h.f19672b;
        C6219b c6219bM12228b = c6218aM12232b.m12228b();
        C6218a c6218aM12232b2 = C6219b.m12232b(new C6234q(InterfaceC5968c.class, AbstractC7262v.class));
        c6218aM12232b2.m12227a(new C6228k(new C6234q(InterfaceC5968c.class, Executor.class), 1, 0));
        c6218aM12232b2.f30212g = C3774h.f19673c;
        C6219b c6219bM12228b2 = c6218aM12232b2.m12228b();
        C6218a c6218aM12232b3 = C6219b.m12232b(new C6234q(InterfaceC5967b.class, AbstractC7262v.class));
        c6218aM12232b3.m12227a(new C6228k(new C6234q(InterfaceC5967b.class, Executor.class), 1, 0));
        c6218aM12232b3.f30212g = C3774h.f19674d;
        C6219b c6219bM12228b3 = c6218aM12232b3.m12228b();
        C6218a c6218aM12232b4 = C6219b.m12232b(new C6234q(InterfaceC5969d.class, AbstractC7262v.class));
        c6218aM12232b4.m12227a(new C6228k(new C6234q(InterfaceC5969d.class, Executor.class), 1, 0));
        c6218aM12232b4.f30212g = C3774h.f19675e;
        return pe.m10834i(c6219bM12228b, c6219bM12228b2, c6219bM12228b3, c6218aM12232b4.m12228b());
    }
}
