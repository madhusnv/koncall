package c6;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: b */
    public static final y1 f5540b;

    /* renamed from: a */
    public final v1 f5541a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f5540b = u1.f5524s;
        } else if (i10 >= 30) {
            f5540b = t1.f5519r;
        } else {
            f5540b = v1.f5532b;
        }
    }

    public y1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f5541a = new u1(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f5541a = new t1(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f5541a = new s1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f5541a = new r1(this, windowInsets);
        } else {
            this.f5541a = new q1(this, windowInsets);
        }
    }

    /* renamed from: b */
    public static C7340b m2536b(C7340b c7340b, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, c7340b.f34957a - i10);
        int iMax2 = Math.max(0, c7340b.f34958b - i11);
        int iMax3 = Math.max(0, c7340b.f34959c - i12);
        int iMax4 = Math.max(0, c7340b.f34960d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? c7340b : C7340b.m13736b(iMax, iMax2, iMax3, iMax4);
    }

    /* renamed from: d */
    public static y1 m2537d(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        y1 y1Var = new y1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = v0.f5527a;
            y1 y1VarM2463a = o0.m2463a(view);
            v1 v1Var = y1Var.f5541a;
            v1Var.mo2483t(y1VarM2463a);
            v1Var.mo2473d(view.getRootView());
            v1Var.mo2484v(view.getWindowSystemUiVisibility());
        }
        return y1Var;
    }

    /* renamed from: a */
    public final int m2538a() {
        return this.f5541a.mo2477l().f34958b;
    }

    /* renamed from: c */
    public final WindowInsets m2539c() {
        v1 v1Var = this.f5541a;
        if (v1Var instanceof p1) {
            return ((p1) v1Var).f5501c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y1) {
            return Objects.equals(this.f5541a, ((y1) obj).f5541a);
        }
        return false;
    }

    public final int hashCode() {
        v1 v1Var = this.f5541a;
        if (v1Var == null) {
            return 0;
        }
        return v1Var.hashCode();
    }

    public y1(y1 y1Var) {
        if (y1Var != null) {
            v1 v1Var = y1Var.f5541a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (v1Var instanceof u1)) {
                this.f5541a = new u1(this, (u1) v1Var);
            } else if (i10 >= 30 && (v1Var instanceof t1)) {
                this.f5541a = new t1(this, (t1) v1Var);
            } else if (i10 >= 29 && (v1Var instanceof s1)) {
                this.f5541a = new s1(this, (s1) v1Var);
            } else if (i10 >= 28 && (v1Var instanceof r1)) {
                this.f5541a = new r1(this, (r1) v1Var);
            } else if (v1Var instanceof q1) {
                this.f5541a = new q1(this, (q1) v1Var);
            } else if (v1Var instanceof p1) {
                this.f5541a = new p1(this, (p1) v1Var);
            } else {
                this.f5541a = new v1(this);
            }
            v1Var.mo2474e(this);
            return;
        }
        this.f5541a = new v1(this);
    }
}
