package bq;

import j$.time.LocalDateTime;
import mn.g0;
import qp.C6274k;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bq.h */
/* loaded from: classes3.dex */
public final class C0728h extends AbstractC8193c {

    /* renamed from: a */
    public int f4574a;

    /* renamed from: b */
    public int f4575b;

    /* renamed from: c */
    public C6274k f4576c;

    /* renamed from: d */
    public g0 f4577d;

    /* renamed from: e */
    public LocalDateTime f4578e;

    /* renamed from: f */
    public LocalDateTime f4579f;

    /* renamed from: g */
    public boolean f4580g;

    /* renamed from: h */
    public boolean f4581h;

    /* renamed from: j */
    public boolean f4582j;

    /* renamed from: k */
    public boolean f4583k;

    /* renamed from: l */
    public /* synthetic */ Object f4584l;

    /* renamed from: m */
    public final /* synthetic */ C0737q f4585m;

    /* renamed from: n */
    public int f4586n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728h(C0737q c0737q, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f4585m = c0737q;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4584l = obj;
        this.f4586n |= Integer.MIN_VALUE;
        Object objM2030i = C0737q.m2030i(this.f4585m, 0, this);
        return objM2030i == EnumC7794a.COROUTINE_SUSPENDED ? objM2030i : new C6364n(objM2030i);
    }
}
