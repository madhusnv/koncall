package aq;

import a1.C0005d;
import a2.C0036i;
import a3.C0045d;
import a3.C0046e;
import an.j5;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import b3.C0582n;
import bp.C0720d;
import c3.C0847b;
import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import cv.C1517m;
import d3.C1560n;
import d3.C1565s;
import d3.h0;
import d3.l0;
import d3.m0;
import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.InterfaceC1596x;
import d7.EnumC1644p;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f2.C2192o;
import f3.C2196b;
import f3.C2201g;
import f3.C2202h;
import f3.InterfaceC2198d;
import g2.C2460n;
import g2.aa;
import g2.f4;
import g2.ic;
import g2.ja;
import g2.l5;
import g2.n5;
import g2.n9;
import g2.pd;
import g2.u2;
import g2.u4;
import g2.v7;
import g2.vc;
import g2.y8;
import g2.z7;
import g2.z8;
import h1.C2772c;
import h1.g0;
import h1.m1;
import h1.p1;
import h1.r1;
import h1.s1;
import h2.AbstractC2821z;
import h2.a0;
import h2.j0;
import hq.C3012q;
import j2.AbstractC3526f;
import j2.e0;
import j2.n0;
import java.util.List;
import k2.a1;
import k2.h2;
import kotlin.jvm.internal.AbstractC4155m;
import nf.C5047i;
import o1.h1;
import o1.i1;
import o1.v1;
import og.a2;
import og.d2;
import og.ze;
import org.bouncycastle.iana.AEADAlgorithm;
import p005f.C2153b;
import s4.C6750f;
import s4.C6754j;
import s4.EnumC6757m;
import t3.InterfaceC7033t;
import t3.c1;
import t3.v0;
import t3.w0;
import tx.InterfaceC7266z;
import tx.b0;
import tx.c0;
import v3.i0;
import w3.p2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aq.k */
/* loaded from: classes3.dex */
public final class C0408k extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3121a;

    /* renamed from: b */
    public final /* synthetic */ Object f3122b;

    /* renamed from: c */
    public final /* synthetic */ Object f3123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0408k(int i10, Object obj, Object obj2) {
        super(1);
        this.f3121a = i10;
        this.f3123c = obj;
        this.f3122b = obj2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        a0 a0Var;
        int i10 = this.f3121a;
        int i11 = 3;
        float f6 = DefinitionKt.NO_Float_VALUE;
        int i12 = 0;
        int i13 = 2;
        qw.a0 a0Var2 = qw.a0.f30746a;
        Object obj2 = this.f3122b;
        Object obj3 = this.f3123c;
        switch (i10) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return ((C0400c) obj3).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 1:
                return ((j5) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                return ((C0400c) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case 3:
                ((v0) obj).m13325j((w0) obj3, 0, 0, DefinitionKt.NO_Float_VALUE, ((C1560n) obj2).f7800q);
                return a0Var2;
            case 4:
                ((v0) obj).m13325j((w0) obj3, 0, 0, DefinitionKt.NO_Float_VALUE, ((m0) obj2).f7790D);
                return a0Var2;
            case 5:
                return ((C1517m) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 6:
                int iIntValue3 = ((Number) obj).intValue();
                return ((C0400c) obj3).invoke(Integer.valueOf(iIntValue3), ((List) obj2).get(iIntValue3));
            case 7:
                int iIntValue4 = ((Number) obj).intValue();
                return ((C0400c) obj3).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case 8:
                ((v0) obj).m13324d((w0) obj3, 0, 0, ((g1.a0) obj2).f10919c.m8490f());
                return a0Var2;
            case 9:
                i0 i0Var = (i0) obj;
                aa aaVar = (aa) obj3;
                long j6 = ((u2) obj2).f12851v;
                i1 i1Var = u4.f12866a;
                float f10 = f4.f11555a;
                float fMo8435T = i0Var.mo8435T(f10);
                float fMo8435T2 = i0Var.mo8435T(f10);
                float fMo8435T3 = i0Var.mo8435T(AbstractC3526f.f18562h);
                float f11 = 2;
                float f12 = (fMo8435T2 - fMo8435T3) / f11;
                C2196b c2196b = i0Var.f36917a;
                float f13 = 7;
                float fM2293d = (C0850e.m2293d(c2196b.mo5913e()) - (f13 * fMo8435T)) / f13;
                long j10 = aaVar.f11191a;
                int i14 = (int) (j10 >> 32);
                int i15 = (int) (j10 & 4294967295L);
                long j11 = aaVar.f11192b;
                int i16 = (int) (j11 >> 32);
                int i17 = (int) (j11 & 4294967295L);
                float f14 = fMo8435T + fM2293d;
                float f15 = fM2293d / f11;
                float fM2293d2 = (i14 * f14) + (aaVar.f11193c ? fMo8435T / f11 : DefinitionKt.NO_Float_VALUE) + f15;
                float f16 = (i15 * fMo8435T2) + f12;
                float fM2293d3 = (i16 * f14) + (aaVar.f11194d ? fMo8435T / f11 : fMo8435T) + f15;
                float f17 = (i17 * fMo8435T2) + f12;
                boolean z6 = i0Var.getLayoutDirection() == EnumC6757m.Rtl;
                if (z6) {
                    fM2293d2 = C0850e.m2293d(c2196b.mo5913e()) - fM2293d2;
                    fM2293d3 = C0850e.m2293d(c2196b.mo5913e()) - fM2293d3;
                }
                InterfaceC2198d.o0(i0Var, j6, a2.m10524a(fM2293d2, f16), d2.m10598a(i15 == i17 ? fM2293d3 - fM2293d2 : z6 ? -fM2293d2 : C0850e.m2293d(c2196b.mo5913e()) - fM2293d2, fMo8435T3), DefinitionKt.NO_Float_VALUE, null, 120);
                if (i15 != i17) {
                    for (int i18 = (i17 - i15) - 1; i18 > 0; i18--) {
                        InterfaceC2198d.o0(i0Var, j6, a2.m10524a(DefinitionKt.NO_Float_VALUE, (i18 * fMo8435T2) + f16), d2.m10598a(C0850e.m2293d(c2196b.mo5913e()), fMo8435T3), DefinitionKt.NO_Float_VALUE, null, 120);
                    }
                    long jM10524a = a2.m10524a(i0Var.getLayoutDirection() == EnumC6757m.Ltr ? 0.0f : C0850e.m2293d(c2196b.mo5913e()), f17);
                    if (z6) {
                        fM2293d3 -= C0850e.m2293d(c2196b.mo5913e());
                    }
                    InterfaceC2198d.o0(i0Var, j6, jM10524a, d2.m10598a(fM2293d3, fMo8435T3), DefinitionKt.NO_Float_VALUE, null, 120);
                }
                i0Var.m14622b();
                return a0Var2;
            case 10:
                return new C2153b(3, new n5((View) obj3, (InterfaceC2137a) obj2));
            case 11:
                InterfaceC1596x interfaceC1596x = (InterfaceC1596x) obj;
                AbstractC1594v.m5230h(interfaceC1596x, 6);
                ((C1583k) interfaceC1596x).m5202q(C1582j.f7843b, new C1573a(null, new C0036i(8, (l5) obj3, (p2) obj2)));
                return a0Var2;
            case 12:
                d3.i0 i0Var2 = (d3.i0) obj;
                float fM8490f = ((a1) ((ja) obj3).f11872b.f5660j).m8490f();
                float fM2291b = C0850e.m2291b(i0Var2.f7773t);
                if (!Float.isNaN(fM8490f) && !Float.isNaN(fM2291b) && fM2291b != DefinitionKt.NO_Float_VALUE) {
                    float fFloatValue = ((Number) ((C2772c) obj2).m6775d()).floatValue();
                    i0Var2.m5167k(z7.m6353d(i0Var2, fFloatValue));
                    i0Var2.m5168n(z7.m6354e(i0Var2, fFloatValue));
                    i0Var2.m5172v(h0.m5136h(0.5f, (fM8490f + fM2291b) / fM2291b));
                }
                return a0Var2;
            case 13:
                InterfaceC1596x interfaceC1596x2 = (InterfaceC1596x) obj;
                AbstractC1594v.m5234l(interfaceC1596x2, 1.0f);
                AbstractC1594v.m5227e(interfaceC1596x2, (String) obj3);
                ((C1583k) interfaceC1596x2).m5202q(C1582j.f7843b, new C1573a(null, new v7(1, (InterfaceC2137a) obj2)));
                return a0Var2;
            case 14:
                i0 i0Var3 = (i0) obj;
                long j12 = ((C0850e) ((C0582n) obj3).get()).f5366a;
                float fM2293d4 = C0850e.m2293d(j12);
                if (fM2293d4 > DefinitionKt.NO_Float_VALUE) {
                    float fMo8435T4 = i0Var3.mo8435T(z8.f13390a);
                    C2196b c2196b2 = i0Var3.f36917a;
                    float fMo8435T5 = i0Var3.mo8435T(((h1) obj2).mo10342b(i0Var3.getLayoutDirection())) - fMo8435T4;
                    float f18 = 2;
                    float f19 = (fMo8435T4 * f18) + fM2293d4 + fMo8435T5;
                    EnumC6757m layoutDirection = i0Var3.getLayoutDirection();
                    int[] iArr = y8.f13316a;
                    float fM2293d5 = iArr[layoutDirection.ordinal()] == 1 ? C0850e.m2293d(c2196b2.mo5913e()) - f19 : fMo8435T5 < DefinitionKt.NO_Float_VALUE ? 0.0f : fMo8435T5;
                    if (iArr[i0Var3.getLayoutDirection().ordinal()] == 1) {
                        float fM2293d6 = C0850e.m2293d(c2196b2.mo5913e());
                        if (fMo8435T5 >= DefinitionKt.NO_Float_VALUE) {
                            f6 = fMo8435T5;
                        }
                        f19 = fM2293d6 - f6;
                    }
                    float f20 = f19;
                    float fM2291b2 = C0850e.m2291b(j12);
                    float f21 = (-fM2291b2) / f18;
                    float f22 = fM2291b2 / f18;
                    C0005d c0005d = c2196b2.f10124b;
                    long jM81z = c0005d.m81z();
                    c0005d.m75t().mo5107i();
                    try {
                        ((C0005d) ((C5047i) c0005d.f24b).f24823b).m75t().mo5111m(fM2293d5, f21, f20, f22, 0);
                        i0Var3.m14622b();
                    } finally {
                        i0.m0.m7392y(c0005d, jM81z);
                    }
                } else {
                    i0Var3.m14622b();
                }
                return a0Var2;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                InterfaceC2198d interfaceC2198d = (InterfaceC2198d) obj;
                float fMo8435T6 = interfaceC2198d.mo8435T(n9.f12208c);
                h2 h2Var = (h2) obj3;
                float f23 = 2;
                float f24 = fMo8435T6 / f23;
                InterfaceC2198d.m5910q(interfaceC2198d, ((C1565s) h2Var.getValue()).f7819a, interfaceC2198d.mo8435T(e0.f18544c / f23) - f24, 0L, new C2202h(fMo8435T6, DefinitionKt.NO_Float_VALUE, 0, 0, 30), 0, 108);
                h2 h2Var2 = (h2) obj2;
                if (Float.compare(((C6750f) h2Var2.getValue()).f32201a, 0) > 0) {
                    InterfaceC2198d.m5910q(interfaceC2198d, ((C1565s) h2Var.getValue()).f7819a, interfaceC2198d.mo8435T(((C6750f) h2Var2.getValue()).f32201a) - f24, 0L, C2201g.f10129a, 0, 108);
                }
                return a0Var2;
            case 16:
                ((j0) obj3).f15721a.setValue(new o1.a0((v1) obj2, (v1) obj));
                return a0Var2;
            case 17:
                InterfaceC7033t interfaceC7033t = (InterfaceC7033t) obj;
                k2.w0 w0Var = (k2.w0) obj3;
                InterfaceC7033t interfaceC7033tMo13304k = interfaceC7033t.mo13304k();
                w0Var.setValue(new C6754j(interfaceC7033tMo13304k != null ? ze.m11096b(interfaceC7033tMo13304k.mo13307v()) : 0L));
                ((k2.w0) obj2).setValue(new C0847b(c1.m13276e(interfaceC7033t).m2280b()));
                return a0Var2;
            case 18:
                i0 i0Var4 = (i0) obj;
                C2460n c2460n = (C2460n) obj3;
                long jM10524a2 = a2.m10524a(i0Var4.mo8435T(Float.intBitsToFloat((int) (pd.m6281q(c2460n) >> 32))), i0Var4.mo8435T(Float.intBitsToFloat((int) (4294967295L & pd.m6281q(c2460n)))));
                float f25 = 2;
                float fMo8435T7 = i0Var4.mo8435T(n0.f18685g) / f25;
                vc vcVar = (vc) obj2;
                long j13 = vcVar.f13032b;
                InterfaceC2198d.m5910q(i0Var4, C1565s.f7809b, fMo8435T7, jM10524a2, null, 0, 56);
                i0Var4.m14622b();
                InterfaceC2198d.m5910q(i0Var4, j13, fMo8435T7, jM10524a2, null, 11, 56);
                float fMo8435T8 = i0Var4.mo8435T(n0.f18686h);
                long jM2275f = C0847b.m2275f(jM10524a2, a2.m10524a(((float) Math.cos(((Number) c2460n.f12149d.m6775d()).floatValue())) * fMo8435T7, ((float) Math.sin(((Number) c2460n.f12149d.m6775d()).floatValue())) * fMo8435T7));
                C2196b c2196b3 = i0Var4.f36917a;
                i0Var4.r0(j13, d2.m10602e(c2196b3.mo5913e()), jM2275f, fMo8435T8, (496 & 16) != 0 ? 0 : 0, 3);
                InterfaceC2198d.m5910q(i0Var4, j13, i0Var4.mo8435T(n0.f18683e) / f25, d2.m10602e(c2196b3.mo5913e()), null, 0, 120);
                InterfaceC2198d.m5910q(i0Var4, vcVar.f13035e, fMo8435T7, jM10524a2, null, 4, 56);
                return a0Var2;
            case 19:
                g0 g0Var = (g0) obj3;
                h1.e0 e0Var = (h1.e0) obj2;
                g0Var.f15419a.m9506b(e0Var);
                g0Var.f15420b.setValue(Boolean.TRUE);
                return new C0720d(i13, g0Var, e0Var);
            case 20:
                c0.m13502y((InterfaceC7266z) obj3, null, b0.UNDISPATCHED, new C2192o((s1) obj2, null), 1);
                return new r1();
            case 21:
                s1 s1Var = (s1) obj3;
                s1 s1Var2 = (s1) obj2;
                s1Var.f15597j.add(s1Var2);
                return new C0720d(i11, s1Var, s1Var2);
            case 22:
                return new C0720d(4, (s1) obj3, (m1) obj2);
            case 23:
                s1 s1Var3 = (s1) obj3;
                p1 p1Var = (p1) obj2;
                s1Var3.f15596i.add(p1Var);
                return new C0720d(5, s1Var3, p1Var);
            case 24:
                if (((EnumC1644p) obj) == EnumC1644p.ON_RESUME) {
                    h2.c0 c0Var = (h2.c0) obj3;
                    AccessibilityManager accessibilityManager = (AccessibilityManager) obj2;
                    c0Var.getClass();
                    c0Var.f15684a.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(c0Var);
                    h2.b0 b0Var = c0Var.f15685b;
                    if (b0Var != null) {
                        b0Var.f15683a.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(b0Var);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (a0Var = c0Var.f15686c) != null) {
                        a0Var.f15679a.setValue(Boolean.valueOf(h2.c0.m6887b(accessibilityManager)));
                        AbstractC2821z.m6925a(accessibilityManager, a0Var);
                    }
                }
                return a0Var2;
            case 25:
                h0.m5139k((InterfaceC2198d) obj, (h0) obj3, ((ic) obj2).mo5194a());
                return a0Var2;
            case 26:
                C0046e c0046e = (C0046e) obj;
                return c0046e.m156b(new C0045d(i12, new C0408k(25, ((l0) obj3).mo399i(c0046e.f201a.mo150e(), c0046e.f201a.getLayoutDirection(), c0046e), (ic) obj2)));
            case 27:
                int iIntValue5 = ((Number) obj).intValue();
                return ((C0400c) obj3).invoke(Integer.valueOf(iIntValue5), ((List) obj2).get(iIntValue5));
            case 28:
                int iIntValue6 = ((Number) obj).intValue();
                return ((C3012q) obj3).invoke(Integer.valueOf(iIntValue6), ((List) obj2).get(iIntValue6));
            default:
                int iIntValue7 = ((Number) obj).intValue();
                return ((C3012q) obj3).invoke(Integer.valueOf(iIntValue7), ((List) obj2).get(iIntValue7));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0408k(boolean z6, String str, String str2, String str3, l5 l5Var, p2 p2Var) {
        super(1);
        this.f3121a = 11;
        this.f3123c = l5Var;
        this.f3122b = p2Var;
    }
}
