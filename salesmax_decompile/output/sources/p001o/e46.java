package p001o;

import ai.salesmax.view.ViewAddLead;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;
import p001o.ewi;

/* loaded from: classes.dex */
public class e46 extends d46 {
    public static final ewi.C13274i R0 = null;
    public static final SparseIntArray S0;
    public final ConstraintLayout O0;
    public boolean P0;
    public long Q0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S0 = sparseIntArray;
        sparseIntArray.put(z8e.fragmentToolbar, 2);
        sparseIntArray.put(z8e.actionBack, 3);
        sparseIntArray.put(z8e.leadTitle, 4);
        sparseIntArray.put(z8e.changeRegisteredNumber, 5);
        sparseIntArray.put(z8e.changeRegisteredNumberText, 6);
        sparseIntArray.put(z8e.changeProfilePicText, 7);
        sparseIntArray.put(z8e.profileNameLayout, 8);
        sparseIntArray.put(z8e.profileName, 9);
        sparseIntArray.put(z8e.profileAccountName, 10);
        sparseIntArray.put(z8e.MobileNo, 11);
        sparseIntArray.put(z8e.ccp, 12);
        sparseIntArray.put(z8e.profileMobileNo, 13);
        sparseIntArray.put(z8e.profileEmailHint, 14);
        sparseIntArray.put(z8e.profileEmail, 15);
        sparseIntArray.put(z8e.accountEmailHint, 16);
        sparseIntArray.put(z8e.accountEmail, 17);
        sparseIntArray.put(z8e.AlterMobileNo, 18);
        sparseIntArray.put(z8e.ccpAlterr, 19);
        sparseIntArray.put(z8e.phoneNumberAlter, 20);
        sparseIntArray.put(z8e.userSignatureLayout, 21);
        sparseIntArray.put(z8e.userSignature, 22);
        sparseIntArray.put(z8e.connectToGoogleWorkspaceLayout, 23);
        sparseIntArray.put(z8e.connectToGoogleWorkspaceText, 24);
        sparseIntArray.put(z8e.actionConnectToGoogleWorkspaceButton, 25);
        sparseIntArray.put(z8e.actionButton, 26);
    }

    public e46(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 27, R0, S0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.Q0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.Q0 = 2L;
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
        k0((mii) obj);
        return true;
    }

    @Override // p001o.d46
    public void k0(mii miiVar) {
        this.N0 = miiVar;
        synchronized (this) {
            this.Q0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.Q0;
            this.Q0 = 0L;
        }
        mii miiVar = this.N0;
        long j2 = 3 & j;
        String strM39168r = (j2 == 0 || miiVar == null) ? null : miiVar.m39168r();
        if (j2 != 0) {
            nr1.K2(this.u0, strM39168r);
        }
        long j3 = j & 2;
        if (j3 != 0) {
            ConstraintLayout constraintLayout = this.O0;
            boolean z = this.P0;
            wh1.m54388b(constraintLayout, false, z, false, z, false, true, false, true);
        }
        if (j3 != 0) {
            this.P0 = true;
        }
    }

    public e46(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (LinearLayout) objArr[18], (LinearLayout) objArr[11], (TextInputEditText) objArr[17], (TextInputLayout) objArr[16], (ShapeableImageView) objArr[3], (MaterialButton) objArr[26], (MaterialButton) objArr[25], (ShapeableImageView) objArr[1], (CountryCodePicker) objArr[12], (CountryCodePicker) objArr[19], (MaterialTextView) objArr[7], (ConstraintLayout) objArr[5], (MaterialTextView) objArr[6], (LinearLayout) objArr[23], (TextView) objArr[24], (ConstraintLayout) objArr[2], (MaterialTextView) objArr[4], (TextInputEditText) objArr[20], (ViewAddLead) objArr[10], (TextInputEditText) objArr[15], (TextInputLayout) objArr[14], (TextInputEditText) objArr[13], (TextInputEditText) objArr[9], (TextInputLayout) objArr[8], (TextInputEditText) objArr[22], (TextInputLayout) objArr[21]);
        this.Q0 = -1L;
        this.u0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
