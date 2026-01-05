package p001o;

import ai.salesmax.model.Leads;
import ai.salesmax.model.RecentAction;
import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class dt1 extends ct1 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i M0;
    public static final SparseIntArray N0;
    public final ConstraintLayout A0;
    public final ConstraintLayout B0;
    public final View.OnClickListener C0;
    public final View.OnClickListener D0;
    public final View.OnClickListener E0;
    public final View.OnClickListener F0;
    public final View.OnClickListener G0;
    public final View.OnClickListener H0;
    public final View.OnClickListener I0;
    public final View.OnClickListener J0;
    public final View.OnClickListener K0;
    public long L0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(12);
        M0 = c13274i;
        c13274i.m25699a(7, new String[]{"content_recent_actions"}, new int[]{11}, new int[]{p9e.content_recent_actions});
        N0 = null;
    }

    public dt1(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, M0, N0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.L0 != 0) {
                return true;
            }
            return this.s0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.L0 = 16L;
        }
        this.s0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m0((p44) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            l0((Integer) obj);
        } else if (33 == i) {
            j0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                ck6 ck6Var = this.z0;
                Leads leads = this.x0;
                Integer num = this.y0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), leads);
                    break;
                }
                break;
            case 2:
                ck6 ck6Var2 = this.z0;
                Leads leads2 = this.x0;
                Integer num2 = this.y0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), leads2);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var3 = this.z0;
                Leads leads3 = this.x0;
                Integer num3 = this.y0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leads3);
                    break;
                }
                break;
            case 4:
                ck6 ck6Var4 = this.z0;
                Leads leads4 = this.x0;
                Integer num4 = this.y0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leads4);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var5 = this.z0;
                Leads leads5 = this.x0;
                Integer num5 = this.y0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leads5);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var6 = this.z0;
                Leads leads6 = this.x0;
                Integer num6 = this.y0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leads6);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var7 = this.z0;
                Leads leads7 = this.x0;
                Integer num7 = this.y0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), leads7);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var8 = this.z0;
                Leads leads8 = this.x0;
                Integer num8 = this.y0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), leads8);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var9 = this.z0;
                Leads leads9 = this.x0;
                Integer num9 = this.y0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), leads9);
                    break;
                }
                break;
        }
    }

    @Override // p001o.ct1
    public void j0(ck6 ck6Var) {
        this.z0 = ck6Var;
        synchronized (this) {
            this.L0 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    @Override // p001o.ct1
    public void k0(Leads leads) {
        this.x0 = leads;
        synchronized (this) {
            this.L0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ct1
    public void l0(Integer num) {
        this.y0 = num;
        synchronized (this) {
            this.L0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    public final boolean m0(p44 p44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.L0 |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        List<RecentAction> recentEngagements;
        boolean showSelection;
        synchronized (this) {
            j = this.L0;
            this.L0 = 0L;
        }
        Integer num = this.y0;
        ck6 ck6Var = this.z0;
        Leads leads = this.x0;
        long j2 = j & 24;
        List<RecentAction> list = null;
        String leadLifecycleStage = null;
        if (j2 != 0) {
            if (leads != null) {
                leadLifecycleStage = leads.getLeadLifecycleStage();
                recentEngagements = leads.getRecentEngagements();
                showSelection = leads.getShowSelection();
            } else {
                recentEngagements = null;
                showSelection = false;
            }
            Object[] objArr = leadLifecycleStage != "CLOSED";
            boolean z = !showSelection;
            if (j2 != 0) {
                j |= objArr != false ? 256L : 128L;
            }
            if ((j & 24) != 0) {
                j |= z ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            boolean zIsEmpty = recentEngagements != null ? recentEngagements.isEmpty() : false;
            if ((j & 24) != 0) {
                j |= zIsEmpty ? 64L : 32L;
            }
            int i3 = objArr != false ? 0 : 8;
            i2 = z ? 0 : 8;
            i = zIsEmpty ? 8 : 0;
            i = i3;
            list = recentEngagements;
        } else {
            i = 0;
            i2 = 0;
        }
        if ((16 & j) != 0) {
            this.n0.setOnClickListener(this.F0);
            this.o0.setOnClickListener(this.I0);
            this.p0.setOnClickListener(this.H0);
            this.q0.setOnClickListener(this.G0);
            this.A0.setOnClickListener(this.C0);
            this.r0.setOnClickListener(this.E0);
            this.t0.setOnClickListener(this.K0);
            this.u0.setOnClickListener(this.J0);
            this.v0.setOnClickListener(this.D0);
        }
        if ((24 & j) != 0) {
            this.o0.setVisibility(i);
            this.r0.setVisibility(i2);
            this.s0.m25689B().setVisibility(i);
            this.s0.i0(list);
            nr1.d1(this.t0, leads);
            nr1.Z0(this.u0, leads);
            nr1.P0(this.v0, leads);
            nr1.u0(this.w0, leads);
        }
        if ((20 & j) != 0) {
            this.s0.h0(ck6Var);
        }
        if ((j & 18) != 0) {
            this.s0.j0(num);
        }
        ewi.m25683r(this.s0);
    }

    public dt1(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (ShapeableImageView) objArr[4], (MaterialButton) objArr[10], (CardView) objArr[0], (ShapeableImageView) objArr[2], (MaterialCardView) objArr[6], (p44) objArr[11], (MaterialTextView) objArr[3], (MaterialTextView) objArr[5], (MaterialTextView) objArr[9], (MaterialTextView) objArr[8]);
        this.L0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.A0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[7];
        this.B0 = constraintLayout2;
        constraintLayout2.setTag(null);
        this.r0.setTag(null);
        m25693Z(this.s0);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        a0(view);
        this.C0 = new jbc(this, 2);
        this.D0 = new jbc(this, 8);
        this.E0 = new jbc(this, 7);
        this.F0 = new jbc(this, 5);
        this.G0 = new jbc(this, 3);
        this.H0 = new jbc(this, 1);
        this.I0 = new jbc(this, 9);
        this.J0 = new jbc(this, 6);
        this.K0 = new jbc(this, 4);
        mo16291G();
    }
}
