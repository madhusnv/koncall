package ai.salesmax.call.observer;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.FileObserver;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.cookie.ClientCookie;
import p001o.id5;
import p001o.ife;
import p001o.rz1;
import p001o.sq8;
import p001o.uz6;
import p001o.y3i;
import p001o.zv5;

/* loaded from: classes.dex */
public final class FileRecordingObserver extends FileObserver {

    /* renamed from: e */
    public static final C0060a f258e = new C0060a(null);

    /* renamed from: f */
    public static final int f259f = 8;

    /* renamed from: g */
    public static volatile FileRecordingObserver f260g;

    /* renamed from: a */
    public final Context f261a;

    /* renamed from: b */
    public final String f262b;

    /* renamed from: c */
    public final Uri f263c;

    /* renamed from: d */
    public final ConcurrentHashMap f264d;

    /* renamed from: ai.salesmax.call.observer.FileRecordingObserver$a */
    public static final class C0060a {
        public C0060a() {
        }

        public /* synthetic */ C0060a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m146a() {
            synchronized (this) {
                if (FileRecordingObserver.f260g != null) {
                    FileRecordingObserver.f260g = null;
                }
                y3i y3iVar = y3i.f54824a;
            }
        }

        /* renamed from: b */
        public final FileRecordingObserver m147b(Context context, String str, Uri uri) {
            sq8.m48649h(context, "context");
            sq8.m48649h(str, ClientCookie.PATH_ATTR);
            FileRecordingObserver fileRecordingObserver = FileRecordingObserver.f260g;
            if (fileRecordingObserver == null) {
                synchronized (this) {
                    if (FileRecordingObserver.f260g == null) {
                        Context applicationContext = context.getApplicationContext();
                        sq8.m48648g(applicationContext, "getApplicationContext(...)");
                        FileRecordingObserver.f260g = new FileRecordingObserver(applicationContext, str, uri, null);
                    }
                    fileRecordingObserver = FileRecordingObserver.f260g;
                }
            }
            return fileRecordingObserver;
        }
    }

    public /* synthetic */ FileRecordingObserver(Context context, String str, Uri uri, id5 id5Var) {
        this(context, str, uri);
    }

    /* renamed from: d */
    public static /* synthetic */ rz1 m144d(FileRecordingObserver fileRecordingObserver, String str, Uri uri, int i, Object obj) {
        if ((i & 2) != 0) {
            uri = null;
        }
        return fileRecordingObserver.m145c(str, uri);
    }

    /* renamed from: c */
    public final rz1 m145c(String str, Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append("getContent invoked for file: ");
        sb.append(str);
        sb.append(" and uri: ");
        sb.append(uri);
        Path path = Paths.get(this.f262b, str);
        File file = path.toFile();
        long jLastModified = file.lastModified();
        rz1.C16681a c16681a = new rz1.C16681a();
        String absolutePath = file.getAbsolutePath();
        sq8.m48648g(absolutePath, "getAbsolutePath(...)");
        rz1.C16681a c16681aM47318g = c16681a.m47318g(absolutePath);
        if (uri == null) {
            uri = Uri.fromFile(path.toFile());
        }
        rz1.C16681a c16681aM47313b = c16681aM47318g.m47321j(uri).m47313b(this.f261a);
        String name = file.getName();
        sq8.m48648g(name, "getName(...)");
        rz1.C16681a c16681aM47316e = c16681aM47313b.m47316e(name);
        String absolutePath2 = file.getAbsolutePath();
        sq8.m48648g(absolutePath2, "getAbsolutePath(...)");
        rz1.C16681a c16681aM47315d = c16681aM47316e.m47317f(absolutePath2).m47314c(Long.valueOf(jLastModified)).m47315d(Long.valueOf(jLastModified));
        uz6 uz6Var = uz6.f49700a;
        Context context = this.f261a;
        String absolutePath3 = file.getAbsolutePath();
        sq8.m48648g(absolutePath3, "getAbsolutePath(...)");
        return c16681aM47315d.m47319h(uz6Var.m52180d(context, absolutePath3)).m47312a();
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        if (i != 8) {
            if (i == 256 && str != null) {
                File file = Paths.get(this.f262b, str).toFile();
                long jLastModified = file.lastModified();
                StringBuilder sb = new StringBuilder();
                sb.append("creation date: ");
                sb.append(jLastModified);
                ConcurrentHashMap concurrentHashMap = this.f264d;
                String absolutePath = file.getAbsolutePath();
                sq8.m48648g(absolutePath, "getAbsolutePath(...)");
                concurrentHashMap.put(absolutePath, Long.valueOf(jLastModified));
                return;
            }
            return;
        }
        if (str != null) {
            String str2 = uz6.f49700a.m52178b(str) ^ true ? str : null;
            if (str2 != null) {
                if (Build.VERSION.SDK_INT < 30) {
                    rz1 rz1VarM144d = m144d(this, str2, null, 2, null);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Call recording resolved: ");
                    sb2.append(rz1VarM144d);
                    ife.f28606f.m32075a().m32065d(rz1VarM144d);
                    return;
                }
                Uri uri = this.f263c;
                if (uri != null) {
                    zv5 zv5VarM59973b = zv5.m59973b(this.f261a, uri);
                    zv5 zv5VarM59974a = zv5VarM59973b != null ? zv5VarM59973b.m59974a(str2) : null;
                    rz1 rz1VarM145c = m145c(str, zv5VarM59974a != null ? zv5VarM59974a.mo32893d() : null);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Call recording resolved: ");
                    sb3.append(rz1VarM145c);
                    ife.f28606f.m32075a().m32065d(rz1VarM145c);
                }
            }
        }
    }

    @Override // android.os.FileObserver
    public void startWatching() {
        super.startWatching();
    }

    @Override // android.os.FileObserver
    public void stopWatching() {
        super.stopWatching();
    }

    public FileRecordingObserver(Context context, String str, Uri uri) {
        super(str, 4095);
        this.f261a = context;
        this.f262b = str;
        this.f263c = uri;
        this.f264d = new ConcurrentHashMap();
    }
}
