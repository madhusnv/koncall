package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class m2h extends l2h {
    public static final ewi.C13274i D0;
    public static final SparseIntArray E0;
    public final h54 A0;
    public final h54 B0;
    public long C0;
    public final ConstraintLayout u0;
    public final LinearLayout v0;
    public final h54 w0;
    public final h54 x0;
    public final h54 y0;
    public final h54 z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(13);
        D0 = c13274i;
        int i = p9e.content_shimmer_tasks;
        c13274i.m25699a(1, new String[]{"content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks"}, new int[]{2, 3, 4, 5, 6, 7}, new int[]{i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(z8e.fragmentToolbar, 8);
        sparseIntArray.put(z8e.fragmentBack, 9);
        sparseIntArray.put(z8e.fragmentTitle, 10);
        sparseIntArray.put(z8e.shimmerLayout, 11);
        sparseIntArray.put(z8e.rvFragmentList, 12);
    }

    public m2h(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 13, D0, E0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.C0 != 0) {
                return true;
            }
            return this.w0.mo16290E() || this.x0.mo16290E() || this.y0.mo16290E() || this.z0.mo16290E() || this.A0.mo16290E() || this.B0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.C0 = 4L;
        }
        this.w0.mo16291G();
        this.x0.mo16291G();
        this.y0.mo16291G();
        this.z0.mo16291G();
        this.A0.mo16291G();
        this.B0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (45 == i) {
            j0(((Boolean) obj).booleanValue());
        } else {
            if (95 != i) {
                return false;
            }
            k0((String) obj);
        }
        return true;
    }

    @Override // p001o.l2h
    public void j0(boolean z) {
        this.s0 = z;
    }

    public void k0(String str) {
        this.t0 = str;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.C0 = 0L;
        }
        ewi.m25683r(this.w0);
        ewi.m25683r(this.x0);
        ewi.m25683r(this.y0);
        ewi.m25683r(this.z0);
        ewi.m25683r(this.A0);
        ewi.m25683r(this.B0);
    }

    public m2h(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[9], (MaterialTextView) objArr[10], (MaterialCardView) objArr[8], (RecyclerView) objArr[12], (ShimmerFrameLayout) objArr[11]);
        this.C0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.v0 = linearLayout;
        linearLayout.setTag(null);
        h54 h54Var = (h54) objArr[2];
        this.w0 = h54Var;
        m25693Z(h54Var);
        h54 h54Var2 = (h54) objArr[3];
        this.x0 = h54Var2;
        m25693Z(h54Var2);
        h54 h54Var3 = (h54) objArr[4];
        this.y0 = h54Var3;
        m25693Z(h54Var3);
        h54 h54Var4 = (h54) objArr[5];
        this.z0 = h54Var4;
        m25693Z(h54Var4);
        h54 h54Var5 = (h54) objArr[6];
        this.A0 = h54Var5;
        m25693Z(h54Var5);
        h54 h54Var6 = (h54) objArr[7];
        this.B0 = h54Var6;
        m25693Z(h54Var6);
        a0(view);
        mo16291G();
    }
}
