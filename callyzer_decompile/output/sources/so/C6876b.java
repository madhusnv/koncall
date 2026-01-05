package so;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: so.b */
/* loaded from: classes3.dex */
public final class C6876b extends AbstractC8193c {

    /* renamed from: a */
    public String f32689a;

    /* renamed from: b */
    public String f32690b;

    /* renamed from: c */
    public boolean f32691c;

    /* renamed from: d */
    public /* synthetic */ Object f32692d;

    /* renamed from: e */
    public final /* synthetic */ C6877c f32693e;

    /* renamed from: f */
    public int f32694f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6876b(C6877c c6877c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32693e = c6877c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32692d = obj;
        this.f32694f |= Integer.MIN_VALUE;
        return this.f32693e.m13067c(null, null, false, false, this);
    }
}
