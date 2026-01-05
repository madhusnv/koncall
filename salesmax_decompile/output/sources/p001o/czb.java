package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import p001o.ewi;

/* loaded from: classes.dex */
public class czb extends bzb {
    public static final ewi.C13274i s0 = null;
    public static final SparseIntArray t0;
    public long r0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        t0 = sparseIntArray;
        sparseIntArray.put(z8e.no_internet_heading, 1);
        sparseIntArray.put(z8e.no_internet_text, 2);
        sparseIntArray.put(z8e.try_again_button, 3);
    }

    public czb(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, s0, t0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.r0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.r0 = 1L;
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
            this.r0 = 0L;
        }
    }

    public czb(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextView) objArr[1], (TextView) objArr[2], (ConstraintLayout) objArr[0], (MaterialButton) objArr[3]);
        this.r0 = -1L;
        this.p0.setTag(null);
        a0(view);
        mo16291G();
    }
}
