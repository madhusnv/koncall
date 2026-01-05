package p001o;

import ai.salesmax.model.UserContactDetail;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class oz8 extends nz8 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i H0 = null;
    public static final SparseIntArray I0 = null;
    public final View.OnClickListener A0;
    public final View.OnClickListener B0;
    public final View.OnClickListener C0;
    public final View.OnClickListener D0;
    public final View.OnClickListener E0;
    public final View.OnClickListener F0;
    public long G0;
    public final MaterialCardView z0;

    public oz8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 10, H0, I0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.G0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G0 = 8L;
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
            j0((Integer) obj);
        } else if (33 == i) {
            h0((ck6) obj);
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
        switch (i) {
            case 1:
                ck6 ck6Var = this.y0;
                UserContactDetail userContactDetail = this.w0;
                Integer num = this.x0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), userContactDetail);
                    break;
                }
                break;
            case 2:
                ck6 ck6Var2 = this.y0;
                UserContactDetail userContactDetail2 = this.w0;
                Integer num2 = this.x0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), userContactDetail2);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var3 = this.y0;
                UserContactDetail userContactDetail3 = this.w0;
                Integer num3 = this.x0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), userContactDetail3);
                    break;
                }
                break;
            case 4:
                ck6 ck6Var4 = this.y0;
                UserContactDetail userContactDetail4 = this.w0;
                Integer num4 = this.x0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), userContactDetail4);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var5 = this.y0;
                UserContactDetail userContactDetail5 = this.w0;
                Integer num5 = this.x0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), userContactDetail5);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var6 = this.y0;
                UserContactDetail userContactDetail6 = this.w0;
                Integer num6 = this.x0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), userContactDetail6);
                    break;
                }
                break;
        }
    }

    public void h0(ck6 ck6Var) {
        this.y0 = ck6Var;
        synchronized (this) {
            this.G0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(UserContactDetail userContactDetail) {
        this.w0 = userContactDetail;
        synchronized (this) {
            this.G0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.x0 = num;
        synchronized (this) {
            this.G0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        boolean z;
        String name;
        int i;
        boolean zIsSelected;
        boolean zIsSelected2;
        boolean zIsAlreadyImported;
        synchronized (this) {
            j = this.G0;
            this.G0 = 0L;
        }
        UserContactDetail userContactDetail = this.w0;
        long j2 = j & 12;
        boolean z2 = false;
        if (j2 != 0) {
            if (userContactDetail != null) {
                zIsAlreadyImported = userContactDetail.isAlreadyImported();
                zIsSelected = userContactDetail.isSelected();
                zIsSelected2 = userContactDetail.isSelected();
                name = userContactDetail.getName();
            } else {
                zIsSelected = false;
                zIsSelected2 = false;
                name = null;
                zIsAlreadyImported = false;
            }
            if (j2 != 0) {
                j |= zIsSelected2 ? 32L : 16L;
            }
            z = !zIsAlreadyImported;
            i = zIsSelected2 ? 0 : 8;
            z2 = zIsSelected;
        } else {
            z = false;
            name = null;
            i = 0;
        }
        if ((8 & j) != 0) {
            this.n0.setOnClickListener(this.A0);
            this.o0.setOnClickListener(this.E0);
            this.p0.setOnClickListener(this.B0);
            this.q0.setOnClickListener(this.D0);
            this.z0.setOnClickListener(this.C0);
        }
        if ((j & 12) != 0) {
            np3.m40895a(this.r0, z2);
            tvi.m50716b(this.r0, this.F0, z);
            nr1.I2(this.s0, userContactDetail);
            nr1.H0(this.z0, userContactDetail);
            this.t0.setVisibility(i);
            nr1.f1(this.u0, name);
            nr1.r2(this.v0, userContactDetail);
        }
    }

    public oz8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[8], (Button) objArr[7], (Button) objArr[6], (Button) objArr[9], (CheckBox) objArr[4], (ShapeableImageView) objArr[1], (MaterialButtonToggleGroup) objArr[5], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.G0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.z0 = materialCardView;
        materialCardView.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        a0(view);
        this.A0 = new jbc(this, 5);
        this.B0 = new jbc(this, 3);
        this.C0 = new jbc(this, 1);
        this.D0 = new jbc(this, 6);
        this.E0 = new jbc(this, 4);
        this.F0 = new jbc(this, 2);
        mo16291G();
    }
}
