package p001o;

import ai.salesmax.view.MentionAutoCompleteTextView;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class g54 extends f54 {
    public static final ewi.C13274i F0 = null;
    public static final SparseIntArray G0;
    public final ConstraintLayout D0;
    public long E0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G0 = sparseIntArray;
        sparseIntArray.put(z8e.ivContactProfilePic, 1);
        sparseIntArray.put(z8e.tvContactName, 2);
        sparseIntArray.put(z8e.tvContactNumber, 3);
        sparseIntArray.put(z8e.leadDetailsButtonGroup, 4);
        sparseIntArray.put(z8e.taskDelete, 5);
        sparseIntArray.put(z8e.taskEdit, 6);
        sparseIntArray.put(z8e.taskUpdate, 7);
        sparseIntArray.put(z8e.taskComplete, 8);
        sparseIntArray.put(z8e.taskStatus, 9);
        sparseIntArray.put(z8e.taskDetailsBorder1, 10);
        sparseIntArray.put(z8e.taskDetails, 11);
        sparseIntArray.put(z8e.taskUpdatesTitle, 12);
        sparseIntArray.put(z8e.taskUpdatesTitle2, 13);
        sparseIntArray.put(z8e.taskDetailsBorderBottom, 14);
        sparseIntArray.put(z8e.taskCommentTextInputLayout, 15);
        sparseIntArray.put(z8e.taskCommentEditText, 16);
    }

    public g54(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 17, F0, G0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.E0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.E0 = 1L;
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
            this.E0 = 0L;
        }
    }

    public g54(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[1], (LinearLayout) objArr[4], (MentionAutoCompleteTextView) objArr[16], (TextInputLayout) objArr[15], (MaterialButton) objArr[8], (MaterialButton) objArr[5], (ConstraintLayout) objArr[11], (View) objArr[10], (View) objArr[14], (MaterialButton) objArr[6], (MaterialButton) objArr[9], (MaterialButton) objArr[7], (MaterialTextView) objArr[12], (MaterialTextView) objArr[13], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.E0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
