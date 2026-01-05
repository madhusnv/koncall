package p001o;

import ai.salesmax.model.FormFields;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import p001o.ewi;

/* loaded from: classes.dex */
public class s14 extends r14 {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public final ConstraintLayout s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.itemLeadRoot, 2);
    }

    public s14(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, u0, v0));
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
            this.t0 = 8L;
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
        if (33 == i) {
            h0((ck6) obj);
        } else if (67 == i) {
            i0((FormFields) obj);
        } else {
            if (73 != i) {
                return false;
            }
            j0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.r14
    public void h0(ck6 ck6Var) {
        this.r0 = ck6Var;
    }

    @Override // p001o.r14
    public void i0(FormFields formFields) {
        this.p0 = formFields;
        synchronized (this) {
            this.t0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.r14
    public void j0(Integer num) {
        this.q0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.t0;
            this.t0 = 0L;
        }
        FormFields formFields = this.p0;
        if ((j & 10) != 0) {
            ce4.m21052o(this.o0, formFields);
        }
    }

    public s14(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[2], (RecyclerView) objArr[1]);
        this.t0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.s0 = constraintLayout;
        constraintLayout.setTag(null);
        this.o0.setTag(null);
        a0(view);
        mo16291G();
    }
}
