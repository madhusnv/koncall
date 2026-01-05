package iz;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 {
    /* renamed from: a */
    public static f0 m7729a(String protocol) throws IOException {
        AbstractC4154l.m8923f(protocol, "protocol");
        f0 f0Var = f0.HTTP_1_0;
        if (protocol.equals(f0Var.protocol)) {
            return f0Var;
        }
        f0 f0Var2 = f0.HTTP_1_1;
        if (protocol.equals(f0Var2.protocol)) {
            return f0Var2;
        }
        f0 f0Var3 = f0.H2_PRIOR_KNOWLEDGE;
        if (protocol.equals(f0Var3.protocol)) {
            return f0Var3;
        }
        f0 f0Var4 = f0.HTTP_2;
        if (protocol.equals(f0Var4.protocol)) {
            return f0Var4;
        }
        f0 f0Var5 = f0.SPDY_3;
        if (protocol.equals(f0Var5.protocol)) {
            return f0Var5;
        }
        f0 f0Var6 = f0.QUIC;
        if (protocol.equals(f0Var6.protocol)) {
            return f0Var6;
        }
        f0 f0Var7 = f0.HTTP_3;
        if (AbstractC5185w.m10138t(protocol, f0Var7.protocol, false)) {
            return f0Var7;
        }
        throw new IOException("Unexpected protocol: ".concat(protocol));
    }
}
