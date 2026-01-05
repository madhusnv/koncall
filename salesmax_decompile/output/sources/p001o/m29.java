package p001o;

import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class m29 extends l29 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i A0 = null;
    public static final SparseIntArray B0 = null;
    public final ConstraintLayout u0;
    public final View.OnClickListener v0;
    public final View.OnLongClickListener w0;
    public final View.OnClickListener x0;
    public final View.OnLongClickListener y0;
    public long z0;

    public m29(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, A0, B0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.z0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.z0 = 16L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        if (i == 2) {
            ck6 ck6Var = this.s0;
            Tasks tasks = this.q0;
            Integer num = this.r0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), tasks);
            }
            return false;
        }
        if (i != 4) {
            return false;
        }
        ck6 ck6Var2 = this.s0;
        Tasks tasks2 = this.q0;
        Integer num2 = this.r0;
        if (ck6Var2 != null) {
            return ck6Var2.mo707a(view, num2.intValue(), tasks2);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            i0((ck6) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else if (7 == i) {
            h0((rog) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.s0;
            Tasks tasks = this.q0;
            Integer num = this.r0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), tasks);
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        ck6 ck6Var2 = this.s0;
        Tasks tasks2 = this.q0;
        Integer num2 = this.r0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), tasks2);
        }
    }

    public void h0(rog rogVar) {
        this.t0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.s0 = ck6Var;
        synchronized (this) {
            this.z0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(Tasks tasks) {
        this.q0 = tasks;
        synchronized (this) {
            this.z0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.r0 = num;
        synchronized (this) {
            this.z0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.z0;
            this.z0 = 0L;
        }
        Tasks tasks = this.q0;
        long j2 = 24 & j;
        String taskEngagementType = (j2 == 0 || tasks == null) ? null : tasks.getTaskEngagementType();
        if (j2 != 0) {
            nr1.n0(this.n0, tasks);
            nr1.c3(this.o0, taskEngagementType);
            nr1.d3(this.p0, taskEngagementType);
        }
        if ((j & 16) != 0) {
            this.u0.setOnClickListener(this.v0);
            this.u0.setOnLongClickListener(this.y0);
            this.p0.setOnClickListener(this.x0);
            this.p0.setOnLongClickListener(this.w0);
        }
    }

    public m29(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[1], (ShapeableImageView) objArr[3], (MaterialTextView) objArr[2]);
        this.z0 = -1L;
        this.n0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.u0 = constraintLayout;
        constraintLayout.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        a0(view);
        this.v0 = new jbc(this, 1);
        this.w0 = new sbc(this, 4);
        this.x0 = new jbc(this, 3);
        this.y0 = new sbc(this, 2);
        mo16291G();
    }
}
