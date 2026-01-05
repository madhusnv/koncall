package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class k40 extends j40 {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public final ConstraintLayout w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.backButton, 6);
        sparseIntArray.put(z8e.taskPriority, 7);
        sparseIntArray.put(z8e.chipPriorityGroup, 8);
    }

    public k40(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 9, y0, z0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.x0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.x0 = 2L;
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

    @Override // p001o.j40
    public void j0(String str) {
        this.v0 = str;
        synchronized (this) {
            this.x0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        boolean z;
        boolean zEqualsIgnoreCase;
        boolean zEqualsIgnoreCase2;
        boolean zEqualsIgnoreCase3;
        boolean zEqualsIgnoreCase4;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        String str = this.v0;
        long j2 = j & 3;
        boolean zEqualsIgnoreCase5 = false;
        if (j2 != 0) {
            if (str != null) {
                zEqualsIgnoreCase5 = str.equalsIgnoreCase(this.s0.getResources().getString(hae.very_high));
                zEqualsIgnoreCase = str.equalsIgnoreCase(this.t0.getResources().getString(hae.very_low));
                zEqualsIgnoreCase2 = str.equalsIgnoreCase(this.q0.getResources().getString(hae.medium));
                zEqualsIgnoreCase3 = str.equalsIgnoreCase(this.p0.getResources().getString(hae.low));
                zEqualsIgnoreCase4 = str.equalsIgnoreCase(this.o0.getResources().getString(hae.high));
            } else {
                zEqualsIgnoreCase4 = false;
                zEqualsIgnoreCase = false;
                zEqualsIgnoreCase2 = false;
                zEqualsIgnoreCase3 = false;
            }
            if (j2 != 0) {
                j |= zEqualsIgnoreCase5 ? 128L : 64L;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase ? 512L : 256L;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase2 ? 8L : 4L;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase3 ? 32L : 16L;
            }
            if ((j & 3) != 0) {
                j |= zEqualsIgnoreCase4 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            boolean z2 = zEqualsIgnoreCase5;
            zEqualsIgnoreCase5 = zEqualsIgnoreCase4;
            z = z2;
        } else {
            z = false;
            zEqualsIgnoreCase = false;
            zEqualsIgnoreCase2 = false;
            zEqualsIgnoreCase3 = false;
        }
        if ((j & 3) != 0) {
            np3.m40895a(this.o0, zEqualsIgnoreCase5);
            np3.m40895a(this.p0, zEqualsIgnoreCase3);
            np3.m40895a(this.q0, zEqualsIgnoreCase2);
            np3.m40895a(this.s0, z);
            np3.m40895a(this.t0, zEqualsIgnoreCase);
        }
    }

    public k40(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[6], (Chip) objArr[2], (Chip) objArr[4], (Chip) objArr[3], (ChipGroup) objArr[8], (Chip) objArr[1], (Chip) objArr[5], (MaterialTextView) objArr[7]);
        this.x0 = -1L;
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.w0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
