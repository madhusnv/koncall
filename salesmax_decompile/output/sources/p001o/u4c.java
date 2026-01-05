package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import p001o.ewi;

/* loaded from: classes.dex */
public class u4c extends t4c {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public final ConstraintLayout w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.settingsToolbar, 1);
        sparseIntArray.put(z8e.settingsBack, 2);
        sparseIntArray.put(z8e.leadAssigned, 3);
        sparseIntArray.put(z8e.taskReminder, 4);
        sparseIntArray.put(z8e.dealCreated, 5);
        sparseIntArray.put(z8e.dealMoved, 6);
        sparseIntArray.put(z8e.mentionedInTask, 7);
        sparseIntArray.put(z8e.completedTask, 8);
        sparseIntArray.put(z8e.documentOpen, 9);
    }

    public u4c(yt4 yt4Var, View view) {
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

    public u4c(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialSwitch) objArr[8], (MaterialSwitch) objArr[5], (MaterialSwitch) objArr[6], (MaterialSwitch) objArr[9], (MaterialSwitch) objArr[3], (MaterialSwitch) objArr[7], (ShapeableImageView) objArr[2], (MaterialCardView) objArr[1], (MaterialSwitch) objArr[4]);
        this.x0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.w0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
