package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p001o.ewi;

/* loaded from: classes.dex */
public class q44 extends p44 {
    public static final ewi.C13274i t0 = null;
    public static final SparseIntArray u0 = null;
    public final ConstraintLayout r0;
    public long s0;

    public q44(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 2, t0, u0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.s0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.s0 = 8L;
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
        if (33 == i) {
            h0((ck6) obj);
        } else if (67 == i) {
            i0((List) obj);
        } else {
            if (73 != i) {
                return false;
            }
            j0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.p44
    public void h0(ck6 ck6Var) {
        this.q0 = ck6Var;
    }

    @Override // p001o.p44
    public void i0(List list) {
        this.o0 = list;
        synchronized (this) {
            this.s0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.p44
    public void j0(Integer num) {
        this.p0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.s0;
            this.s0 = 0L;
        }
        List list = this.o0;
        if ((j & 10) != 0) {
            fee.m26520a(this.n0, list);
        }
    }

    public q44(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (RecyclerView) objArr[1]);
        this.s0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.r0 = constraintLayout;
        constraintLayout.setTag(null);
        this.n0.setTag(null);
        a0(view);
        mo16291G();
    }
}
