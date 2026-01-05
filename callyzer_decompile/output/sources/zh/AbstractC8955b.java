package zh;

import hq.d0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l7.AbstractC4422v;
import l7.C4423w;
import mx.AbstractC4913i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zh.b */
/* loaded from: classes.dex */
public abstract class AbstractC8955b {
    /* renamed from: a */
    public static AbstractC4422v m16437a(C4423w c4423w) {
        Iterator it = AbstractC4913i.m9809e(new d0(11), c4423w).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (AbstractC4422v) next;
    }
}
