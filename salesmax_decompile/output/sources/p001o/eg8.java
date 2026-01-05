package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import p001o.ewi;

/* loaded from: classes.dex */
public class eg8 extends dg8 {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0;
    public final LinearLayout u0;
    public boolean v0;
    public long w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(z8e.importUserToolbar, 1);
        sparseIntArray.put(z8e.importBack, 2);
        sparseIntArray.put(z8e.importContactsButton, 3);
        sparseIntArray.put(z8e.importSearchContact, 4);
        sparseIntArray.put(z8e.findPhoneContact, 5);
        sparseIntArray.put(z8e.importContactSelectAll, 6);
        sparseIntArray.put(z8e.rvImportContactList, 7);
    }

    public eg8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, x0, y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.w0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.w0 = 1L;
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
            j = this.w0;
            this.w0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            LinearLayout linearLayout = this.u0;
            boolean z = this.v0;
            wh1.m54388b(linearLayout, z, z, z, z, true, true, true, true);
        }
        if (j2 != 0) {
            this.v0 = true;
        }
    }

    public eg8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextInputEditText) objArr[5], (ShapeableImageView) objArr[2], (MaterialButton) objArr[6], (MaterialButton) objArr[3], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[1], (RecyclerView) objArr[7]);
        this.w0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.u0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
