package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class jpf extends ipf {
    public static final ewi.C13274i H0;
    public static final SparseIntArray I0;
    public final LinearLayout A0;
    public final z44 B0;
    public final z44 C0;
    public final z44 D0;
    public final z44 E0;
    public final z44 F0;
    public long G0;
    public final ConstraintLayout y0;
    public final ConstraintLayout z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(18);
        H0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_no_document"}, new int[]{8}, new int[]{p9e.content_no_document});
        int i = p9e.content_shimmer_comment;
        c13274i.m25699a(2, new String[]{"content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment", "content_shimmer_comment"}, new int[]{3, 4, 5, 6, 7}, new int[]{i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(z8e.fileUploadButton, 9);
        sparseIntArray.put(z8e.searchGlobalEditTextLayout, 10);
        sparseIntArray.put(z8e.searchGlobalEditText, 11);
        sparseIntArray.put(z8e.templatesClose, 12);
        sparseIntArray.put(z8e.rvDocType, 13);
        sparseIntArray.put(z8e.rvDocSubType, 14);
        sparseIntArray.put(z8e.shimmerLayout, 15);
        sparseIntArray.put(z8e.rvDocumentList, 16);
        sparseIntArray.put(z8e.fileUploadActionButton, 17);
    }

    public jpf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 18, H0, I0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.G0 != 0) {
                return true;
            }
            return this.B0.mo16290E() || this.C0.mo16290E() || this.D0.mo16290E() || this.E0.mo16290E() || this.F0.mo16290E() || this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G0 = 4L;
        }
        this.B0.mo16291G();
        this.C0.mo16291G();
        this.D0.mo16291G();
        this.E0.mo16291G();
        this.F0.mo16291G();
        this.n0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((j34) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (87 != i) {
            return false;
        }
        j0(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // p001o.ipf
    public void j0(boolean z) {
        this.x0 = z;
        synchronized (this) {
            this.G0 |= 2;
        }
        m28509h(87);
        super.m25692R();
    }

    public final boolean k0(j34 j34Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.G0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.G0;
            this.G0 = 0L;
        }
        boolean z = this.x0;
        if ((j & 6) != 0) {
            this.n0.h0(z);
        }
        ewi.m25683r(this.B0);
        ewi.m25683r(this.C0);
        ewi.m25683r(this.D0);
        ewi.m25683r(this.E0);
        ewi.m25683r(this.F0);
        ewi.m25683r(this.n0);
    }

    public jpf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (j34) objArr[8], (MaterialButton) objArr[17], (ShapeableImageView) objArr[9], (RecyclerView) objArr[14], (RecyclerView) objArr[13], (RecyclerView) objArr[16], (TextInputEditText) objArr[11], (TextInputLayout) objArr[10], (ShimmerFrameLayout) objArr[15], (ShapeableImageView) objArr[12]);
        this.G0 = -1L;
        m25693Z(this.n0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.y0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.z0 = constraintLayout2;
        constraintLayout2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.A0 = linearLayout;
        linearLayout.setTag(null);
        z44 z44Var = (z44) objArr[3];
        this.B0 = z44Var;
        m25693Z(z44Var);
        z44 z44Var2 = (z44) objArr[4];
        this.C0 = z44Var2;
        m25693Z(z44Var2);
        z44 z44Var3 = (z44) objArr[5];
        this.D0 = z44Var3;
        m25693Z(z44Var3);
        z44 z44Var4 = (z44) objArr[6];
        this.E0 = z44Var4;
        m25693Z(z44Var4);
        z44 z44Var5 = (z44) objArr[7];
        this.F0 = z44Var5;
        m25693Z(z44Var5);
        a0(view);
        mo16291G();
    }
}
