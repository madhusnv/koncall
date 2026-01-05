package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class lj7 extends kj7 {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public final CoordinatorLayout w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 1);
        sparseIntArray.put(z8e.toolbar, 2);
        sparseIntArray.put(z8e.fileDetailsClose, 3);
        sparseIntArray.put(z8e.fileDetailsMore, 4);
        sparseIntArray.put(z8e.fileTitle, 5);
        sparseIntArray.put(z8e.leadDetailsBorder1, 6);
        sparseIntArray.put(z8e.baseProgressBar, 7);
        sparseIntArray.put(z8e.pageViewPager, 8);
    }

    public lj7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 9, y0, z0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.x0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.x0 = 2L;
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
        if (30 != i) {
            return false;
        }
        j0((String) obj);
        return true;
    }

    public void j0(String str) {
        this.v0 = str;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.x0 = 0L;
        }
    }

    public lj7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppBarLayout) objArr[1], (ProgressBar) objArr[7], (ShapeableImageView) objArr[3], (ShapeableImageView) objArr[4], (MaterialTextView) objArr[5], (View) objArr[6], (ViewPager2) objArr[8], (Toolbar) objArr[2]);
        this.x0 = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.w0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
