package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class q2d extends p2d {
    public static final ewi.C13274i b1;
    public static final SparseIntArray c1;
    public final ConstraintLayout M0;
    public final LinearLayout N0;
    public final d54 O0;
    public final d54 P0;
    public final d54 Q0;
    public final d54 R0;
    public final d54 S0;
    public final d54 T0;
    public final d54 U0;
    public final d54 V0;
    public final d54 W0;
    public final d54 X0;
    public final d54 Y0;
    public boolean Z0;
    public long a1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(33);
        b1 = c13274i;
        c13274i.m25699a(0, new String[]{"content_no_payment"}, new int[]{22}, new int[]{p9e.content_no_payment});
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(6, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        c1 = sparseIntArray;
        sparseIntArray.put(z8e.fragmentToolbar, 23);
        sparseIntArray.put(z8e.fragmentTitle, 24);
        sparseIntArray.put(z8e.fragmentFilter, 25);
        sparseIntArray.put(z8e.leadsFilter_badge, 26);
        sparseIntArray.put(z8e.shimmerLayout, 27);
        sparseIntArray.put(z8e.swipeRefreshLayout, 28);
        sparseIntArray.put(z8e.rvFragmentList, 29);
        sparseIntArray.put(z8e.paymentStatusBlock, 30);
        sparseIntArray.put(z8e.paymentStatusButtons, 31);
        sparseIntArray.put(z8e.viewAllPayments, 32);
    }

    public q2d(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 33, b1, c1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.a1 != 0) {
                return true;
            }
            return this.O0.mo16290E() || this.R0.mo16290E() || this.S0.mo16290E() || this.T0.mo16290E() || this.U0.mo16290E() || this.V0.mo16290E() || this.W0.mo16290E() || this.X0.mo16290E() || this.Y0.mo16290E() || this.P0.mo16290E() || this.Q0.mo16290E() || this.r0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.a1 = 64L;
        }
        this.O0.mo16291G();
        this.R0.mo16291G();
        this.S0.mo16291G();
        this.T0.mo16291G();
        this.U0.mo16291G();
        this.V0.mo16291G();
        this.W0.mo16291G();
        this.X0.mo16291G();
        this.Y0.mo16291G();
        this.P0.mo16291G();
        this.Q0.mo16291G();
        this.r0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return n0((z34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (90 == i) {
            m0(((Boolean) obj).booleanValue());
        } else if (62 == i) {
            j0((String) obj);
        } else if (87 == i) {
            l0(((Boolean) obj).booleanValue());
        } else if (85 == i) {
            k0(((Boolean) obj).booleanValue());
        } else {
            if (54 != i) {
                return false;
            }
            p0((Boolean) obj);
        }
        return true;
    }

    @Override // p001o.p2d
    public void j0(String str) {
        this.H0 = str;
        synchronized (this) {
            this.a1 |= 4;
        }
        m28509h(62);
        super.m25692R();
    }

    @Override // p001o.p2d
    public void k0(boolean z) {
        this.J0 = z;
        synchronized (this) {
            this.a1 |= 16;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.p2d
    public void l0(boolean z) {
        this.I0 = z;
        synchronized (this) {
            this.a1 |= 8;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.p2d
    public void m0(boolean z) {
        this.K0 = z;
        synchronized (this) {
            this.a1 |= 2;
        }
        m28509h(90);
        super.m25692R();
    }

    public final boolean n0(z34 z34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.a1 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        boolean z;
        boolean zEqualsIgnoreCase;
        boolean zEqualsIgnoreCase2;
        boolean zEqualsIgnoreCase3;
        long j2;
        long j3;
        synchronized (this) {
            j = this.a1;
            this.a1 = 0L;
        }
        boolean z2 = this.K0;
        String str = this.H0;
        boolean z3 = this.I0;
        boolean z4 = this.J0;
        long j4 = j & 66;
        boolean zEqualsIgnoreCase4 = false;
        if (j4 != 0) {
            if (j4 != 0) {
                if (z2) {
                    j2 = j | MediaStatus.COMMAND_LIKE;
                    j3 = MediaStatus.COMMAND_STREAM_TRANSFER;
                } else {
                    j2 = j | MediaStatus.COMMAND_PLAYBACK_RATE;
                    j3 = MediaStatus.COMMAND_UNFOLLOW;
                }
                j = j2 | j3;
            }
            i = 8;
            i2 = z2 ? 8 : 0;
            if (z2) {
                i = 0;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        long j5 = j & 68;
        if (j5 != 0) {
            if (str != null) {
                zEqualsIgnoreCase4 = str.equalsIgnoreCase(this.p0.getResources().getString(hae.payment_cancelled));
                zEqualsIgnoreCase2 = str.equalsIgnoreCase(this.o0.getResources().getString(hae.payment_paid));
                zEqualsIgnoreCase = str.equalsIgnoreCase(this.q0.getResources().getString(hae.payment_requested));
                zEqualsIgnoreCase3 = str.equalsIgnoreCase(this.n0.getResources().getString(hae.payment_partially_paid));
            } else {
                zEqualsIgnoreCase = false;
                zEqualsIgnoreCase3 = false;
                zEqualsIgnoreCase2 = false;
            }
            if (j5 != 0) {
                j |= zEqualsIgnoreCase4 ? 256L : 128L;
            }
            if ((j & 68) != 0) {
                j |= zEqualsIgnoreCase2 ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
            }
            if ((j & 68) != 0) {
                j |= zEqualsIgnoreCase ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            if ((j & 68) != 0) {
                j |= zEqualsIgnoreCase3 ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            z = zEqualsIgnoreCase4;
            zEqualsIgnoreCase4 = zEqualsIgnoreCase3;
        } else {
            z = false;
            zEqualsIgnoreCase = false;
            zEqualsIgnoreCase2 = false;
        }
        long j6 = 72 & j;
        long j7 = j & 80;
        if ((68 & j) != 0) {
            np3.m40895a(this.n0, zEqualsIgnoreCase4);
            np3.m40895a(this.o0, zEqualsIgnoreCase2);
            np3.m40895a(this.p0, z);
            np3.m40895a(this.q0, zEqualsIgnoreCase);
        }
        if (j7 != 0) {
            this.r0.h0(z4);
        }
        if (j6 != 0) {
            this.r0.i0(z3);
        }
        if ((66 & j) != 0) {
            this.s0.setVisibility(i);
            this.t0.setVisibility(i2);
            this.x0.setVisibility(i);
            this.y0.setVisibility(i2);
            this.A0.setVisibility(i);
        }
        long j8 = j & 64;
        if (j8 != 0) {
            ConstraintLayout constraintLayout = this.M0;
            boolean z5 = this.Z0;
            wh1.m54388b(constraintLayout, z5, z5, z5, z5, true, true, true, true);
        }
        if (j8 != 0) {
            this.Z0 = true;
        }
        ewi.m25683r(this.O0);
        ewi.m25683r(this.R0);
        ewi.m25683r(this.S0);
        ewi.m25683r(this.T0);
        ewi.m25683r(this.U0);
        ewi.m25683r(this.V0);
        ewi.m25683r(this.W0);
        ewi.m25683r(this.X0);
        ewi.m25683r(this.Y0);
        ewi.m25683r(this.P0);
        ewi.m25683r(this.Q0);
        ewi.m25683r(this.r0);
    }

    public void p0(Boolean bool) {
        this.L0 = bool;
    }

    public q2d(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (Chip) objArr[9], (Chip) objArr[8], (Chip) objArr[10], (Chip) objArr[7], (z34) objArr[22], (ShapeableImageView) objArr[4], (ShapeableImageView) objArr[1], (FrameLayout) objArr[25], (MaterialTextView) objArr[24], (ConstraintLayout) objArr[23], (MaterialTextView) objArr[5], (ShapeableImageView) objArr[2], (TextView) objArr[26], (LinearLayout) objArr[3], (HorizontalScrollView) objArr[30], (ChipGroup) objArr[31], (RecyclerView) objArr[29], (ShimmerFrameLayout) objArr[27], (SwipeRefreshLayout) objArr[28], (MaterialTextView) objArr[32]);
        this.a1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        m25693Z(this.r0);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.A0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[6];
        this.N0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[11];
        this.O0 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[20];
        this.P0 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[21];
        this.Q0 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[12];
        this.R0 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[13];
        this.S0 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[14];
        this.T0 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[15];
        this.U0 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[16];
        this.V0 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[17];
        this.W0 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[18];
        this.X0 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[19];
        this.Y0 = d54Var11;
        m25693Z(d54Var11);
        a0(view);
        mo16291G();
    }
}
