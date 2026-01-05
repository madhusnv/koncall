package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class j3d extends i3d {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0;
    public final ConstraintLayout u0;
    public boolean v0;
    public long w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(z8e.page_logo, 1);
        sparseIntArray.put(z8e.page_card, 2);
        sparseIntArray.put(z8e.page_title, 3);
        sparseIntArray.put(z8e.page_subTitle, 4);
        sparseIntArray.put(z8e.page_subTitle2, 5);
        sparseIntArray.put(z8e.page_positiveButton, 6);
        sparseIntArray.put(z8e.page_negativeButton, 7);
    }

    public j3d(yt4 yt4Var, View view) {
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
            ConstraintLayout constraintLayout = this.u0;
            boolean z = this.v0;
            wh1.m54388b(constraintLayout, false, z, false, z, false, true, false, true);
        }
        if (j2 != 0) {
            this.v0 = true;
        }
    }

    public j3d(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[2], (ShapeableImageView) objArr[1], (MaterialButton) objArr[7], (MaterialButton) objArr[6], (MaterialTextView) objArr[4], (MaterialTextView) objArr[5], (MaterialTextView) objArr[3]);
        this.w0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
