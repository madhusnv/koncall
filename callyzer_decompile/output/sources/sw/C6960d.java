package sw;

import c6.k0;
import fx.InterfaceC2395a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sw.d */
/* loaded from: classes3.dex */
public final class C6960d extends k0 implements Iterator, InterfaceC2395a {

    /* renamed from: e */
    public final /* synthetic */ int f33703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6960d(C6962f c6962f, int i10) {
        super(c6962f);
        this.f33703e = i10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f33703e) {
            case 0:
                m2433b();
                int i10 = this.f5478a;
                C6962f c6962f = (C6962f) this.f5481d;
                if (i10 >= c6962f.f33713f) {
                    throw new NoSuchElementException();
                }
                this.f5478a = i10 + 1;
                this.f5479b = i10;
                C6961e c6961e = new C6961e(c6962f, i10);
                m2434h();
                return c6961e;
            case 1:
                m2433b();
                int i11 = this.f5478a;
                C6962f c6962f2 = (C6962f) this.f5481d;
                if (i11 >= c6962f2.f33713f) {
                    throw new NoSuchElementException();
                }
                this.f5478a = i11 + 1;
                this.f5479b = i11;
                Object obj = c6962f2.f33708a[i11];
                m2434h();
                return obj;
            default:
                m2433b();
                int i12 = this.f5478a;
                C6962f c6962f3 = (C6962f) this.f5481d;
                if (i12 >= c6962f3.f33713f) {
                    throw new NoSuchElementException();
                }
                this.f5478a = i12 + 1;
                this.f5479b = i12;
                Object[] objArr = c6962f3.f33709b;
                AbstractC4154l.m8920c(objArr);
                Object obj2 = objArr[this.f5479b];
                m2434h();
                return obj2;
        }
    }
}
