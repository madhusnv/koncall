package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class tr5 extends sr5 {
    public static final ewi.C13274i t0 = null;
    public static final SparseIntArray u0;
    public long s0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        u0 = sparseIntArray;
        sparseIntArray.put(z8e.channelNameText, 1);
        sparseIntArray.put(z8e.channelName, 2);
        sparseIntArray.put(z8e.buttonCancel, 3);
        sparseIntArray.put(z8e.buttonDone, 4);
    }

    public tr5(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, t0, u0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.s0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.s0 = 1L;
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
            this.s0 = 0L;
        }
    }

    public tr5(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[3], (MaterialButton) objArr[4], (AppCompatAutoCompleteTextView) objArr[2], (TextInputLayout) objArr[1], (ConstraintLayout) objArr[0]);
        this.s0 = -1L;
        this.r0.setTag(null);
        a0(view);
        mo16291G();
    }
}
