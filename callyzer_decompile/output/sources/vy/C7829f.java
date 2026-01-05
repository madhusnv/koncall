package vy;

import az.C0505a;
import cz.C1539a;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import io.C3328c;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import lv.C4535g;
import net.schmizz.sshj.common.AbstractC5030j;
import net.schmizz.sshj.common.AbstractC5037q;
import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.common.C5021a;
import net.schmizz.sshj.common.C5033m;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5023c;
import net.schmizz.sshj.common.EnumC5031k;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.common.InterfaceC5027g;
import net.schmizz.sshj.common.InterfaceC5036p;
import net.schmizz.sshj.common.SSHException;
import net.schmizz.sshj.transport.TransportException;
import ny.C5187a;
import of.C5359n;
import rl.C6567a;
import ug.C7452w;
import wy.EnumC8227b;
import wy.InterfaceC8228c;
import yy.C8830a;
import zj.C8986c;
import zy.AbstractC9101a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vy.f */
/* loaded from: classes3.dex */
public final class C7829f implements InterfaceC5036p, InterfaceC5027g {

    /* renamed from: a */
    public final InterfaceC2173b f37548a;

    /* renamed from: b */
    public final C7833j f37549b;

    /* renamed from: c */
    public final LinkedList f37550c = new LinkedList();

    /* renamed from: d */
    public final LinkedList f37551d = new LinkedList();

    /* renamed from: e */
    public final AtomicBoolean f37552e = new AtomicBoolean();

    /* renamed from: f */
    public final AtomicBoolean f37553f = new AtomicBoolean(true);

    /* renamed from: g */
    public final AtomicBoolean f37554g = new AtomicBoolean();

    /* renamed from: h */
    public EnumC7828e f37555h = EnumC7828e.KEXINIT;

    /* renamed from: j */
    public AbstractC9101a f37556j;

    /* renamed from: k */
    public byte[] f37557k;

    /* renamed from: l */
    public C3328c f37558l;

    /* renamed from: m */
    public C4535g f37559m;

    /* renamed from: n */
    public final C5187a f37560n;

    /* renamed from: p */
    public final C5187a f37561p;

    public C7829f(C7833j c7833j) {
        this.f37549b = c7833j;
        C3328c c3328c = c7833j.f37569d;
        ((C5033m) c3328c.f17616h).getClass();
        this.f37548a = AbstractC2175d.m5852b(C7829f.class);
        C7452w c7452w = TransportException.f24794c;
        this.f37560n = new C5187a("kexinit sent", c7452w, (C5033m) c3328c.f17616h);
        this.f37561p = new C5187a("kex done", c7452w, c7833j.f37585w, (C5033m) c3328c.f17616h);
    }

    /* renamed from: b */
    public static byte[] m14807b(byte[] bArr, int i10, C8830a c8830a, BigInteger bigInteger, byte[] bArr2) {
        while (i10 > bArr.length) {
            C5021a c5021a = new C5021a();
            c5021a.m9913h(bigInteger);
            c5021a.m9914i(0, bArr2.length, bArr2);
            c5021a.m9914i(0, bArr.length, bArr);
            c8830a.m16283a(c5021a.f24775a, 0, c5021a.m9907a());
            byte[] bArrDigest = c8830a.f42532b.digest();
            byte[] bArr3 = new byte[bArr.length + bArrDigest.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArrDigest, 0, bArr3, bArr.length, bArrDigest.length);
            bArr = bArr3;
        }
        return bArr;
    }

