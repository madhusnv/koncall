package y7;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.s */
/* loaded from: classes.dex */
public class C8584s {

    /* renamed from: a */
    public int f41768a = -1;

    /* renamed from: b */
    public RecyclerView f41769b;

    /* renamed from: c */
    public f0 f41770c;

    /* renamed from: d */
    public boolean f41771d;

    /* renamed from: e */
    public boolean f41772e;

    /* renamed from: f */
    public View f41773f;

    /* renamed from: g */
    public final o0 f41774g;

    /* renamed from: h */
    public final LinearInterpolator f41775h;

    /* renamed from: i */
    public final DecelerateInterpolator f41776i;

    /* renamed from: j */
    public PointF f41777j;

    /* renamed from: k */
    public final DisplayMetrics f41778k;

    /* renamed from: l */
    public boolean f41779l;

    /* renamed from: m */
    public float f41780m;

    /* renamed from: n */
    public int f41781n;

    /* renamed from: o */
    public int f41782o;

    public C8584s(Context context) {
        o0 o0Var = new o0();
        o0Var.f41732d = -1;
        o0Var.f41734f = false;
        o0Var.f41729a = 0;
        o0Var.f41730b = 0;
        o0Var.f41731c = Integer.MIN_VALUE;
        o0Var.f41733e = null;
        this.f41774g = o0Var;
        this.f41775h = new LinearInterpolator();
        this.f41776i = new DecelerateInterpolator();
        this.f41779l = false;
        this.f41781n = 0;
        this.f41782o = 0;
        this.f41778k = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public static int m15895a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    /* renamed from: b */
    public float mo4110b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: c */
    public int mo15896c(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.f41779l) {
            this.f41780m = mo4110b(this.f41778k);
            this.f41779l = true;
        }
        return (int) Math.ceil(fAbs * this.f41780m);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0101  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15897d(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.C8584s.m15897d(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo15898e(android.view.View r11, y7.o0 r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.C8584s.mo15898e(android.view.View, y7.o0):void");
    }

    /* renamed from: f */
    public final void m15899f() {
        if (this.f41772e) {
            this.f41772e = false;
            this.f41782o = 0;
            this.f41781n = 0;
            this.f41777j = null;
            this.f41769b.f43699i1.f41751a = -1;
            this.f41773f = null;
            this.f41768a = -1;
            this.f41771d = false;
            f0 f0Var = this.f41770c;
            if (f0Var.f41623e == this) {
                f0Var.f41623e = null;
            }
            this.f41770c = null;
            this.f41769b = null;
        }
    }
}
