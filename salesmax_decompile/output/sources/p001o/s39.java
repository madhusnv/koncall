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
public class s39 extends r39 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final SparseIntArray A0 = null;
    public static final ewi.C13274i z0 = null;
    public final View.OnClickListener v0;
    public final View.OnClickListener w0;
    public final View.OnLongClickListener x0;
    public long y0;

    public s39(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, z0, A0));
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
            this.y0 = 16L;
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
        ck6 ck6Var = this.t0;
        LeadsTeam leadsTeam = this.r0;
        Integer num = this.s0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), leadsTeam);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            i0((ck6) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else if (7 == i) {
            h0((String) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((LeadsTeam) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.t0;
            LeadsTeam leadsTeam = this.r0;
            Integer num = this.s0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leadsTeam);
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        ck6 ck6Var2 = this.t0;
        LeadsTeam leadsTeam2 = this.r0;
        Integer num2 = this.s0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), leadsTeam2);
        }
    }

    public void h0(String str) {
        this.u0 = str;
        synchronized (this) {
            this.y0 |= 4;
        }
        m28509h(7);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.t0 = ck6Var;
        synchronized (this) {
            this.y0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(LeadsTeam leadsTeam) {
        this.r0 = leadsTeam;
        synchronized (this) {
            this.y0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.s0 = num;
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
        String str = this.u0;
        LeadsTeam leadsTeam = this.r0;
        long j2 = 20 & j;
        long j3 = 24 & j;
        if (j3 == 0 || leadsTeam == null) {
            teamName = null;
            description = null;
        } else {
            teamName = leadsTeam.getTeamName();
            description = leadsTeam.getDescription();
        }
        if ((j & 16) != 0) {
            this.n0.setOnClickListener(this.w0);
            this.n0.setOnLongClickListener(this.x0);
            this.o0.setOnClickListener(this.v0);
        }
        if (j2 != 0) {
            fjh.m26938c(this.o0, str);
        }
        if (j3 != 0) {
            nr1.f1(this.p0, teamName);
            nr1.f1(this.q0, description);
        }
    }

    public s39(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[0], (MaterialButton) objArr[3], (MaterialTextView) objArr[1], (MaterialTextView) objArr[2]);
        this.y0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        a0(view);
        this.v0 = new jbc(this, 3);
        this.w0 = new jbc(this, 1);
        this.x0 = new sbc(this, 2);
        mo16291G();
    }
}
