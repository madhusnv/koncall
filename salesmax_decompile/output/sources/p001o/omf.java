package p001o;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class omf extends nmf {
    public static final ewi.C13274i B0 = null;
    public static final SparseIntArray C0;
    public long A0;
    public final ConstraintLayout y0;
    public boolean z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C0 = sparseIntArray;
        sparseIntArray.put(z8e.loginCard, 1);
        sparseIntArray.put(z8e.createNewTeamTitle, 2);
        sparseIntArray.put(z8e.createNewTeamClose, 3);
        sparseIntArray.put(z8e.AssignCollagueTxt, 4);
        sparseIntArray.put(z8e.mAutoCompleteCollague, 5);
        sparseIntArray.put(z8e.mACClose, 6);
        sparseIntArray.put(z8e.selectRoleText, 7);
        sparseIntArray.put(z8e.teamRoleToggleGroup, 8);
        sparseIntArray.put(z8e.btnTeamReportee, 9);
        sparseIntArray.put(z8e.btnTeamLead, 10);
        sparseIntArray.put(z8e.createTeamActionButton, 11);
    }

    public omf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, B0, C0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.A0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.A0 = 1L;
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
            j = this.A0;
            this.A0 = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            wh1.m54389c(this.y0, this.z0, true);
        }
        if (j2 != 0) {
            this.z0 = true;
        }
    }

    public omf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextInputLayout) objArr[4], (Button) objArr[10], (Button) objArr[9], (ShapeableImageView) objArr[3], (MaterialTextView) objArr[2], (MaterialButton) objArr[11], (MaterialCardView) objArr[1], (AppCompatImageView) objArr[6], (AppCompatAutoCompleteTextView) objArr[5], (MaterialTextView) objArr[7], (MaterialButtonToggleGroup) objArr[8]);
        this.A0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.y0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
