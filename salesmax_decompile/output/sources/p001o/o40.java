package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class o40 extends n40 {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0;
    public final ConstraintLayout u0;
    public long v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(z8e.backButton, 1);
        sparseIntArray.put(z8e.taskSearchLocationTitle, 2);
        sparseIntArray.put(z8e.taskLocationSearch, 3);
        sparseIntArray.put(z8e.taskLocationSearchField, 4);
        sparseIntArray.put(z8e.taskLocationSearchEditText, 5);
        sparseIntArray.put(z8e.mCurrentLocation, 6);
        sparseIntArray.put(z8e.taskLocationList, 7);
    }

    public o40(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, w0, x0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.v0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.v0 = 1L;
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
            this.v0 = 0L;
        }
    }

    public o40(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[1], (AppCompatImageView) objArr[6], (RecyclerView) objArr[7], (LinearLayoutCompat) objArr[3], (TextInputEditText) objArr[5], (TextInputLayout) objArr[4], (MaterialTextView) objArr[2]);
        this.v0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
