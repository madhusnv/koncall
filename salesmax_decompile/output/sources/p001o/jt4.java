package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class jt4 extends it4 {
    public static final ewi.C13274i B0;
    public static final SparseIntArray C0;
    public long A0;
    public final CoordinatorLayout x0;
    public final ConstraintLayout y0;
    public boolean z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(10);
        B0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_no_global_search_result"}, new int[]{3}, new int[]{p9e.content_no_global_search_result});
        SparseIntArray sparseIntArray = new SparseIntArray();
        C0 = sparseIntArray;
        sparseIntArray.put(z8e.searchDashboardAppBar, 4);
        sparseIntArray.put(z8e.actionBack, 5);
        sparseIntArray.put(z8e.searchGlobalEditTextLayout, 6);
        sparseIntArray.put(z8e.searchClose, 7);
        sparseIntArray.put(z8e.searchDashboardResultTab, 8);
        sparseIntArray.put(z8e.searchDashboardResultPager, 9);
    }

    public jt4(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 10, B0, C0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.A0 != 0) {
                return true;
            }
            return this.o0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.A0 = 8L;
        }
        this.o0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((l34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (79 == i) {
            l0((String) obj);
        } else {
            if (87 != i) {
                return false;
            }
            j0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.it4
    public void j0(boolean z) {
        this.w0 = z;
        synchronized (this) {
            this.A0 |= 4;
        }
        m28509h(87);
        super.m25692R();
    }

    public final boolean k0(l34 l34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.A0 |= 1;
        }
        return true;
    }

    public void l0(String str) {
        this.v0 = str;
        synchronized (this) {
            this.A0 |= 2;
        }
        m28509h(79);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.A0;
            this.A0 = 0L;
        }
        String str = this.v0;
        boolean z = this.w0;
        long j2 = 10 & j;
        if ((12 & j) != 0) {
            this.o0.h0(z);
        }
        long j3 = j & 8;
        if (j3 != 0) {
            wh1.m54388b(this.x0, false, this.z0, false, false, false, true, false, false);
        }
        if (j2 != 0) {
            fjh.m26938c(this.t0, str);
        }
        if (j3 != 0) {
            this.z0 = true;
        }
        ewi.m25683r(this.o0);
    }

    public jt4(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (ShapeableImageView) objArr[5], (l34) objArr[3], (ShapeableImageView) objArr[7], (LinearLayout) objArr[4], (ViewPager2) objArr[9], (TabLayout) objArr[8], (TextInputEditText) objArr[2], (TextInputLayout) objArr[6]);
        this.A0 = -1L;
        m25693Z(this.o0);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.x0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.y0 = constraintLayout;
        constraintLayout.setTag(null);
        this.t0.setTag(null);
        a0(view);
        mo16291G();
    }
}
