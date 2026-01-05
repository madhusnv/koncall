package i2;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i2.b */
/* loaded from: classes.dex */
public final class C3149b extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ C3150c f17022a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC3161n f17023b;

    /* renamed from: c */
    public final /* synthetic */ boolean f17024c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC7879r f17025d;

    /* renamed from: e */
    public final /* synthetic */ long f17026e;

    /* renamed from: f */
    public final /* synthetic */ long f17027f;

    /* renamed from: g */
    public final /* synthetic */ float f17028g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3149b(C3150c c3150c, InterfaceC3161n interfaceC3161n, boolean z6, InterfaceC7879r interfaceC7879r, long j6, long j10, float f6, int i10) {
        super(2);
        this.f17022a = c3150c;
        this.f17023b = interfaceC3161n;
        this.f17024c = z6;
        this.f17025d = interfaceC7879r;
        this.f17026e = j6;
        this.f17027f = j10;
        this.f17028g = f6;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM8496A = C3953b.m8496A(1572865);
        this.f17022a.m7526a(this.f17023b, this.f17024c, this.f17025d, this.f17026e, this.f17027f, this.f17028g, (InterfaceC3962k) obj, iM8496A);
        return a0.f30746a;
    }
}
