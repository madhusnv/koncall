package p001o;

import ai.salesmax.model.BusinessInfo;
import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class e09 extends d09 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i k1 = null;
    public static final SparseIntArray l1;
    public final View.OnClickListener R0;
    public final View.OnLongClickListener S0;
    public final View.OnLongClickListener T0;
    public final View.OnLongClickListener U0;
    public final View.OnClickListener V0;
    public final View.OnClickListener W0;
    public final View.OnClickListener X0;
    public final View.OnClickListener Y0;
    public final View.OnClickListener Z0;
    public final View.OnClickListener a1;
    public final View.OnClickListener b1;
    public final View.OnLongClickListener c1;
    public final View.OnClickListener d1;
    public final View.OnClickListener e1;
    public final View.OnClickListener f1;
    public final View.OnClickListener g1;
    public final View.OnClickListener h1;
    public final View.OnClickListener i1;
    public long j1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        l1 = sparseIntArray;
        sparseIntArray.put(z8e.frame_container_ivContactProfilePicInLead, 25);
    }

    public e09(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 26, k1, l1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.j1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.j1 = 16L;
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
            ck6 ck6Var = this.P0;
            Leads leads = this.N0;
            Integer num = this.O0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), leads);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.P0;
            Leads leads2 = this.N0;
            Integer num2 = this.O0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), leads2);
            }
            return false;
        }
        if (i == 7) {
            ck6 ck6Var3 = this.P0;
            Leads leads3 = this.N0;
            Integer num3 = this.O0;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), leads3);
            }
            return false;
        }
        if (i != 15) {
            return false;
        }
        ck6 ck6Var4 = this.P0;
        Leads leads4 = this.N0;
        Integer num4 = this.O0;
        if (ck6Var4 != null) {
            return ck6Var4.mo707a(view, num4.intValue(), leads4);
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
            j0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                ck6 ck6Var = this.P0;
                Leads leads = this.N0;
                Integer num = this.O0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), leads);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var2 = this.P0;
                Leads leads2 = this.N0;
                Integer num2 = this.O0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), leads2);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var3 = this.P0;
                Leads leads3 = this.N0;
                Integer num3 = this.O0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leads3);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var4 = this.P0;
                Leads leads4 = this.N0;
                Integer num4 = this.O0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leads4);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var5 = this.P0;
                Leads leads5 = this.N0;
                Integer num5 = this.O0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leads5);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var6 = this.P0;
                Leads leads6 = this.N0;
                Integer num6 = this.O0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leads6);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var7 = this.P0;
                Leads leads7 = this.N0;
                Integer num7 = this.O0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), leads7);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var8 = this.P0;
                Leads leads8 = this.N0;
                Integer num8 = this.O0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), leads8);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var9 = this.P0;
                Leads leads9 = this.N0;
                Integer num9 = this.O0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), leads9);
                    break;
                }
                break;
            case 13:
                ck6 ck6Var10 = this.P0;
                Leads leads10 = this.N0;
                Integer num10 = this.O0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), leads10);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var11 = this.P0;
                Leads leads11 = this.N0;
                Integer num11 = this.O0;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), leads11);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var12 = this.P0;
                Leads leads12 = this.N0;
                Integer num12 = this.O0;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), leads12);
                    break;
                }
                break;
            case 17:
                ck6 ck6Var13 = this.P0;
                Leads leads13 = this.N0;
                Integer num13 = this.O0;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), leads13);
                    break;
                }
                break;
            case 18:
                ck6 ck6Var14 = this.P0;
                Leads leads14 = this.N0;
                Integer num14 = this.O0;
                if (ck6Var14 != null) {
                    ck6Var14.mo708b(view, num14.intValue(), leads14);
                    break;
                }
                break;
        }
    }

    public void h0(rog rogVar) {
        this.Q0 = rogVar;
        synchronized (this) {
            this.j1 |= 1;
        }
        m28509h(7);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.P0 = ck6Var;
        synchronized (this) {
            this.j1 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(Leads leads) {
        this.N0 = leads;
        synchronized (this) {
            this.j1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.O0 = num;
        synchronized (this) {
            this.j1 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fe A[PHI: r2
      0x01fe: PHI (r2v5 long) = (r2v4 long), (r2v17 long) binds: [B:149:0x01e7, B:158:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022e A[PHI: r2
      0x022e: PHI (r2v7 long) = (r2v6 long), (r2v15 long) binds: [B:168:0x0213, B:177:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0162 A[PHI: r21
      0x0162: PHI (r21v1 java.lang.String) = (r21v0 java.lang.String), (r21v5 java.lang.String) binds: [B:92:0x0155, B:95:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        boolean z;
        long lastLeadAssignmentDateTimeInMillis;
        String str;
        BusinessInfo addedBusiness;
        String str2;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z6;
        long j2;
        boolean z7;
        boolean z8;
        int i7;
        int i8;
        int i9;
        String contactOwner;
        String latestRemark;
        boolean zIsSelected;
        boolean showBottom;
        boolean zIsNewItem;
        boolean showSelection;
        long j3;
        long j4;
        synchronized (this) {
            j = this.j1;
            this.j1 = 0L;
        }
        rog rogVar = this.Q0;
        Leads leads = this.N0;
        long j5 = j & 25;
        if (j5 != 0) {
            z = rogVar != null;
            if (j5 != 0) {
                j = z ? j | 268435456 : j | 134217728;
            }
        } else {
            z = false;
        }
        long j6 = j & 24;
        if (j6 != 0) {
            if (leads != null) {
                lastLeadAssignmentDateTimeInMillis = leads.getLastLeadAssignmentDateTimeInMillis();
                zIsSelected = leads.isSelected();
                showBottom = leads.getShowBottom();
                contactOwner = leads.getContactOwner();
                zIsNewItem = leads.isNewItem();
                addedBusiness = leads.getAddedBusiness();
                latestRemark = leads.getLatestRemark();
                showSelection = leads.getShowSelection();
            } else {
                lastLeadAssignmentDateTimeInMillis = 0;
                contactOwner = null;
                addedBusiness = null;
                latestRemark = null;
                zIsSelected = false;
                showBottom = false;
                zIsNewItem = false;
                showSelection = false;
            }
            if (j6 != 0) {
                j |= showBottom ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
            }
            if ((j & 24) != 0) {
                j |= zIsNewItem ? Javac.GENERATED_MEMBER : 8388608L;
            }
            if ((j & 24) != 0) {
                if (showSelection) {
                    j3 = j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                    j4 = 1073741824;
                } else {
                    j3 = j | 512;
                    j4 = 536870912;
                }
                j = j3 | j4;
            }
            boolean z9 = lastLeadAssignmentDateTimeInMillis == -1;
            int i10 = showBottom ? 0 : 8;
            int i11 = zIsNewItem ? 0 : 8;
            z3 = addedBusiness != null;
            z4 = latestRemark != null;
            int i12 = showSelection ? 8 : 0;
            z5 = !showSelection;
            int i13 = showSelection ? 0 : 8;
            if ((j & 24) != 0) {
                j |= z9 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            if ((j & 24) != 0) {
                j = z3 ? j | 4194304 : j | 2097152;
            }
            if ((j & 24) != 0) {
                j = z4 ? j | MediaStatus.COMMAND_EDIT_TRACKS : j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            if ((j & 24) != 0) {
                j |= z5 ? 1048576L : 524288L;
            }
            i = z9 ? 8 : 0;
            z2 = zIsSelected;
            i2 = i10;
            str2 = contactOwner;
            i3 = i11;
            str = latestRemark;
            i4 = i13;
            i5 = i12;
            i6 = z5 ? 0 : 8;
        } else {
            lastLeadAssignmentDateTimeInMillis = 0;
            str = null;
            addedBusiness = null;
            str2 = null;
            i = 0;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if ((j & 4194304) == 0) {
            z6 = false;
        } else {
            website = addedBusiness != null ? addedBusiness.getWebsite() : null;
            if (website != null) {
                z6 = true;
            }
        }
        boolean z10 = ((j & MediaStatus.COMMAND_EDIT_TRACKS) == 0 || str == "") ? false : true;
        boolean zM47035a = ((268435456 & j) == 0 || rogVar == null) ? false : rogVar.m47035a();
        long j7 = j & 24;
        if (j7 != 0) {
            if (!z4) {
                z10 = false;
            }
            if (!z3) {
                z6 = false;
            }
            if (j7 != 0) {
                j |= z10 ? 67108864L : 33554432L;
            }
            if ((j & 24) != 0) {
                j = z6 ? j | MediaStatus.COMMAND_STREAM_TRANSFER : j | MediaStatus.COMMAND_UNFOLLOW;
            }
            j2 = 25;
        } else {
            z10 = false;
            j2 = 25;
            z6 = false;
        }
        long j8 = j & j2;
        if (j8 != 0) {
            if (!z) {
                zM47035a = false;
            }
            z7 = true;
            z8 = !zM47035a;
            if (j8 != 0) {
                j = z8 ? j | 256 : j | 128;
            }
        } else {
            z7 = true;
            z8 = false;
        }
        if ((MediaStatus.COMMAND_STREAM_TRANSFER & j) == 0) {
            z7 = false;
        } else {
            if (addedBusiness != null) {
                website = addedBusiness.getWebsite();
            }
            if (website == "") {
            }
        }
        long j9 = j & 24;
        if (j9 == 0) {
            i7 = 0;
        } else {
            if (!z10) {
                z5 = false;
            }
            if (j9 != 0) {
                j |= z5 ? 64L : 32L;
            }
            if (!z5) {
                i7 = 8;
            }
        }
        boolean zHasContactOwner = ((j & 256) == 0 || leads == null) ? false : leads.hasContactOwner();
        long j10 = j & 25;
        if (j10 == 0) {
            i8 = 0;
        } else {
            if (!z8) {
                zHasContactOwner = false;
            }
            if (j10 != 0) {
                j |= zHasContactOwner ? 17179869184L : 8589934592L;
            }
            if (!zHasContactOwner) {
                i8 = 4;
            }
        }
        long j11 = j & 24;
        if (j11 != 0) {
            if (!z6) {
                z7 = false;
            }
            if (j11 != 0) {
                j |= z7 ? 4294967296L : 2147483648L;
            }
            i9 = z7 ? 0 : 8;
        } else {
            i9 = 0;
        }
        if ((j & 24) != 0) {
            this.n0.setVisibility(i2);
            this.o0.setVisibility(i3);
            this.p0.setVisibility(i5);
            nr1.q1(this.p0, Long.valueOf(lastLeadAssignmentDateTimeInMillis));
            this.r0.setVisibility(i9);
            np3.m40895a(this.s0, z2);
            this.s0.setVisibility(i4);
            nr1.N0(this.u0, leads);
            nr1.X0(this.v0, leads);
            nr1.m40952W(this.y0, leads);
            nr1.m40944O(this.D0, leads);
            nr1.g1(this.D0, str2);
            this.H0.setVisibility(i);
            nr1.K0(this.H0, Long.valueOf(lastLeadAssignmentDateTimeInMillis));
            this.I0.setVisibility(i7);
            nr1.O0(this.I0, leads);
            nr1.d1(this.J0, leads);
            nr1.Z0(this.K0, leads);
            fu5.m27486a(this.L0, leads);
            this.M0.setVisibility(i6);
            nr1.R0(this.M0, leads);
        }
        if ((16 & j) != 0) {
            this.s0.setOnClickListener(this.X0);
            this.t0.setOnClickListener(this.Y0);
            this.t0.setOnLongClickListener(this.U0);
            this.v0.setOnClickListener(this.i1);
            this.v0.setOnLongClickListener(this.c1);
            this.w0.setOnClickListener(this.Z0);
            this.x0.setOnClickListener(this.W0);
            this.y0.setOnClickListener(this.a1);
            this.z0.setOnClickListener(this.e1);
            this.A0.setOnClickListener(this.g1);
            this.B0.setOnClickListener(this.b1);
            this.C0.setOnClickListener(this.h1);
            this.C0.setOnLongClickListener(this.T0);
            this.D0.setOnClickListener(this.f1);
            this.D0.setOnLongClickListener(this.S0);
            this.E0.setOnClickListener(this.d1);
            this.F0.setOnClickListener(this.V0);
            this.G0.setOnClickListener(this.R0);
        }
        if ((j & 25) != 0) {
            this.D0.setVisibility(i8);
        }
    }

    public e09(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (HorizontalScrollView) objArr[14], (TextView) objArr[3], (MaterialTextView) objArr[10], (FrameLayout) objArr[25], (ShapeableImageView) objArr[7], (CheckBox) objArr[9], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[5], (ShapeableImageView) objArr[2], (MaterialButton) objArr[20], (MaterialButton) objArr[15], (MaterialButton) objArr[16], (MaterialButton) objArr[17], (MaterialButton) objArr[24], (MaterialButton) objArr[23], (MaterialButton) objArr[21], (Chip) objArr[13], (MaterialButton) objArr[22], (MaterialButton) objArr[19], (MaterialButton) objArr[18], (MaterialTextView) objArr[4], (MaterialTextView) objArr[12], (MaterialTextView) objArr[6], (MaterialTextView) objArr[8], (MaterialTextView) objArr[1], (MaterialTextView) objArr[11]);
        this.j1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
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
        this.F0.setTag(null);
        this.G0.setTag(null);
        this.H0.setTag(null);
        this.I0.setTag(null);
        this.J0.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        a0(view);
        this.R0 = new jbc(this, 11);
        this.S0 = new sbc(this, 7);
        this.T0 = new sbc(this, 15);
        this.U0 = new sbc(this, 2);
        this.V0 = new jbc(this, 12);
        this.W0 = new jbc(this, 8);
        this.X0 = new jbc(this, 5);
        this.Y0 = new jbc(this, 1);
        this.Z0 = new jbc(this, 13);
        this.a1 = new jbc(this, 9);
        this.b1 = new jbc(this, 17);
        this.c1 = new sbc(this, 4);
        this.d1 = new jbc(this, 16);
        this.e1 = new jbc(this, 10);
        this.f1 = new jbc(this, 6);
        this.g1 = new jbc(this, 18);
        this.h1 = new jbc(this, 14);
        this.i1 = new jbc(this, 3);
        mo16291G();
    }
}
