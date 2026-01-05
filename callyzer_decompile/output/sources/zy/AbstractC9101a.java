package zy;

import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import g2.f0;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.util.Arrays;
import javax.crypto.spec.DHParameterSpec;
import net.schmizz.sshj.common.AbstractC5032l;
import net.schmizz.sshj.common.AbstractC5037q;
import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.common.C5021a;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5023c;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.SSHRuntimeException;
import net.schmizz.sshj.transport.TransportException;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import uy.AbstractC7571a;
import vy.C7833j;
import yl.C8689b;
import yy.C8830a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zy.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9101a {

    /* renamed from: a */
    public C7833j f43652a;

    /* renamed from: b */
    public final C8830a f43653b;

    /* renamed from: c */
    public byte[] f43654c;

    /* renamed from: d */
    public PublicKey f43655d;

    /* renamed from: e */
    public String f43656e;

    /* renamed from: f */
    public String f43657f;

    /* renamed from: g */
    public byte[] f43658g;

    /* renamed from: h */
    public byte[] f43659h;

    /* renamed from: i */
    public final f0 f43660i;

    /* renamed from: j */
    public final /* synthetic */ int f43661j;

    /* renamed from: k */
    public final InterfaceC2173b f43662k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC9101a(f0 f0Var, C8830a c8830a) {
        this(f0Var, c8830a, (byte) 0);
        this.f43661j = 0;
        this.f43662k = AbstractC2175d.m5852b(getClass());
    }

    /* renamed from: a */
    public final void m16509a(C7833j c7833j, String str, String str2, byte[] bArr, byte[] bArr2) {
        switch (this.f43661j) {
            case 0:
                this.f43652a = c7833j;
                this.f43656e = str;
                this.f43657f = str2;
                this.f43658g = Arrays.copyOf(bArr, bArr.length);
                this.f43659h = Arrays.copyOf(bArr2, bArr2.length);
                C8830a c8830a = this.f43653b;
                c8830a.getClass();
                try {
                    c8830a.f42532b = AbstractC5037q.m9952e(c8830a.f42531a);
                    f0 f0Var = this.f43660i;
                    mo15285b(f0Var);
                    this.f43662k.debug("Sending SSH_MSG_KEXDH_INIT");
                    C5035o c5035o = new C5035o(EnumC5034n.KEXDH_INIT);
                    byte[] bArr3 = (byte[]) f0Var.f11537c;
                    c5035o.m9912g(bArr3.length, bArr3);
                    c7833j.m14819i(c5035o);
                    return;
                } catch (GeneralSecurityException e2) {
                    throw new SSHRuntimeException(e2.getMessage(), e2);
                }
            default:
                this.f43652a = c7833j;
                this.f43656e = str;
                this.f43657f = str2;
                this.f43658g = Arrays.copyOf(bArr, bArr.length);
                this.f43659h = Arrays.copyOf(bArr2, bArr2.length);
                C8830a c8830a2 = this.f43653b;
                c8830a2.getClass();
                try {
                    c8830a2.f42532b = AbstractC5037q.m9952e(c8830a2.f42531a);
                    EnumC5034n enumC5034n = EnumC5034n.KEX_DH_GEX_REQUEST;
                    this.f43662k.mo5849y(enumC5034n, "Sending {}");
                    C5035o c5035o2 = new C5035o(enumC5034n);
                    c5035o2.m9918m(1024L);
                    c5035o2.m9918m(2048L);
                    c5035o2.m9918m(8192L);
                    c7833j.m14819i(c5035o2);
                    return;
                } catch (GeneralSecurityException e10) {
                    throw new SSHRuntimeException(e10.getMessage(), e10);
                }
        }
    }

    /* renamed from: b */
    public abstract void mo15285b(f0 f0Var);

    /* renamed from: c */
    public final C5021a m16510c() {
        C5021a c5021a = new C5021a();
        String str = this.f43657f;
        Charset charset = StandardCharsets.UTF_8;
        c5021a.m9917l(str, charset);
        c5021a.m9917l(this.f43656e, charset);
        byte[] bArr = this.f43659h;
        c5021a.m9912g(bArr.length, bArr);
        byte[] bArr2 = this.f43658g;
        c5021a.m9912g(bArr2.length, bArr2);
        return c5021a;
    }

    /* renamed from: d */
    public final boolean m16511d(EnumC5034n enumC5034n, C5035o c5035o) throws GeneralSecurityException, TransportException {
        String strM9929x;
        String strM9929x2;
        switch (this.f43661j) {
            case 0:
                if (enumC5034n != EnumC5034n.KEXDH_31) {
                    throw new TransportException(EnumC5023c.KEY_EXCHANGE_FAILED, "Unexpected packet: " + enumC5034n, null);
                }
                InterfaceC2173b interfaceC2173b = this.f43662k;
                interfaceC2173b.debug("Received SSH_MSG_KEXDH_REPLY");
                try {
                    byte[] bArrM9925t = c5035o.m9925t();
                    byte[] bArrM9925t2 = c5035o.m9925t();
                    byte[] bArrM9925t3 = c5035o.m9925t();
                    this.f43655d = new C5021a(bArrM9925t, true).m9927v();
                    f0 f0Var = this.f43660i;
                    f0Var.mo6138a(bArrM9925t2);
                    C5021a c5021aM16510c = m16510c();
                    c5021aM16510c.m9912g(bArrM9925t.length, bArrM9925t);
                    byte[] bArr = (byte[]) f0Var.f11537c;
                    c5021aM16510c.m9912g(bArr.length, bArr);
                    c5021aM16510c.m9912g(bArrM9925t2.length, bArrM9925t2);
                    c5021aM16510c.m9913h((BigInteger) f0Var.f11538d);
                    byte[] bArr2 = c5021aM16510c.f24775a;
                    int i10 = c5021aM16510c.f24776b;
                    int iM9907a = c5021aM16510c.m9907a();
                    C8830a c8830a = this.f43653b;
                    c8830a.m16283a(bArr2, i10, iM9907a);
                    this.f43654c = c8830a.f42532b.digest();
                    AbstractC7571a abstractC7571a = (AbstractC7571a) this.f43652a.f37574j.f31453a.mo2133c();
                    PublicKey publicKey = this.f43655d;
                    if (publicKey instanceof C8689b) {
                        abstractC7571a.mo14306b(((C8689b) publicKey).f42050a);
                    } else {
                        abstractC7571a.mo14306b(publicKey);
                    }
                    byte[] bArr3 = this.f43654c;
                    abstractC7571a.m14307c(bArr3.length, bArr3);
                    if (!abstractC7571a.mo13437d(bArrM9925t3)) {
                        throw new TransportException(EnumC5023c.KEY_EXCHANGE_FAILED, "KeyExchange signature verification failed", null);
                    }
                    if (this.f43655d instanceof C8689b) {
                        this.f43652a.f37569d.getClass();
                        C8689b c8689b = (C8689b) this.f43655d;
                        try {
                            strM9929x = new C5021a(c8689b.f42061m, true).m9929x();
                        } catch (Buffer$BufferException unused) {
                            strM9929x = null;
                        }
                        try {
                            strM9929x2 = new C5021a(c8689b.f42060l, true).m9929x();
                        } catch (Buffer$BufferException unused2) {
                            strM9929x2 = null;
                        }
                        interfaceC2173b.mo5839o("Verifying signature of the key with type {} (signature type {}, CA key type {})", Long.valueOf(c8689b.f42053d), strM9929x, strM9929x2);
                        try {
                            String strM9946f = AbstractC5032l.m9946f(bArrM9925t, c8689b, (String) this.f43652a.f37582s.f26304b);
                            if (strM9946f != null) {
                                throw new TransportException(EnumC5023c.KEY_EXCHANGE_FAILED, "KeyExchange certificate check failed: ".concat(strM9946f), null);
                            }
                        } catch (Buffer$BufferException | SSHRuntimeException e2) {
                            throw new TransportException(EnumC5023c.KEY_EXCHANGE_FAILED, "KeyExchange certificate check failed", e2);
                        }
                    }
                    return true;
                } catch (Buffer$BufferException e10) {
                    throw new TransportException(e10);
                }
            default:
                this.f43662k.mo5849y(enumC5034n, "Got message {}");
                try {
                    int i11 = AbstractC9102b.f43663a[enumC5034n.ordinal()];
                    if (i11 == 1) {
                        m16512e(c5035o);
                        return false;
                    }
                    if (i11 == 2) {
                        m16513f(c5035o);
                        return true;
                    }
                    throw new TransportException("Unexpected message " + enumC5034n);
                } catch (Buffer$BufferException e11) {
                    throw new TransportException(e11);
                }
        }
    }

    /* renamed from: e */
    public void m16512e(C5035o c5035o) throws GeneralSecurityException {
        BigInteger bigIntegerM9926u = c5035o.m9926u();
        BigInteger bigIntegerM9926u2 = c5035o.m9926u();
        int iBitLength = bigIntegerM9926u.bitLength();
        if (iBitLength < 1024 || iBitLength > 8192) {
            throw new GeneralSecurityException(AbstractC5601a.m11232c(iBitLength, "Server generated gex p is out of range (", " bits)"));
        }
        Integer numValueOf = Integer.valueOf(iBitLength);
        InterfaceC2173b interfaceC2173b = this.f43662k;
        interfaceC2173b.mo5849y(numValueOf, "Received server p bitlength {}");
        DHParameterSpec dHParameterSpec = new DHParameterSpec(bigIntegerM9926u, bigIntegerM9926u2);
        Object obj = this.f43652a.f37569d.f17610b;
        f0 f0Var = this.f43660i;
        f0Var.mo6139b(dHParameterSpec);
        EnumC5034n enumC5034n = EnumC5034n.KEX_DH_GEX_INIT;
        interfaceC2173b.mo5849y(enumC5034n, "Sending {}");
        C7833j c7833j = this.f43652a;
        C5035o c5035o2 = new C5035o(enumC5034n);
        byte[] bArr = (byte[]) f0Var.f11537c;
        c5035o2.m9912g(bArr.length, bArr);
        c7833j.m14819i(c5035o2);
    }

    /* renamed from: f */
    public void m16513f(C5035o c5035o) throws TransportException, SignatureException, Buffer$BufferException, InvalidKeyException {
        byte[] bArrM9925t = c5035o.m9925t();
        byte[] bArrM9925t2 = c5035o.m9925t();
        byte[] bArrM9925t3 = c5035o.m9925t();
        this.f43655d = new C5021a(bArrM9925t, true).m9927v();
        f0 f0Var = this.f43660i;
        f0Var.mo6138a(bArrM9925t2);
        BigInteger bigInteger = (BigInteger) f0Var.f11538d;
        C5021a c5021aM16510c = m16510c();
        c5021aM16510c.m9912g(bArrM9925t.length, bArrM9925t);
        c5021aM16510c.m9918m(1024L);
        c5021aM16510c.m9918m(2048L);
        c5021aM16510c.m9918m(8192L);
        C9105e c9105e = (C9105e) f0Var;
        c5021aM16510c.m9913h(c9105e.f43667e);
        c5021aM16510c.m9913h(c9105e.f43668f);
        byte[] bArr = (byte[]) f0Var.f11537c;
        c5021aM16510c.m9912g(bArr.length, bArr);
        c5021aM16510c.m9912g(bArrM9925t2.length, bArrM9925t2);
        c5021aM16510c.m9913h(bigInteger);
        byte[] bArr2 = c5021aM16510c.f24775a;
        int i10 = c5021aM16510c.f24776b;
        int iM9907a = c5021aM16510c.m9907a();
        C8830a c8830a = this.f43653b;
        c8830a.m16283a(bArr2, i10, iM9907a);
        this.f43654c = c8830a.f42532b.digest();
        AbstractC7571a abstractC7571a = (AbstractC7571a) this.f43652a.f37574j.f31453a.mo2133c();
        PublicKey publicKey = this.f43655d;
        if (publicKey instanceof C8689b) {
            abstractC7571a.mo14306b(((C8689b) publicKey).f42050a);
        } else {
            abstractC7571a.mo14306b(publicKey);
        }
        byte[] bArr3 = this.f43654c;
        abstractC7571a.m14307c(bArr3.length, bArr3);
        if (!abstractC7571a.mo13437d(bArrM9925t3)) {
            throw new TransportException(EnumC5023c.KEY_EXCHANGE_FAILED, "KeyExchange signature verification failed", null);
        }
    }

    public AbstractC9101a(f0 f0Var, C8830a c8830a, byte b10) {
        this.f43653b = c8830a;
        this.f43660i = f0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC9101a(C8830a c8830a) {
        this(new C9105e(), c8830a, (byte) 0);
        this.f43661j = 1;
        this.f43662k = AbstractC2175d.m5852b(getClass());
    }
}
