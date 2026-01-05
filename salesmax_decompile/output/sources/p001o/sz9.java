package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import lombok.javac.Javac;
import p001o.ewi;

/* loaded from: classes.dex */
public class sz9 extends rz9 {
    public static final ewi.C13274i d1;
    public static final SparseIntArray e1;
    public final ConstraintLayout O0;
    public final LinearLayout P0;
    public final d54 Q0;
    public final d54 R0;
    public final d54 S0;
    public final d54 T0;
    public final d54 U0;
    public final d54 V0;
    public final d54 W0;
    public final d54 X0;
    public final d54 Y0;
    public final d54 Z0;
    public final d54 a1;
    public boolean b1;
    public long c1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(36);
        d1 = c13274i;
        c13274i.m25699a(0, new String[]{"content_no_lna"}, new int[]{26}, new int[]{p9e.content_no_lna});
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(5, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        e1 = sparseIntArray;
        sparseIntArray.put(z8e.fragmentToolbar, 27);
        sparseIntArray.put(z8e.fragmentTitle, 28);
        sparseIntArray.put(z8e.lnaExplanation, 29);
        sparseIntArray.put(z8e.lnaExplanationText, 30);
        sparseIntArray.put(z8e.viewedLnaExplanationButton, 31);
        sparseIntArray.put(z8e.shimmerLayout, 32);
        sparseIntArray.put(z8e.rvFragmentList, 33);
        sparseIntArray.put(z8e.leadsNeedAttentionTypes, 34);
        sparseIntArray.put(z8e.lnaTypeGroup, 35);
    }

