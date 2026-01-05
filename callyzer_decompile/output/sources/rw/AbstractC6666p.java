package rw;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.p */
/* loaded from: classes3.dex */
public abstract class AbstractC6666p extends AbstractC6665o {
    /* renamed from: t */
    public static void m12770t(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: u */
    public static void m12771u(List list, Comparator comparator) {
        AbstractC4154l.m8923f(list, "<this>");
        AbstractC4154l.m8923f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
