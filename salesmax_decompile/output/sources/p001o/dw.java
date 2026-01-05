package p001o;

import ai.salesmax.model.CallOutcome;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class dw extends cw implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i G0 = null;
    public static final SparseIntArray H0;
    public final MaterialCardView C0;
    public final View.OnLongClickListener D0;
    public final View.OnClickListener E0;
    public long F0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 4);
        sparseIntArray.put(z8e.title, 5);
        sparseIntArray.put(z8e.buttonDone, 6);
        sparseIntArray.put(z8e.outcomeTypeLayout, 7);
        sparseIntArray.put(z8e.outcomeTypeNatureContainer, 8);
        sparseIntArray.put(z8e.outcomeTypeNatureSpinner, 9);
        sparseIntArray.put(z8e.outcomeFormLayout, 10);
        sparseIntArray.put(z8e.outcomeFormSpinner, 11);
        sparseIntArray.put(z8e.buttonAddOption, 12);
    }

    public dw(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 13, G0, H0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.F0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.F0 = 8L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        ck6 ck6Var = this.B0;
        CallOutcome callOutcome = this.z0;
        Integer num = this.A0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), callOutcome);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            k0((ck6) obj);
        } else if (73 == i) {
            l0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((CallOutcome) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.B0;
        CallOutcome callOutcome = this.z0;
        Integer num = this.A0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), callOutcome);
        }
    }

    @Override // p001o.cw
    public void j0(CallOutcome callOutcome) {
        this.z0 = callOutcome;
        synchronized (this) {
            this.F0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.B0 = ck6Var;
        synchronized (this) {
            this.F0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.A0 = num;
        synchronized (this) {
            this.F0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        boolean createNewDeal;
        String outcomeTitle;
        synchronized (this) {
            j = this.F0;
            this.F0 = 0L;
        }
        CallOutcome callOutcome = this.z0;
        long j2 = 12 & j;
        if (j2 == 0 || callOutcome == null) {
            createNewDeal = false;
            outcomeTitle = null;
        } else {
            createNewDeal = callOutcome.getCreateNewDeal();
            outcomeTitle = callOutcome.getOutcomeTitle();
        }
        if ((j & 8) != 0) {
            this.q0.setOnClickListener(this.E0);
            this.q0.setOnLongClickListener(this.D0);
        }
        if (j2 != 0) {
            fjh.m26938c(this.w0, outcomeTitle);
            np3.m40895a(this.x0, createNewDeal);
        }
    }

    public dw(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[12], (MaterialButton) objArr[4], (MaterialButton) objArr[6], (MaterialCardView) objArr[1], (TextInputLayout) objArr[10], (AutoCompleteTextView) objArr[11], (TextInputLayout) objArr[7], (TextInputLayout) objArr[8], (AutoCompleteTextView) objArr[9], (TextInputEditText) objArr[2], (MaterialSwitch) objArr[3], (MaterialTextView) objArr[5]);
        this.F0 = -1L;
        this.q0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.C0 = materialCardView;
        materialCardView.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        a0(view);
        this.D0 = new sbc(this, 2);
        this.E0 = new jbc(this, 1);
        mo16291G();
    }
}
