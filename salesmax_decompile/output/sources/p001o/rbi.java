package p001o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class rbi extends qbi {
    public static final ewi.C13274i L0;
    public static final SparseIntArray M0;
    public final CoordinatorLayout I0;
    public boolean J0;
    public long K0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(16);
        L0 = c13274i;
        c13274i.m25699a(0, new String[]{"content_no_global_search_result", "content_no_team"}, new int[]{5, 6}, new int[]{p9e.content_no_global_search_result, p9e.content_no_team});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 7);
        sparseIntArray.put(z8e.toolbar, 8);
        sparseIntArray.put(z8e.searchUserAppBar, 9);
        sparseIntArray.put(z8e.searchUserEditTextLayout, 10);
        sparseIntArray.put(z8e.actionAttendance, 11);
        sparseIntArray.put(z8e.actionLastLocation, 12);
        sparseIntArray.put(z8e.swipeRefreshLayout, 13);
        sparseIntArray.put(z8e.searchUserResultPager, 14);
        sparseIntArray.put(z8e.fabAdd, 15);
    }

    public rbi(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 16, L0, M0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.K0 != 0) {
                return true;
            }
            return this.s0.mo16290E() || this.t0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.K0 = 256L;
        }
        this.s0.mo16291G();
        this.t0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return s0((h44) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return q0((l34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (90 == i) {
            n0(((Boolean) obj).booleanValue());
        } else if (89 == i) {
            m0(((Boolean) obj).booleanValue());
        } else if (87 == i) {
            l0(((Boolean) obj).booleanValue());
        } else if (93 == i) {
            p0(((Boolean) obj).booleanValue());
        } else if (79 == i) {
            t0((String) obj);
        } else {
            if (85 != i) {
                return false;
            }
            k0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.qbi
    public void k0(boolean z) {
        this.F0 = z;
        synchronized (this) {
            this.K0 |= 128;
        }
        m28509h(85);
        super.m25692R();
    }

    @Override // p001o.qbi
    public void l0(boolean z) {
        this.D0 = z;
        synchronized (this) {
            this.K0 |= 16;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.qbi
    public void m0(boolean z) {
        this.E0 = z;
        synchronized (this) {
            this.K0 |= 8;
        }
        m28509h(89);
        super.m25692R();
    }

    @Override // p001o.qbi
    public void n0(boolean z) {
        this.G0 = z;
        synchronized (this) {
            this.K0 |= 4;
        }
        m28509h(90);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        Drawable drawableM37353b;
        Drawable drawableM37353b2;
        Context context;
        int i;
        long j2;
        long j3;
        synchronized (this) {
            j = this.K0;
            this.K0 = 0L;
        }
        boolean z = this.G0;
        boolean z2 = this.E0;
        boolean z3 = this.D0;
        boolean z4 = this.H0;
        String str = this.C0;
        boolean z5 = this.F0;
        long j4 = j & 260;
        if (j4 != 0) {
            if (j4 != 0) {
                if (z) {
                    j2 = j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                    j3 = MediaStatus.COMMAND_EDIT_TRACKS;
                } else {
                    j2 = j | 512;
                    j3 = MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
                }
                j = j2 | j3;
            }
            drawableM37353b = lk0.m37353b(this.q0.getContext(), z ? w7e.ic_more : w7e.ic_plus);
            if (z) {
                context = this.o0.getContext();
                i = w7e.ic_cross;
            } else {
                context = this.o0.getContext();
                i = w7e.ic_back_arrow;
            }
            drawableM37353b2 = lk0.m37353b(context, i);
        } else {
            drawableM37353b = null;
            drawableM37353b2 = null;
        }
        long j5 = j & 288;
        int i2 = 0;
        if (j5 != 0) {
            if (j5 != 0) {
                j |= z4 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            if (z4) {
                i2 = 8;
            }
        }
        int i3 = i2;
        long j6 = j & 320;
        long j7 = j & 384;
        if ((260 & j) != 0) {
            nr1.w0(this.o0, drawableM37353b2);
            nr1.w0(this.q0, drawableM37353b);
        }
        if ((272 & j) != 0) {
            this.s0.h0(z3);
        }
        if ((264 & j) != 0) {
            this.t0.i0(z2);
        }
        if (j7 != 0) {
            this.t0.h0(z5);
        }
        long j8 = 256 & j;
        if (j8 != 0) {
            CoordinatorLayout coordinatorLayout = this.I0;
            boolean z6 = this.J0;
            wh1.m54388b(coordinatorLayout, false, z6, false, z6, false, true, false, true);
        }
        if (j6 != 0) {
            fjh.m26938c(this.v0, str);
        }
        if ((j & 288) != 0) {
            this.B0.setVisibility(i3);
        }
        if (j8 != 0) {
            this.J0 = true;
        }
        ewi.m25683r(this.s0);
        ewi.m25683r(this.t0);
    }

    @Override // p001o.qbi
    public void p0(boolean z) {
        this.H0 = z;
        synchronized (this) {
            this.K0 |= 32;
        }
        m28509h(93);
        super.m25692R();
    }

    public final boolean q0(l34 l34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.K0 |= 2;
        }
        return true;
    }

    public final boolean s0(h44 h44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.K0 |= 1;
        }
        return true;
    }

    public void t0(String str) {
        this.C0 = str;
        synchronized (this) {
            this.K0 |= 64;
        }
        m28509h(79);
        super.m25692R();
    }

    public rbi(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (ShapeableImageView) objArr[11], (ShapeableImageView) objArr[1], (ShapeableImageView) objArr[12], (ShapeableImageView) objArr[3], (AppBarLayout) objArr[7], (l34) objArr[5], (h44) objArr[6], (FloatingActionButton) objArr[15], (TextInputEditText) objArr[2], (LinearLayout) objArr[9], (TextInputLayout) objArr[10], (ViewPager2) objArr[14], (SwipeRefreshLayout) objArr[13], (Toolbar) objArr[8], (TabLayout) objArr[4]);
        this.K0 = -1L;
        this.o0.setTag(null);
        this.q0.setTag(null);
        m25693Z(this.s0);
        m25693Z(this.t0);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.I0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.v0.setTag(null);
        this.B0.setTag(null);
        a0(view);
        mo16291G();
    }
}
