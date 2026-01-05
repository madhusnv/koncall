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
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import lombok.javac.Javac;
import p001o.ewi;

/* loaded from: classes.dex */
public class ryb extends qyb {
    public static final ewi.C13274i n1;
    public static final SparseIntArray o1;
    public final ConstraintLayout Y0;
    public final LinearLayout Z0;
    public final d54 a1;
    public final d54 b1;
    public final d54 c1;
    public final d54 d1;
    public final d54 e1;
    public final d54 f1;
    public final d54 g1;
    public final d54 h1;
    public final d54 i1;
    public final d54 j1;
    public final d54 k1;
    public boolean l1;
    public long m1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(43);
        n1 = c13274i;
        c13274i.m25699a(0, new String[]{"content_no_lna", "content_no_lead_search_filter"}, new int[]{29, 30}, new int[]{p9e.content_no_lna, p9e.content_no_lead_search_filter});
        int i = p9e.content_shimmer_leads;
        c13274i.m25699a(10, new String[]{"content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads", "content_shimmer_leads"}, new int[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28}, new int[]{i, i, i, i, i, i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        o1 = sparseIntArray;
        sparseIntArray.put(z8e.fragmentToolbar, 31);
        sparseIntArray.put(z8e.searchLeadsEditTextLayout, 32);
        sparseIntArray.put(z8e.searchLeadsEditText, 33);
        sparseIntArray.put(z8e.fragmentTitle, 34);
        sparseIntArray.put(z8e.fragmentFilter, 35);
        sparseIntArray.put(z8e.leadsFilter_badge, 36);
        sparseIntArray.put(z8e.deletePic, 37);
        sparseIntArray.put(z8e.shimmerLayout, 38);
        sparseIntArray.put(z8e.swipeRefreshLayout, 39);
        sparseIntArray.put(z8e.rvFragmentList, 40);
        sparseIntArray.put(z8e.newLeadsSourceTypes, 41);
        sparseIntArray.put(z8e.lnaTypeGroup, 42);
    }

    public ryb(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 43, n1, o1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.m1 != 0) {
                return true;
            }
            return this.a1.mo16290E() || this.d1.mo16290E() || this.e1.mo16290E() || this.f1.mo16290E() || this.g1.mo16290E() || this.h1.mo16290E() || this.i1.mo16290E() || this.j1.mo16290E() || this.k1.mo16290E() || this.b1.mo16290E() || this.c1.mo16290E() || this.w0.mo16290E() || this.x0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.m1 = 512L;
        }
        this.a1.mo16291G();
        this.d1.mo16291G();
        this.e1.mo16291G();
        this.f1.mo16291G();
        this.g1.mo16291G();
        this.h1.mo16291G();
        this.i1.mo16291G();
        this.j1.mo16291G();
        this.k1.mo16291G();
        this.b1.mo16291G();
        this.c1.mo16291G();
        this.w0.mo16291G();
        this.x0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return v0((p34) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return u0((r34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (90 == i) {
            t0(((Boolean) obj).booleanValue());
        } else if (85 == i) {
            p0(((Boolean) obj).booleanValue());
        } else if (54 == i) {
            m0((Boolean) obj);
        } else if (62 == i) {
            n0((String) obj);
        } else if (47 == i) {
            l0((Boolean) obj);
        } else if (87 == i) {
            s0(((Boolean) obj).booleanValue());
        } else {
            if (86 != i) {
                return false;
            }
            q0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.qyb
    public void l0(Boolean bool) {
        this.X0 = bool;
        synchronized (this) {
            this.m1 |= 64;
        }
        m28509h(47);
        super.m25692R();
    }

    @Override // p001o.qyb
    public void m0(Boolean bool) {
        this.W0 = bool;
        synchronized (this) {
            this.m1 |= 16;
        }
        m28509h(54);
        super.m25692R();
    }

    @Override // p001o.qyb
    public void n0(String str) {
        this.R0 = str;
        synchronized (this) {
            this.m1 |= 32;
        }
        m28509h(62);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[PHI: r2
      0x0068: PHI (r2v2 long) = (r2v1 long), (r2v22 long) binds: [B:21:0x0050, B:28:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zEqualsIgnoreCase;
        boolean zEqualsIgnoreCase2;
        boolean z4;
        boolean z5;
        boolean zEqualsIgnoreCase3;
        long j2;
        long j3;
        synchronized (this) {
            j = this.m1;
            this.m1 = 0L;
        }
        boolean z6 = this.V0;
        boolean z7 = this.U0;
        Boolean bool = this.W0;
        String str = this.R0;
        Boolean bool2 = this.X0;
        boolean z8 = this.S0;
        boolean z9 = this.T0;
        long j4 = j & 516;
        int i4 = 0;
        if (j4 != 0) {
            if (j4 != 0) {
                if (z6) {
                    j2 = j | MediaStatus.COMMAND_DISLIKE;
                    j3 = 33554432;
                } else {
                    j2 = j | MediaStatus.COMMAND_LIKE;
                    j3 = Javac.GENERATED_MEMBER;
                }
                j = j2 | j3;
            }
            i2 = z6 ? 8 : 0;
            i = z6 ? 0 : 8;
        } else {
            i = 0;
            i2 = 0;
        }
        long j5 = j & 528;
        if (j5 != 0) {
            boolean zM25676W = ewi.m25676W(bool);
            if (j5 != 0) {
                j |= zM25676W ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            i3 = zM25676W ? 8 : 0;
        }
        long j6 = j & 544;
        if (j6 != 0) {
            if (str != null) {
                zEqualsIgnoreCase = str.equalsIgnoreCase(this.s0.getResources().getString(hae.indiamart));
                zEqualsIgnoreCase2 = str.equalsIgnoreCase(this.u0.getResources().getString(hae.contact_form));
                boolean zEqualsIgnoreCase4 = str.equalsIgnoreCase(this.t0.getResources().getString(hae.unassigned));
                boolean zEqualsIgnoreCase5 = str.equalsIgnoreCase(this.q0.getResources().getString(hae.assigned_today));
                zEqualsIgnoreCase3 = str.equalsIgnoreCase(this.r0.getResources().getString(hae.facebook));
                boolean zEqualsIgnoreCase6 = str.equalsIgnoreCase(this.p0.getResources().getString(hae.all));
                z3 = zEqualsIgnoreCase5;
                z2 = zEqualsIgnoreCase6;
                z = zEqualsIgnoreCase4;
            } else {
                z = false;
                z2 = false;
                z3 = false;
                zEqualsIgnoreCase = false;
                zEqualsIgnoreCase2 = false;
                zEqualsIgnoreCase3 = false;
            }
            if (j6 != 0) {
                j |= zEqualsIgnoreCase ? 2097152L : 1048576L;
            }
            if ((j & 544) != 0) {
                j |= zEqualsIgnoreCase2 ? 134217728L : 67108864L;
            }
            if ((j & 544) != 0) {
                j |= z ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            if ((j & 544) != 0) {
                j |= z3 ? 8388608L : 4194304L;
            }
            if ((j & 544) != 0) {
                j |= zEqualsIgnoreCase3 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 544) != 0) {
                j |= z2 ? 536870912L : 268435456L;
            }
            z4 = zEqualsIgnoreCase3;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            zEqualsIgnoreCase = false;
            zEqualsIgnoreCase2 = false;
            z4 = false;
        }
        long j7 = j & 576;
        if (j7 != 0) {
            boolean zM25676W2 = ewi.m25676W(bool2);
            if (j7 != 0) {
                j |= zM25676W2 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if (zM25676W2) {
                i4 = 8;
            }
        }
        int i5 = i4;
        long j8 = j & 640;
        long j9 = j & 768;
        if ((j & 516) != 0) {
            z5 = z9;
            this.n0.setVisibility(i);
            this.o0.setVisibility(i);
            this.v0.setVisibility(i);
            this.z0.setVisibility(i);
            this.A0.setVisibility(i2);
            this.B0.setVisibility(i2);
            this.F0.setVisibility(i);
            this.G0.setVisibility(i2);
            this.I0.setVisibility(i);
            this.O0.setVisibility(i);
        } else {
            z5 = z9;
        }
        if ((j & 544) != 0) {
            np3.m40895a(this.p0, z2);
            np3.m40895a(this.q0, z3);
            np3.m40895a(this.r0, z4);
            np3.m40895a(this.s0, zEqualsIgnoreCase);
            np3.m40895a(this.t0, z);
            np3.m40895a(this.u0, zEqualsIgnoreCase2);
        }
        if ((j & 576) != 0) {
            this.r0.setVisibility(i5);
            this.s0.setVisibility(i5);
            this.u0.setVisibility(i5);
        }
        if ((j & 528) != 0) {
            this.t0.setVisibility(i3);
        }
        if ((520 & j) != 0) {
            this.w0.h0(z7);
            this.x0.h0(z7);
        }
        if (j8 != 0) {
            this.w0.i0(z8);
        }
        if (j9 != 0) {
            this.x0.i0(z5);
        }
        long j10 = j & 512;
        if (j10 != 0) {
            ConstraintLayout constraintLayout = this.Y0;
            boolean z10 = this.l1;
            wh1.m54388b(constraintLayout, z10, z10, z10, z10, true, true, true, true);
        }
        if (j10 != 0) {
            this.l1 = true;
        }
        ewi.m25683r(this.a1);
        ewi.m25683r(this.d1);
        ewi.m25683r(this.e1);
        ewi.m25683r(this.f1);
        ewi.m25683r(this.g1);
        ewi.m25683r(this.h1);
        ewi.m25683r(this.i1);
        ewi.m25683r(this.j1);
        ewi.m25683r(this.k1);
        ewi.m25683r(this.b1);
        ewi.m25683r(this.c1);
        ewi.m25683r(this.w0);
        ewi.m25683r(this.x0);
    }

    @Override // p001o.qyb
    public void p0(boolean z) {
        this.U0 = z;
        synchronized (this) {
            this.m1 |= 8;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.qyb
    public void q0(boolean z) {
        this.T0 = z;
        synchronized (this) {
            this.m1 |= 256;
        }
        m28509h(86);
        super.m25692R();
    }

    @Override // p001o.qyb
    public void s0(boolean z) {
        this.S0 = z;
        synchronized (this) {
            this.m1 |= 128;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.qyb
    public void t0(boolean z) {
        this.V0 = z;
        synchronized (this) {
            this.m1 |= 4;
        }
        m28509h(90);
        super.m25692R();
    }

    public final boolean u0(r34 r34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.m1 |= 2;
        }
        return true;
    }

    public final boolean v0(p34 p34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.m1 |= 1;
        }
        return true;
    }

    public ryb(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (MaterialButton) objArr[6], (MaterialButton) objArr[8], (Chip) objArr[11], (Chip) objArr[12], (Chip) objArr[14], (Chip) objArr[15], (Chip) objArr[13], (Chip) objArr[16], (MaterialButton) objArr[9], (r34) objArr[29], (p34) objArr[30], (MaterialButton) objArr[37], (ShapeableImageView) objArr[4], (FloatingActionButton) objArr[17], (ShapeableImageView) objArr[1], (FrameLayout) objArr[35], (MaterialTextView) objArr[34], (ConstraintLayout) objArr[31], (MaterialTextView) objArr[5], (ShapeableImageView) objArr[2], (TextView) objArr[36], (LinearLayout) objArr[3], (ChipGroup) objArr[42], (HorizontalScrollView) objArr[41], (RecyclerView) objArr[40], (TextInputEditText) objArr[33], (TextInputLayout) objArr[32], (MaterialButton) objArr[7], (ShimmerFrameLayout) objArr[38], (SwipeRefreshLayout) objArr[39]);
        this.m1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        m25693Z(this.w0);
        m25693Z(this.x0);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.F0.setTag(null);
        this.G0.setTag(null);
        this.I0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Y0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[10];
        this.Z0 = linearLayout;
        linearLayout.setTag(null);
        d54 d54Var = (d54) objArr[18];
        this.a1 = d54Var;
        m25693Z(d54Var);
        d54 d54Var2 = (d54) objArr[27];
        this.b1 = d54Var2;
        m25693Z(d54Var2);
        d54 d54Var3 = (d54) objArr[28];
        this.c1 = d54Var3;
        m25693Z(d54Var3);
        d54 d54Var4 = (d54) objArr[19];
        this.d1 = d54Var4;
        m25693Z(d54Var4);
        d54 d54Var5 = (d54) objArr[20];
        this.e1 = d54Var5;
        m25693Z(d54Var5);
        d54 d54Var6 = (d54) objArr[21];
        this.f1 = d54Var6;
        m25693Z(d54Var6);
        d54 d54Var7 = (d54) objArr[22];
        this.g1 = d54Var7;
        m25693Z(d54Var7);
        d54 d54Var8 = (d54) objArr[23];
        this.h1 = d54Var8;
        m25693Z(d54Var8);
        d54 d54Var9 = (d54) objArr[24];
        this.i1 = d54Var9;
        m25693Z(d54Var9);
        d54 d54Var10 = (d54) objArr[25];
        this.j1 = d54Var10;
        m25693Z(d54Var10);
        d54 d54Var11 = (d54) objArr[26];
        this.k1 = d54Var11;
        m25693Z(d54Var11);
        this.O0.setTag(null);
        a0(view);
        mo16291G();
    }
}
