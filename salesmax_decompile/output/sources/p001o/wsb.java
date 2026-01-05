package p001o;

import ai.salesmax.model.ProfileView;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class wsb extends vsb {
    public static final ewi.C13274i H0 = null;
    public static final SparseIntArray I0;
    public final ConstraintLayout F0;
    public long G0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(z8e.landing_logo, 4);
        sparseIntArray.put(z8e.landingSubTitle, 5);
        sparseIntArray.put(z8e.navigationPlayBooksAndTemplates, 6);
        sparseIntArray.put(z8e.navigationSettings, 7);
        sparseIntArray.put(z8e.navigationAdmin, 8);
        sparseIntArray.put(z8e.navigationDataSharing, 9);
        sparseIntArray.put(z8e.navigationSupport, 10);
        sparseIntArray.put(z8e.navigationAnalyticsConsole, 11);
        sparseIntArray.put(z8e.navigationLogOut, 12);
        sparseIntArray.put(z8e.navigationChatWithUs, 13);
        sparseIntArray.put(z8e.cardUserProfile, 14);
        sparseIntArray.put(z8e.tvContactViewProfile, 15);
        sparseIntArray.put(z8e.switchUserAccount, 16);
    }

    public wsb(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 17, H0, I0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.G0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G0 = 4L;
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
            i0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            h0((ProfileView) obj);
        }
        return true;
    }

    @Override // p001o.vsb
    public void h0(ProfileView profileView) {
        this.D0 = profileView;
        synchronized (this) {
            this.G0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.E0 = ck6Var;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String fullName;
        String businessLogo;
        String accountName;
        synchronized (this) {
            j = this.G0;
            this.G0 = 0L;
        }
        ProfileView profileView = this.D0;
        long j2 = j & 6;
        if (j2 == 0 || profileView == null) {
            fullName = null;
            businessLogo = null;
            accountName = null;
        } else {
            fullName = profileView.getFullName();
            businessLogo = profileView.getBusinessLogo();
            accountName = profileView.getAccountName();
        }
        if (j2 != 0) {
            nr1.J2(this.o0, businessLogo);
            nr1.f1(this.A0, accountName);
            nr1.f1(this.B0, fullName);
        }
    }

    public wsb(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[14], (ShapeableImageView) objArr[1], (ShapeableImageView) objArr[4], (MaterialTextView) objArr[5], (MaterialButton) objArr[8], (MaterialButton) objArr[11], (MaterialButton) objArr[13], (MaterialButton) objArr[9], (MaterialButton) objArr[12], (MaterialButton) objArr[6], (MaterialButton) objArr[7], (MaterialButton) objArr[10], (MaterialButton) objArr[16], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3], (MaterialTextView) objArr[15]);
        this.G0 = -1L;
        this.o0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F0 = constraintLayout;
        constraintLayout.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        a0(view);
        mo16291G();
    }
}
