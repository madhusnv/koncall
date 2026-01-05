package p001o;

import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;
import p001o.ewi;

/* loaded from: classes.dex */
public class tnf extends snf {
    public static final ewi.C13274i J0;
    public static final SparseIntArray K0;
    public final ConstraintLayout F0;
    public final ConstraintLayout G0;
    public boolean H0;
    public long I0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(17);
        J0 = c13274i;
        c13274i.m25699a(1, new String[]{"item_lead"}, new int[]{2}, new int[]{p9e.item_lead});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K0 = sparseIntArray;
        sparseIntArray.put(z8e.tvUserStatusTitle, 3);
        sparseIntArray.put(z8e.userStatusClose, 4);
        sparseIntArray.put(z8e.dialerExplanation, 5);
        sparseIntArray.put(z8e.dialerExplanationText, 6);
        sparseIntArray.put(z8e.viewedDialerExplanationButton, 7);
        sparseIntArray.put(z8e.singIn_inputViewGroup, 8);
        sparseIntArray.put(z8e.ccp, 9);
        sparseIntArray.put(z8e.phoneNumber, 10);
        sparseIntArray.put(z8e.dialName, 11);
        sparseIntArray.put(z8e.alreadyExists, 12);
        sparseIntArray.put(z8e.cloudCallButton, 13);
        sparseIntArray.put(z8e.singInActionButton, 14);
        sparseIntArray.put(z8e.singInActionButton2, 15);
        sparseIntArray.put(z8e.newLeadWhatsappButton, 16);
    }

    public tnf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 17, J0, K0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.I0 != 0) {
                return true;
            }
            return this.t0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.I0 = 16L;
        }
        this.t0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((xz8) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (27 == i) {
            j0((Leads) obj);
        } else if (73 == i) {
            m0((Integer) obj);
        } else {
            if (33 != i) {
                return false;
            }
            l0((ck6) obj);
        }
        return true;
    }

    @Override // p001o.snf
    public void j0(Leads leads) {
        this.C0 = leads;
        synchronized (this) {
            this.I0 |= 2;
        }
        m28509h(27);
        super.m25692R();
    }

    public final boolean k0(xz8 xz8Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.I0 |= 1;
        }
        return true;
    }

    public void l0(ck6 ck6Var) {
        this.E0 = ck6Var;
    }

    public void m0(Integer num) {
        this.D0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.I0;
            this.I0 = 0L;
        }
        Leads leads = this.C0;
        long j2 = j & 18;
        int i = 0;
        if (j2 != 0) {
            boolean z = leads == null;
            if (j2 != 0) {
                j |= z ? 64L : 32L;
            }
            if (z) {
                i = 8;
            }
        }
        if ((18 & j) != 0) {
            this.t0.m25689B().setVisibility(i);
            this.t0.h0(leads);
        }
        long j3 = j & 16;
        if (j3 != 0) {
            wh1.m54389c(this.F0, this.H0, true);
        }
        if (j3 != 0) {
            this.H0 = true;
        }
        ewi.m25683r(this.t0);
    }

    public tnf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (MaterialTextView) objArr[12], (CountryCodePicker) objArr[9], (MaterialButton) objArr[13], (TextInputEditText) objArr[11], (MaterialCardView) objArr[5], (MaterialTextView) objArr[6], (xz8) objArr[2], (MaterialButton) objArr[16], (TextInputEditText) objArr[10], (MaterialButton) objArr[14], (MaterialButton) objArr[15], (LinearLayout) objArr[8], (MaterialTextView) objArr[3], (ShapeableImageView) objArr[4], (MaterialButton) objArr[7]);
        this.I0 = -1L;
        m25693Z(this.t0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.G0 = constraintLayout2;
        constraintLayout2.setTag(null);
        a0(view);
        mo16291G();
    }
}
