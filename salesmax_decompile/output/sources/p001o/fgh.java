package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class fgh extends egh {
    public static final ewi.C13274i M0 = null;
    public static final SparseIntArray N0;
    public final CoordinatorLayout J0;
    public boolean K0;
    public long L0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 3);
        sparseIntArray.put(z8e.toolbar, 4);
        sparseIntArray.put(z8e.leadsAppBar, 5);
        sparseIntArray.put(z8e.leadsMenu, 6);
        sparseIntArray.put(z8e.leadTitle, 7);
        sparseIntArray.put(z8e.leadsPlus, 8);
        sparseIntArray.put(z8e.searchLeadsEditTextLayout, 9);
        sparseIntArray.put(z8e.searchLeadsEditText, 10);
        sparseIntArray.put(z8e.fabBackground, 11);
        sparseIntArray.put(z8e.sheet, 12);
        sparseIntArray.put(z8e.fabCreateFolder, 13);
        sparseIntArray.put(z8e.fabCreateTemplate, 14);
        sparseIntArray.put(z8e.fabUploadFile, 15);
        sparseIntArray.put(z8e.fab, 16);
        sparseIntArray.put(z8e.fabCreateTemplateDirect, 17);
    }

    public fgh(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 18, M0, N0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.L0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.L0 = 32L;
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
        } else if (87 == i) {
            n0(((Boolean) obj).booleanValue());
        } else if (93 == i) {
            k0(((Boolean) obj).booleanValue());
        } else if (86 == i) {
            m0(((Boolean) obj).booleanValue());
        } else {
            if (83 != i) {
                return false;
            }
            l0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.egh
    public void k0(boolean z) {
        this.I0 = z;
        synchronized (this) {
            this.L0 |= 4;
        }
        m28509h(93);
        super.m25692R();
    }

    public void l0(boolean z) {
        this.E0 = z;
        synchronized (this) {
            this.L0 |= 16;
        }
        m28509h(83);
        super.m25692R();
    }

    public void m0(boolean z) {
        this.H0 = z;
    }

    public void n0(boolean z) {
        this.F0 = z;
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
            j = this.L0;
            this.L0 = 0L;
        }
        boolean z = this.I0;
        boolean z2 = this.E0;
        long j2 = j & 36;
        int i2 = 0;
        if (j2 == 0) {
            i = 0;
        } else {
            if (j2 != 0) {
                j |= z ? 128L : 64L;
            }
            if (z) {
                i = 8;
            }
        }
        long j3 = j & 48;
        if (j3 != 0) {
            if (j3 != 0) {
                j |= z2 ? 512L : 256L;
            }
            i2 = z2 ? 8 : 0;
        }
        if ((j & 36) != 0) {
            this.y0.setVisibility(i);
        }
        long j4 = 32 & j;
        if (j4 != 0) {
            CoordinatorLayout coordinatorLayout = this.J0;
            boolean z3 = this.K0;
            wh1.m54388b(coordinatorLayout, false, z3, false, z3, false, true, false, true);
        }
        if ((j & 48) != 0) {
            this.C0.setVisibility(i2);
        }
        if (j4 != 0) {
            this.K0 = true;
        }
    }

    public void p0(boolean z) {
        this.G0 = z;
    }

    public fgh(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppBarLayout) objArr[3], (FloatingActionButton) objArr[16], (RelativeLayout) objArr[11], (FloatingActionButton) objArr[13], (FloatingActionButton) objArr[14], (FloatingActionButton) objArr[17], (FloatingActionButton) objArr[15], (MaterialTextView) objArr[7], (LinearLayout) objArr[5], (ShapeableImageView) objArr[6], (ShapeableImageView) objArr[8], (TabLayout) objArr[1], (TextInputEditText) objArr[10], (TextInputLayout) objArr[9], (LinearLayout) objArr[12], (ViewPager2) objArr[2], (Toolbar) objArr[4]);
        this.L0 = -1L;
        this.y0.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.J0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.C0.setTag(null);
        a0(view);
        mo16291G();
    }
}
