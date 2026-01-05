package c5;

import com.google.android.gms.internal.measurement.C1288d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c5.f */
/* loaded from: classes.dex */
public final class C0868f implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f5414a;

    /* renamed from: b */
    public int f5415b;

    /* renamed from: c */
    public Iterable f5416c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5414a) {
            case 0:
                if (this.f5415b < ((C0869g) this.f5416c).f5408e.size()) {
                }
                break;
            default:
                if (this.f5415b < ((C1288d) this.f5416c).m3220t()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5414a) {
            case 0:
                C0866d c0866d = (C0866d) ((C0869g) this.f5416c).f5408e.get(this.f5415b);
                this.f5415b++;
                return c0866d;
            default:
                C1288d c1288d = (C1288d) this.f5416c;
                if (this.f5415b < c1288d.m3220t()) {
                    int i10 = this.f5415b;
                    this.f5415b = i10 + 1;
                    return c1288d.m3221u(i10);
                }
                int i11 = this.f5415b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
                sb2.append("Out of bounds index: ");
                sb2.append(i11);
                throw new NoSuchElementException(sb2.toString());
        }
    }

    public C0868f(C1288d c1288d) {
        this.f5414a = 1;
        this.f5416c = c1288d;
        this.f5415b = 0;
    }
}
