package p001o;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class dfj {

    /* renamed from: a */
    public final wzc f19748a;

    /* renamed from: b */
    public final boolean f19749b;

    /* renamed from: c */
    public final String f19750c;

    /* renamed from: d */
    public final long f19751d;

    /* renamed from: e */
    public final long f19752e;

    /* renamed from: f */
    public final long f19753f;

    /* renamed from: g */
    public final int f19754g;

    /* renamed from: h */
    public final long f19755h;

    /* renamed from: i */
    public final int f19756i;

    /* renamed from: j */
    public final int f19757j;

    /* renamed from: k */
    public final Long f19758k;

    /* renamed from: l */
    public final Long f19759l;

    /* renamed from: m */
    public final Long f19760m;

    /* renamed from: n */
    public final Integer f19761n;

    /* renamed from: o */
    public final Integer f19762o;

    /* renamed from: p */
    public final Integer f19763p;

    /* renamed from: q */
    public final List f19764q;

    public dfj(wzc wzcVar, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3) {
        sq8.m48649h(wzcVar, "canonicalPath");
        sq8.m48649h(str, ClientCookie.COMMENT_ATTR);
        this.f19748a = wzcVar;
        this.f19749b = z;
        this.f19750c = str;
        this.f19751d = j;
        this.f19752e = j2;
        this.f19753f = j3;
        this.f19754g = i;
        this.f19755h = j4;
        this.f19756i = i2;
        this.f19757j = i3;
        this.f19758k = l;
        this.f19759l = l2;
        this.f19760m = l3;
        this.f19761n = num;
        this.f19762o = num2;
        this.f19763p = num3;
        this.f19764q = new ArrayList();
    }

    /* renamed from: a */
    public final dfj m22989a(Integer num, Integer num2, Integer num3) {
        return new dfj(this.f19748a, this.f19749b, this.f19750c, this.f19751d, this.f19752e, this.f19753f, this.f19754g, this.f19755h, this.f19756i, this.f19757j, this.f19758k, this.f19759l, this.f19760m, num, num2, num3);
    }

    /* renamed from: b */
    public final wzc m22990b() {
        return this.f19748a;
    }

    /* renamed from: c */
    public final List m22991c() {
        return this.f19764q;
    }

    /* renamed from: d */
    public final long m22992d() {
        return this.f19752e;
    }

    /* renamed from: e */
    public final int m22993e() {
        return this.f19754g;
    }

    /* renamed from: f */
    public final long m22994f() {
        return this.f19755h;
    }

    /* renamed from: g */
    public final long m22995g() {
        return this.f19753f;
    }

    public /* synthetic */ dfj(wzc wzcVar, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3, int i4, id5 id5Var) {
        this(wzcVar, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & 128) == 0 ? j4 : -1L, (i4 & 256) != 0 ? -1 : i2, (i4 & 512) == 0 ? i3 : -1, (i4 & 1024) != 0 ? null : l, (i4 & 2048) != 0 ? null : l2, (i4 & 4096) != 0 ? null : l3, (i4 & 8192) != 0 ? null : num, (i4 & Opcodes.ACC_ENUM) != 0 ? null : num2, (i4 & 32768) != 0 ? null : num3);
    }
}
