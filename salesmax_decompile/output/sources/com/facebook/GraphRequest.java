package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10775e;
import com.facebook.C10776f;
import com.facebook.GraphRequest;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.and;
import p001o.bka;
import p001o.cgf;
import p001o.cri;
import p001o.e9g;
import p001o.f9g;
import p001o.gp0;
import p001o.h8g;
import p001o.id5;
import p001o.lq8;
import p001o.p38;
import p001o.rme;
import p001o.rri;
import p001o.sh2;
import p001o.sja;
import p001o.sq8;
import p001o.ur6;

/* loaded from: classes5.dex */
public final class GraphRequest {

    /* renamed from: n */
    public static final C10764c f11338n = new C10764c(null);

    /* renamed from: o */
    public static final String f11339o = GraphRequest.class.getSimpleName();

    /* renamed from: p */
    public static final String f11340p;

    /* renamed from: q */
    public static String f11341q;

    /* renamed from: r */
    public static final Pattern f11342r;

    /* renamed from: s */
    public static volatile String f11343s;

    /* renamed from: a */
    public AccessToken f11344a;

    /* renamed from: b */
    public String f11345b;

    /* renamed from: c */
    public JSONObject f11346c;

    /* renamed from: d */
    public String f11347d;

    /* renamed from: e */
    public String f11348e;

    /* renamed from: f */
    public boolean f11349f;

    /* renamed from: g */
    public Bundle f11350g;

    /* renamed from: h */
    public Object f11351h;

    /* renamed from: i */
    public String f11352i;

    /* renamed from: j */
    public InterfaceC10763b f11353j;

    /* renamed from: k */
    public p38 f11354k;

    /* renamed from: l */
    public boolean f11355l;

    /* renamed from: m */
    public String f11356m;

    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* renamed from: a */
        public final String f11358a;

        /* renamed from: b */
        public final Parcelable f11359b;

        /* renamed from: c */
        public static final C10761b f11357c = new C10761b(null);
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new C10760a();

        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        public static final class C10760a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                sq8.m48649h(parcel, "source");
                return new ParcelableResourceWithMimeType(parcel, (id5) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        }

        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$b */
        public static final class C10761b {
            public C10761b() {
            }

            public /* synthetic */ C10761b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, id5 id5Var) {
            this(parcel);
        }

        /* renamed from: a */
        public final String m12867a() {
            return this.f11358a;
        }

        /* renamed from: b */
        public final Parcelable m12868b() {
            return this.f11359b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            sq8.m48649h(parcel, "out");
            parcel.writeString(this.f11358a);
            parcel.writeParcelable(this.f11359b, i);
        }

        public ParcelableResourceWithMimeType(Parcelable parcelable, String str) {
            this.f11358a = str;
            this.f11359b = parcelable;
        }

