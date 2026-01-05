package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import p001o.ke2;

/* renamed from: com.google.android.material.carousel.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10987a {

    /* renamed from: a */
    public float f12284a;

    /* renamed from: b */
    public float f12285b;

    /* renamed from: com.google.android.material.carousel.a$a */
    public enum a {
        CONTAINED,
        UNCONTAINED
    }

    /* renamed from: a */
    public static int[] m14285a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = iArr[i] * 2;
        }
        return iArr2;
    }

    /* renamed from: b */
    public static float m14286b(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }

    /* renamed from: c */
    public float m14287c() {
        return this.f12285b;
    }

    /* renamed from: d */
    public float m14288d() {
        return this.f12284a;
    }

    /* renamed from: e */
    public a m14289e() {
        return a.CONTAINED;
    }

    /* renamed from: f */
    public void m14290f(Context context) {
        float fM14300h = this.f12284a;
        if (fM14300h <= 0.0f) {
            fM14300h = AbstractC10988b.m14300h(context);
        }
        this.f12284a = fM14300h;
        float fM14299g = this.f12285b;
        if (fM14299g <= 0.0f) {
            fM14299g = AbstractC10988b.m14299g(context);
        }
        this.f12285b = fM14299g;
    }

    /* renamed from: g */
    public abstract C10989c mo14291g(ke2 ke2Var, View view);

    /* renamed from: h */
    public abstract boolean mo14292h(ke2 ke2Var, int i);
}
