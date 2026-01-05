package p001o;

/* loaded from: classes3.dex */
public final class cvf extends pf8 {

    /* renamed from: c */
    public final transient Object f18723c;

    public cvf(Object obj) {
        this.f18723c = dgd.m23062o(obj);
    }

    @Override // p001o.pf8, p001o.if8
    /* renamed from: b */
    public nf8 mo21881b() {
        return nf8.m40500F(this.f18723c);
    }

    @Override // p001o.if8, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f18723c.equals(obj);
    }

    @Override // p001o.if8
    /* renamed from: d */
    public int mo21882d(Object[] objArr, int i) {
        objArr[i] = this.f18723c;
        return i + 1;
    }

    @Override // p001o.pf8, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18723c.hashCode();
    }

    @Override // p001o.if8
    /* renamed from: l */
    public boolean mo21883l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public q4i iterator() {
        return e69.m24392p(this.f18723c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f18723c.toString() + ']';
    }

    @Override // p001o.pf8, p001o.if8
    public Object writeReplace() {
        return super.writeReplace();
    }
}
