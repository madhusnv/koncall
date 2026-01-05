package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import i0.k2;
import i0.l2;
import i0.n2;
import i0.p2;
import i0.s1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements s1 {

    /* renamed from: a */
    public static final k2 f1824a;

    /* renamed from: b */
    public static final k2 f1825b;

    /* renamed from: c */
    public static final HashSet f1826c;

    /* renamed from: d */
    public static final HashSet f1827d;

    static {
        k2 k2Var = new k2();
        n2 n2Var = n2.YUV;
        l2 l2Var = l2.VGA;
        k2Var.m7356a(p2.m7409a(n2Var, l2Var));
        n2 n2Var2 = n2.PRIV;
        l2 l2Var2 = l2.PREVIEW;
        k2Var.m7356a(p2.m7409a(n2Var2, l2Var2));
        l2 l2Var3 = l2.MAXIMUM;
        k2Var.m7356a(p2.m7409a(n2Var, l2Var3));
        f1824a = k2Var;
        k2 k2Var2 = new k2();
        a1.m14344x(n2Var2, l2Var2, k2Var2, n2Var2, l2Var);
        k2Var2.m7356a(p2.m7409a(n2Var, l2Var3));
        f1825b = k2Var2;
        f1826c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));
        f1827d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));
    }

    /* renamed from: b */
    public static boolean m601b() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f1827d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
