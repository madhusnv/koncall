package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class o2h extends n2h {
    public static final ewi.C13274i F0;
    public static final SparseIntArray G0;
    public final h54 A0;
    public final h54 B0;
    public final h54 C0;
    public final h54 D0;
    public long E0;
    public final ConstraintLayout w0;
    public final LinearLayout x0;
    public final h54 y0;
    public final h54 z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(16);
        F0 = c13274i;
        int i = p9e.content_shimmer_tasks;
        c13274i.m25699a(1, new String[]{"content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks"}, new int[]{2, 3, 4, 5, 6, 7}, new int[]{i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G0 = sparseIntArray;
        sparseIntArray.put(z8e.fragmentToolbar, 8);
        sparseIntArray.put(z8e.fragmentBack, 9);
        sparseIntArray.put(z8e.fragmentTitle, 10);
        sparseIntArray.put(z8e.shimmerLayout, 11);
        sparseIntArray.put(z8e.rvFragmentList, 12);
        sparseIntArray.put(z8e.bottomBorder, 13);
        sparseIntArray.put(z8e.buttonCancel, 14);
        sparseIntArray.put(z8e.buttonAssign, 15);
    }

    public o2h(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 16, F0, G0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.E0 != 0) {
                return true;
            }
            return this.y0.mo16290E() || this.z0.mo16290E() || this.A0.mo16290E() || this.B0.mo16290E() || this.C0.mo16290E() || this.D0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.E0 = 2L;
        }
        this.y0.mo16291G();
        this.z0.mo16291G();
        this.A0.mo16291G();
        this.B0.mo16291G();
        this.C0.mo16291G();
        this.D0.mo16291G();
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

    @Override // p001o.n2h
    public void j0(boolean z) {
        this.v0 = z;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.E0 = 0L;
        }
        ewi.m25683r(this.y0);
        ewi.m25683r(this.z0);
        ewi.m25683r(this.A0);
        ewi.m25683r(this.B0);
        ewi.m25683r(this.C0);
        ewi.m25683r(this.D0);
    }

    public o2h(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (View) objArr[13], (MaterialButton) objArr[15], (MaterialButton) objArr[14], (ShapeableImageView) objArr[9], (MaterialTextView) objArr[10], (MaterialCardView) objArr[8], (RecyclerView) objArr[12], (ShimmerFrameLayout) objArr[11]);
        this.E0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.w0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.x0 = linearLayout;
        linearLayout.setTag(null);
        h54 h54Var = (h54) objArr[2];
        this.y0 = h54Var;
        m25693Z(h54Var);
        h54 h54Var2 = (h54) objArr[3];
        this.z0 = h54Var2;
        m25693Z(h54Var2);
        h54 h54Var3 = (h54) objArr[4];
        this.A0 = h54Var3;
        m25693Z(h54Var3);
        h54 h54Var4 = (h54) objArr[5];
        this.B0 = h54Var4;
        m25693Z(h54Var4);
        h54 h54Var5 = (h54) objArr[6];
        this.C0 = h54Var5;
        m25693Z(h54Var5);
        h54 h54Var6 = (h54) objArr[7];
        this.D0 = h54Var6;
        m25693Z(h54Var6);
        a0(view);
        mo16291G();
    }
}
