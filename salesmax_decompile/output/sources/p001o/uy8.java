package p001o;

import ai.salesmax.model.EntityListInfo;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class uy8 extends ty8 {
    public static final ewi.C13274i t0 = null;
    public static final SparseIntArray u0 = null;
    public long s0;

    public uy8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 3, t0, u0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.s0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.s0 = 4L;
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
        if (67 == i) {
            j0((EntityListInfo) obj);
        } else {
            if (73 != i) {
                return false;
            }
            k0((Integer) obj);
        }
        return true;
    }

    @Override // p001o.ty8
    public void j0(EntityListInfo entityListInfo) {
        this.q0 = entityListInfo;
        synchronized (this) {
            this.s0 |= 1;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ty8
    public void k0(Integer num) {
        this.r0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long createdAt;
        String listName;
        synchronized (this) {
            j = this.s0;
            createdAt = 0;
            this.s0 = 0L;
        }
        EntityListInfo entityListInfo = this.q0;
        long j2 = j & 5;
        if (j2 == 0 || entityListInfo == null) {
            listName = null;
        } else {
            listName = entityListInfo.getListName();
            createdAt = entityListInfo.getCreatedAt();
        }
        if (j2 != 0) {
            nr1.f1(this.n0, listName);
            nr1.i0(this.p0, Long.valueOf(createdAt));
        }
    }

    public uy8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[1], (MaterialCardView) objArr[0], (MaterialTextView) objArr[2]);
        this.s0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        a0(view);
        mo16291G();
    }
}
