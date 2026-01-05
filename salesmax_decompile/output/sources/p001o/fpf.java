package p001o;

import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class fpf extends epf {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public final LinearLayout w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 2);
        sparseIntArray.put(z8e.buttonDone, 3);
        sparseIntArray.put(z8e.taskUpdateLayout, 4);
        sparseIntArray.put(z8e.taskUpdate, 5);
        sparseIntArray.put(z8e.reviseDueDateText, 6);
    }

    public fpf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, y0, z0));
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
            this.x0 = 8L;
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
            l0((ck6) obj);
        } else if (67 == i) {
            k0((Tasks) obj);
        } else {
            if (73 != i) {
                return false;
            }
            m0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.epf
    public void k0(Tasks tasks) {
        this.t0 = tasks;
        synchronized (this) {
            this.x0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(ck6 ck6Var) {
        this.v0 = ck6Var;
    }

    public void m0(Integer num) {
        this.u0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        Tasks tasks = this.t0;
        if ((j & 10) != 0) {
            nr1.f2(this.q0, tasks);
        }
    }

    public fpf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[2], (MaterialButton) objArr[3], (MaterialTextView) objArr[6], (MaterialButton) objArr[1], (TextInputEditText) objArr[5], (TextInputLayout) objArr[4]);
        this.x0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.w0 = linearLayout;
        linearLayout.setTag(null);
        this.q0.setTag(null);
        a0(view);
        mo16291G();
    }
}
