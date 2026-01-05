package p001o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes5.dex */
public final class hab {

    /* renamed from: a */
    public final int f26481a;

    /* renamed from: b */
    public final int f26482b;

    /* renamed from: c */
    public final Context f26483c;

    /* renamed from: d */
    public final int f26484d;

    /* renamed from: o.hab$a */
    public static final class C13899a {

        /* renamed from: i */
        public static final int f26485i;

        /* renamed from: a */
        public final Context f26486a;

        /* renamed from: b */
        public ActivityManager f26487b;

        /* renamed from: c */
        public InterfaceC13901c f26488c;

        /* renamed from: e */
        public float f26490e;

        /* renamed from: d */
        public float f26489d = 2.0f;

        /* renamed from: f */
        public float f26491f = 0.4f;

        /* renamed from: g */
        public float f26492g = 0.33f;

        /* renamed from: h */
        public int f26493h = 4194304;

        static {
            f26485i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public C13899a(Context context) {
            this.f26490e = f26485i;
            this.f26486a = context;
            this.f26487b = (ActivityManager) context.getSystemService("activity");
            this.f26488c = new C13900b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !hab.m30040e(this.f26487b)) {
                return;
            }
            this.f26490e = 0.0f;
        }

        /* renamed from: a */
        public hab m30045a() {
            return new hab(this);
        }
    }

    /* renamed from: o.hab$b */
    public static final class C13900b implements InterfaceC13901c {

        /* renamed from: a */
        public final DisplayMetrics f26494a;

        public C13900b(DisplayMetrics displayMetrics) {
            this.f26494a = displayMetrics;
        }

        @Override // p001o.hab.InterfaceC13901c
        /* renamed from: a */
        public int mo30046a() {
            return this.f26494a.heightPixels;
        }

        @Override // p001o.hab.InterfaceC13901c
        /* renamed from: b */
        public int mo30047b() {
            return this.f26494a.widthPixels;
        }
    }

    /* renamed from: o.hab$c */
    public interface InterfaceC13901c {
        /* renamed from: a */
        int mo30046a();

        /* renamed from: b */
        int mo30047b();
    }

    public hab(C13899a c13899a) {
        this.f26483c = c13899a.f26486a;
        int i = m30040e(c13899a.f26487b) ? c13899a.f26493h / 2 : c13899a.f26493h;
        this.f26484d = i;
        int iM30039c = m30039c(c13899a.f26487b, c13899a.f26491f, c13899a.f26492g);
        float fMo30047b = c13899a.f26488c.mo30047b() * c13899a.f26488c.mo30046a() * 4;
        int iRound = Math.round(c13899a.f26490e * fMo30047b);
        int iRound2 = Math.round(fMo30047b * c13899a.f26489d);
        int i2 = iM30039c - i;
        int i3 = iRound2 + iRound;
        if (i3 <= i2) {
            this.f26482b = iRound2;
            this.f26481a = iRound;
        } else {
            float f = i2;
            float f2 = c13899a.f26490e;
            float f3 = c13899a.f26489d;
            float f4 = f / (f2 + f3);
            this.f26482b = Math.round(f3 * f4);
            this.f26481a = Math.round(f4 * c13899a.f26490e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m30044f(this.f26482b));
            sb.append(", pool size: ");
            sb.append(m30044f(this.f26481a));
            sb.append(", byte array size: ");
            sb.append(m30044f(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > iM30039c);
            sb.append(", max size: ");
            sb.append(m30044f(iM30039c));
            sb.append(", memoryClass: ");
            sb.append(c13899a.f26487b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m30040e(c13899a.f26487b));
        }
    }

    /* renamed from: c */
    public static int m30039c(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (m30040e(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: e */
    public static boolean m30040e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: a */
    public int m30041a() {
        return this.f26484d;
    }

    /* renamed from: b */
    public int m30042b() {
        return this.f26481a;
    }

    /* renamed from: d */
    public int m30043d() {
        return this.f26482b;
    }

    /* renamed from: f */
    public final String m30044f(int i) {
        return Formatter.formatFileSize(this.f26483c, i);
    }
}
