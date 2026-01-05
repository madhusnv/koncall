package ug;

import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.r */
/* loaded from: classes.dex */
public final class C7447r {

    /* renamed from: a */
    public final String f35794a;

    /* renamed from: b */
    public final String f35795b;

    /* renamed from: c */
    public final long f35796c;

    /* renamed from: d */
    public final long f35797d;

    /* renamed from: e */
    public final long f35798e;

    /* renamed from: f */
    public final long f35799f;

    /* renamed from: g */
    public final long f35800g;

    /* renamed from: h */
    public final Long f35801h;

    /* renamed from: i */
    public final Long f35802i;

    /* renamed from: j */
    public final Long f35803j;

    /* renamed from: k */
    public final Boolean f35804k;

    public C7447r(String str, String str2, long j6, long j10, long j11, long j12, long j13, Long l9, Long l10, Long l11, Boolean bool) {
        AbstractC6840z.m13033d(str);
        AbstractC6840z.m13033d(str2);
        AbstractC6840z.m13031b(j6 >= 0);
        AbstractC6840z.m13031b(j10 >= 0);
        AbstractC6840z.m13031b(j11 >= 0);
        AbstractC6840z.m13031b(j13 >= 0);
        this.f35794a = str;
        this.f35795b = str2;
        this.f35796c = j6;
        this.f35797d = j10;
        this.f35798e = j11;
        this.f35799f = j12;
        this.f35800g = j13;
        this.f35801h = l9;
        this.f35802i = l10;
        this.f35803j = l11;
        this.f35804k = bool;
    }

    /* renamed from: a */
    public final C7447r m14129a(long j6) {
        return new C7447r(this.f35794a, this.f35795b, this.f35796c, this.f35797d, this.f35798e, j6, this.f35800g, this.f35801h, this.f35802i, this.f35803j, this.f35804k);
    }

    /* renamed from: b */
    public final C7447r m14130b(Long l9, Long l10, Boolean bool) {
        return new C7447r(this.f35794a, this.f35795b, this.f35796c, this.f35797d, this.f35798e, this.f35799f, this.f35800g, this.f35801h, l9, l10, bool);
    }
}
