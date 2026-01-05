package p001o;

import ai.salesmax.model.TaskTypeDefinition;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class e39 extends d39 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public final View.OnClickListener w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.imgDragHandler, 4);
    }

    public e39(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, y0, z0));
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
            this.x0 = 16L;
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
            i0((ck6) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else if (7 == i) {
            h0((rog) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((TaskTypeDefinition) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.u0;
        TaskTypeDefinition taskTypeDefinition = this.s0;
        Integer num = this.t0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), taskTypeDefinition);
        }
    }

    public void h0(rog rogVar) {
        this.v0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.u0 = ck6Var;
        synchronized (this) {
            this.x0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(TaskTypeDefinition taskTypeDefinition) {
        this.s0 = taskTypeDefinition;
        synchronized (this) {
            this.x0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.t0 = num;
        synchronized (this) {
            this.x0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        String name;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        TaskTypeDefinition taskTypeDefinition = this.s0;
        long j2 = 24 & j;
        String str2 = null;
        Integer taskAutoCloseDays = null;
        if (j2 != 0) {
            if (taskTypeDefinition != null) {
                String description = taskTypeDefinition.getDescription();
                name = taskTypeDefinition.getName();
                taskAutoCloseDays = taskTypeDefinition.getTaskAutoCloseDays();
                str = description;
            } else {
                str = null;
                name = null;
            }
            str2 = Integer.toString(ewi.m25674U(taskAutoCloseDays)) + " Days";
        } else {
            str = null;
            name = null;
        }
        if ((j & 16) != 0) {
            this.o0.setOnClickListener(this.w0);
        }
        if (j2 != 0) {
            nr1.g1(this.p0, str2);
            fjh.m26938c(this.q0, str);
            nr1.f1(this.r0, name);
        }
    }

    public e39(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppCompatImageView) objArr[4], (MaterialCardView) objArr[0], (Chip) objArr[3], (MaterialTextView) objArr[2], (MaterialTextView) objArr[1]);
        this.x0 = -1L;
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        a0(view);
        this.w0 = new jbc(this, 1);
        mo16291G();
    }
}
