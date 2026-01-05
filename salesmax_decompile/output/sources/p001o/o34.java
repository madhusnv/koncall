package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class o34 extends n34 {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0;
    public final ConstraintLayout u0;
    public long v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(z8e.import_image, 1);
        sparseIntArray.put(z8e.import_title, 2);
        sparseIntArray.put(z8e.import_subTitle, 3);
        sparseIntArray.put(z8e.syncWithPhoneContacts, 4);
        sparseIntArray.put(z8e.addSingleContact, 5);
    }

    public o34(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, w0, x0));
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
            this.v0 = 4L;
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
        if (35 == i) {
            h0(((Boolean) obj).booleanValue());
        } else {
            if (87 != i) {
                return false;
            }
            i0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.n34
    public void h0(boolean z) {
        this.t0 = z;
        synchronized (this) {
            this.v0 |= 1;
        }
        m28509h(35);
        super.m25692R();
    }

    @Override // p001o.n34
    public void i0(boolean z) {
        this.s0 = z;
        synchronized (this) {
            this.v0 |= 2;
        }
        m28509h(87);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.v0;
            this.v0 = 0L;
        }
        boolean z = this.t0;
        boolean z2 = this.s0;
        long j2 = j & 7;
        if (j2 != 0 && j2 != 0) {
            j |= z2 ? 64L : 32L;
        }
        long j3 = j & 7;
        int i = 0;
        if (j3 != 0) {
            if (!z2) {
                z = false;
            }
            if (j3 != 0) {
                j |= z ? 16L : 8L;
            }
            if (!z) {
                i = 8;
            }
        }
        if ((j & 7) != 0) {
            this.u0.setVisibility(i);
        }
    }

    public o34(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[5], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[3], (MaterialTextView) objArr[2], (MaterialCardView) objArr[4]);
        this.v0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
