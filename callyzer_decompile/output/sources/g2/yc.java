package g2;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class yc extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7879r f13334a;

    /* renamed from: b */
    public final /* synthetic */ float f13335b;

    /* renamed from: c */
    public final /* synthetic */ C6734c f13336c;

    /* renamed from: d */
    public final /* synthetic */ int f13337d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(InterfaceC7879r interfaceC7879r, float f6, C6734c c6734c, int i10) {
        super(2);
        this.f13334a = interfaceC7879r;
        this.f13335b = f6;
        this.f13336c = c6734c;
        this.f13337d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM8496A = C3953b.m8496A(this.f13337d | 1);
        pd.m6276l(this.f13334a, this.f13335b, this.f13336c, (InterfaceC3962k) obj, iM8496A);
        return qw.a0.f30746a;
    }
}
