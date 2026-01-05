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
public class fb0 extends eb0 {
    public static final ewi.C13274i O0;
    public static final SparseIntArray P0;
    public final ConstraintLayout A0;
    public final LinearLayout B0;
    public final d54 C0;
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
    public long N0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(22);
        O0 = c13274i;
        c13274i.m25699a(0, new String[]{"content_no_items", "content_no_lead_search_filter", "content_no_team", "item_no_internet"}, new int[]{13, 14, 15, 16}, new int[]{p9e.content_no_items, p9e.content_no_lead_search_filter, p9e.content_no_team, p9e.item_no_internet});
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(1, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        P0 = sparseIntArray;
        sparseIntArray.put(z8e.rvTeamsList, 17);
        sparseIntArray.put(z8e.shimmerLayout, 18);
        sparseIntArray.put(z8e.rvCallLogsList, 19);
        sparseIntArray.put(z8e.header_title_layout, 20);
        sparseIntArray.put(z8e.header_title, 21);
    }

    public fb0(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 22, O0, P0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.N0 != 0) {
                return true;
            }
            return this.C0.mo16290E() || this.F0.mo16290E() || this.G0.mo16290E() || this.H0.mo16290E() || this.I0.mo16290E() || this.J0.mo16290E() || this.K0.mo16290E() || this.L0.mo16290E() || this.M0.mo16290E() || this.D0.mo16290E() || this.E0.mo16290E() || this.o0.mo16290E() || this.p0.mo16290E() || this.q0.mo16290E() || this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.N0 = 256L;
        }
        this.C0.mo16291G();
        this.F0.mo16291G();
        this.G0.mo16291G();
        this.H0.mo16291G();
        this.I0.mo16291G();
        this.J0.mo16291G();
        this.K0.mo16291G();
        this.L0.mo16291G();
        this.M0.mo16291G();
        this.D0.mo16291G();
        this.E0.mo16291G();
        this.o0.mo16291G();
        this.p0.mo16291G();
        this.q0.mo16291G();
        this.n0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return n0((n19) obj, i2);
        }
        if (i == 1) {
            return q0((p34) obj, i2);
        }
        if (i == 2) {
            return s0((h44) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return p0((n34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (89 == i) {
            m0(((Boolean) obj).booleanValue());
        } else if (87 == i) {
            l0(((Boolean) obj).booleanValue());
        } else if (85 == i) {
            j0(((Boolean) obj).booleanValue());
        } else {
            if (86 != i) {
                return false;
            }
            k0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.eb0
    public void j0(boolean z) {
        this.y0 = z;
        synchronized (this) {
            this.N0 |= 64;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.eb0
    public void k0(boolean z) {
        this.z0 = z;
        synchronized (this) {
            this.N0 |= 128;
        }
        m28509h(86);
        super.m25692R();
    }

    @Override // p001o.eb0
    public void l0(boolean z) {
        this.w0 = z;
        synchronized (this) {
            this.N0 |= 32;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.eb0
    public void m0(boolean z) {
        this.x0 = z;
        synchronized (this) {
            this.N0 |= 16;
        }
        m28509h(89);
        super.m25692R();
    }

    public final boolean n0(n19 n19Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.N0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.N0;
            this.N0 = 0L;
        }
        boolean z = this.x0;
        boolean z2 = this.w0;
        boolean z3 = this.y0;
        boolean z4 = this.z0;
        long j2 = 272 & j;
        long j3 = 288 & j;
        long j4 = 320 & j;
        long j5 = j & 384;
        if (j4 != 0) {
            this.n0.h0(z3);
            this.o0.h0(z3);
            this.p0.h0(z3);
            this.q0.h0(z3);
        }
        if (j3 != 0) {
            this.o0.i0(z2);
        }
        if (j5 != 0) {
            this.p0.i0(z4);
        }
        if (j2 != 0) {
            this.q0.i0(z);
        }
        ewi.m25683r(this.C0);
        ewi.m25683r(this.F0);
        ewi.m25683r(this.G0);
        ewi.m25683r(this.H0);
        ewi.m25683r(this.I0);
        ewi.m25683r(this.J0);
        ewi.m25683r(this.K0);
        ewi.m25683r(this.L0);
        ewi.m25683r(this.M0);
        ewi.m25683r(this.D0);
        ewi.m25683r(this.E0);
        ewi.m25683r(this.o0);
        ewi.m25683r(this.p0);
        ewi.m25683r(this.q0);
        ewi.m25683r(this.n0);
    }

    public final boolean p0(n34 n34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.N0 |= 8;
        }
        return true;
    }

    public final boolean q0(p34 p34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.N0 |= 2;
        }
        return true;
    }

    public final boolean s0(h44 h44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.N0 |= 4;
        }
        return true;
    }

    public fb0(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 4, (n19) objArr[16], (n34) objArr[13], (p34) objArr[14], (h44) objArr[15], (MaterialTextView) objArr[21], (LinearLayout) objArr[20], (RecyclerView) objArr[19], (RecyclerView) objArr[17], (ShimmerFrameLayout) objArr[18]);
        this.N0 = -1L;
        m25693Z(this.n0);
        m25693Z(this.o0);
        m25693Z(this.p0);
        m25693Z(this.q0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.A0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.B0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[2];
        this.C0 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[11];
        this.D0 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[12];
        this.E0 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[3];
        this.F0 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[4];
        this.G0 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[5];
        this.H0 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[6];
        this.I0 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[7];
        this.J0 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[8];
        this.K0 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[9];
        this.L0 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[10];
        this.M0 = d54Var11;
        m25693Z(d54Var11);
        a0(view);
        mo16291G();
    }
}
