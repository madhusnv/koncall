package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chaos.view.PinView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class vfc extends ufc {
    public static final ewi.C13274i A0 = null;
    public static final SparseIntArray B0;
    public final ConstraintLayout x0;
    public boolean y0;
    public long z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B0 = sparseIntArray;
        sparseIntArray.put(z8e.registerCard, 2);
        sparseIntArray.put(z8e.otp_image, 3);
        sparseIntArray.put(z8e.otp_title, 4);
        sparseIntArray.put(z8e.otp_subTitle, 5);
        sparseIntArray.put(z8e.otp_input_value, 6);
        sparseIntArray.put(z8e.resendOTP, 7);
        sparseIntArray.put(z8e.otp_ActionButton, 8);
        sparseIntArray.put(z8e.changeNumber, 9);
        sparseIntArray.put(z8e.bottomView, 10);
    }

    public vfc(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 11, A0, B0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.z0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.z0 = 1L;
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
            j = this.z0;
            this.z0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            wh1.m54388b(this.x0, false, false, false, this.y0, false, false, false, true);
            ConstraintLayout constraintLayout = this.q0;
            boolean z = this.y0;
            wh1.m54388b(constraintLayout, false, z, false, z, false, true, false, true);
        }
        if (j2 != 0) {
            this.y0 = true;
        }
    }

    public vfc(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (View) objArr[10], (MaterialButton) objArr[9], (MaterialButton) objArr[8], (ConstraintLayout) objArr[1], (ShapeableImageView) objArr[3], (PinView) objArr[6], (MaterialTextView) objArr[5], (MaterialTextView) objArr[4], (MaterialCardView) objArr[2], (MaterialTextView) objArr[7]);
        this.z0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.x0 = constraintLayout;
        constraintLayout.setTag(null);
        this.q0.setTag(null);
        a0(view);
        mo16291G();
    }
}
