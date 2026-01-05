package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class lw extends kw {
    public static final ewi.C13274i r0 = null;
    public static final SparseIntArray s0;
    public final ConstraintLayout p0;
    public long q0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        s0 = sparseIntArray;
        sparseIntArray.put(z8e.customDesign, 1);
    }

    public lw(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 2, r0, s0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.q0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.q0 = 2L;
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
        if (67 != i) {
            return false;
        }
        h0((String) obj);
        return true;
    }

    public void h0(String str) {
        this.o0 = str;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.q0 = 0L;
        }
    }

    public lw(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ComposeView) objArr[1]);
        this.q0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.p0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
