package p001o;

import ai.salesmax.model.LeadsTeam;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class c49 extends b49 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final SparseIntArray A0;
    public static final ewi.C13274i z0 = null;
    public final View.OnClickListener v0;
    public final View.OnClickListener w0;
    public final View.OnLongClickListener x0;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(z8e.createdAt, 4);
    }

    public c49(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, z0, A0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.y0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.y0 = 8L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        ck6 ck6Var = this.u0;
        LeadsTeam leadsTeam = this.s0;
        Integer num = this.t0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), leadsTeam);
        }
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
            i0((LeadsTeam) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.u0;
            LeadsTeam leadsTeam = this.s0;
            Integer num = this.t0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leadsTeam);
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        ck6 ck6Var2 = this.u0;
        LeadsTeam leadsTeam2 = this.s0;
        Integer num2 = this.t0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), leadsTeam2);
        }
    }

    public void h0(ck6 ck6Var) {
        this.u0 = ck6Var;
        synchronized (this) {
            this.y0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(LeadsTeam leadsTeam) {
        this.s0 = leadsTeam;
        synchronized (this) {
            this.y0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.t0 = num;
        synchronized (this) {
            this.y0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String teamName;
        String description;
        synchronized (this) {
            j = this.y0;
            this.y0 = 0L;
        }
        LeadsTeam leadsTeam = this.s0;
        long j2 = 12 & j;
        if (j2 == 0 || leadsTeam == null) {
            teamName = null;
            description = null;
        } else {
            teamName = leadsTeam.getTeamName();
            description = leadsTeam.getDescription();
        }
        if ((j & 8) != 0) {
            this.o0.setOnClickListener(this.v0);
            this.o0.setOnLongClickListener(this.x0);
            this.r0.setOnClickListener(this.w0);
        }
        if (j2 != 0) {
            nr1.f1(this.p0, teamName);
            fjh.m26938c(this.q0, description);
        }
    }

    public c49(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[4], (MaterialCardView) objArr[0], (MaterialTextView) objArr[1], (MaterialTextView) objArr[2], (MaterialButton) objArr[3]);
        this.y0 = -1L;
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        a0(view);
        this.v0 = new jbc(this, 1);
        this.w0 = new jbc(this, 3);
        this.x0 = new sbc(this, 2);
        mo16291G();
    }
}
