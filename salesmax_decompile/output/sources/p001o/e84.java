package p001o;

import androidx.lifecycle.AbstractC2145n;
import com.google.android.gms.location.DeviceOrientationRequest;

/* loaded from: classes2.dex */
public abstract class e84 {
    /* renamed from: a */
    public static final AbstractC2145n m24520a(q74 q74Var, long j, nl7 nl7Var) {
        sq8.m48649h(q74Var, "context");
        sq8.m48649h(nl7Var, "block");
        return new d84(q74Var, j, nl7Var);
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC2145n m24521b(q74 q74Var, long j, nl7 nl7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            q74Var = e66.f21035a;
        }
        if ((i & 2) != 0) {
            j = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        }
        return m24520a(q74Var, j, nl7Var);
    }
}
