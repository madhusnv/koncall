package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class qnf extends pnf {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.createNewTeamTitle, 1);
        sparseIntArray.put(z8e.createNewTeamClose, 2);
        sparseIntArray.put(z8e.teamName, 3);
        sparseIntArray.put(z8e.teamDescription, 4);
        sparseIntArray.put(z8e.selfTeamLeader, 5);
        sparseIntArray.put(z8e.AssignCollagueTxt, 6);
        sparseIntArray.put(z8e.mAutoCompleteCollague, 7);
        sparseIntArray.put(z8e.mACClose, 8);
        sparseIntArray.put(z8e.createTeamActionButton, 9);
    }

    public qnf(yt4 yt4Var, View view) {
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

    public qnf(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextInputLayout) objArr[6], (ShapeableImageView) objArr[2], (MaterialTextView) objArr[1], (MaterialButton) objArr[9], (MaterialCardView) objArr[0], (AppCompatImageView) objArr[8], (AppCompatAutoCompleteTextView) objArr[7], (MaterialSwitch) objArr[5], (TextInputEditText) objArr[4], (TextInputEditText) objArr[3]);
        this.x0 = -1L;
        this.r0.setTag(null);
        a0(view);
        mo16291G();
    }
}
