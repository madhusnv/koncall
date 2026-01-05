package p001o;

import ai.salesmax.model.MissedOpportunitiesSummary;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class i19 extends h19 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i M0 = null;
    public static final SparseIntArray N0;
    public final MaterialCardView E0;
    public final ConstraintLayout F0;
    public final MaterialCardView G0;
    public final View.OnClickListener H0;
    public final View.OnClickListener I0;
    public final View.OnClickListener J0;
    public final View.OnClickListener K0;
    public long L0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N0 = sparseIntArray;
        sparseIntArray.put(z8e.clientDetailMore, 15);
    }

    public i19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 16, M0, N0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.L0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.L0 = 16L;
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
            j0((MissedOpportunitiesSummary) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.C0;
            MissedOpportunitiesSummary missedOpportunitiesSummary = this.A0;
            Integer num = this.B0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), missedOpportunitiesSummary);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.C0;
            MissedOpportunitiesSummary missedOpportunitiesSummary2 = this.A0;
            Integer num2 = this.B0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), missedOpportunitiesSummary2);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var3 = this.C0;
            MissedOpportunitiesSummary missedOpportunitiesSummary3 = this.A0;
            Integer num3 = this.B0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), missedOpportunitiesSummary3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ck6 ck6Var4 = this.C0;
        MissedOpportunitiesSummary missedOpportunitiesSummary4 = this.A0;
        Integer num4 = this.B0;
        if (ck6Var4 != null) {
            ck6Var4.mo708b(view, num4.intValue(), missedOpportunitiesSummary4);
        }
    }

    public void h0(rog rogVar) {
        this.D0 = rogVar;
        synchronized (this) {
            this.L0 |= 1;
        }
        m28509h(7);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.C0 = ck6Var;
        synchronized (this) {
            this.L0 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(MissedOpportunitiesSummary missedOpportunitiesSummary) {
        this.A0 = missedOpportunitiesSummary;
        synchronized (this) {
            this.L0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.B0 = num;
        synchronized (this) {
            this.L0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x018b A[PHI: r2
      0x018b: PHI (r2v4 long) = (r2v3 long), (r2v18 long) binds: [B:71:0x0174, B:80:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        boolean z;
        boolean zIsExpired;
        int i;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        String str11;
        String str12;
        String taskAssignedTo;
        String taskTitle;
        String taskAssignedToProfilePic;
        String missedOpportunityType;
        String clientProfilePic;
        String clientDesignation;
        String taskContactMode;
        long j2;
        long j3;
        synchronized (this) {
            j = this.L0;
            this.L0 = 0L;
        }
        rog rogVar = this.D0;
        MissedOpportunitiesSummary missedOpportunitiesSummary = this.A0;
        if ((j & 17) != 0) {
            z = rogVar != null;
            if ((j & 65617) != 0) {
                j = z ? j | MediaStatus.COMMAND_STREAM_TRANSFER : j | MediaStatus.COMMAND_UNFOLLOW;
            }
        } else {
            z = false;
        }
        String str13 = null;
        if ((j & 25) != 0) {
            long j4 = j & 24;
            if (j4 != 0) {
                if (missedOpportunitiesSummary != null) {
                    long updatedAt = missedOpportunitiesSummary.getUpdatedAt();
                    String clientName = missedOpportunitiesSummary.getClientName();
                    long taskDateTimeInMillis = missedOpportunitiesSummary.getTaskDateTimeInMillis();
                    taskAssignedTo = missedOpportunitiesSummary.getTaskAssignedTo();
                    taskTitle = missedOpportunitiesSummary.getTaskTitle();
                    String taskContent = missedOpportunitiesSummary.getTaskContent();
                    taskAssignedToProfilePic = missedOpportunitiesSummary.getTaskAssignedToProfilePic();
                    missedOpportunityType = missedOpportunitiesSummary.getMissedOpportunityType();
                    clientProfilePic = missedOpportunitiesSummary.getClientProfilePic();
                    clientDesignation = missedOpportunitiesSummary.getClientDesignation();
                    taskContactMode = missedOpportunitiesSummary.getTaskContactMode();
                    j2 = updatedAt;
                    j3 = taskDateTimeInMillis;
                    str13 = taskContent;
                    str12 = clientName;
                } else {
                    j2 = 0;
                    j3 = 0;
                    str12 = null;
                    taskAssignedTo = null;
                    taskTitle = null;
                    taskAssignedToProfilePic = null;
                    missedOpportunityType = null;
                    clientProfilePic = null;
                    clientDesignation = null;
                    taskContactMode = null;
                }
                str11 = "" + j2;
                boolean z4 = j3 > 0;
                z2 = str13 == null;
                if (j4 != 0) {
                    j |= z4 ? 4194304L : 2097152L;
                }
                if ((j & 24) != 0) {
                    j = z2 ? j | 256 : j | 128;
                }
                i = z4 ? 0 : 8;
            } else {
                i = 0;
                z2 = false;
                str11 = null;
                str12 = null;
                taskAssignedTo = null;
                taskTitle = null;
                taskAssignedToProfilePic = null;
                missedOpportunityType = null;
                clientProfilePic = null;
                clientDesignation = null;
                taskContactMode = null;
            }
            zIsExpired = missedOpportunitiesSummary != null ? missedOpportunitiesSummary.isExpired() : false;
            if ((j & 25) != 0) {
                j = zIsExpired ? j | 64 | MediaStatus.COMMAND_FOLLOW : j | 32 | MediaStatus.COMMAND_DISLIKE;
            }
            str5 = str11;
            str = str13;
            str4 = str12;
            str6 = taskAssignedTo;
            str7 = taskTitle;
            str8 = taskAssignedToProfilePic;
            str9 = missedOpportunityType;
            str10 = clientProfilePic;
            str2 = clientDesignation;
            str3 = taskContactMode;
        } else {
            zIsExpired = false;
            i = 0;
            z2 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
        }
        if ((j & 65600) != 0) {
            z = rogVar != null;
            if ((j & 65617) != 0) {
                j = z ? j | MediaStatus.COMMAND_STREAM_TRANSFER : j | MediaStatus.COMMAND_UNFOLLOW;
            }
        }
        boolean zIsEmpty = ((j & 128) == 0 || str == null) ? false : str.isEmpty();
        long j5 = j & 24;
        if (j5 == 0) {
            i2 = 0;
        } else {
            boolean z5 = z2 ? true : zIsEmpty;
            if (j5 != 0) {
                j |= z5 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            if (z5) {
                i2 = 8;
            }
        }
        boolean zM47035a = ((MediaStatus.COMMAND_STREAM_TRANSFER & j) == 0 || rogVar == null) ? false : rogVar.m47035a();
        if ((j & 65617) != 0) {
            if (!z) {
                zM47035a = false;
            }
            if ((j & 17) != 0) {
                j |= zM47035a ? 1048576L : 524288L;
            }
            z3 = (j & MediaStatus.COMMAND_FOLLOW) != 0 ? !zM47035a : false;
            i3 = ((j & 17) == 0 || !zM47035a) ? 0 : 8;
        } else {
            zM47035a = false;
            z3 = false;
            i3 = 0;
        }
        long j6 = j & 25;
        if (j6 != 0) {
            if (!zIsExpired) {
                zM47035a = false;
            }
            if (!zIsExpired) {
                z3 = false;
            }
            if (j6 != 0) {
                j |= zM47035a ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            if ((j & 25) != 0) {
                j |= z3 ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            i5 = zM47035a ? 0 : 8;
            i4 = z3 ? 0 : 8;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if ((j & 24) != 0) {
            nr1.t2(this.n0, str5);
            this.o0.setVisibility(i);
            fjh.m26938c(this.p0, str6);
            nr1.m40940K(this.p0, str8);
            nr1.J2(this.r0, str10);
            nr1.n3(this.G0, str3);
            nr1.f3(this.v0, str9);
            fjh.m26938c(this.w0, str2);
            nr1.f1(this.x0, str4);
            fjh.m26938c(this.y0, str7);
            fjh.m26938c(this.z0, str);
            this.z0.setVisibility(i2);
        }
        if ((16 & j) != 0) {
            this.p0.setOnClickListener(this.I0);
            this.r0.setOnClickListener(this.K0);
            this.E0.setOnClickListener(this.J0);
            this.G0.setOnClickListener(this.H0);
        }
        if ((17 & j) != 0) {
            this.r0.setVisibility(i3);
            this.F0.setVisibility(i3);
            this.w0.setVisibility(i3);
            this.x0.setVisibility(i3);
        }
        if ((j & 25) != 0) {
            this.s0.setVisibility(i4);
            this.t0.setVisibility(i4);
            this.u0.setVisibility(i5);
        }
    }

    public i19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[14], (ShapeableImageView) objArr[13], (Chip) objArr[12], (MaterialButton) objArr[15], (ShapeableImageView) objArr[2], (MaterialButton) objArr[5], (MaterialButton) objArr[6], (MaterialButton) objArr[9], (ShapeableImageView) objArr[11], (MaterialTextView) objArr[4], (MaterialTextView) objArr[3], (MaterialTextView) objArr[8], (MaterialTextView) objArr[10]);
        this.L0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.r0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.E0 = materialCardView;
        materialCardView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.F0 = constraintLayout;
        constraintLayout.setTag(null);
        MaterialCardView materialCardView2 = (MaterialCardView) objArr[7];
        this.G0 = materialCardView2;
        materialCardView2.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        a0(view);
        this.H0 = new jbc(this, 3);
        this.I0 = new jbc(this, 4);
        this.J0 = new jbc(this, 1);
        this.K0 = new jbc(this, 2);
        mo16291G();
    }
}
