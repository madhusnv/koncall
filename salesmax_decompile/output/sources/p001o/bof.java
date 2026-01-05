package p001o;

import ai.salesmax.model.TodoFilter;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
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
public class bof extends aof {
    public static final ewi.C13274i T0 = null;
    public static final SparseIntArray U0;
    public final LinearLayout R0;
    public long S0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonSetting, 3);
        sparseIntArray.put(z8e.filterSheetTitle, 4);
        sparseIntArray.put(z8e.buttonCancel, 5);
        sparseIntArray.put(z8e.contactSourceMessage, 6);
        sparseIntArray.put(z8e.rvFilterTaskType, 7);
        sparseIntArray.put(z8e.taskAttemptsMessage, 8);
        sparseIntArray.put(z8e.textTaskAttemptsMessageHint, 9);
        sparseIntArray.put(z8e.taskOverdueDaysMessage, 10);
        sparseIntArray.put(z8e.textTaskOverdueDaysHint, 11);
        sparseIntArray.put(z8e.lastWorkedMessage, 12);
        sparseIntArray.put(z8e.btnLastWorkedFrom, 13);
        sparseIntArray.put(z8e.btnLastWorkedTo, 14);
        sparseIntArray.put(z8e.dueDateTimeMessage, 15);
        sparseIntArray.put(z8e.btnDueDateFrom, 16);
        sparseIntArray.put(z8e.btnDueDateTo, 17);
        sparseIntArray.put(z8e.sortByMessage, 18);
        sparseIntArray.put(z8e.toggleGroupSortBySelection, 19);
        sparseIntArray.put(z8e.btnDueDate, 20);
        sparseIntArray.put(z8e.btnWorked, 21);
        sparseIntArray.put(z8e.btnCreated, 22);
        sparseIntArray.put(z8e.sortDirectionMessage, 23);
        sparseIntArray.put(z8e.toggleGroupSortDirection, 24);
        sparseIntArray.put(z8e.btnSortDescending, 25);
        sparseIntArray.put(z8e.btnSortAscending, 26);
        sparseIntArray.put(z8e.itemLeadRoot, 27);
        sparseIntArray.put(z8e.buttonClear, 28);
        sparseIntArray.put(z8e.buttonDone, 29);
    }

    public bof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 30, T0, U0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.S0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.S0 = 2L;
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
        if (67 != i) {
            return false;
        }
        j0((TodoFilter) obj);
        return true;
    }

    @Override // p001o.aof
    public void j0(TodoFilter todoFilter) {
        this.Q0 = todoFilter;
        synchronized (this) {
            this.S0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String string;
        Integer numTaskAttempts;
        Integer numDaysOverdueSince;
        synchronized (this) {
            j = this.S0;
            this.S0 = 0L;
        }
        TodoFilter todoFilter = this.Q0;
        long j2 = j & 3;
        String string2 = null;
        if (j2 != 0) {
            if (todoFilter != null) {
                numTaskAttempts = todoFilter.getNumTaskAttempts();
                numDaysOverdueSince = todoFilter.getNumDaysOverdueSince();
            } else {
                numTaskAttempts = null;
                numDaysOverdueSince = null;
            }
            string = numTaskAttempts != null ? numTaskAttempts.toString() : null;
            if (numDaysOverdueSince != null) {
                string2 = numDaysOverdueSince.toString();
            }
        } else {
            string = null;
        }
        if (j2 != 0) {
            fjh.m26938c(this.K0, string2);
            fjh.m26938c(this.L0, string);
        }
    }

    public bof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[22], (Button) objArr[20], (Button) objArr[16], (Button) objArr[17], (Button) objArr[13], (Button) objArr[14], (Button) objArr[26], (Button) objArr[25], (Button) objArr[21], (ShapeableImageView) objArr[5], (MaterialButton) objArr[28], (MaterialButton) objArr[29], (ShapeableImageView) objArr[3], (MaterialTextView) objArr[6], (MaterialTextView) objArr[15], (MaterialTextView) objArr[4], (MaterialCardView) objArr[27], (MaterialTextView) objArr[12], (RecyclerView) objArr[7], (MaterialTextView) objArr[18], (MaterialTextView) objArr[23], (MaterialTextView) objArr[8], (MaterialTextView) objArr[10], (TextInputEditText) objArr[2], (TextInputEditText) objArr[1], (TextInputLayout) objArr[9], (TextInputLayout) objArr[11], (MaterialButtonToggleGroup) objArr[19], (MaterialButtonToggleGroup) objArr[24]);
        this.S0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.R0 = linearLayout;
        linearLayout.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        a0(view);
        mo16291G();
    }
}
