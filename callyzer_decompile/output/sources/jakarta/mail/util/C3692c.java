package jakarta.mail.util;

import java.io.RandomAccessFile;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.util.c */
/* loaded from: classes3.dex */
public final class C3692c {

    /* renamed from: a */
    public int f19426a;

    /* renamed from: b */
    public RandomAccessFile f19427b;

    public final void finalize() throws Throwable {
        try {
            this.f19427b.close();
        } finally {
            super.finalize();
        }
    }
}
