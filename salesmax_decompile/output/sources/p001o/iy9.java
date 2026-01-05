package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class iy9 extends hy9 {
    public static final ewi.C13274i R0;
    public static final SparseIntArray S0;
    public final ConstraintLayout C0;
    public final LinearLayout D0;
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
    public final d54 O0;
    public boolean P0;
    public long Q0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(27);
        R0 = c13274i;
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(1, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        S0 = sparseIntArray;
        sparseIntArray.put(z8e.fragmentToolbar, 13);
        sparseIntArray.put(z8e.fragmentBack, 14);
        sparseIntArray.put(z8e.fragmentTitle, 15);
        sparseIntArray.put(z8e.toggleGroup, 16);
        sparseIntArray.put(z8e.btnToday, 17);
        sparseIntArray.put(z8e.btnWeek, 18);
        sparseIntArray.put(z8e.btnMonth, 19);
        sparseIntArray.put(z8e.metricLegend, 20);
        sparseIntArray.put(z8e.chip_metrics1, 21);
        sparseIntArray.put(z8e.chip_metrics2, 22);
        sparseIntArray.put(z8e.chip_metrics3, 23);
        sparseIntArray.put(z8e.chip_metrics4, 24);
        sparseIntArray.put(z8e.shimmerLayout, 25);
        sparseIntArray.put(z8e.rvFragmentList, 26);
    }

    public iy9(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 27, R0, S0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.Q0 != 0) {
                return true;
            }
            return this.E0.mo16290E() || this.H0.mo16290E() || this.I0.mo16290E() || this.J0.mo16290E() || this.K0.mo16290E() || this.L0.mo16290E() || this.M0.mo16290E() || this.N0.mo16290E() || this.O0.mo16290E() || this.F0.mo16290E() || this.G0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.Q0 = 2L;
        }
        this.E0.mo16291G();
        this.H0.mo16291G();
        this.I0.mo16291G();
        this.J0.mo16291G();
        this.K0.mo16291G();
        this.L0.mo16291G();
        this.M0.mo16291G();
        this.N0.mo16291G();
        this.O0.mo16291G();
        this.F0.mo16291G();
        this.G0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (46 != i) {
            return false;
        }
        j0(((Boolean) obj).booleanValue());
        return true;
    }

    public void j0(boolean z) {
        this.B0 = z;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.Q0;
            this.Q0 = 0L;
        }
        long j2 = j & 2;
        if (j2 != 0) {
            ConstraintLayout constraintLayout = this.C0;
            boolean z = this.P0;
            wh1.m54388b(constraintLayout, z, z, z, z, true, true, true, true);
        }
        if (j2 != 0) {
            this.P0 = true;
        }
        ewi.m25683r(this.E0);
        ewi.m25683r(this.H0);
        ewi.m25683r(this.I0);
        ewi.m25683r(this.J0);
        ewi.m25683r(this.K0);
        ewi.m25683r(this.L0);
        ewi.m25683r(this.M0);
        ewi.m25683r(this.N0);
        ewi.m25683r(this.O0);
        ewi.m25683r(this.F0);
        ewi.m25683r(this.G0);
    }

    public iy9(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[19], (Button) objArr[17], (Button) objArr[18], (Chip) objArr[21], (Chip) objArr[22], (Chip) objArr[23], (Chip) objArr[24], (ShapeableImageView) objArr[14], (MaterialTextView) objArr[15], (MaterialCardView) objArr[13], (ConstraintLayout) objArr[20], (RecyclerView) objArr[26], (ShimmerFrameLayout) objArr[25], (MaterialButtonToggleGroup) objArr[16]);
        this.Q0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.C0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.D0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[2];
        this.E0 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[11];
        this.F0 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[12];
        this.G0 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[3];
        this.H0 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[4];
        this.I0 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[5];
        this.J0 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[6];
        this.K0 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[7];
        this.L0 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[8];
        this.M0 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[9];
        this.N0 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[10];
        this.O0 = d54Var11;
        m25693Z(d54Var11);
        a0(view);
        mo16291G();
    }
}
