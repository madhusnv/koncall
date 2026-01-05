package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class ymf extends xmf {
    public static final ewi.C13274i g1 = null;
    public static final SparseIntArray h1;
    public final ConstraintLayout d1;
    public boolean e1;
    public long f1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        h1 = sparseIntArray;
        sparseIntArray.put(z8e.taskAssignPeopleTitle, 1);
        sparseIntArray.put(z8e.buttonDoneTop, 2);
        sparseIntArray.put(z8e.assignYourself, 3);
        sparseIntArray.put(z8e.assigneeProfilePic, 4);
        sparseIntArray.put(z8e.assigneeName, 5);
        sparseIntArray.put(z8e.assigneeDesignation, 6);
        sparseIntArray.put(z8e.itemAssigneeSelect, 7);
        sparseIntArray.put(z8e.keepUnassigned, 8);
        sparseIntArray.put(z8e.assigneeProfilePic2, 9);
        sparseIntArray.put(z8e.assigneeName2, 10);
        sparseIntArray.put(z8e.assigneeDesignation2, 11);
        sparseIntArray.put(z8e.itemAssigneeSelect2, 12);
        sparseIntArray.put(z8e.sendToTeam, 13);
        sparseIntArray.put(z8e.assigneeProfilePic3, 14);
        sparseIntArray.put(z8e.assigneeName3, 15);
        sparseIntArray.put(z8e.assigneeDesignation3, 16);
        sparseIntArray.put(z8e.itemAssigneeSelect3, 17);
        sparseIntArray.put(z8e.AssignTeamTxt, 18);
        sparseIntArray.put(z8e.mAutoCompleteTeam, 19);
        sparseIntArray.put(z8e.mATClose, 20);
        sparseIntArray.put(z8e.assignEmployee, 21);
        sparseIntArray.put(z8e.assigneeProfilePic4, 22);
        sparseIntArray.put(z8e.assigneeName4, 23);
        sparseIntArray.put(z8e.assigneeDesignation4, 24);
        sparseIntArray.put(z8e.itemAssigneeSelect4, 25);
        sparseIntArray.put(z8e.AssignCollagueTxt, 26);
        sparseIntArray.put(z8e.mAutoCompleteColleague, 27);
        sparseIntArray.put(z8e.mACClose, 28);
        sparseIntArray.put(z8e.distribute, 29);
        sparseIntArray.put(z8e.assigneeProfilePic5, 30);
        sparseIntArray.put(z8e.assigneeName5, 31);
        sparseIntArray.put(z8e.assigneeDesignation5, 32);
        sparseIntArray.put(z8e.itemAssigneeSelect5, 33);
        sparseIntArray.put(z8e.AssignDistributionTxt, 34);
        sparseIntArray.put(z8e.mAutoCompleteDistribution, 35);
        sparseIntArray.put(z8e.mADClose, 36);
        sparseIntArray.put(z8e.assignOpenTasks, 37);
        sparseIntArray.put(z8e.assignOpenDeals, 38);
        sparseIntArray.put(z8e.assignOpenChats, 39);
        sparseIntArray.put(z8e.transferLead, 40);
        sparseIntArray.put(z8e.buttonCancel, 41);
        sparseIntArray.put(z8e.buttonDone, 42);
    }

    public ymf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 43, g1, h1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.f1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.f1 = 1L;
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
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.f1;
            this.f1 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            wh1.m54389c(this.d1, this.e1, true);
        }
        if (j2 != 0) {
            this.e1 = true;
        }
    }

    public ymf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextInputLayout) objArr[26], (TextInputLayout) objArr[34], (TextInputLayout) objArr[18], (MaterialCardView) objArr[21], (MaterialSwitch) objArr[39], (MaterialSwitch) objArr[38], (MaterialSwitch) objArr[37], (MaterialCardView) objArr[3], (MaterialTextView) objArr[6], (MaterialTextView) objArr[11], (MaterialTextView) objArr[16], (MaterialTextView) objArr[24], (MaterialTextView) objArr[32], (MaterialTextView) objArr[5], (MaterialTextView) objArr[10], (MaterialTextView) objArr[15], (MaterialTextView) objArr[23], (MaterialTextView) objArr[31], (MaterialButton) objArr[4], (MaterialButton) objArr[9], (MaterialButton) objArr[14], (MaterialButton) objArr[22], (MaterialButton) objArr[30], (MaterialButton) objArr[41], (MaterialButton) objArr[42], (MaterialButton) objArr[2], (MaterialCardView) objArr[29], (CheckBox) objArr[7], (CheckBox) objArr[12], (CheckBox) objArr[17], (CheckBox) objArr[25], (CheckBox) objArr[33], (MaterialCardView) objArr[8], (AppCompatImageView) objArr[28], (AppCompatImageView) objArr[36], (AppCompatImageView) objArr[20], (AppCompatAutoCompleteTextView) objArr[27], (AppCompatAutoCompleteTextView) objArr[35], (AppCompatAutoCompleteTextView) objArr[19], (MaterialCardView) objArr[13], (MaterialTextView) objArr[1], (MaterialSwitch) objArr[40]);
        this.f1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.d1 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
