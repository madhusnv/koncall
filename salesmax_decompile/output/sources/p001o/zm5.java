package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zm5 {

    /* renamed from: a */
    public final Map f57399a = x94.m55875a(16);

    /* renamed from: o.zm5$a */
    public static final class C18684a {
    }

    /* renamed from: a */
    public final Object m59608a(uef uefVar, C18684a c18684a) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(c18684a, TransferTable.COLUMN_KEY);
        Map map = (Map) this.f57399a.get(uefVar);
        Object obj = map != null ? map.get(c18684a) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* renamed from: b */
    public final Object m59609b(uef uefVar, C18684a c18684a, uk7 uk7Var) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(c18684a, TransferTable.COLUMN_KEY);
        sq8.m48649h(uk7Var, "defaultValue");
        Object objM59608a = m59608a(uefVar, c18684a);
        if (objM59608a != null) {
            return objM59608a;
        }
        Object objInvoke = uk7Var.invoke();
        m59610c(uefVar, c18684a, objInvoke);
        return objInvoke;
    }

    /* renamed from: c */
    public final void m59610c(uef uefVar, C18684a c18684a, Object obj) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(c18684a, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
        Map map = this.f57399a;
        Object objM55875a = map.get(uefVar);
        if (objM55875a == null) {
            objM55875a = x94.m55875a(2);
            map.put(uefVar, objM55875a);
        }
        ((Map) objM55875a).put(c18684a, obj);
    }
}
