package p001o;

import ai.salesmax.model.FormFields;
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
public class lof extends kof {
    public static final ewi.C13274i O0;
    public static final SparseIntArray P0;
    public final LinearLayout L0;
    public final ConstraintLayout M0;
    public long N0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(23);
        O0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_custom_form"}, new int[]{2}, new int[]{p9e.content_custom_form});
        SparseIntArray sparseIntArray = new SparseIntArray();
        P0 = sparseIntArray;
        sparseIntArray.put(z8e.selectDateTimeBlock, 3);
        sparseIntArray.put(z8e.selectDateTime, 4);
        sparseIntArray.put(z8e.addDateTime, 5);
        sparseIntArray.put(z8e.meetingPurposeLayout, 6);
        sparseIntArray.put(z8e.meetingPurpose, 7);
        sparseIntArray.put(z8e.dueDateBlockText, 8);
        sparseIntArray.put(z8e.toggleGroupDueDateSelection, 9);
        sparseIntArray.put(z8e.btnImmediate, 10);
        sparseIntArray.put(z8e.btnCustomDate, 11);
        sparseIntArray.put(z8e.reminderBlockText, 12);
        sparseIntArray.put(z8e.reminderBlock, 13);
        sparseIntArray.put(z8e.btnFiveMinutes, 14);
        sparseIntArray.put(z8e.btnTenMinutes, 15);
        sparseIntArray.put(z8e.btnThirtyMinutes, 16);
        sparseIntArray.put(z8e.btnOneHour, 17);
        sparseIntArray.put(z8e.tiLayoutNotes, 18);
        sparseIntArray.put(z8e.tiEditTextNotes, 19);
        sparseIntArray.put(z8e.tvHeadingText, 20);
        sparseIntArray.put(z8e.rvOpenTaskList, 21);
        sparseIntArray.put(z8e.btnGetMeetingLink, 22);
    }

    public lof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 23, O0, P0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.N0 != 0) {
                return true;
            }
            return this.v0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.N0 = 16L;
        }
        this.v0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return l0((r14) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (19 == i) {
            k0((FormFields) obj);
        } else if (73 == i) {
            n0((Integer) obj);
        } else {
            if (33 != i) {
                return false;
            }
            m0((ck6) obj);
        }
        return true;
    }

    @Override // p001o.kof
    public void k0(FormFields formFields) {
        this.I0 = formFields;
        synchronized (this) {
            this.N0 |= 2;
        }
        m28509h(19);
        super.m25692R();
    }

    public final boolean l0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.N0 |= 1;
        }
        return true;
    }

    public void m0(ck6 ck6Var) {
        this.K0 = ck6Var;
        synchronized (this) {
            this.N0 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    public void n0(Integer num) {
        this.J0 = num;
        synchronized (this) {
            this.N0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.N0;
            this.N0 = 0L;
        }
        FormFields formFields = this.I0;
        Integer num = this.J0;
        ck6 ck6Var = this.K0;
        long j2 = 18 & j;
        long j3 = 20 & j;
        long j4 = j & 24;
        if (j2 != 0) {
            this.v0.i0(formFields);
        }
        if (j4 != 0) {
            this.v0.h0(ck6Var);
        }
        if (j3 != 0) {
            this.v0.j0(num);
        }
        ewi.m25683r(this.v0);
    }

    public lof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (MaterialTextView) objArr[5], (Button) objArr[11], (Button) objArr[14], (MaterialButton) objArr[22], (Button) objArr[10], (Button) objArr[17], (Button) objArr[15], (Button) objArr[16], (r14) objArr[2], (MaterialTextView) objArr[8], (TextInputEditText) objArr[7], (TextInputLayout) objArr[6], (MaterialButtonToggleGroup) objArr[13], (MaterialTextView) objArr[12], (RecyclerView) objArr[21], (MaterialButton) objArr[4], (LinearLayout) objArr[3], (TextInputEditText) objArr[19], (TextInputLayout) objArr[18], (MaterialButtonToggleGroup) objArr[9], (MaterialTextView) objArr[20]);
        this.N0 = -1L;
        m25693Z(this.v0);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.L0 = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.M0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
