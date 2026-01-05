package sp;

import j$.time.LocalDateTime;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sp.d */
/* loaded from: classes3.dex */
public final class C6881d extends AbstractC8193c {

    /* renamed from: a */
    public Object f32704a;

    /* renamed from: b */
    public LocalDateTime f32705b;

    /* renamed from: c */
    public LocalDateTime f32706c;

    /* renamed from: d */
    public /* synthetic */ Object f32707d;

    /* renamed from: e */
    public final /* synthetic */ C6883f f32708e;

    /* renamed from: f */
    public int f32709f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6881d(C6883f c6883f, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32708e = c6883f;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32707d = obj;
        this.f32709f |= Integer.MIN_VALUE;
        return C6883f.m13070h(this.f32708e, this);
    }
}
