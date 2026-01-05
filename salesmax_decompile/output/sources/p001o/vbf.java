package p001o;

import ai.salesmax.model.CallOutcome;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class vbf extends ubf {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public final MaterialCardView w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 1);
        sparseIntArray.put(z8e.title, 2);
        sparseIntArray.put(z8e.buttonDone, 3);
        sparseIntArray.put(z8e.dateFormats, 4);
        sparseIntArray.put(z8e.formatOne, 5);
        sparseIntArray.put(z8e.formatTwo, 6);
    }

    public vbf(yt4 yt4Var, View view) {
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
            j0((ck6) obj);
        } else if (67 == i) {
            k0((CallOutcome) obj);
        } else {
            if (73 != i) {
                return false;
            }
            l0((Integer) obj);
        }
        return true;
    }

    public void j0(ck6 ck6Var) {
        this.v0 = ck6Var;
    }

    public void k0(CallOutcome callOutcome) {
        this.t0 = callOutcome;
    }

    public void l0(Integer num) {
        this.u0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.x0 = 0L;
        }
    }

    public vbf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[1], (MaterialButton) objArr[3], (MaterialButtonToggleGroup) objArr[4], (Button) objArr[5], (Button) objArr[6], (MaterialTextView) objArr[2]);
        this.x0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.w0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        mo16291G();
    }
}
