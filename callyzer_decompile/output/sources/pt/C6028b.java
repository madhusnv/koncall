package pt;

import rt.C6617a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pt.b */
/* loaded from: classes3.dex */
public final class C6028b extends AbstractC8193c {

    /* renamed from: a */
    public String f29445a;

    /* renamed from: b */
    public C6617a f29446b;

    /* renamed from: c */
    public String f29447c;

    /* renamed from: d */
    public /* synthetic */ Object f29448d;

    /* renamed from: e */
    public final /* synthetic */ C6032f f29449e;

    /* renamed from: f */
    public int f29450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6028b(C6032f c6032f, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f29449e = c6032f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f29448d = obj;
        this.f29450f |= Integer.MIN_VALUE;
        return this.f29449e.m12047g(null, this);
    }
}
