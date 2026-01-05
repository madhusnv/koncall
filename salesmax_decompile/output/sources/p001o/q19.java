package p001o;

import ai.salesmax.model.NotificationStagingInfo;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class q19 extends p19 implements jbc.InterfaceC14485a {
    public static final SparseIntArray A0;
    public static final ewi.C13274i z0 = null;
    public final View.OnClickListener x0;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(z8e.ivNotificationProfilePic, 6);
    }

    public q19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 7, z0, A0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.y0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.y0 = 8L;
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
        } else if (73 == i) {
            j0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((NotificationStagingInfo) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.w0;
        NotificationStagingInfo notificationStagingInfo = this.u0;
        Integer num = this.v0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), notificationStagingInfo);
        }
    }

    public void h0(ck6 ck6Var) {
        this.w0 = ck6Var;
        synchronized (this) {
            this.y0 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(NotificationStagingInfo notificationStagingInfo) {
        this.u0 = notificationStagingInfo;
        synchronized (this) {
            this.y0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.v0 = num;
        synchronized (this) {
            this.y0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        Long scheduledAt;
        String str;
        boolean zIsNewItem;
        String notificationType;
        synchronized (this) {
            j = this.y0;
            this.y0 = 0L;
        }
        NotificationStagingInfo notificationStagingInfo = this.u0;
        long j2 = j & 12;
        String content = null;
        if (j2 != 0) {
            if (notificationStagingInfo != null) {
                content = notificationStagingInfo.getContent();
                zIsNewItem = notificationStagingInfo.isNewItem();
                notificationType = notificationStagingInfo.getNotificationType();
                scheduledAt = notificationStagingInfo.getScheduledAt();
            } else {
                zIsNewItem = false;
                scheduledAt = null;
                notificationType = null;
            }
            if (j2 != 0) {
                j |= zIsNewItem ? 32L : 16L;
            }
            i = zIsNewItem ? 0 : 8;
            str = content;
            content = notificationType;
        } else {
            scheduledAt = null;
            str = null;
        }
        if ((12 & j) != 0) {
            this.n0.setVisibility(i);
            nr1.g3(this.o0, content);
            nr1.h0(this.p0, scheduledAt);
            nr1.A0(this.s0, content);
            fjh.m26938c(this.t0, str);
        }
        if ((j & 8) != 0) {
            this.q0.setOnClickListener(this.x0);
        }
    }

    public q19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextView) objArr[2], (ShapeableImageView) objArr[1], (MaterialTextView) objArr[5], (MaterialCardView) objArr[0], (FrameLayout) objArr[6], (MaterialTextView) objArr[3], (MaterialTextView) objArr[4]);
        this.y0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        a0(view);
        this.x0 = new jbc(this, 1);
        mo16291G();
    }
}
