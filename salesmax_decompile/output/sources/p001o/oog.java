package p001o;

import ai.salesmax.custom.CustomFormDataObservable;
import ai.salesmax.model.EngagementUpdateSummary;
import ai.salesmax.model.FileData;
import ai.salesmax.model.RecentAction;
import ai.salesmax.model.Tasks;
import ai.salesmax.view.MentionAutoCompleteTextView;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import lombok.javac.Javac;
import p001o.ewi;

/* loaded from: classes.dex */
public class oog extends nog {
    public static final ewi.C13274i y1;
    public static final SparseIntArray z1;
    public final ConstraintLayout t1;
    public final ConstraintLayout u1;
    public final LinearLayout v1;
    public final f54 w1;
    public long x1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(59);
        y1 = c13274i;
        c13274i.m25699a(1, new String[]{"content_recent_actions"}, new int[]{29}, new int[]{p9e.content_recent_actions});
        c13274i.m25699a(4, new String[]{"content_shimmer_tak_detail"}, new int[]{27}, new int[]{p9e.content_shimmer_tak_detail});
        c13274i.m25699a(14, new String[]{"content_custom_form_value"}, new int[]{28}, new int[]{p9e.content_custom_form_value});
        SparseIntArray sparseIntArray = new SparseIntArray();
        z1 = sparseIntArray;
        sparseIntArray.put(z8e.taskDetailTitle, 30);
        sparseIntArray.put(z8e.buttonClose, 31);
        sparseIntArray.put(z8e.shimmerLayout, 32);
        sparseIntArray.put(z8e.taskLeadBlock, 33);
        sparseIntArray.put(z8e.taskAddNextStep, 34);
        sparseIntArray.put(z8e.taskReopen, 35);
        sparseIntArray.put(z8e.taskCreatedAtText, 36);
        sparseIntArray.put(z8e.leadDetailsButtonGroup, 37);
        sparseIntArray.put(z8e.taskDelete, 38);
        sparseIntArray.put(z8e.taskEdit2, 39);
        sparseIntArray.put(z8e.taskUpdate, 40);
        sparseIntArray.put(z8e.taskComplete2, 41);
        sparseIntArray.put(z8e.mapFragmentLayout, 42);
        sparseIntArray.put(z8e.chipPriorityGroup, 43);
        sparseIntArray.put(z8e.taskTimer, 44);
        sparseIntArray.put(z8e.relatedEngagementsTitle, 45);
        sparseIntArray.put(z8e.taskCommentsTitle, 46);
        sparseIntArray.put(z8e.taskCommentsList, 47);
        sparseIntArray.put(z8e.taskDetailsBorderBottom, 48);
        sparseIntArray.put(z8e.taskCommentTextInputLayout, 49);
        sparseIntArray.put(z8e.taskCommentEditText, 50);
        sparseIntArray.put(z8e.sheet, 51);
        sparseIntArray.put(z8e.leadConversation, 52);
        sparseIntArray.put(z8e.leadTaskWhatsapp, 53);
        sparseIntArray.put(z8e.share, 54);
        sparseIntArray.put(z8e.email, 55);
        sparseIntArray.put(z8e.send, 56);
        sparseIntArray.put(z8e.cloudCall, 57);
        sparseIntArray.put(z8e.call, 58);
    }

    public oog(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 59, y1, z1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.x1 != 0) {
                return true;
            }
            return this.w1.mo16290E() || this.r0.mo16290E() || this.B0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.x1 = 64L;
        }
        this.w1.mo16291G();
        this.r0.mo16291G();
        this.B0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return n0((p44) obj, i2);
        }
        if (i == 1) {
            return l0((t14) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return m0((CustomFormDataObservable) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            p0((ck6) obj);
        } else if (73 == i) {
            q0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.nog
    public void k0(Tasks tasks) {
        this.q1 = tasks;
        synchronized (this) {
            this.x1 |= 32;
        }
        m28509h(67);
        super.m25692R();
    }

    public final boolean l0(t14 t14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.x1 |= 2;
        }
        return true;
    }

    public final boolean m0(CustomFormDataObservable customFormDataObservable, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.x1 |= 4;
        }
        return true;
    }

    public final boolean n0(p44 p44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.x1 |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04d7  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        ck6 ck6Var;
        Integer num;
        long j2;
        Drawable drawableM37353b;
        List<RecentAction> list;
        String str;
        Long l;
        CustomFormDataObservable customTaskCompletionDataObservable;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        int iM25688z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        int i12;
        long taskReminderTimeInMillis;
        Long l2;
        int i13;
        boolean z2;
        boolean zIsEmpty;
        long j3;
        int i14;
        int i15;
        String str9;
        String taskStatus;
        String taskPriority;
        String taskAssignedTo;
        String taskTitle;
        String taskContent;
        String taskCompletionNote;
        String taskTag;
        List<RecentAction> taskEngagementActions;
        String clientName;
        Long createdAt;
        String taskLocation;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        long j4;
        String str10;
        String customTaskCompletionData;
        String taskCompletionType;
        ArrayList<FileData> fileList;
        List<EngagementUpdateSummary> engagementUpdates;
        ryh activityLocation;
        long j5;
        long j6;
        synchronized (this) {
            j = this.x1;
            this.x1 = 0L;
        }
        ck6 ck6Var2 = this.s1;
        Integer num2 = this.r1;
        Tasks tasks = this.q1;
        if ((j & 100) != 0) {
            long j7 = j & 96;
            if (j7 != 0) {
                if (tasks != null) {
                    taskPriority = tasks.getTaskPriority();
                    customTaskCompletionData = tasks.getCustomTaskCompletionData();
                    taskAssignedTo = tasks.getTaskAssignedTo();
                    taskReminderTimeInMillis = tasks.getTaskReminderTimeInMillis();
                    taskTitle = tasks.getTaskTitle();
                    taskContent = tasks.getTaskContent();
                    taskCompletionNote = tasks.getTaskCompletionNote();
                    taskCompletionType = tasks.getTaskCompletionType();
                    taskTag = tasks.getTaskTag();
                    taskEngagementActions = tasks.getTaskEngagementActions();
                    fileList = tasks.getFileList();
                    engagementUpdates = tasks.getEngagementUpdates();
                    activityLocation = tasks.getActivityLocation();
                    String clientID = tasks.getClientID();
                    clientName = tasks.getClientName();
                    createdAt = tasks.getCreatedAt();
                    taskLocation = tasks.getTaskLocation();
                    str10 = clientID;
                } else {
                    taskReminderTimeInMillis = 0;
                    str10 = null;
                    taskPriority = null;
                    customTaskCompletionData = null;
                    taskAssignedTo = null;
                    taskTitle = null;
                    taskContent = null;
                    taskCompletionNote = null;
                    taskCompletionType = null;
                    taskTag = null;
                    taskEngagementActions = null;
                    fileList = null;
                    engagementUpdates = null;
                    activityLocation = null;
                    clientName = null;
                    createdAt = null;
                    taskLocation = null;
                }
                z = tasks == null;
                if (j7 != 0) {
                    j = z ? j | 1073741824 | 274877906944L | 4398046511104L : j | 536870912 | 137438953472L | 2199023255552L;
                }
                boolean zIsEmpty2 = taskPriority != null ? taskPriority.isEmpty() : false;
                if ((j & 96) != 0) {
                    j |= zIsEmpty2 ? 4294967296L : 2147483648L;
                }
                boolean z3 = customTaskCompletionData == null;
                boolean z4 = taskReminderTimeInMillis > 0;
                boolean z5 = activityLocation == null;
                boolean z6 = str10 == "";
                i17 = z ? 4 : 0;
                if ((j & 96) != 0) {
                    j |= z3 ? 1099511627776L : 549755813888L;
                }
                if ((j & 96) != 0) {
                    j |= z4 ? 268435456L : 134217728L;
                }
                if ((j & 96) != 0) {
                    j |= z5 ? 256L : 128L;
                }
                if ((j & 96) != 0) {
                    j |= z6 ? 4194304L : 2097152L;
                }
                boolean zIsEmpty3 = taskContent != null ? taskContent.isEmpty() : false;
                if ((j & 96) != 0) {
                    j |= zIsEmpty3 ? 68719476736L : 34359738368L;
                }
                boolean zIsEmpty4 = taskCompletionNote != null ? taskCompletionNote.isEmpty() : false;
                if ((j & 96) != 0) {
                    j |= zIsEmpty4 ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
                }
                String lowerCase = taskCompletionType != null ? taskCompletionType.toLowerCase() : null;
                boolean zIsEmpty5 = taskTag != null ? taskTag.isEmpty() : false;
                if ((j & 96) != 0) {
                    j |= zIsEmpty5 ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
                }
                int size = fileList != null ? fileList.size() : 0;
                int size2 = engagementUpdates != null ? engagementUpdates.size() : 0;
                boolean zIsEmpty6 = taskLocation != null ? taskLocation.isEmpty() : false;
                if ((j & 96) != 0) {
                    j |= zIsEmpty6 ? Javac.GENERATED_MEMBER : 8388608L;
                }
                i18 = zIsEmpty2 ? 8 : 0;
                i22 = z3 ? 8 : 0;
                i25 = z4 ? 0 : 8;
                i24 = z5 ? 8 : 0;
                i16 = z6 ? 0 : 8;
                i3 = zIsEmpty3 ? 8 : 0;
                i26 = zIsEmpty4 ? 8 : 0;
                i19 = zIsEmpty5 ? 8 : 0;
                boolean z7 = size > 0;
                boolean z8 = size2 > 0;
                i23 = zIsEmpty6 ? 8 : 0;
                if ((j & 96) != 0) {
                    j |= z7 ? 67108864L : 33554432L;
                }
                if ((j & 96) != 0) {
                    j |= z8 ? 1048576L : 524288L;
                }
                boolean zEquals = lowerCase != null ? lowerCase.equals(FirebaseAnalytics.Param.SUCCESS) : false;
                if ((j & 96) != 0) {
                    if (zEquals) {
                        j5 = j | MediaStatus.COMMAND_LIKE;
                        j6 = 17179869184L;
                    } else {
                        j5 = j | MediaStatus.COMMAND_PLAYBACK_RATE;
                        j6 = 8589934592L;
                    }
                    j = j5 | j6;
                }
                i20 = z7 ? 0 : 8;
                i21 = z8 ? 0 : 8;
                drawableM37353b = lk0.m37353b(this.O0.getContext(), zEquals ? w7e.ic_thumb_up : w7e.ic_thumb_down);
                iM25688z = ewi.m25688z(this.O0, zEquals ? u6e.superfone_green : u6e.superfone_red);
            } else {
                drawableM37353b = null;
                taskPriority = null;
                taskAssignedTo = null;
                taskTitle = null;
                taskContent = null;
                taskCompletionNote = null;
                taskTag = null;
                taskEngagementActions = null;
                clientName = null;
                createdAt = null;
                taskLocation = null;
                iM25688z = 0;
                i16 = 0;
                i17 = 0;
                i18 = 0;
                i3 = 0;
                i19 = 0;
                i20 = 0;
                i21 = 0;
                i22 = 0;
                i23 = 0;
                i24 = 0;
                z = false;
                i25 = 0;
                i26 = 0;
                taskReminderTimeInMillis = 0;
            }
            if (tasks != null) {
                customTaskCompletionDataObservable = tasks.getCustomTaskCompletionDataObservable();
                j4 = j;
            } else {
                j4 = j;
                customTaskCompletionDataObservable = null;
            }
            g0(2, customTaskCompletionDataObservable);
            str4 = taskPriority;
            str6 = taskTitle;
            i10 = i23;
            str7 = clientName;
            str8 = taskLocation;
            i12 = i25;
            j = j4;
            num = num2;
            i11 = i20;
            i6 = i21;
            str3 = taskContent;
            list = taskEngagementActions;
            i4 = i26;
            i7 = i19;
            str5 = taskAssignedTo;
            str2 = taskCompletionNote;
            i5 = i16;
            i8 = i17;
            str = taskTag;
            i2 = i24;
            i9 = i18;
            l = createdAt;
            j2 = 2199023255552L;
            int i27 = i22;
            ck6Var = ck6Var2;
            i = i27;
        } else {
            ck6Var = ck6Var2;
            num = num2;
            j2 = 2199023255552L;
            drawableM37353b = null;
            list = null;
            str = null;
            l = null;
            customTaskCompletionDataObservable = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            i = 0;
            iM25688z = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            z = false;
            i12 = 0;
            taskReminderTimeInMillis = 0;
        }
        if ((j & j2) != 0) {
            if (tasks != null) {
                i13 = i3;
                l2 = l;
                taskStatus = tasks.getTaskStatus();
            } else {
                l2 = l;
                i13 = i3;
                taskStatus = null;
            }
            if (taskStatus == "COMPLETED") {
                z2 = true;
            }
            if ((j & 536870912) == 0) {
                zIsEmpty = false;
            } else {
                String id = tasks != null ? tasks.getId() : null;
                if (id != null) {
                    zIsEmpty = id.isEmpty();
                }
            }
            j3 = j & 96;
            if (j3 == 0) {
                if (z) {
                    zIsEmpty = true;
                }
                boolean z9 = z ? true : z2;
                if (j3 != 0) {
                    j |= zIsEmpty ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
                }
                if ((j & 96) != 0) {
                    j |= z9 ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
                }
                i15 = zIsEmpty ? 4 : 0;
                i14 = z9 ? 8 : 0;
            } else {
                i14 = 0;
                i15 = 0;
            }
            if ((j & 100) == 0) {
                str9 = str3;
                this.r0.i0(customTaskCompletionDataObservable);
            } else {
                str9 = str3;
            }
            if ((j & 96) != 0) {
                this.r0.m25689B().setVisibility(i);
                this.t0.setVisibility(i2);
                this.u0.setVisibility(i15);
                nr1.z0(this.v0, tasks);
                fjh.m26938c(this.z0, str);
                this.B0.i0(list);
                this.M0.setVisibility(i14);
                fjh.m26938c(this.O0, str2);
                this.O0.setVisibility(i4);
                this.O0.setIcon(drawableM37353b);
                this.O0.setIconTint(b74.m18212a(iM25688z));
                fjh.m26938c(this.P0, str9);
                this.P0.setVisibility(i13);
                nr1.h0(this.Q0, l2);
                nr1.f2(this.S0, tasks);
                this.W0.setVisibility(i4);
                this.Y0.setVisibility(i14);
                this.a1.setVisibility(i11);
                this.c1.setVisibility(i10);
                fjh.m26938c(this.c1, str8);
                nr1.m40947R(this.d1, tasks);
                nr1.g1(this.d1, str5);
                this.e1.setVisibility(i9);
                fjh.m26938c(this.e1, str4);
                this.f1.setVisibility(i12);
                nr1.B1(this.f1, Long.valueOf(taskReminderTimeInMillis));
                nr1.K1(this.h1, tasks);
                this.h1.setVisibility(i8);
                this.i1.setVisibility(i7);
                fjh.m26938c(this.i1, str);
                int i28 = i6;
                this.l1.setVisibility(i28);
                this.m1.setVisibility(i28);
                nr1.f1(this.n1, str6);
                this.n1.setVisibility(i5);
                nr1.f1(this.o1, str7);
                nr1.b1(this.p1, tasks);
            }
            if ((72 & j) != 0) {
                ck6 ck6Var3 = ck6Var;
                this.r0.h0(ck6Var3);
                this.B0.h0(ck6Var3);
            }
            if ((j & 80) != 0) {
                Integer num3 = num;
                this.r0.j0(num3);
                this.B0.j0(num3);
            }
            ewi.m25683r(this.w1);
            ewi.m25683r(this.r0);
            ewi.m25683r(this.B0);
        }
        l2 = l;
        i13 = i3;
        z2 = false;
        if ((j & 536870912) == 0) {
        }
        j3 = j & 96;
        if (j3 == 0) {
        }
        if ((j & 100) == 0) {
        }
        if ((j & 96) != 0) {
        }
        if ((72 & j) != 0) {
        }
        if ((j & 80) != 0) {
        }
        ewi.m25683r(this.w1);
        ewi.m25683r(this.r0);
        ewi.m25683r(this.B0);
    }

    public void p0(ck6 ck6Var) {
        this.s1 = ck6Var;
        synchronized (this) {
            this.x1 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    public void q0(Integer num) {
        this.r1 = num;
        synchronized (this) {
            this.x1 |= 16;
        }
        m28509h(73);
        super.m25692R();
    }

    public oog(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 3, (ShapeableImageView) objArr[31], (FloatingActionButton) objArr[58], (ChipGroup) objArr[43], (FloatingActionButton) objArr[57], (t14) objArr[28], (FloatingActionButton) objArr[55], (ShapeableImageView) objArr[3], (FloatingActionButton) objArr[26], (ShapeableImageView) objArr[5], (FloatingActionButton) objArr[52], (LinearLayout) objArr[37], (FloatingActionButton) objArr[53], (MaterialTextView) objArr[2], (FrameLayout) objArr[42], (p44) objArr[29], (MaterialTextView) objArr[45], (FloatingActionButton) objArr[56], (FloatingActionButton) objArr[54], (LinearLayout) objArr[51], (ShimmerFrameLayout) objArr[32], (MaterialButton) objArr[34], (MentionAutoCompleteTextView) objArr[50], (TextInputLayout) objArr[49], (RecyclerView) objArr[47], (MaterialTextView) objArr[46], (Chip) objArr[13], (MaterialButton) objArr[41], (MaterialButton) objArr[15], (MaterialTextView) objArr[17], (MaterialTextView) objArr[10], (MaterialTextView) objArr[36], (Chip) objArr[20], (MaterialButton) objArr[38], (ConstraintLayout) objArr[30], (ConstraintLayout) objArr[14], (View) objArr[16], (View) objArr[48], (Chip) objArr[12], (MaterialButton) objArr[39], (RecyclerView) objArr[23], (MaterialCardView) objArr[33], (Chip) objArr[22], (Chip) objArr[11], (Chip) objArr[18], (Chip) objArr[21], (MaterialButton) objArr[35], (MaterialButton) objArr[9], (Chip) objArr[19], (Chip) objArr[44], (MaterialButton) objArr[40], (RecyclerView) objArr[25], (MaterialTextView) objArr[24], (MaterialTextView) objArr[7], (MaterialTextView) objArr[6], (MaterialTextView) objArr[8]);
        this.x1 = -1L;
        m25693Z(this.r0);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.z0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.t1 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.u1 = constraintLayout2;
        constraintLayout2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[4];
        this.v1 = linearLayout;
        linearLayout.setTag(null);
        f54 f54Var = (f54) objArr[27];
        this.w1 = f54Var;
        m25693Z(f54Var);
        m25693Z(this.B0);
        this.M0.setTag(null);
        this.O0.setTag(null);
        this.P0.setTag(null);
        this.Q0.setTag(null);
        this.S0.setTag(null);
        this.V0.setTag(null);
        this.W0.setTag(null);
        this.Y0.setTag(null);
        this.a1.setTag(null);
        this.c1.setTag(null);
        this.d1.setTag(null);
        this.e1.setTag(null);
        this.f1.setTag(null);
        this.h1.setTag(null);
        this.i1.setTag(null);
        this.l1.setTag(null);
        this.m1.setTag(null);
        this.n1.setTag(null);
        this.o1.setTag(null);
        this.p1.setTag(null);
        a0(view);
        mo16291G();
    }
}
