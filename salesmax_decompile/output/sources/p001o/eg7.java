package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class eg7 extends dg7 {
    public static final SparseIntArray A0;
    public static final ewi.C13274i z0 = null;
    public final ConstraintLayout x0;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(z8e.viewFinder, 1);
        sparseIntArray.put(z8e.capturedImageView, 2);
        sparseIntArray.put(z8e.goBack, 3);
        sparseIntArray.put(z8e.flipCameraButton, 4);
        sparseIntArray.put(z8e.attendanceSuccessFul, 5);
        sparseIntArray.put(z8e.attendanceUnSuccessFul, 6);
        sparseIntArray.put(z8e.noProfilePic, 7);
        sparseIntArray.put(z8e.noProfilePicText, 8);
        sparseIntArray.put(z8e.image_capture_button, 9);
        sparseIntArray.put(z8e.progressbar, 10);
    }

    public eg7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 11, z0, A0));
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
        synchronized (this) {
            this.y0 = 0L;
        }
    }

    public eg7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[5], (ShapeableImageView) objArr[6], (ImageView) objArr[2], (ShapeableImageView) objArr[4], (ShapeableImageView) objArr[3], (MaterialButton) objArr[9], (MaterialCardView) objArr[7], (MaterialTextView) objArr[8], (LinearProgressIndicator) objArr[10], (PreviewView) objArr[1]);
        this.y0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.x0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
