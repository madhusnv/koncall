package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class xs4 extends ws4 {
    public static final ewi.C13274i l1;
    public static final SparseIntArray m1;
    public boolean j1;
    public long k1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(40);
        l1 = c13274i;
        c13274i.m25699a(0, new String[]{"content_no_team", "content_to_import", "item_no_internet"}, new int[]{4, 5, 6}, new int[]{p9e.content_no_team, p9e.content_to_import, p9e.item_no_internet});
        SparseIntArray sparseIntArray = new SparseIntArray();
        m1 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 7);
        sparseIntArray.put(z8e.toolbar, 8);
        sparseIntArray.put(z8e.dashboardAppBar, 9);
        sparseIntArray.put(z8e.dashboardMenu, 10);
        sparseIntArray.put(z8e.DashboardMentions, 11);
        sparseIntArray.put(z8e.searchDashboardEditTextLayout, 12);
        sparseIntArray.put(z8e.searchDashboardEditText, 13);
        sparseIntArray.put(z8e.DashboardNotification, 14);
        sparseIntArray.put(z8e.DashboardAttendance, 15);
        sparseIntArray.put(z8e.allPayments, 16);
        sparseIntArray.put(z8e.tvEmailVerification, 17);
        sparseIntArray.put(z8e.tvEmailVerificationMessage, 18);
        sparseIntArray.put(z8e.tvTrialExpiring, 19);
        sparseIntArray.put(z8e.tvExpiryMessage, 20);
        sparseIntArray.put(z8e.shimmerLayout, 21);
        sparseIntArray.put(z8e.shimmer_welcome, 22);
        sparseIntArray.put(z8e.shimmer_pg1, 23);
        sparseIntArray.put(z8e.shimmer_pg2, 24);
        sparseIntArray.put(z8e.shimmer_pg3, 25);
        sparseIntArray.put(z8e.shimmer_pg4, 26);
        sparseIntArray.put(z8e.shimmer_block1, 27);
        sparseIntArray.put(z8e.shimmer_block2, 28);
        sparseIntArray.put(z8e.swipeRefreshLayout, 29);
        sparseIntArray.put(z8e.dashboardPager, 30);
        sparseIntArray.put(z8e.fabBackground, 31);
        sparseIntArray.put(z8e.sheet, 32);
        sparseIntArray.put(z8e.logEngagement, 33);
        sparseIntArray.put(z8e.addUser, 34);
        sparseIntArray.put(z8e.fabMention, 35);
        sparseIntArray.put(z8e.fab, 36);
        sparseIntArray.put(z8e.fabAddUser, 37);
        sparseIntArray.put(z8e.fabTeamChat, 38);
        sparseIntArray.put(z8e.fabGetSupport, 39);
    }

    public xs4(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 40, l1, m1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.k1 != 0) {
                return true;
            }
            return this.u0.mo16290E() || this.v0.mo16290E() || this.t0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.k1 = MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
        }
        this.u0.mo16291G();
        this.v0.mo16291G();
        this.t0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return s0((n54) obj, i2);
        }
        if (i == 1) {
            return q0((h44) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return p0((n19) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (15 == i) {
            j0(((Boolean) obj).booleanValue());
        } else if (89 == i) {
            m0(((Boolean) obj).booleanValue());
        } else if (93 == i) {
            n0(((Boolean) obj).booleanValue());
        } else if (83 == i) {
            u0(((Boolean) obj).booleanValue());
        } else if (85 == i) {
            l0(((Boolean) obj).booleanValue());
        } else if (66 == i) {
            k0(((Boolean) obj).booleanValue());
        } else if (28 == i) {
            t0(((Boolean) obj).booleanValue());
        } else {
            if (98 != i) {
                return false;
            }
            v0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.ws4
    public void j0(boolean z) {
        this.g1 = z;
        synchronized (this) {
            this.k1 |= 8;
        }
        m28509h(15);
        super.m25692R();
    }

    @Override // p001o.ws4
    public void k0(boolean z) {
        this.f1 = z;
        synchronized (this) {
            this.k1 |= 256;
        }
        m28509h(66);
        super.m25692R();
    }

    @Override // p001o.ws4
    public void l0(boolean z) {
        this.c1 = z;
        synchronized (this) {
            this.k1 |= 128;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.ws4
    public void m0(boolean z) {
        this.d1 = z;
        synchronized (this) {
            this.k1 |= 16;
        }
        m28509h(89);
        super.m25692R();
    }

    @Override // p001o.ws4
    public void n0(boolean z) {
        this.b1 = z;
        synchronized (this) {
            this.k1 |= 32;
        }
        m28509h(93);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[PHI: r2
      0x0034: PHI (r2v1 long) = (r2v0 long), (r2v23 long) binds: [B:7:0x0025, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097 A[PHI: r2
      0x0097: PHI (r2v6 long) = (r2v5 long), (r2v17 long) binds: [B:40:0x0082, B:48:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        boolean z;
        int i2;
        int i3;
        synchronized (this) {
            j = this.k1;
            this.k1 = 0L;
        }
        boolean z2 = this.g1;
        boolean z3 = this.d1;
        boolean z4 = this.b1;
        boolean z5 = this.e1;
        boolean z6 = this.c1;
        boolean z7 = this.f1;
        long j2 = j & 2056;
        if (j2 == 0) {
            i = 0;
        } else {
            if (j2 != 0) {
                j = z2 ? j | MediaStatus.COMMAND_DISLIKE : j | MediaStatus.COMMAND_LIKE;
            }
            if (z2) {
                i = 8;
            }
        }
        long j3 = j & 2144;
        if (j3 != 0 && j3 != 0) {
            j |= z5 ? 8388608L : 4194304L;
        }
        long j4 = j & 2344;
        if (j4 != 0 && j4 != 0) {
            j |= z7 ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
        }
        long j5 = j & 2344;
        if (j5 != 0) {
            z = z7 ? true : z4;
            if (j5 != 0) {
                j = z ? j | 2097152 : j | 1048576;
            }
        } else {
            z = false;
        }
        long j6 = j & 2144;
        if (j6 == 0) {
            i2 = 0;
        } else {
            if (z5) {
                z4 = true;
            }
            if (j6 != 0) {
                j |= z4 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if (z4) {
                i2 = 8;
            }
        }
        if ((j & 1048576) != 0 && (j & 2056) != 0) {
            j = z2 ? j | MediaStatus.COMMAND_DISLIKE : j | MediaStatus.COMMAND_LIKE;
        }
        long j7 = j & 2344;
        if (j7 != 0) {
            if (z) {
                z2 = true;
            }
            if (j7 != 0) {
                j |= z2 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            i3 = z2 ? 8 : 0;
        } else {
            i3 = 0;
        }
        if ((2176 & j) != 0) {
            this.t0.h0(z6);
            this.u0.h0(z6);
            this.v0.h0(z6);
        }
        if ((2064 & j) != 0) {
            this.u0.i0(z3);
        }
        if ((2112 & j) != 0) {
            this.v0.i0(z5);
        }
        if ((j & 2056) != 0) {
            this.x0.setVisibility(i);
        }
        long j8 = MediaStatus.COMMAND_QUEUE_REPEAT_ONE & j;
        if (j8 != 0) {
            CoordinatorLayout coordinatorLayout = this.A0;
            boolean z8 = this.j1;
            wh1.m54388b(coordinatorLayout, false, z8, false, z8, false, true, false, true);
        }
        if ((j & 2144) != 0) {
            this.B0.setVisibility(i2);
        }
        if ((j & 2344) != 0) {
            this.J0.setVisibility(i3);
        }
        if (j8 != 0) {
            this.j1 = true;
        }
        ewi.m25683r(this.u0);
        ewi.m25683r(this.v0);
        ewi.m25683r(this.t0);
    }

    public final boolean p0(n19 n19Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.k1 |= 4;
        }
        return true;
    }

    public final boolean q0(h44 h44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.k1 |= 2;
        }
        return true;
    }

    public final boolean s0(n54 n54Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.k1 |= 1;
        }
        return true;
    }

    public void t0(boolean z) {
        this.h1 = z;
    }

    public void u0(boolean z) {
        this.e1 = z;
        synchronized (this) {
            this.k1 |= 64;
        }
        m28509h(83);
        super.m25692R();
    }

    public void v0(Integer num) {
        this.i1 = num;
    }

    public xs4(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 3, (ShapeableImageView) objArr[15], (ShapeableImageView) objArr[11], (ShapeableImageView) objArr[14], (FloatingActionButton) objArr[34], (ShapeableImageView) objArr[16], (AppBarLayout) objArr[7], (n19) objArr[6], (h44) objArr[4], (n54) objArr[5], (ConstraintLayout) objArr[9], (ShapeableImageView) objArr[2], (ShapeableImageView) objArr[10], (ViewPager2) objArr[30], (CoordinatorLayout) objArr[0], (TabLayout) objArr[3], (FloatingActionButton) objArr[36], (FloatingActionButton) objArr[37], (RelativeLayout) objArr[31], (FloatingActionButton) objArr[39], (FloatingActionButton) objArr[35], (FloatingActionButton) objArr[38], (FloatingActionButton) objArr[33], (MaterialTextView) objArr[1], (TextInputEditText) objArr[13], (TextInputLayout) objArr[12], (LinearLayout) objArr[32], (MaterialTextView) objArr[27], (MaterialTextView) objArr[28], (ShimmerFrameLayout) objArr[21], (ShapeableImageView) objArr[23], (ShapeableImageView) objArr[24], (ShapeableImageView) objArr[25], (ShapeableImageView) objArr[26], (MaterialTextView) objArr[22], (SwipeRefreshLayout) objArr[29], (Toolbar) objArr[8], (ConstraintLayout) objArr[17], (MaterialTextView) objArr[18], (MaterialTextView) objArr[20], (ConstraintLayout) objArr[19]);
        this.k1 = -1L;
        m25693Z(this.t0);
        m25693Z(this.u0);
        m25693Z(this.v0);
        this.x0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.J0.setTag(null);
        a0(view);
        mo16291G();
    }
}
