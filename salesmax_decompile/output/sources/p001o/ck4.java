package p001o;

import ai.salesmax.model.CustomizedMessage;
import ai.salesmax.model.FileData;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class ck4 extends bk4 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i f1 = null;
    public static final SparseIntArray g1;
    public final MaterialCardView O0;
    public final ProgressBar P0;
    public final View.OnLongClickListener Q0;
    public final View.OnLongClickListener R0;
    public final View.OnLongClickListener S0;
    public final View.OnClickListener T0;
    public final View.OnClickListener U0;
    public final View.OnClickListener V0;
    public final View.OnLongClickListener W0;
    public final View.OnClickListener X0;
    public final View.OnLongClickListener Y0;
    public final View.OnLongClickListener Z0;
    public final View.OnClickListener a1;
    public final View.OnLongClickListener b1;
    public final View.OnClickListener c1;
    public final View.OnClickListener d1;
    public long e1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        g1 = sparseIntArray;
        sparseIntArray.put(z8e.topActionButtons, 12);
        sparseIntArray.put(z8e.buttonCancel, 13);
        sparseIntArray.put(z8e.tvTemplatesTitle, 14);
        sparseIntArray.put(z8e.buttonDone, 15);
        sparseIntArray.put(z8e.itemLeadRootLayout, 16);
        sparseIntArray.put(z8e.layout, 17);
        sparseIntArray.put(z8e.mAutoComplete, 18);
        sparseIntArray.put(z8e.mClose, 19);
        sparseIntArray.put(z8e.layoutMessageWithImage, 20);
        sparseIntArray.put(z8e.templateBodyLayout, 21);
        sparseIntArray.put(z8e.sendViaWhatsappButton, 22);
        sparseIntArray.put(z8e.sendViaEmailButton, 23);
        sparseIntArray.put(z8e.sendViaSMSButton, 24);
        sparseIntArray.put(z8e.sendTrackingUrl, 25);
    }

    public ck4(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 26, f1, g1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.e1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.e1 = 8L;
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
            ck6 ck6Var = this.N0;
            CustomizedMessage customizedMessage = this.L0;
            Integer num = this.M0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), customizedMessage);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.N0;
            CustomizedMessage customizedMessage2 = this.L0;
            Integer num2 = this.M0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), customizedMessage2);
            }
            return false;
        }
        if (i == 6) {
            ck6 ck6Var3 = this.N0;
            CustomizedMessage customizedMessage3 = this.L0;
            Integer num3 = this.M0;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), customizedMessage3);
            }
            return false;
        }
        if (i == 8) {
            ck6 ck6Var4 = this.N0;
            CustomizedMessage customizedMessage4 = this.L0;
            Integer num4 = this.M0;
            if (ck6Var4 != null) {
                return ck6Var4.mo707a(view, num4.intValue(), customizedMessage4);
            }
            return false;
        }
        if (i == 10) {
            ck6 ck6Var5 = this.N0;
            CustomizedMessage customizedMessage5 = this.L0;
            Integer num5 = this.M0;
            if (ck6Var5 != null) {
                return ck6Var5.mo707a(view, num5.intValue(), customizedMessage5);
            }
            return false;
        }
        if (i == 12) {
            ck6 ck6Var6 = this.N0;
            CustomizedMessage customizedMessage6 = this.L0;
            Integer num6 = this.M0;
            if (ck6Var6 != null) {
                return ck6Var6.mo707a(view, num6.intValue(), customizedMessage6);
            }
            return false;
        }
        if (i != 14) {
            return false;
        }
        ck6 ck6Var7 = this.N0;
        CustomizedMessage customizedMessage7 = this.L0;
        Integer num7 = this.M0;
        if (ck6Var7 != null) {
            return ck6Var7.mo707a(view, num7.intValue(), customizedMessage7);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            l0((Integer) obj);
        } else if (33 == i) {
            k0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((CustomizedMessage) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.N0;
            CustomizedMessage customizedMessage = this.L0;
            Integer num = this.M0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), customizedMessage);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.N0;
            CustomizedMessage customizedMessage2 = this.L0;
            Integer num2 = this.M0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), customizedMessage2);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var3 = this.N0;
            CustomizedMessage customizedMessage3 = this.L0;
            Integer num3 = this.M0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), customizedMessage3);
                return;
            }
            return;
        }
        if (i == 7) {
            ck6 ck6Var4 = this.N0;
            CustomizedMessage customizedMessage4 = this.L0;
            Integer num4 = this.M0;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), customizedMessage4);
                return;
            }
            return;
        }
        if (i == 9) {
            ck6 ck6Var5 = this.N0;
            CustomizedMessage customizedMessage5 = this.L0;
            Integer num5 = this.M0;
            if (ck6Var5 != null) {
                ck6Var5.mo708b(view, num5.intValue(), customizedMessage5);
                return;
            }
            return;
        }
        if (i == 11) {
            ck6 ck6Var6 = this.N0;
            CustomizedMessage customizedMessage6 = this.L0;
            Integer num6 = this.M0;
            if (ck6Var6 != null) {
                ck6Var6.mo708b(view, num6.intValue(), customizedMessage6);
                return;
            }
            return;
        }
        if (i != 13) {
            return;
        }
        ck6 ck6Var7 = this.N0;
        CustomizedMessage customizedMessage7 = this.L0;
        Integer num7 = this.M0;
        if (ck6Var7 != null) {
            ck6Var7.mo708b(view, num7.intValue(), customizedMessage7);
        }
    }

    @Override // p001o.bk4
    public void j0(CustomizedMessage customizedMessage) {
        this.L0 = customizedMessage;
        synchronized (this) {
            this.e1 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.N0 = ck6Var;
        synchronized (this) {
            this.e1 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.M0 = num;
        synchronized (this) {
            this.e1 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String customTitle;
        String str;
        String str2;
        String str3;
        int i;
        boolean z;
        FileData messageFile;
        String customBody;
        String mimeType;
        boolean zIsUploaded;
        synchronized (this) {
            j = this.e1;
            this.e1 = 0L;
        }
        CustomizedMessage customizedMessage = this.L0;
        long j2 = j & 12;
        FileData fileData = null;
        String fileName = null;
        int i2 = 0;
        if (j2 != 0) {
            if (customizedMessage != null) {
                messageFile = customizedMessage.getMessageFile();
                customBody = customizedMessage.getCustomBody();
                customTitle = customizedMessage.getCustomTitle();
            } else {
                customTitle = null;
                messageFile = null;
                customBody = null;
            }
            if (messageFile != null) {
                fileName = messageFile.getFileName();
                zIsUploaded = messageFile.isUploaded();
                mimeType = messageFile.getMimeType();
            } else {
                mimeType = null;
                zIsUploaded = false;
            }
            if (j2 != 0) {
                j = zIsUploaded ? j | 512 : j | 256;
            }
            boolean zIsEmpty = customTitle != null ? customTitle.isEmpty() : false;
            if ((j & 12) != 0) {
                j |= zIsEmpty ? 32L : 16L;
            }
            i = zIsEmpty ? 8 : 0;
            str = customBody;
            str3 = mimeType;
            z = zIsUploaded;
            FileData fileData2 = messageFile;
            str2 = fileName;
            fileData = fileData2;
        } else {
            customTitle = null;
            str = null;
            str2 = null;
            str3 = null;
            i = 0;
            z = false;
        }
        boolean viewOnly = ((256 & j) == 0 || fileData == null) ? false : fileData.getViewOnly();
        long j3 = j & 12;
        if (j3 != 0) {
            if (z) {
                viewOnly = true;
            }
            if (j3 != 0) {
                j |= viewOnly ? 128L : 64L;
            }
            i2 = viewOnly ? 8 : 0;
        }
        if ((8 & j) != 0) {
            this.p0.setOnClickListener(this.a1);
            this.p0.setOnLongClickListener(this.Q0);
            this.r0.setOnClickListener(this.d1);
            this.r0.setOnLongClickListener(this.S0);
            this.s0.setOnClickListener(this.U0);
            this.s0.setOnLongClickListener(this.Y0);
            this.t0.setOnClickListener(this.X0);
            this.t0.setOnLongClickListener(this.b1);
            this.u0.setOnClickListener(this.c1);
            this.u0.setOnLongClickListener(this.R0);
            this.v0.setOnClickListener(this.T0);
            this.v0.setOnLongClickListener(this.W0);
            this.w0.setOnClickListener(this.V0);
            this.w0.setOnLongClickListener(this.Z0);
        }
        if ((j & 12) != 0) {
            nr1.N1(this.r0, fileData);
            nr1.n2(this.s0, fileData);
            fjh.m26938c(this.t0, str2);
            nr1.q2(this.v0, str3);
            this.P0.setVisibility(i2);
            fjh.m26938c(this.F0, str);
            fjh.m26938c(this.H0, customTitle);
            this.I0.setVisibility(i);
        }
    }

    public ck4(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[13], (MaterialButton) objArr[15], (CardView) objArr[1], (ConstraintLayout) objArr[16], (ShapeableImageView) objArr[3], (LinearLayout) objArr[4], (MaterialTextView) objArr[7], (MaterialCardView) objArr[5], (ShapeableImageView) objArr[6], (MaterialCardView) objArr[2], (TextInputLayout) objArr[17], (LinearLayout) objArr[20], (AppCompatAutoCompleteTextView) objArr[18], (AppCompatImageView) objArr[19], (MaterialSwitch) objArr[25], (MaterialButton) objArr[23], (MaterialButton) objArr[24], (MaterialButton) objArr[22], (TextInputEditText) objArr[11], (TextInputLayout) objArr[21], (TextInputEditText) objArr[10], (TextInputLayout) objArr[9], (ConstraintLayout) objArr[12], (MaterialTextView) objArr[14]);
        this.e1 = -1L;
        this.p0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.O0 = materialCardView;
        materialCardView.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[8];
        this.P0 = progressBar;
        progressBar.setTag(null);
        this.F0.setTag(null);
        this.H0.setTag(null);
        this.I0.setTag(null);
        a0(view);
        this.Q0 = new sbc(this, 2);
        this.R0 = new sbc(this, 10);
        this.S0 = new sbc(this, 6);
        this.T0 = new jbc(this, 11);
        this.U0 = new jbc(this, 7);
        this.V0 = new jbc(this, 3);
        this.W0 = new sbc(this, 12);
        this.X0 = new jbc(this, 13);
        this.Y0 = new sbc(this, 8);
        this.Z0 = new sbc(this, 4);
        this.a1 = new jbc(this, 1);
        this.b1 = new sbc(this, 14);
        this.c1 = new jbc(this, 9);
        this.d1 = new jbc(this, 5);
        mo16291G();
    }
}
