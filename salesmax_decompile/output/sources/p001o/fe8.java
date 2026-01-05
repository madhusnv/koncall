package p001o;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import p001o.sja;
import p001o.yw6;

/* loaded from: classes5.dex */
public final class fe8 {

    /* renamed from: a */
    public static final fe8 f23187a = new fe8();

    /* renamed from: b */
    public static final String f23188b = fe8.class.getSimpleName();

    /* renamed from: c */
    public static yw6 f23189c;

    /* renamed from: o.fe8$a */
    public static final class C13408a extends BufferedInputStream {

        /* renamed from: a */
        public HttpURLConnection f23190a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13408a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            sq8.m48649h(httpURLConnection, "connection");
            this.f23190a = httpURLConnection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            cri.m21671r(this.f23190a);
        }
    }

    /* renamed from: a */
    public static final synchronized yw6 m26501a() {
        yw6 yw6Var;
        if (f23189c == null) {
            String str = f23188b;
            sq8.m48648g(str, "TAG");
            f23189c = new yw6(str, new yw6.C18511e());
        }
        yw6Var = f23189c;
        if (yw6Var == null) {
            sq8.m48667z("imageCache");
            yw6Var = null;
        }
        return yw6Var;
    }

    /* renamed from: b */
    public static final InputStream m26502b(Uri uri) {
        if (uri == null || !f23187a.m26504d(uri)) {
            return null;
        }
        try {
            yw6 yw6VarM26501a = m26501a();
            String string = uri.toString();
            sq8.m48648g(string, "uri.toString()");
            return yw6.m58402g(yw6VarM26501a, string, null, 2, null);
        } catch (IOException e) {
            sja.C16851a c16851a = sja.f45482e;
            bka bkaVar = bka.CACHE;
            String str = f23188b;
            sq8.m48648g(str, "TAG");
            c16851a.m48386a(bkaVar, 5, str, e.toString());
            return null;
        }
    }

    /* renamed from: c */
    public static final InputStream m26503c(HttpURLConnection httpURLConnection) throws IOException {
        sq8.m48649h(httpURLConnection, "connection");
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri uri = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            if (!f23187a.m26504d(uri)) {
                return inputStream;
            }
            yw6 yw6VarM26501a = m26501a();
            String string = uri.toString();
            sq8.m48648g(string, "uri.toString()");
            return yw6VarM26501a.m58406h(string, new C13408a(inputStream, httpURLConnection));
        } catch (IOException unused) {
            return inputStream;
        }
    }

    /* renamed from: d */
    public final boolean m26504d(Uri uri) {
        String host;
        return (uri == null || (host = uri.getHost()) == null || (!sq8.m48644c(host, "fbcdn.net") && !e9g.m24605w(host, ".fbcdn.net", false, 2, null) && (!e9g.m24597K(host, "fbcdn", false, 2, null) || !e9g.m24605w(host, ".akamaihd.net", false, 2, null)))) ? false : true;
    }
}
