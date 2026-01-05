package p001o;

import android.util.Pair;
import androidx.media3.exoplayer.InterfaceC2221p;
import java.util.Arrays;
import p001o.x8b;

/* loaded from: classes2.dex */
public abstract class dsa extends auh {

    /* renamed from: c */
    public C13025a f20470c;

    /* renamed from: o.dsa$a */
    public static final class C13025a {

        /* renamed from: a */
        public final int f20471a;

        /* renamed from: b */
        public final String[] f20472b;

        /* renamed from: c */
        public final int[] f20473c;

        /* renamed from: d */
        public final sth[] f20474d;

        /* renamed from: e */
        public final int[] f20475e;

        /* renamed from: f */
        public final int[][][] f20476f;

        /* renamed from: g */
        public final sth f20477g;

        public C13025a(String[] strArr, int[] iArr, sth[] sthVarArr, int[] iArr2, int[][][] iArr3, sth sthVar) {
            this.f20472b = strArr;
            this.f20473c = iArr;
            this.f20474d = sthVarArr;
            this.f20476f = iArr3;
            this.f20475e = iArr2;
            this.f20477g = sthVar;
            this.f20471a = iArr.length;
        }

        /* renamed from: a */
        public int m23755a(int i, int i2, boolean z) {
            int i3 = this.f20474d[i].m48914b(i2).f42400a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int iM23761g = m23761g(i, i2, i5);
                if (iM23761g == 4 || (z && iM23761g == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return m23756b(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* renamed from: b */
        public int m23756b(int i, int i2, int[] iArr) {
            int i3 = 0;
            int iMin = 16;
            String str = null;
            boolean z = false;
            int i4 = 0;
            while (i3 < iArr.length) {
                String str2 = this.f20474d[i].m48914b(i2).m45839a(iArr[i3]).f7943n;
                int i5 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !sqi.m48724c(str, str2);
                }
                iMin = Math.min(iMin, InterfaceC2221p.m7446r(this.f20476f[i][i2][i3]));
                i3++;
                i4 = i5;
            }
            return z ? Math.min(iMin, this.f20475e[i]) : iMin;
        }

        /* renamed from: c */
        public int m23757c(int i, int i2, int i3) {
            return this.f20476f[i][i2][i3];
        }

        /* renamed from: d */
        public int m23758d() {
            return this.f20471a;
        }

        /* renamed from: e */
        public int m23759e(int i) {
            return this.f20473c[i];
        }

        /* renamed from: f */
        public sth m23760f(int i) {
            return this.f20474d[i];
        }

        /* renamed from: g */
        public int m23761g(int i, int i2, int i3) {
            return InterfaceC2221p.m7440O(m23757c(i, i2, i3));
        }

        /* renamed from: h */
        public sth m23762h() {
            return this.f20477g;
        }
    }

    /* renamed from: n */
    public static int m23751n(InterfaceC2221p[] interfaceC2221pArr, qth qthVar, int[] iArr, boolean z) {
        int length = interfaceC2221pArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < interfaceC2221pArr.length; i2++) {
            InterfaceC2221p interfaceC2221p = interfaceC2221pArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < qthVar.f42400a; i3++) {
                iMax = Math.max(iMax, InterfaceC2221p.m7440O(interfaceC2221p.mo7449a(qthVar.m45839a(i3))));
            }
            boolean z3 = iArr[i2] == 0;
            if (iMax > i || (iMax == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = iMax;
            }
        }
        return length;
    }

    /* renamed from: o */
    public static int[] m23752o(InterfaceC2221p interfaceC2221p, qth qthVar) {
        int[] iArr = new int[qthVar.f42400a];
        for (int i = 0; i < qthVar.f42400a; i++) {
            iArr[i] = interfaceC2221p.mo7449a(qthVar.m45839a(i));
        }
        return iArr;
    }

    /* renamed from: p */
    public static int[] m23753p(InterfaceC2221p[] interfaceC2221pArr) {
        int length = interfaceC2221pArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = interfaceC2221pArr[i].mo6872J();
        }
        return iArr;
    }

    @Override // p001o.auh
    /* renamed from: i */
    public final void mo17857i(Object obj) {
        this.f20470c = (C13025a) obj;
    }

    @Override // p001o.auh
    /* renamed from: k */
    public final buh mo17859k(InterfaceC2221p[] interfaceC2221pArr, sth sthVar, x8b.C18076b c18076b, lmh lmhVar) {
        int[] iArr = new int[interfaceC2221pArr.length + 1];
        int length = interfaceC2221pArr.length + 1;
        qth[][] qthVarArr = new qth[length][];
        int[][][] iArr2 = new int[interfaceC2221pArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = sthVar.f45923a;
            qthVarArr[i] = new qth[i2];
            iArr2[i] = new int[i2][];
        }
        int[] iArrM23753p = m23753p(interfaceC2221pArr);
        for (int i3 = 0; i3 < sthVar.f45923a; i3++) {
            qth qthVarM48914b = sthVar.m48914b(i3);
            int iM23751n = m23751n(interfaceC2221pArr, qthVarM48914b, iArr, qthVarM48914b.f42402c == 5);
            int[] iArrM23752o = iM23751n == interfaceC2221pArr.length ? new int[qthVarM48914b.f42400a] : m23752o(interfaceC2221pArr[iM23751n], qthVarM48914b);
            int i4 = iArr[iM23751n];
            qthVarArr[iM23751n][i4] = qthVarM48914b;
            iArr2[iM23751n][i4] = iArrM23752o;
            iArr[iM23751n] = i4 + 1;
        }
        sth[] sthVarArr = new sth[interfaceC2221pArr.length];
        String[] strArr = new String[interfaceC2221pArr.length];
        int[] iArr3 = new int[interfaceC2221pArr.length];
        for (int i5 = 0; i5 < interfaceC2221pArr.length; i5++) {
            int i6 = iArr[i5];
            sthVarArr[i5] = new sth((qth[]) sqi.S0(qthVarArr[i5], i6));
            iArr2[i5] = (int[][]) sqi.S0(iArr2[i5], i6);
            strArr[i5] = interfaceC2221pArr[i5].getName();
            iArr3[i5] = interfaceC2221pArr[i5].mo6888f();
        }
        C13025a c13025a = new C13025a(strArr, iArr3, sthVarArr, iArrM23753p, iArr2, new sth((qth[]) sqi.S0(qthVarArr[interfaceC2221pArr.length], iArr[interfaceC2221pArr.length])));
        Pair pairMo23754q = mo23754q(c13025a, iArr2, iArrM23753p, c18076b, lmhVar);
        return new buh((nke[]) pairMo23754q.first, (ko6[]) pairMo23754q.second, zth.m59936b(c13025a, (wth[]) pairMo23754q.second), c13025a);
    }

    /* renamed from: q */
    public abstract Pair mo23754q(C13025a c13025a, int[][][] iArr, int[] iArr2, x8b.C18076b c18076b, lmh lmhVar);
}
