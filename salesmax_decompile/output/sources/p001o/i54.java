package p001o;

import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class i54 extends h54 {
    public static final ewi.C13274i v0 = null;
    public static final SparseIntArray w0;
    public final MaterialCardView t0;
    public long u0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        w0 = sparseIntArray;
        sparseIntArray.put(z8e.tvContactName, 1);
        sparseIntArray.put(z8e.tvContactDesignation, 2);
        sparseIntArray.put(z8e.tvContactNumber, 3);
        sparseIntArray.put(z8e.activityMore, 4);
        sparseIntArray.put(z8e.activityType, 5);
        sparseIntArray.put(z8e.callTime, 6);
    }

    public i54(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, v0, w0));
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
        synchronized (this) {
            this.u0 = 0L;
        }
    }

    public i54(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[4], (ShapeableImageView) objArr[5], (MaterialTextView) objArr[6], (MaterialTextView) objArr[2], (MaterialTextView) objArr[1], (MaterialTextView) objArr[3]);
        this.u0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.t0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        mo16291G();
    }
}
