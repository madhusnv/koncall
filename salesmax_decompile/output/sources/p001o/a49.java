package p001o;

import ai.salesmax.model.LeadTeamMember;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class a49 extends z39 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i C0 = null;
    public static final SparseIntArray D0 = null;
    public final View.OnClickListener A0;
    public long B0;
    public final View.OnClickListener x0;
    public final View.OnClickListener y0;
    public final View.OnLongClickListener z0;

    public a49(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, C0, D0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.B0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.B0 = 16L;
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
        ck6 ck6Var = this.v0;
        LeadTeamMember leadTeamMember = this.t0;
        Integer num = this.u0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), leadTeamMember);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            k0((Integer) obj);
        } else if (33 == i) {
            i0((ck6) obj);
        } else if (7 == i) {
            h0((rog) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((LeadTeamMember) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.v0;
            LeadTeamMember leadTeamMember = this.t0;
            Integer num = this.u0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leadTeamMember);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.v0;
            LeadTeamMember leadTeamMember2 = this.t0;
            Integer num2 = this.u0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), leadTeamMember2);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ck6 ck6Var3 = this.v0;
        LeadTeamMember leadTeamMember3 = this.t0;
        Integer num3 = this.u0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), leadTeamMember3);
        }
    }

    public void h0(rog rogVar) {
        this.w0 = rogVar;
        synchronized (this) {
            this.B0 |= 4;
        }
        m28509h(7);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.v0 = ck6Var;
        synchronized (this) {
            this.B0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(LeadTeamMember leadTeamMember) {
        this.t0 = leadTeamMember;
        synchronized (this) {
            this.B0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.u0 = num;
        synchronized (this) {
            this.B0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006c A[PHI: r2
      0x006c: PHI (r2v2 long) = (r2v1 long), (r2v7 long) binds: [B:27:0x0056, B:36:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        boolean z;
        String userName;
        long createdAt;
        String teamRole;
        int i;
        synchronized (this) {
            j = this.B0;
            this.B0 = 0L;
        }
        rog rogVar = this.w0;
        LeadTeamMember leadTeamMember = this.t0;
        long j2 = j & 20;
        if (j2 != 0) {
            z = rogVar != null;
            if (j2 != 0) {
                j = z ? j | 64 : j | 32;
            }
        } else {
            z = false;
        }
        if ((j & 24) == 0 || leadTeamMember == null) {
            userName = null;
            createdAt = 0;
            teamRole = null;
        } else {
            createdAt = leadTeamMember.getCreatedAt();
            userName = leadTeamMember.getUserName();
            teamRole = leadTeamMember.getTeamRole();
        }
        boolean zM47035a = ((64 & j) == 0 || rogVar == null) ? false : rogVar.m47035a();
        long j3 = j & 20;
        if (j3 == 0) {
            i = 0;
        } else {
            if (!z) {
                zM47035a = false;
            }
            if (j3 != 0) {
                j |= zM47035a ? 256L : 128L;
            }
            if (!zM47035a) {
                i = 8;
            }
        }
        if ((j & 24) != 0) {
            nr1.h0(this.n0, Long.valueOf(createdAt));
            nr1.S0(this.p0, leadTeamMember);
            nr1.f1(this.r0, userName);
            nr1.h2(this.s0, teamRole);
        }
        if ((16 & j) != 0) {
            this.o0.setOnClickListener(this.y0);
            this.o0.setOnLongClickListener(this.z0);
            this.p0.setOnClickListener(this.x0);
            this.q0.setOnClickListener(this.A0);
        }
        if ((j & 20) != 0) {
            this.q0.setVisibility(i);
        }
    }

    public a49(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[5], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (MaterialButton) objArr[4], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.B0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        a0(view);
        this.x0 = new jbc(this, 3);
        this.y0 = new jbc(this, 1);
        this.z0 = new sbc(this, 2);
        this.A0 = new jbc(this, 4);
        mo16291G();
    }
}
