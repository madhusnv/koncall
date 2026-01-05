package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class e40 extends d40 {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0;
    public final ConstraintLayout u0;
    public long v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(z8e.backButton, 4);
        sparseIntArray.put(z8e.taskActivityHeadLine, 5);
        sparseIntArray.put(z8e.chipContactModeGroup, 6);
    }

    public e40(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, w0, x0));
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
            this.v0 = 2L;
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
        if (67 != i) {
            return false;
        }
        j0((String) obj);
        return true;
    }

    @Override // p001o.d40
    public void j0(String str) {
        this.t0 = str;
        synchronized (this) {
            this.v0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        boolean zEqualsIgnoreCase;
        boolean zEqualsIgnoreCase2;
        synchronized (this) {
            j = this.v0;
            this.v0 = 0L;
        }
        String str = this.t0;
        long j2 = j & 3;
        boolean zEqualsIgnoreCase3 = false;
        if (j2 != 0) {
            if (str != null) {
                zEqualsIgnoreCase3 = str.equalsIgnoreCase(this.o0.getResources().getString(hae.call));
                zEqualsIgnoreCase2 = str.equalsIgnoreCase(this.q0.getResources().getString(hae.email));
                zEqualsIgnoreCase = str.equalsIgnoreCase(this.r0.getResources().getString(hae.visit));
            } else {
                zEqualsIgnoreCase = false;
                zEqualsIgnoreCase2 = false;
            }
            if (j2 != 0) {
                j |= zEqualsIgnoreCase3 ? 128L : 64L;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase2 ? 8L : 4L;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase ? 32L : 16L;
            }
        } else {
            zEqualsIgnoreCase = false;
            zEqualsIgnoreCase2 = false;
        }
        if ((j & 3) != 0) {
            np3.m40895a(this.o0, zEqualsIgnoreCase3);
            np3.m40895a(this.q0, zEqualsIgnoreCase2);
            np3.m40895a(this.r0, zEqualsIgnoreCase);
        }
    }

    public e40(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[4], (Chip) objArr[2], (ChipGroup) objArr[6], (Chip) objArr[1], (Chip) objArr[3], (MaterialTextView) objArr[5]);
        this.v0 = -1L;
        this.o0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
