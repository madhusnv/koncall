package p001o;

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
import p001o.ewi;

/* loaded from: classes.dex */
public class p1c extends o1c {
    public static final ewi.C13274i T0;
    public static final SparseIntArray U0;
    public final ConstraintLayout P0;
    public final LinearLayout Q0;
    public final f54 R0;
    public long S0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(28);
        T0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_shimmer_tak_detail"}, new int[]{12}, new int[]{p9e.content_shimmer_tak_detail});
        SparseIntArray sparseIntArray = new SparseIntArray();
        U0 = sparseIntArray;
        sparseIntArray.put(z8e.shimmerLayout, 13);
        sparseIntArray.put(z8e.noteDetailTitle, 14);
        sparseIntArray.put(z8e.buttonClose, 15);
        sparseIntArray.put(z8e.leadTitle, 16);
        sparseIntArray.put(z8e.notesDelete, 17);
        sparseIntArray.put(z8e.notesEdit, 18);
        sparseIntArray.put(z8e.notesStatus, 19);
        sparseIntArray.put(z8e.notesDetailsBorder1, 20);
        sparseIntArray.put(z8e.notesDetails, 21);
        sparseIntArray.put(z8e.notesAddNextStep, 22);
        sparseIntArray.put(z8e.notesCommentsTitle, 23);
        sparseIntArray.put(z8e.notesCommentsList, 24);
        sparseIntArray.put(z8e.notesDetailsBorderBottom, 25);
        sparseIntArray.put(z8e.notesCommentTextInputLayout, 26);
        sparseIntArray.put(z8e.notesCommentEditText, 27);
    }

    public p1c(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 28, T0, U0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.S0 != 0) {
                return true;
            }
            return this.R0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.S0 = 8L;
        }
        this.R0.mo16291G();
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

    @Override // p001o.o1c
    public void j0(Tasks tasks) {
        this.M0 = tasks;
        synchronized (this) {
            this.S0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.O0 = ck6Var;
    }

    public void l0(Integer num) {
        this.N0 = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0128 A[PHI: r2
      0x0128: PHI (r2v2 long) = (r2v1 long), (r2v18 long) binds: [B:78:0x0110, B:87:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        Long l;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ryh activityLocation;
        Long updatedAt;
        String clientName;
        String noteHeading;
        String body;
        ArrayList<FileData> fileList;
        synchronized (this) {
            j = this.S0;
            this.S0 = 0L;
        }
        Tasks tasks = this.M0;
        long j2 = j & 12;
        String noteNextStep = null;
        if (j2 != 0) {
            if (tasks != null) {
                noteNextStep = tasks.getNoteNextStep();
                activityLocation = tasks.getActivityLocation();
                updatedAt = tasks.getUpdatedAt();
                clientName = tasks.getClientName();
                noteHeading = tasks.getNoteHeading();
                body = tasks.getBody();
                fileList = tasks.getFileList();
            } else {
                activityLocation = null;
                updatedAt = null;
                clientName = null;
                noteHeading = null;
                body = null;
                fileList = null;
            }
            boolean z2 = tasks == null;
            if (j2 != 0) {
                j |= z2 ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            String str5 = "Next Step : " + noteNextStep;
            z = noteNextStep == null;
            boolean z3 = activityLocation == null;
            int i6 = z2 ? 8 : 0;
            if ((j & 12) != 0) {
                j = z ? j | 512 : j | 256;
            }
            if ((j & 12) != 0) {
                j |= z3 ? 32L : 16L;
            }
            boolean zIsEmpty = body != null ? body.isEmpty() : false;
            if ((j & 12) != 0) {
                j |= zIsEmpty ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            int size = fileList != null ? fileList.size() : 0;
            int i7 = z3 ? 8 : 0;
            int i8 = zIsEmpty ? 8 : 0;
            boolean z4 = size > 0;
            if ((j & 12) != 0) {
                j |= z4 ? 128L : 64L;
            }
            str = str5;
            i = i7;
            l = updatedAt;
            str3 = clientName;
            str2 = noteHeading;
            str4 = body;
            i2 = z4 ? 0 : 8;
            i3 = i6;
            i4 = i8;
        } else {
            l = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            z = false;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        boolean zIsEmpty2 = ((256 & j) == 0 || noteNextStep == null) ? false : noteNextStep.isEmpty();
        long j3 = j & 12;
        if (j3 == 0) {
            i5 = 0;
        } else {
            boolean z5 = z ? true : zIsEmpty2;
            if (j3 != 0) {
                j |= z5 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if (z5) {
                i5 = 8;
            }
        }
        if ((j & 12) != 0) {
            this.o0.setVisibility(i);
            nr1.z0(this.p0, tasks);
            this.s0.setVisibility(i3);
            fjh.m26938c(this.t0, str);
            this.t0.setVisibility(i5);
            fjh.m26938c(this.z0, str4);
            this.z0.setVisibility(i4);
            nr1.e0(this.A0, l);
            this.G0.setVisibility(i2);
            fjh.m26938c(this.H0, str2);
            nr1.f1(this.K0, str3);
            nr1.b1(this.L0, tasks);
        }
        ewi.m25683r(this.R0);
    }

    public p1c(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[15], (ShapeableImageView) objArr[2], (ShapeableImageView) objArr[3], (MaterialTextView) objArr[16], (ConstraintLayout) objArr[14], (LinearLayout) objArr[6], (MaterialButton) objArr[11], (MaterialButton) objArr[22], (MentionAutoCompleteTextView) objArr[27], (TextInputLayout) objArr[26], (RecyclerView) objArr[24], (MaterialTextView) objArr[23], (MaterialTextView) objArr[9], (MaterialTextView) objArr[7], (MaterialButton) objArr[17], (ConstraintLayout) objArr[21], (View) objArr[20], (View) objArr[25], (MaterialButton) objArr[18], (RecyclerView) objArr[10], (MaterialButton) objArr[8], (MaterialTextView) objArr[19], (ShimmerFrameLayout) objArr[13], (MaterialTextView) objArr[4], (MaterialTextView) objArr[5]);
        this.S0 = -1L;
        this.o0.setTag(null);
        this.p0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.P0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.Q0 = linearLayout;
        linearLayout.setTag(null);
        f54 f54Var = (f54) objArr[12];
        this.R0 = f54Var;
        m25693Z(f54Var);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.G0.setTag(null);
        this.H0.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        a0(view);
        mo16291G();
    }
}
