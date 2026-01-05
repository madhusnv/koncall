package p001o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;
import p001o.ab3;
import p001o.ija;
import p001o.ltb;
import p001o.we2;
import p001o.wia;

/* loaded from: classes5.dex */
public final class we2 implements pwh {

    /* renamed from: a */
    public final DataEncoder f51828a;

    /* renamed from: b */
    public final ConnectivityManager f51829b;

    /* renamed from: c */
    public final Context f51830c;

    /* renamed from: d */
    public final URL f51831d;

    /* renamed from: e */
    public final ib3 f51832e;

    /* renamed from: f */
    public final ib3 f51833f;

    /* renamed from: g */
    public final int f51834g;

    /* renamed from: o.we2$a */
    public static final class C17824a {

        /* renamed from: a */
        public final URL f51835a;

        /* renamed from: b */
        public final wf1 f51836b;

        /* renamed from: c */
        public final String f51837c;

        public C17824a(URL url, wf1 wf1Var, String str) {
            this.f51835a = url;
            this.f51836b = wf1Var;
            this.f51837c = str;
        }

        /* renamed from: a */
        public C17824a m54256a(URL url) {
            return new C17824a(url, this.f51836b, this.f51837c);
        }
    }

    /* renamed from: o.we2$b */
    public static final class C17825b {

        /* renamed from: a */
        public final int f51838a;

        /* renamed from: b */
        public final URL f51839b;

        /* renamed from: c */
        public final long f51840c;

        public C17825b(int i, URL url, long j) {
            this.f51838a = i;
            this.f51839b = url;
            this.f51840c = j;
        }
    }

    public we2(Context context, ib3 ib3Var, ib3 ib3Var2, int i) {
        this.f51828a = wf1.m54285b();
        this.f51830c = context;
        this.f51829b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f51831d = m54253n(fr1.f23953c);
        this.f51832e = ib3Var2;
        this.f51833f = ib3Var;
        this.f51834g = i;
    }

