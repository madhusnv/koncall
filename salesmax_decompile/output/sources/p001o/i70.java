package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class i70 extends h70 {
    public static final ewi.C13274i E0 = null;
    public static final SparseIntArray F0;
    public final NestedScrollView A0;
    public final ConstraintLayout B0;
    public boolean C0;
    public long D0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(z8e.settingsToolbar, 3);
        sparseIntArray.put(z8e.settingsBack, 4);
        sparseIntArray.put(z8e.devicePin, 5);
        sparseIntArray.put(z8e.userAndTeamManagement, 6);
        sparseIntArray.put(z8e.userAndTeamManagementMessage, 7);
        sparseIntArray.put(z8e.productsServices, 8);
        sparseIntArray.put(z8e.accountDefaults, 9);
        sparseIntArray.put(z8e.integrations, 10);
        sparseIntArray.put(z8e.customizations, 11);
        sparseIntArray.put(z8e.customizationsMessage, 12);
        sparseIntArray.put(z8e.enableAttendanceMessage, 13);
    }

    public i70(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 14, E0, F0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.D0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.D0 = 2L;
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
        if (6 != i) {
            return false;
        }
        j0(((Boolean) obj).booleanValue());
        return true;
    }

    public void j0(boolean z) {
        this.z0 = z;
        synchronized (this) {
            this.D0 |= 1;
        }
        m28509h(6);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.D0;
            this.D0 = 0L;
        }
        boolean z = this.z0;
        if ((3 & j) != 0) {
            np3.m40895a(this.r0, z);
        }
        long j2 = j & 2;
        if (j2 != 0) {
            ConstraintLayout constraintLayout = this.B0;
            boolean z2 = this.C0;
            wh1.m54388b(constraintLayout, z2, z2, z2, z2, true, true, true, true);
        }
        if (j2 != 0) {
            this.C0 = true;
        }
    }

    public i70(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[9], (MaterialButton) objArr[11], (MaterialTextView) objArr[12], (MaterialButton) objArr[5], (MaterialSwitch) objArr[2], (MaterialTextView) objArr[13], (MaterialButton) objArr[10], (MaterialButton) objArr[8], (ShapeableImageView) objArr[4], (MaterialCardView) objArr[3], (MaterialButton) objArr[6], (MaterialTextView) objArr[7]);
        this.D0 = -1L;
        this.r0.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.A0 = nestedScrollView;
        nestedScrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.B0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
