package p001o;

import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class afd extends zed implements jbc.InterfaceC14485a {
    public static final ewi.C13274i M1 = null;
    public static final SparseIntArray N1;
    public final View.OnClickListener A1;
    public final View.OnClickListener B1;
    public final View.OnClickListener C1;
    public final View.OnClickListener D1;
    public final View.OnClickListener E1;
    public final View.OnClickListener F1;
    public final View.OnClickListener G1;
    public final View.OnClickListener H1;
    public final View.OnClickListener I1;
    public final View.OnClickListener J1;
    public final View.OnClickListener K1;
    public long L1;
    public final View.OnClickListener n1;
    public final View.OnClickListener o1;
    public final View.OnClickListener p1;
    public final View.OnClickListener q1;
    public final View.OnClickListener r1;
    public final View.OnClickListener s1;
    public final View.OnClickListener t1;
    public final View.OnClickListener u1;
    public final View.OnClickListener v1;
    public final View.OnClickListener w1;
    public final View.OnClickListener x1;
    public final View.OnClickListener y1;
    public final View.OnClickListener z1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N1 = sparseIntArray;
        sparseIntArray.put(z8e.ivContactProfilePic, 32);
        sparseIntArray.put(z8e.tvContactName, 33);
        sparseIntArray.put(z8e.viewSeparator, 34);
        sparseIntArray.put(z8e.callTimeBlock, 35);
        sparseIntArray.put(z8e.callAgainBlock, 36);
        sparseIntArray.put(z8e.addQuickCallBack, 37);
        sparseIntArray.put(z8e.followUpNoteLayout, 38);
        sparseIntArray.put(z8e.followUpNoteInput, 39);
        sparseIntArray.put(z8e.callAgainBlockButtons, 40);
        sparseIntArray.put(z8e.chipPriorityGroup, 41);
        sparseIntArray.put(z8e.optionSeparator, 42);
        sparseIntArray.put(z8e.logOutcomeBlockOption, 43);
        sparseIntArray.put(z8e.alternateActionMessage, 44);
        sparseIntArray.put(z8e.tvRechurningLeadMessage, 45);
        sparseIntArray.put(z8e.confirmUntrack, 46);
        sparseIntArray.put(z8e.confirmClose, 47);
    }

    public afd(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 48, M1, N1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.L1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.L1 = 16L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (10 == i) {
            j0((Tasks) obj);
        } else if (73 == i) {
            m0((Integer) obj);
        } else if (33 == i) {
            k0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            l0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                ck6 ck6Var = this.m1;
                Leads leads = this.j1;
                Integer num = this.l1;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), leads);
                    break;
                }
                break;
            case 2:
                ck6 ck6Var2 = this.m1;
                Leads leads2 = this.j1;
                Integer num2 = this.l1;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), leads2);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var3 = this.m1;
                Leads leads3 = this.j1;
                Integer num3 = this.l1;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leads3);
                    break;
                }
                break;
            case 4:
                ck6 ck6Var4 = this.m1;
                Leads leads4 = this.j1;
                Integer num4 = this.l1;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leads4);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var5 = this.m1;
                Leads leads5 = this.j1;
                Integer num5 = this.l1;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leads5);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var6 = this.m1;
                Leads leads6 = this.j1;
                Integer num6 = this.l1;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leads6);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var7 = this.m1;
                Leads leads7 = this.j1;
                Integer num7 = this.l1;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), leads7);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var8 = this.m1;
                Leads leads8 = this.j1;
                Integer num8 = this.l1;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), leads8);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var9 = this.m1;
                Leads leads9 = this.j1;
                Integer num9 = this.l1;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), leads9);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var10 = this.m1;
                Leads leads10 = this.j1;
                Integer num10 = this.l1;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), leads10);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var11 = this.m1;
                Leads leads11 = this.j1;
                Integer num11 = this.l1;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), leads11);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var12 = this.m1;
                Leads leads12 = this.j1;
                Integer num12 = this.l1;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), leads12);
                    break;
                }
                break;
            case 13:
                ck6 ck6Var13 = this.m1;
                Leads leads13 = this.j1;
                Integer num13 = this.l1;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), leads13);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var14 = this.m1;
                Leads leads14 = this.j1;
                Integer num14 = this.l1;
                if (ck6Var14 != null) {
                    ck6Var14.mo708b(view, num14.intValue(), leads14);
                    break;
                }
                break;
            case 15:
                ck6 ck6Var15 = this.m1;
                Leads leads15 = this.j1;
                Integer num15 = this.l1;
                if (ck6Var15 != null) {
                    ck6Var15.mo708b(view, num15.intValue(), leads15);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var16 = this.m1;
                Leads leads16 = this.j1;
                Integer num16 = this.l1;
                if (ck6Var16 != null) {
                    ck6Var16.mo708b(view, num16.intValue(), leads16);
                    break;
                }
                break;
            case 17:
                ck6 ck6Var17 = this.m1;
                Leads leads17 = this.j1;
                Integer num17 = this.l1;
                if (ck6Var17 != null) {
                    ck6Var17.mo708b(view, num17.intValue(), leads17);
                    break;
                }
                break;
            case 18:
                ck6 ck6Var18 = this.m1;
                Leads leads18 = this.j1;
                Integer num18 = this.l1;
                if (ck6Var18 != null) {
                    ck6Var18.mo708b(view, num18.intValue(), leads18);
                    break;
                }
                break;
            case 19:
                ck6 ck6Var19 = this.m1;
                Leads leads19 = this.j1;
                Integer num19 = this.l1;
                if (ck6Var19 != null) {
                    ck6Var19.mo708b(view, num19.intValue(), leads19);
                    break;
                }
                break;
            case 20:
                ck6 ck6Var20 = this.m1;
                Leads leads20 = this.j1;
                Integer num20 = this.l1;
                if (ck6Var20 != null) {
                    ck6Var20.mo708b(view, num20.intValue(), leads20);
                    break;
                }
                break;
            case 21:
                ck6 ck6Var21 = this.m1;
                Leads leads21 = this.j1;
                Integer num21 = this.l1;
                if (ck6Var21 != null) {
                    ck6Var21.mo708b(view, num21.intValue(), leads21);
                    break;
                }
                break;
            case 22:
                ck6 ck6Var22 = this.m1;
                Leads leads22 = this.j1;
                Integer num22 = this.l1;
                if (ck6Var22 != null) {
                    ck6Var22.mo708b(view, num22.intValue(), leads22);
                    break;
                }
                break;
            case 23:
                ck6 ck6Var23 = this.m1;
                Leads leads23 = this.j1;
                Integer num23 = this.l1;
                if (ck6Var23 != null) {
                    ck6Var23.mo708b(view, num23.intValue(), leads23);
                    break;
                }
                break;
            case 24:
                ck6 ck6Var24 = this.m1;
                Leads leads24 = this.j1;
                Integer num24 = this.l1;
                if (ck6Var24 != null) {
                    ck6Var24.mo708b(view, num24.intValue(), leads24);
                    break;
                }
                break;
        }
    }

    @Override // p001o.zed
    public void j0(Tasks tasks) {
        this.k1 = tasks;
        synchronized (this) {
            this.L1 |= 1;
        }
        m28509h(10);
        super.m25692R();
    }

    @Override // p001o.zed
    public void k0(ck6 ck6Var) {
        this.m1 = ck6Var;
        synchronized (this) {
            this.L1 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    @Override // p001o.zed
    public void l0(Leads leads) {
        this.j1 = leads;
        synchronized (this) {
            this.L1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.zed
    public void m0(Integer num) {
        this.l1 = num;
        synchronized (this) {
            this.L1 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.L1;
            this.L1 = 0L;
        }
        Tasks tasks = this.k1;
        Leads leads = this.j1;
        long j2 = 17 & j;
        long callStartTime = (j2 == 0 || tasks == null) ? 0L : tasks.getCallStartTime();
        long j3 = 24 & j;
        if ((j & 16) != 0) {
            this.n0.setOnClickListener(this.n1);
            this.s0.setOnClickListener(this.t1);
            this.u0.setOnClickListener(this.z1);
            this.v0.setOnClickListener(this.G1);
            this.w0.setOnClickListener(this.p1);
            this.C0.setOnClickListener(this.A1);
            this.H0.setOnClickListener(this.q1);
            this.K0.setOnClickListener(this.F1);
            this.L0.setOnClickListener(this.B1);
            this.M0.setOnClickListener(this.v1);
            this.N0.setOnClickListener(this.s1);
            this.Q0.setOnClickListener(this.x1);
            this.R0.setOnClickListener(this.J1);
            this.T0.setOnClickListener(this.r1);
            this.U0.setOnClickListener(this.E1);
            this.W0.setOnClickListener(this.H1);
            this.X0.setOnClickListener(this.o1);
            this.Y0.setOnClickListener(this.D1);
            this.Z0.setOnClickListener(this.u1);
            this.a1.setOnClickListener(this.w1);
            this.d1.setOnClickListener(this.C1);
            this.f1.setOnClickListener(this.K1);
            this.h1.setOnClickListener(this.y1);
            this.i1.setOnClickListener(this.I1);
        }
        if (j2 != 0) {
            nr1.l2(this.t0, tasks);
            nr1.s2(this.A0, Long.valueOf(callStartTime));
            nr1.T1(this.D0, tasks);
        }
        if (j3 != 0) {
            nr1.m40949T(this.x0, leads);
            nr1.m40950U(this.y0, leads);
            nr1.m40951V(this.z0, leads);
            nr1.d1(this.c1, leads);
        }
    }

    public afd(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Chip) objArr[26], (MaterialTextView) objArr[37], (MaterialTextView) objArr[44], (LinearLayout) objArr[36], (LinearLayout) objArr[40], (Chip) objArr[12], (MaterialTextView) objArr[5], (Chip) objArr[13], (Chip) objArr[10], (Chip) objArr[11], (LinearLayout) objArr[14], (LinearLayout) objArr[23], (LinearLayout) objArr[19], (MaterialTextView) objArr[4], (LinearLayout) objArr[35], (Chip) objArr[9], (ShapeableImageView) objArr[3], (ChipGroup) objArr[41], (LinearLayout) objArr[47], (LinearLayout) objArr[46], (Chip) objArr[16], (TextInputEditText) objArr[39], (TextInputLayout) objArr[38], (Chip) objArr[15], (Chip) objArr[24], (Chip) objArr[8], (Chip) objArr[7], (CardView) objArr[0], (ShapeableImageView) objArr[32], (Chip) objArr[17], (MaterialButton) objArr[6], (MaterialCardView) objArr[43], (Chip) objArr[30], (Chip) objArr[28], (View) objArr[42], (Chip) objArr[25], (Chip) objArr[21], (Chip) objArr[18], (Chip) objArr[27], (Chip) objArr[22], (MaterialTextView) objArr[33], (MaterialTextView) objArr[1], (MaterialTextView) objArr[2], (MaterialTextView) objArr[45], (Chip) objArr[20], (View) objArr[34], (Chip) objArr[31], (Chip) objArr[29]);
        this.L1 = -1L;
        this.n0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.H0.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.Q0.setTag(null);
        this.R0.setTag(null);
        this.T0.setTag(null);
        this.U0.setTag(null);
        this.W0.setTag(null);
        this.X0.setTag(null);
        this.Y0.setTag(null);
        this.Z0.setTag(null);
        this.a1.setTag(null);
        this.c1.setTag(null);
        this.d1.setTag(null);
        this.f1.setTag(null);
        this.h1.setTag(null);
        this.i1.setTag(null);
        a0(view);
        this.n1 = new jbc(this, 19);
        this.o1 = new jbc(this, 15);
        this.p1 = new jbc(this, 7);
        this.q1 = new jbc(this, 11);
        this.r1 = new jbc(this, 23);
        this.s1 = new jbc(this, 3);
        this.t1 = new jbc(this, 8);
        this.u1 = new jbc(this, 20);
        this.v1 = new jbc(this, 4);
        this.w1 = new jbc(this, 16);
        this.x1 = new jbc(this, 12);
        this.y1 = new jbc(this, 24);
        this.z1 = new jbc(this, 9);
        this.A1 = new jbc(this, 5);
        this.B1 = new jbc(this, 17);
        this.C1 = new jbc(this, 1);
        this.D1 = new jbc(this, 13);
        this.E1 = new jbc(this, 21);
        this.F1 = new jbc(this, 10);
        this.G1 = new jbc(this, 6);
        this.H1 = new jbc(this, 18);
        this.I1 = new jbc(this, 22);
        this.J1 = new jbc(this, 2);
        this.K1 = new jbc(this, 14);
        mo16291G();
    }
}
