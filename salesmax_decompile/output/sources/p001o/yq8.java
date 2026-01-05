package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.androidpoet.materialintro.MaterialIntroFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class yq8 extends xq8 {
    public static final ewi.C13274i t0 = null;
    public static final SparseIntArray u0;
    public final CoordinatorLayout r0;
    public long s0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        u0 = sparseIntArray;
        sparseIntArray.put(z8e.materialIntroFragment, 1);
        sparseIntArray.put(z8e.tab_layout, 2);
        sparseIntArray.put(z8e.back_button, 3);
        sparseIntArray.put(z8e.next_button, 4);
    }

    public yq8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, t0, u0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.s0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.s0 = 1L;
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
        synchronized (this) {
            this.s0 = 0L;
        }
    }

    public yq8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[3], (MaterialIntroFragment) objArr[1], (MaterialButton) objArr[4], (TabLayout) objArr[2]);
        this.s0 = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.r0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
