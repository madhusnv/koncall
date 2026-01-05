package c6;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.datastore.preferences.protobuf.AbstractC0315j;
import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import java.lang.reflect.Field;
import java.util.Objects;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final AbstractC0315j f5433a;

    /* renamed from: b */
    public y1 f5434b;

    public c1(View view, AbstractC0315j abstractC0315j) {
        y1 y1VarMo2430b;
        this.f5433a = abstractC0315j;
        Field field = v0.f5527a;
        y1 y1VarM2463a = o0.m2463a(view);
        if (y1VarM2463a != null) {
            int i10 = Build.VERSION.SDK_INT;
            y1VarMo2430b = (i10 >= 34 ? new n1(y1VarM2463a) : i10 >= 30 ? new m1(y1VarM2463a) : i10 >= 29 ? new l1(y1VarM2463a) : new j1(y1VarM2463a)).mo2430b();
        } else {
            y1VarMo2430b = null;
        }
        this.f5434b = y1VarMo2430b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z6;
        if (!view.isLaidOut()) {
            this.f5434b = y1.m2537d(view, windowInsets);
            return d1.m2352h(view, windowInsets);
        }
        y1 y1VarM2537d = y1.m2537d(view, windowInsets);
        v1 v1Var = y1VarM2537d.f5541a;
        if (this.f5434b == null) {
            Field field = v0.f5527a;
            this.f5434b = o0.m2463a(view);
        }
        if (this.f5434b == null) {
            this.f5434b = y1VarM2537d;
            return d1.m2352h(view, windowInsets);
        }
        AbstractC0315j abstractC0315jM2353i = d1.m2353i(view);
        if (abstractC0315jM2353i != null && Objects.equals((y1) abstractC0315jM2353i.f2355b, y1VarM2537d)) {
            return d1.m2352h(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        y1 y1Var = this.f5434b;
        int i10 = 1;
        while (i10 <= 512) {
            C7340b c7340bMo2475g = v1Var.mo2475g(i10);
            C7340b c7340bMo2475g2 = y1Var.f5541a.mo2475g(i10);
            int i11 = c7340bMo2475g.f34957a;
            int i12 = c7340bMo2475g.f34960d;
            int i13 = c7340bMo2475g.f34959c;
            int i14 = c7340bMo2475g.f34958b;
            int i15 = c7340bMo2475g2.f34957a;
            int i16 = c7340bMo2475g2.f34960d;
            int i17 = c7340bMo2475g2.f34959c;
            int i18 = c7340bMo2475g2.f34958b;
            if (i11 > i15 || i14 > i18 || i13 > i17 || i12 > i16) {
                iArr = iArr2;
                z6 = true;
            } else {
                iArr = iArr2;
                z6 = false;
            }
            if (z6 != (i11 < i15 || i14 < i18 || i13 < i17 || i12 < i16)) {
                if (z6) {
                    iArr[0] = iArr[0] | i10;
                } else {
                    iArr3[0] = iArr3[0] | i10;
                }
            }
            i10 <<= 1;
            iArr2 = iArr;
        }
        int i19 = iArr2[0];
        int i20 = iArr3[0];
        int i21 = i19 | i20;
        if (i21 == 0) {
            this.f5434b = y1VarM2537d;
            return d1.m2352h(view, windowInsets);
        }
        y1 y1Var2 = this.f5434b;
        i1 i1Var = new i1(i21, (i19 & 8) != 0 ? d1.f5436d : (i20 & 8) != 0 ? d1.f5437e : (i19 & 519) != 0 ? d1.f5438f : (i20 & 519) != 0 ? d1.f5439g : null, (i21 & 8) != 0 ? 160L : 250L);
        i1Var.f5469a.mo2387c(DefinitionKt.NO_Float_VALUE);
        ValueAnimator duration = ValueAnimator.ofFloat(DefinitionKt.NO_Float_VALUE, 1.0f).setDuration(i1Var.f5469a.mo2385a());
        C7340b c7340bMo2475g3 = v1Var.mo2475g(i21);
        C7340b c7340bMo2475g4 = y1Var2.f5541a.mo2475g(i21);
        int iMin = Math.min(c7340bMo2475g3.f34957a, c7340bMo2475g4.f34957a);
        int i22 = c7340bMo2475g3.f34958b;
        int i23 = c7340bMo2475g4.f34958b;
        int iMin2 = Math.min(i22, i23);
        int i24 = c7340bMo2475g3.f34959c;
        int i25 = c7340bMo2475g4.f34959c;
        int iMin3 = Math.min(i24, i25);
        int i26 = c7340bMo2475g3.f34960d;
        int i27 = c7340bMo2475g4.f34960d;
        C0917l c0917l = new C0917l(2, C7340b.m13736b(iMin, iMin2, iMin3, Math.min(i26, i27)), C7340b.m13736b(Math.max(c7340bMo2475g3.f34957a, c7340bMo2475g4.f34957a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27)));
        d1.m2349e(view, i1Var, y1VarM2537d, false);
        duration.addUpdateListener(new z0(i1Var, y1VarM2537d, y1Var2, i21, view));
        duration.addListener(new a1(view, i1Var));
        ViewTreeObserverOnPreDrawListenerC0895y.m2535a(view, new b1(view, i1Var, c0917l, duration, 0));
        this.f5434b = y1VarM2537d;
        return d1.m2352h(view, windowInsets);
    }
}
