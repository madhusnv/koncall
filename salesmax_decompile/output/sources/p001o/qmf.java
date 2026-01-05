package p001o;

import ai.salesmax.model.Tasks;
import ai.salesmax.view.NoSwipePager;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p001o.ewi;

/* loaded from: classes.dex */
public class qmf extends pmf {
    public static final ewi.C13274i u0 = null;
    public static final SparseIntArray v0;
    public final LinearLayout s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v0 = sparseIntArray;
        sparseIntArray.put(z8e.page_one, 2);
        sparseIntArray.put(z8e.page_two, 3);
        sparseIntArray.put(z8e.addTaskPage, 4);
    }

    public qmf(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, u0, v0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.t0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.t0 = 2L;
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
        if (67 != i) {
            return false;
        }
        j0((Tasks) obj);
        return true;
    }

    @Override // p001o.pmf
    public void j0(Tasks tasks) {
        this.r0 = tasks;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        synchronized (this) {
            this.t0 = 0L;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qmf(yt4 yt4Var, View view, Object[] objArr) {
        NoSwipePager noSwipePager = (NoSwipePager) objArr[1];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[4];
        Object obj = objArr[2];
        f40 f40VarM26045a = obj != null ? f40.m26045a((View) obj) : null;
        Object obj2 = objArr[3];
        super(yt4Var, view, 0, noSwipePager, constraintLayout, f40VarM26045a, obj2 != null ? g40.m28029a((View) obj2) : null);
        this.t0 = -1L;
        this.n0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.s0 = linearLayout;
        linearLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
