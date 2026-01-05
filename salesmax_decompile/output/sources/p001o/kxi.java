package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class kxi {

    /* renamed from: a */
    public final Map f32801a = new LinkedHashMap();

    /* renamed from: a */
    public final void m36299a() {
        Iterator it = this.f32801a.values().iterator();
        while (it.hasNext()) {
            ((dxi) it.next()).m23931c();
        }
        this.f32801a.clear();
    }

    /* renamed from: b */
    public final dxi m36300b(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        return (dxi) this.f32801a.get(str);
    }

    /* renamed from: c */
    public final Set m36301c() {
        return new HashSet(this.f32801a.keySet());
    }

    /* renamed from: d */
    public final void m36302d(String str, dxi dxiVar) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(dxiVar, "viewModel");
        dxi dxiVar2 = (dxi) this.f32801a.put(str, dxiVar);
        if (dxiVar2 != null) {
            dxiVar2.m23931c();
        }
    }
}