        public ParcelableResourceWithMimeType(Parcel parcel) {
            this.f11358a = parcel.readString();
            this.f11359b = parcel.readParcelable(C10773c.m13019l().getClassLoader());
        }
    }

    /* renamed from: com.facebook.GraphRequest$a */
    public static final class C10762a {

        /* renamed from: a */
        public final GraphRequest f11360a;

        /* renamed from: b */
        public final Object f11361b;

        public C10762a(GraphRequest graphRequest, Object obj) {
            sq8.m48649h(graphRequest, "request");
            this.f11360a = graphRequest;
            this.f11361b = obj;
        }

        /* renamed from: a */
        public final GraphRequest m12871a() {
            return this.f11360a;
        }

        /* renamed from: b */
        public final Object m12872b() {
            return this.f11361b;
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    public interface InterfaceC10763b {
        /* renamed from: a */
        void mo12873a(C10776f c10776f);
    }

    /* renamed from: com.facebook.GraphRequest$c */
    public static final class C10764c {
        public C10764c() {
        }

        public /* synthetic */ C10764c(id5 id5Var) {
            this();
        }

        /* renamed from: H */
        public static final void m12874H(ArrayList arrayList, C10775e c10775e) {
            sq8.m48649h(arrayList, "$callbacks");
            sq8.m48649h(c10775e, "$requests");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                InterfaceC10763b interfaceC10763b = (InterfaceC10763b) pair.first;
                Object obj = pair.second;
                sq8.m48648g(obj, "pair.second");
                interfaceC10763b.mo12873a((C10776f) obj);
            }
            Iterator it2 = c10775e.m13056r().iterator();
            while (it2.hasNext()) {
                ((C10775e.a) it2.next()).mo13062a(c10775e);
            }
        }

        /* renamed from: z */
        public static final void m12881z(InterfaceC10765d interfaceC10765d, C10776f c10776f) {
            sq8.m48649h(c10776f, "response");
            if (interfaceC10765d != null) {
                interfaceC10765d.m12915a(c10776f.m13065c(), c10776f);
            }
        }

        /* renamed from: A */
        public final GraphRequest m12882A(AccessToken accessToken, String str, JSONObject jSONObject, InterfaceC10763b interfaceC10763b) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, p38.POST, interfaceC10763b, null, 32, null);
            graphRequest.m12844E(jSONObject);
            return graphRequest;
        }

        /* renamed from: B */
        public final GraphRequest m12883B(AccessToken accessToken, String str, Bundle bundle, InterfaceC10763b interfaceC10763b) {
            return new GraphRequest(accessToken, str, bundle, p38.POST, interfaceC10763b, null, 32, null);
        }

        /* renamed from: C */
        public final String m12884C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            sq8.m48648g(str, "iso8601DateFormat.format(value)");
            return str;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m12885D(JSONObject jSONObject, String str, InterfaceC10766e interfaceC10766e) {
            boolean z;
            if (m12910u(str)) {
                int iB0 = f9g.b0(str, ":", 0, false, 6, null);
                int iB02 = f9g.b0(str, "?", 0, false, 6, null);
                z = iB0 > 3 && (iB02 == -1 || iB0 < iB02);
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                boolean z2 = z && e9g.m24606x(next, "image", true);
                sq8.m48648g(next, TransferTable.COLUMN_KEY);
                sq8.m48648g(objOpt, "value");
                m12886E(next, objOpt, interfaceC10766e, z2);
            }
        }

        /* renamed from: E */
        public final void m12886E(String str, Object obj, InterfaceC10766e interfaceC10766e, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                sq8.m48647f(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        h8g h8gVar = h8g.f26398a;
                        String str2 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        sq8.m48648g(str2, "format(format, *args)");
                        Object objOpt = jSONObject.opt(next);
                        sq8.m48648g(objOpt, "jsonObject.opt(propertyName)");
                        m12886E(str2, objOpt, interfaceC10766e, z);
                    }
                    return;
                }
                if (jSONObject.has(OutcomeConstants.OUTCOME_ID)) {
                    String strOptString = jSONObject.optString(OutcomeConstants.OUTCOME_ID);
                    sq8.m48648g(strOptString, "jsonObject.optString(\"id\")");
                    m12886E(str, strOptString, interfaceC10766e, z);
                    return;
                } else if (jSONObject.has(ImagesContract.URL)) {
                    String strOptString2 = jSONObject.optString(ImagesContract.URL);
                    sq8.m48648g(strOptString2, "jsonObject.optString(\"url\")");
                    m12886E(str, strOptString2, interfaceC10766e, z);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String string = jSONObject.toString();
                        sq8.m48648g(string, "jsonObject.toString()");
                        m12886E(str, string, interfaceC10766e, z);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                sq8.m48647f(obj, "null cannot be cast to non-null type org.json.JSONArray");
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    h8g h8gVar2 = h8g.f26398a;
                    String str3 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                    sq8.m48648g(str3, "format(locale, format, *args)");
                    Object objOpt2 = jSONArray.opt(i);
                    sq8.m48648g(objOpt2, "jsonArray.opt(i)");
                    m12886E(str3, objOpt2, interfaceC10766e, z);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                interfaceC10766e.writeString(str, obj.toString());
                return;
            }
            if (Date.class.isAssignableFrom(cls)) {
                sq8.m48647f(obj, "null cannot be cast to non-null type java.util.Date");
                String str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                sq8.m48648g(str4, "iso8601DateFormat.format(date)");
                interfaceC10766e.writeString(str, str4);
                return;
            }
            cri.k0(GraphRequest.f11339o, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
        }

        /* renamed from: F */
        public final void m12887F(C10775e c10775e, sja sjaVar, int i, URL url, OutputStream outputStream, boolean z) throws JSONException, IOException {
            C10767f c10767f = new C10767f(outputStream, sjaVar, z);
            if (i != 1) {
                String strM12905p = m12905p(c10775e);
                if (strM12905p.length() == 0) {
                    throw new ur6("App ID was not specified at the request or Settings.");
                }
                c10767f.writeString("batch_app_id", strM12905p);
                HashMap map = new HashMap();
                m12891K(c10767f, c10775e, map);
                if (sjaVar != null) {
                    sjaVar.m48380b("  Attachments:\n");
                }
                m12889I(map, c10767f);
                return;
            }
            GraphRequest graphRequestM13053o = c10775e.get(0);
            HashMap map2 = new HashMap();
            for (String str : graphRequestM13053o.m12861u().keySet()) {
                Object obj = graphRequestM13053o.m12861u().get(str);
                if (m12911v(obj)) {
                    sq8.m48648g(str, TransferTable.COLUMN_KEY);
                    map2.put(str, new C10762a(graphRequestM13053o, obj));
                }
            }
            if (sjaVar != null) {
                sjaVar.m48380b("  Parameters:\n");
            }
            m12890J(graphRequestM13053o.m12861u(), c10767f, graphRequestM13053o);
            if (sjaVar != null) {
                sjaVar.m48380b("  Attachments:\n");
            }
            m12889I(map2, c10767f);
            JSONObject jSONObjectM12857q = graphRequestM13053o.m12857q();
            if (jSONObjectM12857q != null) {
                String path = url.getPath();
                sq8.m48648g(path, "url.path");
                m12885D(jSONObjectM12857q, path, c10767f);
            }
        }

        /* renamed from: G */
        public final void m12888G(final C10775e c10775e, List list) {
            sq8.m48649h(c10775e, "requests");
            sq8.m48649h(list, "responses");
            int size = c10775e.size();
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                GraphRequest graphRequestM13053o = c10775e.get(i);
                if (graphRequestM13053o.m12855o() != null) {
                    arrayList.add(new Pair(graphRequestM13053o.m12855o(), list.get(i)));
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: o.yu7
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.C10764c.m12874H(arrayList, c10775e);
                    }
                };
                Handler handlerM13055q = c10775e.m13055q();
                if (handlerM13055q != null) {
                    handlerM13055q.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* renamed from: I */
        public final void m12889I(Map map, C10767f c10767f) throws IOException {
            for (Map.Entry entry : map.entrySet()) {
                if (GraphRequest.f11338n.m12911v(((C10762a) entry.getValue()).m12872b())) {
                    c10767f.m12924i((String) entry.getKey(), ((C10762a) entry.getValue()).m12872b(), ((C10762a) entry.getValue()).m12871a());
                }
            }
        }

        /* renamed from: J */
        public final void m12890J(Bundle bundle, C10767f c10767f, GraphRequest graphRequest) throws IOException {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (m12912w(obj)) {
                    sq8.m48648g(str, TransferTable.COLUMN_KEY);
                    c10767f.m12924i(str, obj, graphRequest);
                }
            }
        }

        /* renamed from: K */
        public final void m12891K(C10767f c10767f, Collection collection, Map map) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).m12841B(jSONArray, map);
            }
            c10767f.m12926k("batch", jSONArray, collection);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
        /* renamed from: L */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m12892L(C10775e c10775e, HttpURLConnection httpURLConnection) throws Throwable {
            OutputStream gZIPOutputStream;
            sq8.m48649h(c10775e, "requests");
            sq8.m48649h(httpURLConnection, "connection");
            sja sjaVar = new sja(bka.REQUESTS, "Request");
            int size = c10775e.size();
            boolean zM12909t = m12909t(c10775e);
            OutputStream outputStream = null;
            p38 p38VarM12860t = size == 1 ? c10775e.get(0).m12860t() : null;
            if (p38VarM12860t == null) {
                p38VarM12860t = p38.POST;
            }
            httpURLConnection.setRequestMethod(p38VarM12860t.name());
            m12893M(httpURLConnection, zM12909t);
            URL url = httpURLConnection.getURL();
            sjaVar.m48380b("Request:\n");
            sjaVar.m48382d(JsonDocumentFields.POLICY_ID, c10775e.m13057v());
            sq8.m48648g(url, ImagesContract.URL);
            sjaVar.m48382d("URL", url);
            Object requestMethod = httpURLConnection.getRequestMethod();
            sq8.m48648g(requestMethod, "connection.requestMethod");
            sjaVar.m48382d("Method", requestMethod);
            Object requestProperty = httpURLConnection.getRequestProperty("User-Agent");
            sq8.m48648g(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            sjaVar.m48382d("User-Agent", requestProperty);
            Object requestProperty2 = httpURLConnection.getRequestProperty("Content-Type");
            sq8.m48648g(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            sjaVar.m48382d("Content-Type", requestProperty2);
            httpURLConnection.setConnectTimeout(c10775e.m13060y());
            httpURLConnection.setReadTimeout(c10775e.m13060y());
            if (!(p38VarM12860t == p38.POST)) {
                sjaVar.m48383e();
                return;
            }
            httpURLConnection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                if (zM12909t) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        outputStream = bufferedOutputStream;
                        if (outputStream != null) {
                        }
                        throw th;
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream;
                }
                try {
                    if (m12908s(c10775e)) {
                        and andVar = new and(c10775e.m13055q());
                        m12887F(c10775e, null, size, url, andVar, zM12909t);
                        gZIPOutputStream = new C10779i(gZIPOutputStream, c10775e, andVar.m17522f(), andVar.m17521d());
                    }
                    m12887F(c10775e, sjaVar, size, url, gZIPOutputStream, zM12909t);
                    gZIPOutputStream.close();
                    sjaVar.m48383e();
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = gZIPOutputStream;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* renamed from: M */
        public final void m12893M(HttpURLConnection httpURLConnection, boolean z) {
            if (!z) {
                httpURLConnection.setRequestProperty("Content-Type", m12906q());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        /* renamed from: N */
        public final HttpURLConnection m12894N(C10775e c10775e) throws Throwable {
            sq8.m48649h(c10775e, "requests");
            m12895O(c10775e);
            try {
                HttpURLConnection httpURLConnectionM12896g = null;
                try {
                    httpURLConnectionM12896g = m12896g(c10775e.size() == 1 ? new URL(c10775e.get(0).m12864x()) : new URL(cgf.m21207h()));
                    m12892L(c10775e, httpURLConnectionM12896g);
                    return httpURLConnectionM12896g;
                } catch (IOException e) {
                    cri.m21671r(httpURLConnectionM12896g);
                    throw new ur6("could not construct request body", e);
                } catch (JSONException e2) {
                    cri.m21671r(httpURLConnectionM12896g);
                    throw new ur6("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new ur6("could not construct URL for request", e3);
            }
        }

        /* renamed from: O */
        public final void m12895O(C10775e c10775e) {
            sq8.m48649h(c10775e, "requests");
            Iterator<E> it = c10775e.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                if (p38.GET == graphRequest.m12860t() && cri.d0(graphRequest.m12861u().getString("fields"))) {
                    sja.C16851a c16851a = sja.f45482e;
                    bka bkaVar = bka.DEVELOPER_ERRORS;
                    StringBuilder sb = new StringBuilder();
                    sb.append("GET requests for /");
                    String strM12858r = graphRequest.m12858r();
                    if (strM12858r == null) {
                        strM12858r = "";
                    }
                    sb.append(strM12858r);
                    sb.append(" should contain an explicit \"fields\" parameter.");
                    c16851a.m48386a(bkaVar, 5, "Request", sb.toString());
                }
            }
        }

        /* renamed from: g */
        public final HttpURLConnection m12896g(URL url) {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            sq8.m48647f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestProperty("User-Agent", m12907r());
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        /* renamed from: h */
        public final C10776f m12897h(GraphRequest graphRequest) {
            sq8.m48649h(graphRequest, "request");
            List listM12900k = m12900k(graphRequest);
            if (listM12900k.size() == 1) {
                return (C10776f) listM12900k.get(0);
            }
            throw new ur6("invalid state: expected a single response");
        }

        /* renamed from: i */
        public final List m12898i(C10775e c10775e) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionM12894N;
            List listM12904o;
            sq8.m48649h(c10775e, "requests");
            rri.m47114i(c10775e, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionM12894N = m12894N(c10775e);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnectionM12894N = null;
            } catch (Throwable th) {
                th = th;
                cri.m21671r(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionM12894N != null) {
                    listM12904o = m12904o(httpURLConnectionM12894N, c10775e);
                } else {
                    List listM13067a = C10776f.f11433i.m13067a(c10775e.m13058w(), null, new ur6(exc));
                    m12888G(c10775e, listM13067a);
                    listM12904o = listM13067a;
                }
                cri.m21671r(httpURLConnectionM12894N);
                return listM12904o;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionM12894N;
                cri.m21671r(httpURLConnection);
                throw th;
            }
        }

        /* renamed from: j */
        public final List m12899j(Collection collection) {
            sq8.m48649h(collection, "requests");
            return m12898i(new C10775e(collection));
        }

        /* renamed from: k */
        public final List m12900k(GraphRequest... graphRequestArr) {
            sq8.m48649h(graphRequestArr, "requests");
            return m12899j(gp0.D0(graphRequestArr));
        }

        /* renamed from: l */
        public final AsyncTaskC10774d m12901l(C10775e c10775e) {
            sq8.m48649h(c10775e, "requests");
            rri.m47114i(c10775e, "requests");
            AsyncTaskC10774d asyncTaskC10774d = new AsyncTaskC10774d(c10775e);
            asyncTaskC10774d.executeOnExecutor(C10773c.m13028u(), new Void[0]);
            return asyncTaskC10774d;
        }

        /* renamed from: m */
        public final AsyncTaskC10774d m12902m(Collection collection) {
            sq8.m48649h(collection, "requests");
            return m12901l(new C10775e(collection));
        }

        /* renamed from: n */
        public final AsyncTaskC10774d m12903n(GraphRequest... graphRequestArr) {
            sq8.m48649h(graphRequestArr, "requests");
            return m12902m(gp0.D0(graphRequestArr));
        }

        /* renamed from: o */
        public final List m12904o(HttpURLConnection httpURLConnection, C10775e c10775e) {
            sq8.m48649h(httpURLConnection, "connection");
            sq8.m48649h(c10775e, "requests");
            List listM13072f = C10776f.f11433i.m13072f(httpURLConnection, c10775e);
            cri.m21671r(httpURLConnection);
            int size = c10775e.size();
            if (size == listM13072f.size()) {
                m12888G(c10775e, listM13072f);
                C10772b.f11380f.m12973e().m12959h();
                return listM13072f;
            }
            h8g h8gVar = h8g.f26398a;
            String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listM13072f.size()), Integer.valueOf(size)}, 2));
            sq8.m48648g(str, "format(locale, format, *args)");
            throw new ur6(str);
        }

        /* renamed from: p */
        public final String m12905p(C10775e c10775e) {
            String strM13054p = c10775e.m13054p();
            if (strM13054p != null && (!c10775e.isEmpty())) {
                return strM13054p;
            }
            Iterator<E> it = c10775e.iterator();
            while (it.hasNext()) {
                AccessToken accessTokenM12853m = ((GraphRequest) it.next()).m12853m();
                if (accessTokenM12853m != null) {
                    return accessTokenM12853m.m12751c();
                }
            }
            String str = GraphRequest.f11341q;
            if (str != null) {
                if (str.length() > 0) {
                    return str;
                }
            }
            return C10773c.m13020m();
        }

        /* renamed from: q */
        public final String m12906q() {
            h8g h8gVar = h8g.f26398a;
            String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f11340p}, 1));
            sq8.m48648g(str, "format(format, *args)");
            return str;
        }

        /* renamed from: r */
        public final String m12907r() {
            if (GraphRequest.f11343s == null) {
                h8g h8gVar = h8g.f26398a;
                String str = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.0.3"}, 2));
                sq8.m48648g(str, "format(format, *args)");
                GraphRequest.f11343s = str;
                String strM37757a = lq8.m37757a();
                if (!cri.d0(strM37757a)) {
                    String str2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f11343s, strM37757a}, 2));
                    sq8.m48648g(str2, "format(locale, format, *args)");
                    GraphRequest.f11343s = str2;
                }
            }
            return GraphRequest.f11343s;
        }

        /* renamed from: s */
        public final boolean m12908s(C10775e c10775e) {
            for (C10775e.a aVar : c10775e.m13056r()) {
            }
            Iterator<E> it = c10775e.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).m12855o();
            }
            return false;
        }

        /* renamed from: t */
        public final boolean m12909t(C10775e c10775e) {
            Iterator<E> it = c10775e.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                Iterator<String> it2 = graphRequest.m12861u().keySet().iterator();
                while (it2.hasNext()) {
                    if (m12911v(graphRequest.m12861u().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: u */
        public final boolean m12910u(String str) {
            Matcher matcher = GraphRequest.f11342r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                sq8.m48648g(str, "matcher.group(1)");
            }
            return e9g.m24597K(str, "me/", false, 2, null) || e9g.m24597K(str, "/me/", false, 2, null);
        }

        /* renamed from: v */
        public final boolean m12911v(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* renamed from: w */
        public final boolean m12912w(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* renamed from: x */
        public final GraphRequest m12913x(AccessToken accessToken, String str, InterfaceC10763b interfaceC10763b) {
            return new GraphRequest(accessToken, str, null, null, interfaceC10763b, null, 32, null);
        }

        /* renamed from: y */
        public final GraphRequest m12914y(AccessToken accessToken, final InterfaceC10765d interfaceC10765d) {
            return new GraphRequest(accessToken, "me", null, null, new InterfaceC10763b(interfaceC10765d) { // from class: o.zu7
                @Override // com.facebook.GraphRequest.InterfaceC10763b
                /* renamed from: a */
                public final void mo12873a(C10776f c10776f) {
                    GraphRequest.C10764c.m12881z(null, c10776f);
                }
            }, null, 32, null);
        }
    }

    /* renamed from: com.facebook.GraphRequest$d */
    public interface InterfaceC10765d {
        /* renamed from: a */
        void m12915a(JSONObject jSONObject, C10776f c10776f);
    }

    /* renamed from: com.facebook.GraphRequest$e */
    public interface InterfaceC10766e {
        void writeString(String str, String str2);
    }

    /* renamed from: com.facebook.GraphRequest$f */
    public static final class C10767f implements InterfaceC10766e {

        /* renamed from: a */
        public final OutputStream f11362a;

        /* renamed from: b */
        public final sja f11363b;

        /* renamed from: c */
        public boolean f11364c;

        /* renamed from: d */
        public final boolean f11365d;

        public C10767f(OutputStream outputStream, sja sjaVar, boolean z) {
            sq8.m48649h(outputStream, "outputStream");
            this.f11362a = outputStream;
            this.f11363b = sjaVar;
            this.f11364c = true;
            this.f11365d = z;
        }

        /* renamed from: a */
        public final RuntimeException m12916a() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: b */
        public final void m12917b(String str, Object... objArr) throws IOException {
            sq8.m48649h(str, "format");
            sq8.m48649h(objArr, "args");
            if (this.f11365d) {
                OutputStream outputStream = this.f11362a;
                h8g h8gVar = h8g.f26398a;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                sq8.m48648g(str2, "format(locale, format, *args)");
                String strEncode = URLEncoder.encode(str2, HTTP.UTF_8);
                sq8.m48648g(strEncode, "encode(String.format(Loc… format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(sh2.f45422b);
                sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f11364c) {
                OutputStream outputStream2 = this.f11362a;
                Charset charset = sh2.f45422b;
                byte[] bytes2 = "--".getBytes(charset);
                sq8.m48648g(bytes2, "this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f11362a;
                byte[] bytes3 = GraphRequest.f11340p.getBytes(charset);
                sq8.m48648g(bytes3, "this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f11362a;
                byte[] bytes4 = "\r\n".getBytes(charset);
                sq8.m48648g(bytes4, "this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f11364c = false;
            }
            OutputStream outputStream5 = this.f11362a;
            h8g h8gVar2 = h8g.f26398a;
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
            String str3 = String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            sq8.m48648g(str3, "format(format, *args)");
            byte[] bytes5 = str3.getBytes(sh2.f45422b);
            sq8.m48648g(bytes5, "this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        /* renamed from: c */
        public final void m12918c(String str, Bitmap bitmap) throws IOException {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(bitmap, "bitmap");
            m12920e(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f11362a);
            m12923h("", new Object[0]);
            m12925j();
            sja sjaVar = this.f11363b;
            if (sjaVar != null) {
                sjaVar.m48382d("    " + str, "<Image>");
            }
        }

        /* renamed from: d */
        public final void m12919d(String str, byte[] bArr) throws IOException {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(bArr, "bytes");
            m12920e(str, str, "content/unknown");
            this.f11362a.write(bArr);
            m12923h("", new Object[0]);
            m12925j();
            sja sjaVar = this.f11363b;
            if (sjaVar != null) {
                h8g h8gVar = h8g.f26398a;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                sq8.m48648g(str2, "format(locale, format, *args)");
                sjaVar.m48382d("    " + str, str2);
            }
        }

        /* renamed from: e */
        public final void m12920e(String str, String str2, String str3) throws IOException {
            if (this.f11365d) {
                OutputStream outputStream = this.f11362a;
                h8g h8gVar = h8g.f26398a;
                String str4 = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
                sq8.m48648g(str4, "format(format, *args)");
                byte[] bytes = str4.getBytes(sh2.f45422b);
                sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            m12917b("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                m12917b("; filename=\"%s\"", str2);
            }
            m12923h("", new Object[0]);
            if (str3 != null) {
                m12923h("%s: %s", "Content-Type", str3);
            }
            m12923h("", new Object[0]);
        }

        /* renamed from: f */
        public final void m12921f(String str, Uri uri, String str2) throws IOException {
            int iM21670q;
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m12920e(str, str, str2);
            if (this.f11362a instanceof and) {
                ((and) this.f11362a).m17520c(cri.m21641A(uri));
                iM21670q = 0;
            } else {
                iM21670q = cri.m21670q(C10773c.m13019l().getContentResolver().openInputStream(uri), this.f11362a) + 0;
            }
            m12923h("", new Object[0]);
            m12925j();
            sja sjaVar = this.f11363b;
            if (sjaVar != null) {
                h8g h8gVar = h8g.f26398a;
                String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM21670q)}, 1));
                sq8.m48648g(str3, "format(locale, format, *args)");
                sjaVar.m48382d("    " + str, str3);
            }
        }

        /* renamed from: g */
        public final void m12922g(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int iM21670q;
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m12920e(str, str, str2);
            OutputStream outputStream = this.f11362a;
            if (outputStream instanceof and) {
                ((and) outputStream).m17520c(parcelFileDescriptor.getStatSize());
                iM21670q = 0;
            } else {
                iM21670q = cri.m21670q(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f11362a) + 0;
            }
            m12923h("", new Object[0]);
            m12925j();
            sja sjaVar = this.f11363b;
            if (sjaVar != null) {
                h8g h8gVar = h8g.f26398a;
                String str3 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM21670q)}, 1));
                sq8.m48648g(str3, "format(locale, format, *args)");
                sjaVar.m48382d("    " + str, str3);
            }
        }

        /* renamed from: h */
        public final void m12923h(String str, Object... objArr) throws IOException {
            sq8.m48649h(str, "format");
            sq8.m48649h(objArr, "args");
            m12917b(str, Arrays.copyOf(objArr, objArr.length));
            if (this.f11365d) {
                return;
            }
            m12917b("\r\n", new Object[0]);
        }

        /* renamed from: i */
        public final void m12924i(String str, Object obj, GraphRequest graphRequest) throws IOException {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            Closeable closeable = this.f11362a;
            if (closeable instanceof rme) {
                sq8.m48647f(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                ((rme) closeable).mo13091a(graphRequest);
            }
            C10764c c10764c = GraphRequest.f11338n;
            if (c10764c.m12912w(obj)) {
                writeString(str, c10764c.m12884C(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                m12918c(str, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                m12919d(str, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                m12921f(str, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                m12922g(str, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw m12916a();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable parcelableM12868b = parcelableResourceWithMimeType.m12868b();
            String strM12867a = parcelableResourceWithMimeType.m12867a();
            if (parcelableM12868b instanceof ParcelFileDescriptor) {
                m12922g(str, (ParcelFileDescriptor) parcelableM12868b, strM12867a);
            } else {
                if (!(parcelableM12868b instanceof Uri)) {
                    throw m12916a();
                }
                m12921f(str, (Uri) parcelableM12868b, strM12867a);
            }
        }

        /* renamed from: j */
        public final void m12925j() throws IOException {
            if (!this.f11365d) {
                m12923h("--%s", GraphRequest.f11340p);
                return;
            }
            OutputStream outputStream = this.f11362a;
            byte[] bytes = "&".getBytes(sh2.f45422b);
            sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: k */
        public final void m12926k(String str, JSONArray jSONArray, Collection collection) throws JSONException, IOException {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(jSONArray, "requestJsonArray");
            sq8.m48649h(collection, "requests");
            Closeable closeable = this.f11362a;
            if (!(closeable instanceof rme)) {
                String string = jSONArray.toString();
                sq8.m48648g(string, "requestJsonArray.toString()");
                writeString(str, string);
                return;
            }
            sq8.m48647f(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
            rme rmeVar = (rme) closeable;
            m12920e(str, null, null);
            m12917b("[", new Object[0]);
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                GraphRequest graphRequest = (GraphRequest) it.next();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                rmeVar.mo13091a(graphRequest);
                if (i > 0) {
                    m12917b(",%s", jSONObject.toString());
                } else {
                    m12917b("%s", jSONObject.toString());
                }
                i = i2;
            }
            m12917b("]", new Object[0]);
            sja sjaVar = this.f11363b;
            if (sjaVar != null) {
                String string2 = jSONArray.toString();
                sq8.m48648g(string2, "requestJsonArray.toString()");
                sjaVar.m48382d("    " + str, string2);
            }
        }

        @Override // com.facebook.GraphRequest.InterfaceC10766e
        public void writeString(String str, String str2) throws IOException {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(str2, "value");
            m12920e(str, null, null);
            m12923h("%s", str2);
            m12925j();
            sja sjaVar = this.f11363b;
            if (sjaVar != null) {
                sjaVar.m48382d("    " + str, str2);
            }
        }
    }

    /* renamed from: com.facebook.GraphRequest$g */
    public static final class C10768g implements InterfaceC10766e {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f11366a;

        public C10768g(ArrayList arrayList) {
            this.f11366a = arrayList;
        }

        @Override // com.facebook.GraphRequest.InterfaceC10766e
        public void writeString(String str, String str2) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(str2, "value");
            ArrayList arrayList = this.f11366a;
            h8g h8gVar = h8g.f26398a;
            String str3 = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, HTTP.UTF_8)}, 2));
            sq8.m48648g(str3, "format(locale, format, *args)");
            arrayList.add(str3);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        sq8.m48648g(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < iNextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String string = sb.toString();
        sq8.m48648g(string, "buffer.toString()");
        f11340p = string;
        f11342r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, p38 p38Var, InterfaceC10763b interfaceC10763b, String str2, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : p38Var, (i & 16) != 0 ? null : interfaceC10763b, (i & 32) != 0 ? null : str2);
    }

    /* renamed from: b */
    public static final void m12833b(InterfaceC10763b interfaceC10763b, C10776f c10776f) {
        sq8.m48649h(c10776f, "response");
        JSONObject jSONObjectM13065c = c10776f.m13065c();
        JSONObject jSONObjectOptJSONObject = jSONObjectM13065c != null ? jSONObjectM13065c.optJSONObject("__debug__") : null;
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("messages") : null;
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE) : null;
                String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("type") : null;
                String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("link") : null;
                if (strOptString != null && strOptString2 != null) {
                    bka bkaVar = bka.GRAPH_API_DEBUG_INFO;
                    if (sq8.m48644c(strOptString2, "warning")) {
                        bkaVar = bka.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!cri.d0(strOptString3)) {
                        strOptString = strOptString + " Link: " + strOptString3;
                    }
                    sja.C16851a c16851a = sja.f45482e;
                    String str = f11339o;
                    sq8.m48648g(str, "TAG");
                    c16851a.m48387b(bkaVar, str, strOptString);
                }
            }
        }
        if (interfaceC10763b != null) {
            interfaceC10763b.mo12873a(c10776f);
        }
    }

    /* renamed from: A */
    public final boolean m12840A() {
        if (sq8.m48644c(C10773c.m13032y(), "instagram.com")) {
            return !m12866z();
        }
        return true;
    }

    /* renamed from: B */
    public final void m12841B(JSONArray jSONArray, Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f11347d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f11349f);
        }
        String str2 = this.f11348e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String strM12862v = m12862v();
        jSONObject.put("relative_url", strM12862v);
        jSONObject.put(FirebaseAnalytics.Param.METHOD, this.f11354k);
        AccessToken accessToken = this.f11344a;
        if (accessToken != null) {
            sja.f45482e.m48389d(accessToken.m12760l());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f11350g.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.f11350g.get(it.next());
            if (f11338n.m12911v(obj)) {
                h8g h8gVar = h8g.f26398a;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{TransferTable.COLUMN_FILE, Integer.valueOf(map.size())}, 2));
                sq8.m48648g(str3, "format(locale, format, *args)");
                arrayList.add(str3);
                map.put(str3, new C10762a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f11346c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f11338n.m12885D(jSONObject2, strM12862v, new C10768g(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: C */
    public final void m12842C(final InterfaceC10763b interfaceC10763b) {
        if (C10773c.m12995I(bka.GRAPH_API_DEBUG_INFO) || C10773c.m12995I(bka.GRAPH_API_DEBUG_WARNING)) {
            this.f11353j = new InterfaceC10763b() { // from class: o.xu7
                @Override // com.facebook.GraphRequest.InterfaceC10763b
                /* renamed from: a */
                public final void mo12873a(C10776f c10776f) {
                    GraphRequest.m12833b(interfaceC10763b, c10776f);
                }
            };
        } else {
            this.f11353j = interfaceC10763b;
        }
    }

    /* renamed from: D */
    public final void m12843D(boolean z) {
        this.f11355l = z;
    }

    /* renamed from: E */
    public final void m12844E(JSONObject jSONObject) {
        this.f11346c = jSONObject;
    }

    /* renamed from: F */
    public final void m12845F(p38 p38Var) {
        if (this.f11356m != null && p38Var != p38.GET) {
            throw new ur6("Can't change HTTP method on request with overridden URL.");
        }
        if (p38Var == null) {
            p38Var = p38.GET;
        }
        this.f11354k = p38Var;
    }

    /* renamed from: G */
    public final void m12846G(Bundle bundle) {
        sq8.m48649h(bundle, "<set-?>");
        this.f11350g = bundle;
    }

    /* renamed from: H */
    public final void m12847H(Object obj) {
        this.f11351h = obj;
    }

    /* renamed from: I */
    public final boolean m12848I() {
        String strM12854n = m12854n();
        boolean zM26306P = strM12854n != null ? f9g.m26306P(strM12854n, "|", false, 2, null) : false;
        if (((strM12854n == null || !e9g.m24597K(strM12854n, "IG", false, 2, null) || zM26306P) ? false : true) && m12866z()) {
            return true;
        }
        return (m12840A() || zM26306P) ? false : true;
    }

    /* renamed from: i */
    public final void m12849i() {
        Bundle bundle = this.f11350g;
        if (m12848I()) {
            bundle.putString("access_token", m12856p());
        } else {
            String strM12854n = m12854n();
            if (strM12854n != null) {
                bundle.putString("access_token", strM12854n);
            }
        }
        if (!bundle.containsKey("access_token")) {
            cri.d0(C10773c.m13026s());
        }
        bundle.putString("sdk", CredentialsData.CREDENTIALS_TYPE_ANDROID);
        bundle.putString("format", "json");
        if (C10773c.m12995I(bka.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (C10773c.m12995I(bka.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    /* renamed from: j */
    public final String m12850j(String str, boolean z) {
        if (!z && this.f11354k == p38.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f11350g.keySet()) {
            Object obj = this.f11350g.get(str2);
            if (obj == null) {
                obj = "";
            }
            C10764c c10764c = f11338n;
            if (c10764c.m12912w(obj)) {
                builderBuildUpon.appendQueryParameter(str2, c10764c.m12884C(obj).toString());
            } else if (this.f11354k != p38.GET) {
                h8g h8gVar = h8g.f26398a;
                String str3 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                sq8.m48648g(str3, "format(locale, format, *args)");
                throw new IllegalArgumentException(str3);
            }
        }
        String string = builderBuildUpon.toString();
        sq8.m48648g(string, "uriBuilder.toString()");
        return string;
    }

    /* renamed from: k */
    public final C10776f m12851k() {
        return f11338n.m12897h(this);
    }

    /* renamed from: l */
    public final AsyncTaskC10774d m12852l() {
        return f11338n.m12903n(this);
    }

    /* renamed from: m */
    public final AccessToken m12853m() {
        return this.f11344a;
    }

    /* renamed from: n */
    public final String m12854n() {
        AccessToken accessToken = this.f11344a;
        if (accessToken != null) {
            if (!this.f11350g.containsKey("access_token")) {
                String strM12760l = accessToken.m12760l();
                sja.f45482e.m48389d(strM12760l);
                return strM12760l;
            }
        } else if (!this.f11350g.containsKey("access_token")) {
            return m12856p();
        }
        return this.f11350g.getString("access_token");
    }

    /* renamed from: o */
    public final InterfaceC10763b m12855o() {
        return this.f11353j;
    }

    /* renamed from: p */
    public final String m12856p() {
        String strM13020m = C10773c.m13020m();
        String strM13026s = C10773c.m13026s();
        if (strM13020m.length() > 0) {
            if (strM13026s.length() > 0) {
                return strM13020m + '|' + strM13026s;
            }
        }
        cri.k0(f11339o, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    /* renamed from: q */
    public final JSONObject m12857q() {
        return this.f11346c;
    }

    /* renamed from: r */
    public final String m12858r() {
        return this.f11345b;
    }

    /* renamed from: s */
    public final String m12859s() {
        if (f11342r.matcher(this.f11345b).matches()) {
            return this.f11345b;
        }
        h8g h8gVar = h8g.f26398a;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f11352i, this.f11345b}, 2));
        sq8.m48648g(str, "format(format, *args)");
        return str;
    }

    /* renamed from: t */
    public final p38 m12860t() {
        return this.f11354k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f11344a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f11345b);
        sb.append(", graphObject: ");
        sb.append(this.f11346c);
        sb.append(", httpMethod: ");
        sb.append(this.f11354k);
        sb.append(", parameters: ");
        sb.append(this.f11350g);
        sb.append("}");
        String string = sb.toString();
        sq8.m48648g(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    /* renamed from: u */
    public final Bundle m12861u() {
        return this.f11350g;
    }

    /* renamed from: v */
    public final String m12862v() {
        if (this.f11356m != null) {
            throw new ur6("Can't override URL for a batch request");
        }
        String strM12865y = m12865y(cgf.m21207h());
        m12849i();
        Uri uri = Uri.parse(m12850j(strM12865y, true));
        h8g h8gVar = h8g.f26398a;
        String str = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
        sq8.m48648g(str, "format(format, *args)");
        return str;
    }

    /* renamed from: w */
    public final Object m12863w() {
        return this.f11351h;
    }

    /* renamed from: x */
    public final String m12864x() {
        String str = this.f11356m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f11345b;
        String strM12865y = m12865y((this.f11354k == p38.POST && str2 != null && e9g.m24605w(str2, "/videos", false, 2, null)) ? cgf.m21209j() : cgf.m21208i(C10773c.m13032y()));
        m12849i();
        return m12850j(strM12865y, false);
    }

    /* renamed from: y */
    public final String m12865y(String str) {
        if (!m12840A()) {
            str = cgf.m21205f();
        }
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{str, m12859s()}, 2));
        sq8.m48648g(str2, "format(format, *args)");
        return str2;
    }

    /* renamed from: z */
    public final boolean m12866z() {
        if (this.f11345b == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        sb.append(C10773c.m13020m());
        sb.append("/?.*");
        return this.f11355l || Pattern.matches(sb.toString(), this.f11345b) || Pattern.matches("^/?app/?.*", this.f11345b);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, p38 p38Var, InterfaceC10763b interfaceC10763b, String str2) {
        this.f11349f = true;
        this.f11344a = accessToken;
        this.f11345b = str;
        this.f11352i = str2;
        m12842C(interfaceC10763b);
        m12845F(p38Var);
        if (bundle != null) {
            this.f11350g = new Bundle(bundle);
        } else {
            this.f11350g = new Bundle();
        }
        if (this.f11352i == null) {
            this.f11352i = C10773c.m13031x();
        }
    }
}
