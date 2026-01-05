package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class fcf extends ecf {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public final MaterialCardView s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.backButton, 1);
        sparseIntArray.put(z8e.selectTimezoneTitle, 2);
        sparseIntArray.put(z8e.taskAssignSearchField, 3);
        sparseIntArray.put(z8e.taskAssignSearchEditText, 4);
        sparseIntArray.put(z8e.timezoneList, 5);
    }

    public fcf(yt4 yt4Var, View view) {
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

    public fcf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[1], (MaterialTextView) objArr[2], (TextInputEditText) objArr[4], (TextInputLayout) objArr[3], (RecyclerView) objArr[5]);
        this.t0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.s0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        mo16291G();
    }
}
