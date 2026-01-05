package p001o;

import ai.salesmax.model.UserContactDetail;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class mz8 extends lz8 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0 = null;
    public final MaterialCardView u0;
    public final View.OnClickListener v0;
    public final View.OnClickListener w0;
    public long x0;

    public mz8(yt4 yt4Var, View view) {
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
            this.x0 = 8L;
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
            i0((UserContactDetail) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.t0;
            UserContactDetail userContactDetail = this.r0;
            Integer num = this.s0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), userContactDetail);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.t0;
        UserContactDetail userContactDetail2 = this.r0;
        Integer num2 = this.s0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), userContactDetail2);
        }
    }

    public void h0(ck6 ck6Var) {
        this.t0 = ck6Var;
        synchronized (this) {
            this.x0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(UserContactDetail userContactDetail) {
        this.r0 = userContactDetail;
        synchronized (this) {
            this.x0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.s0 = num;
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
        boolean z;
        boolean zIsSelected;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        UserContactDetail userContactDetail = this.r0;
        long j2 = 12 & j;
        boolean zIsAlreadyImported = false;
        String name = null;
        if (j2 != 0) {
            if (userContactDetail != null) {
                zIsAlreadyImported = userContactDetail.isAlreadyImported();
                name = userContactDetail.getName();
                zIsSelected = userContactDetail.isSelected();
            } else {
                zIsSelected = false;
            }
            String str2 = name;
            z = !zIsAlreadyImported;
            zIsAlreadyImported = zIsSelected;
            str = str2;
        } else {
            str = null;
            z = false;
        }
        if (j2 != 0) {
            np3.m40895a(this.n0, zIsAlreadyImported);
            tvi.m50716b(this.n0, this.v0, z);
            nr1.I2(this.o0, userContactDetail);
            nr1.H0(this.u0, userContactDetail);
            nr1.f1(this.p0, str);
            nr1.r2(this.q0, userContactDetail);
        }
        if ((j & 8) != 0) {
            this.u0.setOnClickListener(this.w0);
        }
    }

    public mz8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (CheckBox) objArr[4], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.x0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.u0 = materialCardView;
        materialCardView.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        a0(view);
        this.v0 = new jbc(this, 2);
        this.w0 = new jbc(this, 1);
        mo16291G();
    }
}
