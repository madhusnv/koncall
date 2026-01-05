package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class jof extends iof {
    public static final ewi.C13274i s0 = null;
    public static final SparseIntArray t0;
    public final ConstraintLayout q0;
    public long r0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        t0 = sparseIntArray;
        sparseIntArray.put(z8e.sheetTitle, 1);
        sparseIntArray.put(z8e.missedActionClose, 2);
        sparseIntArray.put(z8e.rvLeadsActionsList, 3);
    }

    public jof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, s0, t0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.r0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.r0 = 1L;
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
            this.r0 = 0L;
        }
    }

    public jof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[2], (RecyclerView) objArr[3], (MaterialTextView) objArr[1]);
        this.r0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.q0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
