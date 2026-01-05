package com.google.firebase.remoteconfig;

import ak.C0171j;
import ak.C0172k;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import dk.InterfaceC1732a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import ji.C3773g;
import ki.C4079b;
import li.C4477a;
import ni.InterfaceC5073b;
import pg.da;
import pi.InterfaceC5967b;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;
import qi.C6234q;
import qi.InterfaceC6220c;
import rj.InterfaceC6558d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static C0171j lambda$getComponents$0(C6234q c6234q, InterfaceC6220c interfaceC6220c) {
        C4079b c4079b;
        Context context = (Context) interfaceC6220c.mo12234a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) interfaceC6220c.mo12237d(c6234q);
        C3773g c3773g = (C3773g) interfaceC6220c.mo12234a(C3773g.class);
        InterfaceC6558d interfaceC6558d = (InterfaceC6558d) interfaceC6220c.mo12234a(InterfaceC6558d.class);
        C4477a c4477a = (C4477a) interfaceC6220c.mo12234a(C4477a.class);
        synchronized (c4477a) {
            try {
                if (!c4477a.f22300a.containsKey("frc")) {
                    c4477a.f22300a.put("frc", new C4079b(c4477a.f22301b));
                }
                c4079b = (C4079b) c4477a.f22300a.get("frc");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new C0171j(context, scheduledExecutorService, c3773g, interfaceC6558d, c4079b, interfaceC6220c.mo12236c(InterfaceC5073b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6219b> getComponents() {
        C6234q c6234q = new C6234q(InterfaceC5967b.class, ScheduledExecutorService.class);
        C6218a c6218a = new C6218a(C0171j.class, new Class[]{InterfaceC1732a.class});
        c6218a.f30206a = LIBRARY_NAME;
        c6218a.m12227a(C6228k.m12246a(Context.class));
        c6218a.m12227a(new C6228k(c6234q, 1, 0));
        c6218a.m12227a(C6228k.m12246a(C3773g.class));
        c6218a.m12227a(C6228k.m12246a(InterfaceC6558d.class));
        c6218a.m12227a(C6228k.m12246a(C4477a.class));
        c6218a.m12227a(new C6228k(0, 1, InterfaceC5073b.class));
        c6218a.f30212g = new C0172k(c6234q, 0);
        c6218a.m12230d(2);
        return Arrays.asList(c6218a.m12228b(), da.m11591a(LIBRARY_NAME, "23.0.0"));
    }
}
