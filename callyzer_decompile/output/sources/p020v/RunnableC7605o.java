package p020v;

import i0.C3082m;
import i0.g2;
import i0.t2;
import i0.w2;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.o */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7605o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36637a;

    /* renamed from: b */
    public final /* synthetic */ C7612v f36638b;

    /* renamed from: c */
    public final /* synthetic */ String f36639c;

    /* renamed from: d */
    public final /* synthetic */ g2 f36640d;

    /* renamed from: e */
    public final /* synthetic */ w2 f36641e;

    /* renamed from: f */
    public final /* synthetic */ C3082m f36642f;

    /* renamed from: g */
    public final /* synthetic */ List f36643g;

    public /* synthetic */ RunnableC7605o(C7612v c7612v, String str, g2 g2Var, w2 w2Var, C3082m c3082m, List list, int i10) {
        this.f36637a = i10;
        this.f36638b = c7612v;
        this.f36639c = str;
        this.f36640d = g2Var;
        this.f36641e = w2Var;
        this.f36642f = c3082m;
        this.f36643g = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36637a) {
            case 0:
                C7612v c7612v = this.f36638b;
                String str = this.f36639c;
                g2 g2Var = this.f36640d;
                w2 w2Var = this.f36641e;
                C3082m c3082m = this.f36642f;
                List list = this.f36643g;
                c7612v.m14455w("Use case " + str + " UPDATED");
                c7612v.f36719a.m5872h(str, g2Var, w2Var, c3082m, list);
                c7612v.m14448M();
                break;
            case 1:
                C7612v c7612v2 = this.f36638b;
                String str2 = this.f36639c;
                g2 g2Var2 = this.f36640d;
                w2 w2Var2 = this.f36641e;
                C3082m c3082m2 = this.f36642f;
                List list2 = this.f36643g;
                c7612v2.m14455w("Use case " + str2 + " ACTIVE");
                LinkedHashMap linkedHashMap = c7612v2.f36719a.f10051a;
                t2 t2Var = (t2) linkedHashMap.get(str2);
                if (t2Var == null) {
                    t2Var = new t2(g2Var2, w2Var2, c3082m2, list2);
                    linkedHashMap.put(str2, t2Var);
                }
                t2Var.f16590f = true;
                c7612v2.f36719a.m5872h(str2, g2Var2, w2Var2, c3082m2, list2);
                c7612v2.m14448M();
                break;
            default:
                C7612v c7612v3 = this.f36638b;
                String str3 = this.f36639c;
                g2 g2Var3 = this.f36640d;
                w2 w2Var3 = this.f36641e;
                C3082m c3082m3 = this.f36642f;
                List list3 = this.f36643g;
                c7612v3.m14455w("Use case " + str3 + " RESET");
                c7612v3.f36719a.m5872h(str3, g2Var3, w2Var3, c3082m3, list3);
                c7612v3.m14451s();
                c7612v3.m14441F();
                c7612v3.m14448M();
                if (c7612v3.f36723e == EnumC7610t.OPENED) {
                    c7612v3.m14440E();
                    break;
                }
                break;
        }
    }
}
