package o6;

import java.io.FileInputStream;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.y */
/* loaded from: classes.dex */
public final class C5323y extends AbstractC8193c {

    /* renamed from: a */
    public Object f26196a;

    /* renamed from: b */
    public FileInputStream f26197b;

    /* renamed from: c */
    public /* synthetic */ Object f26198c;

    /* renamed from: d */
    public final /* synthetic */ C5324z f26199d;

    /* renamed from: e */
    public int f26200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5323y(C5324z c5324z, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f26199d = c5324z;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f26198c = obj;
        this.f26200e |= Integer.MIN_VALUE;
        return C5324z.m10470a(this.f26199d, this);
    }
}
