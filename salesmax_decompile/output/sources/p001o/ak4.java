package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class ak4 extends zj4 {
    public static final ewi.C13274i D0 = null;
    public static final SparseIntArray E0;
    public final ConstraintLayout A0;
    public boolean B0;
    public long C0;
    public final NestedScrollView z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(z8e.settingsToolbar, 2);
        sparseIntArray.put(z8e.settingsBack, 3);
        sparseIntArray.put(z8e.allProperties, 4);
        sparseIntArray.put(z8e.callOutcomeDefaultOptions, 5);
        sparseIntArray.put(z8e.visitOutcomeDefaultOptions, 6);
        sparseIntArray.put(z8e.leadTypeOptions, 7);
        sparseIntArray.put(z8e.taskCustomization, 8);
        sparseIntArray.put(z8e.taskCustomizationMessage, 9);
        sparseIntArray.put(z8e.dealCustomization, 10);
        sparseIntArray.put(z8e.dealCustomizationMessage, 11);
        sparseIntArray.put(z8e.customForms, 12);
        sparseIntArray.put(z8e.customChatLabels, 13);
    }

    public ak4(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 14, D0, E0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.C0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.C0 = 1L;
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
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.C0;
            this.C0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            ConstraintLayout constraintLayout = this.A0;
            boolean z = this.B0;
            wh1.m54388b(constraintLayout, z, z, z, z, true, true, true, true);
        }
        if (j2 != 0) {
            this.B0 = true;
        }
    }

    public ak4(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[4], (MaterialButton) objArr[5], (MaterialButton) objArr[13], (MaterialButton) objArr[12], (MaterialButton) objArr[10], (MaterialTextView) objArr[11], (MaterialButton) objArr[7], (ShapeableImageView) objArr[3], (MaterialCardView) objArr[2], (MaterialButton) objArr[8], (MaterialTextView) objArr[9], (MaterialButton) objArr[6]);
        this.C0 = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.z0 = nestedScrollView;
        nestedScrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.A0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
