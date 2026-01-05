package kv;

import ww.AbstractC8193c;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kv.c */
/* loaded from: classes3.dex */
public final class C4249c extends AbstractC8193c {

    /* renamed from: a */
    public C9000c f21584a;

    /* renamed from: b */
    public int f21585b;

    /* renamed from: c */
    public /* synthetic */ Object f21586c;

    /* renamed from: d */
    public final /* synthetic */ C4252f f21587d;

    /* renamed from: e */
    public int f21588e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4249c(C4252f c4252f, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21587d = c4252f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21586c = obj;
        this.f21588e |= Integer.MIN_VALUE;
        return C4252f.m8980e(this.f21587d, null, this);
    }
}
