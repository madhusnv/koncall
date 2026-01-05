package p001o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class xg3 extends ug3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg3(dc9 dc9Var) {
        super(dc9Var, null);
        sq8.m48649h(dc9Var, "element");
    }

    @Override // p001o.c7
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator mo20353d(Collection collection) {
        sq8.m48649h(collection, "<this>");
        return collection.iterator();
    }

    @Override // p001o.c7
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int mo19320e(Collection collection) {
        sq8.m48649h(collection, "<this>");
        return collection.size();
    }
}
