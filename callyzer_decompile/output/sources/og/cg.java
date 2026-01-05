package og;

import android.os.Build;
import android.os.Bundle;
import d6.AbstractC1614d;
import dx.AbstractC1851a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import sw.C6962f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class cg {
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10586a(t1.AbstractC7000y r23, w2.InterfaceC7879r r24, o1.h1 r25, t1.C6983h r26, int r27, float r28, w2.C7870i r29, l1.C4319h r30, boolean r31, ex.InterfaceC2139c r32, o3.InterfaceC5278a r33, l1.InterfaceC4326o r34, i1.C3128g r35, s2.C6734c r36, k2.InterfaceC3962k r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og.cg.m10586a(t1.y, w2.r, o1.h1, t1.h, int, float, w2.i, l1.h, boolean, ex.c, o3.a, l1.o, i1.g, s2.c, k2.k, int, int):void");
    }

    /* renamed from: b */
    public static final int m10587b(String key, Bundle bundle) {
        AbstractC4154l.m8923f(key, "key");
        int i10 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i10 != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10;
        }
        dg.m10615b(key);
        throw null;
    }

    /* renamed from: c */
    public static final Bundle m10588c(String key, Bundle bundle) {
        AbstractC4154l.m8923f(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        dg.m10615b(key);
        throw null;
    }

    /* renamed from: d */
    public static final ArrayList m10589d(String key, Bundle bundle) {
        AbstractC4154l.m8923f(key, "key");
        ArrayList arrayListM5268d = Build.VERSION.SDK_INT >= 34 ? AbstractC1614d.m5268d(bundle, key, AbstractC1851a.m5483b(kotlin.jvm.internal.a0.m8901a(Bundle.class))) : bundle.getParcelableArrayList(key);
        if (arrayListM5268d != null) {
            return arrayListM5268d;
        }
        dg.m10615b(key);
        throw null;
    }

    /* renamed from: e */
    public static final boolean m10590e(String key, Bundle bundle) {
        AbstractC4154l.m8923f(key, "key");
        return bundle.containsKey(key) && bundle.get(key) == null;
    }

    /* renamed from: f */
    public static final C6962f m10591f(Bundle bundle) {
        C6962f c6962f = new C6962f(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC4154l.m8920c(str);
            c6962f.put(str, bundle.get(str));
        }
        return c6962f.m13230d();
    }
}
