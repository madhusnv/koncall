package p001o;

import android.net.Uri;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaStatus;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HTTP;
import p001o.dz4;
import p001o.je5;

/* loaded from: classes2.dex */
public class je5 extends wb1 {

    /* renamed from: e */
    public final boolean f30251e;

    /* renamed from: f */
    public final boolean f30252f;

    /* renamed from: g */
    public final int f30253g;

    /* renamed from: h */
    public final int f30254h;

    /* renamed from: i */
    public final String f30255i;

    /* renamed from: j */
    public final k28 f30256j;

    /* renamed from: k */
    public final k28 f30257k;

    /* renamed from: l */
    public final hgd f30258l;

    /* renamed from: m */
    public final boolean f30259m;

    /* renamed from: n */
    public iz4 f30260n;

    /* renamed from: o */
    public HttpURLConnection f30261o;

    /* renamed from: p */
    public InputStream f30262p;

    /* renamed from: q */
    public boolean f30263q;

    /* renamed from: r */
    public int f30264r;

    /* renamed from: s */
    public long f30265s;

    /* renamed from: t */
    public long f30266t;

    /* renamed from: o.je5$b */
    public static final class C14508b implements dz4.InterfaceC13064a {

        /* renamed from: b */
        public juh f30268b;

        /* renamed from: c */
        public hgd f30269c;

        /* renamed from: d */
        public String f30270d;

        /* renamed from: g */
        public boolean f30273g;

        /* renamed from: h */
        public boolean f30274h;

        /* renamed from: i */
        public boolean f30275i;

        /* renamed from: a */
        public final k28 f30267a = new k28();

        /* renamed from: e */
        public int f30271e = 8000;

        /* renamed from: f */
        public int f30272f = 8000;

        @Override // p001o.dz4.InterfaceC13064a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public je5 mo23962a() {
            je5 je5Var = new je5(this.f30270d, this.f30271e, this.f30272f, this.f30273g, this.f30274h, this.f30267a, this.f30269c, this.f30275i);
            juh juhVar = this.f30268b;
            if (juhVar != null) {
                je5Var.mo23961j(juhVar);
            }
            return je5Var;
        }

