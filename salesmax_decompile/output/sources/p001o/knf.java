package p001o;

import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class knf extends jnf {
    public static final ewi.C13274i J0 = null;
    public static final SparseIntArray K0;
    public final LinearLayout H0;
    public long I0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 3);
        sparseIntArray.put(z8e.buttonDone, 4);
        sparseIntArray.put(z8e.callOutcomeWhenNoTask, 5);
        sparseIntArray.put(z8e.rvCallOutcome, 6);
        sparseIntArray.put(z8e.tvCallOutComeNextTitle, 7);
        sparseIntArray.put(z8e.rvNextStepTaskType, 8);
        sparseIntArray.put(z8e.btnLaterToday, 9);
        sparseIntArray.put(z8e.btnTomorrow, 10);
        sparseIntArray.put(z8e.btnLaterThisWeek, 11);
        sparseIntArray.put(z8e.btnNextWeek, 12);
        sparseIntArray.put(z8e.btnCustomDate, 13);
        sparseIntArray.put(z8e.tvCallOutComeNote, 14);
        sparseIntArray.put(z8e.tvNoteAddSpeech, 15);
        sparseIntArray.put(z8e.tiLayoutNotes, 16);
        sparseIntArray.put(z8e.callOutcome_ActionButton, 17);
    }

    public knf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 18, J0, K0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.I0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.I0 = 8L;
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
            j0((Integer) obj);
        } else if (33 == i) {
            h0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((Tasks) obj);
        }
        return true;
    }

    public void h0(ck6 ck6Var) {
        this.G0 = ck6Var;
    }

    public void i0(Tasks tasks) {
        this.E0 = tasks;
        synchronized (this) {
            this.I0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.F0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String callInputNotes;
        synchronized (this) {
            j = this.I0;
            this.I0 = 0L;
        }
        Tasks tasks = this.E0;
        long j2 = j & 12;
        String callNextStep = null;
        if (j2 != 0) {
            if (tasks != null) {
                callNextStep = tasks.getCallNextStep();
                callInputNotes = tasks.getCallInputNotes();
            } else {
                callInputNotes = null;
            }
            boolean zIsEmpty = callNextStep != null ? callNextStep.isEmpty() : false;
            if (j2 != 0) {
                j |= zIsEmpty ? 32L : 16L;
            }
            i = zIsEmpty ? 8 : 0;
            callNextStep = callInputNotes;
        }
        if ((j & 12) != 0) {
            fjh.m26938c(this.y0, callNextStep);
            this.A0.setVisibility(i);
        }
    }

    public knf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[13], (Button) objArr[11], (Button) objArr[9], (Button) objArr[12], (Button) objArr[10], (MaterialButton) objArr[3], (MaterialButton) objArr[4], (MaterialButton) objArr[17], (ConstraintLayout) objArr[5], (RecyclerView) objArr[6], (RecyclerView) objArr[8], (TextInputEditText) objArr[2], (TextInputLayout) objArr[16], (MaterialButtonToggleGroup) objArr[1], (MaterialTextView) objArr[7], (MaterialTextView) objArr[14], (MaterialButton) objArr[15]);
        this.I0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.H0 = linearLayout;
        linearLayout.setTag(null);
        this.y0.setTag(null);
        this.A0.setTag(null);
        a0(view);
        mo16291G();
    }
}
