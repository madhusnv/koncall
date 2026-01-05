package h1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4168z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ C4168z f15447a;

    /* renamed from: b */
    public final /* synthetic */ float f15448b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2775f f15449c;

    /* renamed from: d */
    public final /* synthetic */ C2780k f15450d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f15451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(C4168z c4168z, float f6, InterfaceC2775f interfaceC2775f, C2780k c2780k, InterfaceC2139c interfaceC2139c) {
        super(1);
        this.f15447a = c4168z;
        this.f15448b = f6;
        this.f15449c = interfaceC2775f;
        this.f15450d = c2780k;
        this.f15451e = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f15447a.f21164a;
        AbstractC4154l.m8920c(obj2);
        AbstractC2773d.m6790m((C2778i) obj2, jLongValue, this.f15448b, this.f15449c, this.f15450d, this.f15451e);
        return qw.a0.f30746a;
    }
}
