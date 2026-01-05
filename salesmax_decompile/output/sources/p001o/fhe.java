package p001o;

import java.util.Objects;

/* loaded from: classes3.dex */
public class fhe extends nf8 {

    /* renamed from: e */
    public static final nf8 f23343e = new fhe(new Object[0], 0);

    /* renamed from: c */
    public final transient Object[] f23344c;

    /* renamed from: d */
    public final transient int f23345d;

    public fhe(Object[] objArr, int i) {
        this.f23344c = objArr;
        this.f23345d = i;
    }

    @Override // p001o.nf8, p001o.if8
    /* renamed from: d */
    public int mo21882d(Object[] objArr, int i) {
        System.arraycopy(this.f23344c, 0, objArr, i, this.f23345d);
        return i + this.f23345d;
    }

    @Override // p001o.if8
    /* renamed from: e */
    public Object[] mo26704e() {
        return this.f23344c;
    }

    @Override // java.util.List
    public Object get(int i) {
        dgd.m23060m(i, this.f23345d);
        Object obj = this.f23344c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p001o.if8
    /* renamed from: i */
    public int mo26705i() {
        return this.f23345d;
    }

    @Override // p001o.if8
    /* renamed from: j */
    public int mo26706j() {
        return 0;
    }

    @Override // p001o.if8
    /* renamed from: l */
    public boolean mo21883l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f23345d;
    }

    @Override // p001o.nf8, p001o.if8
    public Object writeReplace() {
        return super.writeReplace();
    }
}
