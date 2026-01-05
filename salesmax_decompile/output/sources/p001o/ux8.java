package p001o;

import ai.salesmax.model.FormField;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class ux8 extends tx8 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i E0 = null;
    public static final SparseIntArray F0 = null;
    public final View.OnClickListener A0;
    public final View.OnClickListener B0;
    public final View.OnClickListener C0;
    public long D0;
    public final ConstraintLayout x0;
    public final View.OnClickListener y0;
    public final View.OnClickListener z0;

    public ux8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, E0, F0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.D0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.D0 = 8L;
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
            i0((FormField) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.w0;
            FormField formField = this.u0;
            Integer num = this.v0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), formField);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.w0;
            FormField formField2 = this.u0;
            Integer num2 = this.v0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), formField2);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var3 = this.w0;
            FormField formField3 = this.u0;
            Integer num3 = this.v0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), formField3);
                return;
            }
            return;
        }
        if (i == 4) {
            ck6 ck6Var4 = this.w0;
            FormField formField4 = this.u0;
            Integer num4 = this.v0;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), formField4);
                return;
            }
            return;
        }
        if (i != 5) {
            return;
        }
        ck6 ck6Var5 = this.w0;
        FormField formField5 = this.u0;
        Integer num5 = this.v0;
        if (ck6Var5 != null) {
            ck6Var5.mo708b(view, num5.intValue(), formField5);
        }
    }

    public void h0(ck6 ck6Var) {
        this.w0 = ck6Var;
        synchronized (this) {
            this.D0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(FormField formField) {
        this.u0 = formField;
        synchronized (this) {
            this.D0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.v0 = num;
        synchronized (this) {
            this.D0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.D0;
            this.D0 = 0L;
        }
        FormField formField = this.u0;
        long j2 = 12 & j;
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.z0);
            this.o0.setOnClickListener(this.B0);
            this.p0.setOnClickListener(this.y0);
            this.q0.setOnClickListener(this.C0);
            this.r0.setOnClickListener(this.A0);
        }
        if (j2 != 0) {
            nr1.s0(this.s0, formField);
            nr1.a0(this.t0, formField);
        }
    }

    public ux8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[7], (Button) objArr[5], (Button) objArr[3], (Button) objArr[6], (Button) objArr[4], (MaterialTextView) objArr[1], (MaterialButtonToggleGroup) objArr[2]);
        this.D0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.x0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        this.y0 = new jbc(this, 1);
        this.z0 = new jbc(this, 5);
        this.A0 = new jbc(this, 2);
        this.B0 = new jbc(this, 3);
        this.C0 = new jbc(this, 4);
        mo16291G();
    }
}
