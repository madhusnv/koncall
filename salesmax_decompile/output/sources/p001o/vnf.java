package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import p001o.ewi;

/* loaded from: classes.dex */
public class vnf extends unf {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public final LinearLayout s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 1);
        sparseIntArray.put(z8e.filterList, 2);
        sparseIntArray.put(z8e.bottomBorder, 3);
        sparseIntArray.put(z8e.buttonDone, 4);
        sparseIntArray.put(z8e.buttonClear, 5);
    }

    public vnf(yt4 yt4Var, View view) {
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

    public vnf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (View) objArr[3], (ShapeableImageView) objArr[1], (MaterialButton) objArr[5], (MaterialButton) objArr[4], (RecyclerView) objArr[2]);
        this.t0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.s0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
