package p001o;

import ai.salesmax.model.LeadEngagementLevel;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.model.Tasks;
import ai.salesmax.view.ColorArcProgressBar;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class rcg extends qcg {
    public static final ewi.C13274i Z0 = null;
    public static final SparseIntArray a1;
    public final NestedScrollView U0;
    public final MaterialTextView V0;
    public final MaterialTextView W0;
    public final MaterialTextView X0;
    public long Y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a1 = sparseIntArray;
        sparseIntArray.put(z8e.lastRemarkContainer, 16);
        sparseIntArray.put(z8e.tvLatestRemarkHeading, 17);
        sparseIntArray.put(z8e.summaryFirstCard, 18);
        sparseIntArray.put(z8e.bar1, 19);
        sparseIntArray.put(z8e.summaryData, 20);
        sparseIntArray.put(z8e.frequencyCardView, 21);
        sparseIntArray.put(z8e.callCardView, 22);
        sparseIntArray.put(z8e.summaryBorderOne, 23);
        sparseIntArray.put(z8e.tvPreviousEngagement, 24);
        sparseIntArray.put(z8e.summaryInteractionsTitle, 25);
        sparseIntArray.put(z8e.summaryInteractionsListParent, 26);
        sparseIntArray.put(z8e.latestInteractionCard, 27);
        sparseIntArray.put(z8e.summaryOpenIssuesTitle, 28);
        sparseIntArray.put(z8e.summaryOpenIssuesListParent, 29);
    }

    public rcg(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 30, Z0, a1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.Y0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.Y0 = 128L;
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
        if (42 == i) {
            m0((Boolean) obj);
        } else if (96 == i) {
            p0((Tasks) obj);
        } else if (73 == i) {
            s0((Integer) obj);
        } else if (26 == i) {
            k0((LeadEngagementLevel) obj);
        } else if (33 == i) {
            q0((ck6) obj);
        } else if (39 == i) {
            l0((Boolean) obj);
        } else {
            if (67 != i) {
                return false;
            }
            n0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.qcg
    public void k0(LeadEngagementLevel leadEngagementLevel) {
        this.O0 = leadEngagementLevel;
        synchronized (this) {
            this.Y0 |= 8;
        }
        m28509h(26);
        super.m25692R();
    }

    @Override // p001o.qcg
    public void l0(Boolean bool) {
        this.S0 = bool;
        synchronized (this) {
            this.Y0 |= 32;
        }
        m28509h(39);
        super.m25692R();
    }

    @Override // p001o.qcg
    public void m0(Boolean bool) {
        this.R0 = bool;
        synchronized (this) {
            this.Y0 |= 1;
        }
        m28509h(42);
        super.m25692R();
    }

    @Override // p001o.qcg
    public void n0(Leads leads) {
        this.N0 = leads;
        synchronized (this) {
            this.Y0 |= 64;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        String str;
        LeadsUser leadsUser;
        int i3;
        String engagementLevel;
        String frequency;
        String str2;
        int displayColor;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        long j3;
        LeadsUser taskOwner;
        String taskAssignedTo;
        long j4;
        long j5;
        synchronized (this) {
            j = this.Y0;
            this.Y0 = 0L;
        }
        Boolean bool = this.R0;
        Tasks tasks = this.P0;
        LeadEngagementLevel leadEngagementLevel = this.O0;
        Boolean bool2 = this.S0;
        Leads leads = this.N0;
        long j6 = j & 129;
        if (j6 != 0) {
            boolean zM25676W = ewi.m25676W(bool);
            if (j6 != 0) {
                if (zM25676W) {
                    j4 = j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
                    j5 = MediaStatus.COMMAND_DISLIKE;
                } else {
                    j4 = j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                    j5 = MediaStatus.COMMAND_LIKE;
                }
                j = j4 | j5;
            }
            i2 = zM25676W ? 8 : 0;
            i = zM25676W ? 0 : 8;
        } else {
            i = 0;
            i2 = 0;
        }
        long j7 = j & 130;
        if (j7 != 0) {
            if (tasks != null) {
                taskOwner = tasks.getTaskOwner();
                taskAssignedTo = tasks.getTaskAssignedTo();
            } else {
                taskOwner = null;
                taskAssignedTo = null;
            }
            boolean z = tasks != null;
            if (j7 != 0) {
                j |= z ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            i3 = z ? 0 : 8;
            leadsUser = taskOwner;
            str = taskAssignedTo;
        } else {
            str = null;
            leadsUser = null;
            i3 = 0;
        }
        if ((j & 136) == 0 || leadEngagementLevel == null) {
            engagementLevel = null;
            frequency = null;
            str2 = null;
            displayColor = 0;
        } else {
            frequency = leadEngagementLevel.getFrequency();
            String frequentContactMode = leadEngagementLevel.getFrequentContactMode();
            displayColor = leadEngagementLevel.getDisplayColor(m25689B().getContext());
            engagementLevel = leadEngagementLevel.getEngagementLevel();
            str2 = frequentContactMode;
        }
        long j8 = j & 160;
        if (j8 != 0) {
            boolean zM25676W2 = ewi.m25676W(bool2);
            if (j8 != 0) {
                if (zM25676W2) {
                    j2 = j | 512;
                    j3 = MediaStatus.COMMAND_UNFOLLOW;
                } else {
                    j2 = j | 256;
                    j3 = MediaStatus.COMMAND_FOLLOW;
                }
                j = j2 | j3;
            }
            int i8 = zM25676W2 ? 8 : 0;
            i4 = zM25676W2 ? 0 : 8;
            i5 = i8;
        } else {
            i4 = 0;
            i5 = 0;
        }
        long j9 = j & 192;
        if (j9 != 0) {
            boolean z2 = (leads != null ? leads.getLatestRemark() : null) != null;
            if (j9 != 0) {
                j |= z2 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            i6 = i;
            i7 = z2 ? 0 : 8;
        } else {
            i6 = i;
            i7 = 0;
        }
        if ((j & 130) != 0) {
            nr1.d0(this.p0, tasks);
            nr1.T1(this.q0, tasks);
            nr1.V0(this.s0, leadsUser);
            this.t0.setVisibility(i3);
            fjh.m26938c(this.I0, str);
            nr1.m40930A(this.J0, tasks);
        }
        if ((j & 136) != 0) {
            fjh.m26938c(this.V0, engagementLevel);
            this.V0.setTextColor(displayColor);
            fjh.m26938c(this.W0, frequency);
            fjh.m26938c(this.X0, str2);
        }
        if ((j & 160) != 0) {
            this.z0.setVisibility(i5);
            this.A0.setVisibility(i4);
        }
        if ((j & 192) != 0) {
            this.D0.setVisibility(i7);
            nr1.P0(this.K0, leads);
        }
        if ((j & 129) != 0) {
            this.E0.setVisibility(i2);
            this.F0.setVisibility(i6);
        }
    }

    @Override // p001o.qcg
    public void p0(Tasks tasks) {
        this.P0 = tasks;
        synchronized (this) {
            this.Y0 |= 2;
        }
        m28509h(96);
        super.m25692R();
    }

    public void q0(ck6 ck6Var) {
        this.T0 = ck6Var;
    }

    public void s0(Integer num) {
        this.Q0 = num;
    }

    public rcg(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ColorArcProgressBar) objArr[19], (MaterialCardView) objArr[22], (MaterialTextView) objArr[11], (ShapeableImageView) objArr[10], (MaterialCardView) objArr[21], (ShapeableImageView) objArr[7], (ConstraintLayout) objArr[6], (ConstraintLayout) objArr[16], (MaterialCardView) objArr[27], (View) objArr[23], (LinearLayout) objArr[20], (MaterialCardView) objArr[18], (RecyclerView) objArr[12], (MaterialTextView) objArr[13], (LinearLayout) objArr[26], (MaterialTextView) objArr[25], (MaterialCardView) objArr[1], (RecyclerView) objArr[14], (MaterialTextView) objArr[15], (LinearLayout) objArr[29], (MaterialTextView) objArr[28], (MaterialTextView) objArr[8], (MaterialTextView) objArr[9], (MaterialTextView) objArr[2], (MaterialTextView) objArr[17], (MaterialTextView) objArr[24]);
        this.Y0 = -1L;
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.U0 = nestedScrollView;
        nestedScrollView.setTag(null);
        MaterialTextView materialTextView = (MaterialTextView) objArr[3];
        this.V0 = materialTextView;
        materialTextView.setTag(null);
        MaterialTextView materialTextView2 = (MaterialTextView) objArr[4];
        this.W0 = materialTextView2;
        materialTextView2.setTag(null);
        MaterialTextView materialTextView3 = (MaterialTextView) objArr[5];
        this.X0 = materialTextView3;
        materialTextView3.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        this.F0.setTag(null);
        this.I0.setTag(null);
        this.J0.setTag(null);
        this.K0.setTag(null);
        a0(view);
        mo16291G();
    }
}
