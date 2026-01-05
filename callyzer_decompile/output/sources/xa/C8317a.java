package xa;

import sc.C6804x;
import va.C7693a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xa.a */
/* loaded from: classes.dex */
public final class C8317a extends AbstractC8193c {

    /* renamed from: a */
    public C6804x f39873a;

    /* renamed from: b */
    public /* synthetic */ Object f39874b;

    /* renamed from: c */
    public final /* synthetic */ C7693a f39875c;

    /* renamed from: d */
    public int f39876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8317a(C7693a c7693a, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f39875c = c7693a;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39874b = obj;
        this.f39876d |= Integer.MIN_VALUE;
        return this.f39875c.mo1858o(null, this);
    }
}