    /* renamed from: a */
    public final synchronized void m14808a() {
        if (!this.f37552e.get()) {
            throw new TransportException(EnumC5023c.PROTOCOL_ERROR, "Key exchange packet received when key exchange was not ongoing", null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m14809c(boolean z6) {
        if (!this.f37552e.getAndSet(true)) {
            if (!this.f37561p.m10143b() || this.f37549b.f37578n) {
                this.f37548a.debug("Initiating key exchange");
                this.f37561p.f25289a.m10146a();
                List list = Collections.EMPTY_LIST;
                this.f37548a.debug("Sending SSH_MSG_KEXINIT");
                C7833j c7833j = this.f37549b;
                Object obj = c7833j.f37582s.f26304b;
                Iterator it = this.f37550c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        List list2 = Collections.EMPTY_LIST;
                        break;
                    }
                    ((C1539a) it.next()).getClass();
                    List list3 = Collections.EMPTY_LIST;
                    if (list3 != null && !list3.isEmpty()) {
                        break;
                    }
                }
                C3328c c3328c = c7833j.f37569d;
                boolean z10 = this.f37553f.get();
                List list4 = Collections.EMPTY_LIST;
                C3328c c3328c2 = new C3328c();
                LinkedList linkedListM9938c = AbstractC5030j.m9938c(c3328c.m7649d());
                c3328c2.f17613e = linkedListM9938c;
                if (z10) {
                    linkedListM9938c.add("kex-strict-c-v00@openssh.com");
                }
                LinkedList<String> linkedListM9938c2 = AbstractC5030j.m9938c((List) c3328c.f17615g);
                if (list4 != null && !list4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : linkedListM9938c2) {
                        if (list4.contains(str)) {
                            arrayList.add(str);
                        } else {
                            arrayList2.add(str);
                        }
                    }
                    arrayList.addAll(arrayList2);
                    linkedListM9938c2 = arrayList;
                }
                c3328c2.f17614f = linkedListM9938c2;
                LinkedList linkedListM9938c3 = AbstractC5030j.m9938c((LinkedList) c3328c.f17612d);
                c3328c2.f17609a = linkedListM9938c3;
                c3328c2.f17615g = linkedListM9938c3;
                LinkedList linkedListM9938c4 = AbstractC5030j.m9938c((List) c3328c.f17614f);
                c3328c2.f17611c = linkedListM9938c4;
                c3328c2.f17610b = linkedListM9938c4;
                LinkedList linkedListM9938c5 = AbstractC5030j.m9938c((List) c3328c.f17613e);
                c3328c2.f17616h = linkedListM9938c5;
                c3328c2.f17612d = linkedListM9938c5;
                C5035o c5035o = new C5035o(EnumC5034n.KEXINIT);
                c3328c2.f17617i = c5035o;
                c5035o.m9909c(16);
                C8986c c8986c = (C8986c) c3328c.f17610b;
                c8986c.getClass();
                c8986c.mo2134a(c5035o.f24777c, 16, c5035o.f24775a);
                c5035o.m9931z(c5035o.f24777c + 16);
                c5035o.m9916k(C3328c.m7646i((List) c3328c2.f17613e));
                c5035o.m9916k(C3328c.m7646i(linkedListM9938c2));
                c5035o.m9916k(C3328c.m7646i(linkedListM9938c3));
                c5035o.m9916k(C3328c.m7646i(linkedListM9938c3));
                c5035o.m9916k(C3328c.m7646i(linkedListM9938c4));
                c5035o.m9916k(C3328c.m7646i(linkedListM9938c4));
                c5035o.m9916k(C3328c.m7646i(linkedListM9938c5));
                c5035o.m9916k(C3328c.m7646i(linkedListM9938c5));
                c5035o.m9916k("");
                c5035o.m9916k("");
                c5035o.m9911f((byte) 0);
                c5035o.m9918m(0L);
                this.f37558l = c3328c2;
                c7833j.m14819i(new C5035o((C5035o) c3328c2.f17617i));
                this.f37560n.m10144c();
            } else {
                this.f37552e.set(false);
            }
        }
        if (z6) {
            C5187a c5187a = this.f37561p;
            this.f37549b.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c5187a.m10142a(30000);
        }
    }

    /* renamed from: d */
    public final synchronized void m14810d(PublicKey publicKey) {
        Iterator it = this.f37550c.iterator();
        if (!it.hasNext()) {
            InterfaceC2173b interfaceC2173b = this.f37548a;
            LinkedList linkedList = this.f37550c;
            EnumC5031k enumC5031kFromKey = EnumC5031k.fromKey(publicKey);
            String strM9949b = AbstractC5037q.m9949b(publicKey);
            C5359n c5359n = this.f37549b.f37582s;
            interfaceC2173b.mo5838n("Disconnecting because none of the configured Host key verifiers ({}) could verify '{}' host key with fingerprint {} for {}:{}", linkedList, enumC5031kFromKey, strM9949b, (String) c5359n.f26304b, Integer.valueOf(c5359n.f26303a));
            throw new TransportException(EnumC5023c.HOST_KEY_NOT_VERIFIABLE, "Could not verify `" + EnumC5031k.fromKey(publicKey) + "` host key with fingerprint `" + AbstractC5037q.m9949b(publicKey) + "` for `" + ((String) this.f37549b.f37582s.f26304b) + "` on port " + this.f37549b.f37582s.f26303a, null);
        }
        C1539a c1539a = (C1539a) it.next();
        this.f37548a.mo5849y(c1539a, "Trying to verify host key with {}");
        Object obj = this.f37549b.f37582s.f26304b;
        c1539a.getClass();
    }

