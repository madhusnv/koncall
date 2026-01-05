package p001o;

import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class q29 extends p29 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i A0 = null;
    public static final SparseIntArray B0 = null;
    public final LinearLayout x0;
    public final View.OnClickListener y0;
    public long z0;

    public q29(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, A0, B0));
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

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            k0((Integer) obj);
        } else if (33 == i) {
            i0((ck6) obj);
        } else if (7 == i) {
            h0((rog) obj);
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
        ck6 ck6Var = this.v0;
        Leads leads = this.t0;
        Integer num = this.u0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), leads);
        }
    }

    public void h0(rog rogVar) {
        this.w0 = rogVar;
        synchronized (this) {
            this.z0 |= 4;
        }
        m28509h(7);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.v0 = ck6Var;
        synchronized (this) {
            this.z0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(Leads leads) {
        this.t0 = leads;
        synchronized (this) {
            this.z0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.u0 = num;
        synchronized (this) {
            this.z0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.z0;
            this.z0 = 0L;
        }
        rog rogVar = this.w0;
        Leads leads = this.t0;
        long j2 = j & 28;
        int i = 0;
        if (j2 != 0) {
            z = rogVar != null;
            if (j2 != 0) {
                j = z ? j | 256 : j | 128;
            }
        } else {
            z = false;
        }
        String contactOwner = ((j & 24) == 0 || leads == null) ? null : leads.getContactOwner();
        boolean zM47035a = ((256 & j) == 0 || rogVar == null) ? false : rogVar.m47035a();
        long j3 = j & 28;
        if (j3 != 0) {
            if (!z) {
                zM47035a = false;
            }
            z2 = !zM47035a;
            if (j3 != 0) {
                j = z2 ? j | 64 : j | 32;
            }
        } else {
            z2 = false;
        }
        boolean zHasContactOwner = ((j & 64) == 0 || leads == null) ? false : leads.hasContactOwner();
        long j4 = j & 28;
        if (j4 != 0) {
            if (!z2) {
                zHasContactOwner = false;
            }
            if (j4 != 0) {
                j |= zHasContactOwner ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            if (!zHasContactOwner) {
                i = 4;
            }
        }
        if ((16 & j) != 0) {
            this.n0.setOnClickListener(this.y0);
        }
        if ((j & 24) != 0) {
            nr1.X0(this.o0, leads);
            nr1.m40944O(this.p0, leads);
            nr1.g1(this.p0, contactOwner);
            nr1.d1(this.q0, leads);
            nr1.Z0(this.r0, leads);
            fu5.m27486a(this.s0, leads);
        }
        if ((j & 28) != 0) {
            this.p0.setVisibility(i);
        }
    }

    public q29(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[2], (ShapeableImageView) objArr[3], (Chip) objArr[6], (MaterialTextView) objArr[4], (MaterialTextView) objArr[5], (MaterialTextView) objArr[1]);
        this.z0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.x0 = linearLayout;
        linearLayout.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        a0(view);
        this.y0 = new jbc(this, 1);
        mo16291G();
    }
}
