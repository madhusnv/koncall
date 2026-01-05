package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class m34 extends l34 {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public final ConstraintLayout s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.import_image, 1);
        sparseIntArray.put(z8e.import_title, 2);
        sparseIntArray.put(z8e.import_subTitle, 3);
        sparseIntArray.put(z8e.clearFilter, 4);
    }

    public m34(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, u0, v0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.t0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.t0 = 2L;
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
        if (87 != i) {
            return false;
        }
        h0(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // p001o.l34
    public void h0(boolean z) {
        this.r0 = z;
        synchronized (this) {
            this.t0 |= 1;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.t0;
            this.t0 = 0L;
        }
        boolean z = this.r0;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 8L : 4L;
            }
            if (!z) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            this.s0.setVisibility(i);
        }
    }

    public m34(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[4], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[3], (MaterialTextView) objArr[2]);
        this.t0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.s0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
