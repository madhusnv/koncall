package p001o;

import com.facebook.GraphRequest;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.ll0;
import p001o.sja;

/* loaded from: classes5.dex */
public final class ll0 {

    /* renamed from: a */
    public static final ll0 f33981a = new ll0();

    /* renamed from: b */
    public static final HashSet f33982b = nif.m40665f(200, 202);

    /* renamed from: c */
    public static final HashSet f33983c = nif.m40665f(503, Integer.valueOf(HttpStatus.SC_GATEWAY_TIMEOUT), 429);

    /* renamed from: d */
    public static C15098a f33984d;

    /* renamed from: e */
    public static List f33985e;

    /* renamed from: f */
    public static int f33986f;

    /* renamed from: o.ll0$a */
    public static final class C15098a {

        /* renamed from: a */
        public final String f33987a;

        /* renamed from: b */
        public final String f33988b;

        /* renamed from: c */
        public final String f33989c;

        public C15098a(String str, String str2, String str3) {
            sq8.m48649h(str, "datasetID");
            sq8.m48649h(str2, "cloudBridgeURL");
            sq8.m48649h(str3, "accessKey");
            this.f33987a = str;
            this.f33988b = str2;
            this.f33989c = str3;
        }

        /* renamed from: a */
        public final String m37409a() {
            return this.f33989c;
        }

        /* renamed from: b */
        public final String m37410b() {
            return this.f33988b;
        }

