package mg;

import java.io.Serializable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.w */
/* loaded from: classes.dex */
public final class C4744w extends AbstractC4745x implements Serializable {

    /* renamed from: b */
    public static final C4744w f23706b = new C4744w(0);

    /* renamed from: c */
    public static final C4744w f23707c = new C4744w(1);

    /* renamed from: a */
    public final /* synthetic */ int f23708a;

    public /* synthetic */ C4744w(int i10) {
        this.f23708a = i10;
    }

    @Override // mg.AbstractC4745x
    /* renamed from: a */
    public final AbstractC4745x mo9613a() {
        switch (this.f23708a) {
            case 0:
                return f23707c;
            default:
                return f23706b;
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f23708a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f23708a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
