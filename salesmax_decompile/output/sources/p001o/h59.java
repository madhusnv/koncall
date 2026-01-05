package p001o;

import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.HorizontalScrollView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class h59 extends g59 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i T0 = null;
    public static final SparseIntArray U0 = null;
    public final View.OnClickListener H0;
    public final View.OnClickListener I0;
    public final View.OnClickListener J0;
    public final View.OnClickListener K0;
    public final View.OnClickListener L0;
    public final View.OnClickListener M0;
    public final View.OnClickListener N0;
    public final View.OnClickListener O0;
    public final View.OnLongClickListener P0;
    public final View.OnClickListener Q0;
    public final View.OnClickListener R0;
    public long S0;

    public h59(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 17, T0, U0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.S0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.S0 = 8L;
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
        ck6 ck6Var = this.G0;
        LeadsUser leadsUser = this.E0;
        Integer num = this.F0;
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
                ck6 ck6Var = this.G0;
                LeadsUser leadsUser = this.E0;
                Integer num = this.F0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), leadsUser);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var2 = this.G0;
                LeadsUser leadsUser2 = this.E0;
                Integer num2 = this.F0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), leadsUser2);
                    break;
                }
                break;
            case 4:
                ck6 ck6Var3 = this.G0;
                LeadsUser leadsUser3 = this.E0;
                Integer num3 = this.F0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leadsUser3);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var4 = this.G0;
                LeadsUser leadsUser4 = this.E0;
                Integer num4 = this.F0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leadsUser4);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var5 = this.G0;
                LeadsUser leadsUser5 = this.E0;
                Integer num5 = this.F0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leadsUser5);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var6 = this.G0;
                LeadsUser leadsUser6 = this.E0;
                Integer num6 = this.F0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leadsUser6);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var7 = this.G0;
                LeadsUser leadsUser7 = this.E0;
                Integer num7 = this.F0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), leadsUser7);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var8 = this.G0;
                LeadsUser leadsUser8 = this.E0;
                Integer num8 = this.F0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), leadsUser8);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var9 = this.G0;
                LeadsUser leadsUser9 = this.E0;
                Integer num9 = this.F0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), leadsUser9);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var10 = this.G0;
                LeadsUser leadsUser10 = this.E0;
                Integer num10 = this.F0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), leadsUser10);
                    break;
                }
                break;
        }
    }

    public void h0(ck6 ck6Var) {
        this.G0 = ck6Var;
        synchronized (this) {
            this.S0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(LeadsUser leadsUser) {
        this.E0 = leadsUser;
        synchronized (this) {
            this.S0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.F0 = num;
        synchronized (this) {
            this.S0 |= 1;
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
        String str4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        int i2;
        int i3;
        boolean z6;
        int i4;
        int i5;
        int i6;
        String lastActivityBody;
        String authorizationLevel;
        String lastActivityType;
        Long lastActivityTime;
        boolean showBottom;
        boolean zIsSelected;
        boolean showSelection;
        synchronized (this) {
            j = this.S0;
            this.S0 = 0L;
        }
        LeadsUser leadsUser = this.E0;
        long j2 = j & 12;
        Long l = null;
        String userActivityStatus = null;
        if (j2 != 0) {
            if (leadsUser != null) {
                userActivityStatus = leadsUser.getUserActivityStatus();
                lastActivityBody = leadsUser.getLastActivityBody();
                showBottom = leadsUser.getShowBottom();
                authorizationLevel = leadsUser.getAuthorizationLevel();
                zIsSelected = leadsUser.isSelected();
                lastActivityType = leadsUser.getLastActivityType();
                lastActivityTime = leadsUser.getLastActivityTime();
                showSelection = leadsUser.getShowSelection();
            } else {
                lastActivityBody = null;
                authorizationLevel = null;
                lastActivityType = null;
                lastActivityTime = null;
                showBottom = false;
                zIsSelected = false;
                showSelection = false;
            }
            if (j2 != 0) {
                j |= showBottom ? 512L : 256L;
            }
            if ((j & 12) != 0) {
                j |= showSelection ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            boolean z7 = userActivityStatus != null;
            boolean z8 = lastActivityBody == null;
            int i7 = showBottom ? 0 : 8;
            boolean z9 = lastActivityTime == null;
            z4 = !showSelection;
            int i8 = showSelection ? 0 : 8;
            if ((j & 12) != 0) {
                j = z7 ? j | 32 : j | 16;
            }
            if ((j & 12) != 0) {
                j = z8 ? j | MediaStatus.COMMAND_UNFOLLOW : j | MediaStatus.COMMAND_FOLLOW;
            }
            if ((j & 12) != 0) {
                j = z9 ? j | 8388608 : j | 4194304;
            }
            if ((j & 12) != 0) {
                j |= z4 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            str = lastActivityBody;
            i = i7;
            str2 = authorizationLevel;
            z5 = zIsSelected;
            str4 = lastActivityType;
            i2 = i8;
            i3 = z4 ? 0 : 8;
            str3 = userActivityStatus;
            l = lastActivityTime;
            z = z7;
            z2 = z8;
            z3 = z9;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            i = 0;
            z5 = false;
            i2 = 0;
            i3 = 0;
        }
        boolean z10 = (4194304 & j) != 0 && ewi.m25675V(l) == 0;
        boolean zIsEmpty = ((MediaStatus.COMMAND_FOLLOW & j) == 0 || str == null) ? false : str.isEmpty();
        if ((32 & j) != 0) {
            z6 = !(str3 != null ? str3.isEmpty() : false);
        } else {
            z6 = false;
        }
        long j3 = j & 12;
        if (j3 != 0) {
            if (!z) {
                z6 = false;
            }
            if (z2) {
                zIsEmpty = true;
            }
            boolean z11 = z3 ? true : z10;
            if (j3 != 0) {
                j |= z6 ? 128L : 64L;
            }
            if ((j & 12) != 0) {
                j |= zIsEmpty ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 12) != 0) {
                j |= z11 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            i4 = zIsEmpty ? 8 : 0;
            i5 = z11 ? 8 : 0;
        } else {
            i4 = 0;
            z6 = false;
            i5 = 0;
        }
        long j4 = j & 12;
        if (j4 != 0) {
            if (!z6) {
                z4 = false;
            }
            if (j4 != 0) {
                j |= z4 ? 2097152L : 1048576L;
            }
            i6 = z4 ? 0 : 8;
        } else {
            i6 = 0;
        }
        if ((12 & j) != 0) {
            this.n0.setVisibility(i);
            nr1.C1(this.o0, str);
            this.o0.setVisibility(i4);
            np3.m40895a(this.p0, z5);
            this.p0.setVisibility(i2);
            nr1.W0(this.r0, leadsUser);
            this.s0.setVisibility(i3);
            nr1.h0(this.s0, l);
            this.t0.setVisibility(i5);
            nr1.a3(this.t0, str4);
            this.B0.setVisibility(i6);
            nr1.M2(this.B0, leadsUser);
            nr1.m1(this.C0, leadsUser);
            nr1.f1(this.D0, str2);
        }
        if ((j & 8) != 0) {
            this.p0.setOnClickListener(this.N0);
            this.q0.setOnClickListener(this.M0);
            this.q0.setOnLongClickListener(this.P0);
            this.r0.setOnClickListener(this.R0);
            this.u0.setOnClickListener(this.L0);
            this.v0.setOnClickListener(this.I0);
            this.w0.setOnClickListener(this.J0);
            this.x0.setOnClickListener(this.K0);
            this.y0.setOnClickListener(this.Q0);
            this.z0.setOnClickListener(this.H0);
            this.A0.setOnClickListener(this.O0);
        }
    }

    public h59(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (HorizontalScrollView) objArr[5], (MaterialTextView) objArr[4], (CheckBox) objArr[14], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[16], (ShapeableImageView) objArr[15], (MaterialButton) objArr[7], (MaterialButton) objArr[6], (MaterialButton) objArr[12], (MaterialButton) objArr[11], (MaterialButton) objArr[9], (MaterialButton) objArr[10], (MaterialButton) objArr[8], (MaterialButton) objArr[13], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.S0 = -1L;
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
        this.D0.setTag(null);
        a0(view);
        this.H0 = new jbc(this, 8);
        this.I0 = new jbc(this, 4);
        this.J0 = new jbc(this, 10);
        this.K0 = new jbc(this, 9);
        this.L0 = new jbc(this, 5);
        this.M0 = new jbc(this, 1);
        this.N0 = new jbc(this, 11);
        this.O0 = new jbc(this, 6);
        this.P0 = new sbc(this, 2);
        this.Q0 = new jbc(this, 7);
        this.R0 = new jbc(this, 3);
        mo16291G();
    }
}
