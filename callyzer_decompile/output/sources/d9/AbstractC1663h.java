package d9;

import android.net.NetworkRequest;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.h */
/* loaded from: classes.dex */
public abstract class AbstractC1663h {
    /* renamed from: a */
    public static int[] m5374a(NetworkRequest request) {
        AbstractC4154l.m8923f(request, "request");
        int[] capabilities = request.getCapabilities();
        AbstractC4154l.m8922e(capabilities, "request.capabilities");
        return capabilities;
    }

    /* renamed from: b */
    public static int[] m5375b(NetworkRequest request) {
        AbstractC4154l.m8923f(request, "request");
        int[] transportTypes = request.getTransportTypes();
        AbstractC4154l.m8922e(transportTypes, "request.transportTypes");
        return transportTypes;
    }
}
