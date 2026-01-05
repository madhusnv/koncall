package p001o;

import ai.salesmax.model.VisitOutcome;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class l59 extends k59 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0 = null;
    public final MaterialCardView r0;
    public final MaterialTextView s0;
    public final View.OnClickListener t0;
    public final View.OnClickListener u0;
    public long v0;

    public l59(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, w0, x0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.v0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.v0 = 8L;
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
            i0((VisitOutcome) obj);
        } else {
            if (73 != i) {
                return false;
            }
            j0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.q0;
            VisitOutcome visitOutcome = this.o0;
            Integer num = this.p0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), visitOutcome);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.q0;
        VisitOutcome visitOutcome2 = this.o0;
        Integer num2 = this.p0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), visitOutcome2);
        }
    }

    public void h0(ck6 ck6Var) {
        this.q0 = ck6Var;
        synchronized (this) {
            this.v0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(VisitOutcome visitOutcome) {
        this.o0 = visitOutcome;
        synchronized (this) {
            this.v0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.p0 = num;
        synchronized (this) {
            this.v0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.v0;
            this.v0 = 0L;
        }
        VisitOutcome visitOutcome = this.o0;
        long j2 = 10 & j;
        String outcomeTitle = (j2 == 0 || visitOutcome == null) ? null : visitOutcome.getOutcomeTitle();
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.u0);
            this.r0.setOnClickListener(this.t0);
        }
        if (j2 != 0) {
            fjh.m26938c(this.s0, outcomeTitle);
        }
    }

    public l59(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[2]);
        this.v0 = -1L;
        this.n0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.r0 = materialCardView;
        materialCardView.setTag(null);
        MaterialTextView materialTextView = (MaterialTextView) objArr[1];
        this.s0 = materialTextView;
        materialTextView.setTag(null);
        a0(view);
        this.t0 = new jbc(this, 1);
        this.u0 = new jbc(this, 2);
        mo16291G();
    }
}
