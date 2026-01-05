package p001o;

import ai.salesmax.model.IntegrationList;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class qz8 extends pz8 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i F0 = null;
    public static final SparseIntArray G0;
    public final View.OnLongClickListener A0;
    public final View.OnClickListener B0;
    public final View.OnClickListener C0;
    public final View.OnClickListener D0;
    public long E0;
    public final View.OnLongClickListener y0;
    public final View.OnLongClickListener z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G0 = sparseIntArray;
        sparseIntArray.put(z8e.frame_container_ivContactProfilePicInLead, 7);
    }

    public qz8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, F0, G0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.E0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.E0 = 8L;
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
            ck6 ck6Var = this.x0;
            IntegrationList integrationList = this.v0;
            Integer num = this.w0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), integrationList);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.x0;
            IntegrationList integrationList2 = this.v0;
            Integer num2 = this.w0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), integrationList2);
            }
            return false;
        }
        if (i != 6) {
            return false;
        }
        ck6 ck6Var3 = this.x0;
        IntegrationList integrationList3 = this.v0;
        Integer num3 = this.w0;
        if (ck6Var3 != null) {
            return ck6Var3.mo707a(view, num3.intValue(), integrationList3);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            j0((Integer) obj);
        } else if (33 == i) {
            h0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((IntegrationList) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.x0;
            IntegrationList integrationList = this.v0;
            Integer num = this.w0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), integrationList);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.x0;
            IntegrationList integrationList2 = this.v0;
            Integer num2 = this.w0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), integrationList2);
                return;
            }
            return;
        }
        if (i != 5) {
            return;
        }
        ck6 ck6Var3 = this.x0;
        IntegrationList integrationList3 = this.v0;
        Integer num3 = this.w0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), integrationList3);
        }
    }

    public void h0(ck6 ck6Var) {
        this.x0 = ck6Var;
        synchronized (this) {
            this.E0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(IntegrationList integrationList) {
        this.v0 = integrationList;
        synchronized (this) {
            this.E0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.w0 = num;
        synchronized (this) {
            this.E0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String str;
        String str2;
        String str3;
        boolean z;
        String description;
        int i;
        synchronized (this) {
            j = this.E0;
            this.E0 = 0L;
        }
        IntegrationList integrationList = this.v0;
        long j2 = j & 12;
        String name = null;
        int i2 = 0;
        if (j2 != 0) {
            if (integrationList != null) {
                String integrationTypeShort = integrationList.getIntegrationTypeShort();
                String id = integrationList.getId();
                int connectionCount = integrationList.getConnectionCount();
                description = integrationList.getDescription();
                str2 = integrationTypeShort;
                name = integrationList.getName();
                i = connectionCount;
                str3 = id;
            } else {
                str2 = null;
                str3 = null;
                description = null;
                i = 0;
            }
            z = i > 0;
            if (j2 != 0) {
                j = z ? j | 512 : j | 256;
            }
            str = description;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            z = false;
        }
        boolean z2 = (256 & j) != 0 && name == "RAZORPAY";
        long j3 = j & 12;
        if (j3 != 0) {
            if (z) {
                z2 = true;
            }
            if (j3 != 0) {
                j = z2 ? j | 32 : j | 16;
            }
        } else {
            z2 = false;
        }
        boolean z3 = (j & 16) != 0 && name == "CASHFREE";
        long j4 = j & 12;
        if (j4 != 0) {
            boolean z4 = z2 ? true : z3;
            if (j4 != 0) {
                j |= z4 ? 128L : 64L;
            }
            if (!z4) {
                i2 = 8;
            }
        }
        if ((12 & j) != 0) {
            this.n0.setVisibility(i2);
            nr1.C0(this.p0, integrationList);
            fjh.m26938c(this.q0, str);
            fjh.m26938c(this.r0, name);
            nr1.X2(this.t0, str3);
            fjh.m26938c(this.u0, str2);
        }
        if ((j & 8) != 0) {
            this.p0.setOnClickListener(this.B0);
            this.p0.setOnLongClickListener(this.y0);
            this.s0.setOnClickListener(this.D0);
            this.s0.setOnLongClickListener(this.A0);
            this.t0.setOnClickListener(this.C0);
            this.t0.setOnLongClickListener(this.z0);
        }
    }

    public qz8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextView) objArr[2], (FrameLayout) objArr[7], (MaterialButton) objArr[6], (MaterialTextView) objArr[5], (MaterialTextView) objArr[4], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[3]);
        this.E0 = -1L;
        this.n0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        a0(view);
        this.y0 = new sbc(this, 6);
        this.z0 = new sbc(this, 4);
        this.A0 = new sbc(this, 2);
        this.B0 = new jbc(this, 5);
        this.C0 = new jbc(this, 3);
        this.D0 = new jbc(this, 1);
        mo16291G();
    }
}
