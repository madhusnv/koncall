package pg;

import a1.C0004c;
import android.content.Context;
import gm.C2657z;
import q1.C6090r;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;
import zj.C8984a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class da {
    /* renamed from: a */
    public static C6219b m11591a(String str, String str2) {
        C8984a c8984a = new C8984a(str, str2);
        C6218a c6218aM12231a = C6219b.m12231a(C8984a.class);
        c6218aM12231a.f30208c = 1;
        c6218aM12231a.f30212g = new a1.c0(19, c8984a);
        return c6218aM12231a.m12228b();
    }

    /* renamed from: b */
    public static C6219b m11592b(String str, C2657z c2657z) {
        C6218a c6218aM12231a = C6219b.m12231a(C8984a.class);
        c6218aM12231a.f30208c = 1;
        c6218aM12231a.m12227a(C6228k.m12246a(Context.class));
        c6218aM12231a.f30212g = new C0004c(25, str, c2657z);
        return c6218aM12231a.m12228b();
    }

    /* renamed from: c */
    public static final int m11593c(C6090r c6090r) {
        return (int) (c6090r.f29730o == k1.x0.Vertical ? c6090r.m12112f() & 4294967295L : c6090r.m12112f() >> 32);
    }
}
