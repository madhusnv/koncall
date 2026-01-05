package p001o;

import androidx.media3.common.C2181a;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class qth {

    /* renamed from: f */
    public static final String f42398f = sqi.B0(0);

    /* renamed from: g */
    public static final String f42399g = sqi.B0(1);

    /* renamed from: a */
    public final int f42400a;

    /* renamed from: b */
    public final String f42401b;

    /* renamed from: c */
    public final int f42402c;

    /* renamed from: d */
    public final C2181a[] f42403d;

    /* renamed from: e */
    public int f42404e;

    public qth(C2181a... c2181aArr) {
        this("", c2181aArr);
    }

    /* renamed from: c */
    public static void m45836c(String str, String str2, String str3, int i) {
        ria.m46820d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    /* renamed from: d */
    public static String m45837d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    /* renamed from: e */
    public static int m45838e(int i) {
        return i | Opcodes.ACC_ENUM;
    }

    /* renamed from: a */
    public C2181a m45839a(int i) {
        return this.f42403d[i];
    }

    /* renamed from: b */
    public int m45840b(C2181a c2181a) {
        int i = 0;
        while (true) {
            C2181a[] c2181aArr = this.f42403d;
            if (i >= c2181aArr.length) {
                return -1;
            }
            if (c2181a == c2181aArr[i]) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qth.class != obj.getClass()) {
            return false;
        }
        qth qthVar = (qth) obj;
        return this.f42401b.equals(qthVar.f42401b) && Arrays.equals(this.f42403d, qthVar.f42403d);
    }

    /* renamed from: f */
    public final void m45841f() {
        String strM45837d = m45837d(this.f42403d[0].f7933d);
        int iM45838e = m45838e(this.f42403d[0].f7935f);
        int i = 1;
        while (true) {
            C2181a[] c2181aArr = this.f42403d;
            if (i >= c2181aArr.length) {
                return;
            }
            if (!strM45837d.equals(m45837d(c2181aArr[i].f7933d))) {
                C2181a[] c2181aArr2 = this.f42403d;
                m45836c("languages", c2181aArr2[0].f7933d, c2181aArr2[i].f7933d, i);
                return;
            } else {
                if (iM45838e != m45838e(this.f42403d[i].f7935f)) {
                    m45836c("role flags", Integer.toBinaryString(this.f42403d[0].f7935f), Integer.toBinaryString(this.f42403d[i].f7935f), i);
                    return;
                }
                i++;
            }
        }
    }

    public int hashCode() {
        if (this.f42404e == 0) {
            this.f42404e = ((527 + this.f42401b.hashCode()) * 31) + Arrays.hashCode(this.f42403d);
        }
        return this.f42404e;
    }

    public qth(String str, C2181a... c2181aArr) {
        op0.m42511a(c2181aArr.length > 0);
        this.f42401b = str;
        this.f42403d = c2181aArr;
        this.f42400a = c2181aArr.length;
        int iM56181i = xeb.m56181i(c2181aArr[0].f7943n);
        this.f42402c = iM56181i == -1 ? xeb.m56181i(c2181aArr[0].f7942m) : iM56181i;
        m45841f();
    }
}
