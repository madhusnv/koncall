package p001o;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* loaded from: classes2.dex */
public abstract class c36 {

    /* renamed from: o.c36$a */
    public static class C12543a {
        /* renamed from: a */
        public static void m20160a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: o.c36$b */
    public static class C12544b {
        /* renamed from: a */
        public static EdgeEffect m20161a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m20162b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m20163c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m20156a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? C12544b.m20161a(context, attributeSet) : new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m20157b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C12544b.m20162b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m20158c(EdgeEffect edgeEffect, float f, float f2) {
        C12543a.m20160a(edgeEffect, f, f2);
    }

    /* renamed from: d */
    public static float m20159d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C12544b.m20163c(edgeEffect, f, f2);
        }
        m20158c(edgeEffect, f, f2);
        return f;
    }
}
