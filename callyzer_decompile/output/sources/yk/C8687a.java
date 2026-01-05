package yk;

import an.j5;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.text.TextUtils;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0408k;
import aq.C0409l;
import b00.C0526k;
import b00.C0529n;
import b00.a0;
import b2.C0554l;
import bm.AbstractC0690a;
import bm.C0691b;
import bm.C0694e;
import bm.C0696g;
import c00.AbstractC0836c;
import cd.C0955j;
import cd.C0959n;
import cm.C0983a;
import com.google.android.gms.internal.measurement.c8;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d7.InterfaceC1637j;
import d7.a1;
import d7.c1;
import d7.y0;
import dg.C1716e;
import dg.InterfaceC1713b;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import g2.e6;
import g2.fb;
import g2.p8;
import g2.q9;
import g2.r9;
import g2.sc;
import g2.u9;
import g2.v1;
import g2.y1;
import g2.z8;
import g4.o0;
import g7.AbstractC2538c;
import g7.C2536a;
import gf.InterfaceC2585a;
import h00.InterfaceC2767c;
import i0.m0;
import i7.C3179b;
import im.EnumC3313o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.i2;
import k2.w0;
import kn.C4132l;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import net.schmizz.sshj.userauth.UserAuthException;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import ny.InterfaceC5188b;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.h1;
import o1.m1;
import o1.n1;
import og.af;
import og.nc;
import og.r0;
import og.rb;
import og.uc;
import og.vc;
import og.wc;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import pg.i0;
import pg.r6;
import q1.C6080h;
import s2.AbstractC6740i;
import s2.C6734c;
import sc.InterfaceC6794n;
import ud.InterfaceC7403g;
import ug.InterfaceC7450u;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w1.C7860d;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;
import w4.C7922n;
import yg.InterfaceC8647d;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yk.a */
/* loaded from: classes.dex */
public final class C8687a implements InterfaceC8647d, InterfaceC7403g, InterfaceC1713b, InterfaceC5188b, InterfaceC6794n, InterfaceC2585a, InterfaceC2767c, InterfaceC7450u {

    /* renamed from: b */
    public static final /* synthetic */ C8687a f42036b = new C8687a(29);

    /* renamed from: a */
    public final /* synthetic */ int f42037a;

    public /* synthetic */ C8687a(int i10) {
        this.f42037a = i10;
    }

    /* renamed from: j */
    public static final float m16034j(float f6, float[] fArr, float[] fArr2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float fAbs = Math.abs(f6);
        float fSignum = Math.signum(f6);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        int i11 = i10 - 1;
        if (i11 >= fArr.length - 1) {
            float f14 = fArr[fArr.length - 1];
            return f14 == DefinitionKt.NO_Float_VALUE ? DefinitionKt.NO_Float_VALUE : (fArr2[fArr.length - 1] / f14) * f6;
        }
        if (i11 == -1) {
            float f15 = fArr[0];
            f12 = fArr2[0];
            f13 = f15;
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            float f16 = fArr[i11];
            float f17 = fArr[i10];
            f10 = fArr2[i11];
            f11 = f16;
            f12 = fArr2[i10];
            f13 = f17;
        }
        return (((f12 - f10) * Math.max(DefinitionKt.NO_Float_VALUE, Math.min(1.0f, f11 == f13 ? 0.0f : (fAbs - f11) / (f13 - f11)))) + f10) * fSignum;
    }

    /* renamed from: k */
    public static a1 m16035k(c1 owner, y0 factory, int i10) {
        if ((i10 & 2) != 0) {
            AbstractC4154l.m8923f(owner, "owner");
            factory = owner instanceof InterfaceC1637j ? ((InterfaceC1637j) owner).getDefaultViewModelProviderFactory() : C3179b.f17101a;
        }
        AbstractC4154l.m8923f(owner, "owner");
        AbstractC2538c extras = owner instanceof InterfaceC1637j ? ((InterfaceC1637j) owner).getDefaultViewModelCreationExtras() : C2536a.f13867b;
        AbstractC4154l.m8923f(owner, "owner");
        AbstractC4154l.m8923f(factory, "factory");
        AbstractC4154l.m8923f(extras, "extras");
        return new a1(owner.getViewModelStore(), factory, extras);
    }

    /* renamed from: l */
    public static C4132l m16036l(EnumC3313o leadState) {
        AbstractC4154l.m8923f(leadState, "leadState");
        return leadState == EnumC3313o.NoOptionSelected ? new C4132l(false, Integer.valueOf(R.string.lead_common_msg_select_option)) : new C4132l();
    }

