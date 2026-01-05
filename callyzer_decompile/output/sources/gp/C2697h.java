package gp;

import j$.time.LocalDateTime;
import mn.g0;
import qp.C6266c;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gp.h */
/* loaded from: classes3.dex */
public final class C2697h extends AbstractC8193c {

    /* renamed from: a */
    public int f15048a;

    /* renamed from: b */
    public int f15049b;

    /* renamed from: c */
    public C6266c f15050c;

    /* renamed from: d */
    public LocalDateTime f15051d;

    /* renamed from: e */
    public LocalDateTime f15052e;

    /* renamed from: f */
    public EnumC8994d f15053f;

    /* renamed from: g */
    public g0 f15054g;

    /* renamed from: h */
    public boolean f15055h;

    /* renamed from: j */
    public boolean f15056j;

    /* renamed from: k */
    public /* synthetic */ Object f15057k;

    /* renamed from: l */
    public final /* synthetic */ C2703n f15058l;

    /* renamed from: m */
    public int f15059m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2697h(C2703n c2703n, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15058l = c2703n;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15057k = obj;
        this.f15059m |= Integer.MIN_VALUE;
        Object objM6708i = C2703n.m6708i(this.f15058l, 0, this);
        return objM6708i == EnumC7794a.COROUTINE_SUSPENDED ? objM6708i : new C6364n(objM6708i);
    }
}
