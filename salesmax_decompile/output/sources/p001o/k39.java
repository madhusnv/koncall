package p001o;

import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.chip.Chip;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class k39 extends j39 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i v0 = null;
    public static final SparseIntArray w0 = null;
    public final ConstraintLayout r0;
    public final View.OnClickListener s0;
    public final View.OnClickListener t0;
    public long u0;

    public k39(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 2, v0, w0));
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
            this.u0 = 8L;
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
            i0((Tasks) obj);
        } else {
            if (73 != i) {
                return false;
            }
            j0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.q0;
            Tasks tasks = this.o0;
            Integer num = this.p0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), tasks);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.q0;
        Tasks tasks2 = this.o0;
        Integer num2 = this.p0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), tasks2);
        }
    }

    public void h0(ck6 ck6Var) {
        this.q0 = ck6Var;
        synchronized (this) {
            this.u0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(Tasks tasks) {
        this.o0 = tasks;
        synchronized (this) {
            this.u0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.p0 = num;
        synchronized (this) {
            this.u0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.u0;
            this.u0 = 0L;
        }
        Tasks tasks = this.o0;
        long j2 = 10 & j;
        boolean zIsSelected = (j2 == 0 || tasks == null) ? false : tasks.isSelected();
        if (j2 != 0) {
            np3.m40895a(this.n0, zIsSelected);
            nr1.g2(this.n0, tasks);
        }
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.s0);
            this.r0.setOnClickListener(this.t0);
        }
    }

    public k39(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Chip) objArr[1]);
        this.u0 = -1L;
        this.n0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.r0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        this.s0 = new jbc(this, 2);
        this.t0 = new jbc(this, 1);
        mo16291G();
    }
}
