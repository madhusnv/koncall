package zd;

import b00.AbstractC0532q;
import b00.C0531p;
import b00.C0538w;
import b00.a0;
import b00.h0;
import b00.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6666p;
import rw.C6661k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zd.c */
/* loaded from: classes.dex */
public final class C8939c extends AbstractC0532q {

    /* renamed from: b */
    public final AbstractC0532q f42925b;

    public C8939c(AbstractC0532q delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f42925b = delegate;
    }

    @Override // b00.AbstractC0532q
    /* renamed from: A */
    public final List mo1600A(a0 a0Var) {
        List<a0> listMo1600A = this.f42925b.mo1600A(a0Var);
        ArrayList arrayList = new ArrayList();
        for (a0 path : listMo1600A) {
            AbstractC4154l.m8923f(path, "path");
            arrayList.add(path);
        }
        AbstractC6666p.m12770t(arrayList);
        return arrayList;
    }

    @Override // b00.AbstractC0532q
    /* renamed from: J */
    public final C0531p mo1601J(a0 path) {
        AbstractC4154l.m8923f(path, "path");
        C0531p c0531pMo1601J = this.f42925b.mo1601J(path);
        if (c0531pMo1601J == null) {
            return null;
        }
        a0 a0Var = (a0) c0531pMo1601J.f3657d;
        if (a0Var == null) {
            return c0531pMo1601J;
        }
        boolean z6 = c0531pMo1601J.f3655b;
        boolean z10 = c0531pMo1601J.f3656c;
        Long l9 = (Long) c0531pMo1601J.f3658e;
        Long l10 = (Long) c0531pMo1601J.f3659f;
        Long l11 = (Long) c0531pMo1601J.f3660g;
        Long l12 = (Long) c0531pMo1601J.f3661h;
        Map extras = (Map) c0531pMo1601J.f3662i;
        AbstractC4154l.m8923f(extras, "extras");
        return new C0531p(z6, z10, a0Var, l9, l10, l11, l12, extras);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: P */
    public final C0538w mo1602P(a0 a0Var) {
        return this.f42925b.mo1602P(a0Var);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: R */
    public final h0 mo1603R(a0 a0Var) {
        a0 a0VarM1517b = a0Var.m1517b();
        if (a0VarM1517b != null) {
            C6661k c6661k = new C6661k();
            while (a0VarM1517b != null && !m1623z(a0VarM1517b)) {
                c6661k.addFirst(a0VarM1517b);
                a0VarM1517b = a0VarM1517b.m1517b();
            }
            Iterator<E> it = c6661k.iterator();
            while (it.hasNext()) {
                mo1607n((a0) it.next());
            }
        }
        return this.f42925b.mo1603R(a0Var);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: S */
    public final i0 mo1604S(a0 file) {
        AbstractC4154l.m8923f(file, "file");
        return this.f42925b.mo1604S(file);
    }

    @Override // b00.AbstractC0532q, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42925b.close();
    }

    @Override // b00.AbstractC0532q
    /* renamed from: h */
    public final h0 mo1605h(a0 file) {
        AbstractC4154l.m8923f(file, "file");
        return this.f42925b.mo1605h(file);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: j */
    public final void mo1606j(a0 source, a0 target) {
        AbstractC4154l.m8923f(source, "source");
        AbstractC4154l.m8923f(target, "target");
        this.f42925b.mo1606j(source, target);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: n */
    public final void mo1607n(a0 dir) {
        AbstractC4154l.m8923f(dir, "dir");
        this.f42925b.mo1607n(dir);
    }

    public final String toString() {
        return kotlin.jvm.internal.a0.m8901a(C8939c.class).m8914c() + '(' + this.f42925b + ')';
    }

    @Override // b00.AbstractC0532q
    /* renamed from: u */
    public final void mo1608u(a0 path) {
        AbstractC4154l.m8923f(path, "path");
        this.f42925b.mo1608u(path);
    }
}
