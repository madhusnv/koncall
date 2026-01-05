package p001o;

import android.net.Uri;
import androidx.media3.common.C2181a;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public class d1g implements f07 {

    /* renamed from: a */
    public final int f18977a;

    /* renamed from: b */
    public final int f18978b;

    /* renamed from: c */
    public final int f18979c;

    /* renamed from: d */
    public final boolean f18980d;

    /* renamed from: e */
    public final C12782a f18981e;

    /* renamed from: f */
    public final C12783b[] f18982f;

    /* renamed from: g */
    public final long f18983g;

    /* renamed from: h */
    public final long f18984h;

    /* renamed from: o.d1g$a */
    public static class C12782a {

        /* renamed from: a */
        public final UUID f18985a;

        /* renamed from: b */
        public final byte[] f18986b;

        /* renamed from: c */
        public final nth[] f18987c;

        public C12782a(UUID uuid, byte[] bArr, nth[] nthVarArr) {
            this.f18985a = uuid;
            this.f18986b = bArr;
            this.f18987c = nthVarArr;
        }
    }

    public d1g(int i, int i2, long j, long j2, long j3, int i3, boolean z, C12782a c12782a, C12783b[] c12783bArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : sqi.a1(j2, 1000000L, j), j3 != 0 ? sqi.a1(j3, 1000000L, j) : -9223372036854775807L, i3, z, c12782a, c12783bArr);
    }

    @Override // p001o.f07
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d1g mo22238a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C12783b c12783b = null;
        int i = 0;
        while (i < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i);
            C12783b c12783b2 = this.f18982f[streamKey.f7902b];
            if (c12783b2 != c12783b && c12783b != null) {
                arrayList2.add(c12783b.m22241b((C2181a[]) arrayList3.toArray(new C2181a[0])));
                arrayList3.clear();
            }
            arrayList3.add(c12783b2.f18997j[streamKey.f7903c]);
            i++;
            c12783b = c12783b2;
        }
        if (c12783b != null) {
            arrayList2.add(c12783b.m22241b((C2181a[]) arrayList3.toArray(new C2181a[0])));
        }
        return new d1g(this.f18977a, this.f18978b, this.f18983g, this.f18984h, this.f18979c, this.f18980d, this.f18981e, (C12783b[]) arrayList2.toArray(new C12783b[0]));
    }

    /* renamed from: o.d1g$b */
    public static class C12783b {

        /* renamed from: a */
        public final int f18988a;

        /* renamed from: b */
        public final String f18989b;

        /* renamed from: c */
        public final long f18990c;

        /* renamed from: d */
        public final String f18991d;

        /* renamed from: e */
        public final int f18992e;

        /* renamed from: f */
        public final int f18993f;

        /* renamed from: g */
        public final int f18994g;

        /* renamed from: h */
        public final int f18995h;

        /* renamed from: i */
        public final String f18996i;

        /* renamed from: j */
        public final C2181a[] f18997j;

        /* renamed from: k */
        public final int f18998k;

        /* renamed from: l */
        public final String f18999l;

        /* renamed from: m */
        public final String f19000m;

        /* renamed from: n */
        public final List f19001n;

        /* renamed from: o */
        public final long[] f19002o;

        /* renamed from: p */
        public final long f19003p;

        public C12783b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C2181a[] c2181aArr, List list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, c2181aArr, list, sqi.b1(list, 1000000L, j), sqi.a1(j2, 1000000L, j));
        }

        /* renamed from: a */
        public Uri m22240a(int i, int i2) {
            op0.m42517g(this.f18997j != null);
            op0.m42517g(this.f19001n != null);
            op0.m42517g(i2 < this.f19001n.size());
            String string = Integer.toString(this.f18997j[i].f7938i);
            String string2 = ((Long) this.f19001n.get(i2)).toString();
            return a8i.m16688f(this.f18999l, this.f19000m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        /* renamed from: b */
        public C12783b m22241b(C2181a[] c2181aArr) {
            return new C12783b(this.f18999l, this.f19000m, this.f18988a, this.f18989b, this.f18990c, this.f18991d, this.f18992e, this.f18993f, this.f18994g, this.f18995h, this.f18996i, c2181aArr, this.f19001n, this.f19002o, this.f19003p);
        }

        /* renamed from: c */
        public long m22242c(int i) {
            if (i == this.f18998k - 1) {
                return this.f19003p;
            }
            long[] jArr = this.f19002o;
            return jArr[i + 1] - jArr[i];
        }

        /* renamed from: d */
        public int m22243d(long j) {
            return sqi.m48728g(this.f19002o, j, true, true);
        }

        /* renamed from: e */
        public long m22244e(int i) {
            return this.f19002o[i];
        }

        public C12783b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, C2181a[] c2181aArr, List list, long[] jArr, long j2) {
            this.f18999l = str;
            this.f19000m = str2;
            this.f18988a = i;
            this.f18989b = str3;
            this.f18990c = j;
            this.f18991d = str4;
            this.f18992e = i2;
            this.f18993f = i3;
            this.f18994g = i4;
            this.f18995h = i5;
            this.f18996i = str5;
            this.f18997j = c2181aArr;
            this.f19001n = list;
            this.f19002o = jArr;
            this.f19003p = j2;
            this.f18998k = list.size();
        }
    }

    public d1g(int i, int i2, long j, long j2, int i3, boolean z, C12782a c12782a, C12783b[] c12783bArr) {
        this.f18977a = i;
        this.f18978b = i2;
        this.f18983g = j;
        this.f18984h = j2;
        this.f18979c = i3;
        this.f18980d = z;
        this.f18981e = c12782a;
        this.f18982f = c12783bArr;
    }
}
