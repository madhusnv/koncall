package p001o;

import ai.salesmax.view.ViewProfileData;
import ai.salesmax.view.ViewProfileDataVer2;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class lmd extends kmd {
    public static final ewi.C13274i F0 = null;
    public static final SparseIntArray G0;
    public final ConstraintLayout D0;
    public long E0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G0 = sparseIntArray;
        sparseIntArray.put(z8e.profileClose, 4);
        sparseIntArray.put(z8e.profileEdit, 5);
        sparseIntArray.put(z8e.changeRegisteredNumber, 6);
        sparseIntArray.put(z8e.changeRegisteredNumberText, 7);
        sparseIntArray.put(z8e.accountName, 8);
        sparseIntArray.put(z8e.mobileNumber, 9);
        sparseIntArray.put(z8e.emailAddress, 10);
        sparseIntArray.put(z8e.accountEmailAddress, 11);
        sparseIntArray.put(z8e.signature, 12);
        sparseIntArray.put(z8e.landingSubTitle, 13);
        sparseIntArray.put(z8e.upgradeActionButton, 14);
    }

    public lmd(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 15, F0, G0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.E0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.E0 = 4L;
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
            k0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((mii) obj);
        }
        return true;
    }

    @Override // p001o.kmd
    public void j0(mii miiVar) {
        this.B0 = miiVar;
        synchronized (this) {
            this.E0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.C0 = ck6Var;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String strM39166p;
        String strM39164n;
        String strM39168r;
        synchronized (this) {
            j = this.E0;
            this.E0 = 0L;
        }
        mii miiVar = this.B0;
        long j2 = j & 6;
        if (j2 == 0 || miiVar == null) {
            strM39166p = null;
            strM39164n = null;
            strM39168r = null;
        } else {
            strM39166p = miiVar.m39166p();
            strM39164n = miiVar.m39164n();
            strM39168r = miiVar.m39168r();
        }
        if (j2 != 0) {
            nr1.f1(this.w0, strM39166p);
            fjh.m26938c(this.x0, strM39164n);
            nr1.K2(this.y0, strM39168r);
        }
    }

    public lmd(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ViewProfileData) objArr[11], (ViewProfileDataVer2) objArr[8], (ConstraintLayout) objArr[6], (MaterialTextView) objArr[7], (ViewProfileData) objArr[10], (MaterialTextView) objArr[13], (ViewProfileData) objArr[9], (ShapeableImageView) objArr[4], (ShapeableImageView) objArr[5], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3], (ShapeableImageView) objArr[1], (ViewProfileData) objArr[12], (MaterialButton) objArr[14]);
        this.E0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D0 = constraintLayout;
        constraintLayout.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        a0(view);
        mo16291G();
    }
}
