package p001o;

import ai.salesmax.model.IntegrationParameters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class e50 extends d50 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i S0 = null;
    public static final SparseIntArray T0;
    public final MaterialCardView M0;
    public final View.OnLongClickListener N0;
    public final View.OnClickListener O0;
    public final View.OnClickListener P0;
    public final View.OnClickListener Q0;
    public long R0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 5);
        sparseIntArray.put(z8e.title, 6);
        sparseIntArray.put(z8e.buttonDisconnect, 7);
        sparseIntArray.put(z8e.integrationHelpMessageIndiamart, 8);
        sparseIntArray.put(z8e.bookOnboardingCallText, 9);
        sparseIntArray.put(z8e.knowMoreAboutIntegrationButton, 10);
        sparseIntArray.put(z8e.stepOneText, 11);
        sparseIntArray.put(z8e.formKeyLayout, 12);
        sparseIntArray.put(z8e.buttonConnect, 13);
        sparseIntArray.put(z8e.stepTwoNote, 14);
        sparseIntArray.put(z8e.scriptToCopyLayout, 15);
        sparseIntArray.put(z8e.scriptToCopy, 16);
        sparseIntArray.put(z8e.actionGroup, 17);
        sparseIntArray.put(z8e.codeCopy, 18);
        sparseIntArray.put(z8e.codeWhatsapp, 19);
        sparseIntArray.put(z8e.stepThreeNote, 20);
        sparseIntArray.put(z8e.testDataLayout, 21);
        sparseIntArray.put(z8e.testDataTitle, 22);
    }

    public e50(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 23, S0, T0));
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
        ck6 ck6Var = this.L0;
        IntegrationParameters integrationParameters = this.J0;
        Integer num = this.K0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), integrationParameters);
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
            j0((IntegrationParameters) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.L0;
            IntegrationParameters integrationParameters = this.J0;
            Integer num = this.K0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), integrationParameters);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.L0;
            IntegrationParameters integrationParameters2 = this.J0;
            Integer num2 = this.K0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), integrationParameters2);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ck6 ck6Var3 = this.L0;
        IntegrationParameters integrationParameters3 = this.J0;
        Integer num3 = this.K0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), integrationParameters3);
        }
    }

    @Override // p001o.d50
    public void j0(IntegrationParameters integrationParameters) {
        this.J0 = integrationParameters;
        synchronized (this) {
            this.R0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.L0 = ck6Var;
        synchronized (this) {
            this.R0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.K0 = num;
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
        synchronized (this) {
            j = this.R0;
            this.R0 = 0L;
        }
        IntegrationParameters integrationParameters = this.J0;
        long j2 = 12 & j;
        String connectionName = (j2 == 0 || integrationParameters == null) ? null : integrationParameters.getConnectionName();
        if ((j & 8) != 0) {
            this.t0.setOnClickListener(this.O0);
            this.u0.setOnClickListener(this.P0);
            this.x0.setOnClickListener(this.Q0);
            this.x0.setOnLongClickListener(this.N0);
        }
        if (j2 != 0) {
            fjh.m26938c(this.w0, connectionName);
        }
    }

    public e50(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (HorizontalScrollView) objArr[17], (MaterialTextView) objArr[9], (MaterialButton) objArr[5], (MaterialButton) objArr[13], (MaterialButton) objArr[7], (MaterialButton) objArr[18], (MaterialButton) objArr[4], (MaterialButton) objArr[3], (MaterialButton) objArr[19], (TextInputEditText) objArr[2], (MaterialCardView) objArr[1], (TextInputLayout) objArr[12], (ConstraintLayout) objArr[8], (MaterialButton) objArr[10], (MaterialTextView) objArr[16], (MaterialCardView) objArr[15], (MaterialTextView) objArr[11], (MaterialTextView) objArr[20], (MaterialTextView) objArr[14], (MaterialCardView) objArr[21], (MaterialTextView) objArr[22], (MaterialTextView) objArr[6]);
        this.R0 = -1L;
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.M0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        this.N0 = new sbc(this, 2);
        this.O0 = new jbc(this, 4);
        this.P0 = new jbc(this, 3);
        this.Q0 = new jbc(this, 1);
        mo16291G();
    }
}
