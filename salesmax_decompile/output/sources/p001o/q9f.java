package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class q9f extends p9f {
    public static final ewi.C13274i A0;
    public static final SparseIntArray B0;
    public final ConstraintLayout r0;
    public final LinearLayout s0;
    public final h54 t0;
    public final h54 u0;
    public final h54 v0;
    public final h54 w0;
    public final h54 x0;
    public final h54 y0;
    public long z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(11);
        A0 = c13274i;
        int i = p9e.content_shimmer_tasks;
        c13274i.m25699a(1, new String[]{"content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks"}, new int[]{2, 3, 4, 5, 6, 7}, new int[]{i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        B0 = sparseIntArray;
        sparseIntArray.put(z8e.shimmerLayout, 8);
        sparseIntArray.put(z8e.mRecentSearch, 9);
        sparseIntArray.put(z8e.rvTasksList, 10);
    }

    public q9f(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 11, A0, B0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.z0 != 0) {
                return true;
            }
            return this.t0.mo16290E() || this.u0.mo16290E() || this.v0.mo16290E() || this.w0.mo16290E() || this.x0.mo16290E() || this.y0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.z0 = 2L;
        }
        this.t0.mo16291G();
        this.u0.mo16291G();
        this.v0.mo16291G();
        this.w0.mo16291G();
        this.x0.mo16291G();
        this.y0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (45 != i) {
            return false;
        }
        j0(((Boolean) obj).booleanValue());
        return true;
    }

    public void j0(boolean z) {
        this.q0 = z;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.z0 = 0L;
        }
        ewi.m25683r(this.t0);
        ewi.m25683r(this.u0);
        ewi.m25683r(this.v0);
        ewi.m25683r(this.w0);
        ewi.m25683r(this.x0);
        ewi.m25683r(this.y0);
    }

    public q9f(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[9], (RecyclerView) objArr[10], (ShimmerFrameLayout) objArr[8]);
        this.z0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.r0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.s0 = linearLayout;
        linearLayout.setTag(null);
        h54 h54Var = (h54) objArr[2];
        this.t0 = h54Var;
        m25693Z(h54Var);
        h54 h54Var2 = (h54) objArr[3];
        this.u0 = h54Var2;
        m25693Z(h54Var2);
        h54 h54Var3 = (h54) objArr[4];
        this.v0 = h54Var3;
        m25693Z(h54Var3);
        h54 h54Var4 = (h54) objArr[5];
        this.w0 = h54Var4;
        m25693Z(h54Var4);
        h54 h54Var5 = (h54) objArr[6];
        this.x0 = h54Var5;
        m25693Z(h54Var5);
        h54 h54Var6 = (h54) objArr[7];
        this.y0 = h54Var6;
        m25693Z(h54Var6);
        a0(view);
        mo16291G();
    }
}
