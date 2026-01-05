package p001o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class q54 extends p54 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0 = null;
    public final ConstraintLayout t0;
    public final View.OnClickListener u0;
    public long v0;

    public q54(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 4, w0, x0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.v0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.v0 = 8L;
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
            h0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((uwi) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.s0;
        uwi uwiVar = this.q0;
        Integer num = this.r0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), uwiVar);
        }
    }

    public void h0(ck6 ck6Var) {
        this.s0 = ck6Var;
        synchronized (this) {
            this.v0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(uwi uwiVar) {
        this.q0 = uwiVar;
        synchronized (this) {
            this.v0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.r0 = num;
        synchronized (this) {
            this.v0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        boolean z;
        int i;
        long j2;
        long j3;
        synchronized (this) {
            j = this.v0;
            this.v0 = 0L;
        }
        ck6 ck6Var = this.s0;
        uwi uwiVar = this.q0;
        boolean z2 = true;
        int i2 = 0;
        List listM52094b = null;
        if ((j & 14) != 0) {
            long j4 = j & 12;
            if (j4 != 0) {
                z = uwiVar != null;
                if (j4 != 0) {
                    j = z ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                }
            } else {
                z = false;
            }
            if (uwiVar != null) {
                listM52094b = uwiVar.m52094b();
            }
        } else {
            z = false;
        }
        List list = listM52094b;
        if ((MediaStatus.COMMAND_QUEUE_REPEAT_ONE & j) == 0) {
            z2 = false;
        } else {
            if ((list != null ? list.size() : 0) <= 0) {
            }
        }
        long j5 = j & 12;
        if (j5 != 0) {
            if (!z) {
                z2 = false;
            }
            if (j5 != 0) {
                if (z2) {
                    j2 = j | 32;
                    j3 = 512;
                } else {
                    j2 = j | 16;
                    j3 = 256;
                }
                j = j2 | j3;
            }
            i = z2 ? 0 : 8;
        } else {
            z2 = false;
            i = 0;
        }
        boolean zM52093a = ((j & 32) == 0 || uwiVar == null) ? false : uwiVar.m52093a();
        long j6 = j & 12;
        if (j6 != 0) {
            if (!z2) {
                zM52093a = false;
            }
            if (j6 != 0) {
                j |= zM52093a ? 128L : 64L;
            }
            if (!zM52093a) {
                i2 = 8;
            }
        }
        if ((j & 14) != 0) {
            ez7.m25877a(this.n0, list, ck6Var);
        }
        if ((j & 12) != 0) {
            this.o0.setVisibility(i);
            this.p0.setVisibility(i2);
        }
        if ((j & 8) != 0) {
            this.p0.setOnClickListener(this.u0);
        }
    }

    public q54(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (RecyclerView) objArr[3], (MaterialTextView) objArr[1], (MaterialButton) objArr[2]);
        this.v0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.t0 = constraintLayout;
        constraintLayout.setTag(null);
        a0(view);
        this.u0 = new jbc(this, 1);
        mo16291G();
    }
}
