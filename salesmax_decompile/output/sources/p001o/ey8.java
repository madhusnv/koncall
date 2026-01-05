package p001o;

import ai.salesmax.model.PropertyDefinition;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class ey8 extends dy8 implements jbc.InterfaceC14485a {
    public static final SparseIntArray A0 = null;
    public static final ewi.C13274i z0 = null;
    public final View.OnClickListener v0;
    public final View.OnClickListener w0;
    public final View.OnClickListener x0;
    public long y0;

    public ey8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, z0, A0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.y0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.y0 = 16L;
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
            j0((PropertyDefinition) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.t0;
            PropertyDefinition propertyDefinition = this.r0;
            Integer num = this.s0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), propertyDefinition);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.t0;
            PropertyDefinition propertyDefinition2 = this.r0;
            Integer num2 = this.s0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), propertyDefinition2);
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        ck6 ck6Var3 = this.t0;
        PropertyDefinition propertyDefinition3 = this.r0;
        Integer num3 = this.s0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), propertyDefinition3);
        }
    }

    public void h0(rog rogVar) {
        this.u0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.t0 = ck6Var;
        synchronized (this) {
            this.y0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(PropertyDefinition propertyDefinition) {
        this.r0 = propertyDefinition;
        synchronized (this) {
            this.y0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.s0 = num;
        synchronized (this) {
            this.y0 |= 2;
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
        int i;
        String displayName;
        String parentObjectType;
        synchronized (this) {
            j = this.y0;
            this.y0 = 0L;
        }
        PropertyDefinition propertyDefinition = this.r0;
        long j2 = j & 24;
        String description = null;
        if (j2 != 0) {
            if (propertyDefinition != null) {
                description = propertyDefinition.getDescription();
                parentObjectType = propertyDefinition.getParentObjectType();
                displayName = propertyDefinition.getDisplayName();
            } else {
                displayName = null;
                parentObjectType = null;
            }
            boolean z = description != "";
            boolean z2 = parentObjectType != "";
            if (j2 != 0) {
                j |= z ? 64L : 32L;
            }
            if ((j & 24) != 0) {
                j |= z2 ? 256L : 128L;
            }
            i = z ? 0 : 8;
            i = z2 ? 0 : 8;
            str2 = displayName;
            str = description;
            description = parentObjectType;
        } else {
            str = null;
            str2 = null;
            i = 0;
        }
        if ((16 & j) != 0) {
            this.n0.setOnClickListener(this.x0);
            this.o0.setOnClickListener(this.w0);
            this.q0.setOnClickListener(this.v0);
        }
        if ((j & 24) != 0) {
            this.o0.setVisibility(i);
            nr1.g1(this.o0, description);
            this.p0.setVisibility(i);
            fjh.m26938c(this.p0, str);
            nr1.f1(this.q0, str2);
        }
    }

    public ey8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialCardView) objArr[0], (Chip) objArr[3], (MaterialTextView) objArr[2], (MaterialTextView) objArr[1]);
        this.y0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        a0(view);
        this.v0 = new jbc(this, 2);
        this.w0 = new jbc(this, 3);
        this.x0 = new jbc(this, 1);
        mo16291G();
    }
}
