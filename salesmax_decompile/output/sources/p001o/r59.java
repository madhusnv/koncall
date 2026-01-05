package p001o;

import ai.salesmax.services.model.WabaPhoneNumberInfo;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class r59 extends q59 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i E0 = null;
    public static final SparseIntArray F0;
    public final View.OnClickListener A0;
    public final View.OnLongClickListener B0;
    public final View.OnLongClickListener C0;
    public long D0;
    public final ConstraintLayout v0;
    public final View.OnLongClickListener w0;
    public final View.OnClickListener x0;
    public final View.OnClickListener y0;
    public final View.OnClickListener z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(z8e.layoutMessageWithImage, 5);
    }

    public r59(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, E0, F0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.D0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.D0 = 8L;
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
            ck6 ck6Var = this.u0;
            WabaPhoneNumberInfo wabaPhoneNumberInfo = this.s0;
            Integer num = this.t0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), wabaPhoneNumberInfo);
            }
            return false;
        }
        if (i == 5) {
            ck6 ck6Var2 = this.u0;
            WabaPhoneNumberInfo wabaPhoneNumberInfo2 = this.s0;
            Integer num2 = this.t0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), wabaPhoneNumberInfo2);
            }
            return false;
        }
        if (i != 7) {
            return false;
        }
        ck6 ck6Var3 = this.u0;
        WabaPhoneNumberInfo wabaPhoneNumberInfo3 = this.s0;
        Integer num3 = this.t0;
        if (ck6Var3 != null) {
            return ck6Var3.mo707a(view, num3.intValue(), wabaPhoneNumberInfo3);
        }
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
            i0((WabaPhoneNumberInfo) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.u0;
            WabaPhoneNumberInfo wabaPhoneNumberInfo = this.s0;
            Integer num = this.t0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), wabaPhoneNumberInfo);
                return;
            }
            return;
        }
        if (i == 6) {
            ck6 ck6Var2 = this.u0;
            WabaPhoneNumberInfo wabaPhoneNumberInfo2 = this.s0;
            Integer num2 = this.t0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), wabaPhoneNumberInfo2);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var3 = this.u0;
            WabaPhoneNumberInfo wabaPhoneNumberInfo3 = this.s0;
            Integer num3 = this.t0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), wabaPhoneNumberInfo3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        ck6 ck6Var4 = this.u0;
        WabaPhoneNumberInfo wabaPhoneNumberInfo4 = this.s0;
        Integer num4 = this.t0;
        if (ck6Var4 != null) {
            ck6Var4.mo708b(view, num4.intValue(), wabaPhoneNumberInfo4);
        }
    }

    public void h0(ck6 ck6Var) {
        this.u0 = ck6Var;
        synchronized (this) {
            this.D0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(WabaPhoneNumberInfo wabaPhoneNumberInfo) {
        this.s0 = wabaPhoneNumberInfo;
        synchronized (this) {
            this.D0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.t0 = num;
        synchronized (this) {
            this.D0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String wabaPhoneNumberName;
        boolean zIsSelected;
        String wabaAccountName;
        synchronized (this) {
            j = this.D0;
            this.D0 = 0L;
        }
        WabaPhoneNumberInfo wabaPhoneNumberInfo = this.s0;
        long j2 = 12 & j;
        if (j2 == 0 || wabaPhoneNumberInfo == null) {
            wabaPhoneNumberName = null;
            zIsSelected = false;
            wabaAccountName = null;
        } else {
            wabaPhoneNumberName = wabaPhoneNumberInfo.getWabaPhoneNumberName();
            wabaAccountName = wabaPhoneNumberInfo.getWabaAccountName();
            zIsSelected = wabaPhoneNumberInfo.isSelected();
        }
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.z0);
            this.n0.setOnLongClickListener(this.w0);
            this.p0.setOnClickListener(this.x0);
            this.p0.setOnLongClickListener(this.C0);
            this.q0.setOnClickListener(this.y0);
            this.r0.setOnClickListener(this.A0);
            this.r0.setOnLongClickListener(this.B0);
        }
        if (j2 != 0) {
            np3.m40895a(this.q0, zIsSelected);
            fjh.m26938c(this.q0, wabaAccountName);
            fjh.m26938c(this.r0, wabaPhoneNumberName);
        }
    }

    public r59(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (CardView) objArr[3], (LinearLayout) objArr[5], (MaterialButton) objArr[4], (Chip) objArr[2], (MaterialTextView) objArr[1]);
        this.D0 = -1L;
        this.n0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.v0 = constraintLayout;
        constraintLayout.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        a0(view);
        this.w0 = new sbc(this, 5);
        this.x0 = new jbc(this, 6);
        this.y0 = new jbc(this, 3);
        this.z0 = new jbc(this, 4);
        this.A0 = new jbc(this, 1);
        this.B0 = new sbc(this, 2);
        this.C0 = new sbc(this, 7);
        mo16291G();
    }
}
