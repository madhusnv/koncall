package pp;

import j$.time.LocalDateTime;
import mn.g0;
import qp.C6270g;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pp.e */
/* loaded from: classes3.dex */
public final class C5989e extends AbstractC8193c {

    /* renamed from: a */
    public int f29266a;

    /* renamed from: b */
    public int f29267b;

    /* renamed from: c */
    public C6270g f29268c;

    /* renamed from: d */
    public g0 f29269d;

    /* renamed from: e */
    public LocalDateTime f29270e;

    /* renamed from: f */
    public LocalDateTime f29271f;

    /* renamed from: g */
    public boolean f29272g;

    /* renamed from: h */
    public /* synthetic */ Object f29273h;

    /* renamed from: j */
    public final /* synthetic */ C5995k f29274j;

    /* renamed from: k */
    public int f29275k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5989e(C5995k c5995k, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f29274j = c5995k;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f29273h = obj;
        this.f29275k |= Integer.MIN_VALUE;
        Object objM12026h = C5995k.m12026h(this.f29274j, 0, this);
        return objM12026h == EnumC7794a.COROUTINE_SUSPENDED ? objM12026h : new C6364n(objM12026h);
    }
}
