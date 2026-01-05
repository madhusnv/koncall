package p001o;

import ai.salesmax.model.ChatLabel;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class jx8 extends ix8 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i y0 = null;
    public static final SparseIntArray z0;
    public final View.OnClickListener v0;
    public final View.OnClickListener w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(z8e.imgDragHandler, 3);
    }

    public jx8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, y0, z0));
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
            this.x0 = 16L;
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
            j0((ChatLabel) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.t0;
            ChatLabel chatLabel = this.r0;
            Integer num = this.s0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), chatLabel);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.t0;
        ChatLabel chatLabel2 = this.r0;
        Integer num2 = this.s0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), chatLabel2);
        }
    }

    public void h0(rog rogVar) {
        this.u0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.t0 = ck6Var;
        synchronized (this) {
            this.x0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(ChatLabel chatLabel) {
        this.r0 = chatLabel;
        synchronized (this) {
            this.x0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
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
        String label;
        String color;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        ChatLabel chatLabel = this.r0;
        long j2 = 24 & j;
        if (j2 == 0 || chatLabel == null) {
            label = null;
            color = null;
        } else {
            label = chatLabel.getLabel();
            color = chatLabel.getColor();
        }
        if ((j & 16) != 0) {
            this.n0.setOnClickListener(this.w0);
            this.p0.setOnClickListener(this.v0);
        }
        if (j2 != 0) {
            nr1.D1(this.n0, color);
            nr1.f1(this.q0, label);
        }
    }

    public jx8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[2], (AppCompatImageView) objArr[3], (MaterialCardView) objArr[0], (MaterialTextView) objArr[1]);
        this.x0 = -1L;
        this.n0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        a0(view);
        this.v0 = new jbc(this, 1);
        this.w0 = new jbc(this, 2);
        mo16291G();
    }
}
