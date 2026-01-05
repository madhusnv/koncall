package p001o;

/* loaded from: classes2.dex */
public abstract class pzh {

    /* renamed from: a */
    public final ac7 f41008a;

    /* renamed from: b */
    public final int f41009b;

    /* renamed from: c */
    public final int f41010c;

    /* renamed from: d */
    public final Object f41011d;

    /* renamed from: b */
    public static /* synthetic */ pzh m44568b(pzh pzhVar, lb7 lb7Var, ac7 ac7Var, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            pzhVar.getClass();
            lb7Var = null;
        }
        if ((i3 & 2) != 0) {
            ac7Var = pzhVar.f41008a;
        }
        ac7 ac7Var2 = ac7Var;
        if ((i3 & 4) != 0) {
            i = pzhVar.f41009b;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = pzhVar.f41010c;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = pzhVar.f41011d;
        }
        return pzhVar.m44569a(lb7Var, ac7Var2, i4, i5, obj);
    }

    /* renamed from: a */
    public abstract pzh m44569a(lb7 lb7Var, ac7 ac7Var, int i, int i2, Object obj);

    /* renamed from: c */
    public abstract lb7 m44570c();

    /* renamed from: d */
    public abstract int m44571d();

    /* renamed from: e */
    public abstract ac7 m44572e();
}