    /* renamed from: m */
    public static a0 m16037m(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        C0529n c0529n = AbstractC0836c.f5299a;
        C0526k c0526k = new C0526k();
        c0526k.H0(str);
        return AbstractC0836c.m2258d(c0526k, false);
    }

    /* renamed from: o */
    public static a0 m16038o(File file) {
        String str = a0.f3585b;
        String string = file.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return m16037m(string);
    }

    /* renamed from: p */
    public static C4132l m16039p(String description) {
        AbstractC4154l.m8923f(description, "description");
        String string = AbstractC5178p.g0(description).toString();
        return AbstractC5178p.m10101L(string) ? new C4132l(false, Integer.valueOf(R.string.please_fill_out_all_fields)) : string.length() > 1000 ? new C4132l(false, Integer.valueOf(R.string.please_keep_description_under_1000_characters)) : new C4132l(true, null);
    }

    /* renamed from: q */
    public static C4132l m16040q(String str) {
        return AbstractC5178p.g0(str).toString().length() <= 2 ? new C4132l(false, Integer.valueOf(R.string.please_ensure_the_title)) : new C4132l(true, null);
    }

    /* renamed from: r */
    public static C4132l m16041r(String title) {
        AbstractC4154l.m8923f(title, "title");
        Pattern patternCompile = Pattern.compile("[/'\"%^`{}\\[\\]<>]");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        String string = AbstractC5178p.g0(title).toString();
        return AbstractC5178p.m10101L(string) ? new C4132l(false, Integer.valueOf(R.string.please_fill_out_all_fields)) : patternCompile.matcher(string).find() ? new C4132l(false, Integer.valueOf(R.string.the_slash_character_is_not_allowed_in_the_title)) : string.length() > 150 ? new C4132l(false, Integer.valueOf(R.string.please_keep_title_under_150_characters)) : new C4132l(true, null);
    }

    /* renamed from: s */
    public static C4132l m16042s(String str) {
        return str.length() > 1000 ? new C4132l(false, Integer.valueOf(R.string.please_keep_the_note)) : new C4132l(true, null);
    }

