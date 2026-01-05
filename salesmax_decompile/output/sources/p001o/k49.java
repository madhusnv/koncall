package p001o;

import ai.salesmax.model.TemplateVariable;
import ai.salesmax.view.AllAutoCompleteTextView;
import android.text.Editable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.fjh;
import p001o.x80;

/* loaded from: classes.dex */
public class k49 extends j49 implements x80.InterfaceC18072a {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public final ConstraintLayout v0;
    public final fjh.InterfaceC13466b w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.tvVariableSelectionLayout, 4);
        sparseIntArray.put(z8e.tvVariableDefaultValue, 5);
    }

    public k49(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, y0, z0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.x0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.x0 = 8L;
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
        } else if (73 == i) {
            j0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((TemplateVariable) obj);
        }
        return true;
    }

    @Override // p001o.x80.InterfaceC18072a
    /* renamed from: f */
    public final void mo17969f(int i, Editable editable) {
        ck6 ck6Var = this.u0;
        TemplateVariable templateVariable = this.s0;
        if (ck6Var != null) {
            ck6Var.mo709c(this.p0, templateVariable);
        }
    }

    public void h0(ck6 ck6Var) {
        this.u0 = ck6Var;
        synchronized (this) {
            this.x0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(TemplateVariable templateVariable) {
        this.s0 = templateVariable;
        synchronized (this) {
            this.x0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.t0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        ck6 ck6Var = this.u0;
        TemplateVariable templateVariable = this.s0;
        long j2 = 13 & j;
        if ((12 & j) != 0) {
            nr1.M1(this.n0, templateVariable);
            nr1.G1(this.p0, templateVariable);
        }
        if ((j & 8) != 0) {
            fjh.m26939d(this.p0, null, null, this.w0, null);
        }
        if (j2 != 0) {
            nr1.m40976u(this.q0, templateVariable, ck6Var);
        }
    }

    public k49(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[1], (TextInputLayout) objArr[5], (TextInputEditText) objArr[3], (AllAutoCompleteTextView) objArr[2], (TextInputLayout) objArr[4]);
        this.x0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.v0 = constraintLayout;
        constraintLayout.setTag(null);
        this.n0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        a0(view);
        this.w0 = new x80(this, 1);
        mo16291G();
    }
}
