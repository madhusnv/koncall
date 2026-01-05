package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p001o.j5e;
import p001o.weg;

/* loaded from: classes2.dex */
public class ExtraCroppingQuirk implements j5e {

    /* renamed from: a */
    public static final Map f6062a;

    /* renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk$a */
    public static /* synthetic */ class C1889a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6063a;

        static {
            int[] iArr = new int[weg.EnumC17833b.values().length];
            f6063a = iArr;
            try {
                iArr[weg.EnumC17833b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6063a[weg.EnumC17833b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6063a[weg.EnumC17833b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f6062a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    /* renamed from: d */
    public static boolean m4552d() {
        if (!("samsung".equalsIgnoreCase(Build.BRAND) && f6062a.containsKey(Build.MODEL.toUpperCase(Locale.US)))) {
            return false;
        }
        Range range = (Range) f6062a.get(Build.MODEL.toUpperCase(Locale.US));
        if (range == null) {
            return true;
        }
        return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
    }

    /* renamed from: e */
    public static boolean m4553e() {
        return m4552d();
    }

    /* renamed from: c */
    public Size m4554c(weg.EnumC17833b enumC17833b) {
        if (!m4552d()) {
            return null;
        }
        int i = C1889a.f6063a[enumC17833b.ordinal()];
        if (i == 1) {
            return new Size(1920, 1080);
        }
        if (i == 2) {
            return new Size(1280, 720);
        }
        if (i != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