    /* renamed from: t */
    public static final boolean m16043t() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: u */
    public static final CharSequence m16044u(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // dg.InterfaceC1713b
    /* renamed from: a */
    public int mo5401a(Context context, String str, boolean z6) {
        return C1716e.m5405d(context, str, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* renamed from: b */
    public void m16045b(InterfaceC7879r interfaceC7879r, float f6, final C0983a c0983a, final boolean z6, final boolean z10, final long j6, long j10, final InterfaceC2139c pickedCountry, final long j11, final float f10, final C7860d c7860d, final float f11, final o0 o0Var, final o0 o0Var2, final boolean z11, final o0 o0Var3, final long j12, final boolean z12, InterfaceC3962k interfaceC3962k, final int i10) {
        final InterfaceC7879r interfaceC7879r2;
        final float f12;
        C3966o c3966o;
        final long j13;
        float f13;
        long j14;
        InterfaceC7879r interfaceC7879r3;
        r9 r9VarM6290b;
        float f14;
        Object obj;
        w0 w0Var;
        int i11;
        ?? r62;
        boolean z13;
        final InterfaceC7879r interfaceC7879r4;
        final long j15;
        C3966o c3966o2;
        AbstractC4154l.m8923f(pickedCountry, "pickedCountry");
        C3966o c3966o3 = (C3966o) interfaceC3962k;
        c3966o3.a0(-1874395666);
        int i12 = i10 | 54 | (c3966o3.m8616i(c0983a) ? 256 : 128) | (c3966o3.m8615h(z6) ? NewHope.SENDB_BYTES : 1024) | (c3966o3.m8615h(z10) ? 16384 : 8192) | (c3966o3.m8613f(j6) ? 131072 : 65536) | 524288 | (c3966o3.m8616i(pickedCountry) ? 8388608 : 4194304) | (c3966o3.m8613f(j11) ? 67108864 : 33554432) | (c3966o3.m8611d(f10) ? 536870912 : 268435456);
        int i13 = (c3966o3.m8614g(c7860d) ? 4 : 2) | (c3966o3.m8611d(f11) ? 32 : 16) | (c3966o3.m8614g(o0Var) ? 256 : 128) | (c3966o3.m8614g(o0Var2) ? NewHope.SENDB_BYTES : 1024) | (c3966o3.m8615h(z11) ? 16384 : 8192) | (c3966o3.m8614g(o0Var3) ? 131072 : 65536) | (c3966o3.m8615h(false) ? 1048576 : 524288) | (c3966o3.m8613f(j12) ? 8388608 : 4194304) | (c3966o3.m8615h(z12) ? 67108864 : 33554432) | (c3966o3.m8614g(this) ? 536870912 : 268435456);
        if (c3966o3.m8598P(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 306783379) == 306783378) ? false : true)) {
            c3966o3.m8603U();
            int i14 = i10 & 1;
            C7876o c7876o = C7876o.f37669a;
            if (i14 == 0 || c3966o3.m8584A()) {
                f13 = 0;
                j14 = ((v1) c3966o3.m8618k(y1.f13286a)).f12968o;
                interfaceC7879r3 = c7876o;
            } else {
                c3966o3.m8601S();
                interfaceC7879r3 = interfaceC7879r;
                f13 = f6;
                j14 = j10;
            }
            c3966o3.m8624q();
            final ArrayList arrayListM11031a = wc.m11031a();
            boolean zM8614g = c3966o3.m8614g(c0983a);
            Object objM8596M = c3966o3.m8596M();
            Object obj2 = C3961j.f20408a;
            if (zM8614g || objM8596M == obj2) {
                objM8596M = C3953b.m8517t(c0983a);
                c3966o3.j0(objM8596M);
            }
            final w0 w0Var2 = (w0) objM8596M;
            Object objM8596M2 = c3966o3.m8596M();
            if (objM8596M2 == obj2) {
                objM8596M2 = C3953b.m8517t(Boolean.FALSE);
                c3966o3.j0(objM8596M2);
            }
            w0 w0Var3 = (w0) objM8596M2;
            Object objM8596M3 = c3966o3.m8596M();
            if (objM8596M3 == obj2) {
                objM8596M3 = C3953b.m8517t("");
                c3966o3.j0(objM8596M3);
            }
            final w0 w0Var4 = (w0) objM8596M3;
            Object objM8596M4 = c3966o3.m8596M();
            if (objM8596M4 == obj2) {
                objM8596M4 = C3953b.m8517t(Boolean.FALSE);
                c3966o3.j0(objM8596M4);
            }
            final w0 w0Var5 = (w0) objM8596M4;
            final Context context = (Context) c3966o3.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            Object objM8596M5 = c3966o3.m8596M();
            if (objM8596M5 == obj2) {
                objM8596M5 = m0.m7389v(c3966o3);
            }
            InterfaceC4630l interfaceC4630l = (InterfaceC4630l) objM8596M5;
            if (z12) {
                c3966o3.m8607Y(-1249612771);
                r9VarM6290b = q9.m6290b(3, ((v1) c3966o3.m8618k(y1.f13286a)).f12954a);
                c3966o3.m8623p(false);
            } else {
                c3966o3.m8607Y(-1249460096);
                c3966o3.m8623p(false);
                r9VarM6290b = null;
            }
            r9 r9Var = r9VarM6290b;
            boolean z14 = (i13 & 234881024) == 67108864;
            Object objM8596M6 = c3966o3.m8596M();
            if (z14 || objM8596M6 == obj2) {
                objM8596M6 = new C0691b(z12, w0Var3, 0);
                c3966o3.j0(objM8596M6);
            }
            InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(AbstractC0237a.m636d(c7876o, interfaceC4630l, r9Var, false, null, (InterfaceC2137a) objM8596M6, 28), f13);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o3, 0);
            int i15 = c3966o3.f20462P;
            i1 i1VarM8620m = c3966o3.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o3, interfaceC7879rM656j);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o3.c0();
            if (c3966o3.f20461O) {
                c3966o3.m8619l(c7637i);
            } else {
                c3966o3.m0();
            }
            C7636h c7636h = C7638j.f36925f;
            C3953b.m8521x(c7636h, c5261tM10367a, c3966o3);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o3);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, c3966o3, i15, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o3);
            n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25763g, C7864c.f37652l, c3966o3, 54);
            int i16 = c3966o3.f20462P;
            i1 i1VarM8620m2 = c3966o3.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o3, c7876o);
            c3966o3.c0();
            if (c3966o3.f20461O) {
                c3966o3.m8619l(c7637i);
            } else {
                c3966o3.m0();
            }
            C3953b.m8521x(c7636h, n1VarM10357a, c3966o3);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o3);
            if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i16))) {
                AbstractC1452a.m4577x(i16, c3966o3, i16, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o3);
            if (z10) {
                c3966o3.m8607Y(1402900113);
                obj = obj2;
                f14 = f13;
                w0Var = w0Var3;
                r62 = 0;
                i11 = 3;
                z13 = true;
                i0.m11693a(r0.m10866b(uc.m10973c(((C0983a) w0Var2.getValue()).f5815d), 0, c3966o3), null, AbstractC0245d.m682s(interfaceC7879r3, 34), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o3, 48, 120);
            } else {
                f14 = f13;
                obj = obj2;
                w0Var = w0Var3;
                i11 = 3;
                r62 = 0;
                z13 = true;
                c3966o3.m8607Y(1397365466);
            }
            c3966o3.m8623p(r62);
            c3966o3.m8607Y(1397365466);
            c3966o3.m8623p(r62);
            if (z6) {
                c3966o3.m8607Y(1403556228);
                sc.m6307b(((C0983a) w0Var2.getValue()).f5813b, AbstractC0242a.m660n(c7876o, i11, DefinitionKt.NO_Float_VALUE, (float) r62, DefinitionKt.NO_Float_VALUE, 10), ((v1) c3966o3.m8618k(y1.f13286a)).f12970q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0Var3, c3966o3, 0, (i13 << 3) & 3670016, 65528);
            } else {
                c3966o3.m8607Y(1397365466);
            }
            c3966o3.m8623p(r62);
            c3966o3.m8607Y(1403924105);
            e6.m6133b(rb.m10871a(), "arrow down", null, j12, c3966o3, ((i13 >> 12) & 7168) | 48, 4);
            c3966o3.m8623p(r62);
            c3966o3.m8623p(z13);
            c3966o3.m8623p(z13);
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                c3966o3.m8607Y(-1247512583);
                Object objM8596M7 = c3966o3.m8596M();
                if (objM8596M7 == obj) {
                    objM8596M7 = new C0696g(w0Var, 1);
                    c3966o3.j0(objM8596M7);
                }
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M7;
                C7922n c7922n = new C7922n(i11, r62, r62);
                interfaceC7879r4 = interfaceC7879r3;
                final w0 w0Var6 = w0Var;
                j15 = j14;
                C6734c c6734cM12902d = AbstractC6740i.m12902d(-1078012640, new InterfaceC2141e() { // from class: bm.h
                    @Override // ex.InterfaceC2141e
                    public final Object invoke(Object obj3, Object obj4) {
                        InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        C3966o c3966o4 = (C3966o) interfaceC3962k2;
                        if (c3966o4.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final InterfaceC7879r interfaceC7879r5 = interfaceC7879r4;
                            final w0 w0Var7 = w0Var6;
                            final w0 w0Var8 = w0Var4;
                            final w0 w0Var9 = w0Var5;
                            C6734c c6734cM12902d2 = AbstractC6740i.m12902d(1116678884, new C0699j(interfaceC7879r5, w0Var7, w0Var8, w0Var9, 0), c3966o4);
                            final float f15 = f11;
                            final float f16 = f10;
                            final long j16 = j6;
                            final long j17 = j11;
                            final long j18 = j15;
                            final Context context2 = context;
                            final InterfaceC2139c interfaceC2139c = pickedCountry;
                            final o0 o0Var4 = o0Var;
                            final o0 o0Var5 = o0Var2;
                            final ArrayList arrayList = arrayListM11031a;
                            final w0 w0Var10 = w0Var2;
                            final C7860d c7860d2 = c7860d;
                            final C8687a c8687a = this;
                            final boolean z15 = z11;
                            u9.m6323a(null, c6734cM12902d2, null, null, null, 0, 0L, 0L, null, AbstractC6740i.m12902d(-789333905, new InterfaceC2142f() { // from class: bm.k
                                @Override // ex.InterfaceC2142f
                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                    h1 it = (h1) obj5;
                                    InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj6;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    AbstractC4154l.m8923f(it, "it");
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= ((C3966o) interfaceC3962k3).m8614g(it) ? 4 : 2;
                                    }
                                    C3966o c3966o5 = (C3966o) interfaceC3962k3;
                                    if (c3966o5.m8598P(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        FillElement fillElement = AbstractC0245d.f1971c;
                                        final InterfaceC7879r interfaceC7879r6 = interfaceC7879r5;
                                        InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(interfaceC7879r6.mo14852e(fillElement), DefinitionKt.NO_Float_VALUE, it.mo10344d(), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
                                        final ArrayList arrayList2 = arrayList;
                                        final Context context3 = context2;
                                        final float f17 = f15;
                                        final float f18 = f16;
                                        final long j19 = j17;
                                        final C7860d c7860d3 = c7860d2;
                                        final InterfaceC2139c interfaceC2139c2 = interfaceC2139c;
                                        final w0 w0Var11 = w0Var10;
                                        final o0 o0Var6 = o0Var4;
                                        final boolean z16 = z15;
                                        final o0 o0Var7 = o0Var5;
                                        final C8687a c8687a2 = c8687a;
                                        final w0 w0Var12 = w0Var8;
                                        final long j20 = j18;
                                        final w0 w0Var13 = w0Var7;
                                        final w0 w0Var14 = w0Var9;
                                        fb.m6164a(interfaceC7879rM660n, null, j16, 0L, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, AbstractC6740i.m12902d(823134516, new InterfaceC2141e() { // from class: bm.m
                                            @Override // ex.InterfaceC2141e
                                            public final Object invoke(Object obj8, Object obj9) {
                                                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj8;
                                                int iIntValue3 = ((Integer) obj9).intValue();
                                                C3966o c3966o6 = (C3966o) interfaceC3962k4;
                                                if (c3966o6.m8598P(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    C5261t c5261tM10367a2 = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o6, 0);
                                                    int i17 = c3966o6.f20462P;
                                                    i1 i1VarM8620m3 = c3966o6.m8620m();
                                                    C7876o c7876o2 = C7876o.f37669a;
                                                    InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o6, c7876o2);
                                                    InterfaceC7639k.V0.getClass();
                                                    InterfaceC2137a interfaceC2137a2 = C7638j.f36921b;
                                                    c3966o6.c0();
                                                    if (c3966o6.f20461O) {
                                                        c3966o6.m8619l(interfaceC2137a2);
                                                    } else {
                                                        c3966o6.m0();
                                                    }
                                                    C7636h c7636h5 = C7638j.f36925f;
                                                    C3953b.m8521x(c7636h5, c5261tM10367a2, c3966o6);
                                                    C7636h c7636h6 = C7638j.f36924e;
                                                    C3953b.m8521x(c7636h6, i1VarM8620m3, c3966o6);
                                                    C7636h c7636h7 = C7638j.f36926g;
                                                    if (c3966o6.f20461O || !AbstractC4154l.m8918a(c3966o6.m8596M(), Integer.valueOf(i17))) {
                                                        AbstractC1452a.m4577x(i17, c3966o6, i17, c7636h7);
                                                    }
                                                    C7636h c7636h8 = C7638j.f36923d;
                                                    C3953b.m8521x(c7636h8, interfaceC7879rM14845c3, c3966o6);
                                                    C7870i c7870i = C7864c.f37652l;
                                                    InterfaceC7879r interfaceC7879rM656j2 = AbstractC0242a.m656j(c7876o2, 10);
                                                    n1 n1VarM10357a2 = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o6, 48);
                                                    int i18 = c3966o6.f20462P;
                                                    i1 i1VarM8620m4 = c3966o6.m8620m();
                                                    InterfaceC7879r interfaceC7879rM14845c4 = AbstractC7862a.m14845c(c3966o6, interfaceC7879rM656j2);
                                                    c3966o6.c0();
                                                    if (c3966o6.f20461O) {
                                                        c3966o6.m8619l(interfaceC2137a2);
                                                    } else {
                                                        c3966o6.m0();
                                                    }
                                                    C3953b.m8521x(c7636h5, n1VarM10357a2, c3966o6);
                                                    C3953b.m8521x(c7636h6, i1VarM8620m4, c3966o6);
                                                    if (c3966o6.f20461O || !AbstractC4154l.m8918a(c3966o6.m8596M(), Integer.valueOf(i18))) {
                                                        AbstractC1452a.m4577x(i18, c3966o6, i18, c7636h7);
                                                    }
                                                    C3953b.m8521x(c7636h8, interfaceC7879rM14845c4, c3966o6);
                                                    long j21 = j20;
                                                    final w0 w0Var15 = w0Var12;
                                                    InterfaceC2141e interfaceC2141eM12902d = AbstractC6740i.m12902d(1460696808, new C0703n(0, j21, w0Var15), c3966o6);
                                                    String str = (String) w0Var15.getValue();
                                                    Object objM8596M8 = c3966o6.m8596M();
                                                    Object obj10 = C3961j.f20408a;
                                                    if (objM8596M8 == obj10) {
                                                        objM8596M8 = new C0692c(w0Var15, 0);
                                                        c3966o6.j0(objM8596M8);
                                                    }
                                                    c8687a2.m16046i(interfaceC2141eM12902d, str, 0L, (InterfaceC2139c) objM8596M8, c3966o6, 3078);
                                                    c3966o6.m8623p(true);
                                                    final ArrayList arrayList3 = arrayList2;
                                                    boolean zM8616i = c3966o6.m8616i(arrayList3);
                                                    final Context context4 = context3;
                                                    boolean zM8616i2 = zM8616i | c3966o6.m8616i(context4);
                                                    final float f19 = f17;
                                                    boolean zM8611d = zM8616i2 | c3966o6.m8611d(f19);
                                                    final float f20 = f18;
                                                    boolean zM8611d2 = zM8611d | c3966o6.m8611d(f20);
                                                    final long j22 = j19;
                                                    boolean zM8613f = zM8611d2 | c3966o6.m8613f(j22);
                                                    final C7860d c7860d4 = c7860d3;
                                                    boolean zM8614g2 = zM8613f | c3966o6.m8614g(c7860d4);
                                                    final InterfaceC2139c interfaceC2139c3 = interfaceC2139c2;
                                                    boolean zM8614g3 = zM8614g2 | c3966o6.m8614g(interfaceC2139c3);
                                                    final w0 w0Var16 = w0Var11;
                                                    boolean zM8614g4 = zM8614g3 | c3966o6.m8614g(w0Var16);
                                                    final InterfaceC7879r interfaceC7879r7 = interfaceC7879r6;
                                                    boolean zM8614g5 = zM8614g4 | c3966o6.m8614g(interfaceC7879r7);
                                                    final o0 o0Var8 = o0Var6;
                                                    boolean zM8614g6 = zM8614g5 | c3966o6.m8614g(o0Var8);
                                                    final boolean z17 = z16;
                                                    boolean zM8615h = zM8614g6 | c3966o6.m8615h(z17);
                                                    final o0 o0Var9 = o0Var7;
                                                    boolean zM8614g7 = zM8615h | c3966o6.m8614g(o0Var9);
                                                    Object objM8596M9 = c3966o6.m8596M();
                                                    if (zM8614g7 || objM8596M9 == obj10) {
                                                        final w0 w0Var17 = w0Var13;
                                                        final w0 w0Var18 = w0Var14;
                                                        Object obj11 = new InterfaceC2139c() { // from class: bm.d
                                                            @Override // ex.InterfaceC2139c
                                                            public final Object invoke(Object obj12) throws Resources.NotFoundException {
                                                                ArrayList arrayList4;
                                                                C6080h LazyColumn = (C6080h) obj12;
                                                                AbstractC4154l.m8923f(LazyColumn, "$this$LazyColumn");
                                                                w0 w0Var19 = w0Var15;
                                                                int length = ((String) w0Var19.getValue()).length();
                                                                ArrayList arrayList5 = arrayList3;
                                                                if (length == 0) {
                                                                    arrayList4 = arrayList5;
                                                                } else {
                                                                    String strM10136r = AbstractC5185w.m10136r((String) w0Var19.getValue(), "+", "");
                                                                    Context context5 = context4;
                                                                    AbstractC4154l.m8923f(context5, "context");
                                                                    arrayList4 = new ArrayList();
                                                                    boolean zIsDigitsOnly = TextUtils.isDigitsOnly(strM10136r);
                                                                    int size = arrayList5.size();
                                                                    int i19 = 0;
                                                                    while (i19 < size) {
                                                                        Object obj13 = arrayList5.get(i19);
                                                                        i19++;
                                                                        C0983a c0983a2 = (C0983a) obj13;
                                                                        if (zIsDigitsOnly && AbstractC5178p.m10116x(c0983a2.f5813b, strM10136r, false)) {
                                                                            arrayList4.add(c0983a2);
                                                                        } else {
                                                                            String string = context5.getResources().getString(vc.m11014a(c0983a2.f5815d));
                                                                            AbstractC4154l.m8922e(string, "getString(...)");
                                                                            Locale locale = Locale.ROOT;
                                                                            String lowerCase = string.toLowerCase(locale);
                                                                            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
                                                                            String lowerCase2 = strM10136r.toLowerCase(locale);
                                                                            AbstractC4154l.m8922e(lowerCase2, "toLowerCase(...)");
                                                                            if (AbstractC5178p.m10116x(lowerCase, lowerCase2, false)) {
                                                                                arrayList4.add(c0983a2);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                LazyColumn.m12099p(arrayList4.size(), new C0408k(1, new j5(16), arrayList4), new C0409l(arrayList4, 1), new C6734c(new C0705p(arrayList4, f19, f20, j22, c7860d4, interfaceC2139c3, w0Var16, w0Var17, w0Var19, w0Var18, interfaceC7879r7, o0Var8, z17, o0Var9), true, -632812321));
                                                                return qw.a0.f30746a;
                                                            }
                                                        };
                                                        c3966o6.j0(obj11);
                                                        objM8596M9 = obj11;
                                                    }
                                                    nc.m10774a(null, null, null, null, null, null, false, (InterfaceC2139c) objM8596M9, c3966o6, 0, 255);
                                                    c3966o6.m8623p(true);
                                                } else {
                                                    c3966o6.m8601S();
                                                }
                                                return qw.a0.f30746a;
                                            }
                                        }, c3966o5), c3966o5, 12582912, 122);
                                    } else {
                                        c3966o5.m8601S();
                                    }
                                    return qw.a0.f30746a;
                                }
                            }, c3966o4), c3966o4, 805306416, 509);
                        } else {
                            c3966o4.m8601S();
                        }
                        return qw.a0.f30746a;
                    }
                }, c3966o3);
                InterfaceC3962k interfaceC3962k2 = c3966o3;
                r6.m11845a(interfaceC2137a, c7922n, c6734cM12902d, interfaceC3962k2, 438, 0);
                c3966o2 = interfaceC3962k2;
            } else {
                C3966o c3966o4 = c3966o3;
                interfaceC7879r4 = interfaceC7879r3;
                j15 = j14;
                c3966o4.m8607Y(-1254612172);
                c3966o2 = c3966o4;
            }
            c3966o2.m8623p(r62);
            f12 = f14;
            c3966o = c3966o2;
            j13 = j15;
            interfaceC7879r2 = interfaceC7879r4;
        } else {
            c3966o3.m8601S();
            interfaceC7879r2 = interfaceC7879r;
            f12 = f6;
            c3966o = c3966o3;
            j13 = j10;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new InterfaceC2141e(interfaceC7879r2, f12, c0983a, z6, z10, j6, j13, pickedCountry, j11, f10, c7860d, f11, o0Var, o0Var2, z11, o0Var3, j12, z12, i10) { // from class: bm.i

                /* renamed from: b */
                public final /* synthetic */ InterfaceC7879r f4375b;

                /* renamed from: c */
                public final /* synthetic */ float f4376c;

                /* renamed from: d */
                public final /* synthetic */ C0983a f4377d;

                /* renamed from: e */
                public final /* synthetic */ boolean f4378e;

                /* renamed from: f */
                public final /* synthetic */ boolean f4379f;

                /* renamed from: g */
                public final /* synthetic */ long f4380g;

                /* renamed from: h */
                public final /* synthetic */ long f4381h;

                /* renamed from: j */
                public final /* synthetic */ InterfaceC2139c f4382j;

                /* renamed from: k */
                public final /* synthetic */ long f4383k;

                /* renamed from: l */
                public final /* synthetic */ float f4384l;

                /* renamed from: m */
                public final /* synthetic */ C7860d f4385m;

                /* renamed from: n */
                public final /* synthetic */ float f4386n;

                /* renamed from: p */
                public final /* synthetic */ o0 f4387p;

                /* renamed from: q */
                public final /* synthetic */ o0 f4388q;

                /* renamed from: r */
                public final /* synthetic */ boolean f4389r;

                /* renamed from: s */
                public final /* synthetic */ o0 f4390s;

                /* renamed from: t */
                public final /* synthetic */ long f4391t;

                /* renamed from: v */
                public final /* synthetic */ boolean f4392v;

                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iM8496A = C3953b.m8496A(1);
                    this.f4374a.m16045b(this.f4375b, this.f4376c, this.f4377d, this.f4378e, this.f4379f, this.f4380g, this.f4381h, this.f4382j, this.f4383k, this.f4384l, this.f4385m, this.f4386n, this.f4387p, this.f4388q, this.f4389r, this.f4390s, this.f4391t, this.f4392v, (InterfaceC3962k) obj3, iM8496A);
                    return qw.a0.f30746a;
                }
            };
        }
    }

    @Override // ny.InterfaceC5188b
    /* renamed from: c */
    public Throwable mo394c(Exception exc) {
        return exc instanceof UserAuthException ? (UserAuthException) exc : new UserAuthException(exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0164 A[LOOP:2: B:40:0x015e->B:42:0x0164, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0193  */
    @Override // sc.InterfaceC6794n
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tc.C7117b mo395d(bd.C0645a r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.C8687a.mo395d(bd.a, java.lang.Object):tc.b");
    }

    @Override // ud.InterfaceC7403g
    /* renamed from: e */
    public Object mo1988e(InterfaceC2139c interfaceC2139c) {
        C0955j c0955j = new C0955j();
        interfaceC2139c.invoke(c0955j);
        return new C0959n(new C0554l(c0955j));
    }

    @Override // dg.InterfaceC1713b
    /* renamed from: g */
    public int mo5402g(Context context, String str) {
        return C1716e.m5403a(context, str);
    }

    @Override // gf.InterfaceC2585a
    public long getTime() {
        return System.currentTimeMillis();
    }

    @Override // h00.InterfaceC2767c
    /* renamed from: h */
    public Map mo6762h() {
        return null;
    }

    /* renamed from: i */
    public void m16046i(final InterfaceC2141e interfaceC2141e, final String str, long j6, final InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k, final int i10) {
        final long j10;
        long j11;
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-2065508098);
        int i12 = i10 | (c3966o.m8614g(str) ? 32 : 16) | 128;
        if (c3966o.m8598P(i12 & 1, (i12 & 1171) != 1170)) {
            c3966o.m8603U();
            if ((i10 & 1) == 0 || c3966o.m8584A()) {
                j11 = ((v1) c3966o.m8618k(y1.f13286a)).f12968o;
                i11 = i12 & (-897);
            } else {
                c3966o.m8601S();
                i11 = i12 & (-897);
                j11 = j6;
            }
            int i13 = i11;
            c3966o.m8624q();
            float f6 = 5;
            InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), f6, f6);
            o0 o0Var = new o0(0L, af.m10534c(14), null, null, null, 0L, 5, 0L, 16744445);
            C7860d c7860dM14841b = AbstractC7861e.m14841b(8);
            p8 p8Var = p8.f12424a;
            i2 i2Var = y1.f13286a;
            long j12 = ((v1) c3966o.m8618k(i2Var)).f12928A;
            long j13 = ((v1) c3966o.m8618k(i2Var)).f12928A;
            long j14 = ((v1) c3966o.m8618k(i2Var)).f12971r;
            long j15 = ((v1) c3966o.m8618k(i2Var)).f12971r;
            long j16 = ((v1) c3966o.m8618k(i2Var)).f12971r;
            long j17 = ((v1) c3966o.m8618k(i2Var)).f12971r;
            long j18 = j11;
            byte b10 = 0;
            z8.m6356a(str, interfaceC2139c, interfaceC7879rM657k, false, false, o0Var, null, AbstractC0690a.f4326b, AbstractC6740i.m12902d(-1225571418, new C0694e(j18, b10, b10), c3966o), interfaceC2141e, null, false, null, null, null, true, 1, 0, null, c7860dM14841b, p8.m6231e(j14, j16, j15, j17, j12, j13, 0L, c3966o, 2147477263), c3966o, ((i13 >> 3) & 14) | 918553008, 113246208, 0, 1703000);
            c3966o = c3966o;
            j10 = j18;
        } else {
            c3966o.m8601S();
            j10 = j6;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new InterfaceC2141e(interfaceC2141e, str, j10, interfaceC2139c, i10) { // from class: bm.f

                /* renamed from: b */
                public final /* synthetic */ InterfaceC2141e f4350b;

                /* renamed from: c */
                public final /* synthetic */ String f4351c;

                /* renamed from: d */
                public final /* synthetic */ long f4352d;

                /* renamed from: e */
                public final /* synthetic */ InterfaceC2139c f4353e;

                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM8496A = C3953b.m8496A(3079);
                    this.f4349a.m16046i(this.f4350b, this.f4351c, this.f4352d, this.f4353e, (InterfaceC3962k) obj, iM8496A);
                    return qw.a0.f30746a;
                }
            };
        }
    }

    public String toString() {
        switch (this.f42037a) {
            case 21:
                return "SOME";
            default:
                return super.toString();
        }
    }

    @Override // ug.InterfaceC7450u
    public Object zza() {
        return new Boolean(((Boolean) c8.f6102a.m3530b()).booleanValue());
    }

    @Override // h00.InterfaceC2767c
    public void clear() {
    }

    @Override // h00.InterfaceC2767c
    /* renamed from: f */
    public void mo6761f(Map map) {
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public void mo780n(Exception exc) {
    }

    @Override // h00.InterfaceC2767c
    public void put(String str, String str2) {
    }
}
