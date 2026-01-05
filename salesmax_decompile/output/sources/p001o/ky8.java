package p001o;

import ai.salesmax.model.DealStageDefinition;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class ky8 extends jy8 implements jbc.InterfaceC14485a {
    public static final SparseIntArray A0;
    public static final ewi.C13274i z0 = null;
    public final View.OnClickListener x0;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(z8e.imgDragHandler, 5);
    }

    public ky8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, z0, A0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.y0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.y0 = 16L;
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
            j0((DealStageDefinition) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.v0;
        DealStageDefinition dealStageDefinition = this.t0;
        Integer num = this.u0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), dealStageDefinition);
        }
    }

    public void h0(rog rogVar) {
        this.w0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.v0 = ck6Var;
        synchronized (this) {
            this.y0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(DealStageDefinition dealStageDefinition) {
        this.t0 = dealStageDefinition;
        synchronized (this) {
            this.y0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.u0 = num;
        synchronized (this) {
            this.y0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String name;
        int i;
        String description;
        boolean zIsTerminalStateInSuccess;
        boolean zIsTerminalStateInFailure;
        synchronized (this) {
            j = this.y0;
            this.y0 = 0L;
        }
        DealStageDefinition dealStageDefinition = this.t0;
        long j2 = j & 24;
        String str = null;
        if (j2 != 0) {
            if (dealStageDefinition != null) {
                zIsTerminalStateInSuccess = dealStageDefinition.isTerminalStateInSuccess();
                zIsTerminalStateInFailure = dealStageDefinition.isTerminalStateInFailure();
                description = dealStageDefinition.getDescription();
                name = dealStageDefinition.getName();
            } else {
                name = null;
                description = null;
                zIsTerminalStateInSuccess = false;
                zIsTerminalStateInFailure = false;
            }
            if (j2 != 0) {
                j |= zIsTerminalStateInSuccess ? 64L : 32L;
            }
            if ((j & 24) != 0) {
                j |= zIsTerminalStateInFailure ? 256L : 128L;
            }
            int i2 = zIsTerminalStateInSuccess ? 0 : 8;
            i = zIsTerminalStateInFailure ? 0 : 8;
            i = i2;
            str = description;
        } else {
            name = null;
            i = 0;
        }
        if ((24 & j) != 0) {
            this.o0.setVisibility(i);
            this.p0.setVisibility(i);
            fjh.m26938c(this.r0, str);
            nr1.f1(this.s0, name);
        }
        if ((j & 16) != 0) {
            this.q0.setOnClickListener(this.x0);
        }
    }

    public ky8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppCompatImageView) objArr[5], (MaterialButton) objArr[2], (MaterialButton) objArr[3], (MaterialCardView) objArr[0], (MaterialTextView) objArr[4], (MaterialTextView) objArr[1]);
        this.y0 = -1L;
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        a0(view);
        this.x0 = new jbc(this, 1);
        mo16291G();
    }
}
