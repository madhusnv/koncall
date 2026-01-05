package p001o;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public interface pm6 {

    /* renamed from: o.pm6$a */
    public static final class C16138a {

        /* renamed from: a */
        public final byte[] f40252a;

        /* renamed from: b */
        public final String f40253b;

        /* renamed from: c */
        public final int f40254c;

        public C16138a(byte[] bArr, String str, int i) {
            this.f40252a = bArr;
            this.f40253b = str;
            this.f40254c = i;
        }

        /* renamed from: a */
        public byte[] m43869a() {
            return this.f40252a;
        }

        /* renamed from: b */
        public String m43870b() {
            return this.f40253b;
        }
    }

    /* renamed from: o.pm6$b */
    public interface InterfaceC16139b {
        /* renamed from: a */
        void mo43871a(pm6 pm6Var, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    /* renamed from: o.pm6$c */
    public interface InterfaceC16140c {
        /* renamed from: a */
        pm6 mo19289a(UUID uuid);
    }

    /* renamed from: o.pm6$d */
    public static final class C16141d {

        /* renamed from: a */
        public final byte[] f40255a;

        /* renamed from: b */
        public final String f40256b;

        public C16141d(byte[] bArr, String str) {
            this.f40255a = bArr;
            this.f40256b = str;
        }

        /* renamed from: a */
        public byte[] m43872a() {
            return this.f40255a;
        }

        /* renamed from: b */
        public String m43873b() {
            return this.f40256b;
        }
    }

    /* renamed from: a */
    void mo29733a(InterfaceC16139b interfaceC16139b);

    /* renamed from: b */
    Map mo29734b(byte[] bArr);

    /* renamed from: c */
    C16141d mo29735c();

    /* renamed from: d */
    byte[] mo29736d();

    /* renamed from: e */
    void mo29737e(byte[] bArr, byte[] bArr2);

    /* renamed from: f */
    void mo29738f(byte[] bArr);

    /* renamed from: g */
    int mo29739g();

    /* renamed from: h */
    vc4 mo29740h(byte[] bArr);

    /* renamed from: i */
    default void mo30695i(byte[] bArr, jbd jbdVar) {
    }

    /* renamed from: j */
    boolean mo29741j(byte[] bArr, String str);

    /* renamed from: k */
    void mo29742k(byte[] bArr);

    /* renamed from: l */
    byte[] mo29743l(byte[] bArr, byte[] bArr2);

    /* renamed from: m */
    C16138a mo29744m(byte[] bArr, List list, int i, HashMap map);

    void release();
}
