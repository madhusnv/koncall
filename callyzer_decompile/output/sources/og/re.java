package og;

import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class re {
    /* renamed from: a */
    public static final long m10877a(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
        if (m10878b(connection) == 0) {
            return -1L;
        }
        InterfaceC4026c interfaceC4026cY0 = connection.y0("SELECT last_insert_rowid()");
        try {
            interfaceC4026cY0.r0();
            long j6 = interfaceC4026cY0.getLong(0);
            mb.m10760a(interfaceC4026cY0, null);
            return j6;
        } finally {
        }
    }

    /* renamed from: b */
    public static final int m10878b(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
        InterfaceC4026c interfaceC4026cY0 = connection.y0("SELECT changes()");
        try {
            interfaceC4026cY0.r0();
            int i10 = (int) interfaceC4026cY0.getLong(0);
            mb.m10760a(interfaceC4026cY0, null);
            return i10;
        } finally {
        }
    }

    /* renamed from: c */
    public static final int m10879c(int i10, int i11) {
        return (i10 >> i11) & 31;
    }
}
