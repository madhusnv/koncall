package p001o;

import ai.salesmax.model.FileData;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ernestoyaquello.com.verticalstepperform.VerticalStepperFormView;
import p001o.ewi;

/* loaded from: classes.dex */
public class um1 extends tm1 {
    public static final ewi.C13274i s0;
    public static final SparseIntArray t0;
    public final ConstraintLayout q0;
    public long r0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(3);
        s0 = c13274i;
        c13274i.m25699a(0, new String[]{"item_file"}, new int[]{1}, new int[]{p9e.item_file});
        SparseIntArray sparseIntArray = new SparseIntArray();
        t0 = sparseIntArray;
        sparseIntArray.put(z8e.stepper_form, 2);
    }

    public um1(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, s0, t0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.r0 != 0) {
                return true;
            }
            return this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.r0 = 4L;
        }
        this.n0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((vy8) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (29 != i) {
            return false;
        }
        j0((FileData) obj);
        return true;
    }

    @Override // p001o.tm1
    public void j0(FileData fileData) {
        this.p0 = fileData;
        synchronized (this) {
            this.r0 |= 2;
        }
        m28509h(29);
        super.m25692R();
    }

    public final boolean k0(vy8 vy8Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.r0 |= 1;
        }
        return true;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.r0;
            this.r0 = 0L;
        }
        FileData fileData = this.p0;
        if ((j & 6) != 0) {
            this.n0.h0(fileData);
        }
        ewi.m25683r(this.n0);
    }

    public um1(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (vy8) objArr[1], (VerticalStepperFormView) objArr[2]);
        this.r0 = -1L;
        m25693Z(this.n0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.q0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
