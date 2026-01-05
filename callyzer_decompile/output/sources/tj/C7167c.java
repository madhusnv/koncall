package tj;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.storage.ObjectMetadata;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.sun.mail.imap.IMAPStore;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import oj.C5391c;
import oj.InterfaceC5393e;
import org.json.JSONException;
import org.json.JSONObject;
import pg.l8;
import qj.InterfaceC6237b;
import sf.AbstractC6840z;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tj.c */
/* loaded from: classes.dex */
public final class C7167c {

    /* renamed from: d */
    public static final Pattern f34423d = Pattern.compile("[0-9]+s");

    /* renamed from: e */
    public static final Charset f34424e = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f34425a;

    /* renamed from: b */
    public final InterfaceC6237b f34426b;

    /* renamed from: c */
    public final C7169e f34427c = new C7169e();

    public C7167c(Context context, InterfaceC6237b interfaceC6237b) {
        this.f34425a = context;
        this.f34426b = interfaceC6237b;
    }

    /* renamed from: a */
    public static URL m13426a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e2) {
            String message = e2.getMessage();
            FirebaseInstallationsException.EnumC1400a enumC1400a = FirebaseInstallationsException.EnumC1400a.BAD_CONFIG;
            throw new FirebaseInstallationsException(message);
        }
    }

    /* renamed from: b */
    public static void m13427b(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f34424e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            return;
        }
        new StringBuilder(", ").append(str);
    }

    /* renamed from: d */
    public static long m13428d(String str) {
        AbstractC6840z.m13030a("Invalid Expiration Timestamp.", f34423d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: e */
    public static C7165a m13429e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f34424e));
        byte b10 = (byte) (0 | 1);
        jsonReader.beginObject();
        long jM13428d = 0;
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        String strNextString4 = null;
        C7166b c7166b = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(IMAPStore.ID_NAME)) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString4 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals(AWSCognitoLegacyCredentialStore.TOKEN_KEY)) {
                        strNextString = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        jM13428d = m13428d(jsonReader.nextString());
                        b10 = (byte) (b10 | 1);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b10 != 1) {
                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                }
                c7166b = new C7166b(strNextString, jM13428d, null);
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C7165a(strNextString2, strNextString3, strNextString4, c7166b, EnumC7168d.OK);
    }

    /* renamed from: f */
    public static C7166b m13430f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f34424e));
        byte b10 = (byte) (0 | 1);
        jsonReader.beginObject();
        String strNextString = null;
        long jM13428d = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(AWSCognitoLegacyCredentialStore.TOKEN_KEY)) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                jM13428d = m13428d(jsonReader.nextString());
                b10 = (byte) (b10 | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        EnumC7170f enumC7170f = EnumC7170f.OK;
        if (b10 == 1) {
            return new C7166b(strNextString, jM13428d, enumC7170f);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    /* renamed from: g */
    public static void m13431g(HttpURLConnection httpURLConnection, String str, String str2) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.0.0");
            m13433i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: h */
    public static void m13432h(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            m13433i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: i */
    public static void m13433i(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public final HttpURLConnection m13434c(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty(ObjectMetadata.CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty(ObjectMetadata.CONTENT_ENCODING, "gzip");
            httpURLConnection.addRequestProperty(ObjectMetadata.CACHE_CONTROL, "no-cache");
            Context context = this.f34425a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            InterfaceC5393e interfaceC5393e = (InterfaceC5393e) this.f34426b.get();
            if (interfaceC5393e != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) l8.m11760a(((C5391c) interfaceC5393e).m11107a()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            String strM16424a = null;
            try {
                byte[] bArrM16427d = AbstractC8947b.m16427d(context, context.getPackageName());
                if (bArrM16427d == null) {
                    context.getPackageName();
                } else {
                    strM16424a = AbstractC8947b.m16424a(bArrM16427d);
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                context.getPackageName();
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strM16424a);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused4) {
            FirebaseInstallationsException.EnumC1400a enumC1400a = FirebaseInstallationsException.EnumC1400a.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
