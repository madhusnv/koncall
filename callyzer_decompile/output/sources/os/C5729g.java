package os;

import java.util.ArrayList;
import ns.C5136b;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: os.g */
/* loaded from: classes3.dex */
public final class C5729g extends AbstractC8193c {

    /* renamed from: a */
    public int f28232a;

    /* renamed from: b */
    public ArrayList f28233b;

    /* renamed from: c */
    public ArrayList f28234c;

    /* renamed from: d */
    public C5136b f28235d;

    /* renamed from: e */
    public /* synthetic */ Object f28236e;

    /* renamed from: f */
    public final /* synthetic */ C5731i f28237f;

    /* renamed from: g */
    public int f28238g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5729g(C5731i c5731i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f28237f = c5731i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f28236e = obj;
        this.f28238g |= Integer.MIN_VALUE;
        return C5731i.m11281e(this.f28237f, 0, this);
    }
}
