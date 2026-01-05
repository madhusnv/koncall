package p001o;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import p001o.de8;
import p001o.obj;

/* loaded from: classes5.dex */
public final class gd8 {

    /* renamed from: b */
    public static Handler f25010b;

    /* renamed from: a */
    public static final gd8 f25009a = new gd8();

    /* renamed from: c */
    public static final obj f25011c = new obj(8, null, 2, null);

    /* renamed from: d */
    public static final obj f25012d = new obj(2, null, 2, null);

    /* renamed from: e */
    public static final Map f25013e = new HashMap();

    /* renamed from: o.gd8$a */
    public static final class RunnableC13684a implements Runnable {

        /* renamed from: a */
        public final C13687d f25014a;

        /* renamed from: b */
        public final boolean f25015b;

        public RunnableC13684a(C13687d c13687d, boolean z) {
            sq8.m48649h(c13687d, TransferTable.COLUMN_KEY);
            this.f25014a = c13687d;
            this.f25015b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                gd8.f25009a.m28490m(this.f25014a, this.f25015b);
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }
    }

    /* renamed from: o.gd8$b */
    public static final class RunnableC13685b implements Runnable {

        /* renamed from: a */
        public final C13687d f25016a;

        public RunnableC13685b(C13687d c13687d) {
            sq8.m48649h(c13687d, TransferTable.COLUMN_KEY);
            this.f25016a = c13687d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                gd8.f25009a.m28484e(this.f25016a);
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }
    }

    /* renamed from: o.gd8$c */
    public static final class C13686c {

        /* renamed from: a */
        public de8 f25017a;

        /* renamed from: b */
        public obj.InterfaceC15757b f25018b;

        /* renamed from: c */
        public boolean f25019c;

        public C13686c(de8 de8Var) {
            sq8.m48649h(de8Var, "request");
            this.f25017a = de8Var;
        }

        /* renamed from: a */
        public final de8 m28492a() {
            return this.f25017a;
        }

        /* renamed from: b */
        public final obj.InterfaceC15757b m28493b() {
            return this.f25018b;
        }

        /* renamed from: c */
        public final boolean m28494c() {
            return this.f25019c;
        }

        /* renamed from: d */
        public final void m28495d(boolean z) {
            this.f25019c = z;
        }

        /* renamed from: e */
        public final void m28496e(de8 de8Var) {
            sq8.m48649h(de8Var, "<set-?>");
            this.f25017a = de8Var;
        }

        /* renamed from: f */
        public final void m28497f(obj.InterfaceC15757b interfaceC15757b) {
            this.f25018b = interfaceC15757b;
        }
    }

    /* renamed from: o.gd8$d */
    public static final class C13687d {

        /* renamed from: c */
        public static final a f25020c = new a(null);

        /* renamed from: a */
        public Uri f25021a;

        /* renamed from: b */
        public Object f25022b;

        /* renamed from: o.gd8$d$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C13687d(Uri uri, Object obj) {
            sq8.m48649h(uri, "uri");
            sq8.m48649h(obj, "tag");
            this.f25021a = uri;
            this.f25022b = obj;
        }

        /* renamed from: a */
        public final Object m28498a() {
            return this.f25022b;
        }

