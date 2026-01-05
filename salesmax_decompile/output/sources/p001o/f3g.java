package p001o;

import ai.salesmax.model.FormFields;
import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
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
public class f3g extends e3g {
    public static final ewi.C13274i e1;
    public static final SparseIntArray f1;
    public final FrameLayout b1;
    public final ConstraintLayout c1;
    public long d1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(37);
        e1 = c13274i;
        c13274i.m25699a(2, new String[]{"content_custom_form"}, new int[]{6}, new int[]{p9e.content_custom_form});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1 = sparseIntArray;
        sparseIntArray.put(z8e.contentCallDataParent, 7);
        sparseIntArray.put(z8e.leadCallReminder, 8);
        sparseIntArray.put(z8e.leadDetailsClose, 9);
        sparseIntArray.put(z8e.editContact, 10);
        sparseIntArray.put(z8e.rvUserTags, 11);
        sparseIntArray.put(z8e.leadDetailsBorder1, 12);
        sparseIntArray.put(z8e.tvDealStageUpdateTitle, 13);
        sparseIntArray.put(z8e.rvDealStage, 14);
        sparseIntArray.put(z8e.tvTaskCompletionImpact, 15);
        sparseIntArray.put(z8e.callOutcomeWhenNoTask, 16);
        sparseIntArray.put(z8e.tvCallOutComeNextTitle, 17);
        sparseIntArray.put(z8e.tvCallOutComeNextAssignee, 18);
        sparseIntArray.put(z8e.nextStepTaskerDelete, 19);
        sparseIntArray.put(z8e.tvNextStepMandatoryText, 20);
        sparseIntArray.put(z8e.toggleGroupDueDateSelection, 21);
        sparseIntArray.put(z8e.btnLaterToday, 22);
        sparseIntArray.put(z8e.btnTomorrow, 23);
        sparseIntArray.put(z8e.btnLaterThisWeek, 24);
        sparseIntArray.put(z8e.btnNextWeek, 25);
        sparseIntArray.put(z8e.btnCustomDate, 26);
        sparseIntArray.put(z8e.tvCallOutComeNote, 27);
        sparseIntArray.put(z8e.tvNoteAddSpeech, 28);
        sparseIntArray.put(z8e.tiLayoutNotes, 29);
        sparseIntArray.put(z8e.sendMessageLayout, 30);
        sparseIntArray.put(z8e.leadWhatsapp, 31);
        sparseIntArray.put(z8e.leadMessage, 32);
        sparseIntArray.put(z8e.leadMail, 33);
        sparseIntArray.put(z8e.sendTemplateAction, 34);
        sparseIntArray.put(z8e.sendTemplateTitle, 35);
        sparseIntArray.put(z8e.callOutcome_ActionButton, 36);
    }

    public f3g(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 37, e1, f1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.d1 != 0) {
                return true;
            }
            return this.v0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.d1 = 64L;
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
        return m0((r14) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (19 == i) {
            k0((FormFields) obj);
        } else if (73 == i) {
            q0((Integer) obj);
        } else if (61 == i) {
            l0((Leads) obj);
        } else if (33 == i) {
            n0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            p0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.e3g
    public void k0(FormFields formFields) {
        this.Y0 = formFields;
        synchronized (this) {
            this.d1 |= 2;
        }
        m28509h(19);
        super.m25692R();
    }

    @Override // p001o.e3g
    public void l0(Leads leads) {
        this.X0 = leads;
        synchronized (this) {
            this.d1 |= 8;
        }
        m28509h(61);
        super.m25692R();
    }

    public final boolean m0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.d1 |= 1;
        }
        return true;
    }

    public void n0(ck6 ck6Var) {
        this.a1 = ck6Var;
        synchronized (this) {
            this.d1 |= 16;
        }
        m28509h(33);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.d1;
            this.d1 = 0L;
        }
        FormFields formFields = this.Y0;
        Integer num = this.Z0;
        Leads leads = this.X0;
        ck6 ck6Var = this.a1;
        Tasks tasks = this.W0;
        long j2 = 66 & j;
        long j3 = 68 & j;
        long j4 = 72 & j;
        String callInputNotes = null;
        String name = (j4 == 0 || leads == null) ? null : leads.getName();
        long j5 = 80 & j;
        long j6 = j & 96;
        if (j6 != 0 && tasks != null) {
            callInputNotes = tasks.getCallInputNotes();
        }
        if (j2 != 0) {
            this.v0.i0(formFields);
        }
        if (j5 != 0) {
            this.v0.h0(ck6Var);
        }
        if (j3 != 0) {
            this.v0.j0(num);
        }
        if (j4 != 0) {
            nr1.f1(this.A0, name);
            nr1.Z0(this.B0, leads);
            nr1.X0(this.C0, leads);
        }
        if (j6 != 0) {
            fjh.m26938c(this.M0, callInputNotes);
        }
        ewi.m25683r(this.v0);
    }

    public void p0(Tasks tasks) {
        this.W0 = tasks;
        synchronized (this) {
            this.d1 |= 32;
        }
        m28509h(67);
        super.m25692R();
    }

    public void q0(Integer num) {
        this.Z0 = num;
        synchronized (this) {
            this.d1 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    public f3g(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (Button) objArr[26], (Button) objArr[24], (Button) objArr[22], (Button) objArr[25], (Button) objArr[23], (MaterialButton) objArr[36], (ConstraintLayout) objArr[16], (MaterialCardView) objArr[7], (r14) objArr[6], (ShapeableImageView) objArr[10], (ShapeableImageView) objArr[8], (View) objArr[12], (ShapeableImageView) objArr[9], (MaterialTextView) objArr[3], (MaterialTextView) objArr[4], (ShapeableImageView) objArr[1], (MaterialButton) objArr[33], (MaterialButton) objArr[32], (MaterialButton) objArr[31], (MaterialButton) objArr[19], (RecyclerView) objArr[14], (RecyclerView) objArr[11], (LinearLayout) objArr[30], (MaterialCardView) objArr[34], (MaterialTextView) objArr[35], (TextInputEditText) objArr[5], (TextInputLayout) objArr[29], (MaterialButtonToggleGroup) objArr[21], (MaterialTextView) objArr[18], (MaterialTextView) objArr[17], (MaterialTextView) objArr[27], (MaterialTextView) objArr[13], (MaterialTextView) objArr[20], (MaterialButton) objArr[28], (MaterialTextView) objArr[15]);
        this.d1 = -1L;
        m25693Z(this.v0);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.b1 = frameLayout;
        frameLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[2];
        this.c1 = constraintLayout;
        constraintLayout.setTag(null);
        this.M0.setTag(null);
        a0(view);
        mo16291G();
    }
}
