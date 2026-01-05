package bz;

import ez.C2149b;
import ez.C2150c;
import ez.C2151d;
import ez.EnumC2148a;
import f00.AbstractC2175d;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.HashMap;
import net.schmizz.sshj.common.AbstractC5037q;
import net.schmizz.sshj.common.EnumC5031k;
import net.schmizz.sshj.common.InterfaceC5028h;
import net.schmizz.sshj.common.SSHRuntimeException;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import tl.C7172a;
import uy.C7573c;
import uy.C7574d;
import uy.C7575e;
import vl.C7718b;
import yy.C8830a;
import zl.C8990a;
import zy.C9104d;
import zy.C9106f;
import zy.C9109i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bz.a */
/* loaded from: classes3.dex */
public final class C0802a implements InterfaceC5028h {

    /* renamed from: a */
    public final /* synthetic */ int f5025a;

    public /* synthetic */ C0802a(int i10) {
        this.f5025a = i10;
    }

    @Override // net.schmizz.sshj.common.InterfaceC5029i
    /* renamed from: c */
    public final Object mo2133c() {
        switch (this.f5025a) {
            case 0:
                C0803b c0803b = new C0803b();
                c0803b.f5026a = new byte[16];
                c0803b.f5027b = new SecureRandom();
                return c0803b;
            case 1:
                return new C2149b();
            case 2:
                return new C2150c();
            case 3:
                C2151d c2151d = new C2151d();
                new HashMap();
                new HashMap();
                return c2151d;
            case 4:
                try {
                    return new C7172a(AbstractC5037q.m9954g(EdDSAParameterSpec.Ed25519), EnumC5031k.ED25519.toString());
                } catch (NoSuchAlgorithmException | NoSuchProviderException e2) {
                    throw new SSHRuntimeException("Ed25519 Signatures not supported", e2);
                }
            case 5:
                return new C7573c("SHA1withDSA", EnumC5031k.DSA.toString());
            case 6:
                return new C7574d("SHA256withECDSA", EnumC5031k.ECDSA256.toString());
            case 7:
                return new C7574d("SHA384withECDSA", EnumC5031k.ECDSA384.toString());
            case 8:
                return new C7574d("SHA512withECDSA", EnumC5031k.ECDSA521.toString());
            case 9:
                return new C7575e("SHA1withRSA", EnumC5031k.RSA_CERT, EnumC5031k.RSA.toString());
            case 10:
                return new C7575e("SHA256withRSA", EnumC5031k.RSA, "rsa-sha2-256");
            case 11:
                return new C7575e("SHA512withRSA", EnumC5031k.RSA, "rsa-sha2-512");
            case 12:
                EnumC5031k enumC5031k = EnumC5031k.RSA;
                return new C7575e("SHA1withRSA", enumC5031k, enumC5031k.toString());
            case 13:
                return new C7718b("ChaCha20", 0, 64, "CHACHA");
            case 14:
                return null;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return null;
            case 16:
                return new C8830a(0);
            case 17:
                return new C8830a(1);
            case 18:
                return new C8830a(2);
            case 19:
                return new C8830a(3);
            case 20:
                C8990a c8990a = new C8990a();
                AbstractC2175d.m5852b(C8990a.class);
                return c8990a;
            case 21:
                return new C9104d();
            case 22:
                return new C9104d();
            case 23:
                return new C9106f(new C8830a(0));
            case 24:
                return new C9106f(new C8830a(1));
            case 25:
                return new C9109i("secp256r1", new C8830a(1));
            case 26:
                return new C9109i("secp384r1", new C8830a(2));
            default:
                return new C9109i("secp521r1", new C8830a(3));
        }
    }

    @Override // net.schmizz.sshj.common.InterfaceC5028h
    public final String getName() {
        switch (this.f5025a) {
            case 0:
                return "default";
            case 1:
                return "OpenSSH";
            case 2:
                return "PKCS8";
            case 3:
                return "PuTTY";
            case 4:
                return EnumC5031k.ED25519.toString();
            case 5:
                return EnumC5031k.DSA.toString();
            case 6:
                return EnumC5031k.ECDSA256.toString();
            case 7:
                return EnumC5031k.ECDSA384.toString();
            case 8:
                return EnumC5031k.ECDSA521.toString();
            case 9:
                return EnumC5031k.RSA_CERT.toString();
            case 10:
                return "rsa-sha2-256";
            case 11:
                return "rsa-sha2-512";
            case 12:
                return EnumC5031k.RSA.toString();
            case 13:
                return "chacha20-poly1305@openssh.com";
            case 14:
                return "ext-info-c";
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return "none";
            case 16:
                return "sha1";
            case 17:
                return "sha256";
            case 18:
                return "sha384";
            case 19:
                return "sha512";
            case 20:
                return EnumC2148a.OpenSSHv1.name();
            case 21:
                return "curve25519-sha256";
            case 22:
                return "curve25519-sha256@libssh.org";
            case 23:
                return "diffie-hellman-group-exchange-sha1";
            case 24:
                return "diffie-hellman-group-exchange-sha256";
            case 25:
                return "ecdh-sha2-nistp256";
            case 26:
                return "ecdh-sha2-nistp384";
            default:
                return "ecdh-sha2-nistp521";
        }
    }

    public String toString() {
        switch (this.f5025a) {
            case 13:
                return "chacha20-poly1305@openssh.com";
            default:
                return super.toString();
        }
    }
}
