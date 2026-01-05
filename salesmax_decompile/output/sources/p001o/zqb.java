package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.textfield.TextInputLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class zqb extends yqb {
    public static final ewi.C13274i L0;
    public static final SparseIntArray M0;
    public final ConstraintLayout D0;
    public final LinearLayout E0;
    public final h54 F0;
    public final h54 G0;
    public final h54 H0;
    public final h54 I0;
    public final h54 J0;
    public long K0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(17);
        L0 = c13274i;
        c13274i.m25699a(0, new String[]{"content_no_team", "content_no_tasks", "content_no_task_search_filter", "item_no_internet"}, new int[]{7, 8, 9, 10}, new int[]{p9e.content_no_team, p9e.content_no_tasks, p9e.content_no_task_search_filter, p9e.item_no_internet});
        int i = p9e.content_shimmer_tasks;
        c13274i.m25699a(1, new String[]{"content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks", "content_shimmer_tasks"}, new int[]{2, 3, 4, 5, 6}, new int[]{i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M0 = sparseIntArray;
        sparseIntArray.put(z8e.rvTeamsList, 11);
        sparseIntArray.put(z8e.shimmerLayout, 12);
        sparseIntArray.put(z8e.rvTasksList, 13);
        sparseIntArray.put(z8e.rvTaskCategoryList, 14);
        sparseIntArray.put(z8e.taskTypeContainer, 15);
        sparseIntArray.put(z8e.taskTypeSpinner, 16);
    }

    public zqb(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 17, L0, M0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.K0 != 0) {
                return true;
            }
            return this.F0.mo16290E() || this.G0.mo16290E() || this.H0.mo16290E() || this.I0.mo16290E() || this.J0.mo16290E() || this.q0.mo16290E() || this.o0.mo16290E() || this.p0.mo16290E() || this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.K0 = MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
        }
        this.F0.mo16291G();
        this.G0.mo16291G();
        this.H0.mo16291G();
        this.I0.mo16291G();
        this.J0.mo16291G();
        this.q0.mo16291G();
        this.o0.mo16291G();
        this.p0.mo16291G();
        this.n0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return p0((n19) obj, i2);
        }
        if (i == 1) {
            return s0((d44) obj, i2);
        }
        if (i == 2) {
            return t0((h44) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return q0((f44) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (90 == i) {
            n0(((Boolean) obj).booleanValue());
        } else if (45 == i) {
            u0(((Boolean) obj).booleanValue());
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

    @Override // p001o.yqb
    public void j0(boolean z) {
        this.A0 = z;
        synchronized (this) {
            this.K0 |= 256;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.yqb
    public void k0(boolean z) {
        this.C0 = z;
        synchronized (this) {
            this.K0 |= 512;
        }
        m28509h(86);
        super.m25692R();
    }

    @Override // p001o.yqb
    public void l0(boolean z) {
        this.z0 = z;
        synchronized (this) {
            this.K0 |= 128;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.yqb
    public void m0(boolean z) {
        this.B0 = z;
        synchronized (this) {
            this.K0 |= 64;
        }
        m28509h(89);
        super.m25692R();
    }

    @Override // p001o.yqb
    public void n0(boolean z) {
        this.y0 = z;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.K0;
            this.K0 = 0L;
        }
        boolean z = this.B0;
        boolean z2 = this.z0;
        boolean z3 = this.A0;
        boolean z4 = this.C0;
        long j2 = 1088 & j;
        long j3 = 1152 & j;
        long j4 = 1280 & j;
        long j5 = j & 1536;
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
        ewi.m25683r(this.F0);
        ewi.m25683r(this.G0);
        ewi.m25683r(this.H0);
        ewi.m25683r(this.I0);
        ewi.m25683r(this.J0);
        ewi.m25683r(this.q0);
        ewi.m25683r(this.o0);
        ewi.m25683r(this.p0);
        ewi.m25683r(this.n0);
    }

    public final boolean p0(n19 n19Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.K0 |= 1;
        }
        return true;
    }

    public final boolean q0(f44 f44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.K0 |= 8;
        }
        return true;
    }

    public final boolean s0(d44 d44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.K0 |= 2;
        }
        return true;
    }

    public final boolean t0(h44 h44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.K0 |= 4;
        }
        return true;
    }

    public void u0(boolean z) {
        this.x0 = z;
    }

    public zqb(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 4, (n19) objArr[10], (f44) objArr[8], (d44) objArr[9], (h44) objArr[7], (RecyclerView) objArr[14], (RecyclerView) objArr[13], (RecyclerView) objArr[11], (ShimmerFrameLayout) objArr[12], (TextInputLayout) objArr[15], (AutoCompleteTextView) objArr[16]);
        this.K0 = -1L;
        m25693Z(this.n0);
        m25693Z(this.o0);
        m25693Z(this.p0);
        m25693Z(this.q0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.E0 = linearLayout;
        linearLayout.setTag(null);
        h54 h54Var = (h54) objArr[2];
        this.F0 = h54Var;
        m25693Z(h54Var);
        h54 h54Var2 = (h54) objArr[3];
        this.G0 = h54Var2;
        m25693Z(h54Var2);
        h54 h54Var3 = (h54) objArr[4];
        this.H0 = h54Var3;
        m25693Z(h54Var3);
        h54 h54Var4 = (h54) objArr[5];
        this.I0 = h54Var4;
        m25693Z(h54Var4);
        h54 h54Var5 = (h54) objArr[6];
        this.J0 = h54Var5;
        m25693Z(h54Var5);
        a0(view);
        mo16291G();
    }
}
