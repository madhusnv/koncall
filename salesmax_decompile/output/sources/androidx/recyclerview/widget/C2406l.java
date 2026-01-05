package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.storage.s3.transfer.TransferRecord;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes2.dex */
public class C2406l extends RecyclerView.AbstractC2388y {

    /* renamed from: k */
    public PointF f10173k;

    /* renamed from: l */
    public final DisplayMetrics f10174l;

    /* renamed from: n */
    public float f10176n;

    /* renamed from: i */
    public final LinearInterpolator f10171i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f10172j = new DecelerateInterpolator();

    /* renamed from: m */
    public boolean f10175m = false;

    /* renamed from: o */
    public int f10177o = 0;

    /* renamed from: p */
    public int f10178p = 0;

    public C2406l(Context context) {
        this.f10174l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    public final float m9607A() {
        if (!this.f10175m) {
            this.f10176n = mo9613v(this.f10174l);
            this.f10175m = true;
        }
        return this.f10176n;
    }

    /* renamed from: B */
    public int mo9608B() {
        PointF pointF = this.f10173k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: C */
    public void m9609C(RecyclerView.AbstractC2388y.a aVar) {
        PointF pointFMo9320a = mo9320a(m9325f());
        if (pointFMo9320a == null || (pointFMo9320a.x == 0.0f && pointFMo9320a.y == 0.0f)) {
            aVar.m9339b(m9325f());
            m9337r();
            return;
        }
        m9328i(pointFMo9320a);
        this.f10173k = pointFMo9320a;
        this.f10177o = (int) (pointFMo9320a.x * 10000.0f);
        this.f10178p = (int) (pointFMo9320a.y * 10000.0f);
        aVar.m9341d((int) (this.f10177o * 1.2f), (int) (this.f10178p * 1.2f), (int) (mo9615x(TransferRecord.MAXIMUM_UPLOAD_PARTS) * 1.2f), this.f10171i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2388y
    /* renamed from: l */
    public void mo9331l(int i, int i2, RecyclerView.C2389z c2389z, RecyclerView.AbstractC2388y.a aVar) {
        if (m9322c() == 0) {
            m9337r();
            return;
        }
        this.f10177o = m9616y(this.f10177o, i);
        int iM9616y = m9616y(this.f10178p, i2);
        this.f10178p = iM9616y;
        if (this.f10177o == 0 && iM9616y == 0) {
            m9609C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2388y
    /* renamed from: m */
    public void mo9332m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2388y
    /* renamed from: n */
    public void mo9333n() {
        this.f10178p = 0;
        this.f10177o = 0;
        this.f10173k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2388y
    /* renamed from: o */
    public void mo9334o(View view, RecyclerView.C2389z c2389z, RecyclerView.AbstractC2388y.a aVar) {
        int iMo9611t = mo9611t(view, mo9617z());
        int iMo9612u = mo9612u(view, mo9608B());
        int iM9614w = m9614w((int) Math.sqrt((iMo9611t * iMo9611t) + (iMo9612u * iMo9612u)));
        if (iM9614w > 0) {
            aVar.m9341d(-iMo9611t, -iMo9612u, iM9614w, this.f10172j);
        }
    }

    /* renamed from: s */
    public int m9610s(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* renamed from: t */
    public int mo9611t(View view, int i) {
        RecyclerView.AbstractC2379p abstractC2379pM9324e = m9324e();
        if (abstractC2379pM9324e == null || !abstractC2379pM9324e.mo9027A()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return m9610s(abstractC2379pM9324e.g0(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, abstractC2379pM9324e.j0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, abstractC2379pM9324e.getPaddingLeft(), abstractC2379pM9324e.z0() - abstractC2379pM9324e.getPaddingRight(), i);
    }

    /* renamed from: u */
    public int mo9612u(View view, int i) {
        RecyclerView.AbstractC2379p abstractC2379pM9324e = m9324e();
        if (abstractC2379pM9324e == null || !abstractC2379pM9324e.mo9028B()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return m9610s(abstractC2379pM9324e.k0(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, abstractC2379pM9324e.e0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, abstractC2379pM9324e.getPaddingTop(), abstractC2379pM9324e.m0() - abstractC2379pM9324e.getPaddingBottom(), i);
    }

    /* renamed from: v */
    public float mo9613v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: w */
    public int m9614w(int i) {
        return (int) Math.ceil(mo9615x(i) / 0.3356d);
    }

    /* renamed from: x */
    public int mo9615x(int i) {
        return (int) Math.ceil(Math.abs(i) * m9607A());
    }

    /* renamed from: y */
    public final int m9616y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* renamed from: z */
    public int mo9617z() {
        PointF pointF = this.f10173k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
