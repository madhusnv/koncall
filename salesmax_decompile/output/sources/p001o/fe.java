package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class fe extends ee {
    public static final ewi.C13274i A0 = null;
    public static final SparseIntArray B0;
    public final NestedScrollView y0;
    public long z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B0 = sparseIntArray;
        sparseIntArray.put(z8e.settingsToolbar, 1);
        sparseIntArray.put(z8e.settingsBack, 2);
        sparseIntArray.put(z8e.workingHours, 3);
        sparseIntArray.put(z8e.workingTimeZone, 4);
        sparseIntArray.put(z8e.userAndTeamManagementMessage, 5);
        sparseIntArray.put(z8e.currencies, 6);
        sparseIntArray.put(z8e.dateTimeFormat, 7);
        sparseIntArray.put(z8e.selectedDateFormat, 8);
        sparseIntArray.put(z8e.selectedTimeFormat, 9);
        sparseIntArray.put(z8e.denominations, 10);
        sparseIntArray.put(z8e.selectedDenomination, 11);
    }

    public fe(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, A0, B0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.z0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.z0 = 1L;
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
            this.z0 = 0L;
        }
    }

    public fe(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[6], (MaterialButton) objArr[7], (MaterialButton) objArr[10], (Chip) objArr[8], (Chip) objArr[11], (Chip) objArr[9], (ShapeableImageView) objArr[2], (MaterialCardView) objArr[1], (MaterialTextView) objArr[5], (MaterialButton) objArr[3], (MaterialButton) objArr[4]);
        this.z0 = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.y0 = nestedScrollView;
        nestedScrollView.setTag(null);
        a0(view);
        mo16291G();
    }
}
