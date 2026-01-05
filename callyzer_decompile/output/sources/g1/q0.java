package g1;

import b2.C0566x;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1561o;
import ex.InterfaceC2139c;
import f3.AbstractC2199e;
import f3.C2196b;
import f3.C2201g;
import f3.InterfaceC2198d;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11055a;

    /* renamed from: b */
    public final /* synthetic */ long f11056b;

    /* renamed from: c */
    public final /* synthetic */ long f11057c;

    /* renamed from: d */
    public final /* synthetic */ Object f11058d;

    /* renamed from: e */
    public final /* synthetic */ Object f11059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, long j6, long j10, Object obj2, int i10) {
        super(1);
        this.f11055a = i10;
        this.f11058d = obj;
        this.f11056b = j6;
        this.f11057c = j10;
        this.f11059e = obj2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f11055a) {
            case 0:
                t3.w0 w0Var = (t3.w0) this.f11058d;
                long j6 = this.f11056b;
                long j10 = this.f11057c;
                ((t3.v0) obj).m13325j(w0Var, ((int) (j6 >> 32)) + ((int) (j10 >> 32)), ((int) (j6 & 4294967295L)) + ((int) (j10 & 4294967295L)), DefinitionKt.NO_Float_VALUE, (C0566x) this.f11059e);
                break;
            default:
                v3.i0 i0Var = (v3.i0) obj;
                i0Var.m14622b();
                AbstractC1561o abstractC1561o = (AbstractC1561o) this.f11058d;
                AbstractC2199e abstractC2199e = (AbstractC2199e) this.f11059e;
                long j11 = (104 & 2) != 0 ? 0L : this.f11056b;
                long jM5907K = (104 & 4) != 0 ? InterfaceC2198d.m5907K(i0Var.f36917a.mo5913e(), j11) : this.f11057c;
                float f6 = (104 & 8) != 0 ? 1.0f : DefinitionKt.NO_Float_VALUE;
                if ((104 & 16) != 0) {
                    abstractC2199e = C2201g.f10129a;
                }
                C2196b c2196b = i0Var.f36917a;
                int i10 = (int) (j11 >> 32);
                int i11 = (int) (j11 & 4294967295L);
                c2196b.f10123a.f10121c.mo5100a(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (jM5907K >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (jM5907K & 4294967295L)) + Float.intBitsToFloat(i11), c2196b.m5900c(abstractC1561o, abstractC2199e, f6, null, 3, 1));
                break;
        }
        return qw.a0.f30746a;
    }
}
