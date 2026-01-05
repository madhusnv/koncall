package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class fg5 implements jhe {

    /* renamed from: a */
    public final nhe f23269a;

    /* renamed from: b */
    public final Map f23270b;

    /* renamed from: c */
    public final List f23271c;

    public fg5(nhe nheVar) {
        this.f23269a = nheVar;
        this.f23270b = isa.m32681h();
        this.f23271c = bh3.m18963e(orf.m42606d(false, null, null, null, null, 31, null));
    }

    @Override // p001o.e01
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22809a(ihe iheVar, n64 n64Var) {
        Object obj = this.f23270b.get(iheVar.m32149a());
        if (obj == null) {
            obj = this.f23271c;
        }
        return (List) obj;
    }

    public /* synthetic */ fg5(nhe nheVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : nheVar);
    }
}
