package p001o;

import ai.salesmax.model.TaskTypeDefinition;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.HorizontalScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class s40 extends r40 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i O0 = null;
    public static final SparseIntArray P0;
    public final MaterialCardView K0;
    public final View.OnClickListener L0;
    public final View.OnLongClickListener M0;
    public long N0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 4);
        sparseIntArray.put(z8e.title, 5);
        sparseIntArray.put(z8e.buttonDone, 6);
        sparseIntArray.put(z8e.taskTypeLayout, 7);
        sparseIntArray.put(z8e.taskTypeDescriptionLayout, 8);
        sparseIntArray.put(z8e.taskDistributionLayout, 9);
        sparseIntArray.put(z8e.taskDistributionSpinner, 10);
        sparseIntArray.put(z8e.tvTaskActivityTypes, 11);
        sparseIntArray.put(z8e.tvNoteOutComeNext, 12);
        sparseIntArray.put(z8e.taskActivityTypesChipGroup, 13);
        sparseIntArray.put(z8e.chipCall, 14);
        sparseIntArray.put(z8e.chipVisit, 15);
        sparseIntArray.put(z8e.chipVideoCall, 16);
        sparseIntArray.put(z8e.chipMessage, 17);
        sparseIntArray.put(z8e.taskAutoCloseLayout, 18);
        sparseIntArray.put(z8e.taskAutoClose, 19);
        sparseIntArray.put(z8e.buttonAddOption, 20);
    }

    public s40(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 21, O0, P0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.N0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.N0 = 8L;
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
        ck6 ck6Var = this.J0;
        TaskTypeDefinition taskTypeDefinition = this.H0;
        Integer num = this.I0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), taskTypeDefinition);
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
            j0((TaskTypeDefinition) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.J0;
        TaskTypeDefinition taskTypeDefinition = this.H0;
        Integer num = this.I0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), taskTypeDefinition);
        }
    }

    @Override // p001o.r40
    public void j0(TaskTypeDefinition taskTypeDefinition) {
        this.H0 = taskTypeDefinition;
        synchronized (this) {
            this.N0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.J0 = ck6Var;
        synchronized (this) {
            this.N0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.I0 = num;
        synchronized (this) {
            this.N0 |= 1;
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
            j = this.N0;
            this.N0 = 0L;
        }
        TaskTypeDefinition taskTypeDefinition = this.H0;
        long j2 = 12 & j;
        if (j2 == 0 || taskTypeDefinition == null) {
            description = null;
            name = null;
        } else {
            description = taskTypeDefinition.getDescription();
            name = taskTypeDefinition.getName();
        }
        if ((j & 8) != 0) {
            this.u0.setOnClickListener(this.L0);
            this.u0.setOnLongClickListener(this.M0);
        }
        if (j2 != 0) {
            fjh.m26938c(this.A0, name);
            fjh.m26938c(this.B0, description);
        }
    }

    public s40(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[20], (MaterialButton) objArr[4], (MaterialButton) objArr[6], (Chip) objArr[14], (Chip) objArr[17], (Chip) objArr[16], (Chip) objArr[15], (MaterialCardView) objArr[1], (ChipGroup) objArr[13], (TextInputEditText) objArr[19], (TextInputLayout) objArr[18], (TextInputLayout) objArr[9], (AutoCompleteTextView) objArr[10], (TextInputEditText) objArr[2], (TextInputEditText) objArr[3], (TextInputLayout) objArr[8], (TextInputLayout) objArr[7], (MaterialTextView) objArr[5], (HorizontalScrollView) objArr[12], (MaterialTextView) objArr[11]);
        this.N0 = -1L;
        this.u0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.K0 = materialCardView;
        materialCardView.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        a0(view);
        this.L0 = new jbc(this, 1);
        this.M0 = new sbc(this, 2);
        mo16291G();
    }
}
