package p001o;

import ai.salesmax.model.CommentSummary;
import ai.salesmax.model.EngagementUpdateSummary;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.ibc;
import p001o.jbc;

/* loaded from: classes.dex */
public class q39 extends p39 implements jbc.InterfaceC14485a, ibc.InterfaceC14238a {
    public static final ewi.C13274i N0 = null;
    public static final SparseIntArray O0;
    public final MaterialCardView G0;
    public final MaterialCardView H0;
    public final View.OnClickListener I0;
    public final View.OnClickListener J0;
    public final CompoundButton.OnCheckedChangeListener K0;
    public final View.OnClickListener L0;
    public long M0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O0 = sparseIntArray;
        sparseIntArray.put(z8e.clientDetailMore, 16);
    }

    public q39(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 17, N0, O0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.M0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.M0 = 16L;
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
            j0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.E0;
            Tasks tasks = this.C0;
            Integer num = this.D0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), tasks);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.E0;
            Tasks tasks2 = this.C0;
            Integer num2 = this.D0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), tasks2);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ck6 ck6Var3 = this.E0;
        Tasks tasks3 = this.C0;
        Integer num3 = this.D0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), tasks3);
        }
    }

    @Override // p001o.ibc.InterfaceC14238a
    /* renamed from: d */
    public final void mo31835d(int i, CompoundButton compoundButton, boolean z) {
        Tasks tasks = this.C0;
        if (tasks != null) {
            tasks.setSelected(z);
        }
    }

    public void h0(rog rogVar) {
        this.F0 = rogVar;
        synchronized (this) {
            this.M0 |= 1;
        }
        m28509h(7);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.E0 = ck6Var;
        synchronized (this) {
            this.M0 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(Tasks tasks) {
        this.C0 = tasks;
        synchronized (this) {
            this.M0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.D0 = num;
        synchronized (this) {
            this.M0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b1 A[PHI: r2
      0x01b1: PHI (r2v3 long) = (r2v2 long), (r2v34 long) binds: [B:107:0x019a, B:115:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zIsExpired;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j2;
        int i5;
        int i6;
        int i7;
        boolean z4;
        long j3;
        boolean z5;
        String clientDesignation;
        long j4;
        long j5;
        boolean z6;
        String clientCompany;
        boolean zIsEmpty;
        long j6;
        int i8;
        int i9;
        long j7;
        boolean zIsSelected;
        boolean zIsNewItem;
        List<EngagementUpdateSummary> engagementUpdates;
        String clientName;
        String taskAssignedTo;
        String taskTitle;
        String taskContent;
        List<CommentSummary> comments;
        String taskContactMode;
        synchronized (this) {
            j = this.M0;
            this.M0 = 0L;
        }
        rog rogVar = this.F0;
        Tasks tasks = this.C0;
        if ((j & 25) != 0) {
            z = rogVar != null;
            if ((j & 281) != 0) {
                j = z ? j | 67108864 : j | 33554432;
            }
            zIsExpired = tasks != null ? tasks.isExpired() : false;
            if ((j & 25) != 0) {
                j |= zIsExpired ? 256L : 128L;
            }
            long j8 = j & 24;
            if (j8 != 0) {
                if (tasks != null) {
                    engagementUpdates = tasks.getEngagementUpdates();
                    zIsSelected = tasks.isSelected();
                    clientName = tasks.getClientName();
                    zIsNewItem = tasks.isNewItem();
                    long taskDateTimeInMillis = tasks.getTaskDateTimeInMillis();
                    taskAssignedTo = tasks.getTaskAssignedTo();
                    taskTitle = tasks.getTaskTitle();
                    taskContent = tasks.getTaskContent();
                    comments = tasks.getComments();
                    taskContactMode = tasks.getTaskContactMode();
                    j7 = taskDateTimeInMillis;
                } else {
                    j7 = 0;
                    zIsSelected = false;
                    zIsNewItem = false;
                    engagementUpdates = null;
                    clientName = null;
                    taskAssignedTo = null;
                    taskTitle = null;
                    taskContent = null;
                    comments = null;
                    taskContactMode = null;
                }
                if (j8 != 0) {
                    j |= zIsNewItem ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
                }
                int size = engagementUpdates != null ? engagementUpdates.size() : 0;
                int iM25688z = ewi.m25688z(this.G0, zIsNewItem ? u6e.superfone_red : u6e.superfone_white);
                boolean z7 = j7 > 0;
                str2 = "" + j7;
                z2 = taskContent == null;
                if ((j & 24) != 0) {
                    j |= z7 ? 274877906944L : 137438953472L;
                }
                if ((j & 24) != 0) {
                    j |= z2 ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
                }
                int size2 = comments != null ? comments.size() : 0;
                boolean z8 = size > 0;
                i = z7 ? 0 : 8;
                boolean z9 = size2 > 0;
                if ((j & 24) != 0) {
                    j |= z8 ? 68719476736L : 34359738368L;
                }
                if ((j & 24) != 0) {
                    j |= z9 ? 268435456L : 134217728L;
                }
                int i10 = z8 ? 0 : 8;
                i3 = z9 ? 0 : 8;
                i2 = i10;
                z3 = zIsSelected;
                str4 = clientName;
                str3 = taskAssignedTo;
                str5 = taskTitle;
                str6 = taskContactMode;
                i4 = iM25688z;
                str = taskContent;
                boolean zM47035a = ((67108864 & j) != 0 || rogVar == null) ? false : rogVar.m47035a();
                boolean zIsEmpty2 = ((MediaStatus.COMMAND_QUEUE_REPEAT_ONE & j) != 0 || str == null) ? false : str.isEmpty();
                j2 = j & 24;
                if (j2 == 0) {
                    i5 = 0;
                } else {
                    if (z2) {
                        zIsEmpty2 = true;
                    }
                    if (j2 != 0) {
                        j |= zIsEmpty2 ? 1048576L : 524288L;
                    }
                    if (zIsEmpty2) {
                        i5 = 8;
                    }
                }
                if ((281 & j) == 0) {
                    if (!z) {
                        zM47035a = false;
                    }
                    if ((j & 25) != 0) {
                        j |= zM47035a ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
                    }
                    if ((j & 17) != 0) {
                        j |= zM47035a ? 17179869184L : 8589934592L;
                    }
                    long j9 = j & 25;
                    if (j9 != 0) {
                        boolean z10 = zIsExpired ? zM47035a : false;
                        z4 = !zM47035a;
                        if (j9 != 0) {
                            j |= z10 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
                        }
                        if ((j & 25) != 0) {
                            j |= z4 ? 4294967296L : 2147483648L;
                        }
                        i6 = z10 ? 0 : 8;
                    } else {
                        i6 = 0;
                        z4 = false;
                    }
                    i7 = ((j & 17) == 0 || !zM47035a) ? 0 : 8;
                } else {
                    zM47035a = false;
                    i6 = 0;
                    i7 = 0;
                    z4 = false;
                }
                j3 = j & 4294967808L;
                if (j3 == 0) {
                    clientDesignation = tasks != null ? tasks.getClientDesignation() : null;
                    z5 = clientDesignation == null;
                    if (j3 != 0) {
                        j = z5 ? j | Javac.GENERATED_MEMBER : j | 8388608;
                    }
                } else {
                    z5 = false;
                    clientDesignation = null;
                }
                boolean zIsEmpty3 = ((j & 8388608) != 0 || clientDesignation == null) ? false : clientDesignation.isEmpty();
                j4 = j & 4294967808L;
                if (j4 == 0) {
                    if (z5) {
                        zIsEmpty3 = true;
                    }
                    if (j4 != 0) {
                        j = zIsEmpty3 ? j | 1073741824 : j | 536870912;
                    }
                } else {
                    zIsEmpty3 = false;
                }
                j5 = j & 1073741824;
                if (j5 == 0) {
                    clientCompany = tasks != null ? tasks.getClientCompany() : null;
                    z6 = clientCompany == null;
                    if (j5 != 0) {
                        j = z6 ? j | 64 : j | 32;
                    }
                } else {
                    z6 = false;
                    clientCompany = null;
                }
                zIsEmpty = ((j & 32) != 0 || clientCompany == null) ? false : clientCompany.isEmpty();
                if ((j & 1073741824) != 0) {
                    zIsEmpty = false;
                } else if (z6) {
                    zIsEmpty = true;
                }
                if ((j & 4294967808L) != 0 || !zIsEmpty3) {
                    zIsEmpty = false;
                }
                j6 = j & 25;
                if (j6 == 0) {
                    boolean z11 = zM47035a ? true : zIsEmpty;
                    if (!z4) {
                        zIsEmpty = false;
                    }
                    if (j6 != 0) {
                        j |= z11 ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
                    }
                    if ((j & 25) != 0) {
                        j |= zIsEmpty ? 4194304L : 2097152L;
                    }
                    i8 = z11 ? 8 : 0;
                    i9 = zIsEmpty ? 0 : 8;
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                if ((j & 24) != 0) {
                    nr1.t2(this.n0, str2);
                    this.o0.setVisibility(i);
                    np3.m40895a(this.p0, z3);
                    fjh.m26938c(this.q0, str3);
                    nr1.m40947R(this.q0, tasks);
                    nr1.z0(this.s0, tasks);
                    this.G0.setStrokeColor(i4);
                    String str7 = str6;
                    nr1.n3(this.H0, str7);
                    this.t0.setVisibility(i3);
                    nr1.p3(this.v0, str7);
                    this.w0.setVisibility(i2);
                    nr1.q0(this.x0, tasks);
                    String str8 = str4;
                    nr1.f1(this.y0, str8);
                    nr1.f1(this.z0, str8);
                    fjh.m26938c(this.A0, str5);
                    fjh.m26938c(this.B0, str);
                    this.B0.setVisibility(i5);
                }
                if ((16 & j) != 0) {
                    np3.m40896b(this.p0, this.K0, null);
                    this.s0.setOnClickListener(this.J0);
                    this.G0.setOnClickListener(this.I0);
                    this.H0.setOnClickListener(this.L0);
                }
                if ((j & 17) != 0) {
                    this.s0.setVisibility(i7);
                }
                if ((j & 25) == 0) {
                    this.u0.setVisibility(i6);
                    this.x0.setVisibility(i8);
                    this.y0.setVisibility(i8);
                    this.z0.setVisibility(i9);
                    return;
                }
                return;
            }
            i = 0;
            z2 = false;
            z3 = false;
            i2 = 0;
        } else {
            i = 0;
            z = false;
            z2 = false;
            z3 = false;
            zIsExpired = false;
            i2 = 0;
        }
        i3 = i2;
        i4 = i3;
        str = null;
        str2 = null;
        str3 = null;
        str4 = null;
        str5 = null;
        str6 = null;
        if ((67108864 & j) != 0) {
        }
        if ((MediaStatus.COMMAND_QUEUE_REPEAT_ONE & j) != 0) {
        }
        j2 = j & 24;
        if (j2 == 0) {
        }
        if ((281 & j) == 0) {
        }
        j3 = j & 4294967808L;
        if (j3 == 0) {
        }
        if ((j & 8388608) != 0) {
        }
        j4 = j & 4294967808L;
        if (j4 == 0) {
        }
        j5 = j & 1073741824;
        if (j5 == 0) {
        }
        if ((j & 32) != 0) {
        }
        if ((j & 1073741824) != 0) {
        }
        if ((j & 4294967808L) != 0) {
            zIsEmpty = false;
        }
        j6 = j & 25;
        if (j6 == 0) {
        }
        if ((j & 24) != 0) {
        }
        if ((16 & j) != 0) {
        }
        if ((j & 17) != 0) {
        }
        if ((j & 25) == 0) {
        }
    }

    public q39(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[15], (ShapeableImageView) objArr[14], (CheckBox) objArr[5], (Chip) objArr[11], (MaterialButton) objArr[16], (ShapeableImageView) objArr[1], (ShapeableImageView) objArr[12], (MaterialButton) objArr[8], (ShapeableImageView) objArr[10], (ShapeableImageView) objArr[13], (MaterialTextView) objArr[4], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3], (MaterialTextView) objArr[7], (MaterialTextView) objArr[9]);
        this.M0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.s0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.G0 = materialCardView;
        materialCardView.setTag(null);
        MaterialCardView materialCardView2 = (MaterialCardView) objArr[6];
        this.H0 = materialCardView2;
        materialCardView2.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        a0(view);
        this.I0 = new jbc(this, 1);
        this.J0 = new jbc(this, 2);
        this.K0 = new ibc(this, 3);
        this.L0 = new jbc(this, 4);
        mo16291G();
    }
}
