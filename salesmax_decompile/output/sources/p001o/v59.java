package p001o;

import ai.salesmax.model.ActiveProfile;
import ai.salesmax.model.ActiveProfilePermissionIssues;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class v59 extends u59 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i D0 = null;
    public static final SparseIntArray E0;
    public final View.OnClickListener A0;
    public final View.OnClickListener B0;
    public long C0;
    public final View.OnClickListener z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(z8e.tvIssueMessage, 7);
        sparseIntArray.put(z8e.issueIcon, 8);
    }

    public v59(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 9, D0, E0));
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
            this.C0 = 32L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return h0((t7c) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return i0((ObservableBoolean) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            l0((Integer) obj);
        } else if (33 == i) {
            j0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((ActiveProfile) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.y0;
            ActiveProfile activeProfile = this.w0;
            Integer num = this.x0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), activeProfile);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.y0;
            ActiveProfile activeProfile2 = this.w0;
            Integer num2 = this.x0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), activeProfile2);
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        ck6 ck6Var3 = this.y0;
        ActiveProfile activeProfile3 = this.w0;
        Integer num3 = this.x0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), activeProfile3);
        }
    }

    public final boolean h0(t7c t7cVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.C0 |= 1;
        }
        return true;
    }

    public final boolean i0(ObservableBoolean observableBoolean, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.C0 |= 2;
        }
        return true;
    }

    public void j0(ck6 ck6Var) {
        this.y0 = ck6Var;
        synchronized (this) {
            this.C0 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(ActiveProfile activeProfile) {
        this.w0 = activeProfile;
        synchronized (this) {
            this.C0 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.x0 = num;
        synchronized (this) {
            this.C0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String welcomeMessageSubHeading;
        String welcomeMessage;
        String accountProfileUrl;
        synchronized (this) {
            j = this.C0;
            this.C0 = 0L;
        }
        ActiveProfile activeProfile = this.w0;
        long j2 = j & 51;
        String str = null;
        if (j2 != 0) {
            if ((j & 48) == 0 || activeProfile == null) {
                accountProfileUrl = null;
                welcomeMessageSubHeading = null;
                welcomeMessage = null;
            } else {
                accountProfileUrl = activeProfile.getAccountProfileUrl();
                welcomeMessageSubHeading = activeProfile.getWelcomeMessageSubHeading();
                welcomeMessage = activeProfile.getWelcomeMessage();
            }
            t7c permissionIssues = activeProfile != null ? activeProfile.getPermissionIssues() : null;
            g0(0, permissionIssues);
            ActiveProfilePermissionIssues activeProfilePermissionIssues = permissionIssues != null ? (ActiveProfilePermissionIssues) permissionIssues.get() : null;
            ObservableBoolean hasOpenPermissionIssues = activeProfilePermissionIssues != null ? activeProfilePermissionIssues.getHasOpenPermissionIssues() : null;
            g0(1, hasOpenPermissionIssues);
            boolean zM5959i = hasOpenPermissionIssues != null ? hasOpenPermissionIssues.m5959i() : false;
            if (j2 != 0) {
                j |= zM5959i ? 128L : 64L;
            }
            i = zM5959i ? 0 : 8;
            str = accountProfileUrl;
        } else {
            welcomeMessageSubHeading = null;
            welcomeMessage = null;
        }
        if ((51 & j) != 0) {
            this.n0.setVisibility(i);
        }
        if ((32 & j) != 0) {
            this.n0.setOnClickListener(this.B0);
            this.p0.setOnClickListener(this.A0);
            this.s0.setOnClickListener(this.z0);
        }
        if ((j & 48) != 0) {
            nr1.J2(this.q0, str);
            nr1.f1(this.t0, welcomeMessage);
            nr1.f1(this.u0, welcomeMessageSubHeading);
        }
    }

    public v59(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (MaterialCardView) objArr[6], (ShapeableImageView) objArr[8], (ConstraintLayout) objArr[1], (ShapeableImageView) objArr[2], (MaterialCardView) objArr[0], (MaterialButton) objArr[5], (MaterialTextView) objArr[3], (MaterialTextView) objArr[4], (MaterialTextView) objArr[7]);
        this.C0 = -1L;
        this.n0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        a0(view);
        this.z0 = new jbc(this, 2);
        this.A0 = new jbc(this, 1);
        this.B0 = new jbc(this, 3);
        mo16291G();
    }
}
