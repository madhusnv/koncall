package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import p001o.cbe;

/* renamed from: com.facebook.shimmer.a */
/* loaded from: classes5.dex */
public class C10884a {

    /* renamed from: a */
    public final float[] f11801a = new float[4];

    /* renamed from: b */
    public final int[] f11802b = new int[4];

    /* renamed from: c */
    public final RectF f11803c = new RectF();

    /* renamed from: d */
    public int f11804d = 0;

    /* renamed from: e */
    public int f11805e = -1;

    /* renamed from: f */
    public int f11806f = 1291845631;

    /* renamed from: g */
    public int f11807g = 0;

    /* renamed from: h */
    public int f11808h = 0;

    /* renamed from: i */
    public int f11809i = 0;

    /* renamed from: j */
    public float f11810j = 1.0f;

    /* renamed from: k */
    public float f11811k = 1.0f;

    /* renamed from: l */
    public float f11812l = 0.0f;

    /* renamed from: m */
    public float f11813m = 0.5f;

    /* renamed from: n */
    public float f11814n = 20.0f;

    /* renamed from: o */
    public boolean f11815o = true;

    /* renamed from: p */
    public boolean f11816p = true;

    /* renamed from: q */
    public boolean f11817q = true;

    /* renamed from: r */
    public int f11818r = -1;

    /* renamed from: s */
    public int f11819s = 1;

    /* renamed from: t */
    public long f11820t = 1000;

    /* renamed from: u */
    public long f11821u;

    /* renamed from: com.facebook.shimmer.a$a */
    public static class a extends b {
        public a() {
            this.f11822a.f11817q = true;
        }

