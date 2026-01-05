package p001o;

import ai.salesmax.model.BusinessInfo;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class vw8 extends uw8 {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.ivContactProfilePic, 2);
        sparseIntArray.put(z8e.tvBusinessDescription, 3);
    }

    public vw8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, u0, v0));
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
            this.t0 = 4L;
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
        if (67 == i) {
            j0((BusinessInfo) obj);
        } else {
            if (73 != i) {
                return false;
            }
            k0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.uw8
    public void j0(BusinessInfo businessInfo) {
        this.r0 = businessInfo;
        synchronized (this) {
            this.t0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.uw8
    public void k0(Integer num) {
        this.s0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.t0;
            this.t0 = 0L;
        }
        BusinessInfo businessInfo = this.r0;
        long j2 = j & 5;
        String name = (j2 == 0 || businessInfo == null) ? null : businessInfo.getName();
        if (j2 != 0) {
            nr1.f1(this.n0, name);
        }
    }

    public vw8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[1], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[2], (MaterialTextView) objArr[3]);
        this.t0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        a0(view);
        mo16291G();
    }
}
