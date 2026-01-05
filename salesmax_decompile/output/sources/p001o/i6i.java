package p001o;

import ai.salesmax.model.LeadsDeal;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class i6i extends h6i implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i B0 = null;
    public static final SparseIntArray C0;
    public long A0;
    public final MaterialCardView x0;
    public final View.OnLongClickListener y0;
    public final View.OnClickListener z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 2);
        sparseIntArray.put(z8e.title, 3);
        sparseIntArray.put(z8e.buttonDone, 4);
        sparseIntArray.put(z8e.outcomeTypeLayout, 5);
        sparseIntArray.put(z8e.outcomeTypeText, 6);
        sparseIntArray.put(z8e.buttonAddOption, 7);
    }

    public i6i(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, B0, C0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.A0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.A0 = 8L;
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
        ck6 ck6Var = this.w0;
        LeadsDeal leadsDeal = this.u0;
        Integer num = this.v0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), leadsDeal);
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
            k0((LeadsDeal) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.w0;
        LeadsDeal leadsDeal = this.u0;
        Integer num = this.v0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), leadsDeal);
        }
    }

    public void j0(ck6 ck6Var) {
        this.w0 = ck6Var;
        synchronized (this) {
            this.A0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(LeadsDeal leadsDeal) {
        this.u0 = leadsDeal;
        synchronized (this) {
            this.A0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.v0 = num;
        synchronized (this) {
            this.A0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.A0;
            this.A0 = 0L;
        }
        if ((j & 8) != 0) {
            this.q0.setOnClickListener(this.z0);
            this.q0.setOnLongClickListener(this.y0);
        }
    }

    public i6i(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[7], (MaterialButton) objArr[2], (MaterialButton) objArr[4], (MaterialCardView) objArr[1], (TextInputLayout) objArr[5], (TextInputEditText) objArr[6], (MaterialTextView) objArr[3]);
        this.A0 = -1L;
        this.q0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.x0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        this.y0 = new sbc(this, 2);
        this.z0 = new jbc(this, 1);
        mo16291G();
    }
}
