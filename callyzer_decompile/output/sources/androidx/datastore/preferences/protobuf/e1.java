package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.k6;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.g2;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f2314a;

    /* renamed from: b */
    public int f2315b;

    /* renamed from: c */
    public boolean f2316c;

    /* renamed from: d */
    public Iterator f2317d;

    /* renamed from: e */
    public final /* synthetic */ AbstractMap f2318e;

    public /* synthetic */ e1(AbstractMap abstractMap, int i10) {
        this.f2314a = i10;
        this.f2318e = abstractMap;
        this.f2315b = -1;
    }

    /* renamed from: a */
    public Iterator m863a() {
        if (this.f2317d == null) {
            this.f2317d = ((c1) this.f2318e).f2302b.entrySet().iterator();
        }
        return this.f2317d;
    }

    /* renamed from: b */
    public Iterator m864b() {
        switch (this.f2314a) {
            case 1:
                if (this.f2317d == null) {
                    this.f2317d = ((k6) this.f2318e).f6267c.entrySet().iterator();
                }
                break;
            default:
                if (this.f2317d == null) {
                    this.f2317d = ((g2) this.f2318e).f6539c.entrySet().iterator();
                }
                break;
        }
        return this.f2317d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2314a) {
            case 0:
                int i10 = this.f2315b + 1;
                c1 c1Var = (c1) this.f2318e;
                if (i10 >= c1Var.f2301a.size()) {
                    if (c1Var.f2302b.isEmpty() || !m863a().hasNext()) {
                    }
                }
                break;
            case 1:
                int i11 = this.f2315b + 1;
                k6 k6Var = (k6) this.f2318e;
                if (i11 >= k6Var.f6266b) {
                    if (k6Var.f6267c.isEmpty() || !m864b().hasNext()) {
                        break;
                    }
                }
                break;
            default:
                int i12 = this.f2315b + 1;
                g2 g2Var = (g2) this.f2318e;
                if (i12 >= g2Var.f6538b) {
                    if (g2Var.f6539c.isEmpty() || !m864b().hasNext()) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2314a) {
            case 0:
                this.f2316c = true;
                int i10 = this.f2315b + 1;
                this.f2315b = i10;
                c1 c1Var = (c1) this.f2318e;
                if (i10 >= c1Var.f2301a.size()) {
                    break;
                } else {
                    break;
                }
            case 1:
                this.f2316c = true;
                int i11 = this.f2315b + 1;
                this.f2315b = i11;
                k6 k6Var = (k6) this.f2318e;
                if (i11 >= k6Var.f6266b) {
                    break;
                } else {
                    break;
                }
            default:
                this.f2316c = true;
                int i12 = this.f2315b + 1;
                this.f2315b = i12;
                g2 g2Var = (g2) this.f2318e;
                if (i12 >= g2Var.f6538b) {
                    break;
                } else {
                    break;
                }
        }
        return (Map.Entry) m864b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f2314a;
        AbstractMap abstractMap = this.f2318e;
        switch (i10) {
            case 0:
                c1 c1Var = (c1) abstractMap;
                if (!this.f2316c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f2316c = false;
                int i11 = c1.f2300f;
                c1Var.m855d();
                if (this.f2315b >= c1Var.f2301a.size()) {
                    m863a().remove();
                    return;
                }
                int i12 = this.f2315b;
                this.f2315b = i12 - 1;
                c1Var.m860n(i12);
                return;
            case 1:
                if (!this.f2316c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f2316c = false;
                k6 k6Var = (k6) abstractMap;
                k6Var.m3477j();
                int i13 = this.f2315b;
                if (i13 >= k6Var.f6266b) {
                    m864b().remove();
                    return;
                } else {
                    this.f2315b = i13 - 1;
                    k6Var.m3475h(i13);
                    return;
                }
            default:
                g2 g2Var = (g2) abstractMap;
                if (!this.f2316c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f2316c = false;
                int i14 = g2.f6536g;
                g2Var.m3890l();
                int i15 = this.f2315b;
                if (i15 >= g2Var.f6538b) {
                    m864b().remove();
                    return;
                } else {
                    this.f2315b = i15 - 1;
                    g2Var.m3888i(i15);
                    return;
                }
        }
    }

    public /* synthetic */ e1(k6 k6Var) {
        this.f2314a = 1;
        Objects.requireNonNull(k6Var);
        this.f2318e = k6Var;
        this.f2315b = -1;
    }
}
