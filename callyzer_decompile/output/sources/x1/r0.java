package x1;

import a1.C0004c;
import android.view.KeyEvent;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.fragment.app.C0348m;
import au.C0446j;
import b2.C0566x;
import c3.C0848c;
import c9.C0910e;
import ch.C0972b;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d3.InterfaceC1566t;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import g2.v3;
import g4.C2490f;
import g4.C2492h;
import j1.C3518j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k4.InterfaceC3987h;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4168z;
import l4.C4366k;
import l4.C4381z;
import l4.InterfaceC4374s;
import l4.InterfaceC4375t;
import n1.AbstractC4941a;
import n3.AbstractC4949c;
import nc.AbstractC4992c;
import o1.AbstractC5256o;
import og.b2;
import og.te;
import og.ye;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p005f.C2165n;
import p3.C5803a;
import pg.p7;
import qw.C6361k;
import r4.EnumC6455j;
import s2.C6734c;
import s4.C6755k;
import s4.InterfaceC6747c;
import t3.InterfaceC7033t;
import tx.InterfaceC7266z;
import u2.AbstractC7311h;
import u2.AbstractC7321r;
import uw.C7565i;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a */
    public static final o0 f39665a = new o0(1);

    /* renamed from: b */
    public static final C5803a f39666b = new C5803a(1008);

    /* renamed from: c */
    public static final C5803a f39667c = new C5803a(1022);

    /* JADX WARN: Removed duplicated region for block: B:129:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15441a(g4.C2492h r19, w2.InterfaceC7879r r20, g4.o0 r21, ex.InterfaceC2139c r22, int r23, boolean r24, int r25, int r26, java.util.Map r27, k2.InterfaceC3962k r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.r0.m15441a(g4.h, w2.r, g4.o0, ex.c, int, boolean, int, int, java.util.Map, k2.k, int, int):void");
    }

    /* renamed from: b */
    public static final void m15442b(C2492h c2492h, InterfaceC7879r interfaceC7879r, g4.o0 o0Var, InterfaceC2139c interfaceC2139c, int i10, boolean z6, int i11, int i12, Map map, InterfaceC3962k interfaceC3962k, int i13) {
        int i14;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-1064305212);
        if ((i13 & 6) == 0) {
            i14 = (c3966o2.m8614g(c2492h) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c3966o2.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
            i14 |= c3966o2.m8614g(o0Var) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c3966o2.m8616i(interfaceC2139c) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c3966o2.m8612e(i10) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= c3966o2.m8615h(z6) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c3966o2.m8612e(i11) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c3966o2.m8612e(i12) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c3966o2.m8616i(map) ? 67108864 : 33554432;
        }
        int i15 = i14 | 805306368;
        if (c3966o2.m8598P(i15 & 1, (306783379 & i15) != 306783378)) {
            c3966o = c3966o2;
            m15441a(c2492h, interfaceC7879r, o0Var, interfaceC2139c, i10, z6, i11, i12, map, c3966o, i15 & 2147483646, 1024);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C8265o(c2492h, interfaceC7879r, o0Var, interfaceC2139c, i10, z6, i11, i12, map, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15443c(java.lang.String r19, w2.InterfaceC7879r r20, g4.o0 r21, ex.InterfaceC2139c r22, int r23, boolean r24, int r25, int r26, k2.InterfaceC3962k r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.r0.m15443c(java.lang.String, w2.r, g4.o0, ex.c, int, boolean, int, int, k2.k, int, int):void");
    }

    /* renamed from: d */
    public static final void m15444d(String str, InterfaceC7879r interfaceC7879r, g4.o0 o0Var, InterfaceC2139c interfaceC2139c, int i10, boolean z6, int i11, int i12, InterfaceC3962k interfaceC3962k, int i13) {
        int i14;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-1186827822);
        if ((i13 & 6) == 0) {
            i14 = (c3966o2.m8614g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c3966o2.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i13 & KyberEngine.KyberPolyBytes) == 0) {
            i14 |= c3966o2.m8614g(o0Var) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c3966o2.m8616i(interfaceC2139c) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c3966o2.m8612e(i10) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= c3966o2.m8615h(z6) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c3966o2.m8612e(i11) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c3966o2.m8612e(i12) ? 8388608 : 4194304;
        }
        int i15 = i14 | 100663296;
        if (c3966o2.m8598P(i15 & 1, (38347923 & i15) != 38347922)) {
            c3966o = c3966o2;
            m15443c(str, interfaceC7879r, o0Var, interfaceC2139c, i10, z6, i11, i12, c3966o, i15 & 268435454, 512);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C8264n(str, interfaceC7879r, o0Var, interfaceC2139c, i10, z6, i11, i12, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15445e(g4.C2492h r22, w2.InterfaceC7879r r23, g4.o0 r24, boolean r25, int r26, int r27, ex.InterfaceC2139c r28, ex.InterfaceC2139c r29, k2.InterfaceC3962k r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.r0.m15445e(g4.h, w2.r, g4.o0, boolean, int, int, ex.c, ex.c, k2.k, int, int):void");
    }

    /* renamed from: f */
    public static final void m15446f(b2.y0 y0Var, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C6734c c6734c2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1985516685);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(y0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(c6734c) ? 32 : 16;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = new C3518j();
                c3966o.j0(objM8596M);
            }
            C3518j c3518j = (C3518j) objM8596M;
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == s0Var) {
                objM8596M2 = C3953b.m8510m(C7565i.f36440a, c3966o);
                c3966o.j0(objM8596M2);
            }
            InterfaceC7266z interfaceC7266z = (InterfaceC7266z) objM8596M2;
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == s0Var) {
                objM8596M3 = C3953b.m8517t(new z0(0));
                c3966o.j0(objM8596M3);
            }
            k2.w0 w0Var = (k2.w0) objM8596M3;
            Object objM8596M4 = c3966o.m8596M();
            if (objM8596M4 == s0Var) {
                objM8596M4 = new o6.b0(16, c3518j);
                c3966o.j0(objM8596M4);
            }
            InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M4;
            C0566x c0566x = new C0566x(1, w0Var, c3518j, y0Var);
            boolean zM1699i = y0Var.m1699i();
            boolean zM8616i = c3966o.m8616i(interfaceC7266z) | c3966o.m8616i(y0Var);
            Object objM8596M5 = c3966o.m8596M();
            if (zM8616i || objM8596M5 == s0Var) {
                objM8596M5 = new C0348m(9, interfaceC7266z, w0Var, y0Var);
                c3966o.j0(objM8596M5);
            }
            c6734c2 = c6734c;
            p7.m11822b(c3518j, interfaceC2137a, c0566x, null, zM1699i, (InterfaceC2137a) objM8596M5, c6734c2, c3966o, ((i11 << 15) & 3670016) | 54);
        } else {
            c6734c2 = c6734c;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new v3(y0Var, c6734c2, i10, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x058a A[PHI: r15 r33
      0x058a: PHI (r15v23 l4.k) = (r15v14 l4.k), (r15v24 l4.k) binds: [B:271:0x0588, B:268:0x057d] A[DONT_GENERATE, DONT_INLINE]
      0x058a: PHI (r33v3 b3.k) = (r33v1 b3.k), (r33v4 b3.k) binds: [B:271:0x0588, B:268:0x057d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0635 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0822 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0955  */
    /* JADX WARN: Type inference failed for: r3v55, types: [w2.r] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15447g(l4.C4381z r70, ex.InterfaceC2139c r71, w2.InterfaceC7879r r72, g4.o0 r73, l4.k0 r74, ex.InterfaceC2139c r75, m1.InterfaceC4630l r76, d3.AbstractC1561o r77, boolean r78, int r79, int r80, l4.C4366k r81, x1.t0 r82, boolean r83, boolean r84, ex.InterfaceC2142f r85, k2.InterfaceC3962k r86, int r87, int r88) {
        /*
            Method dump skipped, instructions count: 2517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.r0.m15447g(l4.z, ex.c, w2.r, g4.o0, l4.k0, ex.c, m1.l, d3.o, boolean, int, int, l4.k, x1.t0, boolean, boolean, ex.f, k2.k, int, int):void");
    }

    /* renamed from: h */
    public static final void m15448h(InterfaceC7879r interfaceC7879r, b2.y0 y0Var, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-20551815);
        int i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10 | (c3966o.m8616i(y0Var) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, true);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            m15446f(y0Var, c6734c, c3966o, (i11 >> 3) & 126);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0446j(interfaceC7879r, y0Var, c6734c, i10, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0207  */
    /* JADX WARN: Type inference failed for: r0v1, types: [k2.k, k2.o] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, x1.s1] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [ex.c] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15449i(w2.InterfaceC7879r r30, g4.C2492h r31, ex.InterfaceC2139c r32, boolean r33, java.util.Map r34, g4.o0 r35, int r36, boolean r37, int r38, int r39, k4.InterfaceC3987h r40, d3.InterfaceC1566t r41, ex.InterfaceC2139c r42, k2.InterfaceC3962k r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.r0.m15449i(w2.r, g4.h, ex.c, boolean, java.util.Map, g4.o0, int, boolean, int, int, k4.h, d3.t, ex.c, k2.k, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15450j(b2.y0 r11, k2.InterfaceC3962k r12, int r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.r0.m15450j(b2.y0, k2.k, int):void");
    }

    /* renamed from: k */
    public static final void m15451k(b2.y0 y0Var, boolean z6, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        r1 r1VarM15480d;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(626339208);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(y0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8615h(z6) ? 32 : 16;
        }
        if (!c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            c3966o.m8601S();
        } else if (z6) {
            c3966o.m8607Y(-1290924834);
            v0 v0Var = y0Var.f3869d;
            g4.l0 l0Var = null;
            if (v0Var != null && (r1VarM15480d = v0Var.m15480d()) != null) {
                g4.l0 l0Var2 = r1VarM15480d.f39668a;
                v0 v0Var2 = y0Var.f3869d;
                if (!(v0Var2 != null ? v0Var2.f39718p : true)) {
                    l0Var = l0Var2;
                }
            }
            if (l0Var == null) {
                c3966o.m8607Y(-1290601288);
            } else {
                c3966o.m8607Y(-1290601287);
                if (g4.n0.m6455b(y0Var.m1701k().f21946b)) {
                    c3966o.m8607Y(-1684179174);
                    c3966o.m8623p(false);
                } else {
                    c3966o.m8607Y(-1685230508);
                    int iMo2733Y = y0Var.f3867b.mo2733Y((int) (y0Var.m1701k().f21946b >> 32));
                    int iMo2733Y2 = y0Var.f3867b.mo2733Y((int) (y0Var.m1701k().f21946b & 4294967295L));
                    EnumC6455j enumC6455jM6443a = l0Var.m6443a(iMo2733Y);
                    EnumC6455j enumC6455jM6443a2 = l0Var.m6443a(Math.max(iMo2733Y2 - 1, 0));
                    v0 v0Var3 = y0Var.f3869d;
                    if (v0Var3 == null || !((Boolean) v0Var3.f39715m.getValue()).booleanValue()) {
                        c3966o.m8607Y(-1684548198);
                        c3966o.m8623p(false);
                    } else {
                        c3966o.m8607Y(-1684812473);
                        AbstractC4992c.m9901b(true, enumC6455jM6443a, y0Var, c3966o, ((i11 << 6) & 896) | 6);
                        c3966o.m8623p(false);
                    }
                    v0 v0Var4 = y0Var.f3869d;
                    if (v0Var4 == null || !((Boolean) v0Var4.f39716n.getValue()).booleanValue()) {
                        c3966o.m8607Y(-1684200998);
                        c3966o.m8623p(false);
                    } else {
                        c3966o.m8607Y(-1684464312);
                        AbstractC4992c.m9901b(false, enumC6455jM6443a2, y0Var, c3966o, ((i11 << 6) & 896) | 6);
                        c3966o.m8623p(false);
                    }
                    c3966o.m8623p(false);
                }
                v0 v0Var5 = y0Var.f3869d;
                if (v0Var5 != null) {
                    k2.e1 e1Var = v0Var5.f39714l;
                    if (!AbstractC4154l.m8918a(y0Var.f3886u.f21945a.f13620b, y0Var.m1701k().f21945a.f13620b)) {
                        e1Var.setValue(Boolean.FALSE);
                    }
                    if (v0Var5.m15478b()) {
                        if (((Boolean) e1Var.getValue()).booleanValue()) {
                            y0Var.m1706p();
                        } else {
                            y0Var.m1702l();
                        }
                    }
                }
            }
            c3966o.m8623p(false);
            c3966o.m8623p(false);
        } else {
            c3966o.m8607Y(651160447);
            c3966o.m8623p(false);
            y0Var.m1702l();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2165n(y0Var, z6, i10);
        }
    }

    /* renamed from: l */
    public static final void m15452l(v0 v0Var) {
        l4.h0 h0Var = v0Var.f39707e;
        if (h0Var != null) {
            v0Var.f39724v.invoke(C4381z.m9153a((C4381z) v0Var.f39706d.f5579b, null, 0L, 3));
            l4.a0 a0Var = h0Var.f21907a;
            AtomicReference atomicReference = a0Var.f21852b;
            while (true) {
                if (atomicReference.compareAndSet(h0Var, null)) {
                    a0Var.f21851a.mo9095c();
                    break;
                } else if (atomicReference.get() != h0Var) {
                    break;
                }
            }
        }
        v0Var.f39707e = null;
    }

    /* renamed from: m */
    public static final C0848c m15453m(InterfaceC6747c interfaceC6747c, int i10, l4.i0 i0Var, g4.l0 l0Var, boolean z6, int i11) {
        C0848c c0848cM6445c = l0Var != null ? l0Var.m6445c(i0Var.f21910b.mo2733Y(i10)) : C0848c.f5353e;
        float f6 = c0848cM6445c.f5354a;
        int iE0 = interfaceC6747c.e0(e1.f39486a);
        return new C0848c(z6 ? (i11 - f6) - iE0 : f6, c0848cM6445c.f5355b, z6 ? i11 - f6 : iE0 + f6, c0848cM6445c.f5357d);
    }

    /* renamed from: n */
    public static final boolean m15454n(int i10, KeyEvent keyEvent) {
        return ((int) (AbstractC4949c.m9891c(keyEvent) >> 32)) == i10;
    }

    /* renamed from: o */
    public static final ArrayList m15455o(List list, InterfaceC2137a interfaceC2137a) {
        C0972b c0972b;
        if (!((Boolean) interfaceC2137a.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            t3.i0 i0Var = (t3.i0) list.get(i10);
            Object objMo13310C = i0Var.mo13310C();
            AbstractC4154l.m8921d(objMo13310C, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            C0004c c0004c = ((t1) objMo13310C).f39684a;
            s1 s1Var = (s1) c0004c.f19b;
            C2490f c2490f = (C2490f) c0004c.f20c;
            g4.l0 l0Var = (g4.l0) s1Var.f39677a.getValue();
            if (l0Var == null) {
                c0972b = new C0972b(0, 0, C8257g.f39496c);
            } else {
                C2490f c2490fM15471c = s1.m15471c(c2490f, l0Var);
                if (c2490fM15471c == null) {
                    c0972b = new C0972b(0, 0, C8257g.f39497d);
                } else {
                    C6755k c6755kM11071c = ye.m11071c(l0Var.m6451i(c2490fM15471c.f13596b, c2490fM15471c.f13597c).m5155d());
                    c0972b = new C0972b(c6755kM11071c.m12947d(), c6755kM11071c.m12945b(), new o6.b0(19, c6755kM11071c));
                }
            }
            int i11 = c0972b.f5783b;
            int i12 = c0972b.f5784c;
            arrayList.add(new C6361k(i0Var.mo13314z(te.m10936b(i11, i11, i12, i12)), (AbstractC4155m) c0972b.f5785d));
        }
        return arrayList;
    }

    /* renamed from: p */
    public static final void m15456p(l4.a0 a0Var, v0 v0Var, C4381z c4381z, C4366k c4366k, InterfaceC4374s interfaceC4374s) {
        C0910e c0910e = v0Var.f39706d;
        c0 c0Var = v0Var.f39724v;
        c0 c0Var2 = v0Var.f39725w;
        C4168z c4168z = new C4168z();
        C0566x c0566x = new C0566x(23, c0910e, c0Var, c4168z);
        InterfaceC4375t interfaceC4375t = a0Var.f21851a;
        interfaceC4375t.mo9100h(c4381z, c4366k, c0566x, c0Var2);
        l4.h0 h0Var = new l4.h0(a0Var, interfaceC4375t);
        a0Var.f21852b.set(h0Var);
        c4168z.f21164a = h0Var;
        v0Var.f39707e = h0Var;
        m15461u(v0Var, c4381z, interfaceC4374s);
    }

    /* renamed from: q */
    public static final int m15457q(float f6) {
        return Math.round((float) Math.ceil(f6));
    }

    /* renamed from: r */
    public static final int m15458r(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    /* renamed from: s */
    public static final int m15459s(CharSequence charSequence, int i10) {
        while (i10 > 0) {
            if (charSequence.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098 A[PHI: r0 r7 r8
      0x0098: PHI (r0v13 int) = (r0v3 int), (r0v15 int) binds: [B:35:0x0097, B:33:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r7v3 b2.y0) = (r7v0 b2.y0), (r7v14 b2.y0) binds: [B:35:0x0097, B:33:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r8v8 int) = (r8v5 int), (r8v21 int) binds: [B:35:0x0097, B:33:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m15460t(b2.y0 r7, ww.AbstractC8193c r8) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.r0.m15460t(b2.y0, ww.c):java.lang.Object");
    }

    /* renamed from: u */
    public static final void m15461u(v0 v0Var, C4381z c4381z, InterfaceC4374s interfaceC4374s) {
        AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
        InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
        AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
        try {
            r1 r1VarM15480d = v0Var.m15480d();
            if (r1VarM15480d == null) {
                return;
            }
            l4.h0 h0Var = v0Var.f39707e;
            if (h0Var == null) {
                return;
            }
            InterfaceC7033t interfaceC7033tM15479c = v0Var.m15479c();
            if (interfaceC7033tM15479c == null) {
                return;
            }
            m15462v(c4381z, v0Var.f39703a, r1VarM15480d.f39668a, interfaceC7033tM15479c, h0Var, v0Var.m15478b(), interfaceC4374s);
        } finally {
            AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
        }
    }

    /* renamed from: v */
    public static void m15462v(C4381z c4381z, c1 c1Var, g4.l0 l0Var, InterfaceC7033t interfaceC7033t, l4.h0 h0Var, boolean z6, InterfaceC4374s interfaceC4374s) {
        if (z6) {
            int iMo2733Y = interfaceC4374s.mo2733Y(g4.n0.m6457d(c4381z.f21946b));
            C0848c c0848cM6444b = iMo2733Y < l0Var.f13670a.f13660a.f13620b.length() ? l0Var.m6444b(iMo2733Y) : iMo2733Y != 0 ? l0Var.m6444b(iMo2733Y - 1) : new C0848c(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 1.0f, (int) (f1.m15434a(c1Var.f39455b, c1Var.f39460g, c1Var.f39461h, f1.f39494a, 1) & 4294967295L));
            float f6 = c0848cM6444b.f5355b;
            float f10 = c0848cM6444b.f5354a;
            long jMo13299V = interfaceC7033t.mo13299V((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
            C0848c c0848cM10543a = b2.m10543a((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo13299V & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo13299V >> 32))) << 32), (Float.floatToRawIntBits(c0848cM6444b.f5356c - f10) << 32) | (Float.floatToRawIntBits(c0848cM6444b.f5357d - f6) & 4294967295L));
            if (AbstractC4154l.m8918a((l4.h0) h0Var.f21907a.f21852b.get(), h0Var)) {
                h0Var.f21908b.mo9096d(c0848cM10543a);
            }
        }
    }

    /* renamed from: w */
    public static final InterfaceC7879r m15463w(InterfaceC7879r interfaceC7879r, C2492h c2492h, g4.o0 o0Var, InterfaceC2139c interfaceC2139c, int i10, boolean z6, int i11, int i12, InterfaceC3987h interfaceC3987h, List list, InterfaceC2139c interfaceC2139c2, InterfaceC1566t interfaceC1566t, InterfaceC2139c interfaceC2139c3) {
        return interfaceC7879r.mo14852e(C7876o.f37669a).mo14852e(new TextAnnotatedStringElement(c2492h, o0Var, interfaceC3987h, interfaceC2139c, i10, z6, i11, i12, list, interfaceC2139c2, interfaceC1566t, interfaceC2139c3));
    }

    /* renamed from: x */
    public static final void m15464x(int i10, int i11) {
        if (!(i10 > 0 && i11 > 0)) {
            AbstractC4941a.m9884a("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero");
        }
        if (i10 <= i11) {
            return;
        }
        AbstractC4941a.m9884a("minLines " + i10 + " must be less than or equal to maxLines " + i11);
    }
}
