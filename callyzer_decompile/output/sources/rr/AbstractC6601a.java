package rr;

import android.content.Context;
import androidx.compose.animation.AbstractC0236c;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import av.C0458a;
import aw.C0467g;
import bm.C0699j;
import bt.C0760e;
import bt.C0765j;
import bt.C0768m;
import bt.C0770o;
import bt.p0;
import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import cv.C1513i;
import d3.C1565s;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.a2;
import g2.e6;
import g2.f4;
import g2.g4;
import g2.h4;
import g2.p9;
import g2.t4;
import g2.t6;
import g2.u4;
import g2.u9;
import g2.v2;
import g2.v4;
import g2.y2;
import g4.o0;
import ht.C3032g;
import i0.m0;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import java.util.List;
import java.util.Locale;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.e1;
import k2.n1;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4182l;
import kx.C4266h;
import lu.C4517c;
import m1.InterfaceC4630l;
import mm.AbstractC4801l;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.i1;
import o1.m1;
import og.gg;
import og.hg;
import og.u0;
import op.C5434c;
import or.C5445h;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p1.AbstractC5788a;
import pg.c0;
import pg.f9;
import pr.C5998a;
import qr.C6286j;
import qr.f0;
import qv.C6334i;
import qw.C6361k;
import rn.i0;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.b1;
import sq.g2;
import t3.j0;
import uv.AbstractC7554g;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;
import w4.AbstractC7917i;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rr.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6601a {

    /* renamed from: a */
    public static final C6734c f31718a = new C6734c(new C4182l(23), false, 1155893681);

    /* renamed from: b */
    public static final C6734c f31719b = new C6734c(new C4182l(24), false, 2034185626);

    /* renamed from: c */
    public static final C6734c f31720c = new C6734c(new C6286j(11), false, 1820859082);

    /* renamed from: d */
    public static final C6734c f31721d = new C6734c(new C4182l(25), false, 1357253002);

    /* renamed from: e */
    public static final C6734c f31722e = new C6734c(new C6286j(12), false, 1467678454);

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ec  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12658a(w2.InterfaceC7879r r28, java.util.List r29, java.lang.String r30, java.lang.String r31, ex.InterfaceC2139c r32, ex.InterfaceC2141e r33, k2.InterfaceC3962k r34, int r35) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.AbstractC6601a.m12658a(w2.r, java.util.List, java.lang.String, java.lang.String, ex.c, ex.e, k2.k, int):void");
    }

    /* renamed from: b */
    public static final void m12659b(LocalDate localDate, LocalDate localDate2, InterfaceC2141e onDateRangeSelected, InterfaceC2137a onDismissRequest, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o;
        ZonedDateTime zonedDateTimeAtStartOfDay;
        Instant instant;
        ZonedDateTime zonedDateTimeAtStartOfDay2;
        Instant instant2;
        AbstractC4154l.m8923f(onDateRangeSelected, "onDateRangeSelected");
        AbstractC4154l.m8923f(onDismissRequest, "onDismissRequest");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(1717535737);
        int i11 = i10 | (c3966o2.m8616i(localDate) ? 4 : 2) | (c3966o2.m8616i(localDate2) ? 32 : 16) | (c3966o2.m8616i(onDateRangeSelected) ? 256 : 128);
        if (c3966o2.m8598P(i11 & 1, (i11 & 1171) != 1170)) {
            Context context = (Context) c3966o2.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            Long lValueOf = null;
            Long lValueOf2 = (localDate == null || (zonedDateTimeAtStartOfDay2 = localDate.atStartOfDay(ZoneOffset.UTC)) == null || (instant2 = zonedDateTimeAtStartOfDay2.toInstant()) == null) ? null : Long.valueOf(instant2.toEpochMilli());
            if (localDate2 != null && (zonedDateTimeAtStartOfDay = localDate2.atStartOfDay(ZoneOffset.UTC)) != null && (instant = zonedDateTimeAtStartOfDay.toInstant()) != null) {
                lValueOf = Long.valueOf(instant.toEpochMilli());
            }
            Long l9 = lValueOf;
            i1 i1Var = u4.f12866a;
            C4266h c4266h = y2.f13289b;
            v2 v2Var = y2.f13291d;
            Locale localeM6258v = p9.m6258v(c3966o2);
            Object[] objArr = new Object[0];
            C0917l c0917lM10675b = gg.m10675b(a2.f11154w, new g4(v2Var, localeM6258v, 1));
            boolean zM8612e = c3966o2.m8612e(0) | c3966o2.m8614g(lValueOf2) | c3966o2.m8614g(l9) | c3966o2.m8614g(lValueOf2) | c3966o2.m8616i(c4266h) | c3966o2.m8614g(v2Var) | c3966o2.m8616i(localeM6258v);
            Object objM8596M = c3966o2.m8596M();
            if (zM8612e || objM8596M == C3961j.f20408a) {
                objM8596M = new t4(lValueOf2, l9, lValueOf2, c4266h, v2Var, localeM6258v, 0);
                c3966o2.j0(objM8596M);
            }
            Object objM10691b = hg.m10691b(objArr, c0917lM10675b, (InterfaceC2137a) objM8596M, c3966o2, 0, 4);
            c3966o = c3966o2;
            v4 v4Var = (v4) objM10691b;
            ((e1) v4Var.f11537c).setValue(v2Var);
            AbstractC7917i.m15048b(null, 0L, onDismissRequest, null, AbstractC6740i.m12902d(-1702284772, new C6602b(onDismissRequest, onDateRangeSelected, v4Var, context, 0), c3966o), c3966o, 24960, 11);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0699j(i10, 13, localDate, localDate2, onDateRangeSelected, onDismissRequest);
        }
    }

    /* renamed from: c */
    public static final void m12660c(LocalDate localDate, LocalDate localDate2, String label, String dateFormat, InterfaceC2137a openDatePickerDialog, InterfaceC3962k interfaceC3962k, int i10) {
        boolean z6;
        long j6;
        o0 o0Var;
        boolean z10;
        String strM16199h;
        AbstractC4154l.m8923f(label, "label");
        AbstractC4154l.m8923f(dateFormat, "dateFormat");
        AbstractC4154l.m8923f(openDatePickerDialog, "openDatePickerDialog");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-2122837991);
        int i11 = i10 | (c3966o.m8616i(localDate) ? 4 : 2) | (c3966o.m8616i(localDate2) ? 32 : 16) | (c3966o.m8614g(label) ? 256 : 128) | (c3966o.m8614g(dateFormat) ? NewHope.SENDB_BYTES : 1024) | (c3966o.m8616i(openDatePickerDialog) ? 16384 : 8192);
        if (c3966o.m8598P(i11 & 1, (i11 & 9363) != 9362)) {
            C7876o c7876o = C7876o.f37669a;
            float f6 = 7;
            InterfaceC7879r interfaceC7879rM14843a = AbstractC7862a.m14843a(c0.m11560a(AbstractC0237a.m633a(AbstractC0245d.m665b(AbstractC0245d.m668e(AbstractC0242a.m658l(c7876o, DefinitionKt.NO_Float_VALUE, 8, 1), 1.0f), DefinitionKt.NO_Float_VALUE, 55, 1), t6.m6310a(c3966o).f12971r, AbstractC7861e.m14841b(f6)), 1, C1565s.m5186b(0.3f, 14, t6.m6310a(c3966o).f12929B), AbstractC7861e.m14841b(f6)), new C6604d(0, openDatePickerDialog));
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37646e, false);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM14843a);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C7636h c7636h = C7638j.f36925f;
            C3953b.m8521x(c7636h, j0VarM10361d, c3966o);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o);
            C7870i c7870i = C7864c.f37652l;
            InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(c7876o, 15, DefinitionKt.NO_Float_VALUE, 2);
            o1.n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o, 48);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM658l);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, n1VarM10357a, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
            if (1.0f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            InterfaceC7879r interfaceC7879rM9747u = AbstractC4801l.m9747u(1.0f, interfaceC7879rM668e, true);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25761e, C7864c.f37654n, c3966o, 6);
            int i14 = c3966o.f20462P;
            k2.i1 i1VarM8620m3 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM9747u);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, c5261tM10367a, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m3, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i14))) {
                AbstractC1452a.m4577x(i14, c3966o, i14, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c3, c3966o);
            if (localDate == null || localDate2 == null) {
                z6 = false;
                c3966o.m8607Y(1373588174);
                j6 = AbstractC7554g.m14301b(c3966o).f36389a;
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(1373499638);
                j6 = t6.m6310a(c3966o).f12970q;
                z6 = false;
                c3966o.m8623p(false);
            }
            if (localDate == null || localDate2 == null) {
                c3966o.m8607Y(1373836918);
                o0Var = t6.m6311b(c3966o).f13055k;
                c3966o.m8623p(z6);
            } else {
                c3966o.m8607Y(1373749591);
                o0Var = t6.m6311b(c3966o).f13056l;
                c3966o.m8623p(z6);
            }
            b1.m13113q(label, null, j6, null, null, 0, 0, 0L, null, o0Var, c3966o, (i11 >> 6) & 14, 506);
            c3966o = c3966o;
            if (localDate != null) {
                c3966o.m8607Y(1373996599);
                if (localDate2 != null) {
                    C8800o c8800o = C8800o.f42459a;
                    strM16199h = m0.m7379l(C8800o.m16199h(localDate, dateFormat), " to ", C8800o.m16199h(localDate2, dateFormat));
                } else {
                    C8800o c8800o2 = C8800o.f42459a;
                    strM16199h = C8800o.m16199h(localDate, dateFormat);
                }
                b1.m13113q(strM16199h, null, t6.m6310a(c3966o).f12970q, null, null, 0, 0, 0L, null, t6.m6311b(c3966o).f13055k, c3966o, 0, 506);
                c3966o = c3966o;
                z10 = false;
            } else {
                z10 = false;
                c3966o.m8607Y(1370861321);
            }
            c3966o.m8623p(z10);
            c3966o.m8623p(true);
            e6.m6133b(u0.m10941c(R.drawable.ic_calender, 6, c3966o), null, null, t6.m6310a(c3966o).f12968o, c3966o, 48, 4);
            c3966o.m8623p(true);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0760e((Object) localDate, (Object) localDate2, (Object) label, (Object) dateFormat, openDatePickerDialog, i10, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12661d(w2.InterfaceC7879r r35, java.util.List r36, java.lang.String r37, java.lang.String r38, ex.InterfaceC2137a r39, boolean r40, ex.InterfaceC2141e r41, ex.InterfaceC2139c r42, k2.InterfaceC3962k r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.AbstractC6601a.m12661d(w2.r, java.util.List, java.lang.String, java.lang.String, ex.a, boolean, ex.e, ex.c, k2.k, int, int):void");
    }

    /* renamed from: e */
    public static final void m12662e(InterfaceC7879r interfaceC7879r, String title, List options, InterfaceC2137a openSelection, InterfaceC2139c removeSelected, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(openSelection, "openSelection");
        AbstractC4154l.m8923f(removeSelected, "removeSelected");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-2131664358);
        int i11 = i10 | (c3966o.m8614g(title) ? 32 : 16) | (c3966o.m8616i(options) ? 256 : 128) | (c3966o.m8616i(openSelection) ? NewHope.SENDB_BYTES : 1024) | (c3966o.m8616i(removeSelected) ? 16384 : 8192);
        if (c3966o.m8598P(i11 & 1, (i11 & 9363) != 9362)) {
            p9.m6240d(interfaceC7879r, AbstractC7861e.m14841b(12), null, null, null, AbstractC6740i.m12902d(-315464052, new C0768m(openSelection, title, options, removeSelected), c3966o), c3966o, 196614, 28);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0760e((Object) interfaceC7879r, (Object) title, (Object) options, openSelection, removeSelected, i10, 7);
        }
    }

    /* renamed from: f */
    public static final void m12663f(C6361k notContactedValue, InterfaceC2139c onValueChange, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        w0 w0Var;
        h4 h4Var;
        boolean z6;
        Object c0765j;
        Object obj;
        int i12;
        w0 w0Var2;
        String strM16197f;
        ZonedDateTime zonedDateTimeAtStartOfDay;
        Instant instant;
        AbstractC4154l.m8923f(notContactedValue, "notContactedValue");
        Object obj2 = notContactedValue.f30756b;
        Object obj3 = notContactedValue.f30755a;
        AbstractC4154l.m8923f(onValueChange, "onValueChange");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(561591524);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c3966o.m8616i(notContactedValue) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(onValueChange) ? 32 : 16;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            String string = ((Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b)).getString(R.string.view_not_contacted_lead);
            AbstractC4154l.m8922e(string, "getString(...)");
            float f6 = 10;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM632a = AbstractC0236c.m632a(AbstractC0245d.m668e(AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, 4, DefinitionKt.NO_Float_VALUE, f6, 5), 1.0f));
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM632a);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            Boolean bool = (Boolean) obj3;
            boolean zBooleanValue = bool.booleanValue();
            InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(c7876o, DefinitionKt.NO_Float_VALUE, f6, 1);
            C6734c c6734cM12902d = AbstractC6740i.m12902d(-1703033369, new C4517c(string, 1), c3966o);
            int i14 = i11 & 112;
            boolean zM8616i = (i14 == 32) | c3966o.m8616i(notContactedValue);
            Object objM8596M = c3966o.m8596M();
            Object obj4 = C3961j.f20408a;
            if (zM8616i || objM8596M == obj4) {
                objM8596M = new C6334i(3, (Object) onValueChange, (Object) notContactedValue);
                c3966o.j0(objM8596M);
            }
            g2.m13170v(zBooleanValue, null, interfaceC7879rM658l, null, c6734cM12902d, (InterfaceC2139c) objM8596M, c3966o, 24960, 10);
            c3966o = c3966o;
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == obj4) {
                objM8596M2 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M2);
            }
            w0 w0Var3 = (w0) objM8596M2;
            LocalDate localDate = (LocalDate) obj2;
            h4 h4VarM6156p = f4.m6156p((localDate == null || (zonedDateTimeAtStartOfDay = localDate.atStartOfDay(ZoneId.of("UTC"))) == null || (instant = zonedDateTimeAtStartOfDay.toInstant()) == null) ? null : Long.valueOf(instant.toEpochMilli()), new C0458a(6), c3966o);
            if (bool.booleanValue()) {
                c3966o.m8607Y(73950547);
                if (localDate != null) {
                    C8800o c8800o = C8800o.f42459a;
                    strM16197f = C8800o.m16197f(localDate);
                } else {
                    strM16197f = null;
                }
                if (strM16197f == null) {
                    strM16197f = "";
                }
                String strM11629c = f9.m11629c(c3966o, R.string.not_connected_since_select_date);
                c3966o.m8607Y(1664965637);
                Object objM8596M3 = c3966o.m8596M();
                if (objM8596M3 == obj4) {
                    objM8596M3 = m0.m7389v(c3966o);
                }
                InterfaceC4630l interfaceC4630l = (InterfaceC4630l) objM8596M3;
                boolean zM8614g = c3966o.m8614g(interfaceC4630l);
                Object objM8596M4 = c3966o.m8596M();
                if (zM8614g || objM8596M4 == obj4) {
                    objM8596M4 = new C3032g(interfaceC4630l, w0Var3, null, 1);
                    c3966o.j0(objM8596M4);
                }
                C3953b.m8503f((InterfaceC2141e) objM8596M4, interfaceC4630l, c3966o);
                c3966o.m8623p(false);
                InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
                Object objM8596M5 = c3966o.m8596M();
                if (objM8596M5 == obj4) {
                    objM8596M5 = new i0(10);
                    c3966o.j0(objM8596M5);
                }
                String str = strM16197f;
                w0Var = w0Var3;
                z6 = false;
                h4Var = h4VarM6156p;
                b1.m13111o(str, (InterfaceC2139c) objM8596M5, interfaceC7879rM668e, null, null, strM11629c, false, false, null, null, 0, 0, f31722e, true, null, null, interfaceC4630l, c3966o, 432, 27648, 106456);
                c3966o = c3966o;
            } else {
                w0Var = w0Var3;
                h4Var = h4VarM6156p;
                z6 = false;
                c3966o.m8607Y(70843572);
            }
            c3966o.m8623p(z6);
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                c3966o.m8607Y(75026619);
                boolean zM8616i2 = c3966o.m8616i(notContactedValue) | (i14 == 32 ? true : z6) | c3966o.m8614g(h4Var);
                Object objM8596M6 = c3966o.m8596M();
                if (zM8616i2 || objM8596M6 == obj4) {
                    obj = obj4;
                    i12 = i14;
                    w0Var2 = w0Var;
                    c0765j = new C0765j(onValueChange, notContactedValue, h4Var, w0Var2, 10);
                    c3966o.j0(c0765j);
                } else {
                    i12 = i14;
                    w0Var2 = w0Var;
                    c0765j = objM8596M6;
                    obj = obj4;
                }
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) c0765j;
                Object objM8596M7 = c3966o.m8596M();
                if (objM8596M7 == obj) {
                    objM8596M7 = new C5434c(w0Var2, 16);
                    c3966o.j0(objM8596M7);
                }
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M7;
                boolean zM8616i3 = c3966o.m8616i(notContactedValue) | (i12 == 32 ? true : z6);
                Object objM8596M8 = c3966o.m8596M();
                if (zM8616i3 || objM8596M8 == obj) {
                    objM8596M8 = new C0467g(18, w0Var2, onValueChange, notContactedValue);
                    c3966o.j0(objM8596M8);
                }
                g2.m13123A(string, h4Var, interfaceC2137a, interfaceC2137a2, (InterfaceC2137a) objM8596M8, c3966o, 3072);
            } else {
                c3966o.m8607Y(70843572);
            }
            c3966o.m8623p(z6);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1513i(notContactedValue, onValueChange, i10, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0183  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12664g(java.lang.Object r36, java.lang.String r37, or.AbstractC5453p r38, ex.InterfaceC2139c r39, ex.InterfaceC2137a r40, k2.InterfaceC3962k r41, int r42) {
        /*
            Method dump skipped, instructions count: 1419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.AbstractC6601a.m12664g(java.lang.Object, java.lang.String, or.p, ex.c, ex.a, k2.k, int):void");
    }

    /* renamed from: h */
    public static final void m12665h(C5445h filterOptions, InterfaceC2139c filterEvent, InterfaceC2137a closeBottomSheet, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(filterOptions, "filterOptions");
        AbstractC4154l.m8923f(filterEvent, "filterEvent");
        AbstractC4154l.m8923f(closeBottomSheet, "closeBottomSheet");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-271441396);
        int i11 = (c3966o.m8616i(filterOptions) ? 4 : 2) | i10 | (c3966o.m8616i(filterEvent) ? 32 : 16) | (c3966o.m8616i(closeBottomSheet) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            boolean z6 = (i11 & 896) == 256;
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                objM8596M = new C5998a(7, closeBottomSheet);
                c3966o.j0(objM8596M);
            }
            g2.m13162n(0L, null, null, (InterfaceC2137a) objM8596M, AbstractC6740i.m12902d(188289911, new C0770o(10, filterOptions, filterEvent, closeBottomSheet), c3966o), c3966o, 24576, 7);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f0(filterOptions, filterEvent, closeBottomSheet, i10, 6);
        }
    }

    /* renamed from: i */
    public static final void m12666i(List list, String str, String str2, InterfaceC2139c interfaceC2139c, InterfaceC2141e interfaceC2141e, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        String str3;
        InterfaceC2139c interfaceC2139c2;
        InterfaceC2141e interfaceC2141e2;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-95841217);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8616i(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o2.m8614g(str) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            str3 = str2;
            i11 |= c3966o2.m8614g(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i10 & 3072) == 0) {
            interfaceC2139c2 = interfaceC2139c;
            i11 |= c3966o2.m8616i(interfaceC2139c2) ? NewHope.SENDB_BYTES : 1024;
        } else {
            interfaceC2139c2 = interfaceC2139c;
        }
        if ((i10 & 24576) == 0) {
            interfaceC2141e2 = interfaceC2141e;
            i11 |= c3966o2.m8616i(interfaceC2141e2) ? 16384 : 8192;
        } else {
            interfaceC2141e2 = interfaceC2141e;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o2.m8616i(interfaceC2137a) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o2.m8616i(interfaceC2137a2) ? 1048576 : 524288;
        }
        if (c3966o2.m8598P(i11 & 1, (599187 & i11) != 599186)) {
            c3966o = c3966o2;
            u9.m6323a(null, AbstractC6740i.m12902d(603501051, new C6608h(str, interfaceC2137a2, interfaceC2137a), c3966o2), null, null, null, 0, 0L, 0L, null, AbstractC6740i.m12902d(1833565200, new p0(list, str3, str, interfaceC2139c2, interfaceC2141e2), c3966o2), c3966o, 805306416, 509);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6609i(list, str, str2, interfaceC2139c, interfaceC2141e, interfaceC2137a, interfaceC2137a2, i10);
        }
    }
}
