package p001o;

import ai.salesmax.model.CallOutcome;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class tbf extends sbf {
    public static final ewi.C13274i D0 = null;
    public static final SparseIntArray E0;
    public final MaterialCardView B0;
    public long C0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 1);
        sparseIntArray.put(z8e.title, 2);
        sparseIntArray.put(z8e.buttonDone, 3);
        sparseIntArray.put(z8e.defaultDateFormat, 4);
        sparseIntArray.put(z8e.dateFormats, 5);
        sparseIntArray.put(z8e.formatOne, 6);
        sparseIntArray.put(z8e.formatTwo, 7);
        sparseIntArray.put(z8e.defaultTimeFormat, 8);
        sparseIntArray.put(z8e.timeFormats, 9);
        sparseIntArray.put(z8e.timeOne, 10);
        sparseIntArray.put(z8e.timeTwo, 11);
    }

    public tbf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, D0, E0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.C0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.C0 = 8L;
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
        } else if (73 == i) {
            l0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((CallOutcome) obj);
        }
        return true;
    }

    public void j0(ck6 ck6Var) {
        this.A0 = ck6Var;
    }

    public void k0(CallOutcome callOutcome) {
        this.y0 = callOutcome;
    }

    public void l0(Integer num) {
        this.z0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.C0 = 0L;
        }
    }

    public tbf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[1], (MaterialButton) objArr[3], (MaterialButtonToggleGroup) objArr[5], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[8], (Button) objArr[6], (Button) objArr[7], (MaterialButtonToggleGroup) objArr[9], (Button) objArr[10], (Button) objArr[11], (MaterialTextView) objArr[2]);
        this.C0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.B0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        mo16291G();
    }
}
