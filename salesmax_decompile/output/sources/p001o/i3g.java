package p001o;

import ai.salesmax.model.AssignmentOutcome;
import ai.salesmax.model.FormFields;
import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import lombok.javac.Javac;
import p001o.ewi;

/* loaded from: classes.dex */
public class i3g extends h3g {
    public static final ewi.C13274i F1;
    public static final SparseIntArray G1;
    public final FrameLayout D1;
    public long E1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(55);
        F1 = c13274i;
        int i = p9e.content_custom_form;
        c13274i.m25699a(6, new String[]{"content_custom_form", "content_custom_form"}, new int[]{18, 19}, new int[]{i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G1 = sparseIntArray;
        sparseIntArray.put(z8e.contentCallDataParent, 20);
        sparseIntArray.put(z8e.leadCallReminder, 21);
        sparseIntArray.put(z8e.leadDetailsClose, 22);
        sparseIntArray.put(z8e.editContact, 23);
        sparseIntArray.put(z8e.rvUserTags, 24);
        sparseIntArray.put(z8e.leadDetailsBorder1, 25);
        sparseIntArray.put(z8e.tvCallOutComeTitle, 26);
        sparseIntArray.put(z8e.tvCallOutcomeDateEdit, 27);
        sparseIntArray.put(z8e.leadDetailsBorder2, 28);
        sparseIntArray.put(z8e.tvHeadingText, 29);
        sparseIntArray.put(z8e.rvOpenTaskList, 30);
        sparseIntArray.put(z8e.rvCurrentTaskType, 31);
        sparseIntArray.put(z8e.taskCompletionTypeOptions, 32);
        sparseIntArray.put(z8e.taskCompletedInSuccess, 33);
        sparseIntArray.put(z8e.taskCompletedInFailure, 34);
        sparseIntArray.put(z8e.taskUpdated, 35);
        sparseIntArray.put(z8e.scrollTranscript, 36);
        sparseIntArray.put(z8e.tvTranscript, 37);
        sparseIntArray.put(z8e.taskCompleteHint, 38);
        sparseIntArray.put(z8e.notesBorder1, 39);
        sparseIntArray.put(z8e.taskActionButtons, 40);
        sparseIntArray.put(z8e.taskAttachment, 41);
        sparseIntArray.put(z8e.taskPicture, 42);
        sparseIntArray.put(z8e.scanDoc, 43);
        sparseIntArray.put(z8e.btnLaterToday, 44);
        sparseIntArray.put(z8e.btnTomorrow, 45);
        sparseIntArray.put(z8e.btnLaterThisWeek, 46);
        sparseIntArray.put(z8e.btnNextWeek, 47);
        sparseIntArray.put(z8e.btnCustomDate, 48);
        sparseIntArray.put(z8e.sendMessageLayout, 49);
        sparseIntArray.put(z8e.leadWhatsapp, 50);
        sparseIntArray.put(z8e.leadMessage, 51);
        sparseIntArray.put(z8e.leadMail, 52);
        sparseIntArray.put(z8e.sendTemplateAction, 53);
        sparseIntArray.put(z8e.sendTemplateTitle, 54);
    }

    public i3g(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 55, F1, G1));
    }

    @Override // p001o.h3g
    public void B0(Boolean bool) {
        this.p1 = bool;
        synchronized (this) {
            this.E1 |= 16;
        }
        m28509h(99);
        super.m25692R();
    }

    public final boolean C0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.E1 |= 2;
        }
        return true;
    }

    public final boolean D0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.E1 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.E1 != 0) {
                return true;
            }
            return this.v0.mo16290E() || this.w0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.E1 = MediaStatus.COMMAND_FOLLOW;
        }
        this.v0.mo16291G();
        this.w0.mo16291G();
        m25692R();
    }

    public void G0(ck6 ck6Var) {
        this.C1 = ck6Var;
        synchronized (this) {
            this.E1 |= 256;
        }
        m28509h(33);
        super.m25692R();
    }

    public void H0(Integer num) {
        this.B1 = num;
        synchronized (this) {
            this.E1 |= MediaStatus.COMMAND_EDIT_TRACKS;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return D0((r14) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return C0((r14) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (94 == i) {
            z0((Tasks) obj);
        } else if (19 == i) {
            q0((FormFields) obj);
        } else if (99 == i) {
            B0((Boolean) obj);
        } else if (61 == i) {
            w0((Leads) obj);
        } else if (20 == i) {
            s0((FormFields) obj);
        } else if (43 == i) {
            t0((Boolean) obj);
        } else if (33 == i) {
            G0((ck6) obj);
        } else if (57 == i) {
            v0((Boolean) obj);
        } else if (82 == i) {
            y0(((Boolean) obj).booleanValue());
        } else if (14 == i) {
            p0((Boolean) obj);
        } else if (73 == i) {
            H0((Integer) obj);
        } else if (13 == i) {
            n0((Boolean) obj);
        } else if (67 == i) {
            x0((Tasks) obj);
        } else {
            if (53 != i) {
                return false;
            }
            u0((Boolean) obj);
        }
        return true;
    }

    @Override // p001o.h3g
    public void n0(Boolean bool) {
        this.v1 = bool;
        synchronized (this) {
            this.E1 |= MediaStatus.COMMAND_PLAYBACK_RATE;
        }
        m28509h(13);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x010d A[PHI: r2
      0x010d: PHI (r2v3 long) = (r2v2 long), (r2v52 long) binds: [B:59:0x00f6, B:66:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        String taskCompletionType;
        boolean z;
        boolean z2;
        boolean zIsEmpty;
        boolean zM25676W;
        int i;
        Leads leads;
        String name;
        int i2;
        String str;
        FormFields formFields;
        String str2;
        boolean z3;
        int i3;
        boolean z4;
        long callStartTime;
        Tasks tasks;
        int i4;
        boolean z5;
        boolean zM25676W2;
        boolean z6;
        boolean z7;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z8;
        String taskCompletionNote;
        int i11;
        int i12;
        boolean z9;
        long j2;
        long j3;
        String engagementSource;
        AssignmentOutcome assignmentOutcome;
        synchronized (this) {
            j = this.E1;
            this.E1 = 0L;
        }
        Tasks tasks2 = this.t1;
        FormFields formFields2 = this.z1;
        Boolean bool = this.p1;
        Leads leads2 = this.x1;
        FormFields formFields3 = this.A1;
        ck6 ck6Var = this.C1;
        boolean z10 = this.y1;
        Boolean bool2 = this.w1;
        Integer num = this.B1;
        Boolean bool3 = this.v1;
        Tasks tasks3 = this.s1;
        int i13 = 0;
        if ((j & 75796) != 0) {
            long j4 = j & 65556;
            if (j4 != 0) {
                String taskNextStep = tasks2 != null ? tasks2.getTaskNextStep() : null;
                zIsEmpty = taskNextStep != null ? taskNextStep.isEmpty() : false;
                if (j4 != 0) {
                    j = zIsEmpty ? j | 68719476736L : j | 34359738368L;
                }
            } else {
                zIsEmpty = false;
            }
            boolean z11 = ((j & 65540) == 0 || tasks2 == null) ? false : true;
            taskCompletionType = tasks2 != null ? tasks2.getTaskCompletionType() : null;
            z = taskCompletionType == "Success";
            if ((j & 75796) != 0) {
                j |= z ? 70368744177664L : 35184372088832L;
            }
            z2 = z11;
        } else {
            taskCompletionType = null;
            z = false;
            z2 = false;
            zIsEmpty = false;
        }
        long j5 = j & 65552;
        if (j5 != 0) {
            zM25676W = ewi.m25676W(bool);
            if (j5 != 0) {
                j = zM25676W ? j | 268435456 : j | 134217728;
            }
            i = zM25676W ? 8 : 0;
        } else {
            zM25676W = false;
            i = 0;
        }
        if ((j & 65568) == 0 || leads2 == null) {
            leads = leads2;
            name = null;
        } else {
            leads = leads2;
            name = leads2.getName();
        }
        long j6 = j & 66560;
        if (j6 != 0) {
            boolean z12 = !z10;
            if (j6 != 0) {
                j |= z12 ? 4398046511104L : 2199023255552L;
            }
            i2 = z12 ? 0 : 8;
        }
        if ((j & 92160) != 0) {
            long j7 = j & 81920;
            if (j7 != 0) {
                if (tasks3 != null) {
                    callStartTime = tasks3.getCallStartTime();
                    taskCompletionNote = tasks3.getTaskCompletionNote();
                    assignmentOutcome = tasks3.getAssignmentOutcome();
                    str = name;
                    engagementSource = tasks3.getEngagementSource();
                } else {
                    str = name;
                    engagementSource = null;
                    taskCompletionNote = null;
                    assignmentOutcome = null;
                    callStartTime = 0;
                }
                formFields = formFields3;
                boolean z13 = assignmentOutcome != null;
                boolean z14 = engagementSource == "WhatsApp";
                if (j7 != 0) {
                    j |= z13 ? 17179869184L : 8589934592L;
                }
                if ((j & 81920) != 0) {
                    j |= z14 ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
                }
                i12 = z13 ? 0 : 8;
                i11 = z14 ? 8 : 0;
            } else {
                str = name;
                formFields = formFields3;
                taskCompletionNote = null;
                i11 = 0;
                i12 = 0;
                callStartTime = 0;
            }
            i3 = i11;
            String taskCompletionType2 = tasks3 != null ? tasks3.getTaskCompletionType() : null;
            long j8 = j & 90112;
            int i14 = i12;
            if (j8 != 0) {
                z9 = taskCompletionType2 == "Failure";
                if (j8 != 0) {
                    j = z9 ? j | 1048576 : j | 524288;
                }
            } else {
                z9 = false;
            }
            long j9 = j & 83968;
            z4 = z9;
            if (j9 != 0) {
                z3 = taskCompletionType2 == "Success";
                if (j9 != 0) {
                    if (z3) {
                        j2 = j | 67108864;
                        j3 = 281474976710656L;
                    } else {
                        j2 = j | 33554432;
                        j3 = 140737488355328L;
                    }
                    j = j2 | j3;
                }
                tasks = tasks3;
            } else {
                tasks = tasks3;
                z3 = false;
            }
            str2 = taskCompletionNote;
            i4 = i14;
        } else {
            str = name;
            formFields = formFields3;
            str2 = null;
            z3 = false;
            i3 = 0;
            z4 = false;
            callStartTime = 0;
            tasks = tasks3;
            i4 = 0;
        }
        if ((j & 68719476736L) != 0) {
            zM25676W = ewi.m25676W(bool);
            if ((j & 65552) != 0) {
                j = zM25676W ? j | 268435456 : j | 134217728;
            }
            z5 = !zM25676W;
        } else {
            z5 = false;
        }
        if ((j & 351843787997184L) != 0) {
            zM25676W2 = ewi.m25676W(bool2);
            z6 = (j & 67108864) != 0 ? !zM25676W2 : false;
        } else {
            zM25676W2 = false;
            z6 = false;
        }
        boolean zM25676W3 = (j & 1048576) != 0 ? ewi.m25676W(bool3) : false;
        long j10 = j & 90112;
        if (j10 != 0) {
            boolean z15 = z4 ? zM25676W3 : false;
            if (j10 != 0) {
                j |= z15 ? 1073741824L : 536870912L;
            }
            z7 = zM25676W2;
            i5 = z15 ? 0 : 8;
        } else {
            z7 = zM25676W2;
            i5 = 0;
        }
        long j11 = j & 83968;
        if (j11 != 0) {
            if (!z3) {
                z6 = false;
            }
            boolean z16 = z3 ? z7 : false;
            if (j11 != 0) {
                j |= z6 ? 4194304L : 2097152L;
            }
            if ((j & 83968) != 0) {
                j |= z16 ? 274877906944L : 137438953472L;
            }
            int i15 = z6 ? 0 : 8;
            i7 = z16 ? 0 : 8;
            int i16 = i15;
            i6 = i5;
            i8 = i16;
        } else {
            i6 = i5;
            i7 = 0;
            i8 = 0;
        }
        long j12 = j & 65556;
        if (j12 != 0) {
            if (!zIsEmpty) {
                z5 = false;
            }
            if (j12 != 0) {
                j |= z5 ? Javac.GENERATED_MEMBER : 8388608L;
            }
            int i17 = z5 ? 8 : 0;
            i9 = i7;
            i10 = i17;
        } else {
            i9 = i7;
            i10 = 0;
        }
        long j13 = j & 75796;
        if (j13 != 0) {
            if (!z) {
                z7 = false;
            }
            if (j13 != 0) {
                j = z7 ? j | 1125899906842624L : j | 562949953421312L;
            }
        } else {
            z7 = false;
        }
        long j14 = j & 562949953421312L;
        int i18 = i8;
        if (j14 != 0) {
            z8 = taskCompletionType == "Failure";
            if (j14 != 0) {
                j = z8 ? j | 4294967296L : j | 2147483648L;
            }
        } else {
            z8 = false;
        }
        if ((j & 4294967296L) != 0) {
            zM25676W3 = ewi.m25676W(bool3);
        }
        if ((j & 562949953421312L) == 0 || !z8) {
            zM25676W3 = false;
        }
        long j15 = j & 75796;
        if (j15 != 0) {
            if (z7) {
                zM25676W3 = true;
            }
            if (j15 != 0) {
                j = zM25676W3 ? j | 17592186044416L : j | 8796093022208L;
            }
        } else {
            zM25676W3 = false;
        }
        if ((j & 8796093022208L) != 0) {
            zM25676W = ewi.m25676W(bool);
            if ((j & 65552) != 0) {
                j = zM25676W ? j | 268435456 : j | 134217728;
            }
        }
        long j16 = j & 75796;
        if (j16 != 0) {
            boolean z17 = zM25676W3 ? true : zM25676W;
            if (j16 != 0) {
                j |= z17 ? 1099511627776L : 549755813888L;
            }
            if (z17) {
                i13 = 8;
            }
        }
        int i19 = i13;
        if ((j & 65540) != 0) {
            this.s0.setEnabled(z2);
        }
        if ((j & 66560) != 0) {
            this.t0.setVisibility(i2);
        }
        if ((65544 & j) != 0) {
            this.v0.i0(formFields2);
        }
        if ((65792 & j) != 0) {
            this.v0.h0(ck6Var);
            this.w0.h0(ck6Var);
        }
        if ((69632 & j) != 0) {
            this.v0.j0(num);
            this.w0.j0(num);
        }
        if ((65600 & j) != 0) {
            this.w0.i0(formFields);
        }
        if ((j & 65568) != 0) {
            nr1.f1(this.C0, str);
            Leads leads3 = leads;
            nr1.Z0(this.D0, leads3);
            nr1.V0(this.E0, leads3);
        }
        if ((j & 81920) != 0) {
            this.I0.setVisibility(i4);
            fjh.m26938c(this.V0, str2);
            int i20 = i3;
            this.h1.setVisibility(i20);
            nr1.s2(this.h1, Long.valueOf(callStartTime));
            this.j1.setVisibility(i20);
            nr1.m40930A(this.j1, tasks);
        }
        if ((j & 75796) != 0) {
            this.L0.setVisibility(i19);
            this.e1.setVisibility(i19);
            this.f1.setVisibility(i19);
        }
        if ((j & 65552) != 0) {
            this.a1.setVisibility(i);
        }
        if ((j & 65556) != 0) {
            this.d1.setVisibility(i10);
        }
        if ((j & 83968) != 0) {
            this.l1.setVisibility(i18);
            this.n1.setVisibility(i9);
        }
        if ((j & 90112) != 0) {
            this.m1.setVisibility(i6);
        }
        ewi.m25683r(this.v0);
        ewi.m25683r(this.w0);
    }

    @Override // p001o.h3g
    public void p0(Boolean bool) {
        this.w1 = bool;
        synchronized (this) {
            this.E1 |= MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
        }
        m28509h(14);
        super.m25692R();
    }

    @Override // p001o.h3g
    public void q0(FormFields formFields) {
        this.z1 = formFields;
        synchronized (this) {
            this.E1 |= 8;
        }
        m28509h(19);
        super.m25692R();
    }

    @Override // p001o.h3g
    public void s0(FormFields formFields) {
        this.A1 = formFields;
        synchronized (this) {
            this.E1 |= 64;
        }
        m28509h(20);
        super.m25692R();
    }

    @Override // p001o.h3g
    public void t0(Boolean bool) {
        this.r1 = bool;
    }

    @Override // p001o.h3g
    public void u0(Boolean bool) {
        this.q1 = bool;
    }

    @Override // p001o.h3g
    public void v0(Boolean bool) {
        this.u1 = bool;
    }

    @Override // p001o.h3g
    public void w0(Leads leads) {
        this.x1 = leads;
        synchronized (this) {
            this.E1 |= 32;
        }
        m28509h(61);
        super.m25692R();
    }

    @Override // p001o.h3g
    public void x0(Tasks tasks) {
        this.s1 = tasks;
        synchronized (this) {
            this.E1 |= MediaStatus.COMMAND_LIKE;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.h3g
    public void y0(boolean z) {
        this.y1 = z;
        synchronized (this) {
            this.E1 |= MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
        }
        m28509h(82);
        super.m25692R();
    }

    @Override // p001o.h3g
    public void z0(Tasks tasks) {
        this.t1 = tasks;
        synchronized (this) {
            this.E1 |= 4;
        }
        m28509h(94);
        super.m25692R();
    }

    public i3g(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (Button) objArr[48], (Button) objArr[46], (Button) objArr[44], (Button) objArr[47], (Button) objArr[45], (MaterialButton) objArr[17], (ConstraintLayout) objArr[6], (MaterialCardView) objArr[20], (r14) objArr[18], (r14) objArr[19], (ShapeableImageView) objArr[23], (ShapeableImageView) objArr[21], (View) objArr[25], (View) objArr[28], (ShapeableImageView) objArr[22], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3], (ShapeableImageView) objArr[1], (MaterialButton) objArr[52], (MaterialButton) objArr[51], (MaterialButton) objArr[50], (MaterialButton) objArr[14], (View) objArr[39], (RecyclerView) objArr[31], (RecyclerView) objArr[15], (RecyclerView) objArr[30], (RecyclerView) objArr[24], (MaterialButton) objArr[43], (NestedScrollView) objArr[36], (LinearLayout) objArr[49], (MaterialCardView) objArr[53], (MaterialTextView) objArr[54], (LinearLayout) objArr[40], (MaterialButton) objArr[41], (TextInputEditText) objArr[10], (TextInputLayout) objArr[38], (Button) objArr[34], (Button) objArr[33], (MaterialButtonToggleGroup) objArr[32], (RecyclerView) objArr[11], (MaterialButton) objArr[42], (Button) objArr[35], (MaterialButtonToggleGroup) objArr[16], (MaterialTextView) objArr[13], (MaterialTextView) objArr[12], (MaterialTextView) objArr[26], (MaterialTextView) objArr[4], (MaterialButton) objArr[27], (MaterialTextView) objArr[5], (MaterialTextView) objArr[29], (MaterialTextView) objArr[7], (MaterialTextView) objArr[9], (MaterialTextView) objArr[8], (MaterialTextView) objArr[37]);
        this.E1 = -1L;
        this.s0.setTag(null);
        this.t0.setTag(null);
        m25693Z(this.v0);
        m25693Z(this.w0);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.D1 = frameLayout;
        frameLayout.setTag(null);
        this.I0.setTag(null);
        this.L0.setTag(null);
        this.V0.setTag(null);
        this.a1.setTag(null);
        this.d1.setTag(null);
        this.e1.setTag(null);
        this.f1.setTag(null);
        this.h1.setTag(null);
        this.j1.setTag(null);
        this.l1.setTag(null);
        this.m1.setTag(null);
        this.n1.setTag(null);
        a0(view);
        mo16291G();
    }
}
