package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class dpf extends cpf {
    public static final ewi.C13274i K0;
    public static final SparseIntArray L0;
    public final ConstraintLayout B0;
    public final ConstraintLayout C0;
    public final LinearLayout D0;
    public final z44 E0;
    public final z44 F0;
    public final z44 G0;
    public final z44 H0;
    public final z44 I0;
    public long J0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(21);
        K0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_no_template"}, new int[]{8}, new int[]{p9e.content_no_template});
        int i = p9e.content_shimmer_comment;
        c13274i.m25699a(2, new String[]{"content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment"}, new int[]{3, 4, 5, 6, 7}, new int[]{i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L0 = sparseIntArray;
        sparseIntArray.put(z8e.tvTemplatesSearchLayout, 9);
        sparseIntArray.put(z8e.tvTemplatesSearchText, 10);
        sparseIntArray.put(z8e.templatesClose, 11);
        sparseIntArray.put(z8e.seeAllTemplates, 12);
        sparseIntArray.put(z8e.shimmerLayout, 13);
        sparseIntArray.put(z8e.speechToTextMessage, 14);
        sparseIntArray.put(z8e.rvTemplateTypeList, 15);
        sparseIntArray.put(z8e.templateTypeSelection, 16);
        sparseIntArray.put(z8e.templateType1, 17);
        sparseIntArray.put(z8e.templateType2, 18);
        sparseIntArray.put(z8e.templateType3, 19);
        sparseIntArray.put(z8e.rvTemplatesList, 20);
    }

    public dpf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 21, K0, L0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.J0 != 0) {
                return true;
            }
            return this.E0.mo16290E() || this.F0.mo16290E() || this.G0.mo16290E() || this.H0.mo16290E() || this.I0.mo16290E() || this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.J0 = 4L;
        }
        this.E0.mo16291G();
        this.F0.mo16291G();
        this.G0.mo16291G();
        this.H0.mo16291G();
        this.I0.mo16291G();
        this.n0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((l44) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (87 != i) {
            return false;
        }
        j0(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // p001o.cpf
    public void j0(boolean z) {
        this.A0 = z;
        synchronized (this) {
            this.J0 |= 2;
        }
        m28509h(87);
        super.m25692R();
    }

    public final boolean k0(l44 l44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.J0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.J0;
            this.J0 = 0L;
        }
        boolean z = this.A0;
        if ((j & 6) != 0) {
            this.n0.i0(z);
        }
        ewi.m25683r(this.E0);
        ewi.m25683r(this.F0);
        ewi.m25683r(this.G0);
        ewi.m25683r(this.H0);
        ewi.m25683r(this.I0);
        ewi.m25683r(this.n0);
    }

    public dpf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (l44) objArr[8], (HorizontalScrollView) objArr[15], (RecyclerView) objArr[20], (MaterialTextView) objArr[12], (ShimmerFrameLayout) objArr[13], (ShapeableImageView) objArr[14], (Chip) objArr[17], (Chip) objArr[18], (Chip) objArr[19], (ChipGroup) objArr[16], (ShapeableImageView) objArr[11], (TextInputLayout) objArr[9], (TextInputEditText) objArr[10]);
        this.J0 = -1L;
        m25693Z(this.n0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.B0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.C0 = constraintLayout2;
        constraintLayout2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.D0 = linearLayout;
        linearLayout.setTag(null);
        z44 z44Var = (z44) objArr[3];
        this.E0 = z44Var;
        m25693Z(z44Var);
        z44 z44Var2 = (z44) objArr[4];
        this.F0 = z44Var2;
        m25693Z(z44Var2);
        z44 z44Var3 = (z44) objArr[5];
        this.G0 = z44Var3;
        m25693Z(z44Var3);
        z44 z44Var4 = (z44) objArr[6];
        this.H0 = z44Var4;
        m25693Z(z44Var4);
        z44 z44Var5 = (z44) objArr[7];
        this.I0 = z44Var5;
        m25693Z(z44Var5);
        a0(view);
        mo16291G();
    }
}
