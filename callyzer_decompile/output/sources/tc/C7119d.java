package tc;

import jc.AbstractC3744t;
import jc.AbstractC3745u;
import wc.C7969c;
import wc.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tc.d */
/* loaded from: classes.dex */
public final class C7119d extends AbstractC3744t {

    /* renamed from: a */
    public final Long f34319a;

    /* renamed from: b */
    public final boolean f34320b;

    /* renamed from: c */
    public final boolean f34321c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f34322d;

    public C7119d(AbstractC3745u abstractC3745u, byte[] bArr) {
        this.f34322d = bArr;
        this.f34319a = abstractC3745u.getContentLength();
        this.f34320b = abstractC3745u.isOneShot();
        this.f34321c = abstractC3745u.isDuplex();
    }

    @Override // jc.AbstractC3745u
    public final Long getContentLength() {
        return this.f34319a;
    }

    @Override // jc.AbstractC3745u
    public final boolean isDuplex() {
        return this.f34321c;
    }

    @Override // jc.AbstractC3745u
    public final boolean isOneShot() {
        return this.f34320b;
    }

    @Override // jc.AbstractC3744t
    public final e0 readFrom() {
        return new C7969c(this.f34322d);
    }
}
