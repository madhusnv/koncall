package i2;

import a1.C0005d;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import h1.C2772c;
import h1.y1;
import i0.m0;
import kotlin.jvm.internal.AbstractC4155m;
import nf.C5047i;
import qw.a0;
import v3.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i2.d */
/* loaded from: classes.dex */
public final class C3151d extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: b */
    public static final C3151d f17033b;

    /* renamed from: c */
    public static final C3151d f17034c;

    /* renamed from: a */
    public final /* synthetic */ int f17035a;

    static {
        int i10 = 1;
        f17033b = new C3151d(i10, 0);
        f17034c = new C3151d(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3151d(int i10, int i11) {
        super(i10);
        this.f17035a = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f17035a) {
            case 0:
                i0 i0Var = (i0) obj;
                C0005d c0005d = i0Var.f36917a.f10124b;
                long jM81z = c0005d.m81z();
                c0005d.m75t().mo5107i();
                try {
                    ((C0005d) ((C5047i) c0005d.f24b).f24823b).m75t().mo5111m(-3.4028235E38f, DefinitionKt.NO_Float_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    i0Var.m14622b();
                    m0.m7392y(c0005d, jM81z);
                    return a0.f30746a;
                } catch (Throwable th2) {
                    m0.m7392y(c0005d, jM81z);
                    throw th2;
                }
            default:
                return new C3163p(new C2772c(Float.valueOf(((Number) obj).floatValue()), y1.f15664a, null, 12));
        }
    }
}
