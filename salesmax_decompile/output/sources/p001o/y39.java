package p001o;

import ai.salesmax.model.LeadTeamMember;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class y39 extends x39 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0 = null;
    public final View.OnLongClickListener v0;
    public final View.OnClickListener w0;
    public long x0;

    public y39(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, y0, z0));
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

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        ck6 ck6Var = this.u0;
        LeadTeamMember leadTeamMember = this.s0;
        Integer num = this.t0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), leadTeamMember);
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
            i0((LeadTeamMember) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.u0;
        LeadTeamMember leadTeamMember = this.s0;
        Integer num = this.t0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), leadTeamMember);
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

    public void i0(LeadTeamMember leadTeamMember) {
        this.s0 = leadTeamMember;
        synchronized (this) {
            this.x0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.t0 = num;
        synchronized (this) {
            this.x0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String teamName;
        long createdAt;
        String description;
        String teamRole;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        LeadTeamMember leadTeamMember = this.s0;
        long j2 = 12 & j;
        if (j2 == 0 || leadTeamMember == null) {
            teamName = null;
            createdAt = 0;
            description = null;
            teamRole = null;
        } else {
            teamName = leadTeamMember.getTeamName();
            description = leadTeamMember.getDescription();
            teamRole = leadTeamMember.getTeamRole();
            createdAt = leadTeamMember.getCreatedAt();
        }
        if (j2 != 0) {
            nr1.h0(this.n0, Long.valueOf(createdAt));
            nr1.h2(this.p0, teamRole);
            nr1.f1(this.q0, teamName);
            fjh.m26938c(this.r0, description);
        }
        if ((j & 8) != 0) {
            this.o0.setOnClickListener(this.w0);
            this.o0.setOnLongClickListener(this.v0);
        }
    }

    public y39(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[4], (MaterialCardView) objArr[0], (MaterialButton) objArr[3], (MaterialTextView) objArr[1], (MaterialTextView) objArr[2]);
        this.x0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        a0(view);
        this.v0 = new sbc(this, 2);
        this.w0 = new jbc(this, 1);
        mo16291G();
    }
}
