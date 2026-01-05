package g2;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d5 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11372a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f11373b;

    /* renamed from: c */
    public final /* synthetic */ float f11374c;

    /* renamed from: d */
    public final /* synthetic */ long f11375d;

    /* renamed from: e */
    public final /* synthetic */ int f11376e;

    /* renamed from: f */
    public final /* synthetic */ int f11377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5(InterfaceC7879r interfaceC7879r, float f6, long j6, int i10, int i11, int i12) {
        super(2);
        this.f11372a = i12;
        this.f11373b = interfaceC7879r;
        this.f11374c = f6;
        this.f11375d = j6;
        this.f11376e = i10;
        this.f11377f = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11372a) {
            case 0:
                ((Number) obj2).intValue();
                p9.m6245i(this.f11373b, this.f11374c, this.f11375d, (InterfaceC3962k) obj, C3953b.m8496A(this.f11376e | 1), this.f11377f);
                break;
            default:
                ((Number) obj2).intValue();
                p9.m6252p(this.f11373b, this.f11374c, this.f11375d, (InterfaceC3962k) obj, C3953b.m8496A(this.f11376e | 1), this.f11377f);
                break;
        }
        return qw.a0.f30746a;
    }
}
