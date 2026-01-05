package p001o;

import ai.salesmax.model.LeadsUser;
import ai.salesmax.services.model.ActivityMetrics;
import ai.salesmax.services.model.LeaderboardActivityMetrics;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class w19 extends v19 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i H0 = null;
    public static final SparseIntArray I0;
    public final View.OnClickListener A0;
    public final View.OnClickListener B0;
    public final View.OnClickListener C0;
    public final View.OnClickListener D0;
    public final View.OnClickListener E0;
    public final View.OnClickListener F0;
    public long G0;
    public final MaterialTextView z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(z8e.myRankPosition, 8);
        sparseIntArray.put(z8e.performanceStatus, 9);
    }

    public w19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 10, H0, I0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.G0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G0 = 8L;
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
        if (73 == i) {
            i0((Integer) obj);
        } else if (33 == i) {
            j0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            h0((LeaderboardActivityMetrics) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                ck6 ck6Var = this.y0;
                LeaderboardActivityMetrics leaderboardActivityMetrics = this.w0;
                Integer num = this.x0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), leaderboardActivityMetrics);
                    break;
                }
                break;
            case 2:
                ck6 ck6Var2 = this.y0;
                LeaderboardActivityMetrics leaderboardActivityMetrics2 = this.w0;
                Integer num2 = this.x0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), leaderboardActivityMetrics2);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var3 = this.y0;
                LeaderboardActivityMetrics leaderboardActivityMetrics3 = this.w0;
                Integer num3 = this.x0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leaderboardActivityMetrics3);
                    break;
                }
                break;
            case 4:
                ck6 ck6Var4 = this.y0;
                LeaderboardActivityMetrics leaderboardActivityMetrics4 = this.w0;
                Integer num4 = this.x0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leaderboardActivityMetrics4);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var5 = this.y0;
                LeaderboardActivityMetrics leaderboardActivityMetrics5 = this.w0;
                Integer num5 = this.x0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leaderboardActivityMetrics5);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var6 = this.y0;
                LeaderboardActivityMetrics leaderboardActivityMetrics6 = this.w0;
                Integer num6 = this.x0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leaderboardActivityMetrics6);
                    break;
                }
                break;
        }
    }

    @Override // p001o.v19
    public void h0(LeaderboardActivityMetrics leaderboardActivityMetrics) {
        this.w0 = leaderboardActivityMetrics;
        synchronized (this) {
            this.G0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.v19
    public void i0(Integer num) {
        this.x0 = num;
        synchronized (this) {
            this.G0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    public void j0(ck6 ck6Var) {
        this.y0 = ck6Var;
        synchronized (this) {
            this.G0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        int i;
        LeadsUser leadsUser;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ActivityMetrics visitLogged;
        ActivityMetrics tasksCompleted;
        ActivityMetrics notesAdded;
        ActivityMetrics callLogged;
        LeadsUser leadUser;
        synchronized (this) {
            j = this.G0;
            this.G0 = 0L;
        }
        Integer num = this.x0;
        LeaderboardActivityMetrics leaderboardActivityMetrics = this.w0;
        if ((j & 9) != 0) {
            str = "" + (ewi.m25674U(num) + 1);
        } else {
            str = null;
        }
        long j2 = j & 12;
        if (j2 != 0) {
            if (leaderboardActivityMetrics != null) {
                visitLogged = leaderboardActivityMetrics.getVisitLogged();
                tasksCompleted = leaderboardActivityMetrics.getTasksCompleted();
                notesAdded = leaderboardActivityMetrics.getNotesAdded();
                callLogged = leaderboardActivityMetrics.getCallLogged();
                leadUser = leaderboardActivityMetrics.getLeadUser();
            } else {
                visitLogged = null;
                tasksCompleted = null;
                notesAdded = null;
                callLogged = null;
                leadUser = null;
            }
            boolean z = leaderboardActivityMetrics == null;
            if (j2 != 0) {
                j |= z ? 32L : 16L;
            }
            Long metricsValue = visitLogged != null ? visitLogged.getMetricsValue() : null;
            Long metricsValue2 = tasksCompleted != null ? tasksCompleted.getMetricsValue() : null;
            Long metricsValue3 = notesAdded != null ? notesAdded.getMetricsValue() : null;
            Long metricsValue4 = callLogged != null ? callLogged.getMetricsValue() : null;
            String name = leadUser != null ? leadUser.getName() : null;
            int i2 = z ? 8 : 0;
            str3 = metricsValue3 + "";
            str6 = metricsValue + "";
            i = i2;
            leadsUser = leadUser;
            str5 = metricsValue2 + "";
            str2 = metricsValue4 + "";
            str4 = name;
        } else {
            i = 0;
            leadsUser = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        if ((12 & j) != 0) {
            nr1.f1(this.n0, str4);
            nr1.W0(this.o0, leadsUser);
            this.p0.setVisibility(i);
            fjh.m26938c(this.q0, str2);
            fjh.m26938c(this.r0, str3);
            fjh.m26938c(this.s0, str5);
            fjh.m26938c(this.t0, str6);
        }
        if ((8 & j) != 0) {
            this.o0.setOnClickListener(this.A0);
            this.p0.setOnClickListener(this.D0);
            this.q0.setOnClickListener(this.E0);
            this.r0.setOnClickListener(this.B0);
            this.s0.setOnClickListener(this.F0);
            this.t0.setOnClickListener(this.C0);
        }
        if ((j & 9) != 0) {
            fjh.m26938c(this.z0, str);
        }
    }

    public w19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[3], (ShapeableImageView) objArr[1], (MaterialCardView) objArr[0], (MaterialButton) objArr[4], (MaterialButton) objArr[7], (MaterialButton) objArr[6], (MaterialButton) objArr[5], (MaterialCardView) objArr[8], (MaterialButton) objArr[9]);
        this.G0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        MaterialTextView materialTextView = (MaterialTextView) objArr[2];
        this.z0 = materialTextView;
        materialTextView.setTag(null);
        a0(view);
        this.A0 = new jbc(this, 2);
        this.B0 = new jbc(this, 6);
        this.C0 = new jbc(this, 4);
        this.D0 = new jbc(this, 1);
        this.E0 = new jbc(this, 3);
        this.F0 = new jbc(this, 5);
        mo16291G();
    }
}
