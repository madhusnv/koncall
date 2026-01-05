package p001o;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* loaded from: classes4.dex */
public final class se0 implements ge9 {

    /* renamed from: a */
    public final String f45304a;

    /* renamed from: b */
    public KeyStore f45305b;

    /* renamed from: o.se0$b */
    public static final class C16816b {

        /* renamed from: a */
        public String f45306a = null;

        /* renamed from: b */
        public KeyStore f45307b;

        public C16816b() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            this.f45307b = null;
            if (!se0.m48268f()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f45307b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }

        /* renamed from: a */
        public se0 m48271a() {
            return new se0(this);
        }

        /* renamed from: b */
        public C16816b m48272b(KeyStore keyStore) {
            if (keyStore == null) {
                throw new IllegalArgumentException("val cannot be null");
            }
            this.f45307b = keyStore;
            return this;
        }
    }

    /* renamed from: d */
    public static void m48267d(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (new se0().m48270e(str)) {
            throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
        }
        String strM48828b = sri.m48828b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strM48828b, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* renamed from: f */
    public static boolean m48268f() {
        return true;
    }

    /* renamed from: g */
    public static p70 m48269g(p70 p70Var) throws KeyStoreException {
        byte[] bArrM51350c = ube.m51350c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrM51350c, p70Var.mo24515b(p70Var.mo24514a(bArrM51350c, bArr), bArr))) {
            return p70Var;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    @Override // p001o.ge9
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean mo28511a(String str) {
        boolean z;
        String str2 = this.f45304a;
        if (str2 != null && str2.equals(str)) {
            return true;
        }
        if (this.f45304a == null) {
            z = str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return z;
    }

    @Override // p001o.ge9
    /* renamed from: b */
    public synchronized p70 mo28512b(String str) {
        String str2 = this.f45304a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f45304a, str));
        }
        return m48269g(new re0(sri.m48828b("android-keystore://", str), this.f45305b));
    }

    /* renamed from: e */
    public synchronized boolean m48270e(String str) {
        String strM48828b;
        strM48828b = sri.m48828b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f45305b = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.f45305b.containsAlias(strM48828b);
        }
        return this.f45305b.containsAlias(strM48828b);
    }

    public se0() {
        this(new C16816b());
    }

    public se0(C16816b c16816b) {
        this.f45304a = c16816b.f45306a;
        this.f45305b = c16816b.f45307b;
    }
}
