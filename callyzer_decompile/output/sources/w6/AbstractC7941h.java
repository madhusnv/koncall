package w6;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w6.h */
/* loaded from: classes.dex */
public abstract class AbstractC7941h {
    /* renamed from: a */
    public static void m15094a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    /* renamed from: b */
    public static FileDescriptor m15095b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    /* renamed from: c */
    public static long m15096c(FileDescriptor fileDescriptor, long j6, int i10) {
        return Os.lseek(fileDescriptor, j6, i10);
    }
}
