package p001o;

import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class dw8 extends cw8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i C0 = null;
    public static final SparseIntArray D0 = null;
    public final View.OnClickListener A0;
    public long B0;
    public final View.OnClickListener w0;
    public final View.OnClickListener x0;
    public final View.OnClickListener y0;
    public final View.OnLongClickListener z0;

    public dw8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, C0, D0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.B0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.B0 = 8L;
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
        ck6 ck6Var = this.v0;
        mii miiVar = this.t0;
        Integer num = this.u0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), miiVar);
        }
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
            i0((mii) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.v0;
            mii miiVar = this.t0;
            Integer num = this.u0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), miiVar);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.v0;
            mii miiVar2 = this.t0;
            Integer num2 = this.u0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), miiVar2);
                return;
            }
            return;
        }
        if (i == 4) {
            ck6 ck6Var3 = this.v0;
            mii miiVar3 = this.t0;
            Integer num3 = this.u0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), miiVar3);
                return;
            }
            return;
        }
        if (i != 5) {
            return;
        }
        ck6 ck6Var4 = this.v0;
        mii miiVar4 = this.t0;
        Integer num4 = this.u0;
        if (ck6Var4 != null) {
            ck6Var4.mo708b(view, num4.intValue(), miiVar4);
        }
    }

    public void h0(ck6 ck6Var) {
        this.v0 = ck6Var;
        synchronized (this) {
            this.B0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(mii miiVar) {
        this.t0 = miiVar;
        synchronized (this) {
            this.B0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.u0 = num;
        synchronized (this) {
            this.B0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String strM39163m;
        String strM39160j;
        synchronized (this) {
            j = this.B0;
            this.B0 = 0L;
        }
        mii miiVar = this.t0;
        long j2 = 12 & j;
        if (j2 == 0 || miiVar == null) {
            strM39163m = null;
            strM39160j = null;
        } else {
            strM39163m = miiVar.m39163m();
            strM39160j = miiVar.m39160j();
        }
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.y0);
            this.o0.setOnClickListener(this.w0);
            this.o0.setOnLongClickListener(this.z0);
            this.p0.setOnClickListener(this.A0);
            this.q0.setOnClickListener(this.x0);
        }
        if (j2 != 0) {
            nr1.J2(this.p0, strM39163m);
            nr1.f1(this.r0, strM39160j);
            nr1.H2(this.s0, miiVar);
        }
    }

    public dw8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[5], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (ShapeableImageView) objArr[4], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.B0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        a0(view);
        this.w0 = new jbc(this, 1);
        this.x0 = new jbc(this, 4);
        this.y0 = new jbc(this, 5);
        this.z0 = new sbc(this, 2);
        this.A0 = new jbc(this, 3);
        mo16291G();
    }
}
