package b3;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4168z;
import r1.C6440y;
import t3.v0;
import t3.w0;
import u2.AbstractC7311h;
import u2.AbstractC7321r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b3.o */
/* loaded from: classes.dex */
public final class C0583o extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3931a;

    /* renamed from: b */
    public final /* synthetic */ int f3932b;

    /* renamed from: c */
    public final /* synthetic */ Object f3933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0583o(int i10, Collection collection) {
        super(1);
        this.f3931a = 3;
        this.f3932b = i10;
        this.f3933c = collection;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f3931a) {
            case 0:
                C4168z c4168z = (C4168z) this.f3933c;
                boolean zP0 = ((e0) obj).P0(this.f3932b);
                c4168z.f21164a = Boolean.valueOf(zP0);
                return Boolean.valueOf(zP0);
            case 1:
                ((v0) obj).m13324d((w0) this.f3933c, 0, -this.f3932b, DefinitionKt.NO_Float_VALUE);
                return qw.a0.f30746a;
            case 2:
                s1.f0 f0Var = (s1.f0) obj;
                mg.j0 j0Var = ((C6440y) this.f3933c).f31074a;
                AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
                AbstractC7321r.m13709f(abstractC7311hM13706c, AbstractC7321r.m13707d(abstractC7311hM13706c), abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null);
                j0Var.getClass();
                for (int i10 = 0; i10 < 2; i10++) {
                    f0Var.m12847a(this.f3932b + i10);
                }
                return qw.a0.f30746a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f3932b, (Collection) this.f3933c));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0583o(Object obj, int i10, int i11) {
        super(1);
        this.f3931a = i11;
        this.f3933c = obj;
        this.f3932b = i10;
    }
}
