package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class mi7 extends li7 {
    public static final ewi.C13274i O0 = null;
    public static final SparseIntArray P0;
    public final CoordinatorLayout L0;
    public boolean M0;
    public long N0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 5);
        sparseIntArray.put(z8e.toolbar, 6);
        sparseIntArray.put(z8e.leadsAppBar, 7);
        sparseIntArray.put(z8e.leadsMenu, 8);
        sparseIntArray.put(z8e.leadTitle, 9);
        sparseIntArray.put(z8e.buttonSupport, 10);
        sparseIntArray.put(z8e.leadsMore, 11);
        sparseIntArray.put(z8e.searchLeadsEditTextLayout, 12);
        sparseIntArray.put(z8e.searchLeadsEditText, 13);
        sparseIntArray.put(z8e.leadsTab, 14);
        sparseIntArray.put(z8e.swipeRefreshLayout, 15);
        sparseIntArray.put(z8e.fabCreateChannel, 16);
        sparseIntArray.put(z8e.fabStartChat, 17);
    }

    public mi7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 18, O0, P0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.N0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.N0 = 128L;
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
        if (90 == i) {
            m0(((Boolean) obj).booleanValue());
        } else if (89 == i) {
            t0(((Boolean) obj).booleanValue());
        } else if (87 == i) {
            s0(((Boolean) obj).booleanValue());
        } else if (93 == i) {
            n0(((Boolean) obj).booleanValue());
        } else if (86 == i) {
            q0(((Boolean) obj).booleanValue());
        } else if (83 == i) {
            p0(((Boolean) obj).booleanValue());
        } else {
            if (65 != i) {
                return false;
            }
            l0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.li7
    public void l0(boolean z) {
        this.F0 = z;
    }

    @Override // p001o.li7
    public void m0(boolean z) {
        this.K0 = z;
        synchronized (this) {
            this.N0 |= 1;
        }
        m28509h(90);
        super.m25692R();
    }

    @Override // p001o.li7
    public void n0(boolean z) {
        this.J0 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[PHI: r2
      0x0028: PHI (r2v1 long) = (r2v0 long), (r2v9 long) binds: [B:7:0x0017, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        synchronized (this) {
            j = this.N0;
            this.N0 = 0L;
        }
        boolean z = this.K0;
        boolean z2 = this.E0;
        long j2 = j & 129;
        int i2 = 0;
        if (j2 == 0) {
            i = 0;
        } else {
            if (j2 != 0) {
                j |= z ? 512L : 256L;
            }
            if (!z) {
                i = 8;
            }
        }
        long j3 = j & 160;
        if (j3 != 0) {
            if (j3 != 0) {
                j |= z2 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            i2 = z2 ? 8 : 0;
        }
        if ((j & 129) != 0) {
            this.p0.setVisibility(i);
            this.s0.setVisibility(i);
            this.x0.setVisibility(i);
        }
        long j4 = 128 & j;
        if (j4 != 0) {
            CoordinatorLayout coordinatorLayout = this.L0;
            boolean z3 = this.M0;
            wh1.m54388b(coordinatorLayout, false, z3, false, z3, false, true, false, true);
        }
        if ((j & 160) != 0) {
            this.C0.setVisibility(i2);
        }
        if (j4 != 0) {
            this.M0 = true;
        }
    }

    public void p0(boolean z) {
        this.E0 = z;
        synchronized (this) {
            this.N0 |= 32;
        }
        m28509h(83);
        super.m25692R();
    }

    public void q0(boolean z) {
        this.I0 = z;
    }

    public void s0(boolean z) {
        this.G0 = z;
    }

    public void t0(boolean z) {
        this.H0 = z;
    }

    public mi7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppBarLayout) objArr[5], (MaterialButton) objArr[10], (ShapeableImageView) objArr[2], (FloatingActionButton) objArr[16], (FloatingActionButton) objArr[17], (MaterialTextView) objArr[3], (MaterialTextView) objArr[9], (LinearLayout) objArr[7], (ShapeableImageView) objArr[8], (ShapeableImageView) objArr[11], (LinearLayout) objArr[1], (TabLayout) objArr[14], (TextInputEditText) objArr[13], (TextInputLayout) objArr[12], (SwipeRefreshLayout) objArr[15], (ViewPager2) objArr[4], (Toolbar) objArr[6]);
        this.N0 = -1L;
        this.p0.setTag(null);
        this.s0.setTag(null);
        this.x0.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.L0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.C0.setTag(null);
        a0(view);
        mo16291G();
    }
}
