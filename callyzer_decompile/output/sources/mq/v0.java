package mq;

import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class v0 extends AbstractC8193c {

    /* renamed from: a */
    public int f24327a;

    /* renamed from: b */
    public int f24328b;

    /* renamed from: c */
    public Object f24329c;

    /* renamed from: d */
    public Object f24330d;

    /* renamed from: e */
    public /* synthetic */ Object f24331e;

    /* renamed from: f */
    public final /* synthetic */ a1 f24332f;

    /* renamed from: g */
    public int f24333g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(a1 a1Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24332f = a1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24331e = obj;
        this.f24333g |= Integer.MIN_VALUE;
        Object objM9789f = a1.m9789f(this.f24332f, 0, 0, this);
        return objM9789f == EnumC7794a.COROUTINE_SUSPENDED ? objM9789f : new C6364n(objM9789f);
    }
}
