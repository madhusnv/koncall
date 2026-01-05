package p001o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.google.firebase.perf.util.Constants;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class yw7 {

    /* renamed from: g */
    public static final boolean f56191g;

    /* renamed from: h */
    public static final boolean f56192h;

    /* renamed from: i */
    public static final File f56193i;

    /* renamed from: j */
    public static volatile yw7 f56194j;

    /* renamed from: k */
    public static volatile int f56195k;

    /* renamed from: b */
    public final int f56197b;

    /* renamed from: c */
    public final int f56198c;

    /* renamed from: d */
    public int f56199d;

    /* renamed from: e */
    public boolean f56200e = true;

    /* renamed from: f */
    public final AtomicBoolean f56201f = new AtomicBoolean(false);

    /* renamed from: a */
    public final boolean f56196a = m58429f();

    static {
        int i = Build.VERSION.SDK_INT;
        f56191g = i < 29;
        f56192h = i >= 26;
        f56193i = new File("/proc/self/fd");
        f56195k = -1;
    }

    public yw7() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f56197b = 20000;
            this.f56198c = 0;
        } else {
            this.f56197b = Constants.FROZEN_FRAME_TIME;
            this.f56198c = 128;
        }
    }

    /* renamed from: b */
    public static yw7 m58428b() {
        if (f56194j == null) {
            synchronized (yw7.class) {
                if (f56194j == null) {
                    f56194j = new yw7();
                }
            }
        }
        return f56194j;
    }

    /* renamed from: f */
    public static boolean m58429f() {
        return (m58430g() || m58431h()) ? false : true;
    }

    /* renamed from: g */
    public static boolean m58430g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m58431h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    /* renamed from: a */
    public final boolean m58432a() {
        return f56191g && !this.f56201f.get();
    }

    /* renamed from: c */
    public final int m58433c() {
        return f56195k != -1 ? f56195k : this.f56197b;
    }

    /* renamed from: d */
    public final synchronized boolean m58434d() {
        boolean z = true;
        int i = this.f56199d + 1;
        this.f56199d = i;
        if (i >= 50) {
            this.f56199d = 0;
            int length = f56193i.list().length;
            long jM58433c = m58433c();
            if (length >= jM58433c) {
                z = false;
            }
            this.f56200e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(jM58433c);
            }
        }
        return this.f56200e;
    }

    /* renamed from: e */
    public boolean m58435e(int i, int i2, boolean z, boolean z2) {
        int i3;
        return z && this.f56196a && f56192h && !m58432a() && !z2 && i >= (i3 = this.f56198c) && i2 >= i3 && m58434d();
    }

    /* renamed from: i */
    public boolean m58436i(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zM58435e = m58435e(i, i2, z, z2);
        if (zM58435e) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zM58435e;
    }
}
