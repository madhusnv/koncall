package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class k2h extends j2h {
    public static final ewi.C13274i M0;
    public static final SparseIntArray N0;
    public final ConstraintLayout C0;
    public final ConstraintLayout D0;
    public final LinearLayout E0;
    public final h54 F0;
    public final h54 G0;
    public final h54 H0;
    public final h54 I0;
    public final h54 J0;
    public final h54 K0;
    public long L0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(20);
        M0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_no_tasks"}, new int[]{12}, new int[]{p9e.content_no_tasks});
        int i = p9e.content_shimmer_tasks;
        c13274i.m25699a(2, new String[]{"content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks"}, new int[]{6, 7, 8, 9, 10, 11}, new int[]{i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N0 = sparseIntArray;
        sparseIntArray.put(z8e.fragmentToolbar, 13);
        sparseIntArray.put(z8e.fragmentBack, 14);
        sparseIntArray.put(z8e.fragmentTitle, 15);
        sparseIntArray.put(z8e.shimmerLayout, 16);
        sparseIntArray.put(z8e.taskOverdueTypes, 17);
        sparseIntArray.put(z8e.taskOverdueTypesGroups, 18);
        sparseIntArray.put(z8e.rvFragmentList, 19);
    }

    public k2h(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 20, M0, N0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.L0 != 0) {
                return true;
            }
            return this.F0.mo16290E() || this.G0.mo16290E() || this.H0.mo16290E() || this.I0.mo16290E() || this.J0.mo16290E() || this.K0.mo16290E() || this.q0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.L0 = 32L;
        }
        this.F0.mo16291G();
        this.G0.mo16291G();
        this.H0.mo16291G();
        this.I0.mo16291G();
        this.J0.mo16291G();
        this.K0.mo16291G();
        this.q0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return n0((f44) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (45 == i) {
            j0(((Boolean) obj).booleanValue());
        } else if (87 == i) {
            l0(((Boolean) obj).booleanValue());
        } else if (95 == i) {
            m0((String) obj);
        } else {
            if (85 != i) {
                return false;
            }
            k0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.j2h
    public void j0(boolean z) {
        this.y0 = z;
    }

    @Override // p001o.j2h
    public void k0(boolean z) {
        this.B0 = z;
        synchronized (this) {
            this.L0 |= 16;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.j2h
    public void l0(boolean z) {
        this.A0 = z;
        synchronized (this) {
            this.L0 |= 4;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.j2h
    public void m0(String str) {
        this.z0 = str;
        synchronized (this) {
            this.L0 |= 8;
        }
        m28509h(95);
        super.m25692R();
    }

    public final boolean n0(f44 f44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.L0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        boolean z;
        boolean zEqualsIgnoreCase;
        boolean zEqualsIgnoreCase2;
        synchronized (this) {
            j = this.L0;
            this.L0 = 0L;
        }
        boolean z2 = this.A0;
        String str = this.z0;
        boolean z3 = this.B0;
        long j2 = j & 40;
        boolean zEqualsIgnoreCase3 = false;
        if (j2 != 0) {
            if (str != null) {
                zEqualsIgnoreCase3 = str.equalsIgnoreCase(this.p0.getResources().getString(hae.expiring_this_week));
                zEqualsIgnoreCase = str.equalsIgnoreCase(this.o0.getResources().getString(hae.expiring_today));
                zEqualsIgnoreCase2 = str.equalsIgnoreCase(this.n0.getResources().getString(hae.all_overdue));
            } else {
                zEqualsIgnoreCase2 = false;
                zEqualsIgnoreCase = false;
            }
            if (j2 != 0) {
                j |= zEqualsIgnoreCase3 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase ? 512L : 256L;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase2 ? 128L : 64L;
            }
            boolean z4 = zEqualsIgnoreCase3;
            zEqualsIgnoreCase3 = zEqualsIgnoreCase2;
            z = z4;
        } else {
            z = false;
            zEqualsIgnoreCase = false;
        }
        long j3 = 48 & j;
        if ((40 & j) != 0) {
            np3.m40895a(this.n0, zEqualsIgnoreCase3);
            np3.m40895a(this.o0, zEqualsIgnoreCase);
            np3.m40895a(this.p0, z);
        }
        if ((j & 36) != 0) {
            this.q0.i0(z2);
        }
        if (j3 != 0) {
            this.q0.h0(z3);
        }
        ewi.m25683r(this.F0);
        ewi.m25683r(this.G0);
        ewi.m25683r(this.H0);
        ewi.m25683r(this.I0);
        ewi.m25683r(this.J0);
        ewi.m25683r(this.K0);
        ewi.m25683r(this.q0);
    }

    public k2h(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (Chip) objArr[3], (Chip) objArr[4], (Chip) objArr[5], (f44) objArr[12], (ShapeableImageView) objArr[14], (MaterialTextView) objArr[15], (MaterialCardView) objArr[13], (RecyclerView) objArr[19], (ShimmerFrameLayout) objArr[16], (HorizontalScrollView) objArr[17], (ChipGroup) objArr[18]);
        this.L0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        m25693Z(this.q0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.C0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.D0 = constraintLayout2;
        constraintLayout2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.E0 = linearLayout;
        linearLayout.setTag(null);
        h54 h54Var = (h54) objArr[6];
        this.F0 = h54Var;
        m25693Z(h54Var);
        h54 h54Var2 = (h54) objArr[7];
        this.G0 = h54Var2;
        m25693Z(h54Var2);
        h54 h54Var3 = (h54) objArr[8];
        this.H0 = h54Var3;
        m25693Z(h54Var3);
        h54 h54Var4 = (h54) objArr[9];
        this.I0 = h54Var4;
        m25693Z(h54Var4);
        h54 h54Var5 = (h54) objArr[10];
        this.J0 = h54Var5;
        m25693Z(h54Var5);
        h54 h54Var6 = (h54) objArr[11];
        this.K0 = h54Var6;
        m25693Z(h54Var6);
        a0(view);
        mo16291G();
    }
}
