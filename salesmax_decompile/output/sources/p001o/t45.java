package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class t45 extends s45 {
    public static final ewi.C13274i S0;
    public static final SparseIntArray T0;
    public final CoordinatorLayout D0;
    public final LinearLayout E0;
    public final d54 F0;
    public final d54 G0;
    public final d54 H0;
    public final d54 I0;
    public final d54 J0;
    public final d54 K0;
    public final d54 L0;
    public final d54 M0;
    public final d54 N0;
    public final d54 O0;
    public final d54 P0;
    public boolean Q0;
    public long R0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(24);
        S0 = c13274i;
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(2, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        T0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 15);
        sparseIntArray.put(z8e.toolbar, 16);
        sparseIntArray.put(z8e.leadsAppBar, 17);
        sparseIntArray.put(z8e.leadsMenu, 18);
        sparseIntArray.put(z8e.searchLeadsEditTextLayout, 19);
        sparseIntArray.put(z8e.searchLeadsEditText, 20);
        sparseIntArray.put(z8e.shimmerLayout, 21);
        sparseIntArray.put(z8e.swipeRefreshLayout, 22);
        sparseIntArray.put(z8e.fabAutoDialer, 23);
    }

    public t45(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 24, S0, T0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.R0 != 0) {
                return true;
            }
            return this.F0.mo16290E() || this.I0.mo16290E() || this.J0.mo16290E() || this.K0.mo16290E() || this.L0.mo16290E() || this.M0.mo16290E() || this.N0.mo16290E() || this.O0.mo16290E() || this.P0.mo16290E() || this.G0.mo16290E() || this.H0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.R0 = 32L;
        }
        this.F0.mo16291G();
        this.I0.mo16291G();
        this.J0.mo16291G();
        this.K0.mo16291G();
        this.L0.mo16291G();
        this.M0.mo16291G();
        this.N0.mo16291G();
        this.O0.mo16291G();
        this.P0.mo16291G();
        this.G0.mo16291G();
        this.H0.mo16291G();
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
            p0(((Boolean) obj).booleanValue());
        } else if (83 == i) {
            l0(((Boolean) obj).booleanValue());
        } else if (87 == i) {
            n0(((Boolean) obj).booleanValue());
        } else if (93 == i) {
            k0(((Boolean) obj).booleanValue());
        } else {
            if (86 != i) {
                return false;
            }
            m0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.s45
    public void k0(boolean z) {
        this.C0 = z;
        synchronized (this) {
            this.R0 |= 8;
        }
        m28509h(93);
        super.m25692R();
    }

    public void l0(boolean z) {
        this.y0 = z;
        synchronized (this) {
            this.R0 |= 2;
        }
        m28509h(83);
        super.m25692R();
    }

    public void m0(boolean z) {
        this.B0 = z;
    }

    public void n0(boolean z) {
        this.z0 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[PHI: r2
      0x0027: PHI (r2v1 long) = (r2v0 long), (r2v9 long) binds: [B:7:0x0017, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        synchronized (this) {
            j = this.R0;
            this.R0 = 0L;
        }
        boolean z = this.y0;
        boolean z2 = this.C0;
        long j2 = j & 34;
        int i2 = 0;
        if (j2 == 0) {
            i = 0;
        } else {
            if (j2 != 0) {
                j |= z ? 512L : 256L;
            }
            if (z) {
                i = 8;
            }
        }
        long j3 = j & 40;
        if (j3 != 0) {
            if (j3 != 0) {
                j |= z2 ? 128L : 64L;
            }
            i2 = z2 ? 8 : 0;
        }
        if ((j & 40) != 0) {
            this.r0.setVisibility(i2);
        }
        long j4 = 32 & j;
        if (j4 != 0) {
            CoordinatorLayout coordinatorLayout = this.D0;
            boolean z3 = this.Q0;
            wh1.m54388b(coordinatorLayout, false, z3, false, z3, false, true, false, true);
        }
        if ((j & 34) != 0) {
            this.w0.setVisibility(i);
        }
        if (j4 != 0) {
            this.Q0 = true;
        }
        ewi.m25683r(this.F0);
        ewi.m25683r(this.I0);
        ewi.m25683r(this.J0);
        ewi.m25683r(this.K0);
        ewi.m25683r(this.L0);
        ewi.m25683r(this.M0);
        ewi.m25683r(this.N0);
        ewi.m25683r(this.O0);
        ewi.m25683r(this.P0);
        ewi.m25683r(this.G0);
        ewi.m25683r(this.H0);
    }

    public void p0(boolean z) {
        this.A0 = z;
    }

    public t45(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppBarLayout) objArr[15], (FloatingActionButton) objArr[23], (LinearLayout) objArr[17], (ShapeableImageView) objArr[18], (TabLayout) objArr[1], (TextInputEditText) objArr[20], (TextInputLayout) objArr[19], (ShimmerFrameLayout) objArr[21], (SwipeRefreshLayout) objArr[22], (ViewPager2) objArr[3], (Toolbar) objArr[16]);
        this.R0 = -1L;
        this.r0.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.D0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.E0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[4];
        this.F0 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[13];
        this.G0 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[14];
        this.H0 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[5];
        this.I0 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[6];
        this.J0 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[7];
        this.K0 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[8];
        this.L0 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[9];
        this.M0 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[10];
        this.N0 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[11];
        this.O0 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[12];
        this.P0 = d54Var11;
        m25693Z(d54Var11);
        this.w0.setTag(null);
        a0(view);
        mo16291G();
    }
}
