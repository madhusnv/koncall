package p001o;

import ai.salesmax.custom.CustomFormDataObservable;
import ai.salesmax.model.FileData;
import ai.salesmax.model.Tasks;
import ai.salesmax.view.MentionAutoCompleteTextView;
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
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import p001o.ewi;

/* loaded from: classes.dex */
public class x1j extends w1j {
    public static final ewi.C13274i Z0;
    public static final SparseIntArray a1;
    public final ConstraintLayout V0;
    public final LinearLayout W0;
    public final f54 X0;
    public long Y0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(34);
        Z0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_shimmer_tak_detail"}, new int[]{16}, new int[]{p9e.content_shimmer_tak_detail});
        c13274i.m25699a(8, new String[]{"content_custom_form_value"}, new int[]{17}, new int[]{p9e.content_custom_form_value});
        SparseIntArray sparseIntArray = new SparseIntArray();
        a1 = sparseIntArray;
        sparseIntArray.put(z8e.shimmerLayout, 18);
        sparseIntArray.put(z8e.visitDetailTitle, 19);
        sparseIntArray.put(z8e.buttonClose, 20);
        sparseIntArray.put(z8e.leadTitle, 21);
        sparseIntArray.put(z8e.notesDelete, 22);
        sparseIntArray.put(z8e.notesEdit, 23);
        sparseIntArray.put(z8e.notesStatus, 24);
        sparseIntArray.put(z8e.notesDetailsBorder1, 25);
        sparseIntArray.put(z8e.mapFragmentLayout, 26);
        sparseIntArray.put(z8e.notesAddNextStep, 27);
        sparseIntArray.put(z8e.notesDetailsBorder2, 28);
        sparseIntArray.put(z8e.notesCommentsTitle, 29);
        sparseIntArray.put(z8e.notesCommentsList, 30);
        sparseIntArray.put(z8e.notesDetailsBorderBottom, 31);
        sparseIntArray.put(z8e.notesCommentTextInputLayout, 32);
        sparseIntArray.put(z8e.notesCommentEditText, 33);
    }

    public x1j(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 34, Z0, a1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.Y0 != 0) {
                return true;
            }
            return this.X0.mo16290E() || this.o0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.Y0 = 32L;
        }
        this.X0.mo16291G();
        this.o0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return k0((t14) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return l0((CustomFormDataObservable) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            n0((Integer) obj);
        } else if (33 == i) {
            m0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.w1j
    public void j0(Tasks tasks) {
        this.S0 = tasks;
        synchronized (this) {
            this.Y0 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public final boolean k0(t14 t14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.Y0 |= 1;
        }
        return true;
    }

    public final boolean l0(CustomFormDataObservable customFormDataObservable, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.Y0 |= 2;
        }
        return true;
    }

    public void m0(ck6 ck6Var) {
        this.U0 = ck6Var;
        synchronized (this) {
            this.Y0 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    public void n0(Integer num) {
        this.T0 = num;
        synchronized (this) {
            this.Y0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        Integer num;
        long visitDateInMillis;
        ck6 ck6Var;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean zIsEmpty;
        boolean z2;
        String str;
        String str2;
        String str3;
        CustomFormDataObservable customVisitOutcomeDataObservable;
        Long l;
        String str4;
        boolean zIsEmpty2;
        boolean zIsEmpty3;
        CustomFormDataObservable customFormDataObservable;
        int i4;
        int i5;
        int i6;
        int i7;
        Long updatedAt;
        String clientName;
        String taskLocation;
        ryh activityLocation;
        String visitOutcome;
        String customVisitOutcomeData;
        ArrayList<FileData> fileList;
        synchronized (this) {
            j = this.Y0;
            this.Y0 = 0L;
        }
        Integer num2 = this.T0;
        ck6 ck6Var2 = this.U0;
        Tasks tasks = this.S0;
        if ((j & 50) != 0) {
            long j2 = j & 48;
            if (j2 != 0) {
                if (tasks != null) {
                    activityLocation = tasks.getActivityLocation();
                    updatedAt = tasks.getUpdatedAt();
                    visitOutcome = tasks.getVisitOutcome();
                    clientName = tasks.getClientName();
                    visitDateInMillis = tasks.getVisitDateInMillis();
                    String visitNextStep = tasks.getVisitNextStep();
                    customVisitOutcomeData = tasks.getCustomVisitOutcomeData();
                    taskLocation = tasks.getTaskLocation();
                    fileList = tasks.getFileList();
                    str3 = visitNextStep;
                } else {
                    visitDateInMillis = 0;
                    str3 = null;
                    activityLocation = null;
                    updatedAt = null;
                    visitOutcome = null;
                    clientName = null;
                    customVisitOutcomeData = null;
                    taskLocation = null;
                    fileList = null;
                }
                z2 = tasks == null;
                if (j2 != 0) {
                    j = z2 ? j | MediaStatus.COMMAND_DISLIKE : j | MediaStatus.COMMAND_LIKE;
                }
                boolean z3 = activityLocation == null;
                z = str3 == null;
                str4 = "Next Step : " + str3;
                boolean z4 = customVisitOutcomeData == null;
                if ((j & 48) != 0) {
                    j |= z3 ? 128L : 64L;
                }
                if ((j & 48) != 0) {
                    j = z ? j | MediaStatus.COMMAND_PLAYBACK_RATE : j | MediaStatus.COMMAND_EDIT_TRACKS;
                }
                if ((j & 48) != 0) {
                    j |= z4 ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
                }
                zIsEmpty = visitOutcome != null ? visitOutcome.isEmpty() : false;
                if ((j & 48) != 0) {
                    j = zIsEmpty ? j | 2097152 : j | 1048576;
                }
                int size = fileList != null ? fileList.size() : 0;
                i2 = z3 ? 8 : 0;
                i3 = z4 ? 8 : 0;
                boolean z5 = size > 0;
                if ((j & 48) != 0) {
                    j |= z5 ? 512L : 256L;
                }
                i7 = z5 ? 0 : 8;
            } else {
                visitDateInMillis = 0;
                i2 = 0;
                i3 = 0;
                z = false;
                zIsEmpty = false;
                i7 = 0;
                z2 = false;
                str3 = null;
                str4 = null;
                updatedAt = null;
                clientName = null;
                taskLocation = null;
            }
            customVisitOutcomeDataObservable = tasks != null ? tasks.getCustomVisitOutcomeDataObservable() : null;
            g0(1, customVisitOutcomeDataObservable);
            l = updatedAt;
            str2 = clientName;
            num = num2;
            i = i7;
            ck6Var = ck6Var2;
            str = taskLocation;
        } else {
            num = num2;
            visitDateInMillis = 0;
            ck6Var = ck6Var2;
            i = 0;
            i2 = 0;
            i3 = 0;
            z = false;
            zIsEmpty = false;
            z2 = false;
            str = null;
            str2 = null;
            str3 = null;
            customVisitOutcomeDataObservable = null;
            l = null;
            str4 = null;
        }
        boolean zIsEmpty4 = ((MediaStatus.COMMAND_EDIT_TRACKS & j) == 0 || str3 == null) ? false : str3.isEmpty();
        if ((MediaStatus.COMMAND_LIKE & j) == 0) {
            zIsEmpty2 = false;
        } else {
            String id = tasks != null ? tasks.getId() : null;
            if (id != null) {
                zIsEmpty2 = id.isEmpty();
            }
        }
        if ((j & 2097152) == 0) {
            zIsEmpty3 = false;
        } else {
            String visitNotes = tasks != null ? tasks.getVisitNotes() : null;
            if (visitNotes != null) {
                zIsEmpty3 = visitNotes.isEmpty();
            }
        }
        long j3 = j & 48;
        if (j3 != 0) {
            if (z) {
                zIsEmpty4 = true;
            }
            if (z2) {
                zIsEmpty2 = true;
            }
            if (!zIsEmpty) {
                zIsEmpty3 = false;
            }
            if (j3 != 0) {
                j |= zIsEmpty4 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            if ((j & 48) != 0) {
                j |= zIsEmpty2 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 48) != 0) {
                j |= zIsEmpty3 ? 8388608L : 4194304L;
            }
            int i8 = zIsEmpty4 ? 8 : 0;
            i6 = zIsEmpty2 ? 4 : 0;
            int i9 = zIsEmpty3 ? 8 : 0;
            customFormDataObservable = customVisitOutcomeDataObservable;
            i5 = i8;
            i4 = i9;
        } else {
            customFormDataObservable = customVisitOutcomeDataObservable;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if ((j & 48) != 0) {
            this.o0.m25689B().setVisibility(i3);
            this.p0.setVisibility(i2);
            fjh.m26938c(this.q0, str);
            nr1.T1(this.r0, tasks);
            nr1.z0(this.s0, tasks);
            this.t0.setVisibility(i4);
            nr1.s2(this.u0, Long.valueOf(visitDateInMillis));
            this.x0.setVisibility(i6);
            nr1.e0(this.D0, l);
            nr1.f1(this.M0, str2);
            nr1.b1(this.N0, tasks);
            nr1.k2(this.O0, tasks);
            this.Q0.setVisibility(i);
            fjh.m26938c(this.R0, str4);
            this.R0.setVisibility(i5);
        }
        if ((50 & j) != 0) {
            this.o0.i0(customFormDataObservable);
        }
        if ((40 & j) != 0) {
            this.o0.h0(ck6Var);
        }
        if ((j & 36) != 0) {
            this.o0.j0(num);
        }
        ewi.m25683r(this.X0);
        ewi.m25683r(this.o0);
    }

    public x1j(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (ShapeableImageView) objArr[20], (t14) objArr[17], (ShapeableImageView) objArr[2], (MaterialTextView) objArr[10], (ShapeableImageView) objArr[9], (ShapeableImageView) objArr[3], (MaterialCardView) objArr[12], (MaterialTextView) objArr[11], (MaterialTextView) objArr[21], (FrameLayout) objArr[26], (LinearLayout) objArr[6], (MaterialButton) objArr[27], (MentionAutoCompleteTextView) objArr[33], (TextInputLayout) objArr[32], (RecyclerView) objArr[30], (MaterialTextView) objArr[29], (MaterialTextView) objArr[7], (MaterialButton) objArr[22], (ConstraintLayout) objArr[8], (View) objArr[25], (View) objArr[28], (View) objArr[31], (MaterialButton) objArr[23], (MaterialTextView) objArr[24], (ShimmerFrameLayout) objArr[18], (MaterialTextView) objArr[4], (MaterialTextView) objArr[5], (MaterialTextView) objArr[13], (ConstraintLayout) objArr[19], (RecyclerView) objArr[14], (MaterialButton) objArr[15]);
        this.Y0 = -1L;
        m25693Z(this.o0);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.V0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.W0 = linearLayout;
        linearLayout.setTag(null);
        f54 f54Var = (f54) objArr[16];
        this.X0 = f54Var;
        m25693Z(f54Var);
        this.x0.setTag(null);
        this.D0.setTag(null);
        this.F0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.Q0.setTag(null);
        this.R0.setTag(null);
        a0(view);
        mo16291G();
    }
}
