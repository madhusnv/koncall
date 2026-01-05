package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class op extends np {
    public static final ewi.C13274i F0 = null;
    public static final SparseIntArray G0;
    public final CoordinatorLayout B0;
    public final ConstraintLayout C0;
    public boolean D0;
    public long E0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 3);
        sparseIntArray.put(z8e.toolbar, 4);
        sparseIntArray.put(z8e.activityAppbar, 5);
        sparseIntArray.put(z8e.homeMenu, 6);
        sparseIntArray.put(z8e.searchActivityTextInputLayout, 7);
        sparseIntArray.put(z8e.searchActivityEditText, 8);
        sparseIntArray.put(z8e.frame_container, 9);
        sparseIntArray.put(z8e.activityFilter, 10);
        sparseIntArray.put(z8e.activityFilter_badge, 11);
        sparseIntArray.put(z8e.swipeRefreshLayout, 12);
        sparseIntArray.put(z8e.activitiesPager, 13);
        sparseIntArray.put(z8e.fabActivityStat, 14);
    }

    public op(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 15, F0, G0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.E0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.E0 = 2L;
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
        if (93 != i) {
            return false;
        }
        k0(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // p001o.np
    public void k0(boolean z) {
        this.A0 = z;
        synchronized (this) {
            this.E0 |= 1;
        }
        m28509h(93);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.E0;
            this.E0 = 0L;
        }
        boolean z = this.A0;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 8L : 4L;
            }
            if (z) {
                i = 8;
            }
        }
        long j3 = 2 & j;
        if (j3 != 0) {
            CoordinatorLayout coordinatorLayout = this.B0;
            boolean z2 = this.D0;
            wh1.m54388b(coordinatorLayout, false, z2, false, z2, false, true, false, true);
            ConstraintLayout constraintLayout = this.C0;
            boolean z3 = this.D0;
            wh1.m54388b(constraintLayout, false, z3, false, z3, false, true, false, true);
        }
        if ((j & 3) != 0) {
            this.y0.setVisibility(i);
        }
        if (j3 != 0) {
            this.D0 = true;
        }
    }

    public op(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ViewPager2) objArr[13], (ConstraintLayout) objArr[5], (ShapeableImageView) objArr[10], (TextView) objArr[11], (AppBarLayout) objArr[3], (FloatingActionButton) objArr[14], (FrameLayout) objArr[9], (ShapeableImageView) objArr[6], (TextInputEditText) objArr[8], (TextInputLayout) objArr[7], (SwipeRefreshLayout) objArr[12], (TabLayout) objArr[2], (Toolbar) objArr[4]);
        this.E0 = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.B0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.C0 = constraintLayout;
        constraintLayout.setTag(null);
        this.y0.setTag(null);
        a0(view);
        mo16291G();
    }
}
