package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class zh8 implements Iterable, sb9 {

    /* renamed from: a */
    public final uk7 f57193a;

    public zh8(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "iteratorFactory");
        this.f57193a = uk7Var;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new ai8((Iterator) this.f57193a.invoke());
    }
}
