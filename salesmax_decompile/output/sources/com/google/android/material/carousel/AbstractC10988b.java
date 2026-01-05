package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.C10989c;
import p001o.jo0;
import p001o.x6e;

/* renamed from: com.google.android.material.carousel.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10988b {
    /* renamed from: a */
    public static float m14293a(float f, float f2, int i) {
        return f + (Math.max(0, i - 1) * f2);
    }

    /* renamed from: b */
    public static float m14294b(float f, float f2, int i) {
        return i > 0 ? f + (f2 / 2.0f) : f;
    }

    /* renamed from: c */
    public static C10989c m14295c(Context context, float f, int i, jo0 jo0Var) {
        float f2;
        float f3;
        float fMin = Math.min(m14298f(context) + f, jo0Var.f30843f);
        float f4 = fMin / 2.0f;
        float f5 = 0.0f - f4;
        float fM14294b = m14294b(0.0f, jo0Var.f30839b, jo0Var.f30840c);
        float fM14302j = m14302j(0.0f, m14293a(fM14294b, jo0Var.f30839b, (int) Math.floor(jo0Var.f30840c / 2.0f)), jo0Var.f30839b, jo0Var.f30840c);
        float fM14294b2 = m14294b(fM14302j, jo0Var.f30842e, jo0Var.f30841d);
        float fM14302j2 = m14302j(fM14302j, m14293a(fM14294b2, jo0Var.f30842e, (int) Math.floor(jo0Var.f30841d / 2.0f)), jo0Var.f30842e, jo0Var.f30841d);
        float fM14294b3 = m14294b(fM14302j2, jo0Var.f30843f, jo0Var.f30844g);
        float fM14302j3 = m14302j(fM14302j2, m14293a(fM14294b3, jo0Var.f30843f, jo0Var.f30844g), jo0Var.f30843f, jo0Var.f30844g);
        float fM14294b4 = m14294b(fM14302j3, jo0Var.f30842e, jo0Var.f30841d);
        float fM14294b5 = m14294b(m14302j(fM14302j3, m14293a(fM14294b4, jo0Var.f30842e, (int) Math.ceil(jo0Var.f30841d / 2.0f)), jo0Var.f30842e, jo0Var.f30841d), jo0Var.f30839b, jo0Var.f30840c);
        float f6 = i + f4;
        float fM14286b = AbstractC10987a.m14286b(fMin, jo0Var.f30843f, f);
        float fM14286b2 = AbstractC10987a.m14286b(jo0Var.f30839b, jo0Var.f30843f, f);
        float fM14286b3 = AbstractC10987a.m14286b(jo0Var.f30842e, jo0Var.f30843f, f);
        C10989c.b bVarM14320a = new C10989c.b(jo0Var.f30843f, i).m14320a(f5, fM14286b, fMin);
        if (jo0Var.f30840c > 0) {
            f2 = fM14286b;
            bVarM14320a.m14326g(fM14294b, fM14286b2, jo0Var.f30839b, (int) Math.floor(r7 / 2.0f));
        } else {
            f2 = fM14286b;
        }
        if (jo0Var.f30841d > 0) {
            bVarM14320a.m14326g(fM14294b2, fM14286b3, jo0Var.f30842e, (int) Math.floor(r4 / 2.0f));
        }
        bVarM14320a.m14327h(fM14294b3, 0.0f, jo0Var.f30843f, jo0Var.f30844g, true);
        if (jo0Var.f30841d > 0) {
            f3 = 2.0f;
            bVarM14320a.m14326g(fM14294b4, fM14286b3, jo0Var.f30842e, (int) Math.ceil(r4 / 2.0f));
        } else {
            f3 = 2.0f;
        }
        if (jo0Var.f30840c > 0) {
            bVarM14320a.m14326g(fM14294b5, fM14286b2, jo0Var.f30839b, (int) Math.ceil(r0 / f3));
        }
        bVarM14320a.m14320a(f6, f2, fMin);
        return bVarM14320a.m14328i();
    }

    /* renamed from: d */
    public static C10989c m14296d(Context context, float f, int i, jo0 jo0Var, int i2) {
        return i2 == 1 ? m14295c(context, f, i, jo0Var) : m14297e(context, f, i, jo0Var);
    }

    /* renamed from: e */
    public static C10989c m14297e(Context context, float f, int i, jo0 jo0Var) {
        float fMin = Math.min(m14298f(context) + f, jo0Var.f30843f);
        float f2 = fMin / 2.0f;
        float f3 = 0.0f - f2;
        float fM14294b = m14294b(0.0f, jo0Var.f30843f, jo0Var.f30844g);
        float fM14302j = m14302j(0.0f, m14293a(fM14294b, jo0Var.f30843f, jo0Var.f30844g), jo0Var.f30843f, jo0Var.f30844g);
        float fM14294b2 = m14294b(fM14302j, jo0Var.f30842e, jo0Var.f30841d);
        float fM14294b3 = m14294b(m14302j(fM14302j, fM14294b2, jo0Var.f30842e, jo0Var.f30841d), jo0Var.f30839b, jo0Var.f30840c);
        float f4 = i + f2;
        float fM14286b = AbstractC10987a.m14286b(fMin, jo0Var.f30843f, f);
        float fM14286b2 = AbstractC10987a.m14286b(jo0Var.f30839b, jo0Var.f30843f, f);
        float fM14286b3 = AbstractC10987a.m14286b(jo0Var.f30842e, jo0Var.f30843f, f);
        C10989c.b bVarM14327h = new C10989c.b(jo0Var.f30843f, i).m14320a(f3, fM14286b, fMin).m14327h(fM14294b, 0.0f, jo0Var.f30843f, jo0Var.f30844g, true);
        if (jo0Var.f30841d > 0) {
            bVarM14327h.m14321b(fM14294b2, fM14286b3, jo0Var.f30842e);
        }
        int i2 = jo0Var.f30840c;
        if (i2 > 0) {
            bVarM14327h.m14326g(fM14294b3, fM14286b2, jo0Var.f30839b, i2);
        }
        bVarM14327h.m14320a(f4, fM14286b, fMin);
        return bVarM14327h.m14328i();
    }

    /* renamed from: f */
    public static float m14298f(Context context) {
        return context.getResources().getDimension(x6e.m3_carousel_gone_size);
    }

    /* renamed from: g */
    public static float m14299g(Context context) {
        return context.getResources().getDimension(x6e.m3_carousel_small_item_size_max);
    }

    /* renamed from: h */
    public static float m14300h(Context context) {
        return context.getResources().getDimension(x6e.m3_carousel_small_item_size_min);
    }

    /* renamed from: i */
    public static int m14301i(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: j */
    public static float m14302j(float f, float f2, float f3, int i) {
        return i > 0 ? f2 + (f3 / 2.0f) : f;
    }
}
