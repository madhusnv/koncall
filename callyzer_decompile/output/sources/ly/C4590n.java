package ly;

import hy.InterfaceC3055f;
import java.util.List;
import jy.C3889z;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import ky.AbstractC4281m;
import ky.AbstractC4282n;
import ky.C4286r;
import ky.C4294z;
import rw.AbstractC6663m;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.n */
/* loaded from: classes3.dex */
public final class C4590n extends C4588l {

    /* renamed from: j */
    public final C4294z f22727j;

    /* renamed from: k */
    public final List f22728k;

    /* renamed from: l */
    public final int f22729l;

    /* renamed from: m */
    public int f22730m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4590n(AbstractC4271c json, C4294z c4294z) {
        super(json, c4294z, (String) null, 12);
        AbstractC4154l.m8923f(json, "json");
        this.f22727j = c4294z;
        List listC0 = AbstractC6663m.c0(c4294z.f21699a.keySet());
        this.f22728k = listC0;
        this.f22729l = listC0.size() * 2;
        this.f22730m = -1;
    }

    @Override // ly.C4588l, ly.AbstractC4577a
    /* renamed from: E */
    public final AbstractC4281m mo9400E(String tag) {
        AbstractC4154l.m8923f(tag, "tag");
        if (this.f22730m % 2 != 0) {
            return (AbstractC4281m) AbstractC6674x.m12774b(this.f22727j, tag);
        }
        C3889z c3889z = AbstractC4282n.f21688a;
        return new C4286r(tag, true);
    }

    @Override // ly.C4588l, ly.AbstractC4577a
    /* renamed from: Q */
    public final String mo9412Q(InterfaceC3055f descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return (String) this.f22728k.get(i10 / 2);
    }

    @Override // ly.C4588l, ly.AbstractC4577a
    /* renamed from: S */
    public final AbstractC4281m mo9414S() {
        return this.f22727j;
    }

    @Override // ly.C4588l
    /* renamed from: X */
    public final C4294z mo9414S() {
        return this.f22727j;
    }

    @Override // ly.C4588l, ly.AbstractC4577a, iy.InterfaceC3364a
    /* renamed from: b */
    public final void mo7680b(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
    }

    @Override // ly.C4588l, iy.InterfaceC3364a
    /* renamed from: o */
    public final int mo7685o(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        int i10 = this.f22730m;
        if (i10 >= this.f22729l - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f22730m = i11;
        return i11;
    }
}
