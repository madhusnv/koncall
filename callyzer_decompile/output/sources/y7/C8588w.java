package y7;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.w */
/* loaded from: classes.dex */
public final class C8588w extends h0 {

    /* renamed from: a */
    public RecyclerView f41818a;

    /* renamed from: b */
    public final w0 f41819b = new w0(this);

    /* renamed from: c */
    public C8585t f41820c;

    /* renamed from: d */
    public C8585t f41821d;

    /* renamed from: b */
    public static int m15940b(View view, AbstractC8586u abstractC8586u) {
        return ((abstractC8586u.mo15903e(view) / 2) + abstractC8586u.mo15905g(view)) - ((abstractC8586u.mo15912n() / 2) + abstractC8586u.mo15911m());
    }

    /* renamed from: c */
    public static View m15941c(f0 f0Var, AbstractC8586u abstractC8586u) {
        int iM15858v = f0Var.m15858v();
        View view = null;
        if (iM15858v == 0) {
            return null;
        }
        int iMo15912n = (abstractC8586u.mo15912n() / 2) + abstractC8586u.mo15911m();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iM15858v; i11++) {
            View viewM15857u = f0Var.m15857u(i11);
            int iAbs = Math.abs(((abstractC8586u.mo15903e(viewM15857u) / 2) + abstractC8586u.mo15905g(viewM15857u)) - iMo15912n);
            if (iAbs < i10) {
                view = viewM15857u;
                i10 = iAbs;
            }
        }
        return view;
    }

    /* renamed from: a */
    public final int[] m15942a(f0 f0Var, View view) {
        int[] iArr = new int[2];
        if (f0Var.mo1305d()) {
            iArr[0] = m15940b(view, m15943d(f0Var));
        } else {
            iArr[0] = 0;
        }
        if (f0Var.mo1306e()) {
            iArr[1] = m15940b(view, m15944e(f0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* renamed from: d */
    public final AbstractC8586u m15943d(f0 f0Var) {
        C8585t c8585t = this.f41821d;
        if (c8585t == null || ((f0) c8585t.f41811b) != f0Var) {
            this.f41821d = new C8585t(f0Var, 0);
        }
        return this.f41821d;
    }

    /* renamed from: e */
    public final AbstractC8586u m15944e(f0 f0Var) {
        C8585t c8585t = this.f41820c;
        if (c8585t == null || ((f0) c8585t.f41811b) != f0Var) {
            this.f41820c = new C8585t(f0Var, 1);
        }
        return this.f41820c;
    }

    /* renamed from: f */
    public final void m15945f() {
        f0 layoutManager;
        RecyclerView recyclerView = this.f41818a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewM15941c = layoutManager.mo1306e() ? m15941c(layoutManager, m15944e(layoutManager)) : layoutManager.mo1305d() ? m15941c(layoutManager, m15943d(layoutManager)) : null;
        if (viewM15941c == null) {
            return;
        }
        int[] iArrM15942a = m15942a(layoutManager, viewM15941c);
        int i10 = iArrM15942a[0];
        if (i10 == 0 && iArrM15942a[1] == 0) {
            return;
        }
        this.f41818a.m1341Y(i10, iArrM15942a[1], false);
    }
}
