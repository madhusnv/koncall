package g2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import h2.C2813r;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t7 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ float f12757a;

    /* renamed from: b */
    public final /* synthetic */ long f12758b;

    /* renamed from: c */
    public final /* synthetic */ ja f12759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(float f6, long j6, ja jaVar) {
        super(1);
        this.f12757a = f6;
        this.f12758b = j6;
        this.f12759c = jaVar;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        C2813r c2813r = (C2813r) obj;
        ka kaVar = ka.Hidden;
        float f6 = this.f12757a;
        Float fValueOf = Float.valueOf(f6);
        LinkedHashMap linkedHashMap = c2813r.f15766a;
        LinkedHashMap linkedHashMap2 = c2813r.f15766a;
        linkedHashMap.put(kaVar, fValueOf);
        int i10 = (int) (this.f12758b & 4294967295L);
        float f10 = i10;
        if (f10 > f6 / 2 && !this.f12759c.f11871a) {
            linkedHashMap2.put(ka.PartiallyExpanded, Float.valueOf(f6 / 2.0f));
        }
        if (i10 != 0) {
            linkedHashMap2.put(ka.Expanded, Float.valueOf(Math.max(DefinitionKt.NO_Float_VALUE, f6 - f10)));
        }
        return qw.a0.f30746a;
    }
}
