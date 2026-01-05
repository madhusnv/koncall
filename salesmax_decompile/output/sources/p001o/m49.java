package p001o;

import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class m49 extends l49 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i t0 = null;
    public static final SparseIntArray u0 = null;
    public final View.OnClickListener r0;
    public long s0;

    public m49(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 1, t0, u0));
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
            i0((String) obj);
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
        ck6 ck6Var = this.q0;
        String str = this.o0;
        Integer num = this.p0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), str);
        }
    }

    public void h0(ck6 ck6Var) {
        this.q0 = ck6Var;
        synchronized (this) {
            this.s0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(String str) {
        this.o0 = str;
        synchronized (this) {
            this.s0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.p0 = num;
        synchronized (this) {
            this.s0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.s0;
            this.s0 = 0L;
        }
        String str = this.o0;
        long j2 = 10 & j;
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.r0);
        }
        if (j2 != 0) {
            fjh.m26938c(this.n0, str);
        }
    }

    public m49(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[0]);
        this.s0 = -1L;
        this.n0.setTag(null);
        a0(view);
        this.r0 = new jbc(this, 1);
        mo16291G();
    }
}
