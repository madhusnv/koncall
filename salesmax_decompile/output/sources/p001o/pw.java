package p001o;

import ai.salesmax.model.IntegrationParameters;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.login.widget.LoginButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class pw extends ow implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i H0 = null;
    public static final SparseIntArray I0;
    public final MaterialCardView D0;
    public final View.OnLongClickListener E0;
    public final View.OnClickListener F0;
    public long G0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 2);
        sparseIntArray.put(z8e.title, 3);
        sparseIntArray.put(z8e.buttonDisconnect, 4);
        sparseIntArray.put(z8e.integrationHelpMessageIndiamart, 5);
        sparseIntArray.put(z8e.bookOnboardingCallText, 6);
        sparseIntArray.put(z8e.bookOnboardingCallButton, 7);
        sparseIntArray.put(z8e.login_button, 8);
        sparseIntArray.put(z8e.fetchPastLeads, 9);
        sparseIntArray.put(z8e.fetchPastLeadsMessage, 10);
        sparseIntArray.put(z8e.onFetchLeadText, 11);
        sparseIntArray.put(z8e.onFetchLeadOptions, 12);
        sparseIntArray.put(z8e.buttonConnect, 13);
    }

    public pw(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 14, H0, I0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.G0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G0 = 8L;
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
        ck6 ck6Var = this.C0;
        IntegrationParameters integrationParameters = this.A0;
        Integer num = this.B0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), integrationParameters);
        }
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
            k0((IntegrationParameters) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.C0;
        IntegrationParameters integrationParameters = this.A0;
        Integer num = this.B0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), integrationParameters);
        }
    }

    public void j0(ck6 ck6Var) {
        this.C0 = ck6Var;
        synchronized (this) {
            this.G0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(IntegrationParameters integrationParameters) {
        this.A0 = integrationParameters;
        synchronized (this) {
            this.G0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.B0 = num;
        synchronized (this) {
            this.G0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.G0;
            this.G0 = 0L;
        }
        if ((j & 8) != 0) {
            this.u0.setOnClickListener(this.F0);
            this.u0.setOnLongClickListener(this.E0);
        }
    }

    public pw(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[7], (MaterialTextView) objArr[6], (MaterialButton) objArr[2], (MaterialButton) objArr[13], (MaterialButton) objArr[4], (MaterialSwitch) objArr[9], (MaterialTextView) objArr[10], (MaterialCardView) objArr[1], (ConstraintLayout) objArr[5], (LoginButton) objArr[8], (RecyclerView) objArr[12], (MaterialTextView) objArr[11], (MaterialTextView) objArr[3]);
        this.G0 = -1L;
        this.u0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.D0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        this.E0 = new sbc(this, 2);
        this.F0 = new jbc(this, 1);
        mo16291G();
    }
}
