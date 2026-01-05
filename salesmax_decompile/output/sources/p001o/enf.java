package p001o;

import ai.salesmax.model.ActiveProfile;
import ai.salesmax.model.ActiveProfilePermissionIssues;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class enf extends dnf {
    public static final ewi.C13274i J0 = null;
    public static final SparseIntArray K0;
    public final ConstraintLayout F0;
    public final ConstraintLayout G0;
    public boolean H0;
    public long I0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K0 = sparseIntArray;
        sparseIntArray.put(z8e.loginCard, 5);
        sparseIntArray.put(z8e.tvUserStatusTitle, 6);
        sparseIntArray.put(z8e.userStatusClose, 7);
        sparseIntArray.put(z8e.issueScreenPopIcon, 8);
        sparseIntArray.put(z8e.issueScreenPopText, 9);
        sparseIntArray.put(z8e.issueScreenPopResolution, 10);
        sparseIntArray.put(z8e.issueSaveCallLogIcon, 11);
        sparseIntArray.put(z8e.issueSaveCallLogText, 12);
        sparseIntArray.put(z8e.issueSaveCallLogResolution, 13);
        sparseIntArray.put(z8e.issuePostCallOutcomeIcon, 14);
        sparseIntArray.put(z8e.issuePostCallOutcomeText, 15);
        sparseIntArray.put(z8e.issuePostCallOutcomeResolution, 16);
        sparseIntArray.put(z8e.goToPreferences, 17);
    }

    public enf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 18, J0, K0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.I0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.I0 = 8L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((t7c) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (51 == i) {
            l0((String) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((ActiveProfile) obj);
        }
        return true;
    }

    @Override // p001o.dnf
    public void j0(ActiveProfile activeProfile) {
        this.E0 = activeProfile;
        synchronized (this) {
            this.I0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public final boolean k0(t7c t7cVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.I0 |= 1;
        }
        return true;
    }

    public void l0(String str) {
        this.D0 = str;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        boolean hasSaveCallLogPermissionIssue;
        boolean hasPostCallLogAppPermissionIssue;
        boolean hasDrawOverAppPermissionIssue;
        synchronized (this) {
            j = this.I0;
            this.I0 = 0L;
        }
        ActiveProfile activeProfile = this.E0;
        long j2 = j & 13;
        int i3 = 0;
        if (j2 != 0) {
            t7c permissionIssues = activeProfile != null ? activeProfile.getPermissionIssues() : null;
            g0(0, permissionIssues);
            ActiveProfilePermissionIssues activeProfilePermissionIssues = permissionIssues != null ? (ActiveProfilePermissionIssues) permissionIssues.get() : null;
            if (activeProfilePermissionIssues != null) {
                hasSaveCallLogPermissionIssue = activeProfilePermissionIssues.getHasSaveCallLogPermissionIssue();
                hasDrawOverAppPermissionIssue = activeProfilePermissionIssues.getHasDrawOverAppPermissionIssue();
                hasPostCallLogAppPermissionIssue = activeProfilePermissionIssues.getHasPostCallLogAppPermissionIssue();
            } else {
                hasSaveCallLogPermissionIssue = false;
                hasPostCallLogAppPermissionIssue = false;
                hasDrawOverAppPermissionIssue = false;
            }
            if (j2 != 0) {
                j |= hasSaveCallLogPermissionIssue ? 512L : 256L;
            }
            if ((j & 13) != 0) {
                j |= hasDrawOverAppPermissionIssue ? 128L : 64L;
            }
            if ((j & 13) != 0) {
                j |= hasPostCallLogAppPermissionIssue ? 32L : 16L;
            }
            i = hasSaveCallLogPermissionIssue ? 0 : 8;
            i2 = hasDrawOverAppPermissionIssue ? 0 : 8;
            if (!hasPostCallLogAppPermissionIssue) {
                i3 = 8;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        if ((13 & j) != 0) {
            this.o0.setVisibility(i3);
            this.s0.setVisibility(i);
            this.w0.setVisibility(i2);
        }
        long j3 = j & 8;
        if (j3 != 0) {
            wh1.m54389c(this.G0, this.H0, true);
        }
        if (j3 != 0) {
            this.H0 = true;
        }
    }

    public enf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (MaterialButton) objArr[17], (MaterialCardView) objArr[4], (MaterialButton) objArr[14], (MaterialTextView) objArr[16], (MaterialTextView) objArr[15], (MaterialCardView) objArr[3], (MaterialButton) objArr[11], (MaterialTextView) objArr[13], (MaterialTextView) objArr[12], (MaterialCardView) objArr[2], (MaterialButton) objArr[8], (MaterialTextView) objArr[10], (MaterialTextView) objArr[9], (MaterialCardView) objArr[5], (MaterialTextView) objArr[6], (ShapeableImageView) objArr[7]);
        this.I0 = -1L;
        this.o0.setTag(null);
        this.s0.setTag(null);
        this.w0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.G0 = constraintLayout2;
        constraintLayout2.setTag(null);
        a0(view);
        mo16291G();
    }
}
