package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class mdf extends ldf {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public final NestedScrollView v0;
    public boolean w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.sendEmailOtpBack, 2);
        sparseIntArray.put(z8e.otp_image, 3);
        sparseIntArray.put(z8e.otp_title, 4);
        sparseIntArray.put(z8e.otp_subTitle, 5);
        sparseIntArray.put(z8e.modifyEmail, 6);
        sparseIntArray.put(z8e.otp_ActionButton, 7);
        sparseIntArray.put(z8e.otp_already, 8);
    }

    public mdf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 9, y0, z0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.x0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.x0 = 1L;
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
            j = this.x0;
            this.x0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            ConstraintLayout constraintLayout = this.q0;
            boolean z = this.w0;
            wh1.m54388b(constraintLayout, false, z, false, z, false, true, false, true);
        }
        if (j2 != 0) {
            this.w0 = true;
        }
    }

    public mdf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[6], (MaterialButton) objArr[7], (MaterialTextView) objArr[8], (ConstraintLayout) objArr[1], (ShapeableImageView) objArr[3], (MaterialTextView) objArr[5], (MaterialTextView) objArr[4], (ShapeableImageView) objArr[2]);
        this.x0 = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.v0 = nestedScrollView;
        nestedScrollView.setTag(null);
        this.q0.setTag(null);
        a0(view);
        mo16291G();
    }
}
