package e1;

import fx.InterfaceC2395a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jy.C3883t;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6368r;
import qw.C6370t;
import qw.C6372v;
import qw.C6375y;
import rw.AbstractC6654d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class x0 implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f9081a;

    /* renamed from: b */
    public int f9082b;

    /* renamed from: c */
    public final Object f9083c;

    public /* synthetic */ x0(int i10, Object obj) {
        this.f9081a = i10;
        this.f9083c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9081a) {
            case 0:
                if (this.f9082b < ((v0) this.f9083c).m5649f()) {
                }
                break;
            case 1:
                if (this.f9082b > 0) {
                }
                break;
            case 2:
                if (this.f9082b < ((Object[]) this.f9083c).length) {
                }
                break;
            case 3:
                if (this.f9082b < ((byte[]) this.f9083c).length) {
                }
                break;
            case 4:
                if (this.f9082b < ((int[]) this.f9083c).length) {
                }
                break;
            case 5:
                if (this.f9082b < ((long[]) this.f9083c).length) {
                }
                break;
            case 6:
                if (this.f9082b < ((short[]) this.f9083c).length) {
                }
                break;
            default:
                if (this.f9082b < ((AbstractC6654d) this.f9083c).mo1628b()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9081a) {
            case 0:
                v0 v0Var = (v0) this.f9083c;
                int i10 = this.f9082b;
                this.f9082b = i10 + 1;
                return v0Var.m5650g(i10);
            case 1:
                C3883t c3883t = (C3883t) this.f9083c;
                int i11 = c3883t.f19943c;
                int i12 = this.f9082b;
                this.f9082b = i12 - 1;
                return c3883t.f19945e[i11 - i12];
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f9083c;
                    int i13 = this.f9082b;
                    this.f9082b = i13 + 1;
                    return objArr[i13];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f9082b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            case 3:
                int i14 = this.f9082b;
                byte[] bArr = (byte[]) this.f9083c;
                if (i14 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9082b));
                }
                this.f9082b = i14 + 1;
                return new C6368r(bArr[i14]);
            case 4:
                int i15 = this.f9082b;
                int[] iArr = (int[]) this.f9083c;
                if (i15 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9082b));
                }
                this.f9082b = i15 + 1;
                return new C6370t(iArr[i15]);
            case 5:
                int i16 = this.f9082b;
                long[] jArr = (long[]) this.f9083c;
                if (i16 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9082b));
                }
                this.f9082b = i16 + 1;
                return new C6372v(jArr[i16]);
            case 6:
                int i17 = this.f9082b;
                short[] sArr = (short[]) this.f9083c;
                if (i17 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f9082b));
                }
                this.f9082b = i17 + 1;
                return new C6375y(sArr[i17]);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC6654d abstractC6654d = (AbstractC6654d) this.f9083c;
                int i18 = this.f9082b;
                this.f9082b = i18 + 1;
                return abstractC6654d.get(i18);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9081a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x0(Object[] array) {
        this.f9081a = 2;
        AbstractC4154l.m8923f(array, "array");
        this.f9083c = array;
    }

    public x0(C3883t c3883t) {
        this.f9081a = 1;
        this.f9083c = c3883t;
        this.f9082b = c3883t.f19943c;
    }
}
