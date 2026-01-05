package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class jg7 extends ig7 {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0;
    public final CoordinatorLayout u0;
    public boolean v0;
    public long w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(z8e.constraintLayout, 1);
        sparseIntArray.put(z8e.searchDashboardAppBar, 2);
        sparseIntArray.put(z8e.searchGlobalEditTextLayout, 3);
        sparseIntArray.put(z8e.mAutoComplete, 4);
        sparseIntArray.put(z8e.actionBack, 5);
    }

    public jg7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, x0, y0));
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
            this.w0 = 4L;
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
        if (87 == i) {
            i0(((Boolean) obj).booleanValue());
        } else {
            if (79 != i) {
                return false;
            }
            h0((String) obj);
        }
        return true;
    }

    public void h0(String str) {
        this.s0 = str;
    }

    public void i0(boolean z) {
        this.t0 = z;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        long j2 = j & 4;
        if (j2 != 0) {
            wh1.m54388b(this.u0, false, this.v0, false, false, false, true, false, false);
        }
        if (j2 != 0) {
            this.v0 = true;
        }
    }

    public jg7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[5], (ConstraintLayout) objArr[1], (AppCompatAutoCompleteTextView) objArr[4], (LinearLayout) objArr[2], (TextInputLayout) objArr[3]);
        this.w0 = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.u0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
