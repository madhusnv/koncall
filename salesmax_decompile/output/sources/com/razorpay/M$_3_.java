package com.razorpay;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
final class M$_3_ extends AsyncTask<String, Void, ResponseObject> {

    /* renamed from: a */
    private Callback f13649a;

    /* renamed from: b */
    private String f13650b = null;

    /* renamed from: c */
    private Map<String, String> f13651c = new HashMap();

    /* renamed from: d */
    private String f13652d = null;

    private M$_3_(Callback callback) {
        this.f13649a = callback;
    }

    /* renamed from: a */
    public static AsyncTask m15990a(String str, Callback callback) {
        M$_3_ m$_3_ = new M$_3_(callback);
        m$_3_.f13650b = "GET";
        return m$_3_.execute(str);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(ResponseObject responseObject) {
        ResponseObject responseObject2 = responseObject;
        Callback callback = this.f13649a;
        if (callback != null) {
            callback.run(responseObject2);
        }
    }

    /* renamed from: a */
    public static AsyncTask m15992a(String str, Map<String, String> map, Callback callback) {
        M$_3_ m$_3_ = new M$_3_(callback);
        m$_3_.f13650b = "GET";
        m$_3_.f13651c = map;
        return m$_3_.execute(str);
    }

    /* renamed from: a */
    public static AsyncTask m15991a(String str, String str2, Map<String, String> map, Callback callback) {
        M$_3_ m$_3_ = new M$_3_(callback);
        m$_3_.f13650b = "POST";
        m$_3_.f13652d = str2;
        m$_3_.f13651c = map;
        return m$_3_.execute(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ResponseObject doInBackground(String... strArr) throws IOException {
        ResponseObject responseObject = new ResponseObject();
        InputStream inputStream = null;
        try {
            try {
                try {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(strArr[0]).openConnection()));
                    for (Map.Entry<String, String> entry : this.f13651c.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpsURLConnection.setRequestMethod(this.f13650b);
                    if (this.f13652d != null) {
                        httpsURLConnection.setDoOutput(true);
                        httpsURLConnection.getOutputStream().write(this.f13652d.getBytes(StandardCharsets.UTF_8));
                    }
                    httpsURLConnection.setConnectTimeout(15000);
                    httpsURLConnection.setReadTimeout(20000);
                    httpsURLConnection.connect();
                    int responseCode = httpsURLConnection.getResponseCode();
                    responseObject.setResponseCode(responseCode);
                    if (responseCode >= 400) {
                        inputStream = httpsURLConnection.getErrorStream();
                    } else {
                        inputStream = httpsURLConnection.getInputStream();
                    }
                    responseObject.setHeaders(httpsURLConnection.getHeaderFields());
                    responseObject.setResponseResult(m15994a(inputStream));
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e) {
                            AnalyticsUtil.reportError(M$_3_.class.getName(), "S2", e.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                new StringBuilder("Input Stream: ").append(e2.getLocalizedMessage());
                AnalyticsUtil.reportError(M$_3_.class.getName(), "S2", e2.getMessage());
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Exception e3) {
            AnalyticsUtil.reportError(M$_3_.class.getName(), "S2", e3.getMessage());
        }
        return responseObject;
    }

    /* renamed from: a */
    private static String m15994a(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, HTTP.UTF_8));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }
}
