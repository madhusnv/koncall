package p001o;

import ai.salesmax.model.PropertyDefinition;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class jw extends iw {
    public static final ewi.C13274i N0 = null;
    public static final SparseIntArray O0;
    public final MaterialCardView L0;
    public long M0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 5);
        sparseIntArray.put(z8e.title, 6);
        sparseIntArray.put(z8e.buttonDone, 7);
        sparseIntArray.put(z8e.objectTypeContainer, 8);
        sparseIntArray.put(z8e.objectTypeSpinner, 9);
        sparseIntArray.put(z8e.propertyNameLayout, 10);
        sparseIntArray.put(z8e.propertyDescriptionLayout, 11);
        sparseIntArray.put(z8e.propertyTypeTitle, 12);
        sparseIntArray.put(z8e.propertyTypeContainer, 13);
        sparseIntArray.put(z8e.propertyTypeText, 14);
        sparseIntArray.put(z8e.propertyTypeNumber, 15);
        sparseIntArray.put(z8e.propertyTypeBoolean, 16);
        sparseIntArray.put(z8e.propertyTypeDateTime, 17);
        sparseIntArray.put(z8e.propertyTypeOptions, 18);
        sparseIntArray.put(z8e.addOption, 19);
        sparseIntArray.put(z8e.optionList, 20);
        sparseIntArray.put(z8e.isMultiple, 21);
    }

    public jw(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 22, N0, O0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.M0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.M0 = 8L;
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
        if (73 == i) {
            l0((Integer) obj);
        } else if (33 == i) {
            k0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((PropertyDefinition) obj);
        }
        return true;
    }

    @Override // p001o.iw
    public void j0(PropertyDefinition propertyDefinition) {
        this.I0 = propertyDefinition;
        synchronized (this) {
            this.M0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.K0 = ck6Var;
    }

    public void l0(Integer num) {
        this.J0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String displayName;
        String description;
        synchronized (this) {
            j = this.M0;
            this.M0 = 0L;
        }
        PropertyDefinition propertyDefinition = this.I0;
        long j2 = j & 12;
        String scalarType = null;
        if (j2 != 0) {
            if (propertyDefinition != null) {
                scalarType = propertyDefinition.getScalarType();
                displayName = propertyDefinition.getDisplayName();
                description = propertyDefinition.getDescription();
            } else {
                description = null;
                displayName = null;
            }
            boolean z = scalarType == "Options";
            if (j2 != 0) {
                j |= z ? 32L : 16L;
            }
            i = z ? 0 : 8;
            scalarType = description;
        } else {
            displayName = null;
        }
        if ((j & 12) != 0) {
            this.o0.setVisibility(i);
            this.p0.setVisibility(i);
            fjh.m26938c(this.w0, scalarType);
            fjh.m26938c(this.y0, displayName);
        }
    }

    public jw(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextInputEditText) objArr[19], (TextInputLayout) objArr[3], (MaterialButton) objArr[4], (MaterialButton) objArr[5], (MaterialButton) objArr[7], (MaterialSwitch) objArr[21], (TextInputLayout) objArr[8], (AutoCompleteTextView) objArr[9], (RecyclerView) objArr[20], (TextInputEditText) objArr[2], (TextInputLayout) objArr[11], (TextInputEditText) objArr[1], (TextInputLayout) objArr[10], (Button) objArr[16], (MaterialButtonToggleGroup) objArr[13], (Button) objArr[17], (Button) objArr[15], (Button) objArr[18], (Button) objArr[14], (MaterialTextView) objArr[12], (MaterialTextView) objArr[6]);
        this.M0 = -1L;
        this.o0.setTag(null);
        this.p0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.L0 = materialCardView;
        materialCardView.setTag(null);
        this.w0.setTag(null);
        this.y0.setTag(null);
        a0(view);
        mo16291G();
    }
}
