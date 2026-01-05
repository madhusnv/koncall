package y7;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c6.C0892v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.x */
/* loaded from: classes.dex */
public final class C8589x {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f41824a;

    public /* synthetic */ C8589x(RecyclerView recyclerView) {
        this.f41824a = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m15946a(y7.t0 r9, c6.C0892v r10, c6.C0892v r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f41824a
            r0.getClass()
            r1 = 0
            r9.m15929n(r1)
            y7.c0 r1 = r0.f2808M
            r2 = r1
            y7.h r2 = (y7.C8573h) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.f5525a
            int r6 = r11.f5525a
            if (r4 != r6) goto L22
            int r1 = r10.f5526b
            int r3 = r11.f5526b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f5526b
            int r7 = r11.f5526b
            r3 = r9
            boolean r9 = r2.m15861g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.m15865l(r3)
            android.view.View r9 = r3.f41792a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f41646i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.m1334R()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.C8589x.m15946a(y7.t0, c6.v, c6.v):void");
    }

    /* renamed from: b */
    public void m15947b(t0 t0Var, C0892v c0892v, C0892v c0892v2) {
        boolean zM15861g;
        RecyclerView recyclerView = this.f41824a;
        recyclerView.f2814b.m15884j(t0Var);
        recyclerView.m1343e(t0Var);
        t0Var.m15929n(false);
        C8573h c8573h = (C8573h) recyclerView.f2808M;
        c8573h.getClass();
        int i10 = c0892v.f5525a;
        int i11 = c0892v.f5526b;
        View view = t0Var.f41792a;
        int left = c0892v2 == null ? view.getLeft() : c0892v2.f5525a;
        int top = c0892v2 == null ? view.getTop() : c0892v2.f5526b;
        if (t0Var.m15923h() || (i10 == left && i11 == top)) {
            c8573h.m15865l(t0Var);
            c8573h.f41645h.add(t0Var);
            zM15861g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM15861g = c8573h.m15861g(t0Var, i10, i11, left, top);
        }
        if (zM15861g) {
            recyclerView.m1334R();
        }
    }
}
