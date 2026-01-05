package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class vs4 extends us4 {
    public static final ewi.C13274i L0;
    public static final SparseIntArray M0;
    public final d54 A0;
    public final d54 B0;
    public final d54 C0;
    public final d54 D0;
    public final d54 E0;
    public final d54 F0;
    public final d54 G0;
    public final d54 H0;
    public final d54 I0;
    public boolean J0;
    public long K0;
    public final ConstraintLayout v0;
    public final ConstraintLayout w0;
    public final LinearLayout x0;
    public final d54 y0;
    public final d54 z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(20);
        L0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_no_deals"}, new int[]{14}, new int[]{p9e.content_no_deals});
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(2, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M0 = sparseIntArray;
        sparseIntArray.put(z8e.dealExplanation, 15);
        sparseIntArray.put(z8e.dealExplanationText, 16);
        sparseIntArray.put(z8e.viewedDealExplanationButton, 17);
        sparseIntArray.put(z8e.shimmerLayout, 18);
        sparseIntArray.put(z8e.rvFragmentList, 19);
    }

    public vs4(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 20, L0, M0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.K0 != 0) {
                return true;
            }
            return this.y0.mo16290E() || this.B0.mo16290E() || this.C0.mo16290E() || this.D0.mo16290E() || this.E0.mo16290E() || this.F0.mo16290E() || this.G0.mo16290E() || this.H0.mo16290E() || this.I0.mo16290E() || this.z0.mo16290E() || this.A0.mo16290E() || this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.K0 = 8L;
        }
        this.y0.mo16291G();
        this.B0.mo16291G();
        this.C0.mo16291G();
        this.D0.mo16291G();
        this.E0.mo16291G();
        this.F0.mo16291G();
        this.G0.mo16291G();
        this.H0.mo16291G();
        this.I0.mo16291G();
        this.z0.mo16291G();
        this.A0.mo16291G();
        this.n0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return l0((h34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (87 == i) {
            k0(((Boolean) obj).booleanValue());
        } else {
            if (85 != i) {
                return false;
            }
            j0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.us4
    public void j0(boolean z) {
        this.u0 = z;
        synchronized (this) {
            this.K0 |= 4;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.us4
    public void k0(boolean z) {
        this.t0 = z;
        synchronized (this) {
            this.K0 |= 2;
        }
        m28509h(87);
        super.m25692R();
    }

    public final boolean l0(h34 h34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.K0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.K0;
            this.K0 = 0L;
        }
        boolean z = this.t0;
        boolean z2 = this.u0;
        long j2 = 10 & j;
        if ((12 & j) != 0) {
            this.n0.h0(z2);
        }
        if (j2 != 0) {
            this.n0.i0(z);
        }
        long j3 = j & 8;
        if (j3 != 0) {
            ConstraintLayout constraintLayout = this.v0;
            boolean z3 = this.J0;
            wh1.m54388b(constraintLayout, z3, z3, z3, z3, true, true, true, true);
        }
        if (j3 != 0) {
            this.J0 = true;
        }
        ewi.m25683r(this.y0);
        ewi.m25683r(this.B0);
        ewi.m25683r(this.C0);
        ewi.m25683r(this.D0);
        ewi.m25683r(this.E0);
        ewi.m25683r(this.F0);
        ewi.m25683r(this.G0);
        ewi.m25683r(this.H0);
        ewi.m25683r(this.I0);
        ewi.m25683r(this.z0);
        ewi.m25683r(this.A0);
        ewi.m25683r(this.n0);
    }

    public vs4(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (h34) objArr[14], (MaterialCardView) objArr[15], (MaterialTextView) objArr[16], (RecyclerView) objArr[19], (ShimmerFrameLayout) objArr[18], (MaterialButton) objArr[17]);
        this.K0 = -1L;
        m25693Z(this.n0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.v0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.w0 = constraintLayout2;
        constraintLayout2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.x0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[3];
        this.y0 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[12];
        this.z0 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[13];
        this.A0 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[4];
        this.B0 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[5];
        this.C0 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[6];
        this.D0 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[7];
        this.E0 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[8];
        this.F0 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[9];
        this.G0 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[10];
        this.H0 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[11];
        this.I0 = d54Var11;
        m25693Z(d54Var11);
        a0(view);
        mo16291G();
    }
}
