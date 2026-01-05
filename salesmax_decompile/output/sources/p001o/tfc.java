package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.chaos.view.PinView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class tfc extends sfc {
    public static final SparseIntArray A0;
    public static final ewi.C13274i z0 = null;
    public final NestedScrollView w0;
    public boolean x0;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(z8e.otp_image, 2);
        sparseIntArray.put(z8e.otp_title, 3);
        sparseIntArray.put(z8e.otp_subTitle, 4);
        sparseIntArray.put(z8e.otp_input_value, 5);
        sparseIntArray.put(z8e.resendOTP, 6);
        sparseIntArray.put(z8e.otp_ActionButton, 7);
        sparseIntArray.put(z8e.changeNumber, 8);
        sparseIntArray.put(z8e.bottomView, 9);
    }

    public tfc(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 10, z0, A0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.y0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.y0 = 1L;
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
            j = this.y0;
            this.y0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            ConstraintLayout constraintLayout = this.q0;
            boolean z = this.x0;
            wh1.m54388b(constraintLayout, false, z, false, z, false, true, false, true);
        }
        if (j2 != 0) {
            this.x0 = true;
        }
    }

    public tfc(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (View) objArr[9], (MaterialButton) objArr[8], (MaterialButton) objArr[7], (ConstraintLayout) objArr[1], (ShapeableImageView) objArr[2], (PinView) objArr[5], (MaterialTextView) objArr[4], (MaterialTextView) objArr[3], (MaterialTextView) objArr[6]);
        this.y0 = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.w0 = nestedScrollView;
        nestedScrollView.setTag(null);
        this.q0.setTag(null);
        a0(view);
        mo16291G();
    }
}
