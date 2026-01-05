package y7;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c6.C0892v;
import java.util.ArrayList;
import k1.j2;
import uf.C7427b;
import ug.C7439j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a */
    public C8589x f41588a;

    /* renamed from: b */
    public ArrayList f41589b;

    /* renamed from: c */
    public long f41590c;

    /* renamed from: d */
    public long f41591d;

    /* renamed from: e */
    public long f41592e;

    /* renamed from: f */
    public long f41593f;

    /* renamed from: b */
    public static void m15835b(t0 t0Var) {
        RecyclerView recyclerView;
        int i10 = t0Var.f41801j;
        if (t0Var.m15921f() || (i10 & 4) != 0 || (recyclerView = t0Var.f41809r) == null) {
            return;
        }
        recyclerView.m1322E(t0Var);
    }

    /* renamed from: a */
    public abstract boolean mo15836a(t0 t0Var, t0 t0Var2, C0892v c0892v, C0892v c0892v2);

    /* renamed from: c */
    public final void m15837c(t0 t0Var) {
        C8589x c8589x = this.f41588a;
        if (c8589x != null) {
            RecyclerView recyclerView = c8589x.f41824a;
            boolean z6 = true;
            t0Var.m15929n(true);
            View view = t0Var.f41792a;
            if (t0Var.f41799h != null && t0Var.f41800i == null) {
                t0Var.f41799h = null;
            }
            t0Var.f41800i = null;
            if ((t0Var.f41801j & 16) != 0) {
                return;
            }
            l0 l0Var = recyclerView.f2814b;
            recyclerView.m1342Z();
            C7439j c7439j = recyclerView.f2817e;
            j2 j2Var = (j2) c7439j.f35538c;
            C7427b c7427b = (C7427b) c7439j.f35537b;
            int iIndexOfChild = ((RecyclerView) c7427b.f35231b).indexOfChild(view);
            if (iIndexOfChild == -1) {
                c7439j.m13999E(view);
            } else if (j2Var.m8458e(iIndexOfChild)) {
                j2Var.m8462i(iIndexOfChild);
                c7439j.m13999E(view);
                c7427b.m13821p(iIndexOfChild);
            } else {
                z6 = false;
            }
            if (z6) {
                t0 t0VarM1313H = RecyclerView.m1313H(view);
                l0Var.m15884j(t0VarM1313H);
                l0Var.m15881g(t0VarM1313H);
            }
            recyclerView.a0(!z6);
            if (z6 || !t0Var.m15925j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    /* renamed from: d */
    public abstract void mo15838d(t0 t0Var);

    /* renamed from: e */
    public abstract void mo15839e();

    /* renamed from: f */
    public abstract boolean mo15840f();
}
