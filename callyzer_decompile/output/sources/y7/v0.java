package y7;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import c6.C0872b;
import d6.C1615e;
import d6.C1617g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 extends C0872b {

    /* renamed from: d */
    public final RecyclerView f41816d;

    /* renamed from: e */
    public final u0 f41817e;

    public v0(RecyclerView recyclerView) {
        this.f41816d = recyclerView;
        u0 u0Var = this.f41817e;
        if (u0Var != null) {
            this.f41817e = u0Var;
        } else {
            this.f41817e = new u0(this);
        }
    }

    @Override // c6.C0872b
    /* renamed from: c */
    public final void mo2337c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2337c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f41816d.m1326J()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo1300O(accessibilityEvent);
        }
    }

    @Override // c6.C0872b
    /* renamed from: d */
    public final void mo2338d(View view, C1617g c1617g) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1617g.f8062a;
        this.f5422a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f41816d;
        if (recyclerView.m1326J() || recyclerView.getLayoutManager() == null) {
            return;
        }
        f0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f41620b;
        l0 l0Var = recyclerView2.f2814b;
        q0 q0Var = recyclerView2.f43699i1;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f41620b.canScrollHorizontally(-1)) {
            c1617g.m5283a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f41620b.canScrollVertically(1) || layoutManager.f41620b.canScrollHorizontally(1)) {
            c1617g.m5283a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        c1617g.m5293l(C1615e.m5279a(layoutManager.mo1279F(l0Var, q0Var), layoutManager.mo1297x(l0Var, q0Var), 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c6.C0872b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo2341g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.mo2341g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f41816d
            boolean r0 = r4.m1326J()
            r1 = 0
            if (r0 != 0) goto L8c
            y7.f0 r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8c
            y7.f0 r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f41620b
            y7.l0 r2 = r0.f2814b
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.148E-41)
            if (r5 == r2) goto L2a
            r5 = r1
            r0 = r5
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.f41633o
            int r2 = r4.m15852C()
            int r0 = r0 - r2
            int r2 = r4.m15859z()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f41620b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.f41632n
            int r2 = r4.m15850A()
            int r5 = r5 - r2
            int r2 = r4.m15851B()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f41633o
            int r0 = r4.m15852C()
            int r5 = r5 - r0
            int r0 = r4.m15859z()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f41620b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.f41632n
            int r2 = r4.m15850A()
            int r5 = r5 - r2
            int r2 = r4.m15851B()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L86
            if (r5 != 0) goto L86
            goto L8c
        L86:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f41620b
            r4.m1341Y(r5, r0, r6)
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.v0.mo2341g(android.view.View, int, android.os.Bundle):boolean");
    }
}
