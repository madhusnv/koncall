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
public class vqb extends uqb {
    public static final ewi.C13274i K0;
    public static final SparseIntArray L0;
    public final ConstraintLayout B0;
    public final LinearLayout C0;
    public final t44 D0;
    public final t44 E0;
    public final t44 F0;
    public final t44 G0;
    public final t44 H0;
    public final t44 I0;
    public long J0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(17);
        K0 = c13274i;
        c13274i.m25699a(0, new String[]{"content_no_activity", "content_no_activity_search_filter", "content_no_team", "item_no_internet"}, new int[]{8, 9, 10, 11}, new int[]{p9e.content_no_activity, p9e.content_no_activity_search_filter, p9e.content_no_team, p9e.item_no_internet});
        int i = p9e.content_shimmer_activities;
        c13274i.m25699a(1, new String[]{"content_shimmer_activities", "content_shimmer_activities", "content_shimmer_activities", "content_shimmer_activities", "content_shimmer_activities", "content_shimmer_activities"}, new int[]{2, 3, 4, 5, 6, 7}, new int[]{i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L0 = sparseIntArray;
        sparseIntArray.put(z8e.rvTeamsList, 12);
        sparseIntArray.put(z8e.shimmerLayout, 13);
        sparseIntArray.put(z8e.rvTasksList, 14);
        sparseIntArray.put(z8e.header_title_layout, 15);
        sparseIntArray.put(z8e.header_title, 16);
    }

    public vqb(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 17, K0, L0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.J0 != 0) {
                return true;
            }
            return this.D0.mo16290E() || this.E0.mo16290E() || this.F0.mo16290E() || this.G0.mo16290E() || this.H0.mo16290E() || this.I0.mo16290E() || this.o0.mo16290E() || this.p0.mo16290E() || this.q0.mo16290E() || this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.J0 = 512L;
        }
        this.D0.mo16291G();
        this.E0.mo16291G();
        this.F0.mo16291G();
        this.G0.mo16291G();
        this.H0.mo16291G();
        this.I0.mo16291G();
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
            return q0((d34) obj, i2);
        }
        if (i == 2) {
            return s0((h44) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return p0((b34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (45 == i) {
            t0(((Boolean) obj).booleanValue());
        } else if (89 == i) {
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

    @Override // p001o.uqb
    public void j0(boolean z) {
        this.y0 = z;
        synchronized (this) {
            this.J0 |= 128;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.uqb
    public void k0(boolean z) {
        this.A0 = z;
        synchronized (this) {
            this.J0 |= 256;
        }
        m28509h(86);
        super.m25692R();
    }

    @Override // p001o.uqb
    public void l0(boolean z) {
        this.x0 = z;
        synchronized (this) {
            this.J0 |= 64;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.uqb
    public void m0(boolean z) {
        this.z0 = z;
        synchronized (this) {
            this.J0 |= 32;
        }
        m28509h(89);
        super.m25692R();
    }

    public final boolean n0(n19 n19Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.J0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.J0;
            this.J0 = 0L;
        }
        boolean z = this.z0;
        boolean z2 = this.x0;
        boolean z3 = this.y0;
        boolean z4 = this.A0;
        long j2 = 544 & j;
        long j3 = 576 & j;
        long j4 = 640 & j;
        long j5 = j & 768;
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
        ewi.m25683r(this.D0);
        ewi.m25683r(this.E0);
        ewi.m25683r(this.F0);
        ewi.m25683r(this.G0);
        ewi.m25683r(this.H0);
        ewi.m25683r(this.I0);
        ewi.m25683r(this.o0);
        ewi.m25683r(this.p0);
        ewi.m25683r(this.q0);
        ewi.m25683r(this.n0);
    }

    public final boolean p0(b34 b34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.J0 |= 8;
        }
        return true;
    }

    public final boolean q0(d34 d34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.J0 |= 2;
        }
        return true;
    }

    public final boolean s0(h44 h44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.J0 |= 4;
        }
        return true;
    }

    public void t0(boolean z) {
        this.w0 = z;
    }

    public vqb(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 4, (n19) objArr[11], (b34) objArr[8], (d34) objArr[9], (h44) objArr[10], (MaterialTextView) objArr[16], (LinearLayout) objArr[15], (RecyclerView) objArr[14], (RecyclerView) objArr[12], (ShimmerFrameLayout) objArr[13]);
        this.J0 = -1L;
        m25693Z(this.n0);
        m25693Z(this.o0);
        m25693Z(this.p0);
        m25693Z(this.q0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.B0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.C0 = linearLayout;
        linearLayout.setTag(null);
        t44 t44Var = (t44) objArr[2];
        this.D0 = t44Var;
        m25693Z(t44Var);
        t44 t44Var2 = (t44) objArr[3];
        this.E0 = t44Var2;
        m25693Z(t44Var2);
        t44 t44Var3 = (t44) objArr[4];
        this.F0 = t44Var3;
        m25693Z(t44Var3);
        t44 t44Var4 = (t44) objArr[5];
        this.G0 = t44Var4;
        m25693Z(t44Var4);
        t44 t44Var5 = (t44) objArr[6];
        this.H0 = t44Var5;
        m25693Z(t44Var5);
        t44 t44Var6 = (t44) objArr[7];
        this.I0 = t44Var6;
        m25693Z(t44Var6);
        a0(view);
        mo16291G();
    }
}