        @Override // com.facebook.shimmer.C10884a.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public a mo13589d() {
            return this;
        }
    }

    /* renamed from: com.facebook.shimmer.a$b */
    public static abstract class b {

        /* renamed from: a */
        public final C10884a f11822a = new C10884a();

        /* renamed from: b */
        public static float m13591b(float f, float f2, float f3) {
            return Math.min(f2, Math.max(f, f3));
        }

        /* renamed from: a */
        public C10884a m13592a() {
            this.f11822a.m13586b();
            this.f11822a.m13587c();
            return this.f11822a;
        }

        /* renamed from: c */
        public b mo13593c(TypedArray typedArray) {
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_clip_to_children)) {
                m13596g(typedArray.getBoolean(cbe.ShimmerFrameLayout_shimmer_clip_to_children, this.f11822a.f11815o));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_auto_start)) {
                m13594e(typedArray.getBoolean(cbe.ShimmerFrameLayout_shimmer_auto_start, this.f11822a.f11816p));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_base_alpha)) {
                m13595f(typedArray.getFloat(cbe.ShimmerFrameLayout_shimmer_base_alpha, 0.3f));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_highlight_alpha)) {
                m13603n(typedArray.getFloat(cbe.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_duration)) {
                m13599j(typedArray.getInt(cbe.ShimmerFrameLayout_shimmer_duration, (int) this.f11822a.f11820t));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_repeat_count)) {
                m13605p(typedArray.getInt(cbe.ShimmerFrameLayout_shimmer_repeat_count, this.f11822a.f11818r));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_repeat_delay)) {
                m13606q(typedArray.getInt(cbe.ShimmerFrameLayout_shimmer_repeat_delay, (int) this.f11822a.f11821u));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_repeat_mode)) {
                m13607r(typedArray.getInt(cbe.ShimmerFrameLayout_shimmer_repeat_mode, this.f11822a.f11819s));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_direction)) {
                int i = typedArray.getInt(cbe.ShimmerFrameLayout_shimmer_direction, this.f11822a.f11804d);
                if (i == 1) {
                    m13597h(1);
                } else if (i == 2) {
                    m13597h(2);
                } else if (i != 3) {
                    m13597h(0);
                } else {
                    m13597h(3);
                }
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_shape)) {
                if (typedArray.getInt(cbe.ShimmerFrameLayout_shimmer_shape, this.f11822a.f11807g) != 1) {
                    m13608s(0);
                } else {
                    m13608s(1);
                }
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_dropoff)) {
                m13598i(typedArray.getFloat(cbe.ShimmerFrameLayout_shimmer_dropoff, this.f11822a.f11813m));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_fixed_width)) {
                m13601l(typedArray.getDimensionPixelSize(cbe.ShimmerFrameLayout_shimmer_fixed_width, this.f11822a.f11808h));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_fixed_height)) {
                m13600k(typedArray.getDimensionPixelSize(cbe.ShimmerFrameLayout_shimmer_fixed_height, this.f11822a.f11809i));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_intensity)) {
                m13604o(typedArray.getFloat(cbe.ShimmerFrameLayout_shimmer_intensity, this.f11822a.f11812l));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_width_ratio)) {
                m13610u(typedArray.getFloat(cbe.ShimmerFrameLayout_shimmer_width_ratio, this.f11822a.f11810j));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_height_ratio)) {
                m13602m(typedArray.getFloat(cbe.ShimmerFrameLayout_shimmer_height_ratio, this.f11822a.f11811k));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_tilt)) {
                m13609t(typedArray.getFloat(cbe.ShimmerFrameLayout_shimmer_tilt, this.f11822a.f11814n));
            }
            return mo13589d();
        }

        /* renamed from: d */
        public abstract b mo13589d();

        /* renamed from: e */
        public b m13594e(boolean z) {
            this.f11822a.f11816p = z;
            return mo13589d();
        }

        /* renamed from: f */
        public b m13595f(float f) {
            int iM13591b = (int) (m13591b(0.0f, 1.0f, f) * 255.0f);
            C10884a c10884a = this.f11822a;
            c10884a.f11806f = (iM13591b << 24) | (c10884a.f11806f & 16777215);
            return mo13589d();
        }

        /* renamed from: g */
        public b m13596g(boolean z) {
            this.f11822a.f11815o = z;
            return mo13589d();
        }

        /* renamed from: h */
        public b m13597h(int i) {
            this.f11822a.f11804d = i;
            return mo13589d();
        }

        /* renamed from: i */
        public b m13598i(float f) {
            if (f >= 0.0f) {
                this.f11822a.f11813m = f;
                return mo13589d();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }

        /* renamed from: j */
        public b m13599j(long j) {
            if (j >= 0) {
                this.f11822a.f11820t = j;
                return mo13589d();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j);
        }

        /* renamed from: k */
        public b m13600k(int i) {
            if (i >= 0) {
                this.f11822a.f11809i = i;
                return mo13589d();
            }
            throw new IllegalArgumentException("Given invalid height: " + i);
        }

        /* renamed from: l */
        public b m13601l(int i) {
            if (i >= 0) {
                this.f11822a.f11808h = i;
                return mo13589d();
            }
            throw new IllegalArgumentException("Given invalid width: " + i);
        }

        /* renamed from: m */
        public b m13602m(float f) {
            if (f >= 0.0f) {
                this.f11822a.f11811k = f;
                return mo13589d();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }

        /* renamed from: n */
        public b m13603n(float f) {
            int iM13591b = (int) (m13591b(0.0f, 1.0f, f) * 255.0f);
            C10884a c10884a = this.f11822a;
            c10884a.f11805e = (iM13591b << 24) | (c10884a.f11805e & 16777215);
            return mo13589d();
        }

        /* renamed from: o */
        public b m13604o(float f) {
            if (f >= 0.0f) {
                this.f11822a.f11812l = f;
                return mo13589d();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        /* renamed from: p */
        public b m13605p(int i) {
            this.f11822a.f11818r = i;
            return mo13589d();
        }

        /* renamed from: q */
        public b m13606q(long j) {
            if (j >= 0) {
                this.f11822a.f11821u = j;
                return mo13589d();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j);
        }

        /* renamed from: r */
        public b m13607r(int i) {
            this.f11822a.f11819s = i;
            return mo13589d();
        }

        /* renamed from: s */
        public b m13608s(int i) {
            this.f11822a.f11807g = i;
            return mo13589d();
        }

        /* renamed from: t */
        public b m13609t(float f) {
            this.f11822a.f11814n = f;
            return mo13589d();
        }

        /* renamed from: u */
        public b m13610u(float f) {
            if (f >= 0.0f) {
                this.f11822a.f11810j = f;
                return mo13589d();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
    }

    /* renamed from: com.facebook.shimmer.a$c */
    public static class c extends b {
        public c() {
            this.f11822a.f11817q = false;
        }

        @Override // com.facebook.shimmer.C10884a.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public c mo13593c(TypedArray typedArray) {
            super.mo13593c(typedArray);
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_base_color)) {
                m13613x(typedArray.getColor(cbe.ShimmerFrameLayout_shimmer_base_color, this.f11822a.f11806f));
            }
            if (typedArray.hasValue(cbe.ShimmerFrameLayout_shimmer_highlight_color)) {
                m13614y(typedArray.getColor(cbe.ShimmerFrameLayout_shimmer_highlight_color, this.f11822a.f11805e));
            }
            return mo13589d();
        }

        @Override // com.facebook.shimmer.C10884a.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public c mo13589d() {
            return this;
        }

        /* renamed from: x */
        public c m13613x(int i) {
            C10884a c10884a = this.f11822a;
            c10884a.f11806f = (i & 16777215) | (c10884a.f11806f & (-16777216));
            return mo13589d();
        }

        /* renamed from: y */
        public c m13614y(int i) {
            this.f11822a.f11805e = i;
            return mo13589d();
        }
    }

    /* renamed from: a */
    public int m13585a(int i) {
        int i2 = this.f11809i;
        return i2 > 0 ? i2 : Math.round(this.f11811k * i);
    }

    /* renamed from: b */
    public void m13586b() {
        if (this.f11807g != 1) {
            int[] iArr = this.f11802b;
            int i = this.f11806f;
            iArr[0] = i;
            int i2 = this.f11805e;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.f11802b;
        int i3 = this.f11805e;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.f11806f;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    /* renamed from: c */
    public void m13587c() {
        if (this.f11807g != 1) {
            this.f11801a[0] = Math.max(((1.0f - this.f11812l) - this.f11813m) / 2.0f, 0.0f);
            this.f11801a[1] = Math.max(((1.0f - this.f11812l) - 0.001f) / 2.0f, 0.0f);
            this.f11801a[2] = Math.min(((this.f11812l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f11801a[3] = Math.min(((this.f11812l + 1.0f) + this.f11813m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f11801a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f11812l, 1.0f);
        this.f11801a[2] = Math.min(this.f11812l + this.f11813m, 1.0f);
        this.f11801a[3] = 1.0f;
    }

    /* renamed from: d */
    public int m13588d(int i) {
        int i2 = this.f11808h;
        return i2 > 0 ? i2 : Math.round(this.f11810j * i);
    }
}
