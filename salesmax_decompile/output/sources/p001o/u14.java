package p001o;

import ai.salesmax.custom.CustomFormDataObservable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class u14 extends t14 {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public final ConstraintLayout s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.customValueItemLeadRoot, 2);
    }

    public u14(yt4 yt4Var, View view) {
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
            this.t0 = 16L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((CustomFormDataObservable) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            h0((ck6) obj);
        } else if (67 == i) {
            i0((CustomFormDataObservable) obj);
        } else {
            if (73 != i) {
                return false;
            }
            j0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.t14
    public void h0(ck6 ck6Var) {
        this.r0 = ck6Var;
    }

    @Override // p001o.t14
    public void i0(CustomFormDataObservable customFormDataObservable) {
        g0(0, customFormDataObservable);
        this.p0 = customFormDataObservable;
        synchronized (this) {
            this.t0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.t14
    public void j0(Integer num) {
        this.q0 = num;
    }

    public final boolean k0(CustomFormDataObservable customFormDataObservable, int i) {
        if (i == 0) {
            synchronized (this) {
                this.t0 |= 1;
            }
            return true;
        }
        if (i != 76) {
            return false;
        }
        synchronized (this) {
            this.t0 |= 8;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.t0;
            this.t0 = 0L;
        }
        CustomFormDataObservable customFormDataObservable = this.p0;
        long j2 = j & 25;
        String strM166k = (j2 == 0 || customFormDataObservable == null) ? null : customFormDataObservable.m166k();
        if (j2 != 0) {
            nr1.c0(this.o0, strM166k);
        }
    }

    public u14(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (MaterialCardView) objArr[2], (MaterialTextView) objArr[1]);
        this.t0 = -1L;
        this.o0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.s0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
