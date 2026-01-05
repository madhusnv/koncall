package w3;

import c3.C0848c;
import d4.C1589q;
import java.util.Comparator;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x1 implements Comparator {

    /* renamed from: b */
    public static final x1 f38049b = new x1(0);

    /* renamed from: c */
    public static final x1 f38050c = new x1(1);

    /* renamed from: d */
    public static final x1 f38051d = new x1(2);

    /* renamed from: a */
    public final /* synthetic */ int f38052a;

    public /* synthetic */ x1(int i10) {
        this.f38052a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f38052a) {
            case 0:
                C0848c c0848cM5212f = ((C1589q) obj).m5212f();
                C0848c c0848cM5212f2 = ((C1589q) obj2).m5212f();
                int iCompare = Float.compare(c0848cM5212f.f5354a, c0848cM5212f2.f5354a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(c0848cM5212f.f5355b, c0848cM5212f2.f5355b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(c0848cM5212f.f5357d, c0848cM5212f2.f5357d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(c0848cM5212f.f5356c, c0848cM5212f2.f5356c);
            case 1:
                C0848c c0848cM5212f3 = ((C1589q) obj).m5212f();
                C0848c c0848cM5212f4 = ((C1589q) obj2).m5212f();
                int iCompare4 = Float.compare(c0848cM5212f4.f5356c, c0848cM5212f3.f5356c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(c0848cM5212f3.f5355b, c0848cM5212f4.f5355b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(c0848cM5212f3.f5357d, c0848cM5212f4.f5357d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(c0848cM5212f4.f5354a, c0848cM5212f3.f5354a);
            default:
                C6361k c6361k = (C6361k) obj;
                C6361k c6361k2 = (C6361k) obj2;
                int iCompare7 = Float.compare(((C0848c) c6361k.f30755a).f5355b, ((C0848c) c6361k2.f30755a).f5355b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((C0848c) c6361k.f30755a).f5357d, ((C0848c) c6361k2.f30755a).f5357d);
        }
    }
}
