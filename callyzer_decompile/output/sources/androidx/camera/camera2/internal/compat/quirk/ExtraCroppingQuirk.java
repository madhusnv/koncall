package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import i0.n2;
import i0.s1;
import java.util.HashMap;
import java.util.Locale;
import p023y.AbstractC8524b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ExtraCroppingQuirk implements s1 {

    /* renamed from: a */
    public static final HashMap f1823a;

    static {
        HashMap map = new HashMap();
        f1823a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    /* renamed from: b */
    public static Size m599b(n2 n2Var) {
        if (!m600c()) {
            return null;
        }
        int i10 = AbstractC8524b.f41448a[n2Var.ordinal()];
        if (i10 == 1) {
            return new Size(1920, 1080);
        }
        if (i10 == 2) {
            return new Size(1280, 720);
        }
        if (i10 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }

    /* renamed from: c */
    public static boolean m600c() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.MODEL;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        HashMap map = f1823a;
        if (!map.containsKey(upperCase)) {
            return false;
        }
        Range range = (Range) map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