    /* renamed from: f */
    public static int m54246f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return ltb.EnumC15151b.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return ltb.EnumC15151b.COMBINED.getValue();
        }
        if (ltb.EnumC15151b.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: g */
    public static int m54247g(NetworkInfo networkInfo) {
        return networkInfo == null ? ltb.EnumC15152c.NONE.getValue() : networkInfo.getType();
    }

    /* renamed from: h */
    public static int m54248h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            aka.m17335d("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: j */
    public static TelephonyManager m54249j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    public static long m54250k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* renamed from: l */
    public static /* synthetic */ C17824a m54251l(C17824a c17824a, C17825b c17825b) {
        URL url = c17825b.f51839b;
        if (url == null) {
            return null;
        }
        aka.m17333b("CctTransportBackend", "Following redirect to: %s", url);
        return c17824a.m54256a(c17825b.f51839b);
    }

    /* renamed from: m */
    public static InputStream m54252m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    public static URL m54253n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // p001o.pwh
    /* renamed from: a */
    public p91 mo44261a(o91 o91Var) {
        wf1 wf1VarM54255i = m54255i(o91Var);
        URL urlM54253n = this.f51831d;
        if (o91Var.mo41789c() != null) {
            try {
                fr1 fr1VarM27371c = fr1.m27371c(o91Var.mo41789c());
                strM27373d = fr1VarM27371c.m27373d() != null ? fr1VarM27371c.m27373d() : null;
                if (fr1VarM27371c.m27374e() != null) {
                    urlM54253n = m54253n(fr1VarM27371c.m27374e());
                }
            } catch (IllegalArgumentException unused) {
                return p91.m43204a();
            }
        }
        try {
            C17825b c17825b = (C17825b) bse.m19698a(5, new C17824a(urlM54253n, wf1VarM54255i, strM27373d), new hl7() { // from class: o.ue2
                @Override // p001o.hl7
                public final Object apply(Object obj) {
                    return this.f48752a.m54254e((we2.C17824a) obj);
                }
            }, new wse() { // from class: o.ve2
                @Override // p001o.wse
                /* renamed from: a */
                public final Object mo52652a(Object obj, Object obj2) {
                    return we2.m54251l((we2.C17824a) obj, (we2.C17825b) obj2);
                }
            });
            int i = c17825b.f51838a;
            if (i == 200) {
                return p91.m43206e(c17825b.f51840c);
            }
            if (i < 500 && i != 404) {
                return i == 400 ? p91.m43205d() : p91.m43204a();
            }
            return p91.m43207f();
        } catch (IOException e) {
            aka.m17335d("CctTransportBackend", "Could not make request to the backend", e);
            return p91.m43207f();
        }
    }

    @Override // p001o.pwh
    /* renamed from: b */
    public ak6 mo44262b(ak6 ak6Var) {
        NetworkInfo activeNetworkInfo = this.f51829b.getActiveNetworkInfo();
        return ak6Var.m17317l().m17318a("sdk-version", Build.VERSION.SDK_INT).m17320c("model", Build.MODEL).m17320c("hardware", Build.HARDWARE).m17320c("device", Build.DEVICE).m17320c("product", Build.PRODUCT).m17320c("os-uild", Build.ID).m17320c("manufacturer", Build.MANUFACTURER).m17320c("fingerprint", Build.FINGERPRINT).m17319b("tz-offset", m54250k()).m17318a("net-type", m54247g(activeNetworkInfo)).m17318a("mobile-subtype", m54246f(activeNetworkInfo)).m17320c("country", Locale.getDefault().getCountry()).m17320c("locale", Locale.getDefault().getLanguage()).m17320c("mcc_mnc", m54249j(this.f51830c).getSimOperator()).m17320c("application_build", Integer.toString(m54248h(this.f51830c))).mo17321d();
    }

    /* renamed from: e */
    public final C17825b m54254e(C17824a c17824a) throws IOException {
        aka.m17337f("CctTransportBackend", "Making request to: %s", c17824a.f51835a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) c17824a.f51835a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f51834g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
        String str = c17824a.f51837c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f51828a.encode(c17824a.f51836b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    aka.m17337f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    aka.m17333b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    aka.m17333b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C17825b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C17825b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM54252m = m54252m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            C17825b c17825b = new C17825b(responseCode, null, jja.m33877b(new BufferedReader(new InputStreamReader(inputStreamM54252m))).mo33878c());
                            if (inputStreamM54252m != null) {
                                inputStreamM54252m.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c17825b;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e) {
            e = e;
            aka.m17335d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C17825b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            aka.m17335d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C17825b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            aka.m17335d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C17825b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            aka.m17335d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C17825b(400, null, 0L);
        }
    }

    /* renamed from: i */
    public final wf1 m54255i(o91 o91Var) {
        wia.AbstractC17920a abstractC17920aM54605j;
        HashMap map = new HashMap();
        for (ak6 ak6Var : o91Var.mo41788b()) {
            String strMo17315j = ak6Var.mo17315j();
            if (map.containsKey(strMo17315j)) {
                ((List) map.get(strMo17315j)).add(ak6Var);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ak6Var);
                map.put(strMo17315j, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            ak6 ak6Var2 = (ak6) ((List) entry.getValue()).get(0);
            ija.AbstractC14304a abstractC14304aMo32198b = ija.m32189a().mo32202f(z3e.DEFAULT).mo32203g(this.f51833f.getTime()).mo32204h(this.f51832e.getTime()).mo32198b(ab3.m16806a().mo16811c(ab3.EnumC12132b.ANDROID_FIREBASE).mo16810b(od0.m41992a().mo42017m(Integer.valueOf(ak6Var2.m17312g("sdk-version"))).mo42014j(ak6Var2.m17307b("model")).mo42010f(ak6Var2.m17307b("hardware")).mo42008d(ak6Var2.m17307b("device")).mo42016l(ak6Var2.m17307b("product")).mo42015k(ak6Var2.m17307b("os-uild")).mo42012h(ak6Var2.m17307b("manufacturer")).mo42009e(ak6Var2.m17307b("fingerprint")).mo42007c(ak6Var2.m17307b("country")).mo42011g(ak6Var2.m17307b("locale")).mo42013i(ak6Var2.m17307b("mcc_mnc")).mo42006b(ak6Var2.m17307b("application_build")).mo42005a()).mo16809a());
            try {
                abstractC14304aMo32198b.m32205i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                abstractC14304aMo32198b.m32206j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (ak6 ak6Var3 : (List) entry.getValue()) {
                d76 d76VarMo17310e = ak6Var3.mo17310e();
                n76 n76VarM22406b = d76VarMo17310e.m22406b();
                if (n76VarM22406b.equals(n76.m40202b("proto"))) {
                    abstractC17920aM54605j = wia.m54605j(d76VarMo17310e.m22405a());
                } else if (n76VarM22406b.equals(n76.m40202b("json"))) {
                    abstractC17920aM54605j = wia.m54604i(new String(d76VarMo17310e.m22405a(), Charset.forName(HTTP.UTF_8)));
                } else {
                    aka.m17338g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", n76VarM22406b);
                }
                abstractC17920aM54605j.mo53863c(ak6Var3.mo17311f()).mo53864d(ak6Var3.mo17316k()).mo53868h(ak6Var3.m17313h("tz-offset")).mo53865e(ltb.m37881a().mo16423c(ltb.EnumC15152c.forNumber(ak6Var3.m17312g("net-type"))).mo16422b(ltb.EnumC15151b.forNumber(ak6Var3.m17312g("mobile-subtype"))).mo16421a());
                if (ak6Var3.mo17309d() != null) {
                    abstractC17920aM54605j.mo53862b(ak6Var3.mo17309d());
                }
                arrayList3.add(abstractC17920aM54605j.mo53861a());
            }
            abstractC14304aMo32198b.mo32199c(arrayList3);
            arrayList2.add(abstractC14304aMo32198b.mo32197a());
        }
        return wf1.m54284a(arrayList2);
    }

    public we2(Context context, ib3 ib3Var, ib3 ib3Var2) {
        this(context, ib3Var, ib3Var2, 130000);
    }
}
