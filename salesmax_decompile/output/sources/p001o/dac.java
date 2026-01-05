package p001o;

import android.util.Base64;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class dac {

    /* renamed from: a */
    public static final dac f19493a = new dac();

    /* renamed from: b */
    public static final String f19494b = "/.well-known/oauth/openid/keys/";

    /* renamed from: b */
    public static final PublicKey m22704b(String str) throws InvalidKeySpecException {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        byte[] bArrDecode = Base64.decode(e9g.m24593G(e9g.m24593G(e9g.m24593G(str, "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0);
        sq8.m48648g(bArrDecode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        sq8.m48648g(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    /* renamed from: c */
    public static final String m22705c(final String str) {
        sq8.m48649h(str, "kid");
        final URL url = new URL("https", "www." + C10773c.m13029v(), f19494b);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final gge ggeVar = new gge();
        C10773c.m13028u().execute(new Runnable() { // from class: o.cac
            @Override // java.lang.Runnable
            public final void run() {
                dac.m22706d(url, ggeVar, str, reentrantLock, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        try {
            conditionNewCondition.await(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) ggeVar.f25106a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public static final void m22706d(URL url, gge ggeVar, String str, ReentrantLock reentrantLock, Condition condition) {
        sq8.m48649h(url, "$openIdKeyUrl");
        sq8.m48649h(ggeVar, "$result");
        sq8.m48649h(str, "$kid");
        sq8.m48649h(reentrantLock, "$lock");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        sq8.m48647f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                sq8.m48648g(inputStream, "connection.inputStream");
                Reader inputStreamReader = new InputStreamReader(inputStream, sh2.f45422b);
                String strM51644d = uih.m51644d(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                httpURLConnection.getInputStream().close();
                ggeVar.f25106a = new JSONObject(strM51644d).optString(str);
                httpURLConnection.disconnect();
                reentrantLock.lock();
            } catch (Exception e) {
                f19493a.getClass();
                e.getMessage();
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    y3i y3iVar = y3i.f54824a;
                } finally {
                }
            }
            try {
                condition.signal();
                y3i y3iVar2 = y3i.f54824a;
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            reentrantLock.lock();
            try {
                condition.signal();
                y3i y3iVar3 = y3i.f54824a;
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: e */
    public static final boolean m22707e(PublicKey publicKey, String str, String str2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sq8.m48649h(publicKey, "publicKey");
        sq8.m48649h(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        sq8.m48649h(str2, "signature");
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(sh2.f45422b);
            sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            byte[] bArrDecode = Base64.decode(str2, 8);
            sq8.m48648g(bArrDecode, "decode(signature, Base64.URL_SAFE)");
            return signature.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }
}
