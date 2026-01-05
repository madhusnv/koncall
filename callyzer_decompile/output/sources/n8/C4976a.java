package n8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n8.a */
/* loaded from: classes.dex */
public final class C4976a {

    /* renamed from: e */
    public static final HashMap f24697e = new HashMap();

    /* renamed from: a */
    public final boolean f24698a;

    /* renamed from: b */
    public final File f24699b;

    /* renamed from: c */
    public final Lock f24700c;

    /* renamed from: d */
    public FileChannel f24701d;

    public C4976a(String str, File file, boolean z6) {
        Lock lock;
        this.f24698a = z6;
        this.f24699b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f24697e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f24700c = lock;
    }

    /* renamed from: a */
    public final void m9893a(boolean z6) throws IOException {
        this.f24700c.lock();
        if (z6) {
            File file = this.f24699b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f24701d = channel;
            } catch (IOException unused) {
                this.f24701d = null;
            }
        }
    }

    /* renamed from: b */
    public final void m9894b() throws IOException {
        try {
            FileChannel fileChannel = this.f24701d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f24700c.unlock();
    }
}
