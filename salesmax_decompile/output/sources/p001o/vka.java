package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class vka extends uka {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0;
    public final ConstraintLayout u0;
    public boolean v0;
    public long w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(z8e.landing_logo, 1);
        sparseIntArray.put(z8e.landingSubTitle, 2);
        sparseIntArray.put(z8e.landingSubTitle2, 3);
        sparseIntArray.put(z8e.landingSubTitle3, 4);
        sparseIntArray.put(z8e.singInActionButton, 5);
        sparseIntArray.put(z8e.singUpActionButton, 6);
        sparseIntArray.put(z8e.backgroundCircle, 7);
    }

    public vka(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, x0, y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.w0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.w0 = 1L;
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
            j = this.w0;
            this.w0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            wh1.m54388b(this.u0, false, false, false, this.v0, false, false, false, true);
        }
        if (j2 != 0) {
            this.v0 = true;
        }
    }

    public vka(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[7], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3], (MaterialTextView) objArr[4], (MaterialButton) objArr[5], (MaterialButton) objArr[6]);
        this.w0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
