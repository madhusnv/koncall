package net.schmizz.sshj.common;

import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: net.schmizz.sshj.common.q */
/* loaded from: classes3.dex */
public abstract class AbstractC5037q {

    /* renamed from: a */
    public static final InterfaceC2173b f24786a = AbstractC2175d.m5852b(AbstractC5037q.class);

    /* renamed from: b */
    public static String f24787b = null;

    /* renamed from: c */
    public static boolean f24788c;

    /* renamed from: a */
    public static synchronized Cipher m9948a(String str) {
        m9955h();
        if (m9953f() == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, m9953f());
    }

    /* renamed from: b */
    public static String m9949b(PublicKey publicKey) {
        try {
            MessageDigest messageDigestM9952e = m9952e("MD5");
            C5021a c5021a = new C5021a();
            EnumC5031k.fromKey(publicKey).putPubKeyIntoBuffer(publicKey, c5021a);
            messageDigestM9952e.update(c5021a.m9910d());
            byte[] bArrDigest = messageDigestM9952e.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                char[] cArr = AbstractC5030j.f24782a;
                sb2.append(cArr[(b10 >> 4) & 15]);
                sb2.append(cArr[b10 & 15]);
            }
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder(string.substring(0, 2));
            int i10 = 2;
            while (i10 <= string.length() - 2) {
                sb3.append(":");
                int i11 = i10 + 2;
                sb3.append(string.substring(i10, i11));
                i10 = i11;
            }
            return sb3.toString();
        } catch (GeneralSecurityException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    /* renamed from: c */
    public static synchronized KeyFactory m9950c(String str) {
        m9955h();
        if (m9953f() == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, m9953f());
    }

    /* renamed from: d */
    public static synchronized Mac m9951d(String str) {
        m9955h();
        if (m9953f() == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, m9953f());
    }

    /* renamed from: e */
    public static synchronized MessageDigest m9952e(String str) {
        m9955h();
        if (m9953f() == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, m9953f());
    }

    /* renamed from: f */
    public static synchronized String m9953f() {
        m9955h();
        return f24787b;
    }

    /* renamed from: g */
    public static synchronized Signature m9954g(String str) {
        m9955h();
        if (m9953f() == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, m9953f());
    }

    /* renamed from: h */
    public static void m9955h() throws NoSuchAlgorithmException {
        if (f24788c) {
            return;
        }
        if (f24787b == null) {
            Provider provider = null;
            try {
                String str = BouncyCastleProvider.PROVIDER_NAME;
                provider = (Provider) BouncyCastleProvider.class.getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException unused) {
                f24786a.mo5825a("org.bouncycastle.jce.provider.BouncyCastleProvider", "Security Provider class '{}' not found");
            } catch (IllegalAccessException unused2) {
                f24786a.mo5825a("org.bouncycastle.jce.provider.BouncyCastleProvider", "Security Provider class '{}' could not be accessed");
            } catch (InstantiationException unused3) {
                f24786a.mo5825a("org.bouncycastle.jce.provider.BouncyCastleProvider", "Security Provider class '{}' could not be created");
            } catch (NoSuchMethodException unused4) {
                f24786a.mo5825a("org.bouncycastle.jce.provider.BouncyCastleProvider", "Security Provider class '{}' does not have a no-args constructor");
            } catch (InvocationTargetException unused5) {
                f24786a.mo5825a("org.bouncycastle.jce.provider.BouncyCastleProvider", "Security Provider class '{}' could not be created");
            }
            if (provider != null) {
                try {
                    if (Security.getProvider(provider.getName()) == null) {
                        Security.addProvider(provider);
                    }
                    if (f24787b == null) {
                        MessageDigest.getInstance("MD5", provider);
                        KeyAgreement.getInstance("DH", provider);
                        String name = provider.getName();
                        synchronized (AbstractC5037q.class) {
                            f24787b = name;
                            f24788c = false;
                        }
                    }
                } catch (NoSuchAlgorithmException e2) {
                    f24786a.mo5840p("Security Provider 'org.bouncycastle.jce.provider.BouncyCastleProvider' does not support necessary algorithm", e2);
                } catch (Exception e10) {
                    f24786a.mo5840p("Registration of Security Provider 'org.bouncycastle.jce.provider.BouncyCastleProvider' unexpectedly failed", e10);
                }
            }
            String str2 = f24787b;
            if (str2 == null) {
                f24786a.info("BouncyCastle not registered, using the default JCE provider");
            } else if (str2 == null) {
                f24786a.error("Failed to register BouncyCastle as the default JCE provider");
                throw new SSHRuntimeException("Failed to register BouncyCastle as the default JCE provider");
            }
        }
        f24788c = true;
    }
}
