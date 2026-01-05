package p001o;

import ai.salesmax.ui.component.TouchImageView;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class jj7 extends ij7 {
    public static final ewi.C13274i D0 = null;
    public static final SparseIntArray E0;
    public final CoordinatorLayout A0;
    public boolean B0;
    public long C0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 1);
        sparseIntArray.put(z8e.toolbar, 2);
        sparseIntArray.put(z8e.fileDetailsClose, 3);
        sparseIntArray.put(z8e.fileDetailsMore, 4);
        sparseIntArray.put(z8e.fileTitle, 5);
        sparseIntArray.put(z8e.leadDetailsBorder1, 6);
        sparseIntArray.put(z8e.button1, 7);
        sparseIntArray.put(z8e.mIndex, 8);
        sparseIntArray.put(z8e.mPrev, 9);
        sparseIntArray.put(z8e.mNext, 10);
        sparseIntArray.put(z8e.imageView, 11);
        sparseIntArray.put(z8e.mLoader, 12);
    }

    public jj7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 13, D0, E0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.C0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.C0 = 2L;
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
        h0((String) obj);
        return true;
    }

    public void h0(String str) {
        this.z0 = str;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.C0;
            this.C0 = 0L;
        }
        long j2 = j & 2;
        if (j2 != 0) {
            CoordinatorLayout coordinatorLayout = this.A0;
            boolean z = this.B0;
            wh1.m54388b(coordinatorLayout, false, z, false, z, false, true, false, true);
        }
        if (j2 != 0) {
            this.B0 = true;
        }
    }

    public jj7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppBarLayout) objArr[1], (Button) objArr[7], (ShapeableImageView) objArr[3], (ShapeableImageView) objArr[4], (MaterialTextView) objArr[5], (TouchImageView) objArr[11], (View) objArr[6], (TextView) objArr[8], (ProgressBar) objArr[12], (Button) objArr[10], (Button) objArr[9], (Toolbar) objArr[2]);
        this.C0 = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.A0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
