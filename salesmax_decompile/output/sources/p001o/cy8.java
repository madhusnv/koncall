package p001o;

import ai.salesmax.model.FormField;
import android.text.Editable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p001o.ewi;
import p001o.fjh;
import p001o.x80;

/* loaded from: classes.dex */
public class cy8 extends by8 implements x80.InterfaceC18072a {
    public static final ewi.C13274i v0 = null;
    public static final SparseIntArray w0 = null;
    public final ConstraintLayout s0;
    public final fjh.InterfaceC13466b t0;
    public long u0;

    public cy8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, v0, w0));
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
            i0((FormField) obj);
        } else {
            if (73 != i) {
                return false;
            }
            j0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.x80.InterfaceC18072a
    /* renamed from: f */
    public final void mo17969f(int i, Editable editable) {
        ck6 ck6Var = this.r0;
        FormField formField = this.p0;
        if (ck6Var != null) {
            ck6Var.mo709c(this.n0, formField);
        }
    }

    public void h0(ck6 ck6Var) {
        this.r0 = ck6Var;
        synchronized (this) {
            this.u0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(FormField formField) {
        this.p0 = formField;
        synchronized (this) {
            this.u0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.q0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.u0;
            this.u0 = 0L;
        }
        FormField formField = this.p0;
        if ((10 & j) != 0) {
            nr1.b0(this.n0, formField);
            nr1.t0(this.o0, formField);
        }
        if ((j & 8) != 0) {
            fjh.m26939d(this.n0, null, null, this.t0, null);
        }
    }

    public cy8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextInputEditText) objArr[2], (TextInputLayout) objArr[1]);
        this.u0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.s0 = constraintLayout;
        constraintLayout.setTag(null);
        this.n0.setTag(null);
        this.o0.setTag(null);
        a0(view);
        this.t0 = new x80(this, 1);
        mo16291G();
    }
}
