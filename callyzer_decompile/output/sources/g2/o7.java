package g2;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import h1.C2772c;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5179q;
import og.gg;
import p004e.DialogC1879n;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import tx.InterfaceC7266z;
import w4.EnumC7932x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o7 extends DialogC1879n {

    /* renamed from: d */
    public InterfaceC2137a f12284d;

    /* renamed from: e */
    public a8 f12285e;

    /* renamed from: f */
    public final View f12286f;

    /* renamed from: g */
    public final k7 f12287g;

    public o7(InterfaceC2137a interfaceC2137a, a8 a8Var, View view, EnumC6757m enumC6757m, InterfaceC6747c interfaceC6747c, UUID uuid, C2772c c2772c, InterfaceC7266z interfaceC7266z, boolean z6) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f12284d = interfaceC2137a;
        this.f12285e = a8Var;
        this.f12286f = view;
        float f6 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC5179q.m10121c(window, false);
        k7 k7Var = new k7(getContext(), this.f12285e.f11177b, this.f12284d, c2772c, interfaceC7266z);
        k7Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        k7Var.setClipChildren(false);
        k7Var.setElevation(interfaceC6747c.mo8435T(f6));
        k7Var.setOutlineProvider(new l7(0));
        this.f12287g = k7Var;
        setContentView(k7Var);
        d7.q0.m5341h(k7Var, d7.q0.m5337d(view));
        d7.q0.m5342i(k7Var, d7.q0.m5338e(view));
        gg.m10676c(k7Var, gg.m10674a(view));
        m6226c(this.f12284d, this.f12285e, enumC6757m);
        window.getDecorView();
        int i10 = Build.VERSION.SDK_INT;
        og.ga c2Var = i10 >= 35 ? new c6.c2(window) : i10 >= 30 ? new c6.b2(window) : i10 >= 26 ? new c6.a2(window) : new c6.z1(window);
        boolean z10 = !z6;
        c2Var.mo2344c(z10);
        c2Var.mo2334b(z10);
        og.ld.m10749a(this.f8895c, this, new m7(this, 0));
    }

    /* renamed from: c */
    public final void m6226c(InterfaceC2137a interfaceC2137a, a8 a8Var, EnumC6757m enumC6757m) {
        this.f12284d = interfaceC2137a;
        this.f12285e = a8Var;
        EnumC7932x enumC7932x = a8Var.f11176a;
        ViewGroup.LayoutParams layoutParams = this.f12286f.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i10 = 1;
        boolean z6 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int i11 = b8.f11258a[enumC7932x.ordinal()];
        if (i11 == 1) {
            z6 = false;
        } else if (i11 == 2) {
            z6 = true;
        } else if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Window window = getWindow();
        AbstractC4154l.m8920c(window);
        window.setFlags(z6 ? 8192 : -8193, 8192);
        int i12 = n7.f12198a[enumC6757m.ordinal()];
        if (i12 == 1) {
            i10 = 0;
        } else if (i12 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.f12287g.setLayoutDirection(i10);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f12284d.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
