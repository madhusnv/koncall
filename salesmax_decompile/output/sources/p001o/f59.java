package p001o;

import android.util.SparseIntArray;
import android.view.View;
import com.amplifyframework.datastore.generated.model.AuthorizationLevel;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class f59 extends e59 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i C0 = null;
    public static final SparseIntArray D0 = null;
    public final View.OnClickListener A0;
    public long B0;
    public final View.OnClickListener v0;
    public final View.OnLongClickListener w0;
    public final View.OnClickListener x0;
    public final View.OnClickListener y0;
    public final View.OnClickListener z0;

    public f59(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, C0, D0));
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
        ck6 ck6Var = this.u0;
        mii miiVar = this.s0;
        Integer num = this.t0;
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
            ck6 ck6Var = this.u0;
            mii miiVar = this.s0;
            Integer num = this.t0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), miiVar);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.u0;
            mii miiVar2 = this.s0;
            Integer num2 = this.t0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), miiVar2);
                return;
            }
            return;
        }
        if (i == 4) {
            ck6 ck6Var3 = this.u0;
            mii miiVar3 = this.s0;
            Integer num3 = this.t0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), miiVar3);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var4 = this.u0;
            mii miiVar4 = this.s0;
            Integer num4 = this.t0;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), miiVar4);
                return;
            }
            return;
        }
        if (i != 6) {
            return;
        }
        ck6 ck6Var5 = this.u0;
        mii miiVar5 = this.s0;
        Integer num5 = this.t0;
        if (ck6Var5 != null) {
            ck6Var5.mo708b(view, num5.intValue(), miiVar5);
        }
    }

    public void h0(ck6 ck6Var) {
        this.u0 = ck6Var;
        synchronized (this) {
            this.B0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(mii miiVar) {
        this.s0 = miiVar;
        synchronized (this) {
            this.B0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.t0 = num;
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
        String strName;
        String strM39160j;
        String strM39163m;
        AuthorizationLevel authorizationLevelM39162l;
        synchronized (this) {
            j = this.B0;
            this.B0 = 0L;
        }
        mii miiVar = this.s0;
        long j2 = 12 & j;
        if (j2 != 0) {
            if (miiVar != null) {
                strM39163m = miiVar.m39163m();
                authorizationLevelM39162l = miiVar.m39162l();
                strM39160j = miiVar.m39160j();
            } else {
                strM39163m = null;
                authorizationLevelM39162l = null;
                strM39160j = null;
            }
            String str = strM39163m;
            strName = authorizationLevelM39162l != null ? authorizationLevelM39162l.name() : null;
            str = str;
        } else {
            strName = null;
            strM39160j = null;
        }
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.v0);
            this.n0.setOnLongClickListener(this.w0);
            this.o0.setOnClickListener(this.y0);
            this.p0.setOnClickListener(this.A0);
            this.q0.setOnClickListener(this.z0);
            this.r0.setOnClickListener(this.x0);
        }
        if (j2 != 0) {
            nr1.J2(this.o0, str);
            nr1.f1(this.p0, strName);
            nr1.f1(this.q0, strM39160j);
            nr1.r0(this.r0, miiVar);
        }
    }

    public f59(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[3], (MaterialTextView) objArr[2], (MaterialTextView) objArr[4]);
        this.B0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        a0(view);
        this.v0 = new jbc(this, 1);
        this.w0 = new sbc(this, 2);
        this.x0 = new jbc(this, 6);
        this.y0 = new jbc(this, 3);
        this.z0 = new jbc(this, 4);
        this.A0 = new jbc(this, 5);
        mo16291G();
    }
}
