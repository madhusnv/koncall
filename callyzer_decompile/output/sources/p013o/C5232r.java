package p013o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import iz.C3378k;
import p020v.x0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.r */
/* loaded from: classes.dex */
public final class C5232r {

    /* renamed from: b */
    public static final PorterDuff.Mode f25627b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C5232r f25628c;

    /* renamed from: a */
    public q1 f25629a;

    /* renamed from: b */
    public static synchronized PorterDuffColorFilter m10282b(int i10, PorterDuff.Mode mode) {
        return q1.m10276e(i10, mode);
    }

    /* renamed from: c */
    public static synchronized void m10283c() {
        if (f25628c == null) {
            C5232r c5232r = new C5232r();
            f25628c = c5232r;
            c5232r.f25629a = q1.m10275b();
            q1 q1Var = f25628c.f25629a;
            x0 x0Var = new x0(6);
            synchronized (q1Var) {
                q1Var.f25626e = x0Var;
            }
        }
    }

    /* renamed from: d */
    public static void m10284d(Drawable drawable, C3378k c3378k, int[] iArr) {
        PorterDuff.Mode mode = q1.f25619f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z6 = c3378k.f17914b;
            if (!z6 && !c3378k.f17913a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterM10276e = null;
            ColorStateList colorStateList = z6 ? (ColorStateList) c3378k.f17915c : null;
            PorterDuff.Mode mode2 = c3378k.f17913a ? (PorterDuff.Mode) c3378k.f17916d : q1.f25619f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterM10276e = q1.m10276e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterM10276e);
        }
    }

    /* renamed from: a */
    public final synchronized Drawable m10285a(Context context, int i10) {
        return this.f25629a.m10278c(context, i10);
    }
}
