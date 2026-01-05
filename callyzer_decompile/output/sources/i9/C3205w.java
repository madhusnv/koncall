package i9;

import ca.C0939k;
import ec.InterfaceC2004b;
import java.util.Iterator;
import kotlin.jvm.internal.C4168z;
import l4.C4367l;
import nd.InterfaceC5016g;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.w */
/* loaded from: classes.dex */
public final class C3205w extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC2004b f17286a;

    /* renamed from: b */
    public InterfaceC5016g f17287b;

    /* renamed from: c */
    public C0939k f17288c;

    /* renamed from: d */
    public C4367l f17289d;

    /* renamed from: e */
    public C4168z f17290e;

    /* renamed from: f */
    public C4168z f17291f;

    /* renamed from: g */
    public Iterator f17292g;

    /* renamed from: h */
    public C4168z f17293h;

    /* renamed from: j */
    public int f17294j;

    /* renamed from: k */
    public int f17295k;

    /* renamed from: l */
    public /* synthetic */ Object f17296l;

    /* renamed from: m */
    public final /* synthetic */ C3208z f17297m;

    /* renamed from: n */
    public int f17298n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3205w(C3208z c3208z, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17297m = c3208z;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17296l = obj;
        this.f17298n |= Integer.MIN_VALUE;
        return this.f17297m.resolve(null, this);
    }
}
