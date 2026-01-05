package p001o;

import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class s09 extends r09 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i C0 = null;
    public static final SparseIntArray D0;
    public final View.OnClickListener A0;
    public long B0;
    public final View.OnLongClickListener x0;
    public final View.OnClickListener y0;
    public final View.OnClickListener z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D0 = sparseIntArray;
        sparseIntArray.put(z8e.frame_container, 6);
    }

    public s09(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, C0, D0));
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
        ck6 ck6Var = this.w0;
        Leads leads = this.u0;
        Integer num = this.v0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), leads);
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
            i0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.w0;
            Leads leads = this.u0;
            Integer num = this.v0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leads);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.w0;
            Leads leads2 = this.u0;
            Integer num2 = this.v0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), leads2);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ck6 ck6Var3 = this.w0;
        Leads leads3 = this.u0;
        Integer num3 = this.v0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), leads3);
        }
    }

    public void h0(ck6 ck6Var) {
        this.w0 = ck6Var;
        synchronized (this) {
            this.B0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(Leads leads) {
        this.u0 = leads;
        synchronized (this) {
            this.B0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.v0 = num;
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
        boolean zIsSelected;
        String name;
        boolean zIsNewItem;
        synchronized (this) {
            j = this.B0;
            this.B0 = 0L;
        }
        Leads leads = this.u0;
        long j2 = j & 12;
        String str = null;
        if (j2 != 0) {
            if (leads != null) {
                zIsNewItem = leads.isNewItem();
                name = leads.getName();
                zIsSelected = leads.isSelected();
            } else {
                zIsSelected = false;
                name = null;
                zIsNewItem = false;
            }
            if (j2 != 0) {
                j |= zIsNewItem ? 32L : 16L;
            }
            i = zIsNewItem ? 0 : 8;
            str = name;
        } else {
            zIsSelected = false;
        }
        if ((12 & j) != 0) {
            this.n0.setVisibility(i);
            np3.m40895a(this.p0, zIsSelected);
            nr1.X0(this.r0, leads);
            nr1.f1(this.s0, str);
            nr1.Z0(this.t0, leads);
        }
        if ((j & 8) != 0) {
            this.p0.setOnClickListener(this.z0);
            this.q0.setOnClickListener(this.A0);
            this.r0.setOnClickListener(this.y0);
            this.r0.setOnLongClickListener(this.x0);
        }
    }

    public s09(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextView) objArr[2], (FrameLayout) objArr[6], (CheckBox) objArr[5], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[3], (MaterialTextView) objArr[4]);
        this.B0 = -1L;
        this.n0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        a0(view);
        this.x0 = new sbc(this, 3);
        this.y0 = new jbc(this, 2);
        this.z0 = new jbc(this, 4);
        this.A0 = new jbc(this, 1);
        mo16291G();
    }
}
