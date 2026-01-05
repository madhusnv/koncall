package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class feg extends eeg {
    public static final ewi.C13274i C0 = null;
    public static final SparseIntArray D0;
    public boolean A0;
    public long B0;
    public final CoordinatorLayout z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 3);
        sparseIntArray.put(z8e.toolbar, 4);
        sparseIntArray.put(z8e.leadsAppBar, 5);
        sparseIntArray.put(z8e.leadsMenu, 6);
        sparseIntArray.put(z8e.leadTitle, 7);
    }

    public feg(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, C0, D0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.B0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.B0 = 32L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (89 == i) {
            p0(((Boolean) obj).booleanValue());
        } else if (83 == i) {
            l0(((Boolean) obj).booleanValue());
        } else if (87 == i) {
            n0(((Boolean) obj).booleanValue());
        } else if (93 == i) {
            k0(((Boolean) obj).booleanValue());
        } else {
            if (86 != i) {
                return false;
            }
            m0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.eeg
    public void k0(boolean z) {
        this.y0 = z;
        synchronized (this) {
            this.B0 |= 8;
        }
        m28509h(93);
        super.m25692R();
    }

    public void l0(boolean z) {
        this.u0 = z;
        synchronized (this) {
            this.B0 |= 2;
        }
        m28509h(83);
        super.m25692R();
    }

    public void m0(boolean z) {
        this.x0 = z;
    }

    public void n0(boolean z) {
        this.v0 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[PHI: r2
      0x0027: PHI (r2v1 long) = (r2v0 long), (r2v9 long) binds: [B:7:0x0017, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        synchronized (this) {
            j = this.B0;
            this.B0 = 0L;
        }
        boolean z = this.u0;
        boolean z2 = this.y0;
        long j2 = j & 34;
        int i2 = 0;
        if (j2 == 0) {
            i = 0;
        } else {
            if (j2 != 0) {
                j |= z ? 512L : 256L;
            }
            if (z) {
                i = 8;
            }
        }
        long j3 = j & 40;
        if (j3 != 0) {
            if (j3 != 0) {
                j |= z2 ? 128L : 64L;
            }
            i2 = z2 ? 8 : 0;
        }
        if ((j & 40) != 0) {
            this.r0.setVisibility(i2);
        }
        long j4 = 32 & j;
        if (j4 != 0) {
            CoordinatorLayout coordinatorLayout = this.z0;
            boolean z3 = this.A0;
            wh1.m54388b(coordinatorLayout, false, z3, false, z3, false, true, false, true);
        }
        if ((j & 34) != 0) {
            this.s0.setVisibility(i);
        }
        if (j4 != 0) {
            this.A0 = true;
        }
    }

    public void p0(boolean z) {
        this.w0 = z;
    }

    public feg(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppBarLayout) objArr[3], (MaterialTextView) objArr[7], (LinearLayout) objArr[5], (ShapeableImageView) objArr[6], (TabLayout) objArr[1], (ViewPager2) objArr[2], (Toolbar) objArr[4]);
        this.B0 = -1L;
        this.r0.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.z0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.s0.setTag(null);
        a0(view);
        mo16291G();
    }
}
