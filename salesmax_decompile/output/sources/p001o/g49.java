package p001o;

import ai.salesmax.model.EngagementUpdateSummary;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class g49 extends f49 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i T0 = null;
    public static final SparseIntArray U0;
    public final MaterialCardView C0;
    public final LinearLayout D0;
    public final ConstraintLayout E0;
    public final ConstraintLayout F0;
    public final View.OnClickListener G0;
    public final View.OnClickListener H0;
    public final View.OnLongClickListener I0;
    public final View.OnLongClickListener J0;
    public final View.OnLongClickListener K0;
    public final View.OnClickListener L0;
    public final View.OnClickListener M0;
    public final View.OnLongClickListener N0;
    public final View.OnLongClickListener O0;
    public final View.OnLongClickListener P0;
    public final View.OnClickListener Q0;
    public final View.OnClickListener R0;
    public long S0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U0 = sparseIntArray;
        sparseIntArray.put(z8e.taskDetailLayout, 14);
    }

    public g49(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 15, T0, U0));
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
            this.S0 = 16L;
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
            ck6 ck6Var = this.A0;
            Tasks tasks = this.y0;
            Integer num = this.z0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), tasks);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.A0;
            Tasks tasks2 = this.y0;
            Integer num2 = this.z0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), tasks2);
            }
            return false;
        }
        if (i == 6) {
            ck6 ck6Var3 = this.A0;
            Tasks tasks3 = this.y0;
            Integer num3 = this.z0;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), tasks3);
            }
            return false;
        }
        if (i == 11) {
            ck6 ck6Var4 = this.A0;
            Tasks tasks4 = this.y0;
            Integer num4 = this.z0;
            if (ck6Var4 != null) {
                return ck6Var4.mo707a(view, num4.intValue(), tasks4);
            }
            return false;
        }
        if (i == 8) {
            ck6 ck6Var5 = this.A0;
            Tasks tasks5 = this.y0;
            Integer num5 = this.z0;
            if (ck6Var5 != null) {
                return ck6Var5.mo707a(view, num5.intValue(), tasks5);
            }
            return false;
        }
        if (i != 9) {
            return false;
        }
        ck6 ck6Var6 = this.A0;
        Tasks tasks6 = this.y0;
        Integer num6 = this.z0;
        if (ck6Var6 != null) {
            return ck6Var6.mo707a(view, num6.intValue(), tasks6);
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
            j0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.A0;
            Tasks tasks = this.y0;
            Integer num = this.z0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), tasks);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.A0;
            Tasks tasks2 = this.y0;
            Integer num2 = this.z0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), tasks2);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var3 = this.A0;
            Tasks tasks3 = this.y0;
            Integer num3 = this.z0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), tasks3);
                return;
            }
            return;
        }
        if (i == 7) {
            ck6 ck6Var4 = this.A0;
            Tasks tasks4 = this.y0;
            Integer num4 = this.z0;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), tasks4);
                return;
            }
            return;
        }
        if (i == 10) {
            ck6 ck6Var5 = this.A0;
            Tasks tasks5 = this.y0;
            Integer num5 = this.z0;
            if (ck6Var5 != null) {
                ck6Var5.mo708b(view, num5.intValue(), tasks5);
                return;
            }
            return;
        }
        if (i != 12) {
            return;
        }
        ck6 ck6Var6 = this.A0;
        Tasks tasks6 = this.y0;
        Integer num6 = this.z0;
        if (ck6Var6 != null) {
            ck6Var6.mo708b(view, num6.intValue(), tasks6);
        }
    }

    public void h0(rog rogVar) {
        this.B0 = rogVar;
        synchronized (this) {
            this.S0 |= 1;
        }
        m28509h(7);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.A0 = ck6Var;
        synchronized (this) {
            this.S0 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(Tasks tasks) {
        this.y0 = tasks;
        synchronized (this) {
            this.S0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.z0 = num;
        synchronized (this) {
            this.S0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        boolean z;
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int i3;
        int i4;
        long j2;
        boolean z6;
        int i5;
        long j3;
        String clientDesignation;
        boolean z7;
        long j4;
        long j5;
        boolean z8;
        long j6;
        long j7;
        int i6;
        long j8;
        int i7;
        List<EngagementUpdateSummary> engagementUpdates;
        String taskEngagementType;
        Long createdAt;
        String noteHeading;
        String taskAssignedTo;
        String body;
        synchronized (this) {
            j = this.S0;
            this.S0 = 0L;
        }
        rog rogVar = this.B0;
        Tasks tasks = this.y0;
        long j9 = j & 25;
        if (j9 != 0) {
            z = rogVar != null;
            if (j9 != 0) {
                j = z ? j | 4194304 : j | 2097152;
            }
        } else {
            z = false;
        }
        long j10 = j & 24;
        if (j10 != 0) {
            if (tasks != null) {
                engagementUpdates = tasks.getEngagementUpdates();
                taskEngagementType = tasks.getTaskEngagementType();
                createdAt = tasks.getCreatedAt();
                noteHeading = tasks.getNoteHeading();
                taskAssignedTo = tasks.getTaskAssignedTo();
                body = tasks.getBody();
            } else {
                engagementUpdates = null;
                taskEngagementType = null;
                createdAt = null;
                noteHeading = null;
                taskAssignedTo = null;
                body = null;
            }
            int size = engagementUpdates != null ? engagementUpdates.size() : 0;
            z2 = taskEngagementType == null;
            z3 = noteHeading == null;
            z4 = body == null;
            if (j10 != 0) {
                j = z2 ? j | MediaStatus.COMMAND_EDIT_TRACKS : j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            if ((j & 24) != 0) {
                j = z3 ? j | Javac.GENERATED_MEMBER : j | 8388608;
            }
            if ((j & 24) != 0) {
                j = z4 ? j | 68719476736L : j | 34359738368L;
            }
            boolean z9 = size > 0;
            if ((j & 24) != 0) {
                j |= z9 ? 17179869184L : 8589934592L;
            }
            i = z9 ? 0 : 8;
            str3 = taskEngagementType;
            l = createdAt;
            str = noteHeading;
            str2 = taskAssignedTo;
            str4 = body;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            l = null;
            str4 = null;
            i = 0;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        boolean zIsEmpty = ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ONE) == 0 || str3 == null) ? false : str3.isEmpty();
        boolean zIsEmpty2 = ((j & 8388608) == 0 || str == null) ? false : str.isEmpty();
        boolean zIsEmpty3 = ((j & 34359738368L) == 0 || str4 == null) ? false : str4.isEmpty();
        boolean zM47035a = ((4194304 & j) == 0 || rogVar == null) ? false : rogVar.m47035a();
        long j11 = j & 24;
        if (j11 != 0) {
            if (z2) {
                zIsEmpty = true;
            }
            if (z3) {
                zIsEmpty2 = true;
            }
            if (z4) {
                zIsEmpty3 = true;
            }
            if (j11 != 0) {
                j |= zIsEmpty ? 67108864L : 33554432L;
            }
            if ((j & 24) != 0) {
                j |= zIsEmpty2 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            if ((j & 24) != 0) {
                j |= zIsEmpty3 ? 1048576L : 524288L;
            }
            i3 = zIsEmpty ? 8 : 0;
            i4 = zIsEmpty2 ? 8 : 0;
            int i8 = zIsEmpty3 ? 8 : 0;
            j2 = 25;
            int i9 = i8;
            z5 = zM47035a;
            i2 = i9;
        } else {
            z5 = zM47035a;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            j2 = 25;
        }
        long j12 = j & j2;
        if (j12 != 0) {
            if (!z) {
                z5 = false;
            }
            if (j12 != 0) {
                j |= z5 ? 256L : 128L;
            }
            if ((j & 17) != 0) {
                j |= z5 ? 4294967296L : 2147483648L;
            }
            z6 = !z5;
            if ((j & 25) != 0) {
                j |= z6 ? 1073741824L : 536870912L;
            }
            if ((j & 17) != 0) {
                i5 = z5 ? 8 : 0;
            }
            j3 = j & 1073741952;
            if (j3 == 0) {
                clientDesignation = tasks != null ? tasks.getClientDesignation() : null;
                z7 = clientDesignation == null;
                if (j3 != 0) {
                    j = z7 ? j | MediaStatus.COMMAND_STREAM_TRANSFER : j | MediaStatus.COMMAND_UNFOLLOW;
                }
            } else {
                clientDesignation = null;
                z7 = false;
            }
            boolean zIsEmpty4 = ((j & MediaStatus.COMMAND_UNFOLLOW) != 0 || clientDesignation == null) ? false : clientDesignation.isEmpty();
            j4 = j & 1073741952;
            if (j4 == 0) {
                if (z7) {
                    zIsEmpty4 = true;
                }
                if (j4 != 0) {
                    j = zIsEmpty4 ? j | 268435456 : j | 134217728;
                }
            } else {
                zIsEmpty4 = false;
            }
            j5 = j & 268435456;
            if (j5 == 0) {
                clientCompany = tasks != null ? tasks.getClientCompany() : null;
                z8 = clientCompany == null;
                if (j5 != 0) {
                    j = z8 ? j | 64 : j | 32;
                }
            } else {
                z8 = false;
            }
            boolean zIsEmpty5 = ((j & 32) != 0 || clientCompany == null) ? false : clientCompany.isEmpty();
            if ((j & 268435456) != 0) {
                zIsEmpty5 = false;
            } else if (z8) {
                zIsEmpty5 = true;
            }
            if ((j & 1073741952) == 0) {
                if (!zIsEmpty4) {
                    zIsEmpty5 = false;
                }
                j6 = 25;
            } else {
                j6 = 25;
                zIsEmpty5 = false;
            }
            j7 = j & j6;
            if (j7 == 0) {
                boolean z10 = z5 ? true : zIsEmpty5;
                if (!z6) {
                    zIsEmpty5 = false;
                }
                if (j7 != 0) {
                    j |= z10 ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
                }
                if ((j & 25) != 0) {
                    j |= zIsEmpty5 ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
                }
                i6 = z10 ? 8 : 0;
                i7 = zIsEmpty5 ? 0 : 8;
                j8 = 24;
            } else {
                i6 = 0;
                j8 = 24;
                i7 = 0;
            }
            if ((j & j8) != 0) {
                fjh.m26938c(this.n0, str2);
                nr1.m40947R(this.n0, tasks);
                nr1.z0(this.o0, tasks);
                nr1.o3(this.D0, tasks);
                nr1.e3(this.p0, str3);
                this.p0.setVisibility(i3);
                nr1.s2(this.q0, l);
                this.s0.setVisibility(i);
                nr1.q0(this.t0, tasks);
                nr1.e1(this.u0, tasks);
                nr1.e1(this.v0, tasks);
                fjh.m26938c(this.w0, str4);
                this.w0.setVisibility(i2);
                fjh.m26938c(this.x0, str);
                this.x0.setVisibility(i4);
            }
            if ((16 & j) != 0) {
                this.n0.setOnClickListener(this.Q0);
                this.o0.setOnClickListener(this.M0);
                this.o0.setOnLongClickListener(this.P0);
                this.C0.setOnClickListener(this.H0);
                this.C0.setOnLongClickListener(this.K0);
                this.F0.setOnClickListener(this.L0);
                this.F0.setOnLongClickListener(this.N0);
                this.t0.setOnLongClickListener(this.I0);
                this.u0.setOnClickListener(this.G0);
                this.u0.setOnLongClickListener(this.O0);
                this.v0.setOnClickListener(this.R0);
                this.v0.setOnLongClickListener(this.J0);
            }
            if ((j & 17) != 0) {
                int i10 = i5;
                this.o0.setVisibility(i10);
                this.E0.setVisibility(i10);
            }
            if ((j & 25) == 0) {
                this.t0.setVisibility(i6);
                this.u0.setVisibility(i6);
                this.v0.setVisibility(i7);
                return;
            }
            return;
        }
        z6 = false;
        z5 = false;
        i5 = 0;
        j3 = j & 1073741952;
        if (j3 == 0) {
        }
        if ((j & MediaStatus.COMMAND_UNFOLLOW) != 0) {
        }
        j4 = j & 1073741952;
        if (j4 == 0) {
        }
        j5 = j & 268435456;
        if (j5 == 0) {
        }
        if ((j & 32) != 0) {
        }
        if ((j & 268435456) != 0) {
        }
        if ((j & 1073741952) == 0) {
        }
        j7 = j & j6;
        if (j7 == 0) {
        }
        if ((j & j8) != 0) {
        }
        if ((16 & j) != 0) {
        }
        if ((j & 17) != 0) {
        }
        if ((j & 25) == 0) {
        }
    }

    public g49(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Chip) objArr[11], (ShapeableImageView) objArr[3], (ShapeableImageView) objArr[6], (MaterialTextView) objArr[13], (ConstraintLayout) objArr[14], (ShapeableImageView) objArr[12], (MaterialTextView) objArr[7], (MaterialTextView) objArr[4], (MaterialTextView) objArr[5], (MaterialTextView) objArr[10], (MaterialTextView) objArr[9]);
        this.S0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.C0 = materialCardView;
        materialCardView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.D0 = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[2];
        this.E0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[8];
        this.F0 = constraintLayout2;
        constraintLayout2.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        a0(view);
        this.G0 = new jbc(this, 5);
        this.H0 = new jbc(this, 1);
        this.I0 = new sbc(this, 9);
        this.J0 = new sbc(this, 8);
        this.K0 = new sbc(this, 2);
        this.L0 = new jbc(this, 10);
        this.M0 = new jbc(this, 3);
        this.N0 = new sbc(this, 11);
        this.O0 = new sbc(this, 6);
        this.P0 = new sbc(this, 4);
        this.Q0 = new jbc(this, 12);
        this.R0 = new jbc(this, 7);
        mo16291G();
    }
}
