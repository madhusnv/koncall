package p001o;

import ai.salesmax.model.EngagementUpdateSummary;
import ai.salesmax.model.FileData;
import ai.salesmax.model.Tasks;
import ai.salesmax.view.MentionAutoCompleteTextView;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.List;
import p001o.ewi;

/* loaded from: classes.dex */
public class jcb extends icb {
    public static final ewi.C13274i U0;
    public static final SparseIntArray V0;
    public final ConstraintLayout Q0;
    public final LinearLayout R0;
    public final f54 S0;
    public long T0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(29);
        U0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_shimmer_tak_detail"}, new int[]{14}, new int[]{p9e.content_shimmer_tak_detail});
        SparseIntArray sparseIntArray = new SparseIntArray();
        V0 = sparseIntArray;
        sparseIntArray.put(z8e.shimmerLayout, 15);
        sparseIntArray.put(z8e.noteDetailTitle, 16);
        sparseIntArray.put(z8e.buttonClose, 17);
        sparseIntArray.put(z8e.leadTitle, 18);
        sparseIntArray.put(z8e.notesStatus, 19);
        sparseIntArray.put(z8e.notesDetailsBorder1, 20);
        sparseIntArray.put(z8e.notesDetails, 21);
        sparseIntArray.put(z8e.notesAddNextStep, 22);
        sparseIntArray.put(z8e.notesDetailsBorder2, 23);
        sparseIntArray.put(z8e.notesCommentsTitle, 24);
        sparseIntArray.put(z8e.notesCommentsList, 25);
        sparseIntArray.put(z8e.notesDetailsBorderBottom, 26);
        sparseIntArray.put(z8e.notesCommentTextInputLayout, 27);
        sparseIntArray.put(z8e.notesCommentEditText, 28);
    }

    public jcb(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 29, U0, V0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.T0 != 0) {
                return true;
            }
            return this.S0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.T0 = 8L;
        }
        this.S0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            l0((Integer) obj);
        } else if (33 == i) {
            k0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.icb
    public void j0(Tasks tasks) {
        this.N0 = tasks;
        synchronized (this) {
            this.T0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.P0 = ck6Var;
    }

    public void l0(Integer num) {
        this.O0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        Long l;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List<EngagementUpdateSummary> engagementUpdates;
        ryh activityLocation;
        Long updatedAt;
        String taskEngagementType;
        String clientName;
        String noteHeading;
        String body;
        ArrayList<FileData> fileList;
        synchronized (this) {
            j = this.T0;
            this.T0 = 0L;
        }
        Tasks tasks = this.N0;
        long j2 = j & 12;
        String noteNextStep = null;
        if (j2 != 0) {
            if (tasks != null) {
                noteNextStep = tasks.getNoteNextStep();
                engagementUpdates = tasks.getEngagementUpdates();
                activityLocation = tasks.getActivityLocation();
                updatedAt = tasks.getUpdatedAt();
                taskEngagementType = tasks.getTaskEngagementType();
                clientName = tasks.getClientName();
                noteHeading = tasks.getNoteHeading();
                body = tasks.getBody();
                fileList = tasks.getFileList();
            } else {
                engagementUpdates = null;
                activityLocation = null;
                updatedAt = null;
                taskEngagementType = null;
                clientName = null;
                noteHeading = null;
                body = null;
                fileList = null;
            }
            String str6 = "Next Step : " + noteNextStep;
            z = noteNextStep == null;
            boolean z3 = activityLocation == null;
            z2 = taskEngagementType == null;
            if (j2 != 0) {
                j = z ? j | 512 : j | 256;
            }
            if ((j & 12) != 0) {
                j |= z3 ? 32L : 16L;
            }
            if ((j & 12) != 0) {
                j = z2 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            int size = engagementUpdates != null ? engagementUpdates.size() : 0;
            boolean zIsEmpty = body != null ? body.isEmpty() : false;
            if ((j & 12) != 0) {
                j |= zIsEmpty ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            int size2 = fileList != null ? fileList.size() : 0;
            int i7 = z3 ? 8 : 0;
            boolean z4 = size > 0;
            int i8 = zIsEmpty ? 8 : 0;
            boolean z5 = size2 > 0;
            if ((j & 12) != 0) {
                j |= z4 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            if ((j & 12) != 0) {
                j |= z5 ? 128L : 64L;
            }
            i = z4 ? 0 : 8;
            str3 = str6;
            str = noteNextStep;
            i2 = i8;
            i3 = i7;
            l = updatedAt;
            noteNextStep = taskEngagementType;
            str2 = clientName;
            str4 = noteHeading;
            str5 = body;
            i4 = z5 ? 0 : 8;
        } else {
            str = null;
            l = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            i = 0;
            z = false;
            z2 = false;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        boolean zIsEmpty2 = ((MediaStatus.COMMAND_QUEUE_REPEAT_ALL & j) == 0 || noteNextStep == null) ? false : noteNextStep.isEmpty();
        boolean zIsEmpty3 = ((256 & j) == 0 || str == null) ? false : str.isEmpty();
        long j3 = j & 12;
        if (j3 != 0) {
            if (z) {
                zIsEmpty3 = true;
            }
            boolean z6 = z2 ? true : zIsEmpty2;
            if (j3 != 0) {
                j |= zIsEmpty3 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 12) != 0) {
                j |= z6 ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            i5 = zIsEmpty3 ? 8 : 0;
            i6 = z6 ? 8 : 0;
        } else {
            i5 = 0;
            i6 = 0;
        }
        if ((j & 12) != 0) {
            this.o0.setVisibility(i3);
            nr1.z0(this.p0, tasks);
            nr1.e3(this.r0, noteNextStep);
            this.r0.setVisibility(i6);
            fjh.m26938c(this.t0, str3);
            this.t0.setVisibility(i5);
            fjh.m26938c(this.z0, str5);
            this.z0.setVisibility(i2);
            nr1.e0(this.A0, l);
            this.F0.setVisibility(i4);
            fjh.m26938c(this.G0, str4);
            this.J0.setVisibility(i);
            this.K0.setVisibility(i);
            nr1.f1(this.L0, str2);
            nr1.b1(this.M0, tasks);
        }
        ewi.m25683r(this.S0);
    }

    public jcb(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[17], (ShapeableImageView) objArr[2], (ShapeableImageView) objArr[3], (MaterialTextView) objArr[18], (ShapeableImageView) objArr[8], (ConstraintLayout) objArr[16], (MaterialButton) objArr[11], (MaterialButton) objArr[22], (MentionAutoCompleteTextView) objArr[28], (TextInputLayout) objArr[27], (RecyclerView) objArr[25], (MaterialTextView) objArr[24], (MaterialTextView) objArr[9], (MaterialTextView) objArr[6], (ConstraintLayout) objArr[21], (View) objArr[20], (View) objArr[23], (View) objArr[26], (RecyclerView) objArr[10], (MaterialTextView) objArr[7], (MaterialTextView) objArr[19], (ShimmerFrameLayout) objArr[15], (RecyclerView) objArr[13], (MaterialTextView) objArr[12], (MaterialTextView) objArr[4], (MaterialTextView) objArr[5]);
        this.T0 = -1L;
        this.o0.setTag(null);
        this.p0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.R0 = linearLayout;
        linearLayout.setTag(null);
        f54 f54Var = (f54) objArr[14];
        this.S0 = f54Var;
        m25693Z(f54Var);
        this.r0.setTag(null);
        this.t0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.F0.setTag(null);
        this.G0.setTag(null);
        this.J0.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        a0(view);
        mo16291G();
    }
}
