package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;
import p001o.ewi;

/* loaded from: classes.dex */
public class mg9 extends lg9 {
    public static final ewi.C13274i X0 = null;
    public static final SparseIntArray Y0;
    public final ConstraintLayout S0;
    public final ConstraintLayout T0;
    public final ConstraintLayout U0;
    public boolean V0;
    public long W0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y0 = sparseIntArray;
        sparseIntArray.put(z8e.landing_logo, 4);
        sparseIntArray.put(z8e.landingSubTitle, 5);
        sparseIntArray.put(z8e.backgroundCircle, 6);
        sparseIntArray.put(z8e.loginCard, 7);
        sparseIntArray.put(z8e.signInWelcomeBackTitle, 8);
        sparseIntArray.put(z8e.tvSigninAlternateNumber, 9);
        sparseIntArray.put(z8e.signBackInBottomHint, 10);
        sparseIntArray.put(z8e.signInTitle, 11);
        sparseIntArray.put(z8e.singIn_inputViewGroup, 12);
        sparseIntArray.put(z8e.ccp, 13);
        sparseIntArray.put(z8e.phoneNumber, 14);
        sparseIntArray.put(z8e.singInActionButton, 15);
        sparseIntArray.put(z8e.tvSignUpFromSignIn, 16);
        sparseIntArray.put(z8e.signInBottomHint, 17);
        sparseIntArray.put(z8e.registerCard, 18);
        sparseIntArray.put(z8e.signUpTitle, 19);
        sparseIntArray.put(z8e.signUpSubTitle, 20);
        sparseIntArray.put(z8e.signUp_Email_layout, 21);
        sparseIntArray.put(z8e.signUp_Name, 22);
        sparseIntArray.put(z8e.signUp_inputViewGroup, 23);
        sparseIntArray.put(z8e.signUpInputCountryCode, 24);
        sparseIntArray.put(z8e.signUpPhoneNumber, 25);
        sparseIntArray.put(z8e.signUp_Email_hint, 26);
        sparseIntArray.put(z8e.signUp_Email, 27);
        sparseIntArray.put(z8e.singUpActionButton, 28);
        sparseIntArray.put(z8e.tvSignInFromSignUp, 29);
        sparseIntArray.put(z8e.signUpAlternateNumberHint, 30);
        sparseIntArray.put(z8e.signUpBottomHint, 31);
        sparseIntArray.put(z8e.loadingView, 32);
    }

    public mg9(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 33, X0, Y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.W0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.W0 = 2L;
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
        if (60 != i) {
            return false;
        }
        k0((String) obj);
        return true;
    }

    @Override // p001o.lg9
    public void k0(String str) {
        this.R0 = str;
        synchronized (this) {
            this.W0 |= 1;
        }
        m28509h(60);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        boolean z;
        int i;
        long j2;
        long j3;
        synchronized (this) {
            j = this.W0;
            this.W0 = 0L;
        }
        String str = this.R0;
        long j4 = j & 3;
        int i2 = 0;
        if (j4 != 0) {
            z = str != null;
            if (j4 != 0) {
                j = z ? j | 32 : j | 16;
            }
        } else {
            z = false;
        }
        boolean z2 = ((j & 32) == 0 || str == "") ? false : true;
        long j5 = j & 3;
        if (j5 != 0) {
            if (!z) {
                z2 = false;
            }
            if (j5 != 0) {
                if (z2) {
                    j2 = j | 8;
                    j3 = 128;
                } else {
                    j2 = j | 4;
                    j3 = 64;
                }
                j = j2 | j3;
            }
            i = z2 ? 8 : 0;
            if (!z2) {
                i2 = 8;
            }
        } else {
            i = 0;
        }
        long j6 = 2 & j;
        if (j6 != 0) {
            wh1.m54388b(this.S0, false, false, false, this.V0, false, false, false, true);
        }
        if ((j & 3) != 0) {
            this.T0.setVisibility(i2);
            this.U0.setVisibility(i);
            nr1.m40955Z(this.L0, str);
        }
        if (j6 != 0) {
            this.V0 = true;
        }
    }

    public mg9(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[6], (CountryCodePicker) objArr[13], (ShapeableImageView) objArr[4], (MaterialTextView) objArr[5], (LottieAnimationView) objArr[32], (MaterialCardView) objArr[7], (TextInputEditText) objArr[14], (MaterialCardView) objArr[18], (MaterialTextView) objArr[10], (MaterialTextView) objArr[17], (MaterialTextView) objArr[11], (MaterialTextView) objArr[8], (MaterialTextView) objArr[30], (MaterialTextView) objArr[31], (TextInputEditText) objArr[27], (TextInputLayout) objArr[26], (TextInputLayout) objArr[21], (CountryCodePicker) objArr[24], (LinearLayout) objArr[23], (TextInputEditText) objArr[22], (TextInputEditText) objArr[25], (MaterialTextView) objArr[20], (MaterialTextView) objArr[19], (MaterialButton) objArr[15], (MaterialButton) objArr[2], (LinearLayout) objArr[12], (MaterialButton) objArr[28], (MaterialTextView) objArr[29], (MaterialTextView) objArr[16], (MaterialTextView) objArr[9]);
        this.W0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.S0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.T0 = constraintLayout2;
        constraintLayout2.setTag(null);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[3];
        this.U0 = constraintLayout3;
        constraintLayout3.setTag(null);
        this.L0.setTag(null);
        a0(view);
        mo16291G();
    }
}
