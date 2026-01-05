package c6;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import og.fa;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class p1 extends v1 {

    /* renamed from: i */
    public static boolean f5496i = false;

    /* renamed from: j */
    public static Method f5497j;

    /* renamed from: k */
    public static Class f5498k;

    /* renamed from: l */
    public static Field f5499l;

    /* renamed from: m */
    public static Field f5500m;

    /* renamed from: c */
    public final WindowInsets f5501c;

    /* renamed from: d */
    public C7340b[] f5502d;

    /* renamed from: e */
    public C7340b f5503e;

    /* renamed from: f */
    public y1 f5504f;

    /* renamed from: g */
    public C7340b f5505g;

    /* renamed from: h */
    public int f5506h;

    public p1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var);
        this.f5503e = null;
        this.f5501c = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: B */
    private static void m2467B() throws ClassNotFoundException, SecurityException {
        try {
            f5497j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f5498k = cls;
            f5499l = cls.getDeclaredField("mVisibleInsets");
            f5500m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f5499l.setAccessible(true);
            f5500m.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            e2.getMessage();
        }
        f5496i = true;
    }

    /* renamed from: C */
    public static boolean m2468C(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: w */
    private C7340b m2469w(int i10, boolean z6) {
        C7340b c7340bM13735a = C7340b.f34956e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                c7340bM13735a = C7340b.m13735a(c7340bM13735a, m2485x(i11, z6));
            }
        }
        return c7340bM13735a;
    }

    /* renamed from: y */
    private C7340b m2470y() {
        y1 y1Var = this.f5504f;
        return y1Var != null ? y1Var.f5541a.mo2495j() : C7340b.f34956e;
    }

    /* renamed from: z */
    private C7340b m2471z(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f5496i) {
            m2467B();
        }
        Method method = f5497j;
        if (method != null && f5498k != null && f5499l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) f5499l.get(f5500m.get(objInvoke));
                    if (rect != null) {
                        return C7340b.m13736b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e2) {
                e2.getMessage();
            }
        }
        return null;
    }

    /* renamed from: A */
    public boolean m2472A(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !m2485x(i10, false).equals(C7340b.f34956e);
    }

    @Override // c6.v1
    /* renamed from: d */
    public void mo2473d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C7340b c7340bM2471z = m2471z(view);
        if (c7340bM2471z == null) {
            c7340bM2471z = C7340b.f34956e;
        }
        mo2482s(c7340bM2471z);
    }

    @Override // c6.v1
    /* renamed from: e */
    public void mo2474e(y1 y1Var) {
        y1Var.f5541a.mo2483t(this.f5504f);
        C7340b c7340b = this.f5505g;
        v1 v1Var = y1Var.f5541a;
        v1Var.mo2482s(c7340b);
        v1Var.mo2484v(this.f5506h);
    }

    @Override // c6.v1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Objects.equals(this.f5505g, p1Var.f5505g) && m2468C(this.f5506h, p1Var.f5506h);
    }

    @Override // c6.v1
    /* renamed from: g */
    public C7340b mo2475g(int i10) {
        return m2469w(i10, false);
    }

    @Override // c6.v1
    /* renamed from: h */
    public C7340b mo2476h(int i10) {
        return m2469w(i10, true);
    }

    @Override // c6.v1
    /* renamed from: l */
    public final C7340b mo2477l() {
        if (this.f5503e == null) {
            WindowInsets windowInsets = this.f5501c;
            this.f5503e = C7340b.m13736b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f5503e;
    }

    @Override // c6.v1
    /* renamed from: n */
    public y1 mo2478n(int i10, int i11, int i12, int i13) {
        y1 y1VarM2537d = y1.m2537d(null, this.f5501c);
        int i14 = Build.VERSION.SDK_INT;
        o1 n1Var = i14 >= 34 ? new n1(y1VarM2537d) : i14 >= 30 ? new m1(y1VarM2537d) : i14 >= 29 ? new l1(y1VarM2537d) : new j1(y1VarM2537d);
        n1Var.mo2432g(y1.m2536b(mo2477l(), i10, i11, i12, i13));
        n1Var.mo2431e(y1.m2536b(mo2495j(), i10, i11, i12, i13));
        return n1Var.mo2430b();
    }

    @Override // c6.v1
    /* renamed from: p */
    public boolean mo2479p() {
        return this.f5501c.isRound();
    }

    @Override // c6.v1
    @SuppressLint({"WrongConstant"})
    /* renamed from: q */
    public boolean mo2480q(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !m2472A(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // c6.v1
    /* renamed from: r */
    public void mo2481r(C7340b[] c7340bArr) {
        this.f5502d = c7340bArr;
    }

    @Override // c6.v1
    /* renamed from: s */
    public void mo2482s(C7340b c7340b) {
        this.f5505g = c7340b;
    }

    @Override // c6.v1
    /* renamed from: t */
    public void mo2483t(y1 y1Var) {
        this.f5504f = y1Var;
    }

    @Override // c6.v1
    /* renamed from: v */
    public void mo2484v(int i10) {
        this.f5506h = i10;
    }

    /* renamed from: x */
    public C7340b m2485x(int i10, boolean z6) {
        C7340b c7340bMo2495j;
        int i11;
        C7340b c7340b = C7340b.f34956e;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 8) {
                    C7340b[] c7340bArr = this.f5502d;
                    c7340bMo2495j = c7340bArr != null ? c7340bArr[fa.m10642a(8)] : null;
                    if (c7340bMo2495j != null) {
                        return c7340bMo2495j;
                    }
                    C7340b c7340bMo2477l = mo2477l();
                    C7340b c7340bM2470y = m2470y();
                    int i12 = c7340bMo2477l.f34960d;
                    if (i12 > c7340bM2470y.f34960d) {
                        return C7340b.m13736b(0, 0, 0, i12);
                    }
                    C7340b c7340b2 = this.f5505g;
                    if (c7340b2 != null && !c7340b2.equals(c7340b) && (i11 = this.f5505g.f34960d) > c7340bM2470y.f34960d) {
                        return C7340b.m13736b(0, 0, 0, i11);
                    }
                } else {
                    if (i10 == 16) {
                        return mo2513k();
                    }
                    if (i10 == 32) {
                        return mo2512i();
                    }
                    if (i10 == 64) {
                        return mo2514m();
                    }
                    if (i10 == 128) {
                        y1 y1Var = this.f5504f;
                        C0881k c0881kMo2501f = y1Var != null ? y1Var.f5541a.mo2501f() : mo2501f();
                        if (c0881kMo2501f != null) {
                            int i13 = Build.VERSION.SDK_INT;
                            return C7340b.m13736b(i13 >= 28 ? AbstractC0879i.m2398j(c0881kMo2501f.f5477a) : 0, i13 >= 28 ? AbstractC0879i.m2400l(c0881kMo2501f.f5477a) : 0, i13 >= 28 ? AbstractC0879i.m2399k(c0881kMo2501f.f5477a) : 0, i13 >= 28 ? AbstractC0879i.m2397i(c0881kMo2501f.f5477a) : 0);
                        }
                    }
                }
            } else {
                if (z6) {
                    C7340b c7340bM2470y2 = m2470y();
                    C7340b c7340bMo2495j2 = mo2495j();
                    return C7340b.m13736b(Math.max(c7340bM2470y2.f34957a, c7340bMo2495j2.f34957a), 0, Math.max(c7340bM2470y2.f34959c, c7340bMo2495j2.f34959c), Math.max(c7340bM2470y2.f34960d, c7340bMo2495j2.f34960d));
                }
                if ((this.f5506h & 2) == 0) {
                    C7340b c7340bMo2477l2 = mo2477l();
                    y1 y1Var2 = this.f5504f;
                    c7340bMo2495j = y1Var2 != null ? y1Var2.f5541a.mo2495j() : null;
                    int iMin = c7340bMo2477l2.f34960d;
                    if (c7340bMo2495j != null) {
                        iMin = Math.min(iMin, c7340bMo2495j.f34960d);
                    }
                    return C7340b.m13736b(c7340bMo2477l2.f34957a, 0, c7340bMo2477l2.f34959c, iMin);
                }
            }
        } else {
            if (z6) {
                return C7340b.m13736b(0, Math.max(m2470y().f34958b, mo2477l().f34958b), 0, 0);
            }
            if ((this.f5506h & 4) == 0) {
                return C7340b.m13736b(0, mo2477l().f34958b, 0, 0);
            }
        }
        return c7340b;
    }

    public p1(y1 y1Var, p1 p1Var) {
        this(y1Var, new WindowInsets(p1Var.f5501c));
    }
}
