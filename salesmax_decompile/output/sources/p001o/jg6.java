package p001o;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes4.dex */
public interface jg6 {

    /* renamed from: o.jg6$a */
    public static class C14528a implements jg6 {
        @Override // p001o.jg6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Cipher mo33789a(String str, Provider provider) {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* renamed from: o.jg6$b */
    public static class C14529b implements jg6 {
        @Override // p001o.jg6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyAgreement mo33789a(String str, Provider provider) {
            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    /* renamed from: o.jg6$c */
    public static class C14530c implements jg6 {
        @Override // p001o.jg6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyFactory mo33789a(String str, Provider provider) {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    /* renamed from: o.jg6$d */
    public static class C14531d implements jg6 {
        @Override // p001o.jg6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyPairGenerator mo33789a(String str, Provider provider) {
            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* renamed from: o.jg6$e */
    public static class C14532e implements jg6 {
        @Override // p001o.jg6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Mac mo33789a(String str, Provider provider) {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    /* renamed from: o.jg6$f */
    public static class C14533f implements jg6 {
        @Override // p001o.jg6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageDigest mo33789a(String str, Provider provider) {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    /* renamed from: o.jg6$g */
    public static class C14534g implements jg6 {
        @Override // p001o.jg6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Signature mo33789a(String str, Provider provider) {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    /* renamed from: a */
    Object mo33789a(String str, Provider provider);
}
