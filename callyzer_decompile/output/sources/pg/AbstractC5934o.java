package pg;

import a2.AbstractC0030c;
import hd.C2898j;
import hd.C2899k;
import hd.C2900l;
import hd.C2901m;
import hd.C2902n;
import hd.C2903o;
import hd.C2904p;
import hd.C2905q;
import hd.C2906r;
import hd.C2907s;
import kotlin.NoWhenBranchMatchedException;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.o */
/* loaded from: classes.dex */
public abstract class AbstractC5934o {

    /* renamed from: a */
    public final /* synthetic */ int f29003a = 1;

    /* renamed from: a */
    public static final EnumC7204p m11804a(int i10, int i11) {
        EnumC7204p enumC7204p = EnumC7204p.ALL;
        if (i10 != enumC7204p.ordinal()) {
            EnumC7204p enumC7204p2 = EnumC7204p.SIM1;
            if (i10 == enumC7204p2.ordinal()) {
                return enumC7204p2;
            }
            EnumC7204p enumC7204p3 = EnumC7204p.SIM2;
            if (i10 == enumC7204p3.ordinal()) {
                return enumC7204p3;
            }
            EnumC7204p enumC7204p4 = EnumC7204p.DEFAULT;
            if (i10 == enumC7204p4.ordinal() || i11 <= 2) {
                return enumC7204p4;
            }
        }
        return enumC7204p;
    }

    public String toString() {
        switch (this.f29003a) {
            case 1:
                if (equals(C2898j.f15932b)) {
                    return "BeginArray";
                }
                if (equals(C2901m.f15935b)) {
                    return "EndArray";
                }
                if (equals(C2899k.f15933b)) {
                    return "BeginObject";
                }
                if (equals(C2903o.f15937b)) {
                    return "EndObject";
                }
                if (this instanceof C2904p) {
                    return AbstractC0030c.m123n(new StringBuilder("Name("), ((C2904p) this).f15938b, ')');
                }
                if (this instanceof C2907s) {
                    return AbstractC0030c.m123n(new StringBuilder("String("), ((C2907s) this).f15941b, ')');
                }
                if (this instanceof C2906r) {
                    return AbstractC0030c.m123n(new StringBuilder("Number("), ((C2906r) this).f15940b, ')');
                }
                if (this instanceof C2900l) {
                    return i0.m0.m7382o(new StringBuilder("Bool("), ((C2900l) this).f15934b, ')');
                }
                if (equals(C2905q.f15939b)) {
                    return "Null";
                }
                if (equals(C2902n.f15936b)) {
                    return "EndDocument";
                }
                throw new NoWhenBranchMatchedException();
            default:
                return super.toString();
        }
    }
}
