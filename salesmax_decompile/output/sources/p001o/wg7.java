package p001o;

import ai.salesmax.model.Leads;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class wg7 extends vg7 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i C0;
    public static final SparseIntArray D0;
    public final View.OnClickListener A0;
    public long B0;
    public final ConstraintLayout y0;
    public final ConstraintLayout z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(10);
        C0 = c13274i;
        c13274i.m25699a(1, new String[]{"item_lead"}, new int[]{3}, new int[]{p9e.item_lead});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D0 = sparseIntArray;
        sparseIntArray.put(z8e.taskDetailTitle, 4);
        sparseIntArray.put(z8e.buttonClose, 5);
        sparseIntArray.put(z8e.leadTitle, 6);
        sparseIntArray.put(z8e.addNewMeeting, 7);
        sparseIntArray.put(z8e.rvCallLogsList, 8);
        sparseIntArray.put(z8e.btnScheduleMeet, 9);
    }

    public wg7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 10, C0, D0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.B0 != 0) {
                return true;
            }
            return this.s0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.B0 = 16L;
        }
        this.s0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return k0((xz8) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            l0((ck6) obj);
        } else if (73 == i) {
            m0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.x0;
        Leads leads = this.v0;
        Integer num = this.w0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), leads);
        }
    }

    @Override // p001o.vg7
    public void j0(Leads leads) {
        this.v0 = leads;
        synchronized (this) {
            this.B0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public final boolean k0(xz8 xz8Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.B0 |= 1;
        }
        return true;
    }

    public void l0(ck6 ck6Var) {
        this.x0 = ck6Var;
        synchronized (this) {
            this.B0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void m0(Integer num) {
        this.w0 = num;
        synchronized (this) {
            this.B0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.B0;
            this.B0 = 0L;
        }
        Leads leads = this.v0;
        if ((24 & j) != 0) {
            this.s0.h0(leads);
        }
        if ((j & 16) != 0) {
            this.u0.setOnClickListener(this.A0);
        }
        ewi.m25683r(this.s0);
    }

    public wg7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (ShapeableImageView) objArr[7], (MaterialButton) objArr[9], (ShapeableImageView) objArr[5], (MaterialTextView) objArr[6], (RecyclerView) objArr[8], (xz8) objArr[3], (ConstraintLayout) objArr[4], (MaterialTextView) objArr[2]);
        this.B0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.y0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.z0 = constraintLayout2;
        constraintLayout2.setTag(null);
        m25693Z(this.s0);
        this.u0.setTag(null);
        a0(view);
        this.A0 = new jbc(this, 1);
        mo16291G();
    }
}
