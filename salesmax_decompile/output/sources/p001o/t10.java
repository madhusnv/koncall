package p001o;

import ai.salesmax.model.Product;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class t10 extends s10 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i S0 = null;
    public static final SparseIntArray T0;
    public final MaterialCardView O0;
    public final View.OnClickListener P0;
    public final View.OnLongClickListener Q0;
    public long R0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 6);
        sparseIntArray.put(z8e.title, 7);
        sparseIntArray.put(z8e.buttonDelete, 8);
        sparseIntArray.put(z8e.productNameLayout, 9);
        sparseIntArray.put(z8e.productDescriptionLayout, 10);
        sparseIntArray.put(z8e.productTypeLayout, 11);
        sparseIntArray.put(z8e.productTypeSpinner, 12);
        sparseIntArray.put(z8e.measuredInLayout, 13);
        sparseIntArray.put(z8e.measuredInSpinner, 14);
        sparseIntArray.put(z8e.pricePerUnitLayout, 15);
        sparseIntArray.put(z8e.priceCurrencyLayout, 16);
        sparseIntArray.put(z8e.priceCurrencySpinner, 17);
        sparseIntArray.put(z8e.hsCodeLayout, 18);
        sparseIntArray.put(z8e.linkedProductLayout, 19);
        sparseIntArray.put(z8e.linkedProduct, 20);
        sparseIntArray.put(z8e.notesActionButtons, 21);
        sparseIntArray.put(z8e.taskAttachment, 22);
        sparseIntArray.put(z8e.taskPicture, 23);
        sparseIntArray.put(z8e.buttonAddOption, 24);
    }

    public t10(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 25, S0, T0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.R0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.R0 = 8L;
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
        ck6 ck6Var = this.N0;
        Product product = this.L0;
        Integer num = this.M0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), product);
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
            j0((Product) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.N0;
        Product product = this.L0;
        Integer num = this.M0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), product);
        }
    }

    @Override // p001o.s10
    public void j0(Product product) {
        this.L0 = product;
        synchronized (this) {
            this.R0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.N0 = ck6Var;
        synchronized (this) {
            this.R0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.M0 = num;
        synchronized (this) {
            this.R0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String hsCode;
        String name;
        String standardPricePerUnit;
        String description;
        synchronized (this) {
            j = this.R0;
            this.R0 = 0L;
        }
        Product product = this.L0;
        long j2 = 12 & j;
        if (j2 == 0 || product == null) {
            hsCode = null;
            name = null;
            standardPricePerUnit = null;
            description = null;
        } else {
            hsCode = product.getHsCode();
            standardPricePerUnit = product.getStandardPricePerUnit();
            description = product.getDescription();
            name = product.getName();
        }
        if ((j & 8) != 0) {
            this.q0.setOnClickListener(this.P0);
            this.q0.setOnLongClickListener(this.Q0);
        }
        if (j2 != 0) {
            fjh.m26938c(this.r0, hsCode);
            fjh.m26938c(this.A0, standardPricePerUnit);
            fjh.m26938c(this.C0, description);
            fjh.m26938c(this.E0, name);
        }
    }

    public t10(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[24], (MaterialButton) objArr[6], (MaterialButton) objArr[8], (MaterialCardView) objArr[1], (TextInputEditText) objArr[5], (TextInputLayout) objArr[18], (AutoCompleteTextView) objArr[20], (TextInputLayout) objArr[19], (TextInputLayout) objArr[13], (AutoCompleteTextView) objArr[14], (LinearLayout) objArr[21], (TextInputLayout) objArr[16], (AutoCompleteTextView) objArr[17], (TextInputEditText) objArr[4], (TextInputLayout) objArr[15], (TextInputEditText) objArr[3], (TextInputLayout) objArr[10], (TextInputEditText) objArr[2], (TextInputLayout) objArr[9], (TextInputLayout) objArr[11], (AutoCompleteTextView) objArr[12], (MaterialButton) objArr[22], (MaterialButton) objArr[23], (MaterialTextView) objArr[7]);
        this.R0 = -1L;
        this.q0.setTag(null);
        this.r0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.O0 = materialCardView;
        materialCardView.setTag(null);
        this.A0.setTag(null);
        this.C0.setTag(null);
        this.E0.setTag(null);
        a0(view);
        this.P0 = new jbc(this, 1);
        this.Q0 = new sbc(this, 2);
        mo16291G();
    }
}
