package p001o;

import ai.salesmax.model.FileData;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import p001o.ewi;

/* loaded from: classes.dex */
public class iy extends hy {
    public static final ewi.C13274i P0 = null;
    public static final SparseIntArray Q0;
    public final MaterialCardView N0;
    public long O0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 5);
        sparseIntArray.put(z8e.buttonDone, 6);
        sparseIntArray.put(z8e.layout, 7);
        sparseIntArray.put(z8e.mAutoComplete, 8);
        sparseIntArray.put(z8e.mClose, 9);
        sparseIntArray.put(z8e.taskBasicHeadLineLayout, 10);
        sparseIntArray.put(z8e.taskBasicDescriptionLayout, 11);
        sparseIntArray.put(z8e.notesBorder1, 12);
        sparseIntArray.put(z8e.notesActionButtons, 13);
        sparseIntArray.put(z8e.taskAttachment, 14);
        sparseIntArray.put(z8e.taskPicture, 15);
        sparseIntArray.put(z8e.scanDoc, 16);
        sparseIntArray.put(z8e.tvNoteOutComeNextTitle, 17);
        sparseIntArray.put(z8e.rvNextStepTaskType, 18);
        sparseIntArray.put(z8e.btnLaterToday, 19);
        sparseIntArray.put(z8e.btnTomorrow, 20);
        sparseIntArray.put(z8e.btnLaterThisWeek, 21);
        sparseIntArray.put(z8e.btnNextWeek, 22);
        sparseIntArray.put(z8e.btnCustomDate, 23);
    }

    public iy(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 24, P0, Q0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.O0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.O0 = 8L;
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

    @Override // p001o.hy
    public void j0(Tasks tasks) {
        this.K0 = tasks;
        synchronized (this) {
            this.O0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.M0 = ck6Var;
    }

    public void l0(Integer num) {
        this.L0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String noteHeading;
        int i;
        ArrayList<FileData> fileList;
        String body;
        synchronized (this) {
            j = this.O0;
            this.O0 = 0L;
        }
        Tasks tasks = this.K0;
        long j2 = j & 12;
        String noteNextStep = null;
        if (j2 != 0) {
            if (tasks != null) {
                noteNextStep = tasks.getNoteNextStep();
                body = tasks.getBody();
                noteHeading = tasks.getNoteHeading();
                fileList = tasks.getFileList();
            } else {
                fileList = null;
                body = null;
                noteHeading = null;
            }
            boolean zIsEmpty = noteNextStep != null ? noteNextStep.isEmpty() : false;
            if (j2 != 0) {
                j |= zIsEmpty ? 128L : 64L;
            }
            int size = fileList != null ? fileList.size() : 0;
            int i2 = zIsEmpty ? 8 : 0;
            boolean z = size > 0;
            if ((j & 12) != 0) {
                j |= z ? 32L : 16L;
            }
            i = z ? 0 : 8;
            i = i2;
            noteNextStep = body;
        } else {
            noteHeading = null;
            i = 0;
        }
        if ((j & 12) != 0) {
            fjh.m26938c(this.C0, noteNextStep);
            fjh.m26938c(this.E0, noteHeading);
            this.G0.setVisibility(i);
            this.I0.setVisibility(i);
        }
    }

    public iy(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[23], (Button) objArr[21], (Button) objArr[19], (Button) objArr[22], (Button) objArr[20], (MaterialButton) objArr[5], (MaterialButton) objArr[6], (TextInputLayout) objArr[7], (AppCompatAutoCompleteTextView) objArr[8], (AppCompatImageView) objArr[9], (LinearLayout) objArr[13], (View) objArr[12], (RecyclerView) objArr[18], (MaterialButton) objArr[16], (MaterialButton) objArr[14], (TextInputEditText) objArr[2], (TextInputLayout) objArr[11], (TextInputEditText) objArr[1], (TextInputLayout) objArr[10], (RecyclerView) objArr[3], (MaterialButton) objArr[15], (MaterialButtonToggleGroup) objArr[4], (MaterialTextView) objArr[17]);
        this.O0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.N0 = materialCardView;
        materialCardView.setTag(null);
        this.C0.setTag(null);
        this.E0.setTag(null);
        this.G0.setTag(null);
        this.I0.setTag(null);
        a0(view);
        mo16291G();
    }
}
