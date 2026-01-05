package p001o;

import ai.salesmax.model.FormDefinition;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.recyclerview.widget.RecyclerView;
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
public class hw extends gw implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i M0 = null;
    public static final SparseIntArray N0;
    public final MaterialCardView I0;
    public final View.OnLongClickListener J0;
    public final View.OnClickListener K0;
    public long L0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 4);
        sparseIntArray.put(z8e.title, 5);
        sparseIntArray.put(z8e.buttonDone, 6);
        sparseIntArray.put(z8e.formNameLayout, 7);
        sparseIntArray.put(z8e.formTitleLayout, 8);
        sparseIntArray.put(z8e.objectTypeContainer, 9);
        sparseIntArray.put(z8e.objectTypeSpinner, 10);
        sparseIntArray.put(z8e.propertyTypeContainer, 11);
        sparseIntArray.put(z8e.propertyTypeSpinner, 12);
        sparseIntArray.put(z8e.isMandatory, 13);
        sparseIntArray.put(z8e.isViewOnly, 14);
        sparseIntArray.put(z8e.placeHolderTextLayout, 15);
        sparseIntArray.put(z8e.placeholderText, 16);
        sparseIntArray.put(z8e.buttonAddOption, 17);
        sparseIntArray.put(z8e.optionList, 18);
    }

    public hw(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 19, M0, N0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.L0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.L0 = 8L;
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
        ck6 ck6Var = this.H0;
        FormDefinition formDefinition = this.F0;
        Integer num = this.G0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), formDefinition);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            l0((Integer) obj);
        } else if (33 == i) {
            k0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((FormDefinition) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.H0;
        FormDefinition formDefinition = this.F0;
        Integer num = this.G0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), formDefinition);
        }
    }

    @Override // p001o.gw
    public void j0(FormDefinition formDefinition) {
        this.F0 = formDefinition;
        synchronized (this) {
            this.L0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.H0 = ck6Var;
        synchronized (this) {
            this.L0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.G0 = num;
        synchronized (this) {
            this.L0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String displayName;
        String formTitle;
        synchronized (this) {
            j = this.L0;
            this.L0 = 0L;
        }
        FormDefinition formDefinition = this.F0;
        long j2 = 12 & j;
        if (j2 == 0 || formDefinition == null) {
            displayName = null;
            formTitle = null;
        } else {
            displayName = formDefinition.getDisplayName();
            formTitle = formDefinition.getFormTitle();
        }
        if ((j & 8) != 0) {
            this.q0.setOnClickListener(this.K0);
            this.q0.setOnLongClickListener(this.J0);
        }
        if (j2 != 0) {
            fjh.m26938c(this.r0, displayName);
            fjh.m26938c(this.t0, formTitle);
        }
    }

    public hw(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[17], (MaterialButton) objArr[4], (MaterialButton) objArr[6], (MaterialCardView) objArr[3], (TextInputEditText) objArr[1], (TextInputLayout) objArr[7], (TextInputEditText) objArr[2], (TextInputLayout) objArr[8], (MaterialSwitch) objArr[13], (MaterialSwitch) objArr[14], (TextInputLayout) objArr[9], (AutoCompleteTextView) objArr[10], (RecyclerView) objArr[18], (TextInputLayout) objArr[15], (TextInputEditText) objArr[16], (TextInputLayout) objArr[11], (AutoCompleteTextView) objArr[12], (MaterialTextView) objArr[5]);
        this.L0 = -1L;
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.t0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.I0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        this.J0 = new sbc(this, 2);
        this.K0 = new jbc(this, 1);
        mo16291G();
    }
}
