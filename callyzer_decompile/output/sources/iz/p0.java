package iz;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class p0 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: a */
    public static q0 m7756a(String javaName) {
        AbstractC4154l.m8923f(javaName, "javaName");
        int iHashCode = javaName.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return q0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return q0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return q0.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return q0.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return q0.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }
}
