package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class fof extends eof {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public final LinearLayout w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.sheetEditContact, 1);
        sparseIntArray.put(z8e.itemIcon_edit, 2);
        sparseIntArray.put(z8e.itemName_edit, 3);
        sparseIntArray.put(z8e.sheetAssignLead, 4);
        sparseIntArray.put(z8e.itemIcon_assign, 5);
        sparseIntArray.put(z8e.itemName_assign, 6);
        sparseIntArray.put(z8e.sheetDeleteContact, 7);
        sparseIntArray.put(z8e.itemIcon_delete, 8);
        sparseIntArray.put(z8e.itemName_visit, 9);
    }

    public fof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 10, y0, z0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.x0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.x0 = 1L;
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
            this.x0 = 0L;
        }
    }

    public fof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[5], (MaterialButton) objArr[8], (MaterialButton) objArr[2], (MaterialTextView) objArr[6], (MaterialTextView) objArr[3], (MaterialTextView) objArr[9], (LinearLayout) objArr[4], (LinearLayout) objArr[7], (LinearLayout) objArr[1]);
        this.x0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.w0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
