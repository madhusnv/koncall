package g2;

import ex.InterfaceC2141e;
import i3.AbstractC3166c;
import j3.C3552f;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d6 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11378a;

    /* renamed from: b */
    public final /* synthetic */ String f11379b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f11380c;

    /* renamed from: d */
    public final /* synthetic */ long f11381d;

    /* renamed from: e */
    public final /* synthetic */ int f11382e;

    /* renamed from: f */
    public final /* synthetic */ int f11383f;

    /* renamed from: g */
    public final /* synthetic */ Object f11384g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(Object obj, String str, InterfaceC7879r interfaceC7879r, long j6, int i10, int i11, int i12) {
        super(2);
        this.f11378a = i12;
        this.f11384g = obj;
        this.f11379b = str;
        this.f11380c = interfaceC7879r;
        this.f11381d = j6;
        this.f11382e = i10;
        this.f11383f = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11378a) {
            case 0:
                ((Number) obj2).intValue();
                C3552f c3552f = (C3552f) this.f11384g;
                e6.m6133b(c3552f, this.f11379b, this.f11380c, this.f11381d, (InterfaceC3962k) obj, C3953b.m8496A(this.f11382e | 1), this.f11383f);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC3166c abstractC3166c = (AbstractC3166c) this.f11384g;
                e6.m6132a(abstractC3166c, this.f11379b, this.f11380c, this.f11381d, (InterfaceC3962k) obj, C3953b.m8496A(this.f11382e | 1), this.f11383f);
                break;
        }
        return qw.a0.f30746a;
    }
}
