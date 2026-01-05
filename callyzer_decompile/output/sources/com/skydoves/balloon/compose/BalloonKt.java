package com.skydoves.balloon.compose;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.ui.layout.AbstractC0264a;
import c0.AbstractC0810c;
import c3.C0847b;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.compose.BalloonKt;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d7.q0;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.e0;
import k2.f0;
import k2.h2;
import k2.i1;
import k2.n1;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5256o;
import og.gg;
import og.ze;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import qw.a0;
import s4.C6756l;
import s4.InterfaceC6747c;
import t3.InterfaceC7033t;
import t3.j0;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;
import w3.j1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonKt {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.skydoves.balloon.compose.BalloonKt$Balloon$6 */
    public static final class C14176 implements InterfaceC2141e {
        final /* synthetic */ BalloonComposeView $balloonComposeView;
        final /* synthetic */ InterfaceC2141e $balloonContent;
        final /* synthetic */ Balloon.Builder $builder;
        final /* synthetic */ InterfaceC6747c $density;
        final /* synthetic */ float $paddingEnd;
        final /* synthetic */ float $paddingStart;
        final /* synthetic */ int $screenWidth;

        public C14176(float f6, float f10, Balloon.Builder builder, InterfaceC6747c interfaceC6747c, BalloonComposeView balloonComposeView, int i10, InterfaceC2141e interfaceC2141e) {
            this.$paddingStart = f6;
            this.$paddingEnd = f10;
            this.$builder = builder;
            this.$density = interfaceC6747c;
            this.$balloonComposeView = balloonComposeView;
            this.$screenWidth = i10;
            this.$balloonContent = interfaceC2141e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a0 invoke$lambda$3$lambda$2(int i10, Balloon.Builder builder, InterfaceC6747c interfaceC6747c, BalloonComposeView balloonComposeView, InterfaceC7033t coordinates) {
            AbstractC4154l.m8923f(coordinates, "coordinates");
            long jMo13307v = coordinates.mo13307v();
            float f6 = i10;
            if (builder.getWidthRatio() * f6 == DefinitionKt.NO_Float_VALUE) {
                int i11 = (int) (jMo13307v >> 32);
                if (i11 <= i10) {
                    i10 = i11;
                }
            } else {
                i10 = (int) (((builder.getWidthRatio() * f6) - interfaceC6747c.mo8435T(builder.getMarginRight())) - interfaceC6747c.mo8435T(builder.getMarginLeft()));
            }
            long jM11095a = ze.m11095a(i10, (int) (coordinates.mo13307v() & 4294967295L));
            balloonComposeView.m16687updateSizeOfBalloonCardozmzZPI$balloon_compose_release(jM11095a);
            balloonComposeView.getBalloonLayoutInfo$balloon_compose_release().setValue(new BalloonLayoutInfo(C0847b.m2273d(coordinates.mo13303f(0L)), C0847b.m2274e(coordinates.mo13303f(0L)), (int) (jM11095a >> 32), (int) (jM11095a & 4294967295L)));
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC3962k) obj, ((Number) obj2).intValue());
            return a0.f30746a;
        }

        public final void invoke(InterfaceC3962k interfaceC3962k, int i10) {
            if ((i10 & 3) == 2) {
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8586C()) {
                    c3966o.m8601S();
                    return;
                }
            }
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0810c.m2176a(C7876o.f37669a, DefinitionKt.NO_Float_VALUE), this.$paddingStart, DefinitionKt.NO_Float_VALUE, this.$paddingEnd, DefinitionKt.NO_Float_VALUE, 10);
            C3966o c3966o2 = (C3966o) interfaceC3962k;
            c3966o2.m8607Y(1353898765);
            boolean zM8616i = c3966o2.m8616i(this.$builder) | c3966o2.m8614g(this.$density) | c3966o2.m8614g(this.$balloonComposeView);
            final int i11 = this.$screenWidth;
            final Balloon.Builder builder = this.$builder;
            final InterfaceC6747c interfaceC6747c = this.$density;
            final BalloonComposeView balloonComposeView = this.$balloonComposeView;
            Object objM8596M = c3966o2.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new InterfaceC2139c() { // from class: com.skydoves.balloon.compose.e
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) {
                        return BalloonKt.C14176.invoke$lambda$3$lambda$2(i11, builder, interfaceC6747c, balloonComposeView, (InterfaceC7033t) obj);
                    }
                };
                c3966o2.j0(objM8596M);
            }
            c3966o2.m8623p(false);
            InterfaceC7879r interfaceC7879rM723d = AbstractC0264a.m723d(interfaceC7879rM660n, (InterfaceC2139c) objM8596M);
            InterfaceC2141e interfaceC2141e = this.$balloonContent;
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i12 = c3966o2.f20462P;
            i1 i1VarM8620m = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM723d);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(c7637i);
            } else {
                c3966o2.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o2);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o2);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o2, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o2);
            c3966o2.m8607Y(1966243569);
            if (interfaceC2141e != null) {
                interfaceC2141e.invoke(c3966o2, 0);
            }
            c3966o2.m8623p(false);
            c3966o2.m8623p(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Balloon(w2.InterfaceC7879r r24, com.skydoves.balloon.Balloon.Builder r25, java.lang.Object r26, ex.InterfaceC2139c r27, ex.InterfaceC2139c r28, ex.InterfaceC2141e r29, ex.InterfaceC2142f r30, k2.InterfaceC3962k r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.balloon.compose.BalloonKt.Balloon(w2.r, com.skydoves.balloon.Balloon$Builder, java.lang.Object, ex.c, ex.c, ex.e, ex.f, k2.k, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 Balloon$lambda$1$lambda$0(j1 it) {
        AbstractC4154l.m8923f(it, "it");
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 Balloon$lambda$14(InterfaceC7879r interfaceC7879r, Balloon.Builder builder, Object obj, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2141e interfaceC2141e, InterfaceC2142f interfaceC2142f, int i10, int i11, InterfaceC3962k interfaceC3962k, int i12) {
        Balloon(interfaceC7879r, builder, obj, interfaceC2139c, interfaceC2139c2, interfaceC2141e, interfaceC2142f, interfaceC3962k, C3953b.m8496A(i10 | 1), i11);
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 Balloon$lambda$24$lambda$23(j1 j1Var, C6756l c6756l) {
        ViewGroup.LayoutParams layoutParams = j1Var.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        long j6 = c6756l.f32210a;
        layoutParams.width = (int) (j6 >> 32);
        layoutParams.height = (int) (j6 & 4294967295L);
        j1Var.setLayoutParams(layoutParams);
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1 Balloon$lambda$27$lambda$26$lambda$25(j1 j1Var, Context it) {
        AbstractC4154l.m8923f(it, "it");
        return j1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 Balloon$lambda$3$lambda$2(BalloonWindow it) {
        AbstractC4154l.m8923f(it, "it");
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 Balloon$lambda$31$lambda$30(final BalloonComposeView balloonComposeView, final j1 j1Var, f0 DisposableEffect) {
        AbstractC4154l.m8923f(DisposableEffect, "$this$DisposableEffect");
        return new e0() { // from class: com.skydoves.balloon.compose.BalloonKt$Balloon$lambda$31$lambda$30$$inlined$onDispose$1
            @Override // k2.e0
            public void dispose() {
                balloonComposeView.dispose$balloon_compose_release();
                j1 j1Var2 = j1Var;
                gg.m10676c(j1Var2, null);
                q0.m5341h(j1Var2, null);
                q0.m5342i(j1Var2, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 Balloon$lambda$32(InterfaceC7879r interfaceC7879r, Balloon.Builder builder, Object obj, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2141e interfaceC2141e, InterfaceC2142f interfaceC2142f, int i10, int i11, InterfaceC3962k interfaceC3962k, int i12) {
        Balloon(interfaceC7879r, builder, obj, interfaceC2139c, interfaceC2139c2, interfaceC2141e, interfaceC2142f, interfaceC3962k, C3953b.m8496A(i10 | 1), i11);
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2141e Balloon$lambda$8(h2 h2Var) {
        return (InterfaceC2141e) h2Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BalloonLayout(InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        int i12;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1130020662);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c3966o.m8616i(interfaceC2141e) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            if (i13 != 0) {
                interfaceC7879r = C7876o.f37669a;
            }
            c3966o.m8607Y(222699369);
            Object objM8596M = c3966o.m8596M();
            if (objM8596M == C3961j.f20408a) {
                objM8596M = BalloonKt$BalloonLayout$1$1.INSTANCE;
                c3966o.j0(objM8596M);
            }
            j0 j0Var = (j0) objM8596M;
            c3966o.m8623p(false);
            int i14 = ((i12 << 3) & 112) | ((i12 >> 3) & 14) | KyberEngine.KyberPolyBytes;
            int i15 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            int i16 = ((i14 << 6) & 896) | 6;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0Var, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, c3966o, i15, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            AbstractC1452a.m4576w((i16 >> 6) & 14, interfaceC2141e, c3966o, true);
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1423d(interfaceC7879r, interfaceC2141e, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 BalloonLayout$lambda$34(InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, int i10, int i11, InterfaceC3962k interfaceC3962k, int i12) {
        BalloonLayout(interfaceC7879r, interfaceC2141e, interfaceC3962k, C3953b.m8496A(i10 | 1), i11);
        return a0.f30746a;
    }
}
