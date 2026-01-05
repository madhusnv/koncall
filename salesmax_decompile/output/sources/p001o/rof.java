package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;
import p001o.ewi;

/* loaded from: classes.dex */
public class rof extends qof {
    public static final ewi.C13274i L0 = null;
    public static final SparseIntArray M0;
    public final ConstraintLayout I0;
    public boolean J0;
    public long K0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M0 = sparseIntArray;
        sparseIntArray.put(z8e.loginCard, 1);
        sparseIntArray.put(z8e.tvUserStatusTitle, 2);
        sparseIntArray.put(z8e.userStatusClose, 3);
        sparseIntArray.put(z8e.inviteNameHint, 4);
        sparseIntArray.put(z8e.inviteName, 5);
        sparseIntArray.put(z8e.addLeadSourceSearch, 6);
        sparseIntArray.put(z8e.addLeadSourceLayout, 7);
        sparseIntArray.put(z8e.addLeadSource, 8);
        sparseIntArray.put(z8e.mLeadSourceClose, 9);
        sparseIntArray.put(z8e.addLeadCompanySearch, 10);
        sparseIntArray.put(z8e.addLeadCompanyLayout, 11);
        sparseIntArray.put(z8e.addLeadCompany, 12);
        sparseIntArray.put(z8e.mClose, 13);
        sparseIntArray.put(z8e.addLeadCompanyWebsiteHint, 14);
        sparseIntArray.put(z8e.addLeadCompanyWebsite, 15);
        sparseIntArray.put(z8e.leadOfficialEmailLayout, 16);
        sparseIntArray.put(z8e.leadOfficialEmail, 17);
        sparseIntArray.put(z8e.leadAlternateNumber, 18);
        sparseIntArray.put(z8e.ccp, 19);
        sparseIntArray.put(z8e.phoneNumber, 20);
        sparseIntArray.put(z8e.updateLeadButton, 21);
    }

    public rof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 22, L0, M0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.K0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.K0 = 1L;
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
            j = this.K0;
            this.K0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            wh1.m54389c(this.I0, this.J0, true);
        }
        if (j2 != 0) {
            this.J0 = true;
        }
    }

    public rof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppCompatAutoCompleteTextView) objArr[12], (TextInputLayout) objArr[11], (ConstraintLayout) objArr[10], (TextInputEditText) objArr[15], (TextInputLayout) objArr[14], (AppCompatAutoCompleteTextView) objArr[8], (TextInputLayout) objArr[7], (ConstraintLayout) objArr[6], (CountryCodePicker) objArr[19], (TextInputEditText) objArr[5], (TextInputLayout) objArr[4], (LinearLayout) objArr[18], (TextInputEditText) objArr[17], (TextInputLayout) objArr[16], (MaterialCardView) objArr[1], (AppCompatImageView) objArr[13], (AppCompatImageView) objArr[9], (TextInputEditText) objArr[20], (MaterialTextView) objArr[2], (MaterialButton) objArr[21], (ShapeableImageView) objArr[3]);
        this.K0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
