package p001o;

import ai.salesmax.model.FileData;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
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
public class sy8 extends ry8 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i e1 = null;
    public static final SparseIntArray f1;
    public final ConstraintLayout M0;
    public final LinearLayout N0;
    public final View.OnLongClickListener O0;
    public final View.OnClickListener P0;
    public final View.OnLongClickListener Q0;
    public final View.OnLongClickListener R0;
    public final View.OnClickListener S0;
    public final View.OnLongClickListener T0;
    public final View.OnLongClickListener U0;
    public final View.OnClickListener V0;
    public final View.OnClickListener W0;
    public final View.OnClickListener X0;
    public final View.OnClickListener Y0;
    public final View.OnClickListener Z0;
    public final View.OnClickListener a1;
    public final View.OnClickListener b1;
    public final View.OnClickListener c1;
    public long d1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1 = sparseIntArray;
        sparseIntArray.put(z8e.layoutMessageWithImage, 17);
        sparseIntArray.put(z8e.ivFileTypeIcon, 18);
        sparseIntArray.put(z8e.btnPlayPause, 19);
        sparseIntArray.put(z8e.seekBar, 20);
        sparseIntArray.put(z8e.tvDuration, 21);
        sparseIntArray.put(z8e.actionGroup, 22);
    }

    public sy8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 23, e1, f1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.d1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.d1 = 16L;
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
            ck6 ck6Var = this.K0;
            FileData fileData = this.I0;
            Integer num = this.J0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), fileData);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.K0;
            FileData fileData2 = this.I0;
            Integer num2 = this.J0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), fileData2);
            }
            return false;
        }
        if (i == 6) {
            ck6 ck6Var3 = this.K0;
            FileData fileData3 = this.I0;
            Integer num3 = this.J0;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), fileData3);
            }
            return false;
        }
        if (i == 8) {
            ck6 ck6Var4 = this.K0;
            FileData fileData4 = this.I0;
            Integer num4 = this.J0;
            if (ck6Var4 != null) {
                return ck6Var4.mo707a(view, num4.intValue(), fileData4);
            }
            return false;
        }
        if (i != 10) {
            return false;
        }
        ck6 ck6Var5 = this.K0;
        FileData fileData5 = this.I0;
        Integer num5 = this.J0;
        if (ck6Var5 != null) {
            return ck6Var5.mo707a(view, num5.intValue(), fileData5);
        }
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
            j0((FileData) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.K0;
            FileData fileData = this.I0;
            Integer num = this.J0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), fileData);
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.K0;
            FileData fileData2 = this.I0;
            Integer num2 = this.J0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), fileData2);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var3 = this.K0;
            FileData fileData3 = this.I0;
            Integer num3 = this.J0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), fileData3);
                return;
            }
            return;
        }
        if (i == 7) {
            ck6 ck6Var4 = this.K0;
            FileData fileData4 = this.I0;
            Integer num4 = this.J0;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), fileData4);
                return;
            }
            return;
        }
        if (i == 9) {
            ck6 ck6Var5 = this.K0;
            FileData fileData5 = this.I0;
            Integer num5 = this.J0;
            if (ck6Var5 != null) {
                ck6Var5.mo708b(view, num5.intValue(), fileData5);
                return;
            }
            return;
        }
        switch (i) {
            case 11:
                ck6 ck6Var6 = this.K0;
                FileData fileData6 = this.I0;
                Integer num6 = this.J0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), fileData6);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var7 = this.K0;
                FileData fileData7 = this.I0;
                Integer num7 = this.J0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), fileData7);
                    break;
                }
                break;
            case 13:
                ck6 ck6Var8 = this.K0;
                FileData fileData8 = this.I0;
                Integer num8 = this.J0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), fileData8);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var9 = this.K0;
                FileData fileData9 = this.I0;
                Integer num9 = this.J0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), fileData9);
                    break;
                }
                break;
            case 15:
                ck6 ck6Var10 = this.K0;
                FileData fileData10 = this.I0;
                Integer num10 = this.J0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), fileData10);
                    break;
                }
                break;
        }
    }

    public void h0(rog rogVar) {
        this.L0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.K0 = ck6Var;
        synchronized (this) {
            this.d1 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(FileData fileData) {
        this.I0 = fileData;
        synchronized (this) {
            this.d1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.J0 = num;
        synchronized (this) {
            this.d1 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String fileName;
        String mimeType;
        String documentCategory;
        String documentSubCategory;
        synchronized (this) {
            j = this.d1;
            this.d1 = 0L;
        }
        FileData fileData = this.I0;
        long j2 = 24 & j;
        if (j2 == 0 || fileData == null) {
            fileName = null;
            mimeType = null;
            documentCategory = null;
            documentSubCategory = null;
        } else {
            fileName = fileData.getFileName();
            mimeType = fileData.getMimeType();
            documentCategory = fileData.getDocumentCategory();
            documentSubCategory = fileData.getDocumentSubCategory();
        }
        if (j2 != 0) {
            nr1.v0(this.p0, documentCategory);
            nr1.v0(this.q0, documentSubCategory);
            nr1.O1(this.x0, fileData);
            nr1.n2(this.y0, fileData);
            fjh.m26938c(this.z0, fileName);
            nr1.q2(this.B0, mimeType);
            nr1.J0(this.D0, fileData);
            nr1.n2(this.N0, fileData);
            fjh.m26938c(this.H0, fileName);
        }
        if ((j & 16) != 0) {
            this.r0.setOnClickListener(this.c1);
            this.s0.setOnClickListener(this.S0);
            this.t0.setOnClickListener(this.a1);
            this.u0.setOnClickListener(this.P0);
            this.v0.setOnClickListener(this.W0);
            this.w0.setOnClickListener(this.b1);
            this.w0.setOnLongClickListener(this.T0);
            this.x0.setOnClickListener(this.Z0);
            this.x0.setOnLongClickListener(this.R0);
            this.C0.setOnClickListener(this.Y0);
            this.C0.setOnLongClickListener(this.Q0);
            this.D0.setOnClickListener(this.V0);
            this.D0.setOnLongClickListener(this.O0);
            this.H0.setOnClickListener(this.X0);
            this.H0.setOnLongClickListener(this.U0);
        }
    }

    public sy8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (HorizontalScrollView) objArr[22], (ImageButton) objArr[19], (Chip) objArr[2], (Chip) objArr[3], (MaterialButton) objArr[16], (MaterialButton) objArr[15], (MaterialButton) objArr[14], (MaterialButton) objArr[13], (MaterialButton) objArr[12], (CardView) objArr[4], (ShapeableImageView) objArr[10], (LinearLayout) objArr[7], (MaterialTextView) objArr[9], (MaterialCardView) objArr[18], (ShapeableImageView) objArr[8], (MaterialCardView) objArr[5], (LinearLayout) objArr[11], (LinearLayout) objArr[17], (SeekBar) objArr[20], (TextView) objArr[21], (MaterialTextView) objArr[1]);
        this.d1 = -1L;
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[6];
        this.N0 = linearLayout;
        linearLayout.setTag(null);
        this.H0.setTag(null);
        a0(view);
        this.O0 = new sbc(this, 10);
        this.P0 = new jbc(this, 12);
        this.Q0 = new sbc(this, 6);
        this.R0 = new sbc(this, 8);
        this.S0 = new jbc(this, 14);
        this.T0 = new sbc(this, 4);
        this.U0 = new sbc(this, 2);
        this.V0 = new jbc(this, 9);
        this.W0 = new jbc(this, 11);
        this.X0 = new jbc(this, 1);
        this.Y0 = new jbc(this, 5);
        this.Z0 = new jbc(this, 7);
        this.a1 = new jbc(this, 13);
        this.b1 = new jbc(this, 3);
        this.c1 = new jbc(this, 15);
        mo16291G();
    }
}
