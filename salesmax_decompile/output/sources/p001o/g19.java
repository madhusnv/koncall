package p001o;

import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class g19 extends f19 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i x0 = null;
    public static final SparseIntArray y0;
    public final View.OnClickListener v0;
    public long w0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(z8e.callTypeIcon, 4);
    }

    public g19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, x0, y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.w0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.w0 = 8L;
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
        } else if (73 == i) {
            j0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.u0;
        Tasks tasks = this.s0;
        Integer num = this.t0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), tasks);
        }
    }

    public void h0(ck6 ck6Var) {
        this.u0 = ck6Var;
        synchronized (this) {
            this.w0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(Tasks tasks) {
        this.s0 = tasks;
        synchronized (this) {
            this.w0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.t0 = num;
        synchronized (this) {
            this.w0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String taskTitle;
        long taskDateTimeInMillis;
        String taskContent;
        synchronized (this) {
            j = this.w0;
            this.w0 = 0L;
        }
        Tasks tasks = this.s0;
        long j2 = 12 & j;
        if (j2 == 0 || tasks == null) {
            taskTitle = null;
            taskDateTimeInMillis = 0;
            taskContent = null;
        } else {
            taskTitle = tasks.getTaskTitle();
            taskContent = tasks.getTaskContent();
            taskDateTimeInMillis = tasks.getTaskDateTimeInMillis();
        }
        if (j2 != 0) {
            nr1.h0(this.n0, Long.valueOf(taskDateTimeInMillis));
            fjh.m26938c(this.q0, taskTitle);
            fjh.m26938c(this.r0, taskContent);
        }
        if ((j & 8) != 0) {
            this.p0.setOnClickListener(this.v0);
        }
    }

    public g19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[3], (ShapeableImageView) objArr[4], (MaterialCardView) objArr[0], (MaterialTextView) objArr[1], (MaterialTextView) objArr[2]);
        this.w0 = -1L;
        this.n0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        a0(view);
        this.v0 = new jbc(this, 1);
        mo16291G();
    }
}
