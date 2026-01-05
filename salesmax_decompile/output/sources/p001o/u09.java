package p001o;

import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class u09 extends t09 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0 = null;
    public final View.OnClickListener t0;
    public final View.OnClickListener u0;
    public long v0;

    public u09(yt4 yt4Var, View view) {
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
            k0((ck6) obj);
        } else if (67 == i) {
            l0((LeadsUser) obj);
        } else {
            if (73 != i) {
                return false;
            }
            m0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.s0;
            LeadsUser leadsUser = this.q0;
            Integer num = this.r0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leadsUser);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.s0;
        LeadsUser leadsUser2 = this.q0;
        Integer num2 = this.r0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), leadsUser2);
        }
    }

    @Override // p001o.t09
    public void k0(ck6 ck6Var) {
        this.s0 = ck6Var;
        synchronized (this) {
            this.v0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    @Override // p001o.t09
    public void l0(LeadsUser leadsUser) {
        this.q0 = leadsUser;
        synchronized (this) {
            this.v0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.t09
    public void m0(Integer num) {
        this.r0 = num;
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
        LeadsUser leadsUser = this.q0;
        long j2 = 10 & j;
        String name = (j2 == 0 || leadsUser == null) ? null : leadsUser.getName();
        if (j2 != 0) {
            nr1.f1(this.n0, name);
            nr1.V0(this.o0, leadsUser);
        }
        if ((j & 8) != 0) {
            this.o0.setOnClickListener(this.u0);
            this.p0.setOnClickListener(this.t0);
        }
    }

    public u09(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[2], (ShapeableImageView) objArr[1], (MaterialCardView) objArr[0]);
        this.v0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        a0(view);
        this.t0 = new jbc(this, 1);
        this.u0 = new jbc(this, 2);
        mo16291G();
    }
}
