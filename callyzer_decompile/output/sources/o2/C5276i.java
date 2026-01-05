package o2;

import androidx.fragment.app.C0351p;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4154l;
import og.ud;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o2.i */
/* loaded from: classes.dex */
public final class C5276i extends AbstractC5269b {

    /* renamed from: b */
    public static final C5276i f25924b = new C5276i(new Object[0]);

    /* renamed from: a */
    public final Object[] f25925a;

    public C5276i(Object[] objArr) {
        this.f25925a = objArr;
    }

    @Override // rw.AbstractC6651a
    /* renamed from: b */
    public final int mo1628b() {
        return this.f25925a.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ud.m10975a(i10, mo1628b());
        return this.f25925a[i10];
    }

    @Override // o2.AbstractC5269b
    /* renamed from: h */
    public final AbstractC5269b mo10376h(int i10, Object obj) {
        Object[] objArr = this.f25925a;
        ud.m10976b(i10, objArr.length);
        if (i10 == objArr.length) {
            return mo10377j(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC6662l.m12720j(0, i10, 6, objArr, objArr2);
            AbstractC6662l.m12715e(i10 + 1, i10, objArr.length, objArr, objArr2);
            objArr2[i10] = obj;
            return new C5276i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        AbstractC6662l.m12715e(i10 + 1, i10, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C5272e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC6662l.m12698A(this.f25925a, obj);
    }

    @Override // o2.AbstractC5269b
    /* renamed from: j */
    public final AbstractC5269b mo10377j(Object obj) {
        Object[] objArr = this.f25925a;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new C5272e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new C5276i(objArrCopyOf);
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC6662l.m12704G(this.f25925a, obj);
    }

    @Override // rw.AbstractC6654d, java.util.List
    public final ListIterator listIterator(int i10) {
        Object[] objArr = this.f25925a;
        ud.m10976b(i10, objArr.length);
        return new C5270c(objArr, i10, objArr.length);
    }

    @Override // o2.AbstractC5269b
    /* renamed from: q */
    public final AbstractC5269b mo10378q(Collection collection) {
        Object[] objArr = this.f25925a;
        if (collection.size() + objArr.length > 32) {
            C5273f c5273fMo10379r = mo10379r();
            c5273fMo10379r.addAll(collection);
            return c5273fMo10379r.m10413j();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new C5276i(objArrCopyOf);
    }

    @Override // o2.AbstractC5269b
    /* renamed from: r */
    public final C5273f mo10379r() {
        return new C5273f(this, null, this.f25925a, 0);
    }

    @Override // o2.AbstractC5269b
    /* renamed from: s */
    public final AbstractC5269b mo10380s(C0351p c0351p) {
        Object[] objArr = this.f25925a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z6 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) c0351p.invoke(obj)).booleanValue()) {
                if (!z6) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
                    z6 = true;
                    length = i10;
                }
            } else if (z6) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f25924b : new C5276i(AbstractC6662l.m12724n(objArrCopyOf, 0, length));
    }

    @Override // o2.AbstractC5269b
    /* renamed from: t */
    public final AbstractC5269b mo10381t(int i10) {
        Object[] objArr = this.f25925a;
        ud.m10975a(i10, objArr.length);
        if (objArr.length == 1) {
            return f25924b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        AbstractC6662l.m12715e(i10, i10 + 1, objArr.length, objArr, objArrCopyOf);
        return new C5276i(objArrCopyOf);
    }

    @Override // o2.AbstractC5269b
    /* renamed from: u */
    public final AbstractC5269b mo10382u(int i10, Object obj) {
        Object[] objArr = this.f25925a;
        ud.m10975a(i10, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = obj;
        return new C5276i(objArrCopyOf);
    }
}
