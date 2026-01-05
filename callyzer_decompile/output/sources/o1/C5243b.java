package o1;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ex.InterfaceC2139c;
import i1.C3135n;
import java.util.WeakHashMap;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.b */
/* loaded from: classes.dex */
public final class C5243b implements InterfaceC5247f {

    /* renamed from: a */
    public final /* synthetic */ int f25699a;

    public /* synthetic */ C5243b(int i10) {
        this.f25699a = i10;
    }

    /* renamed from: b */
    public static final C5242a m10313b(int i10, String str) {
        WeakHashMap weakHashMap = w1.f25863v;
        return new C5242a(i10, str);
    }

    /* renamed from: d */
    public static final t1 m10314d(int i10, String str) {
        WeakHashMap weakHashMap = w1.f25863v;
        return new t1(new z0(0, 0, 0, 0), str);
    }

    /* renamed from: e */
    public static w1 m10315e(InterfaceC3962k interfaceC3962k) {
        w1 w1Var;
        C3966o c3966o = (C3966o) interfaceC3962k;
        View view = (View) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2138f);
        WeakHashMap weakHashMap = w1.f25863v;
        synchronized (weakHashMap) {
            try {
                Object w1Var2 = weakHashMap.get(view);
                if (w1Var2 == null) {
                    w1Var2 = new w1(view);
                    weakHashMap.put(view, w1Var2);
                }
                w1Var = (w1) w1Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean zM8616i = c3966o.m8616i(w1Var) | c3966o.m8616i(view);
        Object objM8596M = c3966o.m8596M();
        if (zM8616i || objM8596M == C3961j.f20408a) {
            objM8596M = new C3135n(19, w1Var, view);
            c3966o.j0(objM8596M);
        }
        C3953b.m8500c(w1Var, (InterfaceC2139c) objM8596M, c3966o);
        return w1Var;
    }

    @Override // o1.InterfaceC5247f
    /* renamed from: c */
    public void mo10316c(InterfaceC6747c interfaceC6747c, int i10, int[] iArr, EnumC6757m enumC6757m, int[] iArr2) {
        switch (this.f25699a) {
            case 0:
                AbstractC5251j.m10346b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC5251j.m10347c(i10, iArr, iArr2, false);
                break;
            case 2:
                if (enumC6757m != EnumC6757m.Ltr) {
                    AbstractC5251j.m10346b(iArr, iArr2, true);
                    break;
                } else {
                    AbstractC5251j.m10347c(i10, iArr, iArr2, false);
                    break;
                }
            default:
                if (enumC6757m != EnumC6757m.Ltr) {
                    AbstractC5251j.m10347c(i10, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC5251j.m10346b(iArr, iArr2, false);
                    break;
                }
        }
    }

    public String toString() {
        switch (this.f25699a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
