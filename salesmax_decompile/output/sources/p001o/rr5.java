package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class rr5 extends qr5 {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.manualCloseReasonText, 1);
        sparseIntArray.put(z8e.manualCloseReason, 2);
        sparseIntArray.put(z8e.alreadyCustomerCheckbox, 3);
        sparseIntArray.put(z8e.buttonCancel, 4);
        sparseIntArray.put(z8e.buttonDone, 5);
    }

    public rr5(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, u0, v0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.t0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.t0 = 1L;
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
            this.t0 = 0L;
        }
    }

    public rr5(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCheckBox) objArr[3], (MaterialButton) objArr[4], (MaterialButton) objArr[5], (TextInputEditText) objArr[2], (TextInputLayout) objArr[1], (ConstraintLayout) objArr[0]);
        this.t0 = -1L;
        this.s0.setTag(null);
        a0(view);
        mo16291G();
    }
}
