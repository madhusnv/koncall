package p001o;

import androidx.navigation.C2331b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class wrb {
    /* renamed from: a */
    public static final List m54932a(Map map, xk7 xk7Var) {
        sq8.m48649h(map, "<this>");
        sq8.m48649h(xk7Var, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C2331b c2331b = (C2331b) entry.getValue();
            Boolean boolValueOf = c2331b != null ? Boolean.valueOf(c2331b.m8542d()) : null;
            sq8.m48646e(boolValueOf);
            if ((boolValueOf.booleanValue() || c2331b.m8540b()) ? false : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) xk7Var.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
