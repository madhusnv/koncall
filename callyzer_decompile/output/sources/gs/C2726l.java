package gs;

import a2.AbstractC0030c;
import android.content.Context;
import android.widget.Toast;
import b2.y0;
import bz.C0802a;
import com.websoptimization.callyzerbiz.R;
import cz.C1539a;
import ds.C1790n;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import fs.C2371b;
import fz.C2405b;
import io.C3328c;
import io.C3330e;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import k2.h2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4164v;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.EnumC5031k;
import net.schmizz.sshj.common.InterfaceC5028h;
import nx.AbstractC5178p;
import ny.C5189c;
import og.od;
import og.q1;
import org.bouncycastle.asn1.BERTags;
import oy.C5777a;
import p3.InterfaceC5822t;
import py.C6046b;
import qt.EnumC6307b;
import qw.C6364n;
import qw.a0;
import rl.C6568b;
import rt.C6618b;
import st.AbstractC6941d;
import tx.InterfaceC7266z;
import tx.b0;
import tx.c0;
import ty.C7274h;
import ty.C7275i;
import ty.C7277k;
import ty.C7278l;
import ty.C7279m;
import ty.EnumC7270d;
import ty.EnumC7272f;
import u7.C7351a;
import uw.InterfaceC7559c;
import vl.C7717a;
import vl.C7721e;
import vl.C7723g;
import vw.EnumC7794a;
import vy.C7829f;
import wl.C8104b;
import ww.AbstractC8199i;
import wx.m1;
import wy.EnumC8227b;
import wy.InterfaceC8228c;
import x1.d1;
import x1.h0;
import xl.C8392a;
import yv.C8801p;
import yv.C8805t;
import zj.C8986c;
import zy.AbstractC9107g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gs.l */
/* loaded from: classes3.dex */
public final class C2726l extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15204a;

    /* renamed from: b */
    public /* synthetic */ Object f15205b;

    /* renamed from: c */
    public final /* synthetic */ Object f15206c;

    /* renamed from: d */
    public final /* synthetic */ Object f15207d;

    /* renamed from: e */
    public final /* synthetic */ Object f15208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2726l(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15204a = i10;
        this.f15205b = obj;
        this.f15206c = obj2;
        this.f15207d = obj3;
        this.f15208e = obj4;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15204a) {
            case 0:
                C2726l c2726l = new C2726l((C2728n) this.f15206c, (C4164v) this.f15207d, (C1790n) this.f15208e, interfaceC7559c, 0);
                c2726l.f15205b = obj;
                return c2726l;
            case 1:
                return new C2726l((String) this.f15205b, (File) this.f15206c, (C3330e) this.f15207d, (InterfaceC2139c) this.f15208e, interfaceC7559c, 1);
            case 2:
                C2726l c2726l2 = new C2726l((InterfaceC2139c) this.f15206c, (h2) this.f15207d, (Context) this.f15208e, interfaceC7559c, 2);
                c2726l2.f15205b = obj;
                return c2726l2;
            case 3:
                C2726l c2726l3 = new C2726l((InterfaceC5822t) this.f15206c, (d1) this.f15207d, (y0) this.f15208e, interfaceC7559c, 3);
                c2726l3.f15205b = obj;
                return c2726l3;
            default:
                return new C2726l((C8805t) this.f15205b, (String) this.f15206c, (String) this.f15207d, (Throwable) this.f15208e, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f15204a) {
            case 0:
                C2726l c2726l = (C2726l) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c2726l.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                return ((C2726l) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 2:
                C2726l c2726l2 = (C2726l) create((EnumC6307b) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c2726l2.invokeSuspend(a0Var2);
                return a0Var2;
            case 3:
                C2726l c2726l3 = (C2726l) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c2726l3.invokeSuspend(a0Var3);
                return a0Var3;
            default:
                C2726l c2726l4 = (C2726l) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var4 = a0.f30746a;
                c2726l4.invokeSuspend(a0Var4);
                return a0Var4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5, types: [py.b] */
    /* JADX WARN: Type inference failed for: r17v7 */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        String str;
        Object objM10796a;
        int i10 = 18;
        int i11 = 2;
        int i12 = 1;
        int i13 = 0;
        switch (this.f15204a) {
            case 0:
                C4164v c4164v = (C4164v) this.f15207d;
                C8801p c8801p = (C8801p) this.f15205b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2728n c2728n = (C2728n) this.f15206c;
                m1 m1Var = c2728n.f15224m;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C2371b.m6058a((C2371b) value, false, null, null, null, null, null, ((C8801p) c2728n.f15216e.f39340a.getValue()).f42464a, false, null, null, 3967)));
                boolean z6 = c4164v.f21160a;
                if (z6 && !c8801p.f42464a) {
                    do {
                        value2 = m1Var.getValue();
                    } while (!m1Var.m15397i(value2, C2371b.m6058a((C2371b) value2, false, null, null, null, null, c2728n.f15223l.getString(R.string.no_internet_connection), false, false, null, null, 4031)));
                } else if (c8801p.f42464a && (z6 || ((C2371b) c2728n.f15225n.f39340a.getValue()).f10793g != null)) {
                    ((C1790n) this.f15208e).invoke();
                    c4164v.f21160a = false;
                }
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C3328c c3328c = new C3328c();
                c3328c.f17616h = C5033m.f24784a;
                c3328c.f17617i = AbstractC2175d.m5852b(C3328c.class);
                try {
                    Properties properties = new Properties();
                    properties.load(C3328c.class.getClassLoader().getResourceAsStream("sshj.properties"));
                    str = "SSHJ_" + properties.getProperty("sshj.version").replace('-', '_');
                } catch (Exception unused) {
                    ((InterfaceC2173b) c3328c.f17617i).error("Could not read the sshj.properties file, returning an 'unknown' version as fallback.");
                    str = "SSHJ_VERSION_UNKNOWN";
                }
                c3328c.f17609a = str;
                C0802a c0802a = new C0802a(21);
                C0802a c0802a2 = new C0802a(22);
                C0802a c0802a3 = new C0802a(24);
                C0802a c0802a4 = new C0802a(27);
                C0802a c0802a5 = new C0802a(26);
                C0802a c0802a6 = new C0802a(25);
                C0802a c0802a7 = new C0802a(23);
                BigInteger bigInteger = AbstractC9107g.f43670b;
                BigInteger bigInteger2 = AbstractC9107g.f43669a;
                C8104b c8104b = new C8104b("diffie-hellman-group1-sha1", bigInteger, bigInteger2, new C0802a(16));
                BigInteger bigInteger3 = AbstractC9107g.f43671c;
                C8104b c8104b2 = new C8104b("diffie-hellman-group14-sha1", bigInteger3, bigInteger2, new C0802a(16));
                C8104b c8104b3 = new C8104b("diffie-hellman-group14-sha256", bigInteger3, bigInteger2, new C0802a(17));
                BigInteger bigInteger4 = AbstractC9107g.f43672d;
                C8104b c8104b4 = new C8104b("diffie-hellman-group15-sha512", bigInteger4, bigInteger2, new C0802a(19));
                BigInteger bigInteger5 = AbstractC9107g.f43673e;
                C8104b c8104b5 = new C8104b("diffie-hellman-group16-sha512", bigInteger5, bigInteger2, new C0802a(19));
                C8104b c8104b6 = new C8104b("diffie-hellman-group17-sha512", AbstractC9107g.f43674f, bigInteger2, new C0802a(19));
                BigInteger bigInteger6 = AbstractC9107g.f43675g;
                Arrays.asList(c0802a, c0802a2, c0802a3, c0802a4, c0802a5, c0802a6, c0802a7, c8104b, c8104b2, c8104b3, c8104b4, c8104b5, c8104b6, new C8104b("diffie-hellman-group18-sha512", bigInteger6, bigInteger2, new C0802a(19)), new C8104b("diffie-hellman-group14-sha256@ssh.com", bigInteger3, bigInteger2, new C0802a(17)), new C8104b("diffie-hellman-group15-sha256", bigInteger4, bigInteger2, new C0802a(17)), new C8104b("diffie-hellman-group15-sha256@ssh.com", bigInteger4, bigInteger2, new C0802a(17)), new C8104b("diffie-hellman-group15-sha384@ssh.com", bigInteger4, bigInteger2, new C0802a(18)), new C8104b("diffie-hellman-group16-sha256", bigInteger5, bigInteger2, new C0802a(17)), new C8104b("diffie-hellman-group16-sha384@ssh.com", bigInteger5, bigInteger2, new C0802a(18)), new C8104b("diffie-hellman-group16-sha512@ssh.com", bigInteger5, bigInteger2, new C0802a(19)), new C8104b("diffie-hellman-group18-sha512@ssh.com", bigInteger6, bigInteger2, new C0802a(19)), new C0802a(14));
                EnumC5031k enumC5031k = EnumC5031k.ED25519_CERT;
                C6568b c6568b = new C6568b(enumC5031k.toString(), new C0802a(4), enumC5031k);
                EnumC5031k enumC5031k2 = EnumC5031k.ED25519;
                C6568b c6568b2 = new C6568b(enumC5031k2.toString(), new C0802a(4), enumC5031k2);
                EnumC5031k enumC5031k3 = EnumC5031k.ECDSA521_CERT;
                C6568b c6568b3 = new C6568b(enumC5031k3.toString(), new C0802a(8), enumC5031k3);
                EnumC5031k enumC5031k4 = EnumC5031k.ECDSA521;
                C6568b c6568b4 = new C6568b(enumC5031k4.toString(), new C0802a(8), enumC5031k4);
                EnumC5031k enumC5031k5 = EnumC5031k.ECDSA384_CERT;
                C6568b c6568b5 = new C6568b(enumC5031k5.toString(), new C0802a(7), enumC5031k5);
                EnumC5031k enumC5031k6 = EnumC5031k.ECDSA384;
                C6568b c6568b6 = new C6568b(enumC5031k6.toString(), new C0802a(7), enumC5031k6);
                EnumC5031k enumC5031k7 = EnumC5031k.ECDSA256_CERT;
                C6568b c6568b7 = new C6568b(enumC5031k7.toString(), new C0802a(6), enumC5031k7);
                EnumC5031k enumC5031k8 = EnumC5031k.ECDSA256;
                C6568b c6568b8 = new C6568b(enumC5031k8.toString(), new C0802a(6), enumC5031k8);
                C0802a c0802a8 = new C0802a(11);
                EnumC5031k enumC5031k9 = EnumC5031k.RSA;
                C6568b c6568b9 = new C6568b("rsa-sha2-512", c0802a8, enumC5031k9);
                C6568b c6568b10 = new C6568b("rsa-sha2-256", new C0802a(10), enumC5031k9);
                C6568b c6568b11 = new C6568b("ssh-rsa-cert-v01@openssh.com", new C0802a(9), EnumC5031k.RSA_CERT);
                EnumC5031k enumC5031k10 = EnumC5031k.DSA_CERT;
                C6568b c6568b12 = new C6568b(enumC5031k10.toString(), new C0802a(5), enumC5031k10);
                C6568b c6568b13 = new C6568b("ssh-rsa", new C0802a(12), enumC5031k9);
                EnumC5031k enumC5031k11 = EnumC5031k.DSA;
                c3328c.f17615g = Arrays.asList(c6568b, c6568b2, c6568b3, c6568b4, c6568b5, c6568b6, c6568b7, c6568b8, c6568b9, c6568b10, c6568b11, c6568b12, c6568b13, new C6568b(enumC5031k11.toString(), new C0802a(5), enumC5031k11));
                c3328c.f17610b = new C8986c(new C0802a(i13));
                Arrays.asList(new C0802a(20), new C0802a(i11), new C0802a(i12), new C0802a(3));
                LinkedList linkedList = new LinkedList(Arrays.asList(new C0802a(13), new C7717a(16, 128, "aes128-cbc", "AES", "CBC"), new C7717a(16, 128, "aes128-ctr", "AES", "CTR"), new C7717a(16, BERTags.PRIVATE, "aes192-cbc", "AES", "CBC"), new C7717a(16, BERTags.PRIVATE, "aes192-ctr", "AES", "CTR"), new C7717a(16, 256, "aes256-cbc", "AES", "CBC"), new C7717a(16, 256, "aes256-ctr", "AES", "CTR"), new C7721e(128, "aes128-gcm@openssh.com"), new C7721e(256, "aes256-gcm@openssh.com"), new C7717a(8, 128, "blowfish-cbc", "Blowfish", "CBC"), new C7717a(8, 256, "blowfish-ctr", "Blowfish", "CTR"), new C7717a(8, 128, "cast128-cbc", "CAST5", "CBC"), new C7717a(8, 128, "cast128-ctr", "CAST5", "CTR"), new C7717a(8, 128, "idea-cbc", "IDEA", "CBC"), new C7717a(8, 128, "idea-ctr", "IDEA", "CTR"), new C7717a(16, 128, "serpent128-cbc", "Serpent", "CBC"), new C7717a(16, 128, "serpent128-ctr", "Serpent", "CTR"), new C7717a(16, BERTags.PRIVATE, "serpent192-cbc", "Serpent", "CBC"), new C7717a(16, BERTags.PRIVATE, "serpent192-ctr", "Serpent", "CTR"), new C7717a(16, 256, "serpent256-cbc", "Serpent", "CBC"), new C7717a(16, 256, "serpent256-ctr", "Serpent", "CTR"), new C7717a(8, BERTags.PRIVATE, "3des-cbc", "DESede", "CBC"), new C7717a(8, BERTags.PRIVATE, "3des-ctr", "DESede", "CTR"), new C7717a(16, 128, "twofish128-cbc", "Twofish", "CBC"), new C7717a(16, 128, "twofish128-ctr", "Twofish", "CTR"), new C7717a(16, BERTags.PRIVATE, "twofish192-cbc", "Twofish", "CBC"), new C7717a(16, BERTags.PRIVATE, "twofish192-ctr", "Twofish", "CTR"), new C7717a(16, 256, "twofish256-cbc", "Twofish", "CBC"), new C7717a(16, 256, "twofish256-ctr", "Twofish", "CTR"), new C7717a(16, 256, "twofish-cbc", "Twofish", "CBC"), new C7723g(128, "arcfour", "ARCFOUR"), new C7723g(128, "arcfour128", "RC4"), new C7723g(256, "arcfour256", "RC4")));
                ListIterator listIterator = linkedList.listIterator();
                while (listIterator.hasNext()) {
                    InterfaceC5028h interfaceC5028h = (InterfaceC5028h) listIterator.next();
                    try {
                        InterfaceC8228c interfaceC8228c = (InterfaceC8228c) interfaceC5028h.mo2133c();
                        interfaceC8228c.mo15400a(EnumC8227b.Encrypt, new byte[interfaceC8228c.getBlockSize()], new byte[interfaceC8228c.mo15402f()]);
                    } catch (Exception e2) {
                        ((InterfaceC2173b) c3328c.f17617i).mo5848x("Cipher [{}] disabled: {}", interfaceC5028h.getName(), e2.getCause().getMessage());
                        listIterator.remove();
                    }
                }
                c3328c.f17612d = linkedList;
                ((InterfaceC2173b) c3328c.f17617i).mo5849y(linkedList, "Available Ciphers {}");
                c3328c.f17613e = Arrays.asList(new C0802a(15));
                ?? r17 = 2;
                r17 = 2;
                r17 = 2;
                r17 = 2;
                c3328c.f17614f = Arrays.asList(new C8392a("hmac-sha1", "HmacSHA1", 20, 20, false), new C8392a("hmac-sha1-etm@openssh.com", "HmacSHA1", 20, 20, true), new C8392a("hmac-sha1-96", "HmacSHA1", 12, 20, false), new C8392a("hmac-sha1-96@openssh.com", "HmacSHA1", 12, 20, true), new C8392a("hmac-md5", "HmacMD5", 16, 16, false), new C8392a("hmac-md5-etm@openssh.com", "HmacMD5", 16, 16, true), new C8392a("hmac-md5-96", "HmacMD5", 12, 16, false), new C8392a("hmac-md5-96-etm@openssh.com", "HmacMD5", 12, 16, true), new C8392a("hmac-sha2-256", "HmacSHA256", 32, 32, false), new C8392a("hmac-sha2-256-etm@openssh.com", "HmacSHA256", 32, 32, true), new C8392a("hmac-sha2-512", "HmacSHA512", 64, 64, false), new C8392a("hmac-sha2-512-etm@openssh.com", "HmacSHA512", 64, 64, true), new C8392a("hmac-ripemd160", "HMACRIPEMD160", 20, 20, false), new C8392a("hmac-ripemd160-etm@openssh.com", "HMACRIPEMD160", 20, 20, true), new C8392a("hmac-ripemd160-96", "HMACRIPEMD160", 12, 20, false), new C8392a("hmac-ripemd160@openssh.com", "HMACRIPEMD160", 20, 20, false));
                c3328c.f17611c = C5777a.f28342a;
                C6046b c6046b = new C6046b(c3328c);
                try {
                    C1539a c1539a = new C1539a();
                    C7829f c7829f = c6046b.f29517j.f37570e;
                    synchronized (c7829f) {
                        try {
                            try {
                                c7829f.f37550c.add(c1539a);
                            } catch (Exception e10) {
                                e = e10;
                                ((C3330e) this.f15207d).f17624b.m16233h("SFTP", AbstractC0030c.m121l("path :", (String) this.f15205b, " \n Upload failed: ", e.getMessage()), e);
                                try {
                                    r17.m12056u();
                                } catch (Exception unused2) {
                                }
                                objM10796a = od.m10796a(e);
                                return new C6364n(objM10796a);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    }
                    SocketFactory socketFactory = c6046b.f29512d;
                    c6046b.f29513e = "172.236.172.133";
                    c6046b.f29514f = 22;
                    Socket socketCreateSocket = socketFactory.createSocket();
                    c6046b.f29509a = socketCreateSocket;
                    if (!socketCreateSocket.isConnected()) {
                        c6046b.f29509a.connect(new InetSocketAddress("172.236.172.133", 22), 0);
                    }
                    c6046b.m12057w();
                    char[] charArray = "wxglm8I?329".toCharArray();
                    try {
                        c6046b.m12053h(new C2405b(charArray));
                        if (charArray != null) {
                            Arrays.fill(charArray, ' ');
                        }
                        c6046b.m12055n();
                    } catch (Throwable th4) {
                        if (charArray != null) {
                            Arrays.fill(charArray, ' ');
                        }
                        throw th4;
                    }
                } catch (Exception e11) {
                    e = e11;
                    r17 = c6046b;
                    ((C3330e) this.f15207d).f17624b.m16233h("SFTP", AbstractC0030c.m121l("path :", (String) this.f15205b, " \n Upload failed: ", e.getMessage()), e);
                    r17.m12056u();
                    objM10796a = od.m10796a(e);
                    return new C6364n(objM10796a);
                }
                if (!c6046b.f29517j.f37578n) {
                    throw new IllegalStateException("Not authenticated");
                }
                C7278l c7278l = new C7278l(c6046b);
                String strSubstring = (String) this.f15205b;
                AbstractC4154l.m8923f(strSubstring, "<this>");
                int iM10104O = AbstractC5178p.m10104O(strSubstring, "/", 0, 6);
                int i14 = -1;
                if (iM10104O != -1) {
                    strSubstring = strSubstring.substring(0, iM10104O);
                    AbstractC4154l.m8922e(strSubstring, "substring(...)");
                }
                try {
                    c7278l.f34733b.m13601u(strSubstring);
                } catch (Exception unused3) {
                    c7278l.m13596h(strSubstring);
                }
                C7274h c7274hM13597j = c7278l.m13597j((String) this.f15205b, EnumSet.of(EnumC7270d.WRITE, EnumC7270d.CREAT, EnumC7270d.TRUNC));
                FileInputStream fileInputStream = new FileInputStream((File) this.f15206c);
                File file = (File) this.f15206c;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f15208e;
                try {
                    byte[] bArr = new byte[8192];
                    long length = file.length();
                    long j6 = 0;
                    long j10 = 0;
                    while (true) {
                        int i15 = fileInputStream.read(bArr);
                        if (i15 == i14) {
                            C7278l c7278l2 = c7278l;
                            C6046b c6046b2 = c6046b;
                            C7274h c7274h = c7274hM13597j;
                            fileInputStream.close();
                            c7274h.close();
                            c7278l2.close();
                            c6046b2.m12056u();
                            objM10796a = "Uploaded to " + ((String) this.f15205b);
                            return new C6364n(objM10796a);
                        }
                        C7279m c7279m = (C7279m) c7274hM13597j.f34725d;
                        C7275i c7275iM13599j = c7279m.m13599j(EnumC7272f.WRITE);
                        C7278l c7278l3 = c7278l;
                        byte[] bArr2 = c7274hM13597j.f34723b;
                        r17 = c6046b;
                        try {
                            c7275iM13599j.m9912g(bArr2.length, bArr2);
                            c7275iM13599j.m9920o(j6);
                            c7275iM13599j.m9912g(i15, bArr);
                            C5189c c5189cM13600n = c7279m.m13600n(c7275iM13599j);
                            ((C7279m) c7274hM13597j.f34725d).getClass();
                            C7274h c7274h2 = c7274hM13597j;
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            ((C7277k) c5189cM13600n.m10149d(30000)).m13594D();
                            long j11 = i15;
                            j6 += j11;
                            j10 += j11;
                            interfaceC2139c.invoke(new Integer((int) ((100 * j10) / length)));
                            c7274hM13597j = c7274h2;
                            c7278l = c7278l3;
                            c6046b = r17;
                            i14 = -1;
                        } catch (Throwable th5) {
                            th = th5;
                            Throwable th6 = th;
                            try {
                                throw th6;
                            } catch (Throwable th7) {
                                q1.m10844a(fileInputStream, th6);
                                throw th7;
                            }
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    r17 = c6046b;
                }
            case 2:
                EnumC6307b enumC6307b = (EnumC6307b) this.f15205b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                int i16 = AbstractC6941d.f33576a[enumC6307b.ordinal()];
                if (i16 == 1) {
                    ((InterfaceC2139c) this.f15206c).invoke("message_sub_templates?messageTemplateId=".concat(((C6618b) ((h2) this.f15207d).getValue()).f31796n));
                } else {
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Toast.makeText((Context) this.f15208e, R.string.subscription_expired_dot, 0).show();
                }
                return a0.f30746a;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f15205b;
                b0 b0Var = b0.UNDISPATCHED;
                InterfaceC5822t interfaceC5822t = (InterfaceC5822t) this.f15206c;
                InterfaceC7559c interfaceC7559c = null;
                c0.m13502y(interfaceC7266z, null, b0Var, new h0(interfaceC5822t, (d1) this.f15207d, interfaceC7559c, i13), 1);
                c0.m13502y(interfaceC7266z, null, b0Var, new C7351a(interfaceC5822t, (y0) this.f15208e, interfaceC7559c, i10), 1);
                return a0.f30746a;
            default:
                C8805t c8805t = (C8805t) this.f15205b;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                try {
                    c8805t.m16232g((String) this.f15206c, (String) this.f15207d);
                    c8805t.m16235j((Throwable) this.f15208e);
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                return a0.f30746a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2726l(Object obj, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15204a = i10;
        this.f15206c = obj;
        this.f15207d = obj2;
        this.f15208e = obj3;
    }
}
