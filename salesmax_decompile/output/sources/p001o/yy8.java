package p001o;

import ai.salesmax.model.Template;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class yy8 extends xy8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i Y0 = null;
    public static final SparseIntArray Z0;
    public final LinearLayout J0;
    public final View.OnClickListener K0;
    public final View.OnLongClickListener L0;
    public final View.OnClickListener M0;
    public final View.OnClickListener N0;
    public final View.OnClickListener O0;
    public final View.OnLongClickListener P0;
    public final View.OnClickListener Q0;
    public final View.OnClickListener R0;
    public final View.OnClickListener S0;
    public final View.OnClickListener T0;
    public final View.OnLongClickListener U0;
    public final View.OnClickListener V0;
    public final View.OnClickListener W0;
    public long X0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z0 = sparseIntArray;
        sparseIntArray.put(z8e.frame_container, 16);
        sparseIntArray.put(z8e.activityFilter_badge, 17);
        sparseIntArray.put(z8e.callTimeBlock, 18);
    }

    public yy8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 19, Y0, Z0));
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
            this.X0 = 16L;
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
            ck6 ck6Var = this.H0;
            Template template = this.F0;
            Integer num = this.G0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), template);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.H0;
            Template template2 = this.F0;
            Integer num2 = this.G0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), template2);
            }
            return false;
        }
        if (i != 6) {
            return false;
        }
        ck6 ck6Var3 = this.H0;
        Template template3 = this.F0;
        Integer num3 = this.G0;
        if (ck6Var3 != null) {
            return ck6Var3.mo707a(view, num3.intValue(), template3);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (7 == i) {
            h0((rog) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else if (33 == i) {
            i0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((Template) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.H0;
            Template template = this.F0;
            Integer num = this.G0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), template);
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.H0;
            Template template2 = this.F0;
            Integer num2 = this.G0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), template2);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var3 = this.H0;
            Template template3 = this.F0;
            Integer num3 = this.G0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), template3);
                return;
            }
            return;
        }
        switch (i) {
            case 7:
                ck6 ck6Var4 = this.H0;
                Template template4 = this.F0;
                Integer num4 = this.G0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), template4);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var5 = this.H0;
                Template template5 = this.F0;
                Integer num5 = this.G0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), template5);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var6 = this.H0;
                Template template6 = this.F0;
                Integer num6 = this.G0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), template6);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var7 = this.H0;
                Template template7 = this.F0;
                Integer num7 = this.G0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), template7);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var8 = this.H0;
                Template template8 = this.F0;
                Integer num8 = this.G0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), template8);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var9 = this.H0;
                Template template9 = this.F0;
                Integer num9 = this.G0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), template9);
                    break;
                }
                break;
            case 13:
                ck6 ck6Var10 = this.H0;
                Template template10 = this.F0;
                Integer num10 = this.G0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), template10);
                    break;
                }
                break;
        }
    }

    public void h0(rog rogVar) {
        this.I0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.H0 = ck6Var;
        synchronized (this) {
            this.X0 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(Template template) {
        this.F0 = template;
        synchronized (this) {
            this.X0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.G0 = num;
        synchronized (this) {
            this.X0 |= 2;
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
        String str4;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        String str5;
        String str6;
        String description;
        boolean z4;
        boolean z5;
        boolean showSelection;
        synchronized (this) {
            j = this.X0;
            this.X0 = 0L;
        }
        Template template = this.F0;
        long j2 = j & 24;
        String str7 = null;
        if (j2 != 0) {
            if (template != null) {
                boolean zIsSelected = template.isSelected();
                String templateType = template.getTemplateType();
                boolean showBottom = template.getShowBottom();
                String templateBody = template.getTemplateBody();
                String templateTitle = template.getTemplateTitle();
                String fileUrl = template.getFileUrl();
                showSelection = template.getShowSelection();
                description = template.getDescription();
                str = fileUrl;
                z5 = showBottom;
                z4 = zIsSelected;
                str7 = templateTitle;
                str6 = templateBody;
                str5 = templateType;
            } else {
                str = null;
                str5 = null;
                str6 = null;
                description = null;
                z4 = false;
                z5 = false;
                showSelection = false;
            }
            if (j2 != 0) {
                j |= z5 ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            if ((j & 24) != 0) {
                j |= showSelection ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            i = z5 ? 0 : 8;
            z2 = str7 == null;
            z = str != "";
            int i5 = showSelection ? 0 : 8;
            if ((j & 24) != 0) {
                j = z2 ? j | 64 : j | 32;
            }
            if ((j & 24) != 0) {
                j = z ? j | MediaStatus.COMMAND_FOLLOW : j | MediaStatus.COMMAND_DISLIKE;
            }
            z3 = z4;
            str2 = str5;
            str4 = str6;
            i2 = i5;
            str3 = description;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            i = 0;
            z = false;
            z2 = false;
            z3 = false;
            i2 = 0;
        }
        boolean z6 = (32 & j) != 0 && str7 == "";
        boolean z7 = ((MediaStatus.COMMAND_FOLLOW & j) == 0 || str == null) ? false : true;
        long j3 = j & 24;
        if (j3 != 0) {
            boolean z8 = z2 ? true : z6;
            if (!z) {
                z7 = false;
            }
            if (j3 != 0) {
                j |= z8 ? 256L : 128L;
            }
            if ((j & 24) != 0) {
                j |= z7 ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            i3 = z8 ? 8 : 0;
            i4 = z7 ? 0 : 8;
        } else {
            i3 = 0;
            i4 = 0;
        }
        if ((24 & j) != 0) {
            this.n0.setVisibility(i);
            np3.m40895a(this.x0, z3);
            this.x0.setVisibility(i2);
            this.z0.setVisibility(i4);
            nr1.P1(this.z0, template);
            nr1.i2(this.A0, template);
            nr1.g1(this.B0, str2);
            nr1.f1(this.C0, str3);
            this.D0.setVisibility(i3);
            fjh.m26938c(this.D0, str7);
            fjh.m26938c(this.E0, str4);
        }
        if ((j & 16) != 0) {
            this.q0.setOnClickListener(this.S0);
            this.r0.setOnClickListener(this.T0);
            this.s0.setOnClickListener(this.W0);
            this.t0.setOnClickListener(this.N0);
            this.u0.setOnClickListener(this.K0);
            this.v0.setOnClickListener(this.Q0);
            this.x0.setOnClickListener(this.O0);
            this.y0.setOnClickListener(this.M0);
            this.y0.setOnLongClickListener(this.P0);
            this.z0.setOnClickListener(this.V0);
            this.z0.setOnLongClickListener(this.L0);
            this.A0.setOnClickListener(this.R0);
            this.A0.setOnLongClickListener(this.U0);
        }
    }

    public yy8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (HorizontalScrollView) objArr[9], (TextView) objArr[17], (LinearLayout) objArr[18], (MaterialButton) objArr[14], (MaterialButton) objArr[11], (MaterialButton) objArr[15], (MaterialButton) objArr[13], (MaterialButton) objArr[12], (MaterialButton) objArr[10], (FrameLayout) objArr[16], (CheckBox) objArr[8], (MaterialCardView) objArr[1], (ShapeableImageView) objArr[6], (ShapeableImageView) objArr[2], (Chip) objArr[7], (MaterialTextView) objArr[3], (MaterialTextView) objArr[4], (MaterialTextView) objArr[5]);
        this.X0 = -1L;
        this.n0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.J0 = linearLayout;
        linearLayout.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        a0(view);
        this.K0 = new jbc(this, 10);
        this.L0 = new sbc(this, 6);
        this.M0 = new jbc(this, 1);
        this.N0 = new jbc(this, 11);
        this.O0 = new jbc(this, 7);
        this.P0 = new sbc(this, 2);
        this.Q0 = new jbc(this, 8);
        this.R0 = new jbc(this, 3);
        this.S0 = new jbc(this, 12);
        this.T0 = new jbc(this, 9);
        this.U0 = new sbc(this, 4);
        this.V0 = new jbc(this, 5);
        this.W0 = new jbc(this, 13);
        mo16291G();
    }
}
