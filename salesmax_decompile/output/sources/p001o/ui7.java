package p001o;

import ai.salesmax.model.LeadsTeam;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import p001o.ewi;

/* loaded from: classes.dex */
public class ui7 extends ti7 {
    public static final ewi.C13274i v0;
    public static final SparseIntArray w0;
    public final MaterialCardView t0;
    public long u0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(3);
        v0 = c13274i;
        c13274i.m25699a(0, new String[]{"content_no_team_member"}, new int[]{1}, new int[]{p9e.content_no_team_member});
        SparseIntArray sparseIntArray = new SparseIntArray();
        w0 = sparseIntArray;
        sparseIntArray.put(z8e.listMemberships, 2);
    }

    public ui7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, v0, w0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.u0 != 0) {
                return true;
            }
            return this.n0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.u0 = 32L;
        }
        this.n0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return l0((j44) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (88 == i) {
            k0(((Boolean) obj).booleanValue());
        } else if (33 == i) {
            m0((ck6) obj);
        } else if (67 == i) {
            j0((LeadsTeam) obj);
        } else {
            if (73 != i) {
                return false;
            }
            n0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.ti7
    public void j0(LeadsTeam leadsTeam) {
        this.q0 = leadsTeam;
    }

    @Override // p001o.ti7
    public void k0(boolean z) {
        this.p0 = z;
        synchronized (this) {
            this.u0 |= 2;
        }
        m28509h(88);
        super.m25692R();
    }

    public final boolean l0(j44 j44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.u0 |= 1;
        }
        return true;
    }

    public void m0(ck6 ck6Var) {
        this.s0 = ck6Var;
    }

    public void n0(Integer num) {
        this.r0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        synchronized (this) {
            j = this.u0;
            this.u0 = 0L;
        }
        boolean z = this.p0;
        if ((j & 34) != 0) {
            this.n0.h0(z);
        }
        ewi.m25683r(this.n0);
    }

    public ui7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (j44) objArr[1], (RecyclerView) objArr[2]);
        this.u0 = -1L;
        m25693Z(this.n0);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.t0 = materialCardView;
        materialCardView.setTag(null);
        a0(view);
        mo16291G();
    }
}
