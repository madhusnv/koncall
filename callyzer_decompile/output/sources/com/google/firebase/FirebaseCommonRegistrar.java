package com.google.firebase;

import ak.C0172k;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import gm.C2657z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import ji.C3773g;
import oj.C5391c;
import oj.C5392d;
import oj.InterfaceC5393e;
import oj.InterfaceC5395g;
import pg.da;
import pi.InterfaceC5966a;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;
import qi.C6234q;
import qw.C6356f;
import w3.C7892j;
import zj.C8984a;
import zj.C8985b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: a */
    public static String m4461a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C6218a c6218aM12231a = C6219b.m12231a(C8985b.class);
        c6218aM12231a.m12227a(new C6228k(2, 0, C8984a.class));
        c6218aM12231a.f30212g = new C7892j(21);
        arrayList.add(c6218aM12231a.m12228b());
        C6234q c6234q = new C6234q(InterfaceC5966a.class, Executor.class);
        C6218a c6218a = new C6218a(C5391c.class, new Class[]{InterfaceC5393e.class, InterfaceC5395g.class});
        c6218a.m12227a(C6228k.m12246a(Context.class));
        c6218a.m12227a(C6228k.m12246a(C3773g.class));
        c6218a.m12227a(new C6228k(2, 0, C5392d.class));
        c6218a.m12227a(new C6228k(1, 1, C8985b.class));
        c6218a.m12227a(new C6228k(c6234q, 1, 0));
        c6218a.f30212g = new C0172k(c6234q, 1);
        arrayList.add(c6218a.m12228b());
        arrayList.add(da.m11591a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(da.m11591a("fire-core", "22.0.0"));
        arrayList.add(da.m11591a("device-name", m4461a(Build.PRODUCT)));
        arrayList.add(da.m11591a("device-model", m4461a(Build.DEVICE)));
        arrayList.add(da.m11591a("device-brand", m4461a(Build.BRAND)));
        arrayList.add(da.m11592b("android-target-sdk", new C2657z(14)));
        arrayList.add(da.m11592b("android-min-sdk", new C2657z(15)));
        arrayList.add(da.m11592b("android-platform", new C2657z(16)));
        arrayList.add(da.m11592b("android-installer", new C2657z(17)));
        try {
            C6356f.f30752b.getClass();
            str = "2.2.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(da.m11591a("kotlin", str));
        }
        return arrayList;
    }
}
