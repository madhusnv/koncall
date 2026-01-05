package p001o;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class rid {

    /* renamed from: e */
    public static final C16617a f43680e = new C16617a(null);

    /* renamed from: f */
    public static final Map f43681f = new HashMap();

    /* renamed from: a */
    public final boolean f43682a;

    /* renamed from: b */
    public final File f43683b;

    /* renamed from: c */
    public final Lock f43684c;

    /* renamed from: d */
    public FileChannel f43685d;

    /* renamed from: o.rid$a */
    public static final class C16617a {
        public C16617a() {
        }

        public /* synthetic */ C16617a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final Lock m46835b(String str) {
            Lock lock;
            synchronized (rid.f43681f) {
                Map map = rid.f43681f;
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            }
            return lock;
        }
    }

    public rid(String str, File file, boolean z) {
        File file2;
        sq8.m48649h(str, "name");
        this.f43682a = z;
        if (file != null) {
            file2 = new File(file, str + ".lck");
        } else {
            file2 = null;
        }
        this.f43683b = file2;
        this.f43684c = f43680e.m46835b(str);
    }

    /* renamed from: c */
    public static /* synthetic */ void m46831c(rid ridVar, boolean z, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = ridVar.f43682a;
        }
        ridVar.m46832b(z);
    }

    /* renamed from: b */
    public final void m46832b(boolean z) throws IOException {
        this.f43684c.lock();
        if (z) {
            try {
                File file = this.f43683b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f43683b).getChannel();
                channel.lock();
                this.f43685d = channel;
            } catch (IOException unused) {
                this.f43685d = null;
            }
        }
    }

    /* renamed from: d */
    public final void m46833d() throws IOException {
        try {
            FileChannel fileChannel = this.f43685d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f43684c.unlock();
    }
}
