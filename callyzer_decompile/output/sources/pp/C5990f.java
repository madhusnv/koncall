package pp;

import j$.time.LocalDateTime;
import mn.g0;
import qp.C6270g;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pp.f */
/* loaded from: classes3.dex */
public final class C5990f extends AbstractC8193c {

    /* renamed from: a */
    public int f29276a;

    /* renamed from: b */
    public int f29277b;

    /* renamed from: c */
    public C6270g f29278c;

    /* renamed from: d */
    public g0 f29279d;

    /* renamed from: e */
    public LocalDateTime f29280e;

    /* renamed from: f */
    public LocalDateTime f29281f;

    /* renamed from: g */
    public boolean f29282g;

    /* renamed from: h */
    public /* synthetic */ Object f29283h;

    /* renamed from: j */
    public final /* synthetic */ C5995k f29284j;

    /* renamed from: k */
    public int f29285k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5990f(C5995k c5995k, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f29284j = c5995k;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f29283h = obj;
        this.f29285k |= Integer.MIN_VALUE;
        Object objM12027i = C5995k.m12027i(this.f29284j, 0, this);
        return objM12027i == EnumC7794a.COROUTINE_SUSPENDED ? objM12027i : new C6364n(objM12027i);
    }
}
