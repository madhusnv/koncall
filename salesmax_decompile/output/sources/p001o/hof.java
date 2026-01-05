package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class hof extends gof {
    public static final ewi.C13274i E0 = null;
    public static final SparseIntArray F0;
    public final LinearLayout C0;
    public long D0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(z8e.sheetAddTagTemplate, 1);
        sparseIntArray.put(z8e.addTagTemplate, 2);
        sparseIntArray.put(z8e.addTag, 3);
        sparseIntArray.put(z8e.sheetSendMultipleTemplate, 4);
        sparseIntArray.put(z8e.sendMultipleTemplate, 5);
        sparseIntArray.put(z8e.sendTemplate, 6);
        sparseIntArray.put(z8e.sheetAssignLead, 7);
        sparseIntArray.put(z8e.assigneeProfilePic, 8);
        sparseIntArray.put(z8e.assigneeName, 9);
        sparseIntArray.put(z8e.sheetDeleteContact, 10);
        sparseIntArray.put(z8e.deletePic, 11);
        sparseIntArray.put(z8e.deleteName, 12);
        sparseIntArray.put(z8e.sheetCloseContact, 13);
        sparseIntArray.put(z8e.closePic, 14);
        sparseIntArray.put(z8e.closeName, 15);
    }

    public hof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 16, E0, F0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.D0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.D0 = 1L;
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
            this.D0 = 0L;
        }
    }

    public hof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[3], (MaterialButton) objArr[2], (MaterialTextView) objArr[9], (MaterialButton) objArr[8], (MaterialTextView) objArr[15], (MaterialButton) objArr[14], (MaterialTextView) objArr[12], (MaterialButton) objArr[11], (MaterialButton) objArr[5], (MaterialTextView) objArr[6], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[7], (ConstraintLayout) objArr[13], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[4]);
        this.D0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.C0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
