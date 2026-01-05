package p001o;

import ai.salesmax.model.FileData;
import ai.salesmax.model.WhatsAppTemplates;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class t59 extends s59 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i h1 = null;
    public static final SparseIntArray i1;
    public final ConstraintLayout E0;
    public final ProgressBar F0;
    public final View G0;
    public final LinearLayout H0;
    public final View.OnLongClickListener I0;
    public final View.OnLongClickListener J0;
    public final View.OnLongClickListener K0;
    public final View.OnClickListener L0;
    public final View.OnClickListener M0;
    public final View.OnLongClickListener N0;
    public final View.OnClickListener O0;
    public final View.OnClickListener P0;
    public final View.OnClickListener Q0;
    public final View.OnClickListener R0;
    public final View.OnLongClickListener S0;
    public final View.OnClickListener T0;
    public final View.OnLongClickListener U0;
    public final View.OnLongClickListener V0;
    public final View.OnLongClickListener W0;
    public final View.OnLongClickListener X0;
    public final View.OnLongClickListener Y0;
    public final View.OnClickListener Z0;
    public final View.OnClickListener a1;
    public final View.OnClickListener b1;
    public final View.OnLongClickListener c1;
    public final View.OnClickListener d1;
    public final View.OnClickListener e1;
    public final View.OnClickListener f1;
    public long g1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i1 = sparseIntArray;
        sparseIntArray.put(z8e.layoutMessageWithImage, 17);
    }

    public t59(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 18, h1, i1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.g1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.g1 = 8L;
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
        switch (i) {
            case 2:
                ck6 ck6Var = this.D0;
                WhatsAppTemplates whatsAppTemplates = this.B0;
                Integer num = this.C0;
                if (ck6Var != null) {
                    return ck6Var.mo707a(view, num.intValue(), whatsAppTemplates);
                }
                return false;
            case 5:
                ck6 ck6Var2 = this.D0;
                WhatsAppTemplates whatsAppTemplates2 = this.B0;
                Integer num2 = this.C0;
                if (ck6Var2 != null) {
                    return ck6Var2.mo707a(view, num2.intValue(), whatsAppTemplates2);
                }
                return false;
            case 7:
                ck6 ck6Var3 = this.D0;
                WhatsAppTemplates whatsAppTemplates3 = this.B0;
                Integer num3 = this.C0;
                if (ck6Var3 != null) {
                    return ck6Var3.mo707a(view, num3.intValue(), whatsAppTemplates3);
                }
                return false;
            case 10:
                ck6 ck6Var4 = this.D0;
                WhatsAppTemplates whatsAppTemplates4 = this.B0;
                Integer num4 = this.C0;
                if (ck6Var4 != null) {
                    return ck6Var4.mo707a(view, num4.intValue(), whatsAppTemplates4);
                }
                return false;
            case 12:
                ck6 ck6Var5 = this.D0;
                WhatsAppTemplates whatsAppTemplates5 = this.B0;
                Integer num5 = this.C0;
                if (ck6Var5 != null) {
                    return ck6Var5.mo707a(view, num5.intValue(), whatsAppTemplates5);
                }
                return false;
            case 14:
                ck6 ck6Var6 = this.D0;
                WhatsAppTemplates whatsAppTemplates6 = this.B0;
                Integer num6 = this.C0;
                if (ck6Var6 != null) {
                    return ck6Var6.mo707a(view, num6.intValue(), whatsAppTemplates6);
                }
                return false;
            case 16:
                ck6 ck6Var7 = this.D0;
                WhatsAppTemplates whatsAppTemplates7 = this.B0;
                Integer num7 = this.C0;
                if (ck6Var7 != null) {
                    return ck6Var7.mo707a(view, num7.intValue(), whatsAppTemplates7);
                }
                return false;
            case 18:
                ck6 ck6Var8 = this.D0;
                WhatsAppTemplates whatsAppTemplates8 = this.B0;
                Integer num8 = this.C0;
                if (ck6Var8 != null) {
                    return ck6Var8.mo707a(view, num8.intValue(), whatsAppTemplates8);
                }
                return false;
            case 20:
                ck6 ck6Var9 = this.D0;
                WhatsAppTemplates whatsAppTemplates9 = this.B0;
                Integer num9 = this.C0;
                if (ck6Var9 != null) {
                    return ck6Var9.mo707a(view, num9.intValue(), whatsAppTemplates9);
                }
                return false;
            case 22:
                ck6 ck6Var10 = this.D0;
                WhatsAppTemplates whatsAppTemplates10 = this.B0;
                Integer num10 = this.C0;
                if (ck6Var10 != null) {
                    return ck6Var10.mo707a(view, num10.intValue(), whatsAppTemplates10);
                }
                return false;
            case 24:
                ck6 ck6Var11 = this.D0;
                WhatsAppTemplates whatsAppTemplates11 = this.B0;
                Integer num11 = this.C0;
                if (ck6Var11 != null) {
                    return ck6Var11.mo707a(view, num11.intValue(), whatsAppTemplates11);
                }
                return false;
            default:
                return false;
        }
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
            i0((WhatsAppTemplates) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.D0;
            WhatsAppTemplates whatsAppTemplates = this.B0;
            Integer num = this.C0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), whatsAppTemplates);
                return;
            }
            return;
        }
        if (i == 6) {
            ck6 ck6Var2 = this.D0;
            WhatsAppTemplates whatsAppTemplates2 = this.B0;
            Integer num2 = this.C0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), whatsAppTemplates2);
                return;
            }
            return;
        }
        if (i == 11) {
            ck6 ck6Var3 = this.D0;
            WhatsAppTemplates whatsAppTemplates3 = this.B0;
            Integer num3 = this.C0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), whatsAppTemplates3);
                return;
            }
            return;
        }
        if (i == 13) {
            ck6 ck6Var4 = this.D0;
            WhatsAppTemplates whatsAppTemplates4 = this.B0;
            Integer num4 = this.C0;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), whatsAppTemplates4);
                return;
            }
            return;
        }
        if (i == 15) {
            ck6 ck6Var5 = this.D0;
            WhatsAppTemplates whatsAppTemplates5 = this.B0;
            Integer num5 = this.C0;
            if (ck6Var5 != null) {
                ck6Var5.mo708b(view, num5.intValue(), whatsAppTemplates5);
                return;
            }
            return;
        }
        if (i == 17) {
            ck6 ck6Var6 = this.D0;
            WhatsAppTemplates whatsAppTemplates6 = this.B0;
            Integer num6 = this.C0;
            if (ck6Var6 != null) {
                ck6Var6.mo708b(view, num6.intValue(), whatsAppTemplates6);
                return;
            }
            return;
        }
        if (i == 19) {
            ck6 ck6Var7 = this.D0;
            WhatsAppTemplates whatsAppTemplates7 = this.B0;
            Integer num7 = this.C0;
            if (ck6Var7 != null) {
                ck6Var7.mo708b(view, num7.intValue(), whatsAppTemplates7);
                return;
            }
            return;
        }
        if (i == 21) {
            ck6 ck6Var8 = this.D0;
            WhatsAppTemplates whatsAppTemplates8 = this.B0;
            Integer num8 = this.C0;
            if (ck6Var8 != null) {
                ck6Var8.mo708b(view, num8.intValue(), whatsAppTemplates8);
                return;
            }
            return;
        }
        if (i == 23) {
            ck6 ck6Var9 = this.D0;
            WhatsAppTemplates whatsAppTemplates9 = this.B0;
            Integer num9 = this.C0;
            if (ck6Var9 != null) {
                ck6Var9.mo708b(view, num9.intValue(), whatsAppTemplates9);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var10 = this.D0;
            WhatsAppTemplates whatsAppTemplates10 = this.B0;
            Integer num10 = this.C0;
            if (ck6Var10 != null) {
                ck6Var10.mo708b(view, num10.intValue(), whatsAppTemplates10);
                return;
            }
            return;
        }
        if (i == 4) {
            ck6 ck6Var11 = this.D0;
            WhatsAppTemplates whatsAppTemplates11 = this.B0;
            Integer num11 = this.C0;
            if (ck6Var11 != null) {
                ck6Var11.mo708b(view, num11.intValue(), whatsAppTemplates11);
                return;
            }
            return;
        }
        if (i == 8) {
            ck6 ck6Var12 = this.D0;
            WhatsAppTemplates whatsAppTemplates12 = this.B0;
            Integer num12 = this.C0;
            if (ck6Var12 != null) {
                ck6Var12.mo708b(view, num12.intValue(), whatsAppTemplates12);
                return;
            }
            return;
        }
        if (i != 9) {
            return;
        }
        ck6 ck6Var13 = this.D0;
        WhatsAppTemplates whatsAppTemplates13 = this.B0;
        Integer num13 = this.C0;
        if (ck6Var13 != null) {
            ck6Var13.mo708b(view, num13.intValue(), whatsAppTemplates13);
        }
    }

    public void h0(ck6 ck6Var) {
        this.D0 = ck6Var;
        synchronized (this) {
            this.g1 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(WhatsAppTemplates whatsAppTemplates) {
        this.B0 = whatsAppTemplates;
        synchronized (this) {
            this.g1 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.C0 = num;
        synchronized (this) {
            this.g1 |= 1;
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
        String category;
        boolean z;
        boolean zIsUploaded;
        int i;
        FileData defaultMedia;
        String name;
        boolean zIsSelected;
        String mimeType;
        synchronized (this) {
            j = this.g1;
            this.g1 = 0L;
        }
        WhatsAppTemplates whatsAppTemplates = this.B0;
        long j2 = j & 12;
        FileData fileData = null;
        String fileName = null;
        if (j2 != 0) {
            if (whatsAppTemplates != null) {
                defaultMedia = whatsAppTemplates.getDefaultMedia();
                zIsSelected = whatsAppTemplates.isSelected();
                category = whatsAppTemplates.getCategory();
                name = whatsAppTemplates.getName();
            } else {
                defaultMedia = null;
                category = null;
                name = null;
                zIsSelected = false;
            }
            if (defaultMedia != null) {
                fileName = defaultMedia.getFileName();
                zIsUploaded = defaultMedia.isUploaded();
                mimeType = defaultMedia.getMimeType();
            } else {
                mimeType = null;
                zIsUploaded = false;
            }
            if (j2 != 0) {
                j = zIsUploaded ? j | 128 : j | 64;
            }
            str = fileName;
            fileData = defaultMedia;
            z = zIsSelected;
            str3 = name;
            str2 = mimeType;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            category = null;
            z = false;
            zIsUploaded = false;
        }
        boolean viewOnly = ((64 & j) == 0 || fileData == null) ? false : fileData.getViewOnly();
        long j3 = j & 12;
        if (j3 != 0) {
            if (zIsUploaded) {
                viewOnly = true;
            }
            if (j3 != 0) {
                j |= viewOnly ? 32L : 16L;
            }
            i = viewOnly ? 8 : 0;
        } else {
            i = 0;
        }
        if ((12 & j) != 0) {
            np3.m40895a(this.n0, z);
            fjh.m26938c(this.n0, category);
            nr1.O1(this.p0, fileData);
            nr1.n2(this.q0, fileData);
            fjh.m26938c(this.r0, str);
            nr1.y2(this.s0, whatsAppTemplates);
            nr1.q2(this.u0, str2);
            nr1.I1(this.w0, whatsAppTemplates);
            this.F0.setVisibility(i);
            nr1.m40961f(this.G0, fileData);
            nr1.n2(this.H0, fileData);
            nr1.m40967l(this.z0, whatsAppTemplates);
            fjh.m26938c(this.A0, str3);
        }
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.e1);
            this.o0.setOnClickListener(this.M0);
            this.o0.setOnLongClickListener(this.S0);
            this.p0.setOnClickListener(this.d1);
            this.p0.setOnLongClickListener(this.K0);
            this.q0.setOnClickListener(this.R0);
            this.q0.setOnLongClickListener(this.U0);
            this.r0.setOnClickListener(this.f1);
            this.r0.setOnLongClickListener(this.N0);
            this.s0.setOnClickListener(this.L0);
            this.t0.setOnClickListener(this.a1);
            this.t0.setOnLongClickListener(this.I0);
            this.u0.setOnClickListener(this.Q0);
            this.u0.setOnLongClickListener(this.Y0);
            this.v0.setOnClickListener(this.Z0);
            this.v0.setOnLongClickListener(this.c1);
            this.w0.setOnClickListener(this.T0);
            this.w0.setOnLongClickListener(this.X0);
            this.y0.setOnClickListener(this.b1);
            this.y0.setOnLongClickListener(this.J0);
            this.z0.setOnClickListener(this.O0);
            this.z0.setOnLongClickListener(this.V0);
            this.A0.setOnClickListener(this.P0);
            this.A0.setOnLongClickListener(this.W0);
        }
    }

    public t59(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Chip) objArr[2], (CardView) objArr[3], (ShapeableImageView) objArr[14], (LinearLayout) objArr[7], (MaterialTextView) objArr[10], (ShapeableImageView) objArr[6], (MaterialCardView) objArr[8], (ShapeableImageView) objArr[9], (MaterialCardView) objArr[4], (ShapeableImageView) objArr[13], (LinearLayout) objArr[17], (MaterialButton) objArr[16], (MaterialTextView) objArr[15], (MaterialTextView) objArr[1]);
        this.g1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E0 = constraintLayout;
        constraintLayout.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[11];
        this.F0 = progressBar;
        progressBar.setTag(null);
        View view2 = (View) objArr[12];
        this.G0 = view2;
        view2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[5];
        this.H0 = linearLayout;
        linearLayout.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        a0(view);
        this.I0 = new sbc(this, 12);
        this.J0 = new sbc(this, 24);
        this.K0 = new sbc(this, 20);
        this.L0 = new jbc(this, 8);
        this.M0 = new jbc(this, 4);
        this.N0 = new sbc(this, 16);
        this.O0 = new jbc(this, 21);
        this.P0 = new jbc(this, 1);
        this.Q0 = new jbc(this, 13);
        this.R0 = new jbc(this, 9);
        this.S0 = new sbc(this, 5);
        this.T0 = new jbc(this, 17);
        this.U0 = new sbc(this, 10);
        this.V0 = new sbc(this, 22);
        this.W0 = new sbc(this, 2);
        this.X0 = new sbc(this, 18);
        this.Y0 = new sbc(this, 14);
        this.Z0 = new jbc(this, 6);
        this.a1 = new jbc(this, 11);
        this.b1 = new jbc(this, 23);
        this.c1 = new sbc(this, 7);
        this.d1 = new jbc(this, 19);
        this.e1 = new jbc(this, 3);
        this.f1 = new jbc(this, 15);
        mo16291G();
    }
}
