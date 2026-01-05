package p001o;

import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class fw8 extends ew8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i C0 = null;
    public static final SparseIntArray D0 = null;
    public final View.OnLongClickListener A0;
    public long B0;
    public final View.OnClickListener w0;
    public final View.OnClickListener x0;
    public final View.OnClickListener y0;
    public final View.OnClickListener z0;

    public fw8(yt4 yt4Var, View view) {
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
            this.B0 = 8L;
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
        LeadsUser leadsUser = this.t0;
        Integer num = this.u0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), leadsUser);
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
            i0((LeadsUser) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.v0;
            LeadsUser leadsUser = this.t0;
            Integer num = this.u0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leadsUser);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.v0;
            LeadsUser leadsUser2 = this.t0;
            Integer num2 = this.u0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), leadsUser2);
                return;
            }
            return;
        }
        if (i == 4) {
            ck6 ck6Var3 = this.v0;
            LeadsUser leadsUser3 = this.t0;
            Integer num3 = this.u0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), leadsUser3);
                return;
            }
            return;
        }
        if (i != 5) {
            return;
        }
        ck6 ck6Var4 = this.v0;
        LeadsUser leadsUser4 = this.t0;
        Integer num4 = this.u0;
        if (ck6Var4 != null) {
            ck6Var4.mo708b(view, num4.intValue(), leadsUser4);
        }
    }

    public void h0(ck6 ck6Var) {
        this.v0 = ck6Var;
        synchronized (this) {
            this.B0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(LeadsUser leadsUser) {
        this.t0 = leadsUser;
        synchronized (this) {
            this.B0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.u0 = num;
        synchronized (this) {
            this.B0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String name;
        String profilePic;
        synchronized (this) {
            j = this.B0;
            this.B0 = 0L;
        }
        LeadsUser leadsUser = this.t0;
        long j2 = 12 & j;
        if (j2 == 0 || leadsUser == null) {
            name = null;
            profilePic = null;
        } else {
            name = leadsUser.getName();
            profilePic = leadsUser.getProfilePic();
        }
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.y0);
            this.o0.setOnClickListener(this.z0);
            this.o0.setOnLongClickListener(this.A0);
            this.p0.setOnClickListener(this.w0);
            this.q0.setOnClickListener(this.x0);
        }
        if (j2 != 0) {
            nr1.J2(this.p0, profilePic);
            nr1.f1(this.r0, name);
            nr1.a1(this.s0, leadsUser);
        }
    }

    public fw8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[5], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (ShapeableImageView) objArr[4], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.B0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        a0(view);
        this.w0 = new jbc(this, 3);
        this.x0 = new jbc(this, 4);
        this.y0 = new jbc(this, 5);
        this.z0 = new jbc(this, 1);
        this.A0 = new sbc(this, 2);
        mo16291G();
    }
}
