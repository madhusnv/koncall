package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.l1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import ji.C3773g;
import k0.ExecutorC3891a;
import ng.C5070u;
import ni.C5074c;
import ni.InterfaceC5073b;
import nj.InterfaceC5077c;
import oj.C5392d;
import pg.da;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;
import qi.C6229l;
import qi.InterfaceC6220c;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC5073b lambda$getComponents$0(InterfaceC6220c interfaceC6220c) {
        C3773g c3773g = (C3773g) interfaceC6220c.mo12234a(C3773g.class);
        Context context = (Context) interfaceC6220c.mo12234a(Context.class);
        InterfaceC5077c interfaceC5077c = (InterfaceC5077c) interfaceC6220c.mo12234a(InterfaceC5077c.class);
        AbstractC6840z.m13036g(c3773g);
        AbstractC6840z.m13036g(context);
        AbstractC6840z.m13036g(interfaceC5077c);
        AbstractC6840z.m13036g(context.getApplicationContext());
        if (C5074c.f24883c == null) {
            synchronized (C5074c.class) {
                try {
                    if (C5074c.f24883c == null) {
                        Bundle bundle = new Bundle(1);
                        c3773g.m8293a();
                        if ("[DEFAULT]".equals(c3773g.f19663b)) {
                            ((C6229l) interfaceC5077c).m12248a(ExecutorC3891a.f19988c, C5392d.f27078b);
                            bundle.putBoolean("dataCollectionDefaultEnabled", c3773g.m8297g());
                        }
                        C5074c.f24883c = new C5074c(l1.m3479e(context, bundle).f6277b);
                    }
                } finally {
                }
            }
        }
        return C5074c.f24883c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C6219b> getComponents() {
        C6218a c6218aM12231a = C6219b.m12231a(InterfaceC5073b.class);
        c6218aM12231a.m12227a(C6228k.m12246a(C3773g.class));
        c6218aM12231a.m12227a(C6228k.m12246a(Context.class));
        c6218aM12231a.m12227a(C6228k.m12246a(InterfaceC5077c.class));
        c6218aM12231a.f30212g = C5070u.f24864c;
        c6218aM12231a.m12230d(2);
        return Arrays.asList(c6218aM12231a.m12228b(), da.m11591a("fire-analytics", "23.0.0"));
    }
}
