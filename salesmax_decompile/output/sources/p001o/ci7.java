package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class ci7 extends bi7 {
    public static final ewi.C13274i Q0;
    public static final SparseIntArray R0;
    public final CoordinatorLayout B0;
    public final LinearLayout C0;
    public final d54 D0;
    public final d54 E0;
    public final d54 F0;
    public final d54 G0;
    public final d54 H0;
    public final d54 I0;
    public final d54 J0;
    public final d54 K0;
    public final d54 L0;
    public final d54 M0;
    public final d54 N0;
    public boolean O0;
    public long P0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(22);
        Q0 = c13274i;
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(1, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        R0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 13);
        sparseIntArray.put(z8e.toolbar, 14);
        sparseIntArray.put(z8e.leadsAppBar, 15);
        sparseIntArray.put(z8e.goBack, 16);
        sparseIntArray.put(z8e.leadTitle, 17);
        sparseIntArray.put(z8e.searchLeadsEditTextLayout, 18);
        sparseIntArray.put(z8e.searchLeadsEditText, 19);
        sparseIntArray.put(z8e.shimmerLayout, 20);
        sparseIntArray.put(z8e.rvCallLogsList, 21);
    }

    public ci7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 22, Q0, R0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.P0 != 0) {
                return true;
            }
            return this.D0.mo16290E() || this.G0.mo16290E() || this.H0.mo16290E() || this.I0.mo16290E() || this.J0.mo16290E() || this.K0.mo16290E() || this.L0.mo16290E() || this.M0.mo16290E() || this.N0.mo16290E() || this.E0.mo16290E() || this.F0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.P0 = 32L;
        }
        this.D0.mo16291G();
        this.G0.mo16291G();
        this.H0.mo16291G();
        this.I0.mo16291G();
        this.J0.mo16291G();
        this.K0.mo16291G();
        this.L0.mo16291G();
        this.M0.mo16291G();
        this.N0.mo16291G();
        this.E0.mo16291G();
        this.F0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (89 == i) {
            m0(((Boolean) obj).booleanValue());
        } else if (83 == i) {
            k0(((Boolean) obj).booleanValue());
        } else if (87 == i) {
            j0(((Boolean) obj).booleanValue());
        } else if (93 == i) {
            n0(((Boolean) obj).booleanValue());
        } else {
            if (86 != i) {
                return false;
            }
            l0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.bi7
    public void j0(boolean z) {
        this.x0 = z;
    }

    public void k0(boolean z) {
        this.w0 = z;
    }

    public void l0(boolean z) {
        this.z0 = z;
    }

    public void m0(boolean z) {
        this.y0 = z;
    }

    public void n0(boolean z) {
        this.A0 = z;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.P0;
            this.P0 = 0L;
        }
        long j2 = j & 32;
        if (j2 != 0) {
            CoordinatorLayout coordinatorLayout = this.B0;
            boolean z = this.O0;
            wh1.m54388b(coordinatorLayout, false, z, false, z, false, true, false, true);
        }
        if (j2 != 0) {
            this.O0 = true;
        }
        ewi.m25683r(this.D0);
        ewi.m25683r(this.G0);
        ewi.m25683r(this.H0);
        ewi.m25683r(this.I0);
        ewi.m25683r(this.J0);
        ewi.m25683r(this.K0);
        ewi.m25683r(this.L0);
        ewi.m25683r(this.M0);
        ewi.m25683r(this.N0);
        ewi.m25683r(this.E0);
        ewi.m25683r(this.F0);
    }

    public ci7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppBarLayout) objArr[13], (ShapeableImageView) objArr[16], (MaterialTextView) objArr[17], (LinearLayout) objArr[15], (RecyclerView) objArr[21], (TextInputEditText) objArr[19], (TextInputLayout) objArr[18], (ShimmerFrameLayout) objArr[20], (Toolbar) objArr[14]);
        this.P0 = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.B0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.C0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[2];
        this.D0 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[11];
        this.E0 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[12];
        this.F0 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[3];
        this.G0 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[4];
        this.H0 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[5];
        this.I0 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[6];
        this.J0 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[7];
        this.K0 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[8];
        this.L0 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[9];
        this.M0 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[10];
        this.N0 = d54Var11;
        m25693Z(d54Var11);
        a0(view);
        mo16291G();
    }
}
