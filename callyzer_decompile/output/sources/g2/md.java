package g2;

import d4.AbstractC1594v;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class md extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final md f12143b;

    /* renamed from: c */
    public static final md f12144c;

    /* renamed from: a */
    public final /* synthetic */ int f12145a;

    static {
        int i10 = 1;
        f12143b = new md(i10, 0);
        f12144c = new md(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md(int i10, int i11) {
        super(i10);
        this.f12145a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f12145a) {
            case 0:
                AbstractC1594v.m5233k((InterfaceC1596x) obj);
                return qw.a0.f30746a;
            default:
                List list = (List) obj;
                Object obj2 = list.get(0);
                AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj3).intValue();
                Object obj4 = list.get(2);
                AbstractC4154l.m8921d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                return new sd(iIntValue, iIntValue2, ((Boolean) obj4).booleanValue());
        }
    }
}
