package c00;

import b00.a0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c00.h */
/* loaded from: classes3.dex */
public final class C0841h {

    /* renamed from: a */
    public final a0 f5314a;

    /* renamed from: b */
    public final boolean f5315b;

    /* renamed from: c */
    public final String f5316c;

    /* renamed from: d */
    public final long f5317d;

    /* renamed from: e */
    public final long f5318e;

    /* renamed from: f */
    public final long f5319f;

    /* renamed from: g */
    public final int f5320g;

    /* renamed from: h */
    public final long f5321h;

    /* renamed from: i */
    public final int f5322i;

    /* renamed from: j */
    public final int f5323j;

    /* renamed from: k */
    public final Long f5324k;

    /* renamed from: l */
    public final Long f5325l;

    /* renamed from: m */
    public final Long f5326m;

    /* renamed from: n */
    public final Integer f5327n;

    /* renamed from: o */
    public final Integer f5328o;

    /* renamed from: p */
    public final Integer f5329p;

    /* renamed from: q */
    public final ArrayList f5330q;

    public C0841h(a0 canonicalPath, boolean z6, String comment, long j6, long j10, long j11, int i10, long j12, int i11, int i12, Long l9, Long l10, Long l11, Integer num, Integer num2, Integer num3) {
        AbstractC4154l.m8923f(canonicalPath, "canonicalPath");
        AbstractC4154l.m8923f(comment, "comment");
        this.f5314a = canonicalPath;
        this.f5315b = z6;
        this.f5316c = comment;
        this.f5317d = j6;
        this.f5318e = j10;
        this.f5319f = j11;
        this.f5320g = i10;
        this.f5321h = j12;
        this.f5322i = i11;
        this.f5323j = i12;
        this.f5324k = l9;
        this.f5325l = l10;
        this.f5326m = l11;
        this.f5327n = num;
        this.f5328o = num2;
        this.f5329p = num3;
        this.f5330q = new ArrayList();
    }

    public /* synthetic */ C0841h(a0 a0Var, boolean z6, String str, long j6, long j10, long j11, int i10, long j12, int i11, int i12, Long l9, Long l10, Long l11, int i13) {
        this(a0Var, z6, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j6, (i13 & 16) != 0 ? -1L : j10, (i13 & 32) != 0 ? -1L : j11, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) != 0 ? -1L : j12, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) != 0 ? -1 : i12, (i13 & 1024) != 0 ? null : l9, (i13 & NewHope.SENDB_BYTES) != 0 ? null : l10, (i13 & 4096) != 0 ? null : l11, null, null, null);
    }
}
