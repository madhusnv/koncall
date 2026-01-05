package p001o;

import ai.salesmax.model.BusinessInfo;
import ai.salesmax.model.Leads;
import ai.salesmax.model.MissedOpportunitiesSummary;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class dx8 extends cx8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i X0 = null;
    public static final SparseIntArray Y0;
    public final ConstraintLayout K0;
    public final View.OnClickListener L0;
    public final View.OnClickListener M0;
    public final View.OnClickListener N0;
    public final View.OnClickListener O0;
    public final View.OnLongClickListener P0;
    public final View.OnClickListener Q0;
    public final View.OnClickListener R0;
    public final View.OnClickListener S0;
    public final View.OnClickListener T0;
    public final View.OnClickListener U0;
    public final View.OnLongClickListener V0;
    public long W0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y0 = sparseIntArray;
        sparseIntArray.put(z8e.frame_container_ivContactProfilePicInLead, 18);
    }

    public dx8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 19, X0, Y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.W0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.W0 = 32L;
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
            Leads leads = this.F0;
            ck6 ck6Var = this.I0;
            Integer num = this.H0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), leads);
            }
            return false;
        }
        if (i != 4) {
            return false;
        }
        Leads leads2 = this.F0;
        ck6 ck6Var2 = this.I0;
        Integer num2 = this.H0;
        if (ck6Var2 != null) {
            return ck6Var2.mo707a(view, num2.intValue(), leads2);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (7 == i) {
            h0((rog) obj);
        } else if (73 == i) {
            l0((Integer) obj);
        } else if (61 == i) {
            j0((Leads) obj);
        } else if (33 == i) {
            i0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((MissedOpportunitiesSummary) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            Leads leads = this.F0;
            ck6 ck6Var = this.I0;
            Integer num = this.H0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leads);
            }
            return;
        }
        if (i == 3) {
            Leads leads2 = this.F0;
            ck6 ck6Var2 = this.I0;
            Integer num2 = this.H0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), leads2);
                return;
            }
            return;
        }
        switch (i) {
            case 5:
                Leads leads3 = this.F0;
                ck6 ck6Var3 = this.I0;
                Integer num3 = this.H0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leads3);
                    break;
                }
                break;
            case 6:
                Leads leads4 = this.F0;
                ck6 ck6Var4 = this.I0;
                Integer num4 = this.H0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leads4);
                    break;
                }
                break;
            case 7:
                Leads leads5 = this.F0;
                ck6 ck6Var5 = this.I0;
                Integer num5 = this.H0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leads5);
                    break;
                }
                break;
            case 8:
                Leads leads6 = this.F0;
                ck6 ck6Var6 = this.I0;
                Integer num6 = this.H0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leads6);
                    break;
                }
                break;
            case 9:
                Leads leads7 = this.F0;
                ck6 ck6Var7 = this.I0;
                Integer num7 = this.H0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), leads7);
                    break;
                }
                break;
            case 10:
                Leads leads8 = this.F0;
                ck6 ck6Var8 = this.I0;
                Integer num8 = this.H0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), leads8);
                    break;
                }
                break;
            case 11:
                Leads leads9 = this.F0;
                ck6 ck6Var9 = this.I0;
                Integer num9 = this.H0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), leads9);
                    break;
                }
                break;
        }
    }

    public void h0(rog rogVar) {
        this.J0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.I0 = ck6Var;
        synchronized (this) {
            this.W0 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(Leads leads) {
        this.F0 = leads;
        synchronized (this) {
            this.W0 |= 4;
        }
        m28509h(61);
        super.m25692R();
    }

    public void k0(MissedOpportunitiesSummary missedOpportunitiesSummary) {
        this.G0 = missedOpportunitiesSummary;
        synchronized (this) {
            this.W0 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.H0 = num;
        synchronized (this) {
            this.W0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        BusinessInfo addedBusiness;
        boolean z2;
        String website;
        boolean z3;
        int i5;
        boolean showSelection;
        boolean showBottom;
        boolean zIsNewItem;
        String freshLeadTag;
        synchronized (this) {
            j = this.W0;
            this.W0 = 0L;
        }
        Leads leads = this.F0;
        MissedOpportunitiesSummary missedOpportunitiesSummary = this.G0;
        long j2 = j & 36;
        if (j2 != 0) {
            if (leads != null) {
                showSelection = leads.getShowSelection();
                showBottom = leads.getShowBottom();
                zIsNewItem = leads.isNewItem();
                addedBusiness = leads.getAddedBusiness();
                freshLeadTag = leads.getFreshLeadTag();
            } else {
                showSelection = false;
                showBottom = false;
                zIsNewItem = false;
                addedBusiness = null;
                freshLeadTag = null;
            }
            if (j2 != 0) {
                j |= showSelection ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            if ((j & 36) != 0) {
                j |= showBottom ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            if ((j & 36) != 0) {
                j |= zIsNewItem ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            i = showSelection ? 8 : 0;
            int i6 = showBottom ? 0 : 8;
            int i7 = zIsNewItem ? 0 : 8;
            z = addedBusiness != null;
            boolean z4 = freshLeadTag == null;
            if ((j & 36) != 0) {
                j = z ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 36) != 0) {
                j |= z4 ? 512L : 256L;
            }
            i2 = i6;
            i3 = i7;
            i4 = z4 ? 8 : 0;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            z = false;
            addedBusiness = null;
        }
        Long callLaterDateTime = ((j & 48) == 0 || missedOpportunitiesSummary == null) ? null : missedOpportunitiesSummary.getCallLaterDateTime();
        if ((MediaStatus.COMMAND_QUEUE_REPEAT_ONE & j) != 0) {
            website = addedBusiness != null ? addedBusiness.getWebsite() : null;
            z2 = website != null;
        } else {
            z2 = false;
            website = null;
        }
        long j3 = j & 36;
        if (j3 != 0) {
            if (!z) {
                z2 = false;
            }
            if (j3 != 0) {
                j = z2 ? j | MediaStatus.COMMAND_PLAYBACK_RATE : j | MediaStatus.COMMAND_EDIT_TRACKS;
            }
        } else {
            z2 = false;
        }
        if ((j & MediaStatus.COMMAND_PLAYBACK_RATE) == 0) {
            z3 = false;
        } else {
            if (addedBusiness != null) {
                website = addedBusiness.getWebsite();
            }
            if (website != "") {
                z3 = true;
            }
        }
        long j4 = j & 36;
        if (j4 != 0) {
            if (!z2) {
                z3 = false;
            }
            if (j4 != 0) {
                j |= z3 ? 128L : 64L;
            }
            i5 = z3 ? 0 : 8;
        } else {
            i5 = 0;
        }
        if ((36 & j) != 0) {
            this.n0.setVisibility(i2);
            this.o0.setVisibility(i3);
            this.p0.setVisibility(i);
            this.r0.setVisibility(i5);
            nr1.M0(this.t0, leads);
            nr1.X0(this.u0, leads);
            this.z0.setVisibility(i4);
            nr1.d1(this.D0, leads);
            nr1.Z0(this.E0, leads);
        }
        if ((j & 48) != 0) {
            nr1.j0(this.p0, callLaterDateTime);
            nr1.S2(this.K0, callLaterDateTime);
        }
        if ((j & 32) != 0) {
            this.s0.setOnClickListener(this.S0);
            this.s0.setOnLongClickListener(this.V0);
            this.u0.setOnClickListener(this.M0);
            this.u0.setOnLongClickListener(this.P0);
            this.v0.setOnClickListener(this.L0);
            this.w0.setOnClickListener(this.R0);
            this.x0.setOnClickListener(this.N0);
            this.y0.setOnClickListener(this.U0);
            this.A0.setOnClickListener(this.O0);
            this.B0.setOnClickListener(this.Q0);
            this.C0.setOnClickListener(this.T0);
        }
    }

    public dx8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (HorizontalScrollView) objArr[10], (TextView) objArr[3], (MaterialTextView) objArr[9], (FrameLayout) objArr[18], (ShapeableImageView) objArr[7], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[5], (ShapeableImageView) objArr[2], (MaterialButton) objArr[13], (MaterialButton) objArr[11], (MaterialButton) objArr[17], (MaterialButton) objArr[16], (MaterialTextView) objArr[4], (MaterialButton) objArr[14], (MaterialButton) objArr[15], (MaterialButton) objArr[12], (MaterialTextView) objArr[6], (MaterialTextView) objArr[8]);
        this.W0 = -1L;
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
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.K0 = constraintLayout;
        constraintLayout.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        a0(view);
        this.L0 = new jbc(this, 7);
        this.M0 = new jbc(this, 3);
        this.N0 = new jbc(this, 11);
        this.O0 = new jbc(this, 8);
        this.P0 = new sbc(this, 4);
        this.Q0 = new jbc(this, 9);
        this.R0 = new jbc(this, 5);
        this.S0 = new jbc(this, 1);
        this.T0 = new jbc(this, 6);
        this.U0 = new jbc(this, 10);
        this.V0 = new sbc(this, 2);
        mo16291G();
    }
}