        /* renamed from: b */
        public final Uri m28499b() {
            return this.f25021a;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C13687d)) {
                return false;
            }
            C13687d c13687d = (C13687d) obj;
            return c13687d.f25021a == this.f25021a && c13687d.f25022b == this.f25022b;
        }

        public int hashCode() {
            return ((1073 + this.f25021a.hashCode()) * 37) + this.f25022b.hashCode();
        }
    }

    /* renamed from: d */
    public static final boolean m28481d(de8 de8Var) {
        boolean z;
        sq8.m48649h(de8Var, "request");
        C13687d c13687d = new C13687d(de8Var.m22840c(), de8Var.m22839b());
        Map map = f25013e;
        synchronized (map) {
            C13686c c13686c = (C13686c) map.get(c13687d);
            if (c13686c != null) {
                obj.InterfaceC15757b interfaceC15757bM28493b = c13686c.m28493b();
                z = true;
                if (interfaceC15757bM28493b == null || !interfaceC15757bM28493b.cancel()) {
                    c13686c.m28495d(true);
                } else {
                    map.remove(c13687d);
                }
            } else {
                z = false;
            }
            y3i y3iVar = y3i.f54824a;
        }
        return z;
    }

    /* renamed from: f */
    public static final void m28482f(de8 de8Var) {
        if (de8Var == null) {
            return;
        }
        C13687d c13687d = new C13687d(de8Var.m22840c(), de8Var.m22839b());
        Map map = f25013e;
        synchronized (map) {
            C13686c c13686c = (C13686c) map.get(c13687d);
            if (c13686c != null) {
                c13686c.m28496e(de8Var);
                c13686c.m28495d(false);
                obj.InterfaceC15757b interfaceC15757bM28493b = c13686c.m28493b();
                if (interfaceC15757bM28493b != null) {
                    interfaceC15757bM28493b.mo41944a();
                    y3i y3iVar = y3i.f54824a;
                }
            } else {
                f25009a.m28485g(de8Var, c13687d, de8Var.m22841d());
                y3i y3iVar2 = y3i.f54824a;
            }
        }
    }

    /* renamed from: l */
    public static final void m28483l(de8 de8Var, Exception exc, boolean z, Bitmap bitmap, de8.InterfaceC12879b interfaceC12879b) {
        sq8.m48649h(de8Var, "$request");
        interfaceC12879b.mo22846a(new ee8(de8Var, exc, z, bitmap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7, types: [int, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28484e(C13687d c13687d) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? responseCode;
        Exception ur6Var;
        Bitmap bitmap;
        Bitmap bitmap2;
        InputStream inputStream;
        Closeable closeable = null;
        Closeable closeable2 = null;
        closeable = null;
        Bitmap bitmap3 = null;
        boolean z = true;
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(c13687d.m28499b().toString()).openConnection());
            sq8.m48647f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnection;
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    responseCode = httpURLConnection.getResponseCode();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
            try {
            } catch (IOException e2) {
                e = e2;
                cri.m21664j(responseCode);
                cri.m21671r(httpURLConnection);
                ur6Var = e;
                if (z) {
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = responseCode;
                cri.m21664j(closeable);
                cri.m21671r(httpURLConnection);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            responseCode = 0;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        if (responseCode == 200) {
            ?? M26503c = fe8.m26503c(httpURLConnection);
            ?? LastIndexOf = String.lastIndexOf((int) M26503c);
            ur6Var = null;
            inputStream = M26503c;
            bitmap2 = LastIndexOf;
        } else {
            if (responseCode == 301 || responseCode == 302) {
                try {
                    String headerField = httpURLConnection.getHeaderField("location");
                    if (!cri.d0(headerField)) {
                        Uri uri = Uri.parse(headerField);
                        t8i.m49566a(c13687d.m28499b(), uri);
                        C13686c c13686cM28491n = m28491n(c13687d);
                        if (c13686cM28491n != null && !c13686cM28491n.m28494c()) {
                            de8 de8VarM28492a = c13686cM28491n.m28492a();
                            sq8.m48648g(uri, "redirectUri");
                            m28485g(de8VarM28492a, new C13687d(uri, c13687d.m28498a()), false);
                        }
                    }
                    z = false;
                    bitmap = null;
                    ur6Var = null;
                    cri.m21664j(closeable2);
                    cri.m21671r(httpURLConnection);
                    bitmap3 = bitmap;
                } catch (IOException e4) {
                    e = e4;
                    z = false;
                    responseCode = 0;
                    cri.m21664j(responseCode);
                    cri.m21671r(httpURLConnection);
                    ur6Var = e;
                    if (z) {
                    }
                }
                if (z) {
                    return;
                }
                m28489k(c13687d, ur6Var, bitmap3, false);
                return;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            StringBuilder sb = new StringBuilder();
            if (errorStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(errorStream);
                char[] cArr = new char[128];
                while (true) {
                    int i = inputStreamReader.read(cArr, 0, 128);
                    if (i <= 0) {
                        break;
                    } else {
                        sb.append(cArr, 0, i);
                    }
                }
                cri.m21664j(inputStreamReader);
            } else {
                sb.append("Unexpected error while downloading an image.");
            }
            ur6Var = new ur6(sb.toString());
            bitmap2 = null;
            inputStream = errorStream;
        }
        closeable2 = inputStream;
        bitmap = bitmap2;
        cri.m21664j(closeable2);
        cri.m21671r(httpURLConnection);
        bitmap3 = bitmap;
        if (z) {
        }
    }

    /* renamed from: g */
    public final void m28485g(de8 de8Var, C13687d c13687d, boolean z) {
        m28487i(de8Var, c13687d, f25012d, new RunnableC13684a(c13687d, z));
    }

    /* renamed from: h */
    public final void m28486h(de8 de8Var, C13687d c13687d) {
        m28487i(de8Var, c13687d, f25011c, new RunnableC13685b(c13687d));
    }

    /* renamed from: i */
    public final void m28487i(de8 de8Var, C13687d c13687d, obj objVar, Runnable runnable) {
        Map map = f25013e;
        synchronized (map) {
            C13686c c13686c = new C13686c(de8Var);
            map.put(c13687d, c13686c);
            c13686c.m28497f(obj.m41936f(objVar, runnable, false, 2, null));
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: j */
    public final synchronized Handler m28488j() {
        if (f25010b == null) {
            f25010b = new Handler(Looper.getMainLooper());
        }
        return f25010b;
    }

    /* renamed from: k */
    public final void m28489k(C13687d c13687d, final Exception exc, final Bitmap bitmap, final boolean z) {
        Handler handlerM28488j;
        C13686c c13686cM28491n = m28491n(c13687d);
        if (c13686cM28491n == null || c13686cM28491n.m28494c()) {
            return;
        }
        final de8 de8VarM28492a = c13686cM28491n.m28492a();
        final de8.InterfaceC12879b interfaceC12879bM22838a = de8VarM28492a != null ? de8VarM28492a.m22838a() : null;
        if (interfaceC12879bM22838a == null || (handlerM28488j = m28488j()) == null) {
            return;
        }
        handlerM28488j.post(new Runnable() { // from class: o.fd8
            @Override // java.lang.Runnable
            public final void run() {
                gd8.m28483l(de8VarM28492a, exc, z, bitmap, interfaceC12879bM22838a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.Bitmap, int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.gd8] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.InputStream] */
    /* renamed from: m */
    public final void m28490m(C13687d c13687d, boolean z) throws IOException {
        ?? M26502b;
        Uri uriM49568c;
        boolean z2 = false;
        if (!z || (uriM49568c = t8i.m49568c(c13687d.m28499b())) == null) {
            M26502b = 0;
        } else {
            InputStream inputStreamM26502b = fe8.m26502b(uriM49568c);
            M26502b = inputStreamM26502b;
            if (inputStreamM26502b != null) {
                z2 = true;
                M26502b = inputStreamM26502b;
            }
        }
        if (!z2) {
            M26502b = fe8.m26502b(c13687d.m28499b());
        }
        if (M26502b != 0) {
            ?? LastIndexOf = String.lastIndexOf((int) M26502b);
            cri.m21664j(M26502b);
            m28489k(c13687d, null, LastIndexOf, z2);
            return;
        }
        C13686c c13686cM28491n = m28491n(c13687d);
        de8 de8VarM28492a = c13686cM28491n != null ? c13686cM28491n.m28492a() : null;
        if (c13686cM28491n == null || c13686cM28491n.m28494c() || de8VarM28492a == null) {
            return;
        }
        m28486h(de8VarM28492a, c13687d);
    }

    /* renamed from: n */
    public final C13686c m28491n(C13687d c13687d) {
        C13686c c13686c;
        Map map = f25013e;
        synchronized (map) {
            c13686c = (C13686c) map.remove(c13687d);
        }
        return c13686c;
    }
}
