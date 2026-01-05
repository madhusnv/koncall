package p001o;

import ai.salesmax.view.ColorArcProgressBar;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class vyi extends uyi {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0;
    public final ConstraintLayout v0;
    public long w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(z8e.itemCard, 1);
        sparseIntArray.put(z8e.newData, 2);
        sparseIntArray.put(z8e.itemProgress, 3);
        sparseIntArray.put(z8e.itemIcon, 4);
        sparseIntArray.put(z8e.itemName, 5);
        sparseIntArray.put(z8e.itemSub, 6);
        sparseIntArray.put(z8e.shadowMarginView, 7);
        sparseIntArray.put(z8e.cardShadowView, 8);
    }

    public vyi(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 9, x0, y0));
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
        synchronized (this) {
            this.w0 = 0L;
        }
    }

    public vyi(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[8], (MaterialCardView) objArr[1], (ShapeableImageView) objArr[4], (MaterialTextView) objArr[5], (ColorArcProgressBar) objArr[3], (MaterialTextView) objArr[6], (TextView) objArr[2], (View) objArr[7]);
        this.w0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.v0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
