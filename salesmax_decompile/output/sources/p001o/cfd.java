package p001o;

import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
public class cfd extends bfd implements jbc.InterfaceC14485a {
    public static final ewi.C13274i D1 = null;
    public static final SparseIntArray E1;
    public final View.OnClickListener A1;
    public final View.OnClickListener B1;
    public long C1;
    public final ConstraintLayout h1;
    public final View.OnClickListener i1;
    public final View.OnClickListener j1;
    public final View.OnClickListener k1;
    public final View.OnClickListener l1;
    public final View.OnClickListener m1;
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
        E1 = sparseIntArray;
        sparseIntArray.put(z8e.itemLeadRoot, 28);
        sparseIntArray.put(z8e.ivContactProfilePic, 29);
        sparseIntArray.put(z8e.tvContactName, 30);
        sparseIntArray.put(z8e.callTimeBlock, 31);
        sparseIntArray.put(z8e.callAgainBlock, 32);
        sparseIntArray.put(z8e.addQuickCallBack, 33);
        sparseIntArray.put(z8e.followUpNoteLayout, 34);
        sparseIntArray.put(z8e.followUpNoteInput, 35);
        sparseIntArray.put(z8e.callAgainBlockButtons, 36);
        sparseIntArray.put(z8e.chipPriorityGroup, 37);
        sparseIntArray.put(z8e.optionSeparator, 38);
        sparseIntArray.put(z8e.logOutcomeBlockOption, 39);
        sparseIntArray.put(z8e.alternateActionMessage, 40);
        sparseIntArray.put(z8e.tvRechurningLeadMessage, 41);
        sparseIntArray.put(z8e.confirmUntrack, 42);
    }

    public cfd(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 43, D1, E1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.C1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.C1 = 16L;
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
                ck6 ck6Var = this.g1;
                Leads leads = this.d1;
                Integer num = this.f1;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), leads);
                    break;
                }
                break;
            case 2:
                ck6 ck6Var2 = this.g1;
                Leads leads2 = this.d1;
                Integer num2 = this.f1;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), leads2);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var3 = this.g1;
                Leads leads3 = this.d1;
                Integer num3 = this.f1;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leads3);
                    break;
                }
                break;
            case 4:
                ck6 ck6Var4 = this.g1;
                Leads leads4 = this.d1;
                Integer num4 = this.f1;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leads4);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var5 = this.g1;
                Leads leads5 = this.d1;
                Integer num5 = this.f1;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leads5);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var6 = this.g1;
                Leads leads6 = this.d1;
                Integer num6 = this.f1;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leads6);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var7 = this.g1;
                Leads leads7 = this.d1;
                Integer num7 = this.f1;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), leads7);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var8 = this.g1;
                Leads leads8 = this.d1;
                Integer num8 = this.f1;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), leads8);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var9 = this.g1;
                Leads leads9 = this.d1;
                Integer num9 = this.f1;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), leads9);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var10 = this.g1;
                Leads leads10 = this.d1;
                Integer num10 = this.f1;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), leads10);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var11 = this.g1;
                Leads leads11 = this.d1;
                Integer num11 = this.f1;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), leads11);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var12 = this.g1;
                Leads leads12 = this.d1;
                Integer num12 = this.f1;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), leads12);
                    break;
                }
                break;
            case 13:
                ck6 ck6Var13 = this.g1;
                Leads leads13 = this.d1;
                Integer num13 = this.f1;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), leads13);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var14 = this.g1;
                Leads leads14 = this.d1;
                Integer num14 = this.f1;
                if (ck6Var14 != null) {
                    ck6Var14.mo708b(view, num14.intValue(), leads14);
                    break;
                }
                break;
            case 15:
                ck6 ck6Var15 = this.g1;
                Leads leads15 = this.d1;
                Integer num15 = this.f1;
                if (ck6Var15 != null) {
                    ck6Var15.mo708b(view, num15.intValue(), leads15);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var16 = this.g1;
                Leads leads16 = this.d1;
                Integer num16 = this.f1;
                if (ck6Var16 != null) {
                    ck6Var16.mo708b(view, num16.intValue(), leads16);
                    break;
                }
                break;
            case 17:
                ck6 ck6Var17 = this.g1;
                Leads leads17 = this.d1;
                Integer num17 = this.f1;
                if (ck6Var17 != null) {
                    ck6Var17.mo708b(view, num17.intValue(), leads17);
                    break;
                }
                break;
            case 18:
                ck6 ck6Var18 = this.g1;
                Leads leads18 = this.d1;
                Integer num18 = this.f1;
                if (ck6Var18 != null) {
                    ck6Var18.mo708b(view, num18.intValue(), leads18);
                    break;
                }
                break;
            case 19:
                ck6 ck6Var19 = this.g1;
                Leads leads19 = this.d1;
                Integer num19 = this.f1;
                if (ck6Var19 != null) {
                    ck6Var19.mo708b(view, num19.intValue(), leads19);
                    break;
                }
                break;
            case 20:
                ck6 ck6Var20 = this.g1;
                Leads leads20 = this.d1;
                Integer num20 = this.f1;
                if (ck6Var20 != null) {
                    ck6Var20.mo708b(view, num20.intValue(), leads20);
                    break;
                }
                break;
        }
    }

    @Override // p001o.bfd
    public void j0(Tasks tasks) {
        this.e1 = tasks;
        synchronized (this) {
            this.C1 |= 1;
        }
        m28509h(10);
        super.m25692R();
    }

    @Override // p001o.bfd
    public void k0(ck6 ck6Var) {
        this.g1 = ck6Var;
        synchronized (this) {
            this.C1 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    @Override // p001o.bfd
    public void l0(Leads leads) {
        this.d1 = leads;
        synchronized (this) {
            this.C1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.bfd
    public void m0(Integer num) {
        this.f1 = num;
        synchronized (this) {
            this.C1 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.C1;
            this.C1 = 0L;
        }
        Tasks tasks = this.e1;
        Leads leads = this.d1;
        long j2 = 17 & j;
        long callStartTime = (j2 == 0 || tasks == null) ? 0L : tasks.getCallStartTime();
        long j3 = 24 & j;
        if ((j & 16) != 0) {
            this.n0.setOnClickListener(this.t1);
            this.s0.setOnClickListener(this.A1);
            this.u0.setOnClickListener(this.j1);
            this.v0.setOnClickListener(this.p1);
            this.w0.setOnClickListener(this.u1);
            this.C0.setOnClickListener(this.m1);
            this.G0.setOnClickListener(this.s1);
            this.J0.setOnClickListener(this.n1);
            this.K0.setOnClickListener(this.k1);
            this.L0.setOnClickListener(this.B1);
            this.M0.setOnClickListener(this.v1);
            this.P0.setOnClickListener(this.y1);
            this.R0.setOnClickListener(this.i1);
            this.T0.setOnClickListener(this.q1);
            this.U0.setOnClickListener(this.w1);
            this.V0.setOnClickListener(this.l1);
            this.W0.setOnClickListener(this.x1);
            this.X0.setOnClickListener(this.z1);
            this.b1.setOnClickListener(this.r1);
            this.c1.setOnClickListener(this.o1);
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
            nr1.d1(this.Z0, leads);
        }
    }

    public cfd(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Chip) objArr[24], (MaterialTextView) objArr[33], (MaterialTextView) objArr[40], (LinearLayout) objArr[32], (LinearLayout) objArr[36], (Chip) objArr[10], (MaterialTextView) objArr[4], (Chip) objArr[11], (Chip) objArr[8], (Chip) objArr[9], (LinearLayout) objArr[12], (LinearLayout) objArr[21], (LinearLayout) objArr[17], (MaterialTextView) objArr[3], (LinearLayout) objArr[31], (Chip) objArr[7], (ShapeableImageView) objArr[2], (ChipGroup) objArr[37], (LinearLayout) objArr[42], (Chip) objArr[14], (TextInputEditText) objArr[35], (TextInputLayout) objArr[34], (Chip) objArr[13], (Chip) objArr[22], (Chip) objArr[6], (Chip) objArr[5], (CardView) objArr[28], (ShapeableImageView) objArr[29], (Chip) objArr[15], (MaterialCardView) objArr[39], (Chip) objArr[26], (View) objArr[38], (Chip) objArr[23], (Chip) objArr[19], (Chip) objArr[16], (Chip) objArr[25], (Chip) objArr[20], (MaterialTextView) objArr[30], (MaterialTextView) objArr[1], (MaterialTextView) objArr[41], (Chip) objArr[18], (Chip) objArr[27]);
        this.C1 = -1L;
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
        this.G0.setTag(null);
        this.J0.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        this.P0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.h1 = constraintLayout;
        constraintLayout.setTag(null);
        this.R0.setTag(null);
        this.T0.setTag(null);
        this.U0.setTag(null);
        this.V0.setTag(null);
        this.W0.setTag(null);
        this.X0.setTag(null);
        this.Z0.setTag(null);
        this.b1.setTag(null);
        this.c1.setTag(null);
        a0(view);
        this.i1 = new jbc(this, 19);
        this.j1 = new jbc(this, 7);
        this.k1 = new jbc(this, 15);
        this.l1 = new jbc(this, 11);
        this.m1 = new jbc(this, 3);
        this.n1 = new jbc(this, 8);
        this.o1 = new jbc(this, 20);
        this.p1 = new jbc(this, 4);
        this.q1 = new jbc(this, 16);
        this.r1 = new jbc(this, 12);
        this.s1 = new jbc(this, 9);
        this.t1 = new jbc(this, 17);
        this.u1 = new jbc(this, 5);
        this.v1 = new jbc(this, 1);
        this.w1 = new jbc(this, 13);
        this.x1 = new jbc(this, 18);
        this.y1 = new jbc(this, 10);
        this.z1 = new jbc(this, 14);
        this.A1 = new jbc(this, 6);
        this.B1 = new jbc(this, 2);
        mo16291G();
    }
}
