package g2;

import android.graphics.Matrix;
import android.graphics.Path;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d3.C1555i;
import ex.InterfaceC2139c;
import g4.C2486b;
import g4.C2503s;
import gx.AbstractC2747a;
import h4.C2841r;
import kotlin.jvm.internal.AbstractC4155m;
import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b7 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11254a;

    /* renamed from: b */
    public final /* synthetic */ Object f11255b;

    /* renamed from: c */
    public final /* synthetic */ int f11256c;

    /* renamed from: d */
    public final /* synthetic */ int f11257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(int i10, t3.w0 w0Var, int i11) {
        super(1);
        this.f11254a = 0;
        this.f11256c = i10;
        this.f11255b = w0Var;
        this.f11257d = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f11254a) {
            case 0:
                ((t3.v0) obj).m13324d((t3.w0) this.f11255b, AbstractC2747a.m6747k((this.f11256c - r0.f34030a) / 2.0f), AbstractC2747a.m6747k((this.f11257d - r0.f34031b) / 2.0f), DefinitionKt.NO_Float_VALUE);
                break;
            case 1:
                t3.v0.m13320h((t3.v0) obj, (t3.w0) this.f11255b, this.f11256c, this.f11257d);
                break;
            case 2:
                ((t3.v0) obj).m13324d((t3.w0) this.f11255b, this.f11256c, this.f11257d, DefinitionKt.NO_Float_VALUE);
                break;
            case 3:
                ((t3.v0) obj).m13324d((t3.w0) this.f11255b, this.f11256c, this.f11257d, DefinitionKt.NO_Float_VALUE);
                break;
            default:
                C2503s c2503s = (C2503s) obj;
                C1555i c1555i = (C1555i) this.f11255b;
                C2486b c2486b = c2503s.f13709a;
                int iM6482d = c2503s.m6482d(this.f11256c);
                int iM6482d2 = c2503s.m6482d(this.f11257d);
                CharSequence charSequence = c2486b.f13559e;
                if (iM6482d < 0 || iM6482d > iM6482d2 || iM6482d2 > charSequence.length()) {
                    StringBuilder sbM4566m = AbstractC1452a.m4566m(iM6482d, iM6482d2, "start(", ") or end(", ") is out of range [0..");
                    sbM4566m.append(charSequence.length());
                    sbM4566m.append("], or start > end!");
                    AbstractC4646a.m9525a(sbM4566m.toString());
                }
                Path path = new Path();
                C2841r c2841r = c2486b.f13558d;
                c2841r.f15832f.getSelectionPath(iM6482d, iM6482d2, path);
                int i10 = c2841r.f15834h;
                if (i10 != 0 && !path.isEmpty()) {
                    path.offset(DefinitionKt.NO_Float_VALUE, i10);
                }
                float f6 = c2503s.f13714f;
                long jFloatToRawIntBits = (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                Path path2 = c1555i.f7752a;
                int i11 = (int) 0;
                path2.addPath(path, Float.intBitsToFloat(i11), Float.intBitsToFloat(i11));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7(Object obj, int i10, int i11, int i12) {
        super(1);
        this.f11254a = i12;
        this.f11255b = obj;
        this.f11256c = i10;
        this.f11257d = i11;
    }
}
