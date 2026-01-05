package mc;

import jc.AbstractC3740p;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mc.a */
/* loaded from: classes.dex */
public final class C4711a extends AbstractC3740p {

    /* renamed from: a */
    public final byte[] f23604a;

    /* renamed from: b */
    public final long f23605b;

    public C4711a(byte[] bytes) {
        AbstractC4154l.m8923f(bytes, "bytes");
        this.f23604a = bytes;
        this.f23605b = bytes.length;
    }

    @Override // jc.AbstractC3740p
    /* renamed from: b */
    public final byte[] mo8273b() {
        return this.f23604a;
    }

    @Override // jc.AbstractC3745u
    public final Long getContentLength() {
        return Long.valueOf(this.f23605b);
    }
}
