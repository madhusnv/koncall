package com.facebook;

import com.facebook.AccessToken;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p001o.bka;
import p001o.cri;
import p001o.dh3;
import p001o.h8g;
import p001o.id5;
import p001o.sja;
import p001o.sq8;
import p001o.ur6;

/* renamed from: com.facebook.f */
/* loaded from: classes5.dex */
public final class C10776f {

    /* renamed from: i */
    public static final a f11433i = new a(null);

    /* renamed from: j */
    public static final String f11434j = C10776f.class.getCanonicalName();

    /* renamed from: a */
    public final GraphRequest f11435a;

    /* renamed from: b */
    public final HttpURLConnection f11436b;

    /* renamed from: c */
    public final String f11437c;

    /* renamed from: d */
    public final JSONObject f11438d;

    /* renamed from: e */
    public final JSONArray f11439e;

    /* renamed from: f */
    public final FacebookRequestError f11440f;

    /* renamed from: g */
    public final JSONObject f11441g;

    /* renamed from: h */
    public final JSONArray f11442h;

    /* renamed from: com.facebook.f$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final List m13067a(List list, HttpURLConnection httpURLConnection, ur6 ur6Var) {
            sq8.m48649h(list, "requests");
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C10776f((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, ur6Var)));
            }
            return arrayList;
        }

        /* renamed from: b */
        public final C10776f m13068b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                FacebookRequestError facebookRequestErrorM12828a = FacebookRequestError.f11320M.m12828a(jSONObject, obj2, httpURLConnection);
                if (facebookRequestErrorM12828a != null) {
                    String unused = C10776f.f11434j;
                    facebookRequestErrorM12828a.toString();
                    if (facebookRequestErrorM12828a.m12820b() == 190 && cri.m21657Z(graphRequest.m12853m())) {
                        if (facebookRequestErrorM12828a.m12825g() != 493) {
                            AccessToken.f11242y.m12778i(null);
                        } else {
                            AccessToken.C10742c c10742c = AccessToken.f11242y;
                            AccessToken accessTokenM12774e = c10742c.m12774e();
                            boolean z = false;
                            if (accessTokenM12774e != null && !accessTokenM12774e.m12762n()) {
                                z = true;
                            }
                            if (z) {
                                c10742c.m12773d();
                            }
                        }
                    }
                    return new C10776f(graphRequest, httpURLConnection, facebookRequestErrorM12828a);
                }
                Object objM21651P = cri.m21651P(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (objM21651P instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objM21651P;
                    return new C10776f(graphRequest, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (objM21651P instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objM21651P;
                    return new C10776f(graphRequest, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                obj = JSONObject.NULL;
                sq8.m48648g(obj, "NULL");
            }
            if (obj == JSONObject.NULL) {
                return new C10776f(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new ur6("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
        }

        /* renamed from: c */
        public final List m13069c(HttpURLConnection httpURLConnection, List list, Object obj) throws JSONException {
            Object obj2;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = (GraphRequest) list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", obj);
                    jSONObject.put("code", httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj2 = jSONArray;
                } catch (IOException e) {
                    arrayList.add(new C10776f(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e)));
                } catch (JSONException e2) {
                    arrayList.add(new C10776f(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e2)));
                }
            } else {
                obj2 = obj;
            }
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        GraphRequest graphRequest2 = (GraphRequest) list.get(i);
                        try {
                            Object obj3 = ((JSONArray) obj2).get(i);
                            sq8.m48648g(obj3, "obj");
                            arrayList.add(m13068b(graphRequest2, httpURLConnection, obj3, obj));
                        } catch (ur6 e3) {
                            arrayList.add(new C10776f(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e3)));
                        } catch (JSONException e4) {
                            arrayList.add(new C10776f(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e4)));
                        }
                    }
                    return arrayList;
                }
            }
            throw new ur6("Unexpected number of results");
        }

        /* renamed from: d */
        public final List m13070d(InputStream inputStream, HttpURLConnection httpURLConnection, C10775e c10775e) throws Throwable {
            sq8.m48649h(c10775e, "requests");
            String strT0 = cri.t0(inputStream);
            sja.f45482e.m48388c(bka.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strT0.length()), strT0);
            return m13071e(strT0, httpURLConnection, c10775e);
        }

        /* renamed from: e */
        public final List m13071e(String str, HttpURLConnection httpURLConnection, C10775e c10775e) throws JSONException {
            sq8.m48649h(str, "responseString");
            sq8.m48649h(c10775e, "requests");
            Object objNextValue = new JSONTokener(str).nextValue();
            sq8.m48648g(objNextValue, "resultObject");
            List listM13069c = m13069c(httpURLConnection, c10775e, objNextValue);
            sja.f45482e.m48388c(bka.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", c10775e.m13057v(), Integer.valueOf(str.length()), listM13069c);
            return listM13069c;
        }

        /* renamed from: f */
        public final List m13072f(HttpURLConnection httpURLConnection, C10775e c10775e) {
            List listM13067a;
            sq8.m48649h(httpURLConnection, "connection");
            sq8.m48649h(c10775e, "requests");
            InputStream errorStream = null;
            try {
                try {
                } catch (ur6 e) {
                    sja.f45482e.m48388c(bka.REQUESTS, "Response", "Response <Error>: %s", e);
                    listM13067a = m13067a(c10775e, httpURLConnection, e);
                } catch (Exception e2) {
                    sja.f45482e.m48388c(bka.REQUESTS, "Response", "Response <Error>: %s", e2);
                    listM13067a = m13067a(c10775e, httpURLConnection, new ur6(e2));
                }
                if (!C10773c.m12992F()) {
                    String unused = C10776f.f11434j;
                    throw new ur6("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                listM13067a = m13070d(errorStream, httpURLConnection, c10775e);
                return listM13067a;
            } finally {
                cri.m21664j(null);
            }
        }
    }

    public C10776f(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        sq8.m48649h(graphRequest, "request");
        this.f11435a = graphRequest;
        this.f11436b = httpURLConnection;
        this.f11437c = str;
        this.f11438d = jSONObject;
        this.f11439e = jSONArray;
        this.f11440f = facebookRequestError;
        this.f11441g = jSONObject;
        this.f11442h = jSONArray;
    }

    /* renamed from: b */
    public final FacebookRequestError m13064b() {
        return this.f11440f;
    }

    /* renamed from: c */
    public final JSONObject m13065c() {
        return this.f11438d;
    }

    /* renamed from: d */
    public final JSONObject m13066d() {
        return this.f11441g;
    }

    public String toString() {
        String str;
        try {
            h8g h8gVar = h8g.f26398a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f11436b;
            objArr[0] = Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            sq8.m48648g(str, "format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f11438d + ", error: " + this.f11440f + "}";
        sq8.m48648g(str2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10776f(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
        sq8.m48649h(graphRequest, "request");
        sq8.m48649h(str, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10776f(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
        sq8.m48649h(graphRequest, "request");
        sq8.m48649h(str, "rawResponse");
        sq8.m48649h(jSONArray, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10776f(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
        sq8.m48649h(graphRequest, "request");
        sq8.m48649h(facebookRequestError, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    }
}
