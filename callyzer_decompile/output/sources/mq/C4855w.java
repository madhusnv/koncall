package mq;

import j$.time.LocalDateTime;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.w */
/* loaded from: classes3.dex */
public final class C4855w extends AbstractC8193c {

    /* renamed from: a */
    public LocalDateTime f24334a;

    /* renamed from: b */
    public Object f24335b;

    /* renamed from: c */
    public Object f24336c;

    /* renamed from: d */
    public String f24337d;

    /* renamed from: e */
    public int f24338e;

    /* renamed from: f */
    public int f24339f;

    /* renamed from: g */
    public /* synthetic */ Object f24340g;

    /* renamed from: h */
    public final /* synthetic */ h0 f24341h;

    /* renamed from: j */
    public int f24342j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4855w(h0 h0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24341h = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24340g = obj;
        this.f24342j |= Integer.MIN_VALUE;
        Object objM9793e = h0.m9793e(this.f24341h, null, 0, 0, this);
        return objM9793e == EnumC7794a.COROUTINE_SUSPENDED ? objM9793e : new C6364n(objM9793e);
    }
}
