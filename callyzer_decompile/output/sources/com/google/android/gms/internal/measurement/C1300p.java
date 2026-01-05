package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.p */
/* loaded from: classes.dex */
public final class C1300p implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f6338a;

    /* renamed from: b */
    public int f6339b = 0;

    /* renamed from: c */
    public final /* synthetic */ C1301q f6340c;

    public /* synthetic */ C1300p(C1301q c1301q, int i10) {
        this.f6338a = i10;
        this.f6340c = c1301q;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6338a) {
            case 0:
                if (this.f6339b < this.f6340c.f6347a.length()) {
                }
                break;
            default:
                if (this.f6339b < this.f6340c.f6347a.length()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f6338a) {
            case 0:
                String str = this.f6340c.f6347a;
                int i10 = this.f6339b;
                if (i10 >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f6339b = i10 + 1;
                return new C1301q(String.valueOf(i10));
            default:
                C1301q c1301q = this.f6340c;
                String str2 = c1301q.f6347a;
                int i11 = this.f6339b;
                if (i11 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f6339b = i11 + 1;
                return new C1301q(String.valueOf(c1301q.f6347a.charAt(i11)));
        }
    }
}
