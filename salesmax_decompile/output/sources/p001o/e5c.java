package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;
import p001o.ewi;

/* loaded from: classes.dex */
public class e5c extends d5c {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0;
    public final ConstraintLayout v0;
    public long w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(z8e.registerCard, 1);
        sparseIntArray.put(z8e.signUpTitle, 2);
        sparseIntArray.put(z8e.changeRegisteredNumberText, 3);
        sparseIntArray.put(z8e.signUp_inputViewGroup, 4);
        sparseIntArray.put(z8e.signUpInputCountryCode, 5);
        sparseIntArray.put(z8e.signUpPhoneNumber, 6);
        sparseIntArray.put(z8e.changeNumberActionButton, 7);
        sparseIntArray.put(z8e.CancelNumberChange, 8);
    }

    public e5c(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 9, x0, y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.w0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.w0 = 1L;
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
        synchronized (this) {
            this.w0 = 0L;
        }
    }

    public e5c(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[8], (MaterialButton) objArr[7], (MaterialTextView) objArr[3], (MaterialCardView) objArr[1], (CountryCodePicker) objArr[5], (LinearLayout) objArr[4], (TextInputEditText) objArr[6], (MaterialTextView) objArr[2]);
        this.w0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.v0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