        /* renamed from: c */
        public C14508b m33623c(String str) {
            this.f30270d = str;
            return this;
        }
    }

    /* renamed from: o.je5$c */
    public static class C14509c extends pf7 {

        /* renamed from: a */
        public final Map f30276a;

        public C14509c(Map map) {
            this.f30276a = map;
        }

        /* renamed from: A */
        public static /* synthetic */ boolean m33624A(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* renamed from: B */
        public static /* synthetic */ boolean m33625B(String str) {
            return str != null;
        }

        @Override // p001o.pf7, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.m43568o(obj);
        }

        @Override // p001o.pf7, java.util.Map
        public Set entrySet() {
            return lif.m37322b(super.entrySet(), new hgd() { // from class: o.ke5
                @Override // p001o.hgd
                public final boolean apply(Object obj) {
                    return je5.C14509c.m33624A((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.m43569r(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.m43570s();
        }

        @Override // p001o.pf7, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // p001o.qf7
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map mo30538h() {
            return this.f30276a;
        }

        @Override // p001o.pf7, java.util.Map
        public Set keySet() {
            return lif.m37322b(super.keySet(), new hgd() { // from class: o.le5
                @Override // p001o.hgd
                public final boolean apply(Object obj) {
                    return je5.C14509c.m33625B((String) obj);
                }
            });
        }

        @Override // p001o.pf7, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // p001o.pf7, java.util.Map
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    /* renamed from: t */
    public static boolean m33613t(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* renamed from: w */
    public static void m33614w(HttpURLConnection httpURLConnection, long j) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (httpURLConnection == null || sqi.f45790a > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= MediaStatus.COMMAND_QUEUE_REPEAT_ONE) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) op0.m42515e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p001o.dz4
    /* renamed from: b */
    public Map mo23959b() {
        HttpURLConnection httpURLConnection = this.f30261o;
        return httpURLConnection == null ? of8.m42180r() : new C14509c(httpURLConnection.getHeaderFields());
    }

    @Override // p001o.dz4
    public void close() {
        try {
            InputStream inputStream = this.f30262p;
            if (inputStream != null) {
                long j = this.f30265s;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f30266t;
                }
                m33614w(this.f30261o, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new h28(e, (iz4) sqi.m48729h(this.f30260n), 2000, 3);
                }
            }
        } finally {
            this.f30262p = null;
            m33615r();
            if (this.f30263q) {
                this.f30263q = false;
                m54153o();
            }
        }
    }

    @Override // p001o.dz4
    /* renamed from: e */
    public long mo23960e(iz4 iz4Var) throws IOException, NumberFormatException {
        byte[] bArrM53201d;
        this.f30260n = iz4Var;
        long j = 0;
        this.f30266t = 0L;
        this.f30265s = 0L;
        m54154p(iz4Var);
        try {
            HttpURLConnection httpURLConnectionM33618v = m33618v(iz4Var);
            this.f30261o = httpURLConnectionM33618v;
            this.f30264r = httpURLConnectionM33618v.getResponseCode();
            String responseMessage = httpURLConnectionM33618v.getResponseMessage();
            int i = this.f30264r;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM33618v.getHeaderFields();
                if (this.f30264r == 416) {
                    if (iz4Var.f29386g == y48.m57198c(httpURLConnectionM33618v.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                        this.f30263q = true;
                        m54155q(iz4Var);
                        long j2 = iz4Var.f29387h;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionM33618v.getErrorStream();
                try {
                    bArrM53201d = errorStream != null ? vq1.m53201d(errorStream) : sqi.f45795f;
                } catch (IOException unused) {
                    bArrM53201d = sqi.f45795f;
                }
                byte[] bArr = bArrM53201d;
                m33615r();
                throw new j28(this.f30264r, responseMessage, this.f30264r == 416 ? new fz4(2008) : null, headerFields, iz4Var, bArr);
            }
            String contentType = httpURLConnectionM33618v.getContentType();
            hgd hgdVar = this.f30258l;
            if (hgdVar != null && !hgdVar.apply(contentType)) {
                m33615r();
                throw new i28(contentType, iz4Var);
            }
            if (this.f30264r == 200) {
                long j3 = iz4Var.f29386g;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean zM33613t = m33613t(httpURLConnectionM33618v);
            if (zM33613t) {
                this.f30265s = iz4Var.f29387h;
            } else {
                long j4 = iz4Var.f29387h;
                if (j4 != -1) {
                    this.f30265s = j4;
                } else {
                    long jM57197b = y48.m57197b(httpURLConnectionM33618v.getHeaderField("Content-Length"), httpURLConnectionM33618v.getHeaderField(HttpHeaders.CONTENT_RANGE));
                    this.f30265s = jM57197b != -1 ? jM57197b - j : -1L;
                }
            }
            try {
                this.f30262p = httpURLConnectionM33618v.getInputStream();
                if (zM33613t) {
                    this.f30262p = new GZIPInputStream(this.f30262p);
                }
                this.f30263q = true;
                m54155q(iz4Var);
                try {
                    m33621z(j, iz4Var);
                    return this.f30265s;
                } catch (IOException e) {
                    m33615r();
                    if (e instanceof h28) {
                        throw ((h28) e);
                    }
                    throw new h28(e, iz4Var, 2000, 1);
                }
            } catch (IOException e2) {
                m33615r();
                throw new h28(e2, iz4Var, 2000, 1);
            }
        } catch (IOException e3) {
            m33615r();
            throw h28.m29759c(e3, iz4Var, 1);
        }
    }

    @Override // p001o.dz4
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f30261o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: r */
    public final void m33615r() {
        HttpURLConnection httpURLConnection = this.f30261o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                ria.m46820d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f30261o = null;
        }
    }

    @Override // p001o.pu4
    public int read(byte[] bArr, int i, int i2) throws h28 {
        try {
            return m33620y(bArr, i, i2);
        } catch (IOException e) {
            throw h28.m29759c(e, (iz4) sqi.m48729h(this.f30260n), 2);
        }
    }

    /* renamed from: s */
    public final URL m33616s(URL url, String str, iz4 iz4Var) throws h28 {
        if (str == null) {
            throw new h28("Null location redirect", iz4Var, CastStatusCodes.INVALID_REQUEST, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !HttpHost.DEFAULT_SCHEME_NAME.equals(protocol)) {
                throw new h28("Unsupported protocol redirect: " + protocol, iz4Var, CastStatusCodes.INVALID_REQUEST, 1);
            }
            if (this.f30251e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f30252f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e) {
                    throw new h28(e, iz4Var, CastStatusCodes.INVALID_REQUEST, 1);
                }
            }
            throw new h28("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", iz4Var, CastStatusCodes.INVALID_REQUEST, 1);
        } catch (MalformedURLException e2) {
            throw new h28(e2, iz4Var, CastStatusCodes.INVALID_REQUEST, 1);
        }
    }

    /* renamed from: u */
    public final HttpURLConnection m33617u(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnectionM33619x = m33619x(url);
        httpURLConnectionM33619x.setConnectTimeout(this.f30253g);
        httpURLConnectionM33619x.setReadTimeout(this.f30254h);
        HashMap map2 = new HashMap();
        k28 k28Var = this.f30256j;
        if (k28Var != null) {
            map2.putAll(k28Var.m34931a());
        }
        map2.putAll(this.f30257k.m34931a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionM33619x.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strM57196a = y48.m57196a(j, j2);
        if (strM57196a != null) {
            httpURLConnectionM33619x.setRequestProperty(HttpHeaders.RANGE, strM57196a);
        }
        String str = this.f30255i;
        if (str != null) {
            httpURLConnectionM33619x.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionM33619x.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z ? "gzip" : HTTP.IDENTITY_CODING);
        httpURLConnectionM33619x.setInstanceFollowRedirects(z2);
        httpURLConnectionM33619x.setDoOutput(bArr != null);
        httpURLConnectionM33619x.setRequestMethod(iz4.m32918c(i));
        if (bArr != null) {
            httpURLConnectionM33619x.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionM33619x.connect();
            OutputStream outputStream = httpURLConnectionM33619x.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionM33619x.connect();
        }
        return httpURLConnectionM33619x;
    }

    /* renamed from: v */
    public final HttpURLConnection m33618v(iz4 iz4Var) throws IOException {
        HttpURLConnection httpURLConnectionM33617u;
        URL url = new URL(iz4Var.f29380a.toString());
        int i = iz4Var.f29382c;
        byte[] bArr = iz4Var.f29383d;
        long j = iz4Var.f29386g;
        long j2 = iz4Var.f29387h;
        boolean zM32921d = iz4Var.m32921d(1);
        if (!this.f30251e && !this.f30252f && !this.f30259m) {
            return m33617u(url, i, bArr, j, j2, zM32921d, true, iz4Var.f29384e);
        }
        URL urlM33616s = url;
        int i2 = i;
        byte[] bArr2 = bArr;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                throw new h28(new NoRouteToHostException("Too many redirects: " + i4), iz4Var, CastStatusCodes.INVALID_REQUEST, 1);
            }
            long j3 = j;
            long j4 = j;
            int i5 = i2;
            URL url2 = urlM33616s;
            long j5 = j2;
            httpURLConnectionM33617u = m33617u(urlM33616s, i2, bArr2, j3, j2, zM32921d, false, iz4Var.f29384e);
            int responseCode = httpURLConnectionM33617u.getResponseCode();
            String headerField = httpURLConnectionM33617u.getHeaderField("Location");
            if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM33617u.disconnect();
                urlM33616s = m33616s(url2, headerField, iz4Var);
                i2 = i5;
            } else {
                if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionM33617u.disconnect();
                if (this.f30259m && responseCode == 302) {
                    i2 = i5;
                } else {
                    bArr2 = null;
                    i2 = 1;
                }
                urlM33616s = m33616s(url2, headerField, iz4Var);
            }
            i3 = i4;
            j = j4;
            j2 = j5;
        }
        return httpURLConnectionM33617u;
    }

    /* renamed from: x */
    public HttpURLConnection m33619x(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    /* renamed from: y */
    public final int m33620y(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f30265s;
        if (j != -1) {
            long j2 = j - this.f30266t;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) sqi.m48729h(this.f30262p)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f30266t += i3;
        m54152n(i3);
        return i3;
    }

    /* renamed from: z */
    public final void m33621z(long j, iz4 iz4Var) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) sqi.m48729h(this.f30262p)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new h28(new InterruptedIOException(), iz4Var, 2000, 1);
            }
            if (i == -1) {
                throw new h28(iz4Var, 2008, 1);
            }
            j -= i;
            m54152n(i);
        }
    }

    public je5(String str, int i, int i2, boolean z, boolean z2, k28 k28Var, hgd hgdVar, boolean z3) {
        super(true);
        this.f30255i = str;
        this.f30253g = i;
        this.f30254h = i2;
        this.f30251e = z;
        this.f30252f = z2;
        if (z && z2) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f30256j = k28Var;
        this.f30258l = hgdVar;
        this.f30257k = new k28();
        this.f30259m = z3;
    }
}
