package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class nzi extends mzi {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0;
    public final ConstraintLayout u0;
    public long v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(z8e.itemCard, 1);
        sparseIntArray.put(z8e.newData, 2);
        sparseIntArray.put(z8e.itemIcon, 3);
        sparseIntArray.put(z8e.itemCount, 4);
        sparseIntArray.put(z8e.itemName, 5);
        sparseIntArray.put(z8e.shadowMarginView, 6);
        sparseIntArray.put(z8e.cardShadowView, 7);
    }

    public nzi(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, w0, x0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.v0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.v0 = 1L;
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
            this.v0 = 0L;
        }
    }

    public nzi(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[7], (MaterialCardView) objArr[1], (MaterialTextView) objArr[4], (ShapeableImageView) objArr[3], (MaterialTextView) objArr[5], (TextView) objArr[2], (View) objArr[6]);
        this.v0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
