package c6;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 extends o1 {

    /* renamed from: e */
    public static Field f5471e = null;

    /* renamed from: f */
    public static boolean f5472f = false;

    /* renamed from: g */
    public static Constructor f5473g = null;

    /* renamed from: h */
    public static boolean f5474h = false;

    /* renamed from: c */
    public WindowInsets f5475c;

    /* renamed from: d */
    public C7340b f5476d;

    public j1() {
        this.f5475c = m2429i();
    }

    /* renamed from: i */
    private static WindowInsets m2429i() {
        if (!f5472f) {
            try {
                f5471e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f5472f = true;
        }
        Field field = f5471e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f5474h) {
            try {
                f5473g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f5474h = true;
        }
        Constructor constructor = f5473g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // c6.o1
    /* renamed from: b */
    public y1 mo2430b() {
        m2464a();
        y1 y1VarM2537d = y1.m2537d(null, this.f5475c);
        C7340b[] c7340bArr = this.f5493b;
        v1 v1Var = y1VarM2537d.f5541a;
        v1Var.mo2481r(c7340bArr);
        v1Var.mo2497u(this.f5476d);
        return y1VarM2537d;
    }

    @Override // c6.o1
    /* renamed from: e */
    public void mo2431e(C7340b c7340b) {
        this.f5476d = c7340b;
    }

    @Override // c6.o1
    /* renamed from: g */
    public void mo2432g(C7340b c7340b) {
        WindowInsets windowInsets = this.f5475c;
        if (windowInsets != null) {
            this.f5475c = windowInsets.replaceSystemWindowInsets(c7340b.f34957a, c7340b.f34958b, c7340b.f34959c, c7340b.f34960d);
        }
    }

    public j1(y1 y1Var) {
        super(y1Var);
        this.f5475c = y1Var.m2539c();
    }
}
