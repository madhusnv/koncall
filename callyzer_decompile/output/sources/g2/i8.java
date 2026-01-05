package g2;

import androidx.compose.ui.layout.AbstractC0264a;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import gx.AbstractC2747a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.AbstractC6753i;
import s4.C6745a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i8 implements t3.j0 {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2137a f11806a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2141e f11807b;

    /* renamed from: c */
    public final /* synthetic */ boolean f11808c;

    public i8(InterfaceC2137a interfaceC2137a, InterfaceC2141e interfaceC2141e, boolean z6) {
        this.f11806a = interfaceC2137a;
        this.f11807b = interfaceC2141e;
        this.f11808c = z6;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        Object obj;
        t3.w0 w0VarMo13314z;
        t3.w0 w0VarMo13314z2;
        i8 i8Var = this;
        float fFloatValue = ((Number) i8Var.f11806a.invoke()).floatValue();
        long jM12911b = C6745a.m12911b(j6, 0, 0, 0, 0, 10);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            t3.i0 i0Var = (t3.i0) list.get(i10);
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a(i0Var), "icon")) {
                t3.w0 w0VarMo13314z3 = i0Var.mo13314z(jM12911b);
                char c2 = 2;
                float f6 = 2;
                int iE0 = l0Var.e0(l8.f12009d * f6) + w0VarMo13314z3.f34030a;
                int iM6747k = AbstractC2747a.m6747k(iE0 * fFloatValue);
                int iE02 = l0Var.e0(l8.f12010e * f6) + w0VarMo13314z3.f34031b;
                int size2 = list.size();
                int i11 = 0;
                while (i11 < size2) {
                    t3.i0 i0Var2 = (t3.i0) list.get(i11);
                    char c10 = c2;
                    float f10 = fFloatValue;
                    if (AbstractC4154l.m8918a(AbstractC0264a.m720a(i0Var2), "indicatorRipple")) {
                        if (!((iE0 >= 0) & (iE02 >= 0))) {
                            AbstractC6753i.m12938a("width and height must be >= 0");
                        }
                        t3.w0 w0VarMo13314z4 = i0Var2.mo13314z(AbstractC6746b.m12930h(iE0, iE0, iE02, iE02));
                        int size3 = list.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i12);
                            if (AbstractC4154l.m8918a(AbstractC0264a.m720a((t3.i0) obj), "indicator")) {
                                break;
                            }
                            i12++;
                        }
                        t3.i0 i0Var3 = (t3.i0) obj;
                        if (i0Var3 != null) {
                            if (!((iM6747k >= 0) & (iE02 >= 0))) {
                                AbstractC6753i.m12938a("width and height must be >= 0");
                            }
                            w0VarMo13314z = i0Var3.mo13314z(AbstractC6746b.m12930h(iM6747k, iM6747k, iE02, iE02));
                        } else {
                            w0VarMo13314z = null;
                        }
                        InterfaceC2141e interfaceC2141e = i8Var.f11807b;
                        if (interfaceC2141e != null) {
                            int size4 = list.size();
                            for (int i13 = 0; i13 < size4; i13++) {
                                t3.i0 i0Var4 = (t3.i0) list.get(i13);
                                if (AbstractC4154l.m8918a(AbstractC0264a.m720a(i0Var4), AnnotatedPrivateKey.LABEL)) {
                                    w0VarMo13314z2 = i0Var4.mo13314z(jM12911b);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        w0VarMo13314z2 = null;
                        C6669s c6669s = C6669s.f31944a;
                        if (interfaceC2141e == null) {
                            int iM12918i = C6745a.m12918i(j6);
                            int iM12928f = AbstractC6746b.m12928f(l0Var.e0(l8.f12006a), j6);
                            return l0Var.g0(iM12918i, iM12928f, c6669s, new j8(w0VarMo13314z, w0VarMo13314z3, (iM12918i - w0VarMo13314z3.f34030a) / 2, (iM12928f - w0VarMo13314z3.f34031b) / 2, w0VarMo13314z4, (iM12918i - w0VarMo13314z4.f34030a) / 2, (iM12928f - w0VarMo13314z4.f34031b) / 2, iM12918i, iM12928f));
                        }
                        AbstractC4154l.m8920c(w0VarMo13314z2);
                        float f11 = w0VarMo13314z3.f34031b;
                        float f12 = l8.f12010e;
                        float fMo8435T = l0Var.mo8435T(f12) + f11;
                        float f13 = l8.f12008c;
                        float fMo8435T2 = l0Var.mo8435T(f13) + fMo8435T + w0VarMo13314z2.f34031b;
                        float fM12919j = (C6745a.m12919j(j6) - fMo8435T2) / f6;
                        float fMo8435T3 = l0Var.mo8435T(f12);
                        if (fM12919j < fMo8435T3) {
                            fM12919j = fMo8435T3;
                        }
                        float f14 = (fM12919j * f6) + fMo8435T2;
                        boolean z6 = i8Var.f11808c;
                        float f15 = (1 - f10) * ((z6 ? fM12919j : (f14 - w0VarMo13314z3.f34031b) / f6) - fM12919j);
                        float fMo8435T4 = l0Var.mo8435T(f13) + l0Var.mo8435T(f12) + w0VarMo13314z3.f34031b + fM12919j;
                        int iM12918i2 = C6745a.m12918i(j6);
                        return l0Var.g0(iM12918i2, AbstractC2747a.m6747k(f14), c6669s, new k8(w0VarMo13314z, z6, f10, w0VarMo13314z2, (iM12918i2 - w0VarMo13314z2.f34030a) / 2, fMo8435T4, f15, w0VarMo13314z3, (iM12918i2 - w0VarMo13314z3.f34030a) / 2, fM12919j, w0VarMo13314z4, (iM12918i2 - w0VarMo13314z4.f34030a) / 2, fM12919j - l0Var.mo8435T(f12), iM12918i2, l0Var));
                    }
                    i11++;
                    i8Var = this;
                    c2 = c10;
                    fFloatValue = f10;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i10++;
            i8Var = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
