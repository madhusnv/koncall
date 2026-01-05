package p001o;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes2.dex */
public abstract class a0d {

    /* renamed from: o.a0d$a */
    public static class C12073a {
        /* renamed from: a */
        public static Interpolator m16310a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        /* renamed from: b */
        public static Interpolator m16311b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        /* renamed from: c */
        public static Interpolator m16312c(Path path) {
            return new PathInterpolator(path);
        }
    }

    /* renamed from: a */
    public static Interpolator m16309a(float f, float f2, float f3, float f4) {
        return C12073a.m16311b(f, f2, f3, f4);
    }
}
