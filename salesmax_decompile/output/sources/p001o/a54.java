package p001o;

import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class a54 extends z44 {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.shimmer_ivContactProfilePic, 1);
        sparseIntArray.put(z8e.shimmer_tvContactName, 2);
        sparseIntArray.put(z8e.shimmer_tvContactNumber, 3);
        sparseIntArray.put(z8e.shimmer_leadOwnerName, 4);
        sparseIntArray.put(z8e.shimmer_callTimeBlock, 5);
    }

    public a54(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, u0, v0));
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
            this.t0 = 1L;
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
            this.t0 = 0L;
        }
    }

    public a54(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[5], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (Chip) objArr[4], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.t0 = -1L;
        this.o0.setTag(null);
        a0(view);
        mo16291G();
    }
}
