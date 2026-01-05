package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.z4;
import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.d */
/* loaded from: classes.dex */
public final class C0309d implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f2306a = 0;

    /* renamed from: b */
    public int f2307b = 0;

    /* renamed from: c */
    public final int f2308c;

    /* renamed from: d */
    public final /* synthetic */ Object f2309d;

    public C0309d(z4 z4Var) {
        this.f2309d = z4Var;
        this.f2308c = z4Var.mo3794c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2306a) {
            case 0:
                if (this.f2307b < this.f2308c) {
                }
                break;
            case 1:
                if (this.f2307b < this.f2308c) {
                }
                break;
            case 2:
                if (this.f2307b < this.f2308c) {
                }
                break;
            default:
                if (this.f2307b < this.f2308c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2306a) {
            case 0:
                int i10 = this.f2307b;
                if (i10 >= this.f2308c) {
                    throw new NoSuchElementException();
                }
                this.f2307b = i10 + 1;
                return Byte.valueOf(((C0312g) this.f2309d).mo868h(i10));
            case 1:
                int i11 = this.f2307b;
                if (i11 >= this.f2308c) {
                    throw new NoSuchElementException();
                }
                this.f2307b = i11 + 1;
                return Byte.valueOf(((z4) this.f2309d).mo3793b(i11));
            case 2:
                int i12 = this.f2307b;
                if (i12 >= this.f2308c) {
                    throw new NoSuchElementException();
                }
                this.f2307b = i12 + 1;
                return Byte.valueOf(((AbstractC1382i) this.f2309d).mo4226g(i12));
            default:
                int i13 = this.f2307b;
                if (i13 >= this.f2308c) {
                    throw new NoSuchElementException();
                }
                this.f2307b = i13 + 1;
                return Byte.valueOf(((mg.u0) this.f2309d).mo9645b(i13));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2306a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0309d(mg.u0 u0Var) {
        this.f2309d = u0Var;
        this.f2308c = u0Var.mo9647e();
    }

    public C0309d(C0312g c0312g) {
        this.f2309d = c0312g;
        this.f2308c = c0312g.size();
    }

    public C0309d(AbstractC1382i abstractC1382i) {
        this.f2309d = abstractC1382i;
        this.f2308c = abstractC1382i.size();
    }
}
