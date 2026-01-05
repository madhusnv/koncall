package iz;

import au.C0440d;
import ex.InterfaceC2137a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import qw.C6366p;
import rw.AbstractC6664n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.u */
/* loaded from: classes3.dex */
public final class C3388u {

    /* renamed from: a */
    public final q0 f17976a;

    /* renamed from: b */
    public final C3376i f17977b;

    /* renamed from: c */
    public final List f17978c;

    /* renamed from: d */
    public final C6366p f17979d;

    public C3388u(q0 tlsVersion, C3376i c3376i, List list, InterfaceC2137a interfaceC2137a) {
        AbstractC4154l.m8923f(tlsVersion, "tlsVersion");
        this.f17976a = tlsVersion;
        this.f17977b = c3376i;
        this.f17978c = list;
        this.f17979d = nd.m10782c(new C0440d(17, interfaceC2137a));
    }

    /* renamed from: a */
    public final List m7786a() {
        return (List) this.f17979d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3388u)) {
            return false;
        }
        C3388u c3388u = (C3388u) obj;
        return c3388u.f17976a == this.f17976a && AbstractC4154l.m8918a(c3388u.f17977b, this.f17977b) && AbstractC4154l.m8918a(c3388u.m7786a(), m7786a()) && AbstractC4154l.m8918a(c3388u.f17978c, this.f17978c);
    }

    public final int hashCode() {
        return this.f17978c.hashCode() + ((m7786a().hashCode() + ((this.f17977b.hashCode() + ((this.f17976a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM7786a = m7786a();
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(listM7786a, 10));
        for (Certificate certificate : listM7786a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC4154l.m8922e(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f17976a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f17977b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f17978c;
        ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC4154l.m8922e(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
