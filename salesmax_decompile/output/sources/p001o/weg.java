package p001o;

import android.util.Size;

/* loaded from: classes2.dex */
public abstract class weg {

    /* renamed from: o.weg$a */
    public enum EnumC17832a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        EnumC17832a(int i) {
            this.mId = i;
        }

        public int getId() {
            return this.mId;
        }
    }

    /* renamed from: o.weg$b */
    public enum EnumC17833b {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    /* renamed from: a */
    public static weg m54274a(EnumC17833b enumC17833b, EnumC17832a enumC17832a) {
        return new p51(enumC17833b, enumC17832a, 0L);
    }

    /* renamed from: b */
    public static weg m54275b(EnumC17833b enumC17833b, EnumC17832a enumC17832a, long j) {
        return new p51(enumC17833b, enumC17832a, j);
    }

    /* renamed from: e */
    public static EnumC17833b m54276e(int i) {
        return i == 35 ? EnumC17833b.YUV : i == 256 ? EnumC17833b.JPEG : i == 4101 ? EnumC17833b.JPEG_R : i == 32 ? EnumC17833b.RAW : EnumC17833b.PRIV;
    }

    /* renamed from: h */
    public static weg m54277h(int i, int i2, Size size, cgg cggVar) {
        EnumC17833b enumC17833bM54276e = m54276e(i2);
        EnumC17832a enumC17832a = EnumC17832a.NOT_SUPPORT;
        int iM39726b = mvf.m39726b(size);
        if (i == 1) {
            if (iM39726b <= mvf.m39726b(cggVar.m21219i(i2))) {
                enumC17832a = EnumC17832a.s720p;
            } else if (iM39726b <= mvf.m39726b(cggVar.m21217g(i2))) {
                enumC17832a = EnumC17832a.s1440p;
            }
        } else if (iM39726b <= mvf.m39726b(cggVar.mo21212b())) {
            enumC17832a = EnumC17832a.VGA;
        } else if (iM39726b <= mvf.m39726b(cggVar.mo21215e())) {
            enumC17832a = EnumC17832a.PREVIEW;
        } else if (iM39726b <= mvf.m39726b(cggVar.mo21216f())) {
            enumC17832a = EnumC17832a.RECORD;
        } else if (iM39726b <= mvf.m39726b(cggVar.m21213c(i2))) {
            enumC17832a = EnumC17832a.MAXIMUM;
        } else {
            Size sizeM21221k = cggVar.m21221k(i2);
            if (sizeM21221k != null && iM39726b <= mvf.m39726b(sizeM21221k)) {
                enumC17832a = EnumC17832a.ULTRA_MAXIMUM;
            }
        }
        return m54274a(enumC17833bM54276e, enumC17832a);
    }

    /* renamed from: c */
    public abstract EnumC17832a mo42972c();

    /* renamed from: d */
    public abstract EnumC17833b mo42973d();

    /* renamed from: f */
    public abstract long mo42974f();

    /* renamed from: g */
    public final boolean m54278g(weg wegVar) {
        return wegVar.mo42972c().getId() <= mo42972c().getId() && wegVar.mo42973d() == mo42973d();
    }
}
