package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class pyi extends oyi {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public final LinearLayout s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.vpt_Icon, 1);
        sparseIntArray.put(z8e.vpt_Title, 2);
        sparseIntArray.put(z8e.vpt_Value, 3);
        sparseIntArray.put(z8e.userRemove, 4);
        sparseIntArray.put(z8e.leadDetailsBorder1, 5);
    }

    public pyi(yt4 yt4Var, View view) {
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

    public pyi(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (View) objArr[5], (MaterialButton) objArr[4], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.t0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.s0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
