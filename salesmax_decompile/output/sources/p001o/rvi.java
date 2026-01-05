package p001o;

import ai.salesmax.model.AutoCompleteListModel;
import ai.salesmax.view.AllAutoCompleteTextView;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class rvi extends qvi {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0;
    public final ConstraintLayout v0;
    public long w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(z8e.viewAddLeadGuideline, 2);
        sparseIntArray.put(z8e.viewAddLeadTitle, 3);
        sparseIntArray.put(z8e.viewAddLeadValueLayout, 4);
        sparseIntArray.put(z8e.viewAddLeadBorder1, 5);
    }

    public rvi(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, x0, y0));
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
            this.w0 = 8L;
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
            j0((ck6) obj);
        } else if (67 == i) {
            k0((AutoCompleteListModel) obj);
        } else {
            if (73 != i) {
                return false;
            }
            l0((Integer) obj);
        }
        return true;
    }

    public void j0(ck6 ck6Var) {
        this.u0 = ck6Var;
        synchronized (this) {
            this.w0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(AutoCompleteListModel autoCompleteListModel) {
        this.s0 = autoCompleteListModel;
        synchronized (this) {
            this.w0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.t0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        ck6 ck6Var = this.u0;
        AutoCompleteListModel autoCompleteListModel = this.s0;
        if ((j & 11) != 0) {
            nr1.m40971p(this.q0, autoCompleteListModel, ck6Var);
        }
    }

    public rvi(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (View) objArr[5], (Guideline) objArr[2], (MaterialTextView) objArr[3], (AllAutoCompleteTextView) objArr[1], (TextInputLayout) objArr[4]);
        this.w0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.v0 = constraintLayout;
        constraintLayout.setTag(null);
        this.q0.setTag(null);
        a0(view);
        mo16291G();
    }
}
