package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class onf extends nnf {
    public static final ewi.C13274i Q0 = null;
    public static final SparseIntArray R0;
    public final ConstraintLayout M0;
    public final ConstraintLayout N0;
    public boolean O0;
    public long P0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R0 = sparseIntArray;
        sparseIntArray.put(z8e.loginCard, 2);
        sparseIntArray.put(z8e.tvUserStatusTitle, 3);
        sparseIntArray.put(z8e.userStatusClose, 4);
        sparseIntArray.put(z8e.bookOnboardingCall, 5);
        sparseIntArray.put(z8e.bookOnboardingCallText, 6);
        sparseIntArray.put(z8e.bookOnboardingCallButton, 7);
        sparseIntArray.put(z8e.addLeadProfilePic, 8);
        sparseIntArray.put(z8e.inviteNameHint, 9);
        sparseIntArray.put(z8e.inviteName, 10);
        sparseIntArray.put(z8e.inviteEmailHint, 11);
        sparseIntArray.put(z8e.inviteEmail, 12);
        sparseIntArray.put(z8e.linkPrimaryNumber, 13);
        sparseIntArray.put(z8e.linkSecondaryNumber, 14);
        sparseIntArray.put(z8e.selectIndustryHeading, 15);
        sparseIntArray.put(z8e.chipIndustryGroup, 16);
        sparseIntArray.put(z8e.tvIndustryEducation, 17);
        sparseIntArray.put(z8e.tvIndustryInstallation, 18);
        sparseIntArray.put(z8e.tvIndustryLoan, 19);
        sparseIntArray.put(z8e.tvIndustryLegal, 20);
        sparseIntArray.put(z8e.tvIndustryRealEstate, 21);
        sparseIntArray.put(z8e.tvIndustrySolar, 22);
        sparseIntArray.put(z8e.tvIndustryTravel, 23);
        sparseIntArray.put(z8e.tvIndustryGeneric, 24);
        sparseIntArray.put(z8e.createAccountButton, 25);
    }

    public onf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 26, Q0, R0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.P0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.P0 = 2L;
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
        if (51 != i) {
            return false;
        }
        j0((String) obj);
        return true;
    }

    public void j0(String str) {
        this.L0 = str;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.P0;
            this.P0 = 0L;
        }
        long j2 = j & 2;
        if (j2 != 0) {
            wh1.m54389c(this.N0, this.O0, true);
        }
        if (j2 != 0) {
            this.O0 = true;
        }
    }

    public onf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[8], (ConstraintLayout) objArr[5], (MaterialButton) objArr[7], (MaterialTextView) objArr[6], (ChipGroup) objArr[16], (MaterialButton) objArr[25], (TextInputEditText) objArr[12], (TextInputLayout) objArr[11], (TextInputEditText) objArr[10], (TextInputLayout) objArr[9], (MaterialSwitch) objArr[13], (MaterialSwitch) objArr[14], (MaterialCardView) objArr[2], (MaterialTextView) objArr[15], (Chip) objArr[17], (Chip) objArr[24], (Chip) objArr[18], (Chip) objArr[20], (Chip) objArr[19], (Chip) objArr[21], (Chip) objArr[22], (Chip) objArr[23], (MaterialTextView) objArr[3], (ShapeableImageView) objArr[4]);
        this.P0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.N0 = constraintLayout2;
        constraintLayout2.setTag(null);
        a0(view);
        mo16291G();
    }
}
