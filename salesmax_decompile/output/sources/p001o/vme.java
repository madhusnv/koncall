package p001o;

import ai.salesmax.model.PaymentDataInfo;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class vme extends ume {
    public static final ewi.C13274i U0 = null;
    public static final SparseIntArray V0;
    public final FrameLayout S0;
    public long T0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V0 = sparseIntArray;
        sparseIntArray.put(z8e.registerCard, 3);
        sparseIntArray.put(z8e.buttonCancel, 4);
        sparseIntArray.put(z8e.buttonDone, 5);
        sparseIntArray.put(z8e.signUpTitle, 6);
        sparseIntArray.put(z8e.rvPaymentProviders, 7);
        sparseIntArray.put(z8e.selectCurrencyTextBorder, 8);
        sparseIntArray.put(z8e.selectCurrencyText, 9);
        sparseIntArray.put(z8e.selectCurrencyBlock, 10);
        sparseIntArray.put(z8e.btnCurrencyInr, 11);
        sparseIntArray.put(z8e.btnCurrencyUsd, 12);
        sparseIntArray.put(z8e.paymentAmountLayoutBorder, 13);
        sparseIntArray.put(z8e.paymentAmountLayout, 14);
        sparseIntArray.put(z8e.paymentAmountLayoutText, 15);
        sparseIntArray.put(z8e.btnRequested, 16);
        sparseIntArray.put(z8e.btnMarkAsPaid, 17);
        sparseIntArray.put(z8e.btnPartiallyPaid, 18);
        sparseIntArray.put(z8e.btnMarkCancelled, 19);
        sparseIntArray.put(z8e.paymentAmountReceivedLayout, 20);
        sparseIntArray.put(z8e.paymentAmountReceivedLayoutText, 21);
        sparseIntArray.put(z8e.paymentNoteLayoutBorder, 22);
        sparseIntArray.put(z8e.paymentNoteLayout, 23);
        sparseIntArray.put(z8e.paymentNoteLayoutText, 24);
        sparseIntArray.put(z8e.selectOpenTaskText, 25);
        sparseIntArray.put(z8e.rvOpenTaskList, 26);
        sparseIntArray.put(z8e.paymentActionButton, 27);
    }

    public vme(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 28, U0, V0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.T0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.T0 = 16L;
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
        if (43 == i) {
            j0((Boolean) obj);
        } else if (67 == i) {
            l0((PaymentDataInfo) obj);
        } else if (53 == i) {
            k0((Boolean) obj);
        } else {
            if (63 != i) {
                return false;
            }
            m0((String) obj);
        }
        return true;
    }

    @Override // p001o.ume
    public void j0(Boolean bool) {
        this.R0 = bool;
    }

    @Override // p001o.ume
    public void k0(Boolean bool) {
        this.Q0 = bool;
    }

    @Override // p001o.ume
    public void l0(PaymentDataInfo paymentDataInfo) {
        this.O0 = paymentDataInfo;
        synchronized (this) {
            this.T0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void m0(String str) {
        this.P0 = str;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.T0;
            this.T0 = 0L;
        }
        PaymentDataInfo paymentDataInfo = this.O0;
        long j2 = j & 18;
        int i = 0;
        if (j2 != 0) {
            String paymentProvider = paymentDataInfo != null ? paymentDataInfo.getPaymentProvider() : null;
            boolean zEquals = paymentProvider != null ? paymentProvider.equals("OFFLINE") : false;
            if (j2 != 0) {
                j |= zEquals ? 64L : 32L;
            }
            if (!zEquals) {
                i = 8;
            }
        }
        if ((j & 18) != 0) {
            this.L0.setVisibility(i);
            this.M0.setVisibility(i);
        }
    }

    public vme(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[11], (Button) objArr[12], (Button) objArr[17], (Button) objArr[19], (Button) objArr[18], (Button) objArr[16], (MaterialButton) objArr[4], (MaterialButton) objArr[5], (MaterialButton) objArr[27], (TextInputLayout) objArr[14], (View) objArr[13], (TextInputEditText) objArr[15], (TextInputLayout) objArr[20], (TextInputEditText) objArr[21], (TextInputLayout) objArr[23], (View) objArr[22], (TextInputEditText) objArr[24], (MaterialCardView) objArr[3], (RecyclerView) objArr[26], (RecyclerView) objArr[7], (MaterialButtonToggleGroup) objArr[10], (MaterialTextView) objArr[9], (View) objArr[8], (MaterialTextView) objArr[25], (MaterialButtonToggleGroup) objArr[2], (MaterialTextView) objArr[1], (MaterialTextView) objArr[6]);
        this.T0 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.S0 = frameLayout;
        frameLayout.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        a0(view);
        mo16291G();
    }
}
