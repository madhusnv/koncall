package p001o;

import ai.salesmax.model.DealStageDefinition;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class nw extends mw implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i L0 = null;
    public static final SparseIntArray M0;
    public final MaterialCardView H0;
    public final View.OnLongClickListener I0;
    public final View.OnClickListener J0;
    public long K0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 4);
        sparseIntArray.put(z8e.title, 5);
        sparseIntArray.put(z8e.buttonDone, 6);
        sparseIntArray.put(z8e.dealStageNameLayout, 7);
        sparseIntArray.put(z8e.dealStageDescriptionLayout, 8);
        sparseIntArray.put(z8e.isFinalStepTitleText, 9);
        sparseIntArray.put(z8e.toggleGroup, 10);
        sparseIntArray.put(z8e.btnTerminateInWin, 11);
        sparseIntArray.put(z8e.btnTerminateInLoss, 12);
        sparseIntArray.put(z8e.createOnSuccessfullTaskText, 13);
        sparseIntArray.put(z8e.rvTaskListOnSuccess, 14);
        sparseIntArray.put(z8e.createOnFailureTaskText, 15);
        sparseIntArray.put(z8e.rvTaskListOnFailure, 16);
        sparseIntArray.put(z8e.buttonAddOption, 17);
    }

    public nw(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 18, L0, M0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.K0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.K0 = 8L;
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
        ck6 ck6Var = this.G0;
        DealStageDefinition dealStageDefinition = this.E0;
        Integer num = this.F0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), dealStageDefinition);
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
            j0((DealStageDefinition) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.G0;
        DealStageDefinition dealStageDefinition = this.E0;
        Integer num = this.F0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), dealStageDefinition);
        }
    }

    @Override // p001o.mw
    public void j0(DealStageDefinition dealStageDefinition) {
        this.E0 = dealStageDefinition;
        synchronized (this) {
            this.K0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.G0 = ck6Var;
        synchronized (this) {
            this.K0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.F0 = num;
        synchronized (this) {
            this.K0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String description;
        String name;
        synchronized (this) {
            j = this.K0;
            this.K0 = 0L;
        }
        DealStageDefinition dealStageDefinition = this.E0;
        long j2 = 12 & j;
        if (j2 == 0 || dealStageDefinition == null) {
            description = null;
            name = null;
        } else {
            description = dealStageDefinition.getDescription();
            name = dealStageDefinition.getName();
        }
        if (j2 != 0) {
            fjh.m26938c(this.u0, description);
            fjh.m26938c(this.w0, name);
        }
        if ((j & 8) != 0) {
            this.y0.setOnClickListener(this.J0);
            this.y0.setOnLongClickListener(this.I0);
        }
    }

    public nw(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[12], (Button) objArr[11], (MaterialButton) objArr[17], (MaterialButton) objArr[4], (MaterialButton) objArr[6], (MaterialTextView) objArr[15], (MaterialTextView) objArr[13], (TextInputEditText) objArr[3], (TextInputLayout) objArr[8], (TextInputEditText) objArr[2], (TextInputLayout) objArr[7], (MaterialCardView) objArr[1], (MaterialTextView) objArr[9], (RecyclerView) objArr[16], (RecyclerView) objArr[14], (MaterialTextView) objArr[5], (MaterialButtonToggleGroup) objArr[10]);
        this.K0 = -1L;
        this.u0.setTag(null);
        this.w0.setTag(null);
        this.y0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.H0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        this.I0 = new sbc(this, 2);
        this.J0 = new jbc(this, 1);
        mo16291G();
    }
}
