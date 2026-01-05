package p001o;

import ai.salesmax.model.FileData;
import ai.salesmax.model.FormFields;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import p001o.ewi;

/* loaded from: classes.dex */
public class c40 extends b40 {
    public static final ewi.C13274i X0;
    public static final SparseIntArray Y0;
    public final ConstraintLayout V0;
    public long W0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(31);
        X0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_custom_form"}, new int[]{14}, new int[]{p9e.content_custom_form});
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 15);
        sparseIntArray.put(z8e.buttonDone, 16);
        sparseIntArray.put(z8e.tvLifecycleMessage, 17);
        sparseIntArray.put(z8e.layout, 18);
        sparseIntArray.put(z8e.mAutoComplete, 19);
        sparseIntArray.put(z8e.mClose, 20);
        sparseIntArray.put(z8e.rvNextStepTaskType, 21);
        sparseIntArray.put(z8e.toggleGroupDueDateSelection, 22);
        sparseIntArray.put(z8e.btnLaterToday, 23);
        sparseIntArray.put(z8e.btnTomorrow, 24);
        sparseIntArray.put(z8e.btnLaterThisWeek, 25);
        sparseIntArray.put(z8e.btnNextWeek, 26);
        sparseIntArray.put(z8e.btnCustomDate, 27);
        sparseIntArray.put(z8e.taskBasicHeadLineLayout, 28);
        sparseIntArray.put(z8e.taskBasicDescriptionLayout, 29);
        sparseIntArray.put(z8e.chipPriorityGroup, 30);
    }

    public c40(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 31, X0, Y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.W0 != 0) {
                return true;
            }
            return this.w0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.W0 = 32L;
        }
        this.w0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m0((r14) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (19 == i) {
            k0((FormFields) obj);
        } else if (73 == i) {
            p0((Integer) obj);
        } else if (33 == i) {
            n0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            l0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.b40
    public void k0(FormFields formFields) {
        this.U0 = formFields;
        synchronized (this) {
            this.W0 |= 2;
        }
        m28509h(19);
        super.m25692R();
    }

    @Override // p001o.b40
    public void l0(Tasks tasks) {
        this.R0 = tasks;
        synchronized (this) {
            this.W0 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public final boolean m0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.W0 |= 1;
        }
        return true;
    }

    public void n0(ck6 ck6Var) {
        this.T0 = ck6Var;
        synchronized (this) {
            this.W0 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long j2;
        long j3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j4;
        long taskReminderTimeInMillis;
        String str8;
        String taskTitle;
        String taskContent;
        String taskAssignedToProfilePic;
        String taskTag;
        String taskLocation;
        ArrayList<FileData> fileList;
        String taskContactMode;
        long j5;
        boolean zIsEmpty;
        long j6;
        boolean zIsEmpty2;
        synchronized (this) {
            j = this.W0;
            this.W0 = 0L;
        }
        FormFields formFields = this.U0;
        Integer num = this.S0;
        ck6 ck6Var = this.T0;
        Tasks tasks = this.R0;
        long j7 = j & 48;
        String taskPriority = null;
        if (j7 != 0) {
            if (tasks != null) {
                taskPriority = tasks.getTaskPriority();
                long taskTimeInMillis = tasks.getTaskTimeInMillis();
                String taskAssignedTo = tasks.getTaskAssignedTo();
                taskReminderTimeInMillis = tasks.getTaskReminderTimeInMillis();
                taskTitle = tasks.getTaskTitle();
                taskContent = tasks.getTaskContent();
                taskAssignedToProfilePic = tasks.getTaskAssignedToProfilePic();
                taskTag = tasks.getTaskTag();
                taskLocation = tasks.getTaskLocation();
                fileList = tasks.getFileList();
                taskContactMode = tasks.getTaskContactMode();
                str8 = taskAssignedTo;
                j4 = taskTimeInMillis;
            } else {
                j4 = 0;
                taskReminderTimeInMillis = 0;
                str8 = null;
                taskTitle = null;
                taskContent = null;
                taskAssignedToProfilePic = null;
                taskTag = null;
                taskLocation = null;
                fileList = null;
                taskContactMode = null;
            }
            boolean zIsEmpty3 = taskPriority != null ? taskPriority.isEmpty() : false;
            if (j7 != 0) {
                j |= zIsEmpty3 ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            boolean z = j4 > 0;
            String str9 = "Tasker : " + str8;
            boolean z2 = taskReminderTimeInMillis > 0;
            if ((j & 48) != 0) {
                j |= z ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 48) != 0) {
                j |= z2 ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            boolean zIsEmpty4 = str8 != null ? str8.isEmpty() : false;
            if ((j & 48) != 0) {
                j |= zIsEmpty4 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            boolean zIsEmpty5 = taskTag != null ? taskTag.isEmpty() : false;
            if ((j & 48) != 0) {
                j |= zIsEmpty5 ? 2097152L : 1048576L;
            }
            if (taskLocation != null) {
                zIsEmpty = taskLocation.isEmpty();
                j5 = 48;
            } else {
                j5 = 48;
                zIsEmpty = false;
            }
            if ((j & j5) != 0) {
                j |= zIsEmpty ? 128L : 64L;
            }
            int size = fileList != null ? fileList.size() : 0;
            if (taskContactMode != null) {
                zIsEmpty2 = taskContactMode.isEmpty();
                j6 = 48;
            } else {
                j6 = 48;
                zIsEmpty2 = false;
            }
            if ((j & j6) != 0) {
                j |= zIsEmpty2 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            int i9 = zIsEmpty3 ? 8 : 0;
            int i10 = z ? 0 : 8;
            int i11 = z2 ? 0 : 8;
            int i12 = zIsEmpty4 ? 8 : 0;
            int i13 = zIsEmpty5 ? 8 : 0;
            int i14 = zIsEmpty ? 8 : 0;
            boolean z3 = size > 0;
            int i15 = zIsEmpty2 ? 8 : 0;
            if ((j & 48) != 0) {
                j |= z3 ? 512L : 256L;
            }
            i6 = i11;
            i8 = i10;
            i = i12;
            i7 = i13;
            str3 = taskTitle;
            str2 = taskContent;
            str7 = taskTag;
            str5 = taskLocation;
            i2 = i15;
            str4 = taskContactMode;
            i5 = i9;
            i4 = i14;
            i3 = z3 ? 0 : 8;
            j3 = taskReminderTimeInMillis;
            j2 = j4;
            str6 = taskPriority;
            taskPriority = str9;
            str = taskAssignedToProfilePic;
        } else {
            j2 = 0;
            j3 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if ((j & 34) != 0) {
            this.w0.i0(formFields);
        }
        if ((40 & j) != 0) {
            this.w0.h0(ck6Var);
        }
        if ((36 & j) != 0) {
            this.w0.j0(num);
        }
        if ((j & 48) != 0) {
            nr1.f1(this.B0, taskPriority);
            this.B0.setVisibility(i);
            nr1.J2(this.C0, str);
            fjh.m26938c(this.D0, str2);
            fjh.m26938c(this.F0, str3);
            nr1.Z2(this.H0, str4);
            this.H0.setVisibility(i2);
            nr1.f2(this.I0, tasks);
            this.J0.setVisibility(i3);
            this.K0.setVisibility(i4);
            fjh.m26938c(this.K0, str5);
            this.L0.setVisibility(i5);
            fjh.m26938c(this.L0, str6);
            this.M0.setVisibility(i6);
            nr1.B1(this.M0, Long.valueOf(j3));
            this.N0.setVisibility(i7);
            fjh.m26938c(this.N0, str7);
            this.O0.setVisibility(i8);
            nr1.D2(this.O0, Long.valueOf(j2));
        }
        ewi.m25683r(this.w0);
    }

    public void p0(Integer num) {
        this.S0 = num;
        synchronized (this) {
            this.W0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    public c40(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (ConstraintLayout) objArr[1], (Button) objArr[27], (Button) objArr[25], (Button) objArr[23], (Button) objArr[26], (Button) objArr[24], (MaterialButton) objArr[15], (MaterialButton) objArr[16], (ChipGroup) objArr[30], (r14) objArr[14], (TextInputLayout) objArr[18], (AppCompatAutoCompleteTextView) objArr[19], (AppCompatImageView) objArr[20], (RecyclerView) objArr[21], (MaterialTextView) objArr[5], (ShapeableImageView) objArr[4], (TextInputEditText) objArr[3], (TextInputLayout) objArr[29], (TextInputEditText) objArr[2], (TextInputLayout) objArr[28], (ShapeableImageView) objArr[6], (Chip) objArr[9], (RecyclerView) objArr[13], (Chip) objArr[12], (Chip) objArr[7], (Chip) objArr[11], (Chip) objArr[8], (Chip) objArr[10], (MaterialButtonToggleGroup) objArr[22], (MaterialTextView) objArr[17]);
        this.W0 = -1L;
        this.n0.setTag(null);
        m25693Z(this.w0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.V0 = constraintLayout;
        constraintLayout.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.F0.setTag(null);
        this.H0.setTag(null);
        this.I0.setTag(null);
        this.J0.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        a0(view);
        mo16291G();
    }
}
