package p001o;

import ai.salesmax.services.model.SavedTableViewInfo;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import androidx.databinding.ObservableBoolean;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class u29 extends t29 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i E0 = null;
    public static final SparseIntArray F0 = null;
    public final View.OnClickListener A0;
    public final View.OnClickListener B0;
    public final View.OnClickListener C0;
    public long D0;
    public final View.OnLongClickListener x0;
    public final View.OnClickListener y0;
    public final View.OnLongClickListener z0;

    public u29(yt4 yt4Var, View view) {
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
            this.D0 = 32L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return h0((ObservableBoolean) obj, i2);
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        if (i == 2) {
            ck6 ck6Var = this.v0;
            SavedTableViewInfo savedTableViewInfo = this.t0;
            Integer num = this.u0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), savedTableViewInfo);
            }
            return false;
        }
        if (i != 4) {
            return false;
        }
        ck6 ck6Var2 = this.v0;
        SavedTableViewInfo savedTableViewInfo2 = this.t0;
        Integer num2 = this.u0;
        if (ck6Var2 != null) {
            return ck6Var2.mo707a(view, num2.intValue(), savedTableViewInfo2);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            l0((Integer) obj);
        } else if (33 == i) {
            j0((ck6) obj);
        } else if (7 == i) {
            i0((rog) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((SavedTableViewInfo) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.v0;
            SavedTableViewInfo savedTableViewInfo = this.t0;
            Integer num = this.u0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), savedTableViewInfo);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.v0;
            SavedTableViewInfo savedTableViewInfo2 = this.t0;
            Integer num2 = this.u0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), savedTableViewInfo2);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var3 = this.v0;
            SavedTableViewInfo savedTableViewInfo3 = this.t0;
            Integer num3 = this.u0;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), savedTableViewInfo3);
                return;
            }
            return;
        }
        if (i != 6) {
            return;
        }
        ck6 ck6Var4 = this.v0;
        SavedTableViewInfo savedTableViewInfo4 = this.t0;
        Integer num4 = this.u0;
        if (ck6Var4 != null) {
            ck6Var4.mo708b(view, num4.intValue(), savedTableViewInfo4);
        }
    }

    public final boolean h0(ObservableBoolean observableBoolean, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.D0 |= 1;
        }
        return true;
    }

    public void i0(rog rogVar) {
        this.w0 = rogVar;
    }

    public void j0(ck6 ck6Var) {
        this.v0 = ck6Var;
        synchronized (this) {
            this.D0 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(SavedTableViewInfo savedTableViewInfo) {
        this.t0 = savedTableViewInfo;
        synchronized (this) {
            this.D0 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.u0 = num;
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
        String str;
        int i;
        int iM25688z;
        String viewName;
        String tableName;
        boolean selected;
        boolean zIsAmendable;
        synchronized (this) {
            j = this.D0;
            this.D0 = 0L;
        }
        SavedTableViewInfo savedTableViewInfo = this.t0;
        String str2 = null;
        if ((j & 49) != 0) {
            long j2 = j & 48;
            if (j2 != 0) {
                if (savedTableViewInfo != null) {
                    viewName = savedTableViewInfo.getViewName();
                    zIsAmendable = savedTableViewInfo.isAmendable();
                    selected = savedTableViewInfo.getSelected();
                    tableName = savedTableViewInfo.getTableName();
                } else {
                    viewName = null;
                    tableName = null;
                    zIsAmendable = false;
                    selected = false;
                }
                if (j2 != 0) {
                    j |= zIsAmendable ? 128L : 64L;
                }
                i = zIsAmendable ? 0 : 4;
            } else {
                viewName = null;
                tableName = null;
                i = 0;
                selected = false;
            }
            ObservableBoolean showMetricsInApp = savedTableViewInfo != null ? savedTableViewInfo.getShowMetricsInApp() : null;
            g0(0, showMetricsInApp);
            z = showMetricsInApp != null ? showMetricsInApp.m5959i() : false;
            if ((j & 49) != 0) {
                j |= z ? 512L : 256L;
            }
            str2 = viewName;
            str = tableName;
            iM25688z = ewi.m25688z(this.q0, z ? u6e.yellow_700 : u6e.grey_700);
            z = selected;
        } else {
            str = null;
            i = 0;
            iM25688z = 0;
        }
        if ((48 & j) != 0) {
            np3.m40895a(this.n0, z);
            nr1.G0(this.p0, str2);
            this.q0.setVisibility(i);
            nr1.f1(this.r0, str2);
            nr1.f1(this.s0, str);
        }
        if ((32 & j) != 0) {
            this.n0.setOnClickListener(this.y0);
            this.o0.setOnClickListener(this.B0);
            this.o0.setOnLongClickListener(this.z0);
            this.p0.setOnClickListener(this.C0);
            this.p0.setOnLongClickListener(this.x0);
            this.q0.setOnClickListener(this.A0);
        }
        if ((j & 49) == 0 || ewi.m25687y() < 21) {
            return;
        }
        this.q0.setImageTintList(b74.m18212a(iM25688z));
    }

    public u29(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (CheckBox) objArr[5], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[1], (ShapeableImageView) objArr[4], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.D0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        a0(view);
        this.x0 = new sbc(this, 4);
        this.y0 = new jbc(this, 6);
        this.z0 = new sbc(this, 2);
        this.A0 = new jbc(this, 5);
        this.B0 = new jbc(this, 1);
        this.C0 = new jbc(this, 3);
        mo16291G();
    }
}
