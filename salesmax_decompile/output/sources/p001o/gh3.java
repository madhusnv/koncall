package p001o;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class gh3 extends fh3 {
    /* renamed from: y */
    public static final void m28656y(List list) {
        sq8.m48649h(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: z */
    public static final void m28657z(List list, Comparator comparator) {
        sq8.m48649h(list, "<this>");
        sq8.m48649h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
