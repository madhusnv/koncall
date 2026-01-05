package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class oi5 implements ljh {

    /* renamed from: a */
    public final pjh f38398a;

    /* renamed from: b */
    public final Map f38399b;

    /* renamed from: c */
    public final List f38400c;

    public oi5(pjh pjhVar) {
        this.f38398a = pjhVar;
        this.f38399b = isa.m32681h();
        this.f38400c = bh3.m18963e(orf.m42606d(false, null, null, null, null, 31, null));
    }

    @Override // p001o.e01
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22809a(kjh kjhVar, n64 n64Var) {
        Object obj = this.f38399b.get(kjhVar.m35787a());
        if (obj == null) {
            obj = this.f38400c;
        }
        return (List) obj;
    }

    public /* synthetic */ oi5(pjh pjhVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : pjhVar);
    }
}
