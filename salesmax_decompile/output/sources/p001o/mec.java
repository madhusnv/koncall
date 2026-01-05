package p001o;

import java.security.MessageDigest;

/* loaded from: classes5.dex */
public final class mec {

    /* renamed from: e */
    public static final InterfaceC15298b f35274e = new C15297a();

    /* renamed from: a */
    public final Object f35275a;

    /* renamed from: b */
    public final InterfaceC15298b f35276b;

    /* renamed from: c */
    public final String f35277c;

    /* renamed from: d */
    public volatile byte[] f35278d;

    /* renamed from: o.mec$a */
    public class C15297a implements InterfaceC15298b {
        @Override // p001o.mec.InterfaceC15298b
        /* renamed from: a */
        public void mo23866a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: o.mec$b */
    public interface InterfaceC15298b {
        /* renamed from: a */
        void mo23866a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public mec(String str, Object obj, InterfaceC15298b interfaceC15298b) {
        this.f35277c = bgd.m18884b(str);
        this.f35275a = obj;
        this.f35276b = (InterfaceC15298b) bgd.m18886d(interfaceC15298b);
    }

    /* renamed from: a */
    public static mec m38830a(String str, Object obj, InterfaceC15298b interfaceC15298b) {
        return new mec(str, obj, interfaceC15298b);
    }

    /* renamed from: b */
    public static InterfaceC15298b m38831b() {
        return f35274e;
    }

    /* renamed from: e */
    public static mec m38832e(String str) {
        return new mec(str, null, m38831b());
    }

    /* renamed from: f */
    public static mec m38833f(String str, Object obj) {
        return new mec(str, obj, m38831b());
    }

    /* renamed from: c */
    public Object m38834c() {
        return this.f35275a;
    }

    /* renamed from: d */
    public final byte[] m38835d() {
        if (this.f35278d == null) {
            this.f35278d = this.f35277c.getBytes(ic9.f28450a);
        }
        return this.f35278d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof mec) {
            return this.f35277c.equals(((mec) obj).f35277c);
        }
        return false;
    }

    /* renamed from: g */
    public void m38836g(Object obj, MessageDigest messageDigest) {
        this.f35276b.mo23866a(m38835d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f35277c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f35277c + "'}";
    }
}
