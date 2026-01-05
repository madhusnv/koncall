package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class g81 {
    /* renamed from: c */
    public static final void m28164c(final z38 z38Var, y38 y38Var) {
        y38Var.getHeaders().mo17774d(new nl7() { // from class: o.f81
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return g81.m28165d(z38Var, (String) obj, (List) obj2);
            }
        });
        for (Map.Entry entry : y38Var.getUrl().m36756c().entrySet()) {
            y66 y66Var = (y66) entry.getKey();
            List list = (List) entry.getValue();
            if (!z38Var.m58671h().m36766g().containsKey(y66Var)) {
                z38Var.m58671h().m36766g().mo20278m(y66Var, list);
            }
        }
    }

    /* renamed from: d */
    public static final y3i m28165d(z38 z38Var, String str, List list) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(list, "values");
        z38Var.m58668e().m59799g(str, list);
        return y3i.f54824a;
    }
}
