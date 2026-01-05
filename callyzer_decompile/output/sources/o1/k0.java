package o1;

import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4168z;
import og.pe;
import p3.AbstractC5806d;
import v3.InterfaceC7641m;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f25776a;

    /* renamed from: b */
    public final /* synthetic */ C4168z f25777b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(C4168z c4168z, int i10) {
        super(1);
        this.f25776a = i10;
        this.f25777b = c4168z;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        boolean z6;
        switch (this.f25776a) {
            case 0:
                this.f25777b.f21164a = (t3.w0) obj;
                return qw.a0.f30746a;
            case 1:
                this.f25777b.f21164a = (t3.w0) obj;
                return qw.a0.f30746a;
            case 2:
                InterfaceC7641m interfaceC7641m = (v3.a2) obj;
                if (((AbstractC7878q) interfaceC7641m).f37670a.f37683p) {
                    this.f25777b.f21164a = interfaceC7641m;
                    z6 = false;
                } else {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 3:
                AbstractC5806d abstractC5806d = (AbstractC5806d) obj;
                C4168z c4168z = this.f25777b;
                Object obj2 = c4168z.f21164a;
                if (obj2 == null && abstractC5806d.f28425s) {
                    c4168z.f21164a = abstractC5806d;
                } else if (obj2 != null) {
                    abstractC5806d.getClass();
                }
                return Boolean.TRUE;
            case 4:
                v3.a2 a2Var = (v3.a2) obj;
                AbstractC4154l.m8921d(a2Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                s1.h0 h0Var = ((s1.z0) a2Var).f32171q;
                C4168z c4168z2 = this.f25777b;
                List listM10835j = (List) c4168z2.f21164a;
                if (listM10835j != null) {
                    listM10835j.add(h0Var);
                } else {
                    listM10835j = pe.m10835j(h0Var);
                }
                c4168z2.f21164a = listM10835j;
                return v3.z1.SkipSubtreeAndContinueTraversal;
            default:
                this.f25777b.f21164a = (b3.e0) obj;
                return Boolean.TRUE;
        }
    }
}
