package p001o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import org.apache.http.protocol.HTTP;

/* loaded from: classes4.dex */
public abstract class xn8 {

    /* renamed from: a */
    public static final Charset f53956a = Charset.forName(HTTP.UTF_8);

    /* renamed from: b */
    public static final Charset f53957b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f53958c;

    /* renamed from: d */
    public static final ByteBuffer f53959d;

    /* renamed from: e */
    public static final if3 f53960e;

    /* renamed from: o.xn8$a */
    public interface InterfaceC18193a {
    }

    /* renamed from: o.xn8$b */
    public interface InterfaceC18194b {
    }

    /* renamed from: o.xn8$c */
    public interface InterfaceC18195c {
        boolean isInRange(int i);
    }

    /* renamed from: o.xn8$d */
    public interface InterfaceC18196d extends List, RandomAccess {
        /* renamed from: a */
        InterfaceC18196d mo56352a(int i);

        /* renamed from: f */
        void mo29975f();

        /* renamed from: k */
        boolean mo29976k();
    }

    static {
        byte[] bArr = new byte[0];
        f53958c = bArr;
        f53959d = ByteBuffer.wrap(bArr);
        f53960e = if3.m32008f(bArr);
    }

    /* renamed from: a */
    public static Object m56499a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static Object m56500b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m56501c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m56502d(byte[] bArr) {
        return m56503e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m56503e(byte[] bArr, int i, int i2) {
        int iM56507i = m56507i(i2, bArr, i, i2);
        if (iM56507i == 0) {
            return 1;
        }
        return iM56507i;
    }

    /* renamed from: f */
    public static int m56504f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: g */
    public static boolean m56505g(byte[] bArr) {
        return iqi.m32571m(bArr);
    }

    /* renamed from: h */
    public static Object m56506h(Object obj, Object obj2) {
        return ((rcb) obj).toBuilder().z1((rcb) obj2).buildPartial();
    }

    /* renamed from: i */
    public static int m56507i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: j */
    public static String m56508j(byte[] bArr) {
        return new String(bArr, f53956a);
    }
}
