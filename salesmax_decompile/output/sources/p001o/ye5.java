package p001o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public class ye5 implements fma {

    /* renamed from: a */
    public final HttpURLConnection f55338a;

    public ye5(HttpURLConnection httpURLConnection) {
        this.f55338a = httpURLConnection;
    }

    @Override // p001o.fma
    public boolean U0() {
        try {
            return this.f55338a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final String m57676a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                        sb.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f55338a.disconnect();
    }

    @Override // p001o.fma
    public String l2() {
        try {
            if (U0()) {
                return null;
            }
            return "Unable to fetch " + this.f55338a.getURL() + ". Failed with " + this.f55338a.getResponseCode() + "\n" + m57676a(this.f55338a);
        } catch (IOException e) {
            rja.m46867d("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // p001o.fma
    public String m0() {
        return this.f55338a.getContentType();
    }

    @Override // p001o.fma
    public InputStream w0() {
        return this.f55338a.getInputStream();
    }
}
