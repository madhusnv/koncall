package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class g44 extends f44 {
    public static final ewi.C13274i v0 = null;
    public static final SparseIntArray w0;
    public final ConstraintLayout s0;
    public boolean t0;
    public long u0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        w0 = sparseIntArray;
        sparseIntArray.put(z8e.import_image, 1);
        sparseIntArray.put(z8e.import_title, 2);
        sparseIntArray.put(z8e.import_subTitle, 3);
    }

    public g44(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, v0, w0));
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
            this.u0 = 4L;
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
        if (35 == i) {
            h0(((Boolean) obj).booleanValue());
        } else {
            if (87 != i) {
                return false;
            }
            i0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.f44
    public void h0(boolean z) {
        this.r0 = z;
        synchronized (this) {
            this.u0 |= 1;
        }
        m28509h(35);
        super.m25692R();
    }

    @Override // p001o.f44
    public void i0(boolean z) {
        this.q0 = z;
        synchronized (this) {
            this.u0 |= 2;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.u0;
            this.u0 = 0L;
        }
        boolean z = this.r0;
        boolean z2 = this.q0;
        long j2 = j & 7;
        if (j2 != 0 && j2 != 0) {
            j |= z2 ? 64L : 32L;
        }
        long j3 = j & 7;
        int i = 0;
        if (j3 != 0) {
            if (!z2) {
                z = false;
            }
            if (j3 != 0) {
                j |= z ? 16L : 8L;
            }
            if (!z) {
                i = 8;
            }
        }
        if ((j & 7) != 0) {
            this.s0.setVisibility(i);
        }
        long j4 = j & 4;
        if (j4 != 0) {
            ConstraintLayout constraintLayout = this.s0;
            boolean z3 = this.t0;
            wh1.m54388b(constraintLayout, false, z3, false, z3, false, true, false, true);
        }
        if (j4 != 0) {
            this.t0 = true;
        }
    }

    public g44(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[1], (MaterialTextView) objArr[3], (MaterialTextView) objArr[2]);
        this.u0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.s0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
