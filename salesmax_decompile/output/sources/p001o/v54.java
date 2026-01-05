package p001o;

import ai.salesmax.model.FileData;
import ai.salesmax.model.FormFields;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import lombok.javac.Javac;
import p001o.ewi;

/* loaded from: classes.dex */
public class v54 extends u54 {
    public static final ewi.C13274i o1;
    public static final SparseIntArray p1;
    public final FrameLayout l1;
    public final ConstraintLayout m1;
    public long n1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(44);
        o1 = c13274i;
        c13274i.m25699a(2, new String[]{"content_custom_form"}, new int[]{15}, new int[]{p9e.content_custom_form});
        SparseIntArray sparseIntArray = new SparseIntArray();
        p1 = sparseIntArray;
        sparseIntArray.put(z8e.contentVisitDataParent, 16);
        sparseIntArray.put(z8e.leadDetailsClose, 17);
        sparseIntArray.put(z8e.editContact, 18);
        sparseIntArray.put(z8e.leadDetailsButtonGroup, 19);
        sparseIntArray.put(z8e.leadDetailsBorder1, 20);
        sparseIntArray.put(z8e.layout, 21);
        sparseIntArray.put(z8e.mAutoComplete, 22);
        sparseIntArray.put(z8e.mClose, 23);
        sparseIntArray.put(z8e.tvVisitOutComeTitle, 24);
        sparseIntArray.put(z8e.tvVisitOutcomeAddMap, 25);
        sparseIntArray.put(z8e.tvVisitOutcomeDateEdit, 26);
        sparseIntArray.put(z8e.rvVisitOutcome, 27);
        sparseIntArray.put(z8e.btnLaterToday, 28);
        sparseIntArray.put(z8e.btnTomorrow, 29);
        sparseIntArray.put(z8e.btnLaterThisWeek, 30);
        sparseIntArray.put(z8e.btnNextWeek, 31);
        sparseIntArray.put(z8e.btnCustomDate, 32);
        sparseIntArray.put(z8e.notesBorder1, 33);
        sparseIntArray.put(z8e.tvVisitActionButtons, 34);
        sparseIntArray.put(z8e.taskAttachment, 35);
        sparseIntArray.put(z8e.taskPicture, 36);
        sparseIntArray.put(z8e.scanDoc, 37);
        sparseIntArray.put(z8e.tvVisitOutComeNote, 38);
        sparseIntArray.put(z8e.tvNoteAddSpeech, 39);
        sparseIntArray.put(z8e.tiLayoutNotes, 40);
        sparseIntArray.put(z8e.visitOutcome_ActionButton, 41);
        sparseIntArray.put(z8e.visitOutcome_BottomView, 42);
        sparseIntArray.put(z8e.snooze, 43);
    }

    public v54(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 44, o1, p1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.n1 != 0) {
                return true;
            }
            return this.t0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.n1 = 512L;
        }
        this.t0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return v0((r14) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (17 == i) {
            n0(((Boolean) obj).booleanValue());
        } else if (19 == i) {
            p0((FormFields) obj);
        } else if (21 == i) {
            q0(((Boolean) obj).booleanValue());
        } else if (73 == i) {
            x0((Integer) obj);
        } else if (33 == i) {
            w0((ck6) obj);
        } else if (55 == i) {
            t0(((Boolean) obj).booleanValue());
        } else if (52 == i) {
            s0(((Boolean) obj).booleanValue());
        } else {
            if (67 != i) {
                return false;
            }
            u0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.u54
    public void n0(boolean z) {
        this.g1 = z;
        synchronized (this) {
            this.n1 |= 2;
        }
        m28509h(17);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5 A[PHI: r2
      0x00a5: PHI (r2v1 long) = (r2v0 long), (r2v33 long), (r2v33 long) binds: [B:7:0x0035, B:43:0x00a1, B:44:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        long callStartTime;
        int i2;
        String str;
        String str2;
        String str3;
        boolean z;
        boolean zIsEmpty;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        String clientName;
        String visitNotes;
        String taskLocation;
        ArrayList<FileData> fileList;
        synchronized (this) {
            j = this.n1;
            this.n1 = 0L;
        }
        boolean z3 = this.g1;
        FormFields formFields = this.e1;
        boolean z4 = this.h1;
        Integer num = this.j1;
        ck6 ck6Var = this.k1;
        boolean z5 = this.i1;
        Tasks tasks = this.d1;
        if ((j & 842) == 0) {
            i = 0;
        } else {
            if ((j & 778) != 0) {
                j |= z3 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 578) != 0) {
                j |= z3 ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            if ((j & 522) != 0) {
                j = z3 ? j | 524288 : j | MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            if ((j & 514) != 0) {
                j |= z3 ? 2097152L : 1048576L;
            }
            if ((j & 842) != 0) {
                j = z3 ? j | 8589934592L : j | 4294967296L;
            }
            if ((j & 1073741824) != 0) {
                j |= z3 ? 137438953472L : 68719476736L;
            }
            if ((j & 514) != 0 && !z3) {
                i = 8;
            }
        }
        long j2 = j & 768;
        if (j2 != 0) {
            if (tasks != null) {
                callStartTime = tasks.getCallStartTime();
                clientName = tasks.getClientName();
                visitNotes = tasks.getVisitNotes();
                taskLocation = tasks.getTaskLocation();
                fileList = tasks.getFileList();
            } else {
                callStartTime = 0;
                clientName = null;
                visitNotes = null;
                taskLocation = null;
                fileList = null;
            }
            boolean z6 = (fileList != null ? fileList.size() : 0) > 0;
            if (j2 != 0) {
                j |= z6 ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            i2 = z6 ? 0 : 8;
            str = clientName;
            str2 = visitNotes;
            str3 = taskLocation;
        } else {
            callStartTime = 0;
            i2 = 0;
            str = null;
            str2 = null;
            str3 = null;
        }
        boolean z7 = ((j & 137439477760L) == 0 || (j & 524288) == 0) ? false : !z4;
        if ((j & 8589936640L) != 0) {
            String visitNextStep = tasks != null ? tasks.getVisitNextStep() : null;
            zIsEmpty = visitNextStep != null ? visitNextStep.isEmpty() : false;
            z = (8589934592L & j) != 0 ? !zIsEmpty : false;
        } else {
            z = false;
            zIsEmpty = false;
        }
        long j3 = j & 778;
        if (j3 != 0) {
            if (!z3) {
                zIsEmpty = false;
            }
            if (j3 != 0) {
                j = zIsEmpty ? j | 33554432 : j | Javac.GENERATED_MEMBER;
            }
        } else {
            zIsEmpty = false;
        }
        long j4 = j & 578;
        if (j4 != 0) {
            boolean z8 = z3 ? true : z5;
            if (j4 != 0) {
                j |= z8 ? 134217728L : 67108864L;
            }
            i3 = z8 ? 0 : 8;
        } else {
            i3 = 0;
        }
        long j5 = j & 522;
        if (j5 != 0) {
            boolean z9 = z3 ? z7 : false;
            if (j5 != 0) {
                j |= z9 ? 34359738368L : 17179869184L;
            }
            z2 = z5;
            i4 = z9 ? 0 : 8;
        } else {
            z2 = z5;
            i4 = 0;
        }
        long j6 = j & 842;
        if (j6 != 0) {
            if (!z3) {
                z = false;
            }
            if (j6 != 0) {
                j = z ? j | 2147483648L : j | 1073741824;
            }
        } else {
            z = false;
        }
        if ((j & 33554432) != 0) {
            z7 = !z4;
        }
        long j7 = j & 778;
        if (j7 != 0) {
            if (!zIsEmpty) {
                z7 = false;
            }
            if (j7 != 0) {
                j |= z7 ? 536870912L : 268435456L;
            }
            i5 = z7 ? 0 : 8;
        } else {
            i5 = 0;
        }
        if ((j & 1073741824) == 0 || !z3) {
            z4 = false;
        }
        long j8 = j & 842;
        if (j8 != 0) {
            if (z) {
                z4 = true;
            }
            if (j8 != 0) {
                j |= z4 ? 8388608L : 4194304L;
            }
        } else {
            z4 = false;
        }
        long j9 = j & 842;
        if (j9 != 0) {
            if (z4) {
                z2 = true;
            }
            if (j9 != 0) {
                j |= z2 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            i6 = z2 ? 0 : 8;
        } else {
            i6 = 0;
        }
        if ((544 & j) != 0) {
            this.t0.h0(ck6Var);
        }
        if ((516 & j) != 0) {
            this.t0.i0(formFields);
        }
        if ((528 & j) != 0) {
            this.t0.j0(num);
        }
        if ((j & 768) != 0) {
            nr1.f1(this.z0, str);
            nr1.b1(this.A0, tasks);
            nr1.z0(this.B0, tasks);
            fjh.m26938c(this.L0, str2);
            this.S0.setVisibility(i2);
            fjh.m26938c(this.T0, str3);
            nr1.s2(this.Y0, Long.valueOf(callStartTime));
            nr1.m40930A(this.a1, tasks);
        }
        if ((j & 522) != 0) {
            this.F0.setVisibility(i4);
        }
        if ((j & 842) != 0) {
            this.N0.setVisibility(i6);
        }
        if ((j & 778) != 0) {
            this.O0.setVisibility(i5);
        }
        if ((j & 514) != 0) {
            this.Q0.setVisibility(i);
        }
        if ((j & 578) != 0) {
            this.U0.setVisibility(i3);
        }
        ewi.m25683r(this.t0);
    }

    @Override // p001o.u54
    public void p0(FormFields formFields) {
        this.e1 = formFields;
        synchronized (this) {
            this.n1 |= 4;
        }
        m28509h(19);
        super.m25692R();
    }

    @Override // p001o.u54
    public void q0(boolean z) {
        this.h1 = z;
        synchronized (this) {
            this.n1 |= 8;
        }
        m28509h(21);
        super.m25692R();
    }

    @Override // p001o.u54
    public void s0(boolean z) {
        this.f1 = z;
    }

    @Override // p001o.u54
    public void t0(boolean z) {
        this.i1 = z;
        synchronized (this) {
            this.n1 |= 64;
        }
        m28509h(55);
        super.m25692R();
    }

    @Override // p001o.u54
    public void u0(Tasks tasks) {
        this.d1 = tasks;
        synchronized (this) {
            this.n1 |= 256;
        }
        m28509h(67);
        super.m25692R();
    }

    public final boolean v0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.n1 |= 1;
        }
        return true;
    }

    public void w0(ck6 ck6Var) {
        this.k1 = ck6Var;
        synchronized (this) {
            this.n1 |= 32;
        }
        m28509h(33);
        super.m25692R();
    }

    public void x0(Integer num) {
        this.j1 = num;
        synchronized (this) {
            this.n1 |= 16;
        }
        m28509h(73);
        super.m25692R();
    }

    public v54(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (Button) objArr[32], (Button) objArr[30], (Button) objArr[28], (Button) objArr[31], (Button) objArr[29], (MaterialCardView) objArr[16], (r14) objArr[15], (ShapeableImageView) objArr[18], (TextInputLayout) objArr[21], (View) objArr[20], (LinearLayout) objArr[19], (ShapeableImageView) objArr[17], (MaterialTextView) objArr[3], (MaterialTextView) objArr[4], (ShapeableImageView) objArr[1], (AppCompatAutoCompleteTextView) objArr[22], (AppCompatImageView) objArr[23], (View) objArr[33], (RecyclerView) objArr[11], (RecyclerView) objArr[27], (MaterialButton) objArr[37], (ShapeableImageView) objArr[43], (MaterialButton) objArr[35], (MaterialButton) objArr[36], (TextInputEditText) objArr[14], (TextInputLayout) objArr[40], (MaterialButtonToggleGroup) objArr[12], (MaterialTextView) objArr[10], (MaterialButton) objArr[39], (MaterialTextView) objArr[8], (LinearLayout) objArr[34], (RecyclerView) objArr[13], (MaterialTextView) objArr[6], (MaterialTextView) objArr[9], (MaterialTextView) objArr[38], (MaterialTextView) objArr[24], (MaterialButton) objArr[25], (MaterialTextView) objArr[5], (MaterialButton) objArr[26], (MaterialTextView) objArr[7], (MaterialButton) objArr[41], (View) objArr[42]);
        this.n1 = -1L;
        m25693Z(this.t0);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.l1 = frameLayout;
        frameLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[2];
        this.m1 = constraintLayout;
        constraintLayout.setTag(null);
        this.F0.setTag(null);
        this.L0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.Q0.setTag(null);
        this.S0.setTag(null);
        this.T0.setTag(null);
        this.U0.setTag(null);
        this.Y0.setTag(null);
        this.a1.setTag(null);
        a0(view);
        mo16291G();
    }
}
