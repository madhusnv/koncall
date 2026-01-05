package p001o;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* loaded from: classes2.dex */
public final class nu5 {

    /* renamed from: a */
    public final DisplayCutout f37313a;

    /* renamed from: o.nu5$a */
    public static class C15671a {
        /* renamed from: a */
        public static DisplayCutout m41156a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        public static List<Rect> m41157b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        public static int m41158c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        public static int m41159d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        public static int m41160e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        public static int m41161f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public nu5(DisplayCutout displayCutout) {
        this.f37313a = displayCutout;
    }

    /* renamed from: e */
    public static nu5 m41151e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new nu5(displayCutout);
    }

    /* renamed from: a */
    public int m41152a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C15671a.m41158c(this.f37313a);
        }
        return 0;
    }

    /* renamed from: b */
    public int m41153b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C15671a.m41159d(this.f37313a);
        }
        return 0;
    }

    /* renamed from: c */
    public int m41154c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C15671a.m41160e(this.f37313a);
        }
        return 0;
    }

    /* renamed from: d */
    public int m41155d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C15671a.m41161f(this.f37313a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nu5.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(this.f37313a, ((nu5) obj).f37313a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f37313a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f37313a + "}";
    }
}
