package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
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
public class dof extends cof {
    public static final ewi.C13274i G0 = null;
    public static final SparseIntArray H0;
    public final ConstraintLayout D0;
    public boolean E0;
    public long F0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H0 = sparseIntArray;
        sparseIntArray.put(z8e.loginCard, 1);
        sparseIntArray.put(z8e.tvUserStatusTitle, 2);
        sparseIntArray.put(z8e.userStatusClose, 3);
        sparseIntArray.put(z8e.addUserAlternate, 4);
        sparseIntArray.put(z8e.inviteeImport, 5);
        sparseIntArray.put(z8e.tvImportUserTitle, 6);
        sparseIntArray.put(z8e.singIn_inputViewGroup, 7);
        sparseIntArray.put(z8e.ccp, 8);
        sparseIntArray.put(z8e.phoneNumber, 9);
        sparseIntArray.put(z8e.inviteNameHint, 10);
        sparseIntArray.put(z8e.inviteName, 11);
        sparseIntArray.put(z8e.inviteEmailHint, 12);
        sparseIntArray.put(z8e.inviteEmail, 13);
        sparseIntArray.put(z8e.memberAuth, 14);
        sparseIntArray.put(z8e.authTypeSpinner, 15);
        sparseIntArray.put(z8e.singInActionButton, 16);
    }

    public dof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 17, G0, H0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.F0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.F0 = 1L;
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
            j = this.F0;
            this.F0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            wh1.m54389c(this.D0, this.E0, true);
        }
        if (j2 != 0) {
            this.E0 = true;
        }
    }

    public dof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (LinearLayout) objArr[4], (AutoCompleteTextView) objArr[15], (CountryCodePicker) objArr[8], (TextInputEditText) objArr[13], (TextInputLayout) objArr[12], (TextInputEditText) objArr[11], (TextInputLayout) objArr[10], (MaterialButton) objArr[5], (MaterialCardView) objArr[1], (TextInputLayout) objArr[14], (TextInputEditText) objArr[9], (MaterialButton) objArr[16], (LinearLayout) objArr[7], (MaterialTextView) objArr[6], (MaterialTextView) objArr[2], (ShapeableImageView) objArr[3]);
        this.F0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
