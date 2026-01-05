package p001o;

import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.HorizontalScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class j59 extends i59 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i R0 = null;
    public static final SparseIntArray S0 = null;
    public final View.OnClickListener G0;
    public final View.OnClickListener H0;
    public final View.OnClickListener I0;
    public final View.OnLongClickListener J0;
    public final View.OnClickListener K0;
    public final View.OnClickListener L0;
    public final View.OnClickListener M0;
    public final View.OnClickListener N0;
    public final View.OnClickListener O0;
    public final View.OnClickListener P0;
    public long Q0;

    public j59(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 16, R0, S0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.Q0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.Q0 = 8L;
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
        ck6 ck6Var = this.F0;
        LeadsUser leadsUser = this.D0;
        Integer num = this.E0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), leadsUser);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            j0((Integer) obj);
        } else if (33 == i) {
            h0((ck6) obj);
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
        switch (i) {
            case 1:
                ck6 ck6Var = this.F0;
                LeadsUser leadsUser = this.D0;
                Integer num = this.E0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), leadsUser);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var2 = this.F0;
                LeadsUser leadsUser2 = this.D0;
                Integer num2 = this.E0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), leadsUser2);
                    break;
                }
                break;
            case 4:
                ck6 ck6Var3 = this.F0;
                LeadsUser leadsUser3 = this.D0;
                Integer num3 = this.E0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leadsUser3);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var4 = this.F0;
                LeadsUser leadsUser4 = this.D0;
                Integer num4 = this.E0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leadsUser4);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var5 = this.F0;
                LeadsUser leadsUser5 = this.D0;
                Integer num5 = this.E0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leadsUser5);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var6 = this.F0;
                LeadsUser leadsUser6 = this.D0;
                Integer num6 = this.E0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leadsUser6);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var7 = this.F0;
                LeadsUser leadsUser7 = this.D0;
                Integer num7 = this.E0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), leadsUser7);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var8 = this.F0;
                LeadsUser leadsUser8 = this.D0;
                Integer num8 = this.E0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), leadsUser8);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var9 = this.F0;
                LeadsUser leadsUser9 = this.D0;
                Integer num9 = this.E0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), leadsUser9);
                    break;
                }
                break;
        }
    }

    public void h0(ck6 ck6Var) {
        this.F0 = ck6Var;
        synchronized (this) {
            this.Q0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(LeadsUser leadsUser) {
        this.D0 = leadsUser;
        synchronized (this) {
            this.Q0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.E0 = num;
        synchronized (this) {
            this.Q0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        String str2;
        String str3;
        int i;
        boolean z;
        boolean z2;
        int i2;
        String authorizationLevel;
        String lastActivityType;
        boolean z3;
        boolean z4;
        synchronized (this) {
            j = this.Q0;
            this.Q0 = 0L;
        }
        LeadsUser leadsUser = this.D0;
        long j2 = j & 12;
        Long lastActivityTime = null;
        if (j2 != 0) {
            if (leadsUser != null) {
                String lastActivityBody = leadsUser.getLastActivityBody();
                boolean showBottom = leadsUser.getShowBottom();
                authorizationLevel = leadsUser.getAuthorizationLevel();
                boolean zIsSelected = leadsUser.isSelected();
                lastActivityType = leadsUser.getLastActivityType();
                str3 = lastActivityBody;
                lastActivityTime = leadsUser.getLastActivityTime();
                z4 = zIsSelected;
                z3 = showBottom;
            } else {
                str3 = null;
                authorizationLevel = null;
                lastActivityType = null;
                z3 = false;
                z4 = false;
            }
            if (j2 != 0) {
                j |= z3 ? 32L : 16L;
            }
            i = z3 ? 0 : 8;
            boolean z5 = lastActivityTime == null;
            if ((j & 12) != 0) {
                j = z5 ? j | 512 : j | 256;
            }
            str = authorizationLevel;
            str2 = lastActivityType;
            z = z4;
            z2 = z5;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            i = 0;
            z = false;
            z2 = false;
        }
        boolean z6 = (256 & j) != 0 && ewi.m25675V(lastActivityTime) == 0;
        long j3 = j & 12;
        if (j3 != 0) {
            boolean z7 = z2 ? true : z6;
            if (j3 != 0) {
                j |= z7 ? 128L : 64L;
            }
            i2 = z7 ? 8 : 0;
        } else {
            i2 = 0;
        }
        if ((12 & j) != 0) {
            this.n0.setVisibility(i);
            fjh.m26938c(this.o0, str3);
            np3.m40895a(this.p0, z);
            nr1.V0(this.r0, leadsUser);
            nr1.h0(this.s0, lastActivityTime);
            this.t0.setVisibility(i2);
            nr1.a3(this.t0, str2);
            nr1.M2(this.A0, leadsUser);
            nr1.m1(this.B0, leadsUser);
            nr1.f1(this.C0, str);
        }
        if ((j & 8) != 0) {
            this.p0.setOnClickListener(this.K0);
            this.q0.setOnClickListener(this.H0);
            this.q0.setOnLongClickListener(this.J0);
            this.r0.setOnClickListener(this.N0);
            this.u0.setOnClickListener(this.P0);
            this.v0.setOnClickListener(this.G0);
            this.w0.setOnClickListener(this.O0);
            this.x0.setOnClickListener(this.L0);
            this.y0.setOnClickListener(this.M0);
            this.z0.setOnClickListener(this.I0);
        }
    }

    public j59(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (HorizontalScrollView) objArr[5], (MaterialTextView) objArr[4], (CheckBox) objArr[13], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[15], (ShapeableImageView) objArr[14], (MaterialButton) objArr[6], (MaterialButton) objArr[11], (MaterialButton) objArr[10], (MaterialButton) objArr[8], (MaterialButton) objArr[9], (MaterialButton) objArr[7], (MaterialButton) objArr[12], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.Q0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        a0(view);
        this.G0 = new jbc(this, 9);
        this.H0 = new jbc(this, 1);
        this.I0 = new jbc(this, 5);
        this.J0 = new sbc(this, 2);
        this.K0 = new jbc(this, 10);
        this.L0 = new jbc(this, 6);
        this.M0 = new jbc(this, 7);
        this.N0 = new jbc(this, 3);
        this.O0 = new jbc(this, 8);
        this.P0 = new jbc(this, 4);
        mo16291G();
    }
}
