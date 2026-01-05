package l1;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import h1.C2778i;
import java.util.concurrent.CancellationException;
import k1.d1;
import k2.e1;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4165w;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l1.j */
/* loaded from: classes.dex */
public final class C4321j extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f21772a;

    /* renamed from: b */
    public final /* synthetic */ float f21773b;

    /* renamed from: c */
    public final /* synthetic */ C4165w f21774c;

    /* renamed from: d */
    public final /* synthetic */ d1 f21775d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f21776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4321j(float f6, C4165w c4165w, d1 d1Var, InterfaceC2139c interfaceC2139c, int i10) {
        super(1);
        this.f21772a = i10;
        this.f21773b = f6;
        this.f21774c = c4165w;
        this.f21775d = d1Var;
        this.f21776e = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        float fMo8445a;
        switch (this.f21772a) {
            case 0:
                C2778i c2778i = (C2778i) obj;
                e1 e1Var = c2778i.f15457e;
                float fAbs = Math.abs(((Number) e1Var.getValue()).floatValue());
                float f6 = this.f21773b;
                float fAbs2 = Math.abs(f6);
                InterfaceC2139c interfaceC2139c = this.f21776e;
                d1 d1Var = this.f21775d;
                C4165w c4165w = this.f21774c;
                if (fAbs >= fAbs2) {
                    float fM9044d = AbstractC4323l.m9044d(((Number) e1Var.getValue()).floatValue(), f6);
                    AbstractC4323l.m9042b(c2778i, d1Var, interfaceC2139c, fM9044d - c4165w.f21161a);
                    c2778i.m6826a();
                    c4165w.f21161a = fM9044d;
                } else {
                    AbstractC4323l.m9042b(c2778i, d1Var, interfaceC2139c, ((Number) e1Var.getValue()).floatValue() - c4165w.f21161a);
                    c4165w.f21161a = ((Number) e1Var.getValue()).floatValue();
                }
                break;
            default:
                C2778i c2778i2 = (C2778i) obj;
                float fM9044d2 = AbstractC4323l.m9044d(((Number) c2778i2.f15457e.getValue()).floatValue(), this.f21773b);
                C4165w c4165w2 = this.f21774c;
                float f10 = fM9044d2 - c4165w2.f21161a;
                try {
                    fMo8445a = this.f21775d.mo8445a(f10);
                } catch (CancellationException unused) {
                    c2778i2.m6826a();
                    fMo8445a = DefinitionKt.NO_Float_VALUE;
                }
                this.f21776e.invoke(Float.valueOf(fMo8445a));
                if (Math.abs(f10 - fMo8445a) > 0.5f || fM9044d2 != ((Number) c2778i2.f15457e.getValue()).floatValue()) {
                    c2778i2.m6826a();
                }
                c4165w2.f21161a += fMo8445a;
                break;
        }
        return a0.f30746a;
    }
}
