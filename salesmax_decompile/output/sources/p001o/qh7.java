package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.ui.PlayerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class qh7 extends ph7 {
    public static final ewi.C13274i v0 = null;
    public static final SparseIntArray w0;
    public final CoordinatorLayout s0;
    public boolean t0;
    public long u0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        w0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 1);
        sparseIntArray.put(z8e.toolbar, 2);
        sparseIntArray.put(z8e.fileDetailsClose, 3);
        sparseIntArray.put(z8e.fileTitle, 4);
        sparseIntArray.put(z8e.mPlayer, 5);
    }

    public qh7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, v0, w0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.u0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.u0 = 1L;
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
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.u0;
            this.u0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            CoordinatorLayout coordinatorLayout = this.s0;
            boolean z = this.t0;
            wh1.m54388b(coordinatorLayout, false, z, false, z, false, true, false, true);
        }
        if (j2 != 0) {
            this.t0 = true;
        }
    }

    public qh7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppBarLayout) objArr[1], (ShapeableImageView) objArr[3], (MaterialTextView) objArr[4], (PlayerView) objArr[5], (Toolbar) objArr[2]);
        this.u0 = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.s0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
