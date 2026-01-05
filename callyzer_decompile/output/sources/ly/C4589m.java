package ly;

import hy.InterfaceC3055f;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import ky.AbstractC4281m;
import ky.C4273e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.m */
/* loaded from: classes3.dex */
public final class C4589m extends AbstractC4577a {

    /* renamed from: f */
    public final C4273e f22724f;

    /* renamed from: g */
    public final int f22725g;

    /* renamed from: h */
    public int f22726h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4589m(AbstractC4271c json, C4273e c4273e) {
        super(json, null);
        AbstractC4154l.m8923f(json, "json");
        this.f22724f = c4273e;
        this.f22725g = c4273e.f21670a.size();
        this.f22726h = -1;
    }

    @Override // ly.AbstractC4577a
    /* renamed from: E */
    public final AbstractC4281m mo9400E(String tag) throws NumberFormatException {
        AbstractC4154l.m8923f(tag, "tag");
        return (AbstractC4281m) this.f22724f.f21670a.get(Integer.parseInt(tag));
    }

    @Override // ly.AbstractC4577a
    /* renamed from: Q */
    public final String mo9412Q(InterfaceC3055f descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // ly.AbstractC4577a
    /* renamed from: S */
    public final AbstractC4281m mo9414S() {
        return this.f22724f;
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: o */
    public final int mo7685o(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        int i10 = this.f22726h;
        if (i10 >= this.f22725g - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f22726h = i11;
        return i11;
    }
}
