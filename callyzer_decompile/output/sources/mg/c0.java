package mg;

import java.util.Iterator;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC4737p {

    /* renamed from: d */
    public final transient Object f23635d;

    public c0(Object obj) {
        this.f23635d = obj;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: a */
    public final int mo9588a(Object[] objArr) {
        objArr[0] = this.f23635d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f23635d.equals(obj);
    }

    @Override // mg.AbstractC4730i
    /* renamed from: e */
    public final e0 mo9591e() {
        return new C4742u(this.f23635d);
    }

    @Override // mg.AbstractC4737p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f23635d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C4742u(this.f23635d);
    }

    @Override // mg.AbstractC4737p
    /* renamed from: k */
    public final AbstractC4735n mo9593k() {
        Object[] objArr = {this.f23635d};
        for (int i10 = 0; i10 < 1; i10++) {
            C4731j c4731j = AbstractC4735n.f23678b;
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC4801l.m9730d(i10, "at index "));
            }
        }
        return AbstractC4735n.m9626k(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC5601a.m11238i("[", this.f23635d.toString(), "]");
    }
}
