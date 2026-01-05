package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class cg7 extends bg7 {
    public static final ewi.C13274i O0 = null;
    public static final SparseIntArray P0;
    public final ConstraintLayout L0;
    public boolean M0;
    public long N0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P0 = sparseIntArray;
        sparseIntArray.put(z8e.fragmentToolbar, 1);
        sparseIntArray.put(z8e.actionBack, 2);
        sparseIntArray.put(z8e.leadTitle, 3);
        sparseIntArray.put(z8e.constrain_top, 4);
        sparseIntArray.put(z8e.addedLeadProfilePic, 5);
        sparseIntArray.put(z8e.guideLine, 6);
        sparseIntArray.put(z8e.tv_name, 7);
        sparseIntArray.put(z8e.tv_destination, 8);
        sparseIntArray.put(z8e.tv_lead_owner, 9);
        sparseIntArray.put(z8e.lead_owner_name, 10);
        sparseIntArray.put(z8e.leadText, 11);
        sparseIntArray.put(z8e.addQuickCall, 12);
        sparseIntArray.put(z8e.addQuickNote, 13);
        sparseIntArray.put(z8e.viewQuickNote, 14);
        sparseIntArray.put(z8e.addLogVisit, 15);
        sparseIntArray.put(z8e.viewLogVisit, 16);
        sparseIntArray.put(z8e.addNextStep, 17);
        sparseIntArray.put(z8e.viewNextStep, 18);
        sparseIntArray.put(z8e.addContact, 19);
        sparseIntArray.put(z8e.viewContact, 20);
        sparseIntArray.put(z8e.addSendMessage, 21);
        sparseIntArray.put(z8e.viewSendMessage, 22);
        sparseIntArray.put(z8e.addAnotherContact, 23);
        sparseIntArray.put(z8e.viewAnotherContact, 24);
    }

    public cg7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 25, O0, P0));
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
            this.N0 = 1L;
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
            j = this.N0;
            this.N0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            ConstraintLayout constraintLayout = this.L0;
            boolean z = this.M0;
            wh1.m54388b(constraintLayout, false, z, false, z, false, true, false, true);
        }
        if (j2 != 0) {
            this.M0 = true;
        }
    }

    public cg7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[2], (MaterialTextView) objArr[23], (MaterialTextView) objArr[19], (MaterialTextView) objArr[15], (MaterialTextView) objArr[17], (MaterialTextView) objArr[12], (MaterialTextView) objArr[13], (MaterialTextView) objArr[21], (ShapeableImageView) objArr[5], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[1], (Guideline) objArr[6], (MaterialTextView) objArr[10], (MaterialTextView) objArr[11], (MaterialTextView) objArr[3], (MaterialTextView) objArr[8], (MaterialTextView) objArr[9], (MaterialTextView) objArr[7], (View) objArr[24], (View) objArr[20], (View) objArr[16], (View) objArr[18], (View) objArr[14], (View) objArr[22]);
        this.N0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
