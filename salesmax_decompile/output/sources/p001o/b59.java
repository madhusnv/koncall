package p001o;

import ai.salesmax.model.UserManagementActionType;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class b59 extends a59 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i w0 = null;
    public static final SparseIntArray x0 = null;
    public final View.OnClickListener t0;
    public final View.OnClickListener u0;
    public long v0;

    public b59(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, w0, x0));
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
        if (33 == i) {
            h0((ck6) obj);
        } else if (67 == i) {
            i0((UserManagementActionType) obj);
        } else {
            if (73 != i) {
                return false;
            }
            j0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.s0;
            UserManagementActionType userManagementActionType = this.q0;
            Integer num = this.r0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), userManagementActionType);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.s0;
        UserManagementActionType userManagementActionType2 = this.q0;
        Integer num2 = this.r0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), userManagementActionType2);
        }
    }

    public void h0(ck6 ck6Var) {
        this.s0 = ck6Var;
        synchronized (this) {
            this.v0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(UserManagementActionType userManagementActionType) {
        this.q0 = userManagementActionType;
        synchronized (this) {
            this.v0 |= 2;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.r0 = num;
        synchronized (this) {
            this.v0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        Integer icon;
        String title;
        synchronized (this) {
            j = this.v0;
            this.v0 = 0L;
        }
        UserManagementActionType userManagementActionType = this.q0;
        long j2 = 10 & j;
        if (j2 == 0 || userManagementActionType == null) {
            icon = null;
            title = null;
        } else {
            icon = userManagementActionType.getIcon();
            title = userManagementActionType.getTitle();
        }
        if (j2 != 0) {
            nr1.m40980y(this.n0, icon);
            fjh.m26938c(this.p0, title);
        }
        if ((j & 8) != 0) {
            this.n0.setOnClickListener(this.u0);
            this.o0.setOnClickListener(this.t0);
        }
    }

    public b59(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[1], (MaterialCardView) objArr[0], (MaterialTextView) objArr[2]);
        this.v0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        a0(view);
        this.t0 = new jbc(this, 1);
        this.u0 = new jbc(this, 2);
        mo16291G();
    }
}