    public sz9(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 36, d1, e1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.c1 != 0) {
                return true;
            }
            return this.Q0.mo16290E() || this.T0.mo16290E() || this.U0.mo16290E() || this.V0.mo16290E() || this.W0.mo16290E() || this.X0.mo16290E() || this.Y0.mo16290E() || this.Z0.mo16290E() || this.a1.mo16290E() || this.R0.mo16290E() || this.S0.mo16290E() || this.v0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.c1 = 32L;
        }
        this.Q0.mo16291G();
        this.T0.mo16291G();
        this.U0.mo16291G();
        this.V0.mo16291G();
        this.W0.mo16291G();
        this.X0.mo16291G();
        this.Y0.mo16291G();
        this.Z0.mo16291G();
        this.a1.mo16291G();
        this.R0.mo16291G();
        this.S0.mo16291G();
        this.v0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return q0((r34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (90 == i) {
            p0(((Boolean) obj).booleanValue());
        } else if (85 == i) {
            m0(((Boolean) obj).booleanValue());
        } else if (62 == i) {
            l0((String) obj);
        } else {
            if (87 != i) {
                return false;
            }
            n0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.rz9
    public void l0(String str) {
        this.K0 = str;
        synchronized (this) {
            this.c1 |= 8;
        }
        m28509h(62);
        super.m25692R();
    }

    @Override // p001o.rz9
    public void m0(boolean z) {
        this.M0 = z;
        synchronized (this) {
            this.c1 |= 4;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.rz9
    public void n0(boolean z) {
        this.L0 = z;
        synchronized (this) {
            this.c1 |= 16;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean zEqualsIgnoreCase;
        boolean z3;
        boolean z4;
        boolean zEqualsIgnoreCase2;
        boolean zEqualsIgnoreCase3;
        int i3;
        boolean zEqualsIgnoreCase4;
        boolean zEqualsIgnoreCase5;
        boolean z5;
        boolean zEqualsIgnoreCase6;
        long j2;
        long j3;
        synchronized (this) {
            j = this.c1;
            this.c1 = 0L;
        }
        boolean z6 = this.N0;
        boolean z7 = this.M0;
        String str = this.K0;
        boolean z8 = this.L0;
        long j4 = j & 34;
        boolean zEqualsIgnoreCase7 = false;
        if (j4 != 0) {
            if (j4 != 0) {
                if (z6) {
                    j2 = j | 524288;
                    j3 = 8388608;
                } else {
                    j2 = j | MediaStatus.COMMAND_STREAM_TRANSFER;
                    j3 = 4194304;
                }
                j = j2 | j3;
            }
            i = 8;
            i2 = z6 ? 8 : 0;
            if (z6) {
                i = 0;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        long j5 = j & 40;
        if (j5 != 0) {
            if (str != null) {
                zEqualsIgnoreCase7 = str.equalsIgnoreCase(this.o0.getResources().getString(hae.lna_fresh));
                zEqualsIgnoreCase5 = str.equalsIgnoreCase(this.n0.getResources().getString(hae.lna_unconnected_last));
                boolean zEqualsIgnoreCase8 = str.equalsIgnoreCase(this.t0.getResources().getString(hae.lna_uncontacted));
                zEqualsIgnoreCase = str.equalsIgnoreCase(this.p0.getResources().getString(hae.lna_missed_call));
                zEqualsIgnoreCase2 = str.equalsIgnoreCase(this.u0.getResources().getString(hae.lna_unknown_outcome));
                zEqualsIgnoreCase3 = str.equalsIgnoreCase(this.q0.getResources().getString(hae.lna_negative_outcome));
                z5 = zEqualsIgnoreCase8;
                zEqualsIgnoreCase6 = str.equalsIgnoreCase(this.r0.getResources().getString(hae.lna_pending_followup));
                zEqualsIgnoreCase4 = str.equalsIgnoreCase(this.s0.getResources().getString(hae.lna_positive_outcome));
            } else {
                zEqualsIgnoreCase4 = false;
                zEqualsIgnoreCase = false;
                zEqualsIgnoreCase5 = false;
                zEqualsIgnoreCase2 = false;
                zEqualsIgnoreCase3 = false;
                z5 = false;
                zEqualsIgnoreCase6 = false;
            }
            if (j5 != 0) {
                j |= zEqualsIgnoreCase7 ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase5 ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            if ((j & 40) != 0) {
                j |= z5 ? 2097152L : 1048576L;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase2 ? 128L : 64L;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase3 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase6 ? 512L : 256L;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase4 ? 33554432L : Javac.GENERATED_MEMBER;
            }
            z3 = zEqualsIgnoreCase4;
            z = zEqualsIgnoreCase7;
            z2 = zEqualsIgnoreCase6;
            zEqualsIgnoreCase7 = zEqualsIgnoreCase5;
            z4 = z5;
        } else {
            z = false;
            z2 = false;
            zEqualsIgnoreCase = false;
            z3 = false;
            z4 = false;
            zEqualsIgnoreCase2 = false;
            zEqualsIgnoreCase3 = false;
        }
        long j6 = j & 48;
        if ((j & 40) != 0) {
            i3 = i2;
            np3.m40895a(this.n0, zEqualsIgnoreCase7);
            np3.m40895a(this.o0, z);
            np3.m40895a(this.p0, zEqualsIgnoreCase);
            np3.m40895a(this.q0, zEqualsIgnoreCase3);
            np3.m40895a(this.r0, z2);
            np3.m40895a(this.s0, z3);
            np3.m40895a(this.t0, z4);
            np3.m40895a(this.u0, zEqualsIgnoreCase2);
        } else {
            i3 = i2;
        }
        if ((36 & j) != 0) {
            this.v0.h0(z7);
        }
        if (j6 != 0) {
            this.v0.i0(z8);
        }
        if ((34 & j) != 0) {
            this.w0.setVisibility(i);
            int i4 = i3;
            this.x0.setVisibility(i4);
            this.y0.setVisibility(i4);
            this.B0.setVisibility(i);
            this.D0.setVisibility(i);
        }
        long j7 = j & 32;
        if (j7 != 0) {
            ConstraintLayout constraintLayout = this.O0;
            boolean z9 = this.b1;
            wh1.m54388b(constraintLayout, z9, z9, z9, z9, true, true, true, true);
        }
        if (j7 != 0) {
            this.b1 = true;
        }
        ewi.m25683r(this.Q0);
        ewi.m25683r(this.T0);
        ewi.m25683r(this.U0);
        ewi.m25683r(this.V0);
        ewi.m25683r(this.W0);
        ewi.m25683r(this.X0);
        ewi.m25683r(this.Y0);
        ewi.m25683r(this.Z0);
        ewi.m25683r(this.a1);
        ewi.m25683r(this.R0);
        ewi.m25683r(this.S0);
        ewi.m25683r(this.v0);
    }

    @Override // p001o.rz9
    public void p0(boolean z) {
        this.N0 = z;
        synchronized (this) {
            this.c1 |= 2;
        }
        m28509h(90);
        super.m25692R();
    }

    public final boolean q0(r34 r34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.c1 |= 1;
        }
        return true;
    }

    public sz9(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (Chip) objArr[13], (Chip) objArr[6], (Chip) objArr[12], (Chip) objArr[9], (Chip) objArr[7], (Chip) objArr[8], (Chip) objArr[11], (Chip) objArr[10], (r34) objArr[26], (ShapeableImageView) objArr[3], (FloatingActionButton) objArr[14], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[28], (MaterialCardView) objArr[27], (MaterialTextView) objArr[4], (HorizontalScrollView) objArr[34], (LinearLayout) objArr[2], (MaterialCardView) objArr[29], (MaterialTextView) objArr[30], (ChipGroup) objArr[35], (RecyclerView) objArr[33], (ShimmerFrameLayout) objArr[32], (MaterialButton) objArr[31]);
        this.c1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        m25693Z(this.v0);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.B0.setTag(null);
        this.D0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[5];
        this.P0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[15];
        this.Q0 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[24];
        this.R0 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[25];
        this.S0 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[16];
        this.T0 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[17];
        this.U0 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[18];
        this.V0 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[19];
        this.W0 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[20];
        this.X0 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[21];
        this.Y0 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[22];
        this.Z0 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[23];
        this.a1 = d54Var11;
        m25693Z(d54Var11);
        a0(view);
        mo16291G();
    }
}
