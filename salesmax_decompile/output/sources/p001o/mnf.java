package p001o;

import ai.salesmax.model.FormFields;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import lombok.javac.Javac;
import p001o.ewi;

/* loaded from: classes.dex */
public class mnf extends lnf {
    public static final ewi.C13274i e1;
    public static final SparseIntArray f1;
    public final LinearLayout b1;
    public final ConstraintLayout c1;
    public long d1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(33);
        e1 = c13274i;
        int i = p9e.content_custom_form;
        c13274i.m25699a(1, new String[]{"content_custom_form", "content_custom_form"}, new int[]{13, 14}, new int[]{i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 15);
        sparseIntArray.put(z8e.buttonDone, 16);
        sparseIntArray.put(z8e.taskCompletionTypeOptions, 17);
        sparseIntArray.put(z8e.taskCompletedInSuccess, 18);
        sparseIntArray.put(z8e.taskCompletedInFailure, 19);
        sparseIntArray.put(z8e.taskUpdated, 20);
        sparseIntArray.put(z8e.taskCompleteHint, 21);
        sparseIntArray.put(z8e.notesBorder1, 22);
        sparseIntArray.put(z8e.taskActionButtons, 23);
        sparseIntArray.put(z8e.taskAttachment, 24);
        sparseIntArray.put(z8e.taskPicture, 25);
        sparseIntArray.put(z8e.scanDoc, 26);
        sparseIntArray.put(z8e.btnLaterToday, 27);
        sparseIntArray.put(z8e.btnTomorrow, 28);
        sparseIntArray.put(z8e.btnLaterThisWeek, 29);
        sparseIntArray.put(z8e.btnNextWeek, 30);
        sparseIntArray.put(z8e.btnCustomDate, 31);
        sparseIntArray.put(z8e.callOutcome_ActionButton, 32);
    }

