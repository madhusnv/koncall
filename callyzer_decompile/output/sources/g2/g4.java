package g2;

import ex.InterfaceC2139c;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kx.C4266h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g4 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11632a;

    /* renamed from: b */
    public final /* synthetic */ z9 f11633b;

    /* renamed from: c */
    public final /* synthetic */ Locale f11634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(z9 z9Var, Locale locale, int i10) {
        super(1);
        this.f11632a = i10;
        this.f11633b = z9Var;
        this.f11634c = locale;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f11632a) {
            case 0:
                List list = (List) obj;
                Long l9 = (Long) list.get(0);
                Long l10 = (Long) list.get(1);
                Object obj2 = list.get(2);
                AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(3);
                AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type kotlin.Int");
                C4266h c4266h = new C4266h(iIntValue, ((Integer) obj3).intValue(), 1);
                Object obj4 = list.get(4);
                AbstractC4154l.m8921d(obj4, "null cannot be cast to non-null type kotlin.Int");
                return new h4(l9, l10, c4266h, ((Integer) obj4).intValue(), this.f11633b, this.f11634c);
            default:
                List list2 = (List) obj;
                Long l11 = (Long) list2.get(0);
                Long l12 = (Long) list2.get(1);
                Long l13 = (Long) list2.get(2);
                Object obj5 = list2.get(3);
                AbstractC4154l.m8921d(obj5, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj5).intValue();
                Object obj6 = list2.get(4);
                AbstractC4154l.m8921d(obj6, "null cannot be cast to non-null type kotlin.Int");
                C4266h c4266h2 = new C4266h(iIntValue2, ((Integer) obj6).intValue(), 1);
                Object obj7 = list2.get(5);
                AbstractC4154l.m8921d(obj7, "null cannot be cast to non-null type kotlin.Int");
                return new v4(l11, l12, l13, c4266h2, ((Integer) obj7).intValue(), this.f11633b, this.f11634c);
        }
    }
}
