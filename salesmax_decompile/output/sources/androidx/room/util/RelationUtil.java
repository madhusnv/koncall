package androidx.room.util;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.HashMap;
import p001o.rla;
import p001o.sq8;
import p001o.vo0;
import p001o.xk7;

/* loaded from: classes2.dex */
public final class RelationUtil {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void recursiveFetchArrayMap(vo0 vo0Var, boolean z, xk7 xk7Var) {
        sq8.m48649h(vo0Var, "map");
        sq8.m48649h(xk7Var, "fetchBlock");
        vo0 vo0Var2 = new vo0(999);
        int size = vo0Var.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (z) {
                vo0Var2.put(vo0Var.m36227g(i), vo0Var.m36228o(i));
            } else {
                vo0Var2.put(vo0Var.m36227g(i), null);
            }
            i++;
            i2++;
            if (i2 == 999) {
                xk7Var.invoke(vo0Var2);
                if (!z) {
                    vo0Var.putAll(vo0Var2);
                }
                vo0Var2.clear();
                i2 = 0;
            }
        }
        if (i2 > 0) {
            xk7Var.invoke(vo0Var2);
            if (z) {
                return;
            }
            vo0Var.putAll(vo0Var2);
        }
    }

    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> map, boolean z, xk7 xk7Var) {
        int i;
        sq8.m48649h(map, "map");
        sq8.m48649h(xk7Var, "fetchBlock");
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i = 0;
            for (K k : map.keySet()) {
                if (z) {
                    sq8.m48648g(k, TransferTable.COLUMN_KEY);
                    map2.put(k, map.get(k));
                } else {
                    sq8.m48648g(k, TransferTable.COLUMN_KEY);
                    map2.put(k, null);
                }
                i++;
                if (i == 999) {
                    xk7Var.invoke(map2);
                    if (!z) {
                        map.putAll(map2);
                    }
                    map2.clear();
                }
            }
            break loop0;
        }
        if (i > 0) {
            xk7Var.invoke(map2);
            if (z) {
                return;
            }
            map.putAll(map2);
        }
    }

    public static final <V> void recursiveFetchLongSparseArray(rla rlaVar, boolean z, xk7 xk7Var) {
        sq8.m48649h(rlaVar, "map");
        sq8.m48649h(xk7Var, "fetchBlock");
        rla rlaVar2 = new rla(999);
        int iM46940m = rlaVar.m46940m();
        int i = 0;
        int i2 = 0;
        while (i < iM46940m) {
            if (z) {
                rlaVar2.m46936i(rlaVar.m46935h(i), rlaVar.m46941n(i));
            } else {
                rlaVar2.m46936i(rlaVar.m46935h(i), null);
            }
            i++;
            i2++;
            if (i2 == 999) {
                xk7Var.invoke(rlaVar2);
                if (!z) {
                    rlaVar.m46937j(rlaVar2);
                }
                rlaVar2.clear();
                i2 = 0;
            }
        }
        if (i2 > 0) {
            xk7Var.invoke(rlaVar2);
            if (z) {
                return;
            }
            rlaVar.m46937j(rlaVar2);
        }
    }
}
