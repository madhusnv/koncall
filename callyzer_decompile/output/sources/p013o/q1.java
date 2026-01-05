package p013o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.websoptimization.callyzerbiz.R;
import e1.C1915q;
import e1.v0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p020v.x0;
import q8.AbstractC6142a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: g */
    public static q1 f25620g;

    /* renamed from: a */
    public WeakHashMap f25622a;

    /* renamed from: b */
    public final WeakHashMap f25623b = new WeakHashMap(0);

    /* renamed from: c */
    public TypedValue f25624c;

    /* renamed from: d */
    public boolean f25625d;

    /* renamed from: e */
    public x0 f25626e;

    /* renamed from: f */
    public static final PorterDuff.Mode f25619f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h */
    public static final p1 f25621h = new p1(6);

    /* renamed from: b */
    public static synchronized q1 m10275b() {
        try {
            if (f25620g == null) {
                f25620g = new q1();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f25620g;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m10276e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        p1 p1Var = f25621h;
        p1Var.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) p1Var.m5620h(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    public final Drawable m10277a(Context context, int i10) throws Resources.NotFoundException {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f25624c == null) {
            this.f25624c = new TypedValue();
        }
        TypedValue typedValue = this.f25624c;
        context.getResources().getValue(i10, typedValue, true);
        long j6 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C1915q c1915q = (C1915q) this.f25623b.get(context);
            drawableNewDrawable = null;
            if (c1915q != null && (weakReference = (WeakReference) c1915q.m5598b(j6)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    c1915q.m5602f(j6);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM14465t = null;
        if (this.f25626e != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableM14465t = new LayerDrawable(new Drawable[]{m10278c(context, R.drawable.abc_cab_background_internal_bg), m10278c(context, 2131230752)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawableM14465t = x0.m14465t(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM14465t = x0.m14465t(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM14465t = x0.m14465t(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM14465t == null) {
            return layerDrawableM14465t;
        }
        layerDrawableM14465t.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM14465t.getConstantState();
                if (constantState2 != null) {
                    C1915q c1915q2 = (C1915q) this.f25623b.get(context);
                    if (c1915q2 == null) {
                        c1915q2 = new C1915q((Object) null);
                        this.f25623b.put(context, c1915q2);
                    }
                    c1915q2.m5601e(j6, new WeakReference(constantState2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return layerDrawableM14465t;
    }

    /* renamed from: c */
    public final synchronized Drawable m10278c(Context context, int i10) {
        return m10279d(context, i10);
    }

    /* renamed from: d */
    public final synchronized Drawable m10279d(Context context, int i10) {
        Drawable drawableM10277a;
        try {
            if (!this.f25625d) {
                this.f25625d = true;
                Drawable drawableM10278c = m10278c(context, R.drawable.abc_vector_test);
                if (drawableM10278c == null || (!(drawableM10278c instanceof AbstractC6142a) && !"android.graphics.drawable.VectorDrawable".equals(drawableM10278c.getClass().getName()))) {
                    this.f25625d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM10277a = m10277a(context, i10);
            if (drawableM10277a == null) {
                drawableM10277a = context.getDrawable(i10);
            }
            if (drawableM10277a != null) {
                drawableM10277a = m10281g(context, i10, drawableM10277a);
            }
            if (drawableM10277a != null) {
                r0.m10286a(drawableM10277a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableM10277a;
    }

    /* renamed from: f */
    public final synchronized ColorStateList m10280f(Context context, int i10) {
        ColorStateList colorStateList;
        v0 v0Var;
        WeakHashMap weakHashMap = this.f25622a;
        ColorStateList colorStateListM14491v = null;
        colorStateList = (weakHashMap == null || (v0Var = (v0) weakHashMap.get(context)) == null) ? null : (ColorStateList) v0Var.m5646c(i10);
        if (colorStateList == null) {
            x0 x0Var = this.f25626e;
            if (x0Var != null) {
                colorStateListM14491v = x0Var.m14491v(context, i10);
            }
            if (colorStateListM14491v != null) {
                if (this.f25622a == null) {
                    this.f25622a = new WeakHashMap();
                }
                v0 v0Var2 = (v0) this.f25622a.get(context);
                if (v0Var2 == null) {
                    v0Var2 = new v0(0);
                    this.f25622a.put(context, v0Var2);
                }
                v0Var2.m5644a(i10, colorStateListM14491v);
            }
            colorStateList = colorStateListM14491v;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m10281g(android.content.Context r9, int r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p013o.q1.m10281g(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
