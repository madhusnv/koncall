package p001o;

import ai.salesmax.services.model.SavedTableViewInfo;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class w29 extends v29 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i D0 = null;
    public static final SparseIntArray E0 = null;
    public final View.OnLongClickListener A0;
    public final View.OnLongClickListener B0;
    public long C0;
    public final View.OnClickListener x0;
    public final View.OnClickListener y0;
    public final View.OnClickListener z0;

    public w29(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 6, D0, E0));
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
            this.C0 = 64L;
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
            m0((Integer) obj);
        } else if (33 == i) {
            k0((ck6) obj);
        } else if (7 == i) {
            j0((rog) obj);
        } else {
            if (67 != i) {
                return false;
            }
            l0((SavedTableViewInfo) obj);
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
        if (i != 5) {
            return;
        }
        ck6 ck6Var3 = this.v0;
        SavedTableViewInfo savedTableViewInfo3 = this.t0;
        Integer num3 = this.u0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), savedTableViewInfo3);
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

    public void j0(rog rogVar) {
        this.w0 = rogVar;
    }

    public void k0(ck6 ck6Var) {
        this.v0 = ck6Var;
        synchronized (this) {
            this.C0 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(SavedTableViewInfo savedTableViewInfo) {
        this.t0 = savedTableViewInfo;
        synchronized (this) {
            this.C0 |= 32;
        }
        m28509h(67);
        super.m25692R();
    }

    public void m0(Integer num) {
        this.u0 = num;
        synchronized (this) {
            this.C0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        String str;
        String str2;
        int i;
        String viewName;
        int iM25688z;
        int i2;
        String tableName;
        long j2;
        boolean zIsAmendable;
        synchronized (this) {
            j = this.C0;
            this.C0 = 0L;
        }
        SavedTableViewInfo savedTableViewInfo = this.t0;
        if ((99 & j) != 0) {
            long j3 = j & 96;
            if (j3 != 0) {
                if (savedTableViewInfo != null) {
                    viewName = savedTableViewInfo.getViewName();
                    zIsAmendable = savedTableViewInfo.isAmendable();
                    tableName = savedTableViewInfo.getTableName();
                } else {
                    zIsAmendable = false;
                    viewName = null;
                    tableName = null;
                }
                if (j3 != 0) {
                    j |= zIsAmendable ? 256L : 128L;
                }
                i2 = zIsAmendable ? 0 : 4;
            } else {
                i2 = 0;
                viewName = null;
                tableName = null;
            }
            if ((j & 97) == 0) {
                str2 = null;
                j2 = j & 98;
                if (j2 == 0) {
                    ObservableBoolean showMetricsInApp = savedTableViewInfo != null ? savedTableViewInfo.getShowMetricsInApp() : null;
                    g0(1, showMetricsInApp);
                    boolean z = showMetricsInApp != null ? showMetricsInApp.m5959i() : false;
                    if (j2 != 0) {
                        j |= z ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
                    }
                    iM25688z = ewi.m25688z(this.q0, z ? u6e.yellow_700 : u6e.grey_700);
                    str = tableName;
                    i = i2;
                } else {
                    i = i2;
                    str = tableName;
                }
            } else {
                t7c rowCount = savedTableViewInfo != null ? savedTableViewInfo.getRowCount() : null;
                g0(0, rowCount);
                if (rowCount != null) {
                    str2 = (String) rowCount.get();
                }
                j2 = j & 98;
                if (j2 == 0) {
                }
            }
            if ((j & 64) != 0) {
                this.n0.setOnClickListener(this.z0);
                this.n0.setOnLongClickListener(this.B0);
                this.p0.setOnClickListener(this.y0);
                this.p0.setOnLongClickListener(this.A0);
                this.q0.setOnClickListener(this.x0);
            }
            if ((j & 97) != 0) {
                fjh.m26938c(this.o0, str2);
            }
            if ((j & 96) != 0) {
                nr1.G0(this.p0, viewName);
                this.q0.setVisibility(i);
                nr1.f1(this.r0, viewName);
                nr1.f1(this.s0, str);
            }
            if ((j & 98) != 0 || ewi.m25687y() < 21) {
            }
            this.q0.setImageTintList(b74.m18212a(iM25688z));
            return;
        }
        str = null;
        str2 = null;
        i = 0;
        viewName = null;
        iM25688z = 0;
        if ((j & 64) != 0) {
        }
        if ((j & 97) != 0) {
        }
        if ((j & 96) != 0) {
        }
        if ((j & 98) != 0) {
        }
    }

    public w29(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (MaterialCardView) objArr[0], (MaterialTextView) objArr[4], (ShapeableImageView) objArr[1], (ShapeableImageView) objArr[5], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3]);
        this.C0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        a0(view);
        this.x0 = new jbc(this, 5);
        this.y0 = new jbc(this, 3);
        this.z0 = new jbc(this, 1);
        this.A0 = new sbc(this, 4);
        this.B0 = new sbc(this, 2);
        mo16291G();
    }
}
