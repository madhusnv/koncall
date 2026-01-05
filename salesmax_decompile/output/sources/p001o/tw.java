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
public class tw extends sw implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i M0 = null;
    public static final SparseIntArray N0;
    public final MaterialCardView I0;
    public final View.OnClickListener J0;
    public final View.OnLongClickListener K0;
    public long L0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 4);
        sparseIntArray.put(z8e.title, 5);
        sparseIntArray.put(z8e.buttonDisconnect, 6);
        sparseIntArray.put(z8e.integrationHelpMessageIndiamart, 7);
        sparseIntArray.put(z8e.bookOnboardingCallText, 8);
        sparseIntArray.put(z8e.knowMoreAboutIntegrationButton, 9);
        sparseIntArray.put(z8e.connectionNameLayoutLayout, 10);
        sparseIntArray.put(z8e.buttonConnect, 11);
        sparseIntArray.put(z8e.stepTwoNote, 12);
        sparseIntArray.put(z8e.scriptToCopyLayout, 13);
        sparseIntArray.put(z8e.actionGroup, 14);
        sparseIntArray.put(z8e.codeCopy, 15);
        sparseIntArray.put(z8e.codeWhatsapp, 16);
        sparseIntArray.put(z8e.codeMail, 17);
        sparseIntArray.put(z8e.stepThreeNote, 18);
    }

    public tw(yt4 yt4Var, View view) {
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
        IntegrationParameters integrationParameters = this.F0;
        Integer num = this.G0;
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
        ck6 ck6Var = this.H0;
        IntegrationParameters integrationParameters = this.F0;
        Integer num = this.G0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), integrationParameters);
        }
    }

    @Override // p001o.sw
    public void j0(IntegrationParameters integrationParameters) {
        this.F0 = integrationParameters;
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
        String connectionName;
        String requestUrl;
        synchronized (this) {
            j = this.L0;
            this.L0 = 0L;
        }
        IntegrationParameters integrationParameters = this.F0;
        long j2 = 12 & j;
        if (j2 == 0 || integrationParameters == null) {
            connectionName = null;
            requestUrl = null;
        } else {
            connectionName = integrationParameters.getConnectionName();
            requestUrl = integrationParameters.getRequestUrl();
        }
        if (j2 != 0) {
            fjh.m26938c(this.v0, connectionName);
            fjh.m26938c(this.A0, requestUrl);
        }
        if ((j & 8) != 0) {
            this.x0.setOnClickListener(this.J0);
            this.x0.setOnLongClickListener(this.K0);
        }
    }

    public tw(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (HorizontalScrollView) objArr[14], (MaterialTextView) objArr[8], (MaterialButton) objArr[4], (MaterialButton) objArr[11], (MaterialButton) objArr[6], (MaterialButton) objArr[15], (MaterialButton) objArr[17], (MaterialButton) objArr[16], (TextInputEditText) objArr[2], (TextInputLayout) objArr[10], (MaterialCardView) objArr[1], (ConstraintLayout) objArr[7], (MaterialButton) objArr[9], (MaterialTextView) objArr[3], (MaterialCardView) objArr[13], (MaterialTextView) objArr[18], (MaterialTextView) objArr[12], (MaterialTextView) objArr[5]);
        this.L0 = -1L;
        this.v0.setTag(null);
        this.x0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.I0 = materialCardView;
        materialCardView.setTag(null);
        this.A0.setTag(null);
        a0(view);
        this.J0 = new jbc(this, 1);
        this.K0 = new sbc(this, 2);
        mo16291G();
    }
}
