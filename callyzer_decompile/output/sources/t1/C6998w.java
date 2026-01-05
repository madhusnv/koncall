package t1;

import a1.C0007f;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import gx.AbstractC2747a;
import k2.a1;
import kotlin.jvm.internal.AbstractC4155m;
import og.fg;
import pg.w9;
import s1.f0;
import u2.AbstractC7311h;
import u2.AbstractC7321r;
import v3.g0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.w */
/* loaded from: classes.dex */
public final class C6998w extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f33883a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC7000y f33884b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6998w(AbstractC7000y abstractC7000y, int i10) {
        super(1);
        this.f33883a = i10;
        this.f33884b = abstractC7000y;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        C6993r c6993r;
        switch (this.f33883a) {
            case 0:
                f0 f0Var = (f0) obj;
                AbstractC7000y abstractC7000y = this.f33884b;
                AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
                InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
                AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
                try {
                    f0Var.m12847a(abstractC7000y.f33902e);
                    AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                    return qw.a0.f30746a;
                } catch (Throwable th2) {
                    AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
                    throw th2;
                }
            default:
                float fFloatValue = ((Number) obj).floatValue();
                AbstractC7000y abstractC7000y2 = this.f33884b;
                long jM10655a = fg.m10655a(abstractC7000y2);
                float f6 = abstractC7000y2.f33906i + fFloatValue;
                long jM6748l = AbstractC2747a.m6748l(f6);
                abstractC7000y2.f33906i = f6 - jM6748l;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j6 = jM10655a + jM6748l;
                    long jM11913d = w9.m11913d(j6, abstractC7000y2.f33905h, abstractC7000y2.f33904g);
                    boolean z6 = j6 != jM11913d;
                    long j10 = jM11913d - jM10655a;
                    float f10 = j10;
                    abstractC7000y2.f33907j = f10;
                    long jAbs = Math.abs(j10);
                    float fM13266n = DefinitionKt.NO_Float_VALUE;
                    if (jAbs != 0) {
                        abstractC7000y2.f33896F.setValue(Boolean.valueOf(f10 > DefinitionKt.NO_Float_VALUE));
                        abstractC7000y2.f33897G.setValue(Boolean.valueOf(f10 < DefinitionKt.NO_Float_VALUE));
                    }
                    int i10 = (int) j10;
                    int i11 = -i10;
                    C6993r c6993rM13255a = ((C6993r) abstractC7000y2.f33913p.getValue()).m13255a(i11);
                    if (c6993rM13255a != null && (c6993r = abstractC7000y2.f33899b) != null) {
                        C6993r c6993rM13255a2 = c6993r.m13255a(i11);
                        if (c6993rM13255a2 != null) {
                            abstractC7000y2.f33899b = c6993rM13255a2;
                        } else {
                            c6993rM13255a = null;
                        }
                    }
                    if (c6993rM13255a != null) {
                        abstractC7000y2.m13261h(c6993rM13255a, abstractC7000y2.f33898a, true);
                        abstractC7000y2.f33892B.setValue(qw.a0.f30746a);
                    } else {
                        C0007f c0007f = abstractC7000y2.f33901d;
                        AbstractC7000y abstractC7000y3 = (AbstractC7000y) c0007f.f37b;
                        a1 a1Var = (a1) c0007f.f39d;
                        if (abstractC7000y3.m13266n() != 0) {
                            fM13266n = i10 / abstractC7000y3.m13266n();
                        }
                        a1Var.m8491g(a1Var.m8490f() + fM13266n);
                        g0 g0Var = (g0) abstractC7000y2.f33921x.getValue();
                        if (g0Var != null) {
                            g0Var.m14600l();
                        }
                    }
                    fFloatValue = (z6 ? Long.valueOf(j10) : Float.valueOf(fFloatValue)).floatValue();
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
