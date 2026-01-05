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
public class rv5 extends qv5 {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0;
    public final LinearLayout u0;
    public long v0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x0 = sparseIntArray;
        sparseIntArray.put(z8e.importUserToolbar, 1);
        sparseIntArray.put(z8e.importBack, 2);
        sparseIntArray.put(z8e.importContacts, 3);
        sparseIntArray.put(z8e.importSearchContact, 4);
        sparseIntArray.put(z8e.findPhoneContact, 5);
        sparseIntArray.put(z8e.importContactSelectAll, 6);
        sparseIntArray.put(z8e.rvImportContactList, 7);
    }

    public rv5(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, w0, x0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.v0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.v0 = 1L;
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
        synchronized (this) {
            this.v0 = 0L;
        }
    }

    public rv5(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextInputEditText) objArr[5], (ShapeableImageView) objArr[2], (MaterialButton) objArr[6], (MaterialButton) objArr[3], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[1], (RecyclerView) objArr[7]);
        this.v0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.u0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
