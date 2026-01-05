package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class rdh extends qdh {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0;
    public final ConstraintLayout u0;
    public long v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(z8e.rvTeamsList, 2);
        sparseIntArray.put(z8e.task_status_title, 3);
        sparseIntArray.put(z8e.taskTypeSpinner, 4);
        sparseIntArray.put(z8e.rvTasksList, 5);
    }

    public rdh(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, w0, x0));
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
            this.v0 = 4L;
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
        if (90 == i) {
            i0(((Boolean) obj).booleanValue());
        } else {
            if (45 != i) {
                return false;
            }
            h0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    public void h0(boolean z) {
        this.s0 = z;
    }

    public void i0(boolean z) {
        this.t0 = z;
        synchronized (this) {
            this.v0 |= 1;
        }
        m28509h(90);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.v0;
            this.v0 = 0L;
        }
        boolean z = this.t0;
        long j2 = j & 5;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 16L : 8L;
            }
            if (z) {
                i = 8;
            }
        }
        if ((j & 5) != 0) {
            this.q0.setVisibility(i);
        }
    }

    public rdh(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (RecyclerView) objArr[5], (RecyclerView) objArr[2], (MaterialTextView) objArr[3], (TextInputLayout) objArr[1], (AutoCompleteTextView) objArr[4]);
        this.v0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        this.q0.setTag(null);
        a0(view);
        mo16291G();
    }
}
