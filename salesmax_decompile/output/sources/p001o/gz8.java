package p001o;

import ai.salesmax.model.FormDefinition;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class gz8 extends fz8 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0 = null;
    public final View.OnClickListener u0;
    public final View.OnClickListener v0;
    public long w0;

    public gz8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, x0, y0));
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
            this.w0 = 16L;
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
            i0((ck6) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else if (7 == i) {
            h0((rog) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((FormDefinition) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.s0;
            FormDefinition formDefinition = this.q0;
            Integer num = this.r0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), formDefinition);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.s0;
        FormDefinition formDefinition2 = this.q0;
        Integer num2 = this.r0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), formDefinition2);
        }
    }

    public void h0(rog rogVar) {
        this.t0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.s0 = ck6Var;
        synchronized (this) {
            this.w0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(FormDefinition formDefinition) {
        this.q0 = formDefinition;
        synchronized (this) {
            this.w0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.r0 = num;
        synchronized (this) {
            this.w0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String displayName;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        FormDefinition formDefinition = this.q0;
        long j2 = j & 24;
        String formTitle = null;
        int i = 0;
        if (j2 != 0) {
            if (formDefinition != null) {
                formTitle = formDefinition.getFormTitle();
                displayName = formDefinition.getDisplayName();
            } else {
                displayName = null;
            }
            boolean z = formTitle != "";
            if (j2 != 0) {
                j |= z ? 64L : 32L;
            }
            if (!z) {
                i = 8;
            }
        } else {
            displayName = null;
        }
        if ((16 & j) != 0) {
            this.n0.setOnClickListener(this.v0);
            this.p0.setOnClickListener(this.u0);
        }
        if ((j & 24) != 0) {
            this.o0.setVisibility(i);
            fjh.m26938c(this.o0, formTitle);
            nr1.f1(this.p0, displayName);
        }
    }

    public gz8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[0], (MaterialTextView) objArr[2], (MaterialTextView) objArr[1]);
        this.w0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        a0(view);
        this.u0 = new jbc(this, 2);
        this.v0 = new jbc(this, 1);
        mo16291G();
    }
}
