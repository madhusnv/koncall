package p001o;

import ai.salesmax.model.AutoCompleteListModel;
import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class io extends ho {
    public static final ewi.C13274i Q0;
    public static final SparseIntArray R0;
    public final NestedScrollView G0;
    public final ConstraintLayout H0;
    public final LinearLayout I0;
    public final t44 J0;
    public final t44 K0;
    public final t44 L0;
    public final t44 M0;
    public final t44 N0;
    public final t44 O0;
    public long P0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(21);
        Q0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_no_activity"}, new int[]{14}, new int[]{p9e.content_no_activity});
        int i = p9e.content_shimmer_activities;
        c13274i.m25699a(2, new String[]{"content_shimmer_activities", "content_shimmer_activities", "content_shimmer_activities", "content_shimmer_activities", "content_shimmer_activities", "content_shimmer_activities"}, new int[]{8, 9, 10, 11, 12, 13}, new int[]{i, i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        R0 = sparseIntArray;
        sparseIntArray.put(z8e.shimmerLayout, 15);
        sparseIntArray.put(z8e.lastRemarkContainer, 16);
        sparseIntArray.put(z8e.tvLatestRemarkHeading, 17);
        sparseIntArray.put(z8e.header_title, 18);
        sparseIntArray.put(z8e.taskTypeContainer, 19);
        sparseIntArray.put(z8e.taskTypeSpinner, 20);
    }

    public io(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 21, Q0, R0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.P0 != 0) {
                return true;
            }
            return this.J0.mo16290E() || this.K0.mo16290E() || this.L0.mo16290E() || this.M0.mo16290E() || this.N0.mo16290E() || this.O0.mo16290E() || this.p0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.P0 = 256L;
        }
        this.J0.mo16291G();
        this.K0.mo16291G();
        this.L0.mo16291G();
        this.M0.mo16291G();
        this.N0.mo16291G();
        this.O0.mo16291G();
        this.p0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return n0((b34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            s0((Integer) obj);
        } else if (61 == i) {
            m0((Leads) obj);
        } else if (42 == i) {
            l0((Boolean) obj);
        } else if (96 == i) {
            t0((Tasks) obj);
        } else if (33 == i) {
            p0((ck6) obj);
        } else if (38 == i) {
            k0((Boolean) obj);
        } else {
            if (67 != i) {
                return false;
            }
            q0((AutoCompleteListModel) obj);
        }
        return true;
    }

    @Override // p001o.ho
    public void k0(Boolean bool) {
        this.z0 = bool;
        synchronized (this) {
            this.P0 |= 64;
        }
        m28509h(38);
        super.m25692R();
    }

    @Override // p001o.ho
    public void l0(Boolean bool) {
        this.A0 = bool;
        synchronized (this) {
            this.P0 |= 8;
        }
        m28509h(42);
        super.m25692R();
    }

    @Override // p001o.ho
    public void m0(Leads leads) {
        this.B0 = leads;
        synchronized (this) {
            this.P0 |= 4;
        }
        m28509h(61);
        super.m25692R();
    }

    public final boolean n0(b34 b34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.P0 |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037 A[PHI: r2
      0x0037: PHI (r2v1 long) = (r2v0 long), (r2v14 long) binds: [B:7:0x0019, B:19:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052 A[PHI: r2
      0x0052: PHI (r2v3 long) = (r2v2 long), (r2v12 long) binds: [B:24:0x003e, B:31:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        boolean zM25676W;
        int i3;
        long j2;
        long j3;
        synchronized (this) {
            j = this.P0;
            this.P0 = 0L;
        }
        Leads leads = this.B0;
        Boolean bool = this.A0;
        Boolean bool2 = this.z0;
        long j4 = j & 260;
        int i4 = 0;
        if (j4 == 0) {
            i = 0;
        } else {
            boolean z = (leads != null ? leads.getLatestRemark() : null) != null;
            if (j4 != 0) {
                j |= z ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            if (!z) {
                i = 8;
            }
        }
        long j5 = j & 264;
        if (j5 != 0) {
            boolean zM25676W2 = ewi.m25676W(bool);
            if (j5 != 0) {
                j |= zM25676W2 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            i2 = zM25676W2 ? 8 : 0;
        }
        long j6 = j & 320;
        if (j6 != 0) {
            zM25676W = ewi.m25676W(bool2);
            if (j6 != 0) {
                if (zM25676W) {
                    j2 = j | MediaStatus.COMMAND_EDIT_TRACKS;
                    j3 = MediaStatus.COMMAND_FOLLOW;
                } else {
                    j2 = j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
                    j3 = MediaStatus.COMMAND_DISLIKE;
                }
                j = j2 | j3;
            }
            int i5 = zM25676W ? 8 : 0;
            i4 = zM25676W ? 0 : 8;
            i3 = i5;
        } else {
            zM25676W = false;
            i3 = 0;
        }
        if ((320 & j) != 0) {
            this.p0.m25689B().setVisibility(i4);
            this.p0.i0(zM25676W);
            this.q0.setVisibility(i3);
        }
        if ((j & 260) != 0) {
            this.s0.setVisibility(i);
            nr1.Q0(this.s0, leads);
            nr1.P0(this.x0, leads);
        }
        if ((j & 264) != 0) {
            this.t0.setVisibility(i2);
            this.u0.setVisibility(i2);
        }
        ewi.m25683r(this.J0);
        ewi.m25683r(this.K0);
        ewi.m25683r(this.L0);
        ewi.m25683r(this.M0);
        ewi.m25683r(this.N0);
        ewi.m25683r(this.O0);
        ewi.m25683r(this.p0);
    }

    public void p0(ck6 ck6Var) {
        this.F0 = ck6Var;
    }

    public void q0(AutoCompleteListModel autoCompleteListModel) {
        this.D0 = autoCompleteListModel;
    }

    public void s0(Integer num) {
        this.E0 = num;
    }

    public void t0(Tasks tasks) {
        this.C0 = tasks;
    }

    public io(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (MaterialTextView) objArr[18], (ConstraintLayout) objArr[16], (b34) objArr[14], (RecyclerView) objArr[7], (ShimmerFrameLayout) objArr[15], (MaterialCardView) objArr[3], (RecyclerView) objArr[6], (MaterialTextView) objArr[5], (TextInputLayout) objArr[19], (AutoCompleteTextView) objArr[20], (MaterialTextView) objArr[4], (MaterialTextView) objArr[17]);
        this.P0 = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.G0 = nestedScrollView;
        nestedScrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.H0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.I0 = linearLayout;
        linearLayout.setTag(null);
        t44 t44Var = (t44) objArr[8];
        this.J0 = t44Var;
        m25693Z(t44Var);
        t44 t44Var2 = (t44) objArr[9];
        this.K0 = t44Var2;
        m25693Z(t44Var2);
        t44 t44Var3 = (t44) objArr[10];
        this.L0 = t44Var3;
        m25693Z(t44Var3);
        t44 t44Var4 = (t44) objArr[11];
        this.M0 = t44Var4;
        m25693Z(t44Var4);
        t44 t44Var5 = (t44) objArr[12];
        this.N0 = t44Var5;
        m25693Z(t44Var5);
        t44 t44Var6 = (t44) objArr[13];
        this.O0 = t44Var6;
        m25693Z(t44Var6);
        m25693Z(this.p0);
        this.q0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.x0.setTag(null);
        a0(view);
        mo16291G();
    }
}
