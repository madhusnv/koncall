package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import i0.s1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ZslDisablerQuirk implements s1 {

    /* renamed from: a */
    public static final List f1849a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");

    /* renamed from: b */
    public static final List f1850b = Arrays.asList("MI 8");

    /* renamed from: b */
    public static boolean m603b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
