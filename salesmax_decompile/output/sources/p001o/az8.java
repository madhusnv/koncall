package p001o;

import ai.salesmax.model.Template;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class az8 extends zy8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i Y0 = null;
    public static final SparseIntArray Z0;
    public final ConstraintLayout B0;
    public final LinearLayout C0;
    public final View.OnClickListener D0;
    public final View.OnClickListener E0;
    public final View.OnClickListener F0;
    public final View.OnClickListener G0;
    public final View.OnClickListener H0;
    public final View.OnClickListener I0;
    public final View.OnClickListener J0;
    public final View.OnClickListener K0;
    public final View.OnClickListener L0;
    public final View.OnClickListener M0;
    public final View.OnLongClickListener N0;
    public final View.OnLongClickListener O0;
    public final View.OnLongClickListener P0;
    public final View.OnLongClickListener Q0;
    public final View.OnLongClickListener R0;
    public final View.OnLongClickListener S0;
    public final View.OnLongClickListener T0;
    public final View.OnLongClickListener U0;
    public final View.OnLongClickListener V0;
    public final View.OnLongClickListener W0;
    public long X0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z0 = sparseIntArray;
        sparseIntArray.put(z8e.layoutMessageWithImage, 12);
    }

    public az8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 13, Y0, Z0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.X0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.X0 = 8L;
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
            ck6 ck6Var = this.A0;
            Template template = this.y0;
            Integer num = this.z0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), template);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.A0;
            Template template2 = this.y0;
            Integer num2 = this.z0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), template2);
            }
            return false;
        }
        if (i == 6) {
            ck6 ck6Var3 = this.A0;
            Template template3 = this.y0;
            Integer num3 = this.z0;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), template3);
            }
            return false;
        }
        if (i == 8) {
            ck6 ck6Var4 = this.A0;
            Template template4 = this.y0;
            Integer num4 = this.z0;
            if (ck6Var4 != null) {
                return ck6Var4.mo707a(view, num4.intValue(), template4);
            }
            return false;
        }
        if (i == 10) {
            ck6 ck6Var5 = this.A0;
            Template template5 = this.y0;
            Integer num5 = this.z0;
            if (ck6Var5 != null) {
                return ck6Var5.mo707a(view, num5.intValue(), template5);
            }
            return false;
        }
        if (i == 12) {
            ck6 ck6Var6 = this.A0;
            Template template6 = this.y0;
            Integer num6 = this.z0;
            if (ck6Var6 != null) {
                return ck6Var6.mo707a(view, num6.intValue(), template6);
            }
            return false;
        }
        if (i == 14) {
            ck6 ck6Var7 = this.A0;
            Template template7 = this.y0;
            Integer num7 = this.z0;
            if (ck6Var7 != null) {
                return ck6Var7.mo707a(view, num7.intValue(), template7);
            }
            return false;
        }
        if (i == 16) {
            ck6 ck6Var8 = this.A0;
            Template template8 = this.y0;
            Integer num8 = this.z0;
            if (ck6Var8 != null) {
                return ck6Var8.mo707a(view, num8.intValue(), template8);
            }
            return false;
        }
        if (i == 18) {
            ck6 ck6Var9 = this.A0;
            Template template9 = this.y0;
            Integer num9 = this.z0;
            if (ck6Var9 != null) {
                return ck6Var9.mo707a(view, num9.intValue(), template9);
            }
            return false;
        }
        if (i != 20) {
            return false;
        }
        ck6 ck6Var10 = this.A0;
        Template template10 = this.y0;
        Integer num10 = this.z0;
        if (ck6Var10 != null) {
            return ck6Var10.mo707a(view, num10.intValue(), template10);
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
            i0((Template) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.A0;
            Template template = this.y0;
            Integer num = this.z0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), template);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.A0;
            Template template2 = this.y0;
            Integer num2 = this.z0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), template2);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var3 = this.A0;
            Template template3 = this.y0;
            Integer num3 = this.z0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), template3);
                return;
            }
            return;
        }
        if (i == 7) {
            ck6 ck6Var4 = this.A0;
            Template template4 = this.y0;
            Integer num4 = this.z0;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), template4);
                return;
            }
            return;
        }
        if (i == 9) {
            ck6 ck6Var5 = this.A0;
            Template template5 = this.y0;
            Integer num5 = this.z0;
            if (ck6Var5 != null) {
                ck6Var5.mo708b(view, num5.intValue(), template5);
                return;
            }
            return;
        }
        if (i == 11) {
            ck6 ck6Var6 = this.A0;
            Template template6 = this.y0;
            Integer num6 = this.z0;
            if (ck6Var6 != null) {
                ck6Var6.mo708b(view, num6.intValue(), template6);
                return;
            }
            return;
        }
        if (i == 13) {
            ck6 ck6Var7 = this.A0;
            Template template7 = this.y0;
            Integer num7 = this.z0;
            if (ck6Var7 != null) {
                ck6Var7.mo708b(view, num7.intValue(), template7);
                return;
            }
            return;
        }
        if (i == 15) {
            ck6 ck6Var8 = this.A0;
            Template template8 = this.y0;
            Integer num8 = this.z0;
            if (ck6Var8 != null) {
                ck6Var8.mo708b(view, num8.intValue(), template8);
                return;
            }
            return;
        }
        if (i == 17) {
            ck6 ck6Var9 = this.A0;
            Template template9 = this.y0;
            Integer num9 = this.z0;
            if (ck6Var9 != null) {
                ck6Var9.mo708b(view, num9.intValue(), template9);
                return;
            }
            return;
        }
        if (i != 19) {
            return;
        }
        ck6 ck6Var10 = this.A0;
        Template template10 = this.y0;
        Integer num10 = this.z0;
        if (ck6Var10 != null) {
            ck6Var10.mo708b(view, num10.intValue(), template10);
        }
    }

    public void h0(ck6 ck6Var) {
        this.A0 = ck6Var;
        synchronized (this) {
            this.X0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(Template template) {
        this.y0 = template;
        synchronized (this) {
            this.X0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.z0 = num;
        synchronized (this) {
            this.X0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String fileName;
        String fileMimeType;
        String description;
        synchronized (this) {
            j = this.X0;
            this.X0 = 0L;
        }
        Template template = this.y0;
        long j2 = 12 & j;
        if (j2 == 0 || template == null) {
            fileName = null;
            fileMimeType = null;
            description = null;
        } else {
            fileName = template.getFileName();
            fileMimeType = template.getFileMimeType();
            description = template.getDescription();
        }
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.H0);
            this.n0.setOnLongClickListener(this.T0);
            this.o0.setOnClickListener(this.K0);
            this.o0.setOnLongClickListener(this.S0);
            this.p0.setOnClickListener(this.D0);
            this.p0.setOnLongClickListener(this.P0);
            this.q0.setOnClickListener(this.I0);
            this.q0.setOnLongClickListener(this.Q0);
            this.r0.setOnClickListener(this.F0);
            this.r0.setOnLongClickListener(this.U0);
            this.s0.setOnClickListener(this.M0);
            this.s0.setOnLongClickListener(this.W0);
            this.t0.setOnClickListener(this.J0);
            this.t0.setOnLongClickListener(this.O0);
            this.v0.setOnClickListener(this.G0);
            this.v0.setOnLongClickListener(this.V0);
            this.w0.setOnClickListener(this.E0);
            this.w0.setOnLongClickListener(this.N0);
            this.x0.setOnClickListener(this.L0);
            this.x0.setOnLongClickListener(this.R0);
        }
        if (j2 != 0) {
            nr1.P1(this.o0, template);
            nr1.p2(this.p0, template);
            fjh.m26938c(this.q0, fileName);
            nr1.q2(this.s0, fileMimeType);
            nr1.p2(this.C0, template);
            nr1.m40966k(this.w0, template);
            fjh.m26938c(this.x0, description);
        }
    }

    public az8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (CardView) objArr[2], (ShapeableImageView) objArr[9], (LinearLayout) objArr[5], (MaterialTextView) objArr[8], (MaterialCardView) objArr[6], (ShapeableImageView) objArr[7], (MaterialCardView) objArr[3], (LinearLayout) objArr[12], (MaterialButton) objArr[11], (MaterialTextView) objArr[10], (MaterialTextView) objArr[1]);
        this.X0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.B0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[4];
        this.C0 = linearLayout;
        linearLayout.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        a0(view);
        this.D0 = new jbc(this, 7);
        this.E0 = new jbc(this, 17);
        this.F0 = new jbc(this, 9);
        this.G0 = new jbc(this, 19);
        this.H0 = new jbc(this, 3);
        this.I0 = new jbc(this, 13);
        this.J0 = new jbc(this, 5);
        this.K0 = new jbc(this, 15);
        this.L0 = new jbc(this, 1);
        this.M0 = new jbc(this, 11);
        this.N0 = new sbc(this, 18);
        this.O0 = new sbc(this, 6);
        this.P0 = new sbc(this, 8);
        this.Q0 = new sbc(this, 14);
        this.R0 = new sbc(this, 2);
        this.S0 = new sbc(this, 16);
        this.T0 = new sbc(this, 4);
        this.U0 = new sbc(this, 10);
        this.V0 = new sbc(this, 20);
        this.W0 = new sbc(this, 12);
        mo16291G();
    }
}
