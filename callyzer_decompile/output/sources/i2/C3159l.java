package i2;

import com.skydoves.balloon.internals.DefinitionKt;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i2.l */
/* loaded from: classes.dex */
public final class C3159l extends AbstractC8193c {

    /* renamed from: a */
    public C3160m f17063a;

    /* renamed from: b */
    public float f17064b;

    /* renamed from: c */
    public /* synthetic */ Object f17065c;

    /* renamed from: d */
    public final /* synthetic */ C3160m f17066d;

    /* renamed from: e */
    public int f17067e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3159l(C3160m c3160m, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17066d = c3160m;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17065c = obj;
        this.f17067e |= Integer.MIN_VALUE;
        return this.f17066d.S0(DefinitionKt.NO_Float_VALUE, this);
    }
}
