package w3;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 implements t2 {

    /* renamed from: a */
    public final ViewConfiguration f38048a;

    public x0(ViewConfiguration viewConfiguration) {
        this.f38048a = viewConfiguration;
    }

    @Override // w3.t2
    /* renamed from: a */
    public final long mo14528a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // w3.t2
    /* renamed from: b */
    public final long mo14529b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // w3.t2
    /* renamed from: c */
    public final float mo15004c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return y0.m15045b(this.f38048a);
        }
        return 2.0f;
    }

    @Override // w3.t2
    /* renamed from: e */
    public final float mo15005e() {
        return this.f38048a.getScaledMaximumFlingVelocity();
    }

    @Override // w3.t2
    /* renamed from: f */
    public final float mo14531f() {
        return this.f38048a.getScaledTouchSlop();
    }

    @Override // w3.t2
    /* renamed from: g */
    public final float mo15006g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return y0.m15044a(this.f38048a);
        }
        return 16.0f;
    }
}
