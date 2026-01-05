package p013o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import c6.n0;
import c6.v0;
import iz.C3378k;
import java.lang.reflect.Field;
import l4.C4367l;
import p009j.AbstractC3500a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.n */
/* loaded from: classes.dex */
public final class C5228n {

    /* renamed from: a */
    public final View f25581a;

    /* renamed from: b */
    public final C5232r f25582b;

    /* renamed from: c */
    public int f25583c = -1;

    /* renamed from: d */
    public C3378k f25584d;

    /* renamed from: e */
    public C3378k f25585e;

    /* renamed from: f */
    public C3378k f25586f;

    public C5228n(View view) {
        C5232r c5232r;
        this.f25581a = view;
        PorterDuff.Mode mode = C5232r.f25627b;
        synchronized (C5232r.class) {
            try {
                if (C5232r.f25628c == null) {
                    C5232r.m10283c();
                }
                c5232r = C5232r.f25628c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f25582b = c5232r;
    }

    /* renamed from: a */
    public final void m10255a() {
        View view = this.f25581a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f25584d != null) {
                if (this.f25586f == null) {
                    this.f25586f = new C3378k();
                }
                C3378k c3378k = this.f25586f;
                c3378k.f17915c = null;
                c3378k.f17914b = false;
                c3378k.f17916d = null;
                c3378k.f17913a = false;
                Field field = v0.f5527a;
                ColorStateList colorStateListM2451c = n0.m2451c(view);
                if (colorStateListM2451c != null) {
                    c3378k.f17914b = true;
                    c3378k.f17915c = colorStateListM2451c;
                }
                PorterDuff.Mode modeM2452d = n0.m2452d(view);
                if (modeM2452d != null) {
                    c3378k.f17913a = true;
                    c3378k.f17916d = modeM2452d;
                }
                if (c3378k.f17914b || c3378k.f17913a) {
                    C5232r.m10284d(background, c3378k, view.getDrawableState());
                    return;
                }
            }
            C3378k c3378k2 = this.f25585e;
            if (c3378k2 != null) {
                C5232r.m10284d(background, c3378k2, view.getDrawableState());
                return;
            }
            C3378k c3378k3 = this.f25584d;
            if (c3378k3 != null) {
                C5232r.m10284d(background, c3378k3, view.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final ColorStateList m10256b() {
        C3378k c3378k = this.f25585e;
        if (c3378k != null) {
            return (ColorStateList) c3378k.f17915c;
        }
        return null;
    }

    /* renamed from: c */
    public final PorterDuff.Mode m10257c() {
        C3378k c3378k = this.f25585e;
        if (c3378k != null) {
            return (PorterDuff.Mode) c3378k.f17916d;
        }
        return null;
    }

    /* renamed from: d */
    public final void m10258d(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListM10280f;
        View view = this.f25581a;
        Context context = view.getContext();
        int[] iArr = AbstractC3500a.f18364u;
        C4367l c4367lM9117H = C4367l.m9117H(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) c4367lM9117H.f21922c;
        View view2 = this.f25581a;
        v0.m2527i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c4367lM9117H.f21922c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f25583c = typedArray.getResourceId(0, -1);
                C5232r c5232r = this.f25582b;
                Context context2 = view.getContext();
                int i11 = this.f25583c;
                synchronized (c5232r) {
                    colorStateListM10280f = c5232r.f25629a.m10280f(context2, i11);
                }
                if (colorStateListM10280f != null) {
                    m10261g(colorStateListM10280f);
                }
            }
            if (typedArray.hasValue(1)) {
                n0.m2457i(view, c4367lM9117H.m9140t(1));
            }
            if (typedArray.hasValue(2)) {
                n0.m2458j(view, r0.m10287b(typedArray.getInt(2, -1), null));
            }
            c4367lM9117H.m9124I();
        } catch (Throwable th2) {
            c4367lM9117H.m9124I();
            throw th2;
        }
    }

    /* renamed from: e */
    public final void m10259e() {
        this.f25583c = -1;
        m10261g(null);
        m10255a();
    }

    /* renamed from: f */
    public final void m10260f(int i10) {
        ColorStateList colorStateListM10280f;
        this.f25583c = i10;
        C5232r c5232r = this.f25582b;
        if (c5232r != null) {
            Context context = this.f25581a.getContext();
            synchronized (c5232r) {
                colorStateListM10280f = c5232r.f25629a.m10280f(context, i10);
            }
        } else {
            colorStateListM10280f = null;
        }
        m10261g(colorStateListM10280f);
        m10255a();
    }

    /* renamed from: g */
    public final void m10261g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f25584d == null) {
                this.f25584d = new C3378k();
            }
            C3378k c3378k = this.f25584d;
            c3378k.f17915c = colorStateList;
            c3378k.f17914b = true;
        } else {
            this.f25584d = null;
        }
        m10255a();
    }

    /* renamed from: h */
    public final void m10262h(ColorStateList colorStateList) {
        if (this.f25585e == null) {
            this.f25585e = new C3378k();
        }
        C3378k c3378k = this.f25585e;
        c3378k.f17915c = colorStateList;
        c3378k.f17914b = true;
        m10255a();
    }

    /* renamed from: i */
    public final void m10263i(PorterDuff.Mode mode) {
        if (this.f25585e == null) {
            this.f25585e = new C3378k();
        }
        C3378k c3378k = this.f25585e;
        c3378k.f17916d = mode;
        c3378k.f17913a = true;
        m10255a();
    }
}
