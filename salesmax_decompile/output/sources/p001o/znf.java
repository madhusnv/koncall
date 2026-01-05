package p001o;

import ai.salesmax.model.LeadFilter;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class znf extends ynf {
    public static final ewi.C13274i W0 = null;
    public static final SparseIntArray X0;
    public final ConstraintLayout T0;
    public boolean U0;
    public long V0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonSetting, 2);
        sparseIntArray.put(z8e.filterSheetTitle, 3);
        sparseIntArray.put(z8e.buttonCancel, 4);
        sparseIntArray.put(z8e.addLeadSourceLayout, 5);
        sparseIntArray.put(z8e.addLeadSource, 6);
        sparseIntArray.put(z8e.mLeadSourceClose, 7);
        sparseIntArray.put(z8e.addLeadSourceDrillDownOneSearch, 8);
        sparseIntArray.put(z8e.addLeadSourceDrillDownOneLayout, 9);
        sparseIntArray.put(z8e.addLeadSourceDrillDownOne, 10);
        sparseIntArray.put(z8e.mLeadSourceDrillDownOneClose, 11);
        sparseIntArray.put(z8e.addLeadTeamSearch, 12);
        sparseIntArray.put(z8e.addLeadTeamLayout, 13);
        sparseIntArray.put(z8e.addLeadTeam, 14);
        sparseIntArray.put(z8e.mLeadTeamClose, 15);
        sparseIntArray.put(z8e.addLeadUserSearch, 16);
        sparseIntArray.put(z8e.addLeadUserLayout, 17);
        sparseIntArray.put(z8e.addLeadUser, 18);
        sparseIntArray.put(z8e.mLeadUserClose, 19);
        sparseIntArray.put(z8e.userTagsMessage, 20);
        sparseIntArray.put(z8e.rvFilterUserTags, 21);
        sparseIntArray.put(z8e.lastLeadAssignedMessage, 22);
        sparseIntArray.put(z8e.btnLastAssignedFrom, 23);
        sparseIntArray.put(z8e.btnLastAssignedTo, 24);
        sparseIntArray.put(z8e.lastLeadCreatedMessage, 25);
        sparseIntArray.put(z8e.btnLastCreatedFrom, 26);
        sparseIntArray.put(z8e.btnLastCreatedTo, 27);
        sparseIntArray.put(z8e.itemLeadRoot, 28);
        sparseIntArray.put(z8e.buttonClear, 29);
        sparseIntArray.put(z8e.buttonDone, 30);
    }

    public znf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 31, W0, X0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.V0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.V0 = 4L;
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
        if (47 == i) {
            k0(((Boolean) obj).booleanValue());
        } else {
            if (67 != i) {
                return false;
            }
            l0((LeadFilter) obj);
        }
        return true;
    }

    @Override // p001o.ynf
    public void k0(boolean z) {
        this.S0 = z;
        synchronized (this) {
            this.V0 |= 1;
        }
        m28509h(47);
        super.m25692R();
    }

    @Override // p001o.ynf
    public void l0(LeadFilter leadFilter) {
        this.R0 = leadFilter;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.V0;
            this.V0 = 0L;
        }
        boolean z = this.S0;
        long j2 = j & 5;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 16L : 8L;
            }
            if (z) {
                i = 8;
            }
        }
        if ((j & 5) != 0) {
            this.s0.setVisibility(i);
        }
        long j3 = j & 4;
        if (j3 != 0) {
            wh1.m54389c(this.T0, this.U0, true);
        }
        if (j3 != 0) {
            this.U0 = true;
        }
    }

    public znf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppCompatAutoCompleteTextView) objArr[6], (AppCompatAutoCompleteTextView) objArr[10], (TextInputLayout) objArr[9], (ConstraintLayout) objArr[8], (TextInputLayout) objArr[5], (ConstraintLayout) objArr[1], (AppCompatAutoCompleteTextView) objArr[14], (TextInputLayout) objArr[13], (ConstraintLayout) objArr[12], (AppCompatAutoCompleteTextView) objArr[18], (TextInputLayout) objArr[17], (ConstraintLayout) objArr[16], (Button) objArr[23], (Button) objArr[24], (Button) objArr[26], (Button) objArr[27], (ShapeableImageView) objArr[4], (MaterialButton) objArr[29], (MaterialButton) objArr[30], (ShapeableImageView) objArr[2], (MaterialTextView) objArr[3], (MaterialCardView) objArr[28], (MaterialTextView) objArr[22], (MaterialTextView) objArr[25], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[11], (AppCompatImageView) objArr[15], (AppCompatImageView) objArr[19], (RecyclerView) objArr[21], (MaterialTextView) objArr[20]);
        this.V0 = -1L;
        this.s0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.T0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
