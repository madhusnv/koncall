package p001o;

import ai.salesmax.model.IntegrationParameters;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
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
public class rw extends qw implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i K0 = null;
    public static final SparseIntArray L0;
    public final MaterialCardView G0;
    public final View.OnLongClickListener H0;
    public final View.OnClickListener I0;
    public long J0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 4);
        sparseIntArray.put(z8e.title, 5);
        sparseIntArray.put(z8e.buttonDisconnect, 6);
        sparseIntArray.put(z8e.integrationHelpMessageIndiamart, 7);
        sparseIntArray.put(z8e.bookOnboardingCallText, 8);
        sparseIntArray.put(z8e.knowMoreAboutIntegrationButton, 9);
        sparseIntArray.put(z8e.connectionNameLayoutLayout, 10);
        sparseIntArray.put(z8e.apiKeyLayoutLayout, 11);
        sparseIntArray.put(z8e.fetchPastLeads, 12);
        sparseIntArray.put(z8e.fetchPastLeadsMessage, 13);
        sparseIntArray.put(z8e.onFetchLeadText, 14);
        sparseIntArray.put(z8e.onFetchLeadOptions, 15);
        sparseIntArray.put(z8e.buttonConnect, 16);
    }

    public rw(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 17, K0, L0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.J0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.J0 = 8L;
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
        ck6 ck6Var = this.F0;
        IntegrationParameters integrationParameters = this.D0;
        Integer num = this.E0;
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
        ck6 ck6Var = this.F0;
        IntegrationParameters integrationParameters = this.D0;
        Integer num = this.E0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), integrationParameters);
        }
    }

    @Override // p001o.qw
    public void j0(IntegrationParameters integrationParameters) {
        this.D0 = integrationParameters;
        synchronized (this) {
            this.J0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.F0 = ck6Var;
        synchronized (this) {
            this.J0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.E0 = num;
        synchronized (this) {
            this.J0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String connectionName;
        String apiKey;
        synchronized (this) {
            j = this.J0;
            this.J0 = 0L;
        }
        IntegrationParameters integrationParameters = this.D0;
        long j2 = 12 & j;
        if (j2 == 0 || integrationParameters == null) {
            connectionName = null;
            apiKey = null;
        } else {
            connectionName = integrationParameters.getConnectionName();
            apiKey = integrationParameters.getApiKey();
        }
        if (j2 != 0) {
            fjh.m26938c(this.n0, apiKey);
            fjh.m26938c(this.t0, connectionName);
        }
        if ((j & 8) != 0) {
            this.x0.setOnClickListener(this.I0);
            this.x0.setOnLongClickListener(this.H0);
        }
    }

    public rw(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextInputEditText) objArr[3], (TextInputLayout) objArr[11], (MaterialTextView) objArr[8], (MaterialButton) objArr[4], (MaterialButton) objArr[16], (MaterialButton) objArr[6], (TextInputEditText) objArr[2], (TextInputLayout) objArr[10], (MaterialSwitch) objArr[12], (MaterialTextView) objArr[13], (MaterialCardView) objArr[1], (ConstraintLayout) objArr[7], (MaterialButton) objArr[9], (RecyclerView) objArr[15], (MaterialTextView) objArr[14], (MaterialTextView) objArr[5]);
        this.J0 = -1L;
        this.n0.setTag(null);
        this.t0.setTag(null);
        this.x0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.G0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        this.H0 = new sbc(this, 2);
        this.I0 = new jbc(this, 1);
        mo16291G();
    }
}
