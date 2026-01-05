package p001o;

import android.graphics.Color;
import android.util.TimingLogger;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p001o.jwc;

/* loaded from: classes2.dex */
public final class nh3 {

    /* renamed from: g */
    public static final Comparator f36846g = new C15584a();

    /* renamed from: a */
    public final int[] f36847a;

    /* renamed from: b */
    public final int[] f36848b;

    /* renamed from: c */
    public final List f36849c;

    /* renamed from: e */
    public final jwc.InterfaceC14673c[] f36851e;

    /* renamed from: f */
    public final float[] f36852f = new float[3];

    /* renamed from: d */
    public final TimingLogger f36850d = null;

    /* renamed from: o.nh3$a */
    public static class C15584a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C15585b c15585b, C15585b c15585b2) {
            return c15585b2.m40595g() - c15585b.m40595g();
        }
    }

    /* renamed from: o.nh3$b */
    public class C15585b {

        /* renamed from: a */
        public int f36853a;

        /* renamed from: b */
        public int f36854b;

        /* renamed from: c */
        public int f36855c;

        /* renamed from: d */
        public int f36856d;

        /* renamed from: e */
        public int f36857e;

        /* renamed from: f */
        public int f36858f;

        /* renamed from: g */
        public int f36859g;

        /* renamed from: h */
        public int f36860h;

        /* renamed from: i */
        public int f36861i;

        public C15585b(int i, int i2) {
            this.f36853a = i;
            this.f36854b = i2;
            m40591c();
        }

        /* renamed from: a */
        public final boolean m40589a() {
            return m40593e() > 1;
        }

        /* renamed from: b */
        public final int m40590b() {
            int iM40594f = m40594f();
            nh3 nh3Var = nh3.this;
            int[] iArr = nh3Var.f36847a;
            int[] iArr2 = nh3Var.f36848b;
            nh3.m40575e(iArr, iM40594f, this.f36853a, this.f36854b);
            Arrays.sort(iArr, this.f36853a, this.f36854b + 1);
            nh3.m40575e(iArr, iM40594f, this.f36853a, this.f36854b);
            int i = this.f36855c / 2;
            int i2 = this.f36853a;
            int i3 = 0;
            while (true) {
                int i4 = this.f36854b;
                if (i2 > i4) {
                    return this.f36853a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        /* renamed from: c */
        public final void m40591c() {
            nh3 nh3Var = nh3.this;
            int[] iArr = nh3Var.f36847a;
            int[] iArr2 = nh3Var.f36848b;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.f36853a; i8 <= this.f36854b; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int iM40580k = nh3.m40580k(i9);
                int iM40579j = nh3.m40579j(i9);
                int iM40578i = nh3.m40578i(i9);
                if (iM40580k > i2) {
                    i2 = iM40580k;
                }
                if (iM40580k < i) {
                    i = iM40580k;
                }
                if (iM40579j > i3) {
                    i3 = iM40579j;
                }
                if (iM40579j < i6) {
                    i6 = iM40579j;
                }
                if (iM40578i > i4) {
                    i4 = iM40578i;
                }
                if (iM40578i < i7) {
                    i7 = iM40578i;
                }
            }
            this.f36856d = i;
            this.f36857e = i2;
            this.f36858f = i6;
            this.f36859g = i3;
            this.f36860h = i7;
            this.f36861i = i4;
            this.f36855c = i5;
        }

        /* renamed from: d */
        public final jwc.C14674d m40592d() {
            nh3 nh3Var = nh3.this;
            int[] iArr = nh3Var.f36847a;
            int[] iArr2 = nh3Var.f36848b;
            int iM40580k = 0;
            int i = 0;
            int iM40579j = 0;
            int iM40578i = 0;
            for (int i2 = this.f36853a; i2 <= this.f36854b; i2++) {
                int i3 = iArr[i2];
                int i4 = iArr2[i3];
                i += i4;
                iM40580k += nh3.m40580k(i3) * i4;
                iM40579j += nh3.m40579j(i3) * i4;
                iM40578i += i4 * nh3.m40578i(i3);
            }
            float f = i;
            return new jwc.C14674d(nh3.m40574b(Math.round(iM40580k / f), Math.round(iM40579j / f), Math.round(iM40578i / f)), i);
        }

        /* renamed from: e */
        public final int m40593e() {
            return (this.f36854b + 1) - this.f36853a;
        }

        /* renamed from: f */
        public final int m40594f() {
            int i = this.f36857e - this.f36856d;
            int i2 = this.f36859g - this.f36858f;
            int i3 = this.f36861i - this.f36860h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        /* renamed from: g */
        public final int m40595g() {
            return ((this.f36857e - this.f36856d) + 1) * ((this.f36859g - this.f36858f) + 1) * ((this.f36861i - this.f36860h) + 1);
        }

        /* renamed from: h */
        public final C15585b m40596h() {
            if (!m40589a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iM40590b = m40590b();
            C15585b c15585b = nh3.this.new C15585b(iM40590b + 1, this.f36854b);
            this.f36854b = iM40590b;
            m40591c();
            return c15585b;
        }
    }

    public nh3(int[] iArr, int i, jwc.InterfaceC14673c[] interfaceC14673cArr) {
        this.f36851e = interfaceC14673cArr;
        int[] iArr2 = new int[32768];
        this.f36848b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int iM40577g = m40577g(iArr[i2]);
            iArr[i2] = iM40577g;
            iArr2[iM40577g] = iArr2[iM40577g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && m40584l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f36847a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 > i) {
            this.f36849c = m40583h(i);
            return;
        }
        this.f36849c = new ArrayList();
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = iArr3[i7];
            this.f36849c.add(new jwc.C14674d(m40573a(i8), iArr2[i8]));
        }
    }

    /* renamed from: a */
    public static int m40573a(int i) {
        return m40574b(m40580k(i), m40579j(i), m40578i(i));
    }

    /* renamed from: b */
    public static int m40574b(int i, int i2, int i3) {
        return Color.rgb(m40576f(i, 5, 8), m40576f(i2, 5, 8), m40576f(i3, 5, 8));
    }

    /* renamed from: e */
    public static void m40575e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m40578i(i4) | (m40579j(i4) << 10) | (m40580k(i4) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = m40580k(i5) | (m40578i(i5) << 10) | (m40579j(i5) << 5);
            i2++;
        }
    }

    /* renamed from: f */
    public static int m40576f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: g */
    public static int m40577g(int i) {
        return m40576f(Color.blue(i), 8, 5) | (m40576f(Color.red(i), 8, 5) << 10) | (m40576f(Color.green(i), 8, 5) << 5);
    }

    /* renamed from: i */
    public static int m40578i(int i) {
        return i & 31;
    }

    /* renamed from: j */
    public static int m40579j(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: k */
    public static int m40580k(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: c */
    public final List m40581c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            jwc.C14674d c14674dM40592d = ((C15585b) it.next()).m40592d();
            if (!m40586n(c14674dM40592d)) {
                arrayList.add(c14674dM40592d);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public List m40582d() {
        return this.f36849c;
    }

    /* renamed from: h */
    public final List m40583h(int i) {
        PriorityQueue priorityQueue = new PriorityQueue(i, f36846g);
        priorityQueue.offer(new C15585b(0, this.f36847a.length - 1));
        m40587o(priorityQueue, i);
        return m40581c(priorityQueue);
    }

    /* renamed from: l */
    public final boolean m40584l(int i) {
        int iM40573a = m40573a(i);
        ni3.m40616h(iM40573a, this.f36852f);
        return m40585m(iM40573a, this.f36852f);
    }

    /* renamed from: m */
    public final boolean m40585m(int i, float[] fArr) {
        jwc.InterfaceC14673c[] interfaceC14673cArr = this.f36851e;
        if (interfaceC14673cArr != null && interfaceC14673cArr.length > 0) {
            int length = interfaceC14673cArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f36851e[i2].mo34613a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m40586n(jwc.C14674d c14674d) {
        return m40585m(c14674d.m34625e(), c14674d.m34623c());
    }

    /* renamed from: o */
    public final void m40587o(PriorityQueue priorityQueue, int i) {
        C15585b c15585b;
        while (priorityQueue.size() < i && (c15585b = (C15585b) priorityQueue.poll()) != null && c15585b.m40589a()) {
            priorityQueue.offer(c15585b.m40596h());
            priorityQueue.offer(c15585b);
        }
    }
}
