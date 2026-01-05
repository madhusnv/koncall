package p001o;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* loaded from: classes5.dex */
public abstract class uqi {

    /* renamed from: a */
    public static final char[] f49385a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f49386b = new char[64];

    /* renamed from: c */
    public static volatile Handler f49387c;

    /* renamed from: o.uqi$a */
    public static /* synthetic */ class C17432a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49388a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f49388a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49388a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49388a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49388a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49388a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static void m51920a() {
        if (!m51936q()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m51921b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static boolean m51922c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static String m51923d(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f49385a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static Queue m51924e(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: f */
    public static int m51925f(int i, int i2, Bitmap.Config config) {
        return i * i2 * m51927h(config);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [int, org.eclipse.jdt.core.IAnnotation[]] */
    /* renamed from: g */
    public static int m51926g(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAnnotations();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: h */
    public static int m51927h(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C17432a.f49388a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: i */
    public static List m51928i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static Handler m51929j() {
        if (f49387c == null) {
            synchronized (uqi.class) {
                if (f49387c == null) {
                    f49387c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f49387c;
    }

    /* renamed from: k */
    public static int m51930k(float f) {
        return m51931l(f, 17);
    }

    /* renamed from: l */
    public static int m51931l(float f, int i) {
        return m51932m(Float.floatToIntBits(f), i);
    }

    /* renamed from: m */
    public static int m51932m(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: n */
    public static int m51933n(Object obj, int i) {
        return m51932m(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: o */
    public static int m51934o(boolean z, int i) {
        return m51932m(z ? 1 : 0, i);
    }

    /* renamed from: p */
    public static boolean m51935p() {
        return !m51936q();
    }

    /* renamed from: q */
    public static boolean m51936q() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: r */
    public static boolean m51937r(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: s */
    public static boolean m51938s(int i, int i2) {
        return m51937r(i) && m51937r(i2);
    }

    /* renamed from: t */
    public static void m51939t(Runnable runnable) {
        m51929j().post(runnable);
    }

    /* renamed from: u */
    public static void m51940u(Runnable runnable) {
        m51929j().removeCallbacks(runnable);
    }

    /* renamed from: v */
    public static String m51941v(byte[] bArr) {
        String strM51923d;
        char[] cArr = f49386b;
        synchronized (cArr) {
            strM51923d = m51923d(bArr, cArr);
        }
        return strM51923d;
    }
}
