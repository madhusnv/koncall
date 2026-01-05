package b8;

import ex.InterfaceC2139c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b8.u */
/* loaded from: classes.dex */
public final class C0626u extends AbstractC8193c {

    /* renamed from: a */
    public C0627v f4079a;

    /* renamed from: b */
    public String f4080b;

    /* renamed from: c */
    public InterfaceC2139c f4081c;

    /* renamed from: d */
    public C0612g f4082d;

    /* renamed from: e */
    public /* synthetic */ Object f4083e;

    /* renamed from: f */
    public final /* synthetic */ C0627v f4084f;

    /* renamed from: g */
    public int f4085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0626u(C0627v c0627v, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f4084f = c0627v;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4083e = obj;
        this.f4085g |= Integer.MIN_VALUE;
        return this.f4084f.mo1780a(null, null, this);
    }
}