    @Override // net.schmizz.sshj.common.InterfaceC5036p
    /* renamed from: h */
    public final void mo5498h(EnumC5034n enumC5034n, C5035o c5035o) {
        C0505a c0505a;
        C0505a c0505a2;
        int i10 = AbstractC7827d.f37547a[this.f37555h.ordinal()];
        C5187a c5187a = this.f37560n;
        AtomicBoolean atomicBoolean = this.f37553f;
        AtomicBoolean atomicBoolean2 = this.f37554g;
        InterfaceC2173b interfaceC2173b = this.f37548a;
        C7833j c7833j = this.f37549b;
        if (i10 == 1) {
            EnumC5034n enumC5034n2 = EnumC5034n.KEXINIT;
            if (enumC5034n != enumC5034n2) {
                throw new TransportException(EnumC5023c.PROTOCOL_ERROR, "Was expecting " + enumC5034n2, null);
            }
            interfaceC2173b.debug("Received SSH_MSG_KEXINIT");
            m14809c(false);
            c7833j.getClass();
            C3328c c3328c = c7833j.f37569d;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c5187a.m10142a(30000);
            c5035o.f24776b--;
            C3328c c3328c2 = new C3328c();
            c3328c2.f17617i = c5035o;
            int i11 = c5035o.f24776b;
            c5035o.f24776b = i11 + 17;
            try {
                c3328c2.f17613e = Arrays.asList(c5035o.m9929x().split(","));
                c3328c2.f17614f = Arrays.asList(c5035o.m9929x().split(","));
                c3328c2.f17615g = Arrays.asList(c5035o.m9929x().split(","));
                c3328c2.f17609a = Arrays.asList(c5035o.m9929x().split(","));
                c3328c2.f17610b = Arrays.asList(c5035o.m9929x().split(","));
                c3328c2.f17611c = Arrays.asList(c5035o.m9929x().split(","));
                c3328c2.f17612d = Arrays.asList(c5035o.m9929x().split(","));
                c3328c2.f17616h = Arrays.asList(c5035o.m9929x().split(","));
                c5035o.f24776b = i11;
                List list = (List) c3328c2.f17613e;
                if (atomicBoolean.get() && list.contains("kex-strict-s-v00@openssh.com")) {
                    atomicBoolean2.set(true);
                    interfaceC2173b.debug("Enabling strict key exchange extension");
                    if (c7833j.f37573h.f37535d != 0) {
                        throw new TransportException(EnumC5023c.KEY_EXCHANGE_FAILED, "SSH_MSG_KEXINIT was not first package during strict key exchange", null);
                    }
                }
                C3328c c3328c3 = this.f37558l;
                C4535g c4535g = new C4535g(C3328c.m7645b((List) c3328c3.f17613e, "KeyExchangeAlgorithms", list), C3328c.m7645b((List) c3328c3.f17614f, "HostKeyAlgorithms", (List) c3328c2.f17614f), C3328c.m7645b((List) c3328c3.f17615g, "Client2ServerCipherAlgorithms", (List) c3328c2.f17615g), C3328c.m7645b((List) c3328c3.f17609a, "Server2ClientCipherAlgorithms", (List) c3328c2.f17609a), C3328c.m7645b((List) c3328c3.f17610b, "Client2ServerMACAlgorithms", (List) c3328c2.f17610b), C3328c.m7645b((List) c3328c3.f17611c, "Server2ClientMACAlgorithms", (List) c3328c2.f17611c), C3328c.m7645b((List) c3328c3.f17612d, "Client2ServerCompressionAlgorithms", (List) c3328c2.f17612d), C3328c.m7645b((List) c3328c3.f17616h, "Server2ClientCompressionAlgorithms", (List) c3328c2.f17616h));
                this.f37559m = c4535g;
                interfaceC2173b.mo5849y(c4535g, "Negotiated algorithms: {}");
                Iterator it = this.f37551d.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    interfaceC2173b.mo5849y(null, "Trying to verify algorithms with {}");
                    throw null;
                }
                this.f37556j = (AbstractC9101a) AbstractC5030j.m9937b((String) this.f37559m.f22538b, c3328c.m7649d());
                c7833j.f37574j = (C6567a) AbstractC5030j.m9937b((String) this.f37559m.f22539c, (List) c3328c.f17615g);
                try {
                    AbstractC9101a abstractC9101a = this.f37556j;
                    String str = c7833j.f37583t;
                    String str2 = c7833j.f37577m;
                    byte[] bArrM9910d = new C5035o(c5035o).m9910d();
                    C3328c c3328c4 = this.f37558l;
                    c3328c4.getClass();
                    abstractC9101a.m16509a(c7833j, str, str2, bArrM9910d, new C5035o((C5035o) c3328c4.f17617i).m9910d());
                    this.f37555h = EnumC7828e.FOLLOWUP;
                    return;
                } catch (GeneralSecurityException e2) {
                    throw new TransportException(EnumC5023c.KEY_EXCHANGE_FAILED, null, e2);
                }
            } catch (Buffer$BufferException e10) {
                throw new TransportException(e10);
            }
        }
        if (i10 == 2) {
            m14808a();
            interfaceC2173b.debug("Received kex followup data");
            try {
                if (this.f37556j.m16511d(enumC5034n, c5035o)) {
                    m14810d(this.f37556j.f43655d);
                    interfaceC2173b.debug("Sending SSH_MSG_NEWKEYS");
                    c7833j.m14819i(new C5035o(EnumC5034n.NEWKEYS));
                    if (atomicBoolean2.get()) {
                        c7833j.f37572g.f37535d = -1L;
                    }
                    this.f37555h = EnumC7828e.NEWKEYS;
                    return;
                }
                return;
            } catch (GeneralSecurityException e11) {
                throw new TransportException(EnumC5023c.KEY_EXCHANGE_FAILED, null, e11);
            }
        }
        if (i10 != 3) {
            return;
        }
        EnumC5034n enumC5034n3 = EnumC5034n.NEWKEYS;
        if (enumC5034n != enumC5034n3) {
            throw new TransportException(EnumC5023c.PROTOCOL_ERROR, "Was expecting " + enumC5034n3, null);
        }
        m14808a();
        interfaceC2173b.debug("Received SSH_MSG_NEWKEYS");
        AbstractC9101a abstractC9101a2 = this.f37556j;
        C8830a c8830a = abstractC9101a2.f43653b;
        byte[] bArr = abstractC9101a2.f43654c;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (this.f37557k == null) {
            this.f37557k = bArrCopyOf;
        }
        C5021a c5021a = new C5021a();
        c5021a.m9913h((BigInteger) this.f37556j.f43660i.f11538d);
        c5021a.m9914i(0, bArrCopyOf.length, bArrCopyOf);
        c5021a.m9911f((byte) 0);
        byte[] bArr2 = this.f37557k;
        c5021a.m9914i(0, bArr2.length, bArr2);
        int iM9907a = (c5021a.m9907a() - this.f37557k.length) - 1;
        byte[] bArr3 = c5021a.f24775a;
        bArr3[iM9907a] = 65;
        c8830a.m16283a(bArr3, 0, c5021a.m9907a());
        byte[] bArrDigest = c8830a.f42532b.digest();
        byte[] bArr4 = c5021a.f24775a;
        bArr4[iM9907a] = 66;
        c8830a.m16283a(bArr4, 0, c5021a.m9907a());
        byte[] bArrDigest2 = c8830a.f42532b.digest();
        byte[] bArr5 = c5021a.f24775a;
        bArr5[iM9907a] = 67;
        c8830a.m16283a(bArr5, 0, c5021a.m9907a());
        byte[] bArrDigest3 = c8830a.f42532b.digest();
        byte[] bArr6 = c5021a.f24775a;
        bArr6[iM9907a] = 68;
        c8830a.m16283a(bArr6, 0, c5021a.m9907a());
        byte[] bArrDigest4 = c8830a.f42532b.digest();
        byte[] bArr7 = c5021a.f24775a;
        bArr7[iM9907a] = 69;
        c8830a.m16283a(bArr7, 0, c5021a.m9907a());
        byte[] bArrDigest5 = c8830a.f42532b.digest();
        byte[] bArr8 = c5021a.f24775a;
        bArr8[iM9907a] = 70;
        c8830a.m16283a(bArr8, 0, c5021a.m9907a());
        byte[] bArrDigest6 = c8830a.f42532b.digest();
        C3328c c3328c5 = c7833j.f37569d;
        C7825b c7825b = c7833j.f37573h;
        InterfaceC8228c interfaceC8228c = (InterfaceC8228c) AbstractC5030j.m9937b((String) this.f37559m.f22540d, (LinkedList) c3328c5.f17612d);
        EnumC8227b enumC8227b = EnumC8227b.Encrypt;
        int blockSize = interfaceC8228c.getBlockSize();
        AbstractC9101a abstractC9101a3 = this.f37556j;
        BigInteger bigInteger = (BigInteger) abstractC9101a3.f43660i.f11538d;
        byte[] bArr9 = abstractC9101a3.f43654c;
        interfaceC8228c.mo15400a(enumC8227b, m14807b(bArrDigest3, blockSize, c8830a, bigInteger, Arrays.copyOf(bArr9, bArr9.length)), bArrDigest);
        InterfaceC8228c interfaceC8228c2 = (InterfaceC8228c) AbstractC5030j.m9937b((String) this.f37559m.f22541e, (LinkedList) c3328c5.f17612d);
        EnumC8227b enumC8227b2 = EnumC8227b.Decrypt;
        int blockSize2 = interfaceC8228c2.getBlockSize();
        AbstractC9101a abstractC9101a4 = this.f37556j;
        BigInteger bigInteger2 = (BigInteger) abstractC9101a4.f43660i.f11538d;
        byte[] bArr10 = abstractC9101a4.f43654c;
        interfaceC8228c2.mo15400a(enumC8227b2, m14807b(bArrDigest4, blockSize2, c8830a, bigInteger2, Arrays.copyOf(bArr10, bArr10.length)), bArrDigest2);
        if (interfaceC8228c.mo14711d() == 0) {
            c0505a = (C0505a) AbstractC5030j.m9937b((String) this.f37559m.f22542f, (List) c3328c5.f17614f);
            int i12 = c0505a.f3560c;
            AbstractC9101a abstractC9101a5 = this.f37556j;
            BigInteger bigInteger3 = (BigInteger) abstractC9101a5.f43660i.f11538d;
            byte[] bArr11 = abstractC9101a5.f43654c;
            c0505a.m1502b(m14807b(bArrDigest5, i12, c8830a, bigInteger3, Arrays.copyOf(bArr11, bArr11.length)));
        } else {
            c0505a = null;
        }
        if (interfaceC8228c2.mo14711d() == 0) {
            c0505a2 = (C0505a) AbstractC5030j.m9937b((String) this.f37559m.f22543g, (List) c3328c5.f17614f);
            int i13 = c0505a2.f3560c;
            AbstractC9101a abstractC9101a6 = this.f37556j;
            BigInteger bigInteger4 = (BigInteger) abstractC9101a6.f43660i.f11538d;
            byte[] bArr12 = abstractC9101a6.f43654c;
            c0505a2.m1502b(m14807b(bArrDigest6, i13, c8830a, bigInteger4, Arrays.copyOf(bArr12, bArr12.length)));
        } else {
            c0505a2 = null;
        }
        if (AbstractC5030j.m9937b((String) this.f37559m.f22545i, (List) c3328c5.f17613e) != null) {
            throw new ClassCastException();
        }
        if (AbstractC5030j.m9937b((String) this.f37559m.f22544h, (List) c3328c5.f17613e) != null) {
            throw new ClassCastException();
        }
        c7833j.f37572g.mo14801a(interfaceC8228c, c0505a);
        c7825b.mo14801a(interfaceC8228c2, c0505a2);
        this.f37552e.set(false);
        atomicBoolean.set(false);
        if (atomicBoolean2.get()) {
            c7825b.f37535d = -1L;
        }
        c5187a.f25289a.m10146a();
        this.f37561p.m10144c();
        this.f37555h = EnumC7828e.KEXINIT;
    }

    @Override // net.schmizz.sshj.common.InterfaceC5027g
    /* renamed from: j */
    public final void mo5499j(SSHException sSHException) {
        this.f37548a.mo5849y(sSHException.toString(), "Got notified of {}");
        C5187a[] c5187aArr = {this.f37560n, this.f37561p};
        for (int i10 = 0; i10 < 2; i10++) {
            c5187aArr[i10].f25289a.m10148c(sSHException);
        }
    }
}
