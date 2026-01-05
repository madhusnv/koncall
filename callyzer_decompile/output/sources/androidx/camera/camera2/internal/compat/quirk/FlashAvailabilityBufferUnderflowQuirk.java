package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import i0.s1;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements s1 {

    /* renamed from: a */
    public static final HashSet f1828a;

    static {
        HashSet hashSet = new HashSet();
        f1828a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
