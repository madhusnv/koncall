package p001o;

import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class n14 extends m14 {
    public static final ewi.C13274i Z0 = null;
    public static final SparseIntArray a1;
    public final FrameLayout X0;
    public long Y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a1 = sparseIntArray;
        sparseIntArray.put(z8e.contentCallDataParent, 9);
        sparseIntArray.put(z8e.leadDetailsClose, 10);
        sparseIntArray.put(z8e.leadDetailsButtonGroup, 11);
        sparseIntArray.put(z8e.leadDetailsBorder1, 12);
        sparseIntArray.put(z8e.layout, 13);
        sparseIntArray.put(z8e.mAutoComplete, 14);
        sparseIntArray.put(z8e.mClose, 15);
        sparseIntArray.put(z8e.tvCallOutComeTitle, 16);
        sparseIntArray.put(z8e.tvCallOutcomeAddMap, 17);
        sparseIntArray.put(z8e.tvCallOutcomeDateEdit, 18);
        sparseIntArray.put(z8e.rvCallOutcome, 19);
        sparseIntArray.put(z8e.tvCallOutComeNextTitle, 20);
        sparseIntArray.put(z8e.rvNextStepTaskType, 21);
        sparseIntArray.put(z8e.btnLaterToday, 22);
        sparseIntArray.put(z8e.btnTomorrow, 23);
        sparseIntArray.put(z8e.btnLaterThisWeek, 24);
        sparseIntArray.put(z8e.btnNextWeek, 25);
        sparseIntArray.put(z8e.btnCustomDate, 26);
        sparseIntArray.put(z8e.tvCallOutComeNote, 27);
        sparseIntArray.put(z8e.tvNoteAddSpeech, 28);
        sparseIntArray.put(z8e.tiLayoutNotes, 29);
        sparseIntArray.put(z8e.callOutcome_ActionButton, 30);
        sparseIntArray.put(z8e.callOutcome_BottomView, 31);
        sparseIntArray.put(z8e.snooze, 32);
    }

    public n14(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 33, Z0, a1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.Y0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.Y0 = 16L;
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
            m0((Integer) obj);
        } else if (33 == i) {
            l0((ck6) obj);
        } else if (52 == i) {
            j0(((Boolean) obj).booleanValue());
        } else {
            if (67 != i) {
                return false;
            }
            k0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.m14
    public void j0(boolean z) {
        this.U0 = z;
    }

    @Override // p001o.m14
    public void k0(Tasks tasks) {
        this.T0 = tasks;
        synchronized (this) {
            this.Y0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(ck6 ck6Var) {
        this.W0 = ck6Var;
    }

    public void m0(Integer num) {
        this.V0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long j2;
        String callInputNotes;
        String taskLocation;
        String clientName;
        synchronized (this) {
            j = this.Y0;
            this.Y0 = 0L;
        }
        Tasks tasks = this.T0;
        long j3 = j & 24;
        String str = null;
        if (j3 != 0) {
            if (tasks != null) {
                long callStartTime = tasks.getCallStartTime();
                String callNextStep = tasks.getCallNextStep();
                clientName = tasks.getClientName();
                callInputNotes = tasks.getCallInputNotes();
                taskLocation = tasks.getTaskLocation();
                str = callNextStep;
                j2 = callStartTime;
            } else {
                j2 = 0;
                clientName = null;
                callInputNotes = null;
                taskLocation = null;
            }
            boolean zIsEmpty = str != null ? str.isEmpty() : false;
            if (j3 != 0) {
                j |= zIsEmpty ? 64L : 32L;
            }
            i = zIsEmpty ? 8 : 0;
            str = clientName;
        } else {
            j2 = 0;
            callInputNotes = null;
            taskLocation = null;
        }
        if ((j & 24) != 0) {
            nr1.f1(this.z0, str);
            nr1.b1(this.A0, tasks);
            nr1.z0(this.B0, tasks);
            fjh.m26938c(this.H0, callInputNotes);
            this.J0.setVisibility(i);
            nr1.s2(this.O0, Long.valueOf(j2));
            nr1.m40930A(this.Q0, tasks);
            fjh.m26938c(this.S0, taskLocation);
        }
    }

    public n14(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[26], (Button) objArr[24], (Button) objArr[22], (Button) objArr[25], (Button) objArr[23], (MaterialButton) objArr[30], (View) objArr[31], (MaterialCardView) objArr[9], (TextInputLayout) objArr[13], (View) objArr[12], (LinearLayout) objArr[11], (ShapeableImageView) objArr[10], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3], (ShapeableImageView) objArr[1], (AppCompatAutoCompleteTextView) objArr[14], (AppCompatImageView) objArr[15], (RecyclerView) objArr[19], (RecyclerView) objArr[21], (ShapeableImageView) objArr[32], (TextInputEditText) objArr[8], (TextInputLayout) objArr[29], (MaterialButtonToggleGroup) objArr[7], (MaterialTextView) objArr[20], (MaterialTextView) objArr[27], (MaterialTextView) objArr[16], (MaterialButton) objArr[17], (MaterialTextView) objArr[4], (MaterialButton) objArr[18], (MaterialTextView) objArr[6], (MaterialButton) objArr[28], (MaterialTextView) objArr[5]);
        this.Y0 = -1L;
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.X0 = frameLayout;
        frameLayout.setTag(null);
        this.H0.setTag(null);
        this.J0.setTag(null);
        this.O0.setTag(null);
        this.Q0.setTag(null);
        this.S0.setTag(null);
        a0(view);
        mo16291G();
    }
}
