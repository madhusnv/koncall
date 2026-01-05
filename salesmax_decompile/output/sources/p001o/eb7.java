package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class eb7 extends db7 {
    public static final ewi.C13274i f1;
    public static final SparseIntArray g1;
    public final ConstraintLayout Q0;
    public final LinearLayout R0;
    public final d54 S0;
    public final d54 T0;
    public final d54 U0;
    public final d54 V0;
    public final d54 W0;
    public final d54 X0;
    public final d54 Y0;
    public final d54 Z0;
    public final d54 a1;
    public final d54 b1;
    public final d54 c1;
    public boolean d1;
    public long e1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(38);
        f1 = c13274i;
        c13274i.m25699a(0, new String[]{"content_no_lna"}, new int[]{27}, new int[]{p9e.content_no_lna});
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(14, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        g1 = sparseIntArray;
        sparseIntArray.put(z8e.fragmentToolbar, 28);
        sparseIntArray.put(z8e.fragmentBack, 29);
        sparseIntArray.put(z8e.newLeadsSourceTypes, 30);
        sparseIntArray.put(z8e.lnaTypeGroup, 31);
        sparseIntArray.put(z8e.closePic, 32);
        sparseIntArray.put(z8e.shimmerLayout, 33);
        sparseIntArray.put(z8e.swipeRefreshLayout, 34);
        sparseIntArray.put(z8e.rvFragmentList, 35);
        sparseIntArray.put(z8e.taskCommentTextInputLayout, 36);
        sparseIntArray.put(z8e.taskCommentEditText, 37);
    }

    public eb7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 38, f1, g1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.e1 != 0) {
                return true;
            }
            return this.S0.mo16290E() || this.V0.mo16290E() || this.W0.mo16290E() || this.X0.mo16290E() || this.Z0.mo16290E() || this.Y0.mo16290E() || this.a1.mo16290E() || this.b1.mo16290E() || this.c1.mo16290E() || this.T0.mo16290E() || this.U0.mo16290E() || this.w0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.e1 = 32L;
        }
        this.S0.mo16291G();
        this.V0.mo16291G();
        this.W0.mo16291G();
        this.X0.mo16291G();
        this.Z0.mo16291G();
        this.Y0.mo16291G();
        this.a1.mo16291G();
        this.b1.mo16291G();
        this.c1.mo16291G();
        this.T0.mo16291G();
        this.U0.mo16291G();
        this.w0.mo16291G();
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

    @Override // p001o.db7
    public void l0(String str) {
        this.M0 = str;
        synchronized (this) {
            this.e1 |= 8;
        }
        m28509h(62);
        super.m25692R();
    }

    @Override // p001o.db7
    public void m0(boolean z) {
        this.O0 = z;
        synchronized (this) {
            this.e1 |= 4;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.db7
    public void n0(boolean z) {
        this.N0 = z;
        synchronized (this) {
            this.e1 |= 16;
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
        boolean zEqualsIgnoreCase;
        boolean zEqualsIgnoreCase2;
        boolean zEqualsIgnoreCase3;
        boolean zEqualsIgnoreCase4;
        boolean zEqualsIgnoreCase5;
        long j2;
        long j3;
        synchronized (this) {
            j = this.e1;
            this.e1 = 0L;
        }
        boolean z2 = this.P0;
        boolean z3 = this.O0;
        String str = this.M0;
        boolean z4 = this.N0;
        long j4 = j & 34;
        boolean zEqualsIgnoreCase6 = false;
        if (j4 != 0) {
            if (j4 != 0) {
                if (z2) {
                    j2 = j | MediaStatus.COMMAND_UNFOLLOW;
                    j3 = 524288;
                } else {
                    j2 = j | MediaStatus.COMMAND_FOLLOW;
                    j3 = MediaStatus.COMMAND_STREAM_TRANSFER;
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
        long j5 = j & 40;
        if (j5 != 0) {
            if (str != null) {
                zEqualsIgnoreCase6 = str.equalsIgnoreCase(this.s0.getResources().getString(hae.prospecting_followups));
                zEqualsIgnoreCase3 = str.equalsIgnoreCase(this.u0.getResources().getString(hae.video_meetings));
                zEqualsIgnoreCase = str.equalsIgnoreCase(this.q0.getResources().getString(hae.expiring_soon));
                zEqualsIgnoreCase2 = str.equalsIgnoreCase(this.r0.getResources().getString(hae.deal_followups));
                zEqualsIgnoreCase5 = str.equalsIgnoreCase(this.p0.getResources().getString(hae.client_calls_missed));
                zEqualsIgnoreCase4 = str.equalsIgnoreCase(this.t0.getResources().getString(hae.task_category));
            } else {
                zEqualsIgnoreCase = false;
                zEqualsIgnoreCase2 = false;
                zEqualsIgnoreCase3 = false;
                zEqualsIgnoreCase5 = false;
                zEqualsIgnoreCase4 = false;
            }
            if (j5 != 0) {
                j |= zEqualsIgnoreCase6 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase3 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase ? 512L : 256L;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase2 ? 128L : 64L;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase5 ? 2097152L : 1048576L;
            }
            if ((j & 40) != 0) {
                j |= zEqualsIgnoreCase4 ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            z = zEqualsIgnoreCase6;
            zEqualsIgnoreCase6 = zEqualsIgnoreCase5;
        } else {
            z = false;
            zEqualsIgnoreCase = false;
            zEqualsIgnoreCase2 = false;
            zEqualsIgnoreCase3 = false;
            zEqualsIgnoreCase4 = false;
        }
        long j6 = j & 48;
        if ((34 & j) != 0) {
            this.n0.setVisibility(i);
            this.o0.setVisibility(i);
            this.x0.setVisibility(i);
            this.y0.setVisibility(i);
            this.z0.setVisibility(i2);
            this.C0.setVisibility(i);
            this.D0.setVisibility(i);
            this.H0.setVisibility(i);
        }
        if ((40 & j) != 0) {
            np3.m40895a(this.p0, zEqualsIgnoreCase6);
            np3.m40895a(this.q0, zEqualsIgnoreCase);
            np3.m40895a(this.r0, zEqualsIgnoreCase2);
            nr1.y1(this.s0, str);
            np3.m40895a(this.s0, z);
            np3.m40895a(this.t0, zEqualsIgnoreCase4);
            np3.m40895a(this.u0, zEqualsIgnoreCase3);
        }
        if ((36 & j) != 0) {
            this.w0.h0(z3);
        }
        if (j6 != 0) {
            this.w0.i0(z4);
        }
        long j7 = j & 32;
        if (j7 != 0) {
            ConstraintLayout constraintLayout = this.Q0;
            boolean z5 = this.d1;
            wh1.m54388b(constraintLayout, z5, z5, z5, z5, true, true, true, true);
        }
        if (j7 != 0) {
            this.d1 = true;
        }
        ewi.m25683r(this.S0);
        ewi.m25683r(this.V0);
        ewi.m25683r(this.W0);
        ewi.m25683r(this.X0);
        ewi.m25683r(this.Z0);
        ewi.m25683r(this.Y0);
        ewi.m25683r(this.a1);
        ewi.m25683r(this.b1);
        ewi.m25683r(this.c1);
        ewi.m25683r(this.T0);
        ewi.m25683r(this.U0);
        ewi.m25683r(this.w0);
    }

    @Override // p001o.db7
    public void p0(boolean z) {
        this.P0 = z;
        synchronized (this) {
            this.e1 |= 2;
        }
        m28509h(90);
        super.m25692R();
    }

    public final boolean q0(r34 r34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.e1 |= 1;
        }
        return true;
    }

    public eb7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (MaterialButton) objArr[10], (MaterialButton) objArr[12], (Chip) objArr[2], (Chip) objArr[6], (Chip) objArr[4], (Chip) objArr[1], (Chip) objArr[3], (Chip) objArr[5], (MaterialButton) objArr[32], (r34) objArr[27], (MaterialButton) objArr[13], (ShapeableImageView) objArr[8], (FloatingActionButton) objArr[15], (ShapeableImageView) objArr[29], (ConstraintLayout) objArr[28], (MaterialTextView) objArr[9], (LinearLayout) objArr[7], (ChipGroup) objArr[31], (HorizontalScrollView) objArr[30], (RecyclerView) objArr[35], (MaterialButton) objArr[11], (ShimmerFrameLayout) objArr[33], (SwipeRefreshLayout) objArr[34], (TextInputEditText) objArr[37], (TextInputLayout) objArr[36]);
        this.e1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        m25693Z(this.w0);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[14];
        this.R0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[16];
        this.S0 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[25];
        this.T0 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[26];
        this.U0 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[17];
        this.V0 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[18];
        this.W0 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[19];
        this.X0 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[21];
        this.Y0 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[20];
        this.Z0 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[22];
        this.a1 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[23];
        this.b1 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[24];
        this.c1 = d54Var11;
        m25693Z(d54Var11);
        this.H0.setTag(null);
        a0(view);
        mo16291G();
    }
}
