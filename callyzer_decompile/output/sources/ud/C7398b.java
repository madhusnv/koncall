package ud;

import dy.InterfaceC1857e;
import ww.AbstractC8193c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.b */
/* loaded from: classes.dex */
public final class C7398b extends AbstractC8193c {

    /* renamed from: a */
    public AbstractC8199i f35170a;

    /* renamed from: b */
    public InterfaceC1857e f35171b;

    /* renamed from: c */
    public C7404h f35172c;

    /* renamed from: d */
    public int f35173d;

    /* renamed from: e */
    public /* synthetic */ Object f35174e;

    /* renamed from: f */
    public final /* synthetic */ C7399c f35175f;

    /* renamed from: g */
    public int f35176g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7398b(C7399c c7399c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f35175f = c7399c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f35174e = obj;
        this.f35176g |= Integer.MIN_VALUE;
        return this.f35175f.m13805h(null, this);
    }
}
