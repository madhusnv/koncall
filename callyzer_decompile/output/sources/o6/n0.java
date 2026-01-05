package o6;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import ex.InterfaceC2137a;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f26094a;

    /* renamed from: b */
    public final /* synthetic */ q0 f26095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(q0 q0Var, int i10) {
        super(0);
        this.f26094a = i10;
        this.f26095b = q0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        switch (this.f26094a) {
            case 0:
                q0 q0Var = this.f26095b;
                File file = new File(q0Var.f26126b.getAbsolutePath() + q0Var.f26129e);
                q0.m10452f(q0Var, file);
                return file;
            case 1:
                System.loadLibrary("datastore_shared_counter");
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new n0(this.f26095b, 0).invoke(), 939524096);
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptorOpen = null;
                }
                try {
                    int fd2 = parcelFileDescriptorOpen.getFd();
                    NativeSharedCounter nativeSharedCounter = x0.f26194b;
                    if (nativeSharedCounter.nativeTruncateFile(fd2) != 0) {
                        throw new IOException("Failed to truncate counter file");
                    }
                    long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                    if (jNativeCreateSharedCounter < 0) {
                        throw new IOException("Failed to mmap counter file");
                    }
                    x0 x0Var = new x0(jNativeCreateSharedCounter);
                    parcelFileDescriptorOpen.close();
                    return x0Var;
                } catch (Throwable th3) {
                    th = th3;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            default:
                q0 q0Var2 = this.f26095b;
                File file2 = new File(q0Var2.f26126b.getAbsolutePath() + q0Var2.f26128d);
                q0.m10452f(q0Var2, file2);
                return file2;
        }
    }
}
