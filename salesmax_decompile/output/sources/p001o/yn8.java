package p001o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
public abstract class yn8 {

    /* renamed from: a */
    public static final Charset f55724a = Charset.forName(HTTP.UTF_8);

    /* renamed from: b */
    public static final Charset f55725b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f55726c;

    /* renamed from: d */
    public static final ByteBuffer f55727d;

    /* renamed from: e */
    public static final jf3 f55728e;

    /* renamed from: o.yn8$a */
    public interface InterfaceC18437a extends InterfaceC18446j {
        @Override // p001o.yn8.InterfaceC18446j, p001o.yn8.InterfaceC18438b
        /* renamed from: a */
        InterfaceC18437a mo17923a(int i);
    }

    /* renamed from: o.yn8$b */
    public interface InterfaceC18438b extends InterfaceC18446j {
        /* renamed from: a */
        InterfaceC18438b mo17923a(int i);

        double getDouble(int i);

        void m2(double d);

        double w1(int i, double d);
    }

    /* renamed from: o.yn8$c */
    public interface InterfaceC18439c {
        int getNumber();
    }

    /* renamed from: o.yn8$d */
    public interface InterfaceC18440d {
        InterfaceC18439c findValueByNumber(int i);
    }

    /* renamed from: o.yn8$e */
    public interface InterfaceC18441e {
        boolean isInRange(int i);
    }

    /* renamed from: o.yn8$f */
    public interface InterfaceC18442f extends InterfaceC18446j {
        @Override // p001o.yn8.InterfaceC18446j, p001o.yn8.InterfaceC18438b
        /* renamed from: a */
        InterfaceC18442f mo17923a(int i);
    }

    /* renamed from: o.yn8$g */
    public interface InterfaceC18443g extends InterfaceC18446j {
        /* renamed from: H */
        int mo58022H(int i, int i2);

        void R1(int i);

        @Override // p001o.yn8.InterfaceC18446j, p001o.yn8.InterfaceC18438b
        /* renamed from: a */
        InterfaceC18443g mo17923a(int i);

        int getInt(int i);
    }

    /* renamed from: o.yn8$h */
    public static class C18444h extends AbstractList {

        /* renamed from: a */
        public final List f55729a;

        /* renamed from: b */
        public final a f55730b;

        /* renamed from: o.yn8$h$a */
        public interface a {
            Object convert(Object obj);
        }

        public C18444h(List list, a aVar) {
            this.f55729a = list;
            this.f55730b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            return this.f55730b.convert(this.f55729a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55729a.size();
        }
    }

    /* renamed from: o.yn8$i */
    public interface InterfaceC18445i extends InterfaceC18446j {
        long G2(int i, long j);

        void Z1(long j);

        @Override // p001o.yn8.InterfaceC18446j, p001o.yn8.InterfaceC18438b
        /* renamed from: a */
        InterfaceC18445i mo17923a(int i);

        long getLong(int i);
    }

    /* renamed from: o.yn8$j */
    public interface InterfaceC18446j extends List, RandomAccess {
        /* renamed from: a */
        InterfaceC18446j mo17923a(int i);

        /* renamed from: f */
        void mo28211f();

        /* renamed from: k */
        boolean mo28212k();
    }

    static {
        byte[] bArr = new byte[0];
        f55726c = bArr;
        f55727d = ByteBuffer.wrap(bArr);
        f55728e = jf3.m33687j(bArr);
    }

    /* renamed from: a */
    public static Object m58012a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static Object m58013b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m58014c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m58015d(byte[] bArr) {
        return m58016e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m58016e(byte[] bArr, int i, int i2) {
        int iM58020i = m58020i(i2, bArr, i, i2);
        if (iM58020i == 0) {
            return 1;
        }
        return iM58020i;
    }

    /* renamed from: f */
    public static int m58017f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m58018g(byte[] bArr) {
        return jqi.m34302s(bArr);
    }

    /* renamed from: h */
    public static Object m58019h(Object obj, Object obj2) {
        return ((scb) obj).toBuilder().mergeFrom((scb) obj2).buildPartial();
    }

    /* renamed from: i */
    public static int m58020i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m58021j(byte[] bArr) {
        return new String(bArr, f55724a);
    }
}
