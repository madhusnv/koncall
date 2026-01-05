package p001o;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import p001o.lu4;

/* loaded from: classes5.dex */
public class x48 implements lu4 {

    /* renamed from: g */
    public static final InterfaceC18048b f53177g = new C18047a();

    /* renamed from: a */
    public final ft7 f53178a;

    /* renamed from: b */
    public final int f53179b;

    /* renamed from: c */
    public final InterfaceC18048b f53180c;

    /* renamed from: d */
    public HttpURLConnection f53181d;

    /* renamed from: e */
    public InputStream f53182e;

    /* renamed from: f */
    public volatile boolean f53183f;

    /* renamed from: o.x48$a */
    public static class C18047a implements InterfaceC18048b {
        @Override // p001o.x48.InterfaceC18048b
        /* renamed from: a */
        public HttpURLConnection mo55629a(URL url) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* renamed from: o.x48$b */
    public interface InterfaceC18048b {
        /* renamed from: a */
        HttpURLConnection mo55629a(URL url);
    }

    public x48(ft7 ft7Var, int i) {
        this(ft7Var, i, f53177g);
    }

    /* renamed from: f */
    public static int m55623f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    /* renamed from: h */
    public static boolean m55624h(int i) {
        return i / 100 == 2;
    }

    /* renamed from: i */
    public static boolean m55625i(int i) {
        return i / 100 == 3;
    }

    @Override // p001o.lu4
    /* renamed from: a */
    public Class mo18153a() {
        return InputStream.class;
    }

    @Override // p001o.lu4
    /* renamed from: b */
    public void mo18154b() throws IOException {
        InputStream inputStream = this.f53182e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f53181d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f53181d = null;
    }

    /* renamed from: c */
    public final HttpURLConnection m55626c(URL url, Map map) throws z28 {
        try {
            HttpURLConnection httpURLConnectionMo55629a = this.f53180c.mo55629a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionMo55629a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionMo55629a.setConnectTimeout(this.f53179b);
            httpURLConnectionMo55629a.setReadTimeout(this.f53179b);
            httpURLConnectionMo55629a.setUseCaches(false);
            httpURLConnectionMo55629a.setDoInput(true);
            httpURLConnectionMo55629a.setInstanceFollowRedirects(false);
            return httpURLConnectionMo55629a;
        } catch (IOException e) {
            throw new z28("URL.openConnection threw", 0, e);
        }
    }

    @Override // p001o.lu4
    public void cancel() {
        this.f53183f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.lu4
    /* renamed from: d */
    public void mo18155d(gid gidVar, lu4.InterfaceC15153a interfaceC15153a) {
        StringBuilder sb;
        String str = "HttpUrlFetcher";
        long jM37350b = lja.m37350b();
        try {
            try {
                interfaceC15153a.mo17836f(m55628j(this.f53178a.m27465h(), 0, null, this.f53178a.m27462e()));
                str = str;
            } catch (IOException e) {
                Log.isLoggable("HttpUrlFetcher", 3);
                interfaceC15153a.mo17835c(e);
                str = str;
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                double dM37349a = lja.m37349a(jM37350b);
                sb.append(dM37349a);
                str = dM37349a;
            }
        } catch (Throwable th) {
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(lja.m37349a(jM37350b));
            }
            throw th;
        }
    }

    @Override // p001o.lu4
    /* renamed from: e */
    public ez4 mo18156e() {
        return ez4.REMOTE;
    }

    /* renamed from: g */
    public final InputStream m55627g(HttpURLConnection httpURLConnection) throws z28 {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f53182e = w24.m53806c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got non empty content encoding: ");
                    sb.append(httpURLConnection.getContentEncoding());
                }
                this.f53182e = httpURLConnection.getInputStream();
            }
            return this.f53182e;
        } catch (IOException e) {
            throw new z28("Failed to obtain InputStream", m55623f(httpURLConnection), e);
        }
    }

    /* renamed from: j */
    public final InputStream m55628j(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new z28("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new z28("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionM55626c = m55626c(url, map);
        this.f53181d = httpURLConnectionM55626c;
        try {
            httpURLConnectionM55626c.connect();
            this.f53182e = this.f53181d.getInputStream();
            if (this.f53183f) {
                return null;
            }
            int iM55623f = m55623f(this.f53181d);
            if (m55624h(iM55623f)) {
                return m55627g(this.f53181d);
            }
            if (!m55625i(iM55623f)) {
                if (iM55623f == -1) {
                    throw new z28(iM55623f);
                }
                try {
                    throw new z28(this.f53181d.getResponseMessage(), iM55623f);
                } catch (IOException e) {
                    throw new z28("Failed to get a response message", iM55623f, e);
                }
            }
            String headerField = this.f53181d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new z28("Received empty or null redirect url", iM55623f);
            }
            try {
                URL url3 = new URL(url, headerField);
                mo18154b();
                return m55628j(url3, i + 1, url, map);
            } catch (MalformedURLException e2) {
                throw new z28("Bad redirect url: " + headerField, iM55623f, e2);
            }
        } catch (IOException e3) {
            throw new z28("Failed to connect or obtain data", m55623f(this.f53181d), e3);
        }
    }

    public x48(ft7 ft7Var, int i, InterfaceC18048b interfaceC18048b) {
        this.f53178a = ft7Var;
        this.f53179b = i;
        this.f53180c = interfaceC18048b;
    }
}
