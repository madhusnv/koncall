package p001o;

import ai.salesmax.model.ActiveProfile;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class ot4 extends nt4 {
    public static final ewi.C13274i M0 = null;
    public static final SparseIntArray N0;
    public final ConstraintLayout K0;
    public long L0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N0 = sparseIntArray;
        sparseIntArray.put(z8e.no_account_text, 9);
        sparseIntArray.put(z8e.logOutButton, 10);
        sparseIntArray.put(z8e.switchUserAccount, 11);
        sparseIntArray.put(z8e.switchAccount, 12);
        sparseIntArray.put(z8e.switchUserAccountIcon, 13);
        sparseIntArray.put(z8e.upgrade_text, 14);
        sparseIntArray.put(z8e.upgrade_image, 15);
        sparseIntArray.put(z8e.upgradeActionButton, 16);
        sparseIntArray.put(z8e.extend_free_trial_text, 17);
        sparseIntArray.put(z8e.extend_trial_image, 18);
        sparseIntArray.put(z8e.extendTrialActionButton, 19);
        sparseIntArray.put(z8e.join_worspace_text, 20);
        sparseIntArray.put(z8e.profileList, 21);
    }

    public ot4(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 22, M0, N0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.L0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.L0 = 4L;
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
        if (69 == i) {
            k0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((ActiveProfile) obj);
        }
        return true;
    }

    @Override // p001o.nt4
    public void j0(ActiveProfile activeProfile) {
        this.I0 = activeProfile;
        synchronized (this) {
            this.L0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.nt4
    public void k0(Integer num) {
        this.J0 = num;
        synchronized (this) {
            this.L0 |= 1;
        }
        m28509h(69);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        boolean z;
        String welcomeMessage;
        String welcomeMessageSubHeading;
        synchronized (this) {
            j = this.L0;
            this.L0 = 0L;
        }
        Integer num = this.J0;
        ActiveProfile activeProfile = this.I0;
        long j2 = j & 5;
        String accountProfileUrl = null;
        int i = 0;
        if (j2 != 0) {
            str = num + " Pending Invites";
            z = num != null;
            if (j2 != 0) {
                j = z ? j | 16 : j | 8;
            }
        } else {
            str = null;
            z = false;
        }
        if ((j & 6) == 0 || activeProfile == null) {
            welcomeMessage = null;
            welcomeMessageSubHeading = null;
        } else {
            accountProfileUrl = activeProfile.getAccountProfileUrl();
            welcomeMessageSubHeading = activeProfile.getWelcomeMessageSubHeading();
            welcomeMessage = activeProfile.getWelcomeMessage();
        }
        boolean z2 = (16 & j) != 0 && ewi.m25674U(num) > 0;
        long j3 = j & 5;
        if (j3 != 0) {
            if (!z) {
                z2 = false;
            }
            if (j3 != 0) {
                j |= z2 ? 64L : 32L;
            }
            if (z2) {
                i = 8;
            }
        }
        if ((5 & j) != 0) {
            this.n0.setVisibility(i);
            this.s0.setVisibility(i);
            this.v0.setVisibility(i);
            fjh.m26938c(this.x0, str);
            this.x0.setVisibility(i);
            this.F0.setVisibility(i);
        }
        if ((j & 6) != 0) {
            nr1.J2(this.r0, accountProfileUrl);
            nr1.f1(this.C0, welcomeMessage);
            nr1.f1(this.D0, welcomeMessageSubHeading);
        }
    }

    public ot4(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextView) objArr[5], (TextView) objArr[17], (MaterialButton) objArr[19], (ShapeableImageView) objArr[18], (ShapeableImageView) objArr[1], (ShapeableImageView) objArr[7], (TextView) objArr[20], (ShapeableImageView) objArr[10], (TextView) objArr[6], (TextView) objArr[9], (MaterialButton) objArr[8], (RecyclerView) objArr[21], (ConstraintLayout) objArr[12], (MaterialCardView) objArr[11], (MaterialButton) objArr[13], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3], (MaterialButton) objArr[16], (TextView) objArr[4], (ShapeableImageView) objArr[15], (TextView) objArr[14]);
        this.L0 = -1L;
        this.n0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K0 = constraintLayout;
        constraintLayout.setTag(null);
        this.v0.setTag(null);
        this.x0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.F0.setTag(null);
        a0(view);
        mo16291G();
    }
}
