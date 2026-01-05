package p001o;

import ai.salesmax.model.AutoCompleteListModel;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class l14 extends k14 {
    public static final ewi.C13274i v0 = null;
    public static final SparseIntArray w0;
    public final ConstraintLayout t0;
    public long u0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        w0 = sparseIntArray;
        sparseIntArray.put(z8e.tvDate, 2);
        sparseIntArray.put(z8e.homeTeamNameInputLayout, 3);
    }

    public l14(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, v0, w0));
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
            this.u0 = 8L;
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
            i0((AutoCompleteListModel) obj);
        } else {
            if (73 != i) {
                return false;
            }
            j0((Integer) obj);
        }
        return true;
    }

    public void h0(ck6 ck6Var) {
        this.s0 = ck6Var;
        synchronized (this) {
            this.u0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(AutoCompleteListModel autoCompleteListModel) {
        this.q0 = autoCompleteListModel;
        synchronized (this) {
            this.u0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.r0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.u0;
            this.u0 = 0L;
        }
        ck6 ck6Var = this.s0;
        AutoCompleteListModel autoCompleteListModel = this.q0;
        if ((j & 11) != 0) {
            nr1.m40973r(this.n0, autoCompleteListModel, ck6Var);
        }
    }

    public l14(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AutoCompleteTextView) objArr[1], (TextInputLayout) objArr[3], (MaterialTextView) objArr[2]);
        this.u0 = -1L;
        this.n0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.t0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
