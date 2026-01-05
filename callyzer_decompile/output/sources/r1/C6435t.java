package r1;

import java.util.List;
import tb.C7105p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.t */
/* loaded from: classes.dex */
public final class C6435t {

    /* renamed from: a */
    public final int f31055a;

    /* renamed from: b */
    public final C6434s[] f31056b;

    /* renamed from: c */
    public final C7105p f31057c;

    /* renamed from: d */
    public final List f31058d;

    /* renamed from: e */
    public final int f31059e;

    /* renamed from: f */
    public final int f31060f;

    /* renamed from: g */
    public final int f31061g;

    public C6435t(int i10, C6434s[] c6434sArr, C7105p c7105p, List list, int i11) {
        this.f31055a = i10;
        this.f31056b = c6434sArr;
        this.f31057c = c7105p;
        this.f31058d = list;
        this.f31059e = i11;
        int iMax = 0;
        for (C6434s c6434s : c6434sArr) {
            iMax = Math.max(iMax, c6434s.f31047k);
        }
        this.f31060f = iMax;
        int i12 = iMax + this.f31059e;
        this.f31061g = i12 >= 0 ? i12 : 0;
    }

    /* renamed from: a */
    public final C6434s[] m12431a(int i10, int i11, int i12) {
        C6434s[] c6434sArr = this.f31056b;
        int length = c6434sArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            C6434s c6434s = c6434sArr[i13];
            int i16 = i14 + 1;
            int i17 = (int) ((C6419d) this.f31058d.get(i14)).f30951a;
            c6434s.m12430l(i10, ((int[]) this.f31057c.f34291c)[i15], i11, i12, this.f31055a, i15);
            i15 += i17;
            i13++;
            i14 = i16;
        }
        return c6434sArr;
    }
}
