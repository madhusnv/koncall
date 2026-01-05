package p001o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001o.nf8;

/* loaded from: classes2.dex */
public abstract class fn1 {
    /* renamed from: a */
    public static nf8 m27118a(ol7 ol7Var, List list) {
        nf8.C15566a c15566aM40508q = nf8.m40508q();
        for (int i = 0; i < list.size(); i++) {
            c15566aM40508q.mo32056a(ol7Var.apply((Bundle) op0.m42515e((Bundle) list.get(i))));
        }
        return c15566aM40508q.m40520k();
    }

    /* renamed from: b */
    public static ArrayList m27119b(Collection collection, ol7 ol7Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) ol7Var.apply(it.next()));
        }
        return arrayList;
    }
}
