package t1;

import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.c */
/* loaded from: classes.dex */
public final class C6978c extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C6978c f33759b;

    /* renamed from: c */
    public static final C6978c f33760c;

    /* renamed from: a */
    public final /* synthetic */ int f33761a;

    static {
        int i10 = 1;
        f33759b = new C6978c(i10, 0);
        f33760c = new C6978c(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6978c(int i10, int i11) {
        super(i10);
        this.f33761a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f33761a) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new C6979d(iIntValue, ((Float) obj3).floatValue(), new o6.b0(4, list));
            default:
                return qw.a0.f30746a;
        }
    }
}
