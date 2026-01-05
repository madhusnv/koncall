package p001o;

import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class rw8 extends qw8 {
    public static final ewi.C13274i v0 = null;
    public static final SparseIntArray w0;
    public final MaterialCardView t0;
    public long u0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        w0 = sparseIntArray;
        sparseIntArray.put(z8e.bulkUploadNameLayout, 1);
        sparseIntArray.put(z8e.bulkUploadName, 2);
        sparseIntArray.put(z8e.bulkUploadSourceLayout, 3);
        sparseIntArray.put(z8e.bulkUploadSource, 4);
    }

    public rw8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, v0, w0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.u0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.u0 = 4L;
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
        if (33 == i) {
            h0((ck6) obj);
        } else {
            if (73 != i) {
                return false;
            }
            i0((Integer) obj);
        }
        return true;
    }

    public void h0(ck6 ck6Var) {
        this.s0 = ck6Var;
    }

    public void i0(Integer num) {
        this.r0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.u0 = 0L;
        }
    }

    public rw8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextInputEditText) objArr[2], (TextInputLayout) objArr[1], (TextInputEditText) objArr[4], (TextInputLayout) objArr[3]);
        this.u0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.t0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        mo16291G();
    }
}
