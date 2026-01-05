package p2;

import e1.C1918t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.m */
/* loaded from: classes.dex */
public final class C5801m extends AbstractC5800l {

    /* renamed from: d */
    public final /* synthetic */ int f28406d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f28406d) {
            case 0:
                int i10 = this.f28405c;
                this.f28405c = i10 + 2;
                Object[] objArr = this.f28403a;
                return new C1918t(1, objArr[i10], objArr[i10 + 1]);
            case 1:
                int i11 = this.f28405c;
                this.f28405c = i11 + 2;
                return this.f28403a[i11];
            default:
                int i12 = this.f28405c;
                this.f28405c = i12 + 2;
                return this.f28403a[i12 + 1];
        }
    }
}
