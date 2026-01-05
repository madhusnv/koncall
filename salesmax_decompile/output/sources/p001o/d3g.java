package p001o;

import ai.salesmax.model.FormFields;
import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class d3g extends c3g {
    public static final ewi.C13274i E0;
    public static final SparseIntArray F0;
    public final FrameLayout B0;
    public final ConstraintLayout C0;
    public long D0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(12);
        E0 = c13274i;
        c13274i.m25699a(2, new String[]{"content_custom_form"}, new int[]{4}, new int[]{p9e.content_custom_form});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(z8e.contentCallDataParent, 5);
        sparseIntArray.put(z8e.buttonDone, 6);
        sparseIntArray.put(z8e.leadDetailsClose, 7);
        sparseIntArray.put(z8e.leadDetailsNumber, 8);
        sparseIntArray.put(z8e.leadDetailsBorder1, 9);
        sparseIntArray.put(z8e.noCustomPropertyText, 10);
        sparseIntArray.put(z8e.callOutcome_ActionButton, 11);
    }

    public d3g(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, E0, F0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.D0 != 0) {
                return true;
            }
            return this.q0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.D0 = 32L;
        }
        this.q0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return n0((r14) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (19 == i) {
            k0((FormFields) obj);
        } else if (33 == i) {
            l0((ck6) obj);
        } else if (73 == i) {
            p0((Integer) obj);
        } else {
            if (61 != i) {
                return false;
            }
            m0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.c3g
    public void k0(FormFields formFields) {
        this.y0 = formFields;
        synchronized (this) {
            this.D0 |= 2;
        }
        m28509h(19);
        super.m25692R();
    }

    @Override // p001o.c3g
    public void l0(ck6 ck6Var) {
        this.A0 = ck6Var;
        synchronized (this) {
            this.D0 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    @Override // p001o.c3g
    public void m0(Leads leads) {
        this.x0 = leads;
        synchronized (this) {
            this.D0 |= 16;
        }
        m28509h(61);
        super.m25692R();
    }

    public final boolean n0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.D0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.D0;
            this.D0 = 0L;
        }
        FormFields formFields = this.y0;
        ck6 ck6Var = this.A0;
        Integer num = this.z0;
        Leads leads = this.x0;
        long j2 = 34 & j;
        long j3 = 36 & j;
        long j4 = 40 & j;
        long j5 = j & 48;
        String name = (j5 == 0 || leads == null) ? null : leads.getName();
        if (j2 != 0) {
            this.q0.i0(formFields);
        }
        if (j3 != 0) {
            this.q0.h0(ck6Var);
        }
        if (j4 != 0) {
            this.q0.j0(num);
        }
        if (j5 != 0) {
            nr1.f1(this.t0, name);
            nr1.V0(this.v0, leads);
        }
        ewi.m25683r(this.q0);
    }

    public void p0(Integer num) {
        this.z0 = num;
        synchronized (this) {
            this.D0 |= 8;
        }
        m28509h(73);
        super.m25692R();
    }

    public d3g(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (MaterialButton) objArr[6], (MaterialButton) objArr[11], (MaterialCardView) objArr[5], (r14) objArr[4], (View) objArr[9], (MaterialButton) objArr[7], (MaterialTextView) objArr[3], (MaterialTextView) objArr[8], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[10]);
        this.D0 = -1L;
        m25693Z(this.q0);
        this.t0.setTag(null);
        this.v0.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.B0 = frameLayout;
        frameLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[2];
        this.C0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
