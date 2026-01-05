package p001o;

import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class uz8 extends tz8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i B0 = null;
    public static final SparseIntArray C0 = null;
    public long A0;
    public final View.OnClickListener w0;
    public final View.OnClickListener x0;
    public final View.OnLongClickListener y0;
    public final View.OnClickListener z0;

    public uz8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 5, B0, C0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.A0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.A0 = 16L;
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
        Leads leads = this.s0;
        Integer num = this.t0;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), leads);
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
            h0((String) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.u0;
            Leads leads = this.s0;
            Integer num = this.t0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leads);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.u0;
            Leads leads2 = this.s0;
            Integer num2 = this.t0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), leads2);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ck6 ck6Var3 = this.u0;
        Leads leads3 = this.s0;
        Integer num3 = this.t0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), leads3);
        }
    }

    public void h0(String str) {
        this.v0 = str;
    }

    public void i0(ck6 ck6Var) {
        this.u0 = ck6Var;
        synchronized (this) {
            this.A0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(Leads leads) {
        this.s0 = leads;
        synchronized (this) {
            this.A0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.t0 = num;
        synchronized (this) {
            this.A0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        MaterialButton materialButton;
        int i;
        long j2;
        long j3;
        synchronized (this) {
            j = this.A0;
            this.A0 = 0L;
        }
        Leads leads = this.s0;
        long j4 = j & 24;
        int iM25688z = 0;
        if (j4 != 0) {
            boolean messageSent = leads != null ? leads.getMessageSent() : false;
            if (j4 != 0) {
                if (messageSent) {
                    j2 = j | 64;
                    j3 = 256;
                } else {
                    j2 = j | 32;
                    j3 = 128;
                }
                j = j2 | j3;
            }
            str = messageSent ? "Message Sent" : "Send";
            if (messageSent) {
                materialButton = this.p0;
                i = u6e.superfone_green;
            } else {
                materialButton = this.p0;
                i = u6e.superfone_blue;
            }
            iM25688z = ewi.m25688z(materialButton, i);
        } else {
            str = null;
        }
        if ((16 & j) != 0) {
            this.n0.setOnClickListener(this.z0);
            this.n0.setOnLongClickListener(this.y0);
            this.o0.setOnClickListener(this.x0);
            this.p0.setOnClickListener(this.w0);
        }
        if ((j & 24) != 0) {
            nr1.V0(this.o0, leads);
            fjh.m26938c(this.p0, str);
            nr1.d1(this.q0, leads);
            nr1.Z0(this.r0, leads);
            if (ewi.m25687y() >= 21) {
                this.p0.setBackgroundTintList(b74.m18212a(iM25688z));
            }
        }
    }

    public uz8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (MaterialButton) objArr[4], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.A0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        a0(view);
        this.w0 = new jbc(this, 4);
        this.x0 = new jbc(this, 3);
        this.y0 = new sbc(this, 2);
        this.z0 = new jbc(this, 1);
        mo16291G();
    }
}