    public mnf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 33, e1, f1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.d1 != 0) {
                return true;
            }
            return this.v0.mo16290E() || this.w0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.d1 = MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
        }
        this.v0.mo16291G();
        this.w0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return w0((r14) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return x0((r14) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (56 == i) {
            t0((Boolean) obj);
        } else if (14 == i) {
            p0((Boolean) obj);
        } else if (19 == i) {
            q0((FormFields) obj);
        } else if (73 == i) {
            z0((Integer) obj);
        } else if (13 == i) {
            n0((Boolean) obj);
        } else if (99 == i) {
            v0((Boolean) obj);
        } else if (20 == i) {
            s0((FormFields) obj);
        } else if (33 == i) {
            y0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            u0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.lnf
    public void n0(Boolean bool) {
        this.U0 = bool;
        synchronized (this) {
            this.d1 |= 64;
        }
        m28509h(13);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0211 A[PHI: r2
      0x0211: PHI (r2v8 long) = (r2v7 long), (r2v29 long) binds: [B:146:0x01f6, B:155:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02cc  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        boolean zM25676W;
        boolean z;
        boolean z2;
        boolean zIsEmpty;
        String taskCompletionNote;
        String taskCompletionType;
        boolean zM25676W2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z6;
        int i7;
        long j2;
        long j3;
        synchronized (this) {
            j = this.d1;
            this.d1 = 0L;
        }
        Boolean bool = this.V0;
        FormFields formFields = this.X0;
        Integer num = this.Z0;
        Boolean bool2 = this.U0;
        Boolean bool3 = this.S0;
        FormFields formFields2 = this.Y0;
        ck6 ck6Var = this.a1;
        Tasks tasks = this.W0;
        long j4 = j & 2176;
        if (j4 != 0) {
            zM25676W = ewi.m25676W(bool3);
            if (j4 != 0) {
                j = zM25676W ? j | 8589934592L : j | 4294967296L;
            }
            i = zM25676W ? 8 : 0;
        } else {
            i = 0;
            zM25676W = false;
        }
        if ((j & 3272) != 0) {
            taskCompletionType = tasks != null ? tasks.getTaskCompletionType() : null;
            if ((j & 3136) != 0) {
                z2 = taskCompletionType == "Failure";
                if ((j & 1051712) != 0) {
                    j = z2 ? j | MediaStatus.COMMAND_UNFOLLOW : j | MediaStatus.COMMAND_FOLLOW;
                }
            } else {
                z2 = false;
            }
            z = taskCompletionType == "Success";
            if ((j & 3080) != 0) {
                j = z ? j | 536870912 : j | 268435456;
            }
            if ((j & 3272) != 0) {
                j |= z ? 549755813888L : 274877906944L;
            }
            taskCompletionNote = ((j & MediaStatus.COMMAND_QUEUE_REPEAT) == 0 || tasks == null) ? null : tasks.getTaskCompletionNote();
            long j5 = j & 3200;
            if (j5 != 0) {
                String taskNextStep = tasks != null ? tasks.getTaskNextStep() : null;
                zIsEmpty = taskNextStep != null ? taskNextStep.isEmpty() : false;
                if (j5 != 0) {
                    j = zIsEmpty ? j | 524288 : j | MediaStatus.COMMAND_STREAM_TRANSFER;
                }
            } else {
                zIsEmpty = false;
            }
        } else {
            z = false;
            z2 = false;
            zIsEmpty = false;
            taskCompletionNote = null;
            taskCompletionType = null;
        }
        if ((j & 550292684800L) != 0) {
            zM25676W2 = ewi.m25676W(bool);
            z3 = (j & 536870912) != 0 ? !zM25676W2 : false;
        } else {
            zM25676W2 = false;
            z3 = false;
        }
        if ((j & 524288) != 0) {
            zM25676W = ewi.m25676W(bool3);
            if ((j & 2176) != 0) {
                j = zM25676W ? j | 8589934592L : j | 4294967296L;
            }
            z4 = !zM25676W;
        } else {
            z4 = false;
        }
        long j6 = j & 3200;
        if (j6 != 0) {
            if (!zIsEmpty) {
                z4 = false;
            }
            if (j6 != 0) {
                j |= z4 ? 137438953472L : 68719476736L;
            }
        } else {
            z4 = false;
        }
        long j7 = j & 3080;
        if (j7 != 0) {
            if (!z) {
                z3 = false;
            }
            if (j7 != 0) {
                j |= z3 ? 33554432L : Javac.GENERATED_MEMBER;
            }
            int i8 = z3 ? 0 : 8;
            z5 = zM25676W2;
            i2 = i8;
        } else {
            z5 = zM25676W2;
            i2 = 0;
        }
        if ((j & 3272) != 0) {
            if (!z) {
                z5 = false;
            }
            if ((j & 3080) != 0) {
                j |= z5 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 3272) != 0) {
                j |= z5 ? 2097152L : 1048576L;
            }
            i3 = ((j & 3080) == 0 || z5) ? 0 : 8;
        } else {
            i3 = 0;
            z5 = false;
        }
        if ((j & 68720525312L) != 0) {
            z2 = taskCompletionType == "Failure";
            if ((j & 1051712) != 0) {
                j = z2 ? j | MediaStatus.COMMAND_UNFOLLOW : j | MediaStatus.COMMAND_FOLLOW;
            }
        }
        long j8 = j & 3200;
        if (j8 == 0) {
            i4 = 0;
        } else {
            boolean z7 = z4 ? true : z2;
            if (j8 != 0) {
                j |= z7 ? 8388608L : 4194304L;
            }
            if (z7) {
                i4 = 8;
            }
        }
        boolean zM25676W3 = (j & MediaStatus.COMMAND_UNFOLLOW) != 0 ? ewi.m25676W(bool2) : false;
        if ((j & 1051712) != 0) {
            if (!z2) {
                zM25676W3 = false;
            }
            if ((j & 3136) != 0) {
                j |= zM25676W3 ? 34359738368L : 17179869184L;
            }
            i5 = ((j & 3136) == 0 || zM25676W3) ? 0 : 8;
        } else {
            zM25676W3 = false;
            i5 = 0;
        }
        long j9 = j & 3272;
        if (j9 != 0) {
            if (z5) {
                zM25676W3 = true;
            }
            if (j9 != 0) {
                j = zM25676W3 ? j | MediaStatus.COMMAND_DISLIKE : j | MediaStatus.COMMAND_LIKE;
            }
        } else {
            zM25676W3 = false;
        }
        if ((j & MediaStatus.COMMAND_LIKE) != 0) {
            zM25676W = ewi.m25676W(bool3);
            if ((j & 2176) != 0) {
                j = zM25676W ? j | 8589934592L : j | 4294967296L;
            }
        }
        long j10 = j & 3272;
        if (j10 != 0) {
            if (zM25676W3) {
                zM25676W = true;
            }
            if (j10 != 0) {
                if (zM25676W) {
                    j2 = j | 134217728;
                    j3 = 2199023255552L;
                } else {
                    j2 = j | 67108864;
                    j3 = 1099511627776L;
                }
                j = j2 | j3;
            }
            i6 = zM25676W ? 8 : 0;
        } else {
            i6 = 0;
            zM25676W = false;
        }
        if ((j & 67108864) == 0) {
            z6 = false;
        } else {
            if ((tasks != null ? tasks.getAssignmentOutcome() : null) == null) {
                z6 = true;
            }
        }
        long j11 = j & 3272;
        if (j11 != 0) {
            boolean z8 = zM25676W ? true : z6;
            if (j11 != 0) {
                j |= z8 ? 2147483648L : 1073741824L;
            }
            i7 = z8 ? 8 : 0;
        } else {
            i7 = 0;
        }
        if ((j & 2560) != 0) {
            this.v0.h0(ck6Var);
            this.w0.h0(ck6Var);
        }
        if ((2064 & j) != 0) {
            this.v0.i0(formFields);
        }
        if ((2080 & j) != 0) {
            this.v0.j0(num);
            this.w0.j0(num);
        }
        if ((2304 & j) != 0) {
            this.w0.i0(formFields2);
        }
        if ((j & 3272) != 0) {
            this.x0.setVisibility(i7);
            this.z0.setVisibility(i6);
            this.M0.setVisibility(i6);
            this.N0.setVisibility(i6);
            this.O0.setVisibility(i6);
        }
        if ((j & MediaStatus.COMMAND_QUEUE_REPEAT) != 0) {
            fjh.m26938c(this.D0, taskCompletionNote);
        }
        if ((2176 & j) != 0) {
            this.I0.setVisibility(i);
        }
        if ((j & 3200) != 0) {
            this.L0.setVisibility(i4);
        }
        if ((j & 3080) != 0) {
            this.P0.setVisibility(i2);
            this.R0.setVisibility(i3);
        }
        if ((j & 3136) != 0) {
            this.Q0.setVisibility(i5);
        }
        ewi.m25683r(this.v0);
        ewi.m25683r(this.w0);
    }

    @Override // p001o.lnf
    public void p0(Boolean bool) {
        this.V0 = bool;
        synchronized (this) {
            this.d1 |= 8;
        }
        m28509h(14);
        super.m25692R();
    }

    @Override // p001o.lnf
    public void q0(FormFields formFields) {
        this.X0 = formFields;
        synchronized (this) {
            this.d1 |= 16;
        }
        m28509h(19);
        super.m25692R();
    }

    @Override // p001o.lnf
    public void s0(FormFields formFields) {
        this.Y0 = formFields;
        synchronized (this) {
            this.d1 |= 256;
        }
        m28509h(20);
        super.m25692R();
    }

    @Override // p001o.lnf
    public void t0(Boolean bool) {
        this.T0 = bool;
    }

    @Override // p001o.lnf
    public void u0(Tasks tasks) {
        this.W0 = tasks;
        synchronized (this) {
            this.d1 |= MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.lnf
    public void v0(Boolean bool) {
        this.S0 = bool;
        synchronized (this) {
            this.d1 |= 128;
        }
        m28509h(99);
        super.m25692R();
    }

    public final boolean w0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.d1 |= 1;
        }
        return true;
    }

    public final boolean x0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.d1 |= 2;
        }
        return true;
    }

    public void y0(ck6 ck6Var) {
        this.a1 = ck6Var;
        synchronized (this) {
            this.d1 |= 512;
        }
        m28509h(33);
        super.m25692R();
    }

    public void z0(Integer num) {
        this.Z0 = num;
        synchronized (this) {
            this.d1 |= 32;
        }
        m28509h(73);
        super.m25692R();
    }

    public mnf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (Button) objArr[31], (Button) objArr[29], (Button) objArr[27], (Button) objArr[30], (Button) objArr[28], (MaterialButton) objArr[15], (MaterialButton) objArr[16], (MaterialButton) objArr[32], (r14) objArr[13], (r14) objArr[14], (MaterialButton) objArr[10], (View) objArr[22], (RecyclerView) objArr[11], (MaterialButton) objArr[26], (LinearLayout) objArr[23], (MaterialButton) objArr[24], (TextInputEditText) objArr[5], (TextInputLayout) objArr[21], (Button) objArr[19], (Button) objArr[18], (MaterialButtonToggleGroup) objArr[17], (RecyclerView) objArr[6], (MaterialButton) objArr[25], (Button) objArr[20], (MaterialButtonToggleGroup) objArr[12], (MaterialTextView) objArr[9], (MaterialTextView) objArr[8], (MaterialTextView) objArr[7], (MaterialTextView) objArr[2], (MaterialTextView) objArr[4], (MaterialTextView) objArr[3]);
        this.d1 = -1L;
        m25693Z(this.v0);
        m25693Z(this.w0);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.b1 = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.c1 = constraintLayout;
        constraintLayout.setTag(null);
        this.x0.setTag(null);
        this.z0.setTag(null);
        this.D0.setTag(null);
        this.I0.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.P0.setTag(null);
        this.Q0.setTag(null);
        this.R0.setTag(null);
        a0(view);
        mo16291G();
    }
}
