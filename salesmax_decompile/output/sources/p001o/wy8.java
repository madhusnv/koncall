package p001o;

import ai.salesmax.model.FileData;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class wy8 extends vy8 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i D0 = null;
    public static final SparseIntArray E0 = null;
    public final View.OnClickListener A0;
    public final View.OnClickListener B0;
    public long C0;
    public final LinearLayout t0;
    public final MaterialCardView u0;
    public final MaterialTextView v0;
    public final MaterialTextView w0;
    public final ProgressBar x0;
    public final View.OnClickListener y0;
    public final View.OnClickListener z0;

    public wy8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 8, D0, E0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.C0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.C0 = 8L;
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
            i0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            h0((FileData) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.s0;
            FileData fileData = this.q0;
            Integer num = this.r0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), fileData);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.s0;
            FileData fileData2 = this.q0;
            Integer num2 = this.r0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), fileData2);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var3 = this.s0;
            FileData fileData3 = this.q0;
            Integer num3 = this.r0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), fileData3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ck6 ck6Var4 = this.s0;
        FileData fileData4 = this.q0;
        Integer num4 = this.r0;
        if (ck6Var4 != null) {
            ck6Var4.mo708b(view, num4.intValue(), fileData4);
        }
    }

    @Override // p001o.vy8
    public void h0(FileData fileData) {
        this.q0 = fileData;
        synchronized (this) {
            this.C0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void i0(ck6 ck6Var) {
        this.s0 = ck6Var;
        synchronized (this) {
            this.C0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.r0 = num;
        synchronized (this) {
            this.C0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String mimeType;
        boolean zIsUploaded;
        boolean viewOnly;
        boolean z;
        int i;
        long j2;
        long j3;
        synchronized (this) {
            j = this.C0;
            this.C0 = 0L;
        }
        FileData fileData = this.q0;
        long j4 = j & 12;
        String fileName = null;
        if (j4 != 0) {
            if (fileData != null) {
                fileName = fileData.getFileName();
                zIsUploaded = fileData.isUploaded();
                mimeType = fileData.getMimeType();
            } else {
                mimeType = null;
                zIsUploaded = false;
            }
            if (j4 != 0) {
                if (zIsUploaded) {
                    j2 = j | 32;
                    j3 = 128;
                } else {
                    j2 = j | 16;
                    j3 = 64;
                }
                j = j2 | j3;
            }
        } else {
            mimeType = null;
            zIsUploaded = false;
        }
        if ((96 & j) != 0) {
            viewOnly = fileData != null ? fileData.getViewOnly() : false;
            z = (32 & j) != 0 ? !viewOnly : false;
        } else {
            viewOnly = false;
            z = false;
        }
        long j5 = j & 12;
        if (j5 != 0) {
            if (!zIsUploaded) {
                z = false;
            }
            if (zIsUploaded) {
                viewOnly = true;
            }
            if (j5 != 0) {
                j |= z ? 512L : 256L;
            }
            if ((j & 12) != 0) {
                j |= viewOnly ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            int i2 = z ? 0 : 8;
            i = viewOnly ? 8 : 0;
            i = i2;
        } else {
            i = 0;
        }
        if ((8 & j) != 0) {
            this.n0.setOnClickListener(this.y0);
            this.o0.setOnClickListener(this.z0);
            this.p0.setOnClickListener(this.A0);
            this.u0.setOnClickListener(this.B0);
        }
        if ((j & 12) != 0) {
            this.n0.setVisibility(i);
            nr1.N1(this.o0, fileData);
            nr1.o2(this.t0, fileData);
            nr1.m2(this.v0, mimeType);
            fjh.m26938c(this.w0, fileName);
            this.x0.setVisibility(i);
        }
    }

    public wy8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[7], (ShapeableImageView) objArr[1], (MaterialCardView) objArr[0]);
        this.C0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.t0 = linearLayout;
        linearLayout.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[3];
        this.u0 = materialCardView;
        materialCardView.setTag(null);
        MaterialTextView materialTextView = (MaterialTextView) objArr[4];
        this.v0 = materialTextView;
        materialTextView.setTag(null);
        MaterialTextView materialTextView2 = (MaterialTextView) objArr[5];
        this.w0 = materialTextView2;
        materialTextView2.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[6];
        this.x0 = progressBar;
        progressBar.setTag(null);
        a0(view);
        this.y0 = new jbc(this, 4);
        this.z0 = new jbc(this, 2);
        this.A0 = new jbc(this, 1);
        this.B0 = new jbc(this, 3);
        mo16291G();
    }
}
