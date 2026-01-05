package p001o;

import ai.salesmax.model.ChatChannel;
import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class yg7 extends xg7 {
    public static final ewi.C13274i B0 = null;
    public static final SparseIntArray C0;
    public long A0;
    public final ConstraintLayout z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonClose, 3);
        sparseIntArray.put(z8e.chatDoMore, 4);
        sparseIntArray.put(z8e.rvChatMessagesList, 5);
    }

    public yg7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, B0, C0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.A0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.A0 = 128L;
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
        if (90 == i) {
            q0(((Boolean) obj).booleanValue());
        } else if (33 == i) {
            k0((ck6) obj);
        } else if (73 == i) {
            n0((Integer) obj);
        } else if (61 == i) {
            m0((Leads) obj);
        } else if (2 == i) {
            j0((ChatChannel) obj);
        } else if (50 == i) {
            l0((Boolean) obj);
        } else {
            if (80 != i) {
                return false;
            }
            p0((Integer) obj);
        }
        return true;
    }

    public void j0(ChatChannel chatChannel) {
        this.u0 = chatChannel;
    }

    public void k0(ck6 ck6Var) {
        this.y0 = ck6Var;
    }

    public void l0(Boolean bool) {
        this.x0 = bool;
    }

    public void m0(Leads leads) {
        this.v0 = leads;
        synchronized (this) {
            this.A0 |= 8;
        }
        m28509h(61);
        super.m25692R();
    }

    public void n0(Integer num) {
        this.w0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.A0;
            this.A0 = 0L;
        }
        Leads leads = this.v0;
        Integer num = this.t0;
        String name = ((j & 136) == 0 || leads == null) ? null : leads.getName();
        long j2 = j & 192;
        int i = 0;
        if (j2 != 0) {
            boolean z = ewi.m25674U(num) > 0;
            if (j2 != 0) {
                j |= z ? 512L : 256L;
            }
            if (z) {
                i = 8;
            }
        }
        if ((192 & j) != 0) {
            this.o0.setVisibility(i);
        }
        if ((j & 136) != 0) {
            nr1.f1(this.q0, name);
        }
    }

    public void p0(Integer num) {
        this.t0 = num;
        synchronized (this) {
            this.A0 |= 64;
        }
        m28509h(80);
        super.m25692R();
    }

    public void q0(boolean z) {
        this.s0 = z;
    }

    public yg7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[3], (ConstraintLayout) objArr[1], (ShapeableImageView) objArr[4], (MaterialTextView) objArr[2], (RecyclerView) objArr[5]);
        this.A0 = -1L;
        this.o0.setTag(null);
        this.q0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.z0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        mo16291G();
    }
}
