package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class zof extends yof {
    public static final ewi.C13274i v0 = null;
    public static final SparseIntArray w0;
    public final LinearLayout t0;
    public long u0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        w0 = sparseIntArray;
        sparseIntArray.put(z8e.sheetAssignTask, 1);
        sparseIntArray.put(z8e.assigneeProfilePic, 2);
        sparseIntArray.put(z8e.assigneeName, 3);
        sparseIntArray.put(z8e.sheetDeleteTask, 4);
        sparseIntArray.put(z8e.deletePic, 5);
        sparseIntArray.put(z8e.deleteName, 6);
    }

    public zof(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, v0, w0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.u0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.u0 = 1L;
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
            this.u0 = 0L;
        }
    }

    public zof(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[3], (MaterialButton) objArr[2], (MaterialTextView) objArr[6], (MaterialButton) objArr[5], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[4]);
        this.u0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.t0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
