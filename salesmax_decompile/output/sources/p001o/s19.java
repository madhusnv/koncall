package p001o;

import ai.salesmax.model.Leads;
import ai.salesmax.model.PaymentDataInfo;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.HorizontalScrollView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class s19 extends r19 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i b1 = null;
    public static final SparseIntArray c1 = null;
    public final View.OnClickListener J0;
    public final View.OnClickListener K0;
    public final View.OnClickListener L0;
    public final View.OnClickListener M0;
    public final View.OnLongClickListener N0;
    public final View.OnClickListener O0;
    public final View.OnClickListener P0;
    public final View.OnClickListener Q0;
    public final View.OnClickListener R0;
    public final View.OnLongClickListener S0;
    public final View.OnClickListener T0;
    public final View.OnLongClickListener U0;
    public final View.OnClickListener V0;
    public final View.OnClickListener W0;
    public final View.OnClickListener X0;
    public final View.OnClickListener Y0;
    public final View.OnLongClickListener Z0;
    public long a1;

    public s19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 18, b1, c1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.a1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.a1 = 16L;
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
        if (i == 2) {
            ck6 ck6Var = this.H0;
            PaymentDataInfo paymentDataInfo = this.F0;
            Integer num = this.G0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), paymentDataInfo);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.H0;
            PaymentDataInfo paymentDataInfo2 = this.F0;
            Integer num2 = this.G0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), paymentDataInfo2);
            }
            return false;
        }
        if (i == 9) {
            ck6 ck6Var3 = this.H0;
            PaymentDataInfo paymentDataInfo3 = this.F0;
            Integer num3 = this.G0;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), paymentDataInfo3);
            }
            return false;
        }
        if (i != 12) {
            return false;
        }
        ck6 ck6Var4 = this.H0;
        PaymentDataInfo paymentDataInfo4 = this.F0;
        Integer num4 = this.G0;
        if (ck6Var4 != null) {
            return ck6Var4.mo707a(view, num4.intValue(), paymentDataInfo4);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (7 == i) {
            h0((rog) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else if (33 == i) {
            i0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((PaymentDataInfo) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                ck6 ck6Var = this.H0;
                PaymentDataInfo paymentDataInfo = this.F0;
                Integer num = this.G0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), paymentDataInfo);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var2 = this.H0;
                PaymentDataInfo paymentDataInfo2 = this.F0;
                Integer num2 = this.G0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), paymentDataInfo2);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var3 = this.H0;
                PaymentDataInfo paymentDataInfo3 = this.F0;
                Integer num3 = this.G0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), paymentDataInfo3);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var4 = this.H0;
                PaymentDataInfo paymentDataInfo4 = this.F0;
                Integer num4 = this.G0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), paymentDataInfo4);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var5 = this.H0;
                PaymentDataInfo paymentDataInfo5 = this.F0;
                Integer num5 = this.G0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), paymentDataInfo5);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var6 = this.H0;
                PaymentDataInfo paymentDataInfo6 = this.F0;
                Integer num6 = this.G0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), paymentDataInfo6);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var7 = this.H0;
                PaymentDataInfo paymentDataInfo7 = this.F0;
                Integer num7 = this.G0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), paymentDataInfo7);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var8 = this.H0;
                PaymentDataInfo paymentDataInfo8 = this.F0;
                Integer num8 = this.G0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), paymentDataInfo8);
                    break;
                }
                break;
            case 13:
                ck6 ck6Var9 = this.H0;
                PaymentDataInfo paymentDataInfo9 = this.F0;
                Integer num9 = this.G0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), paymentDataInfo9);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var10 = this.H0;
                PaymentDataInfo paymentDataInfo10 = this.F0;
                Integer num10 = this.G0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), paymentDataInfo10);
                    break;
                }
                break;
            case 15:
                ck6 ck6Var11 = this.H0;
                PaymentDataInfo paymentDataInfo11 = this.F0;
                Integer num11 = this.G0;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), paymentDataInfo11);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var12 = this.H0;
                PaymentDataInfo paymentDataInfo12 = this.F0;
                Integer num12 = this.G0;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), paymentDataInfo12);
                    break;
                }
                break;
            case 17:
                ck6 ck6Var13 = this.H0;
                PaymentDataInfo paymentDataInfo13 = this.F0;
                Integer num13 = this.G0;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), paymentDataInfo13);
                    break;
                }
                break;
        }
    }

    public void h0(rog rogVar) {
        this.I0 = rogVar;
        synchronized (this) {
            this.a1 |= 1;
        }
        m28509h(7);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.H0 = ck6Var;
        synchronized (this) {
            this.a1 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(PaymentDataInfo paymentDataInfo) {
        this.F0 = paymentDataInfo;
        synchronized (this) {
            this.a1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.G0 = num;
        synchronized (this) {
            this.a1 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0169 A[PHI: r31
      0x0169: PHI (r31v2 ai.salesmax.model.Leads) = (r31v1 ai.salesmax.model.Leads), (r31v3 ai.salesmax.model.Leads) binds: [B:100:0x0158, B:103:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc A[PHI: r2
      0x01bc: PHI (r2v7 long) = (r2v6 long), (r2v12 long) binds: [B:128:0x01a6, B:137:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        boolean z;
        String str;
        Leads contact;
        String str2;
        String str3;
        String str4;
        boolean z2;
        boolean showSelection;
        boolean z3;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        int i4;
        boolean z4;
        Leads leads;
        boolean zHasContactOwner;
        boolean z5;
        int i5;
        String note;
        String status;
        String paymentProvider;
        String paymentLinkUrl;
        boolean zIsSelected;
        boolean showBottom;
        synchronized (this) {
            j = this.a1;
            this.a1 = 0L;
        }
        rog rogVar = this.I0;
        PaymentDataInfo paymentDataInfo = this.F0;
        long j2 = j & 25;
        if (j2 != 0) {
            z = rogVar != null;
            if (j2 != 0) {
                j = z ? j | MediaStatus.COMMAND_FOLLOW : j | MediaStatus.COMMAND_DISLIKE;
            }
        } else {
            z = false;
        }
        long j3 = j & 24;
        if (j3 != 0) {
            if (paymentDataInfo != null) {
                note = paymentDataInfo.getNote();
                zIsSelected = paymentDataInfo.isSelected();
                showBottom = paymentDataInfo.getShowBottom();
                status = paymentDataInfo.getStatus();
                paymentProvider = paymentDataInfo.getPaymentProvider();
                paymentLinkUrl = paymentDataInfo.getPaymentLinkUrl();
                contact = paymentDataInfo.getContact();
                showSelection = paymentDataInfo.getShowSelection();
            } else {
                note = null;
                status = null;
                paymentProvider = null;
                paymentLinkUrl = null;
                contact = null;
                zIsSelected = false;
                showBottom = false;
                showSelection = false;
            }
            if (j3 != 0) {
                j |= showBottom ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            if ((j & 24) != 0) {
                j = showSelection ? j | MediaStatus.COMMAND_STREAM_TRANSFER : j | MediaStatus.COMMAND_UNFOLLOW;
            }
            z2 = note == null;
            int i6 = showBottom ? 0 : 8;
            boolean z6 = paymentLinkUrl != null;
            int i7 = showSelection ? 0 : 8;
            if ((j & 24) != 0) {
                j = z2 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL : j | 512;
            }
            if ((j & 24) != 0) {
                j |= z6 ? 1048576L : 524288L;
            }
            String contactOwner = contact != null ? contact.getContactOwner() : null;
            str = note;
            z3 = zIsSelected;
            i = i6;
            str2 = status;
            str3 = paymentProvider;
            i2 = z6 ? 0 : 8;
            i3 = i7;
            str4 = contactOwner;
        } else {
            str = null;
            contact = null;
            str2 = null;
            str3 = null;
            str4 = null;
            z2 = false;
            showSelection = false;
            z3 = false;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if ((j & 512) == 0) {
            zIsEmpty = false;
        } else {
            String strTrim = str != null ? str.trim() : null;
            if (strTrim != null) {
                zIsEmpty = strTrim.isEmpty();
            }
        }
        boolean zM47035a = ((MediaStatus.COMMAND_FOLLOW & j) == 0 || rogVar == null) ? false : rogVar.m47035a();
        long j4 = j & 24;
        if (j4 != 0) {
            if (z2) {
                zIsEmpty = true;
            }
            if (j4 != 0) {
                j |= zIsEmpty ? 4194304L : 2097152L;
            }
            i4 = zIsEmpty ? 8 : 0;
        } else {
            i4 = 0;
        }
        long j5 = j & 25;
        if (j5 != 0) {
            if (!z) {
                zM47035a = false;
            }
            z4 = !zM47035a;
            if (j5 != 0) {
                j = z4 ? j | 256 : j | 128;
            }
        } else {
            z4 = false;
        }
        if ((j & 256) == 0) {
            leads = contact;
            zHasContactOwner = false;
        } else {
            if (paymentDataInfo != null) {
                contact = paymentDataInfo.getContact();
            }
            if (contact != null) {
                zHasContactOwner = contact.hasContactOwner();
                leads = contact;
            }
        }
        long j6 = j & 25;
        if (j6 != 0) {
            if (!z4) {
                zHasContactOwner = false;
            }
            if (j6 != 0) {
                j = zHasContactOwner ? j | 64 : j | 32;
            }
        } else {
            zHasContactOwner = false;
        }
        if ((j & 64) != 0) {
            if (paymentDataInfo != null) {
                showSelection = paymentDataInfo.getShowSelection();
            }
            if ((j & 24) != 0) {
                j = showSelection ? j | MediaStatus.COMMAND_STREAM_TRANSFER : j | MediaStatus.COMMAND_UNFOLLOW;
            }
            z5 = !showSelection;
        } else {
            z5 = false;
        }
        long j7 = j & 25;
        if (j7 == 0) {
            i5 = 0;
        } else {
            if (!zHasContactOwner) {
                z5 = false;
            }
            if (j7 != 0) {
                j |= z5 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            if (!z5) {
                i5 = 4;
            }
        }
        if ((j & 24) != 0) {
            this.n0.setVisibility(i);
            np3.m40895a(this.o0, z3);
            this.o0.setVisibility(i3);
            nr1.X0(this.q0, leads);
            nr1.H1(this.r0, str3);
            nr1.m40937H(this.t0, paymentDataInfo);
            this.u0.setVisibility(i2);
            nr1.m40938I(this.v0, paymentDataInfo);
            nr1.m40944O(this.w0, leads);
            nr1.g1(this.w0, str4);
            nr1.v1(this.y0, paymentDataInfo);
            fjh.m26938c(this.z0, str);
            this.A0.setVisibility(i4);
            nr1.w1(this.B0, str2);
            nr1.f0(this.C0, paymentDataInfo);
            nr1.d1(this.D0, leads);
            nr1.Z0(this.E0, leads);
        }
        if ((16 & j) != 0) {
            this.o0.setOnClickListener(this.Y0);
            this.p0.setOnClickListener(this.J0);
            this.p0.setOnLongClickListener(this.N0);
            this.q0.setOnClickListener(this.O0);
            this.q0.setOnLongClickListener(this.U0);
            this.r0.setOnClickListener(this.V0);
            this.r0.setOnLongClickListener(this.Z0);
            this.s0.setOnClickListener(this.W0);
            this.t0.setOnClickListener(this.X0);
            this.u0.setOnClickListener(this.Q0);
            this.v0.setOnClickListener(this.T0);
            this.w0.setOnClickListener(this.R0);
            this.w0.setOnLongClickListener(this.S0);
            this.x0.setOnClickListener(this.K0);
            this.A0.setOnClickListener(this.L0);
            this.B0.setOnClickListener(this.P0);
            this.C0.setOnClickListener(this.M0);
        }
        if ((j & 25) != 0) {
            this.w0.setVisibility(i5);
        }
    }

    public s19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (HorizontalScrollView) objArr[12], (CheckBox) objArr[4], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (ShapeableImageView) objArr[8], (MaterialButton) objArr[13], (MaterialButton) objArr[17], (MaterialButton) objArr[15], (MaterialButton) objArr[16], (Chip) objArr[11], (MaterialButton) objArr[14], (MaterialTextView) objArr[9], (MaterialTextView) objArr[6], (MaterialCardView) objArr[5], (MaterialCardView) objArr[7], (MaterialTextView) objArr[10], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.a1 = -1L;
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
        this.E0.setTag(null);
        a0(view);
        this.J0 = new jbc(this, 1);
        this.K0 = new jbc(this, 14);
        this.L0 = new jbc(this, 6);
        this.M0 = new jbc(this, 10);
        this.N0 = new sbc(this, 2);
        this.O0 = new jbc(this, 3);
        this.P0 = new jbc(this, 7);
        this.Q0 = new jbc(this, 15);
        this.R0 = new jbc(this, 11);
        this.S0 = new sbc(this, 12);
        this.T0 = new jbc(this, 16);
        this.U0 = new sbc(this, 4);
        this.V0 = new jbc(this, 8);
        this.W0 = new jbc(this, 13);
        this.X0 = new jbc(this, 17);
        this.Y0 = new jbc(this, 5);
        this.Z0 = new sbc(this, 9);
        mo16291G();
    }
}