        /* renamed from: c */
        public final String m37411c() {
            return this.f33987a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15098a)) {
                return false;
            }
            C15098a c15098a = (C15098a) obj;
            return sq8.m48644c(this.f33987a, c15098a.f33987a) && sq8.m48644c(this.f33988b, c15098a.f33988b) && sq8.m48644c(this.f33989c, c15098a.f33989c);
        }

        public int hashCode() {
            return (((this.f33987a.hashCode() * 31) + this.f33988b.hashCode()) * 31) + this.f33989c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f33987a + ", cloudBridgeURL=" + this.f33988b + ", accessKey=" + this.f33989c + ')';
        }
    }

    /* renamed from: o.ll0$b */
    public static final class C15099b extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ List f33990a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15099b(List list) {
            super(2);
            this.f33990a = list;
        }

        /* renamed from: c */
        public static final void m37413c(Integer num, List list) {
            sq8.m48649h(list, "$processedEvents");
            if (kh3.m35708X(ll0.f33982b, num)) {
                return;
            }
            ll0.f33981a.m37404g(num, list, 5);
        }

        /* renamed from: b */
        public final void m37414b(String str, final Integer num) {
            final List list = this.f33990a;
            cri.C0(new Runnable() { // from class: o.ml0
                @Override // java.lang.Runnable
                public final void run() {
                    ll0.C15099b.m37413c(num, list);
                }
            });
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m37414b((String) obj, (Integer) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: d */
    public static final void m37398d(String str, String str2, String str3) {
        sq8.m48649h(str, "datasetID");
        sq8.m48649h(str2, ImagesContract.URL);
        sq8.m48649h(str3, "accessKey");
        sja.f45482e.m48388c(bka.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, str2, str3);
        ll0 ll0Var = f33981a;
        ll0Var.m37406i(new C15098a(str, str2, str3));
        ll0Var.m37407j(new ArrayList());
    }

    /* renamed from: l */
    public static final void m37399l(final GraphRequest graphRequest) {
        sq8.m48649h(graphRequest, "request");
        cri.C0(new Runnable() { // from class: o.kl0
            @Override // java.lang.Runnable
            public final void run() throws JSONException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
                ll0.m37400m(graphRequest);
            }
        });
    }

    /* renamed from: m */
    public static final void m37400m(GraphRequest graphRequest) throws JSONException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(graphRequest, "$request");
        String strM12858r = graphRequest.m12858r();
        List listD0 = strM12858r != null ? f9g.D0(strM12858r, new String[]{"/"}, false, 0, 6, null) : null;
        if (listD0 == null || listD0.size() != 2) {
            sja.f45482e.m48388c(bka.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", graphRequest);
            return;
        }
        try {
            ll0 ll0Var = f33981a;
            String str = ll0Var.m37402e().m37410b() + "/capi/" + ll0Var.m37402e().m37411c() + "/events";
            List listM37408k = ll0Var.m37408k(graphRequest);
            if (listM37408k == null) {
                return;
            }
            ll0Var.m37401c(listM37408k);
            int iMin = Math.min(ll0Var.m37403f().size(), 10);
            List listF0 = kh3.F0(ll0Var.m37403f(), new kl8(0, iMin - 1));
            ll0Var.m37403f().subList(0, iMin).clear();
            JSONArray jSONArray = new JSONArray((Collection) listF0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
            linkedHashMap.put("accessKey", ll0Var.m37402e().m37409a());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            sja.C16851a c16851a = sja.f45482e;
            bka bkaVar = bka.APP_EVENTS;
            String string = jSONObject.toString(2);
            sq8.m48648g(string, "jsonBodyStr.toString(2)");
            c16851a.m48388c(bkaVar, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, graphRequest, string);
            ll0Var.m37405h(str, "POST", jSONObject.toString(), hsa.m31056f(vyh.m53620a("Content-Type", "application/json")), 60000, new C15099b(listF0));
        } catch (w3i e) {
            sja.f45482e.m48388c(bka.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e);
        }
    }

    /* renamed from: c */
    public final void m37401c(List list) {
        if (list != null) {
            m37403f().addAll(list);
        }
        int iMax = Math.max(0, m37403f().size() - 1000);
        if (iMax > 0) {
            List listM35709Y = kh3.m35709Y(m37403f(), iMax);
            sq8.m48647f(listM35709Y, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
            m37407j(azh.m18050c(listM35709Y));
        }
    }

    /* renamed from: e */
    public final C15098a m37402e() {
        C15098a c15098a = f33984d;
        if (c15098a != null) {
            return c15098a;
        }
        sq8.m48667z("credentials");
        return null;
    }

    /* renamed from: f */
    public final List m37403f() {
        List list = f33985e;
        if (list != null) {
            return list;
        }
        sq8.m48667z("transformedEvents");
        return null;
    }

    /* renamed from: g */
    public final void m37404g(Integer num, List list, int i) {
        sq8.m48649h(list, "processedEvents");
        if (kh3.m35708X(f33983c, num)) {
            if (f33986f >= i) {
                m37403f().clear();
                f33986f = 0;
            } else {
                m37403f().addAll(0, list);
                f33986f++;
            }
        }
    }

    /* renamed from: h */
    public final void m37405h(String str, String str2, String str3, Map map, int i, nl7 nl7Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Set<String> setKeySet;
        sq8.m48649h(str, "urlStr");
        sq8.m48649h(str2, "requestMethod");
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            sq8.m48647f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod(str2);
            if (map != null && (setKeySet = map.keySet()) != null) {
                for (String str4 : setKeySet) {
                    httpURLConnection.setRequestProperty(str4, (String) map.get(str4));
                }
            }
            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals("PUT"));
            httpURLConnection.setConnectTimeout(i);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, HTTP.UTF_8));
            bufferedWriter.write(str3);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedOutputStream.close();
            StringBuilder sb = new StringBuilder();
            if (f33982b.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), HTTP.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            tb3.m49666a(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
                y3i y3iVar = y3i.f54824a;
                tb3.m49666a(bufferedReader, null);
            }
            String string = sb.toString();
            sq8.m48648g(string, "connResponseSB.toString()");
            sja.f45482e.m48388c(bka.APP_EVENTS, "CAPITransformerWebRequests", "\nResponse Received: \n%s\n%s", string, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (nl7Var != null) {
                nl7Var.invoke(string, Integer.valueOf(httpURLConnection.getResponseCode()));
            }
        } catch (UnknownHostException e) {
            sja.f45482e.m48388c(bka.APP_EVENTS, "CAPITransformerWebRequests", "Connection failed, retrying: \n%s", e.toString());
            if (nl7Var != null) {
                nl7Var.invoke(null, 503);
            }
        } catch (IOException e2) {
            sja.f45482e.m48388c(bka.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "Send to server failed: \n%s", e2.toString());
        }
    }

    /* renamed from: i */
    public final void m37406i(C15098a c15098a) {
        sq8.m48649h(c15098a, "<set-?>");
        f33984d = c15098a;
    }

    /* renamed from: j */
    public final void m37407j(List list) {
        sq8.m48649h(list, "<set-?>");
        f33985e = list;
    }

    /* renamed from: k */
    public final List m37408k(GraphRequest graphRequest) {
        JSONObject jSONObjectM12857q = graphRequest.m12857q();
        if (jSONObjectM12857q == null) {
            return null;
        }
        Map mapM32696w = isa.m32696w(cri.m21668o(jSONObjectM12857q));
        Object objM12863w = graphRequest.m12863w();
        sq8.m48647f(objM12863w, "null cannot be cast to non-null type kotlin.Any");
        mapM32696w.put("custom_events", objM12863w);
        StringBuilder sb = new StringBuilder();
        for (String str : mapM32696w.keySet()) {
            sb.append(str);
            sb.append(" : ");
            sb.append(mapM32696w.get(str));
            sb.append(System.getProperty("line.separator"));
        }
        sja.f45482e.m48388c(bka.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb);
        return jl0.f30647a.m33987e(mapM32696w);
    }
}
