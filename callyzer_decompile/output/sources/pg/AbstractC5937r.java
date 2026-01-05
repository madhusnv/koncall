package pg;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.format.Formatter;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.C0243b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0403f;
import aq.C0405h;
import au.C0439c;
import au.C0440d;
import bm.C0696g;
import bt.C0760e;
import bt.C0767l;
import c9.AbstractC0911f;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import cv.C1510f;
import cv.C1522r;
import d3.C1552f;
import d3.C1565s;
import d7.InterfaceC1637j;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import fw.C2392f;
import g2.vd;
import g2.xd;
import g7.C2536a;
import gt.C2729a;
import h7.AbstractC2868a;
import hq.C3008m;
import hq.C3009n;
import ht.C3027b;
import ht.C3028c;
import ht.C3029d;
import ht.C3030e;
import i3.AbstractC3166c;
import i3.C3164a;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import jt.C3856e;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5248g;
import o1.C5261t;
import og.af;
import og.hg;
import og.je;
import og.nc;
import og.od;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p005f.C2162k;
import p008i.C3065b;
import p1.AbstractC5788a;
import qw.C6363m;
import s2.AbstractC6740i;
import t3.C7022i;
import tx.InterfaceC7266z;
import u2.C7320q;
import uw.C7565i;
import uw.InterfaceC7559c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.r */
/* loaded from: classes.dex */
public abstract class AbstractC5937r {

    /* renamed from: a */
    public static final /* synthetic */ int f29041a = 0;

    /* renamed from: a */
    public static final void m11837a(InterfaceC2137a navBackAction, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o;
        C2729a c2729a;
        boolean z6;
        g2.ta taVar;
        AbstractC4154l.m8923f(navBackAction, "navBackAction");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-637580177);
        int i11 = (c3966o2.m8616i(navBackAction) ? 4 : 2) | i10;
        if (c3966o2.m8598P(i11 & 1, (i11 & 3) != 2)) {
            c3966o2.m8608Z(1890788296);
            d7.c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o2);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C2392f c2392fM11854a = r9.m11854a(c1VarM6992a, c3966o2);
            c3966o2.m8608Z(1729797275);
            d7.w0 w0VarM11692c = AbstractC5928i.m11692c(C3856e.class, c1VarM6992a, c2392fM11854a, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b, c3966o2);
            c3966o2.m8623p(false);
            c3966o2.m8623p(false);
            C3856e c3856e = (C3856e) w0VarM11692c;
            Context context = (Context) c3966o2.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            C2729a c2729a2 = (C2729a) C3953b.m8509l(c3856e.f19854j, c3966o2).getValue();
            String[] stringArray = og.s0.m10885b(c3966o2).getStringArray(R.array.contact_us_type_selection_options);
            Object objM8596M = c3966o2.m8596M();
            Object obj = C3961j.f20408a;
            if (objM8596M == obj) {
                objM8596M = C3953b.m8517t(Boolean.FALSE);
                c3966o2.j0(objM8596M);
            }
            k2.w0 w0Var = (k2.w0) objM8596M;
            C7320q c7320q = c3856e.f19855k;
            Object[] objArr = new Object[0];
            Object objM8596M2 = c3966o2.m8596M();
            if (objM8596M2 == obj) {
                objM8596M2 = new C3008m(6);
                c3966o2.j0(objM8596M2);
            }
            k2.w0 w0Var2 = (k2.w0) hg.m10691b(objArr, null, (InterfaceC2137a) objM8596M2, c3966o2, 0, 6);
            Object objM8596M3 = c3966o2.m8596M();
            if (objM8596M3 == obj) {
                objM8596M3 = new g2.ta();
                c3966o2.j0(objM8596M3);
            }
            g2.ta taVar2 = (g2.ta) objM8596M3;
            Object objM8596M4 = c3966o2.m8596M();
            if (objM8596M4 == obj) {
                objM8596M4 = C3953b.m8510m(C7565i.f36440a, c3966o2);
                c3966o2.j0(objM8596M4);
            }
            InterfaceC7266z interfaceC7266z = (InterfaceC7266z) objM8596M4;
            Object objM8596M5 = c3966o2.m8596M();
            if (objM8596M5 == obj) {
                objM8596M5 = C3953b.m8517t(Boolean.FALSE);
                c3966o2.j0(objM8596M5);
            }
            k2.w0 w0Var3 = (k2.w0) objM8596M5;
            Object objM10920c = og.t0.m10920c(c3966o2, R.string.listening);
            androidx.fragment.app.d1 d1Var = new androidx.fragment.app.d1(6);
            boolean zM8616i = c3966o2.m8616i(c3856e) | c3966o2.m8616i(context);
            Object objM8596M6 = c3966o2.m8596M();
            if (zM8616i || objM8596M6 == obj) {
                objM8596M6 = new C3029d(c3856e, context, 0);
                c3966o2.j0(objM8596M6);
            }
            C2162k c2162kM10719c = je.m10719c(d1Var, (InterfaceC2139c) objM8596M6, c3966o2, 0);
            C3065b c3065b = new C3065b();
            boolean zM8616i2 = c3966o2.m8616i(c3856e) | c3966o2.m8616i(context);
            Object objM8596M7 = c3966o2.m8596M();
            if (zM8616i2 || objM8596M7 == obj) {
                c2729a = c2729a2;
                objM8596M7 = new C3029d(c3856e, context, 1);
                c3966o2.j0(objM8596M7);
            } else {
                c2729a = c2729a2;
            }
            C2162k c2162kM10719c2 = je.m10719c(c3065b, (InterfaceC2139c) objM8596M7, c3966o2, 0);
            androidx.fragment.app.d1 d1Var2 = new androidx.fragment.app.d1(5);
            boolean zM8616i3 = c3966o2.m8616i(c2162kM10719c) | c3966o2.m8614g(w0Var2);
            Object objM8596M8 = c3966o2.m8596M();
            if (zM8616i3 || objM8596M8 == obj) {
                objM8596M8 = new C3009n(1, c2162kM10719c, w0Var2);
                c3966o2.j0(objM8596M8);
            }
            C2162k c2162kM10719c3 = je.m10719c(d1Var2, (InterfaceC2139c) objM8596M8, c3966o2, 0);
            if (((Boolean) w0Var2.getValue()).booleanValue()) {
                c3966o2.m8607Y(-1803585715);
                boolean zM8614g = c3966o2.m8614g(w0Var2);
                Object objM8596M9 = c3966o2.m8596M();
                if (zM8614g || objM8596M9 == obj) {
                    objM8596M9 = new C0696g(w0Var2, 19);
                    c3966o2.j0(objM8596M9);
                }
                z6 = false;
                m11843g((InterfaceC2137a) objM8596M9, c3966o2, 0);
            } else {
                z6 = false;
                c3966o2.m8607Y(-1810758061);
            }
            c3966o2.m8623p(z6);
            if (((Boolean) w0Var3.getValue()).booleanValue()) {
                c3966o2.m8607Y(-1803426003);
                boolean zM8616i4 = c3966o2.m8616i(interfaceC7266z) | c3966o2.m8614g(objM10920c);
                Object objM8596M10 = c3966o2.m8596M();
                if (zM8616i4 || objM8596M10 == obj) {
                    objM8596M10 = new C0405h(interfaceC7266z, (Object) taVar2, objM10920c, (InterfaceC7559c) null, 7);
                    taVar = taVar2;
                    c3966o2.j0(objM8596M10);
                } else {
                    taVar = taVar2;
                }
                C3953b.m8503f((InterfaceC2141e) objM8596M10, context, c3966o2);
                c3966o2.m8623p(false);
            } else {
                taVar = taVar2;
                c3966o2.m8607Y(-1803157078);
                c3966o2.m8623p(false);
                g2.qa qaVar = (g2.qa) taVar.f12800b.getValue();
                if (qaVar != null) {
                    qaVar.m6292a();
                }
            }
            c3966o = c3966o2;
            g2.u9.m6323a(null, AbstractC6740i.m12902d(-1071673301, new C0439c(5, navBackAction), c3966o2), null, AbstractC6740i.m12902d(1900115049, new C1522r(taVar, 1), c3966o2), null, 0, 0L, 0L, null, AbstractC6740i.m12902d(1290832576, new C3030e(c2729a, c3856e, c7320q, c2162kM10719c2, context, c2162kM10719c, c2162kM10719c3, navBackAction, w0Var, stringArray, w0Var2, w0Var3), c3966o2), c3966o, 805309488, 501);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0439c(i10, 6, navBackAction);
        }
    }

    /* renamed from: b */
    public static final Intent m11838b() {
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        return intent;
    }

    /* renamed from: c */
    public static final void m11839c(String text, Integer num, boolean z6, InterfaceC3962k interfaceC3962k, int i10) {
        C7876o c7876o;
        boolean z10;
        long j6;
        AbstractC4154l.m8923f(text, "text");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1329849687);
        int i11 = i10 | (c3966o.m8614g(text) ? 4 : 2) | (c3966o.m8614g(num) ? 32 : 16) | (c3966o.m8615h(z6) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            C7876o c7876o2 = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o2, 1.0f), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 10, 7);
            o1.n1 n1VarM10357a = o1.m1.m10357a(AbstractC5251j.f25761e, C7864c.f37652l, c3966o, 54);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C7636h c7636h = C7638j.f36925f;
            C3953b.m8521x(c7636h, n1VarM10357a, c3966o);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o);
            if (1.0f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(new LayoutWeightElement(1.0f, true), 1.0f);
            o1.n1 n1VarM10357a2 = o1.m1.m10357a(AbstractC5251j.f25757a, C7864c.f37651k, c3966o, 0);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM668e);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, n1VarM10357a2, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
            if (num == null) {
                c3966o.m8607Y(722430318);
                c3966o.m8623p(false);
                c7876o = c7876o2;
            } else {
                c3966o.m8607Y(722430319);
                int iIntValue = num.intValue();
                AbstractC3166c abstractC3166cM11551a = b9.m11551a(R.drawable.ic_warning, 0, c3966o);
                InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o2, 15);
                k2.i2 i2Var = g2.y1.f13286a;
                g2.e6.m6132a(abstractC3166cM11551a, "", interfaceC7879rM678o, ((g2.v1) c3966o.m8618k(i2Var)).f12976w, c3966o, 432, 0);
                c7876o = c7876o2;
                sq.b1.m13113q(og.t0.m10920c(c3966o, iIntValue), AbstractC0242a.m660n(c7876o, 2, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), ((g2.v1) c3966o.m8618k(i2Var)).f12976w, null, null, 0, 0, 0L, null, ((vd) c3966o.m8618k(xd.f13268a)).f13056l, c3966o, 48, 504);
                c3966o = c3966o;
                c3966o.m8623p(false);
            }
            c3966o.m8623p(true);
            InterfaceC7879r interfaceC7879rM660n2 = AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, 2, DefinitionKt.NO_Float_VALUE, 5, 5);
            long jM10534c = af.m10534c(14);
            k2.i2 i2Var2 = g2.y1.f13286a;
            g4.o0 o0Var = new g4.o0(((g2.v1) c3966o.m8618k(i2Var2)).f12976w, jM10534c, null, null, null, 0L, 0, 0L, 16777212);
            if (z6) {
                c3966o.m8607Y(1743175836);
                j6 = ((g2.v1) c3966o.m8618k(i2Var2)).f12970q;
                z10 = false;
            } else {
                z10 = false;
                c3966o.m8607Y(1743177144);
                j6 = ((g2.v1) c3966o.m8618k(i2Var2)).f12976w;
            }
            c3966o.m8623p(z10);
            sq.b1.m13113q(text, interfaceC7879rM660n2, j6, null, null, 0, 0, 0L, null, o0Var, c3966o, (i11 & 14) | 48, 504);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C3028c(text, num, z6, i10, 0);
        }
    }

    /* renamed from: d */
    public static final void m11840d(Uri uri, InterfaceC2139c onRemove, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o;
        Object objM10796a;
        boolean z6;
        Object objM11905a;
        AbstractC4154l.m8923f(uri, "uri");
        AbstractC4154l.m8923f(onRemove, "onRemove");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(830691790);
        int i11 = i10 | (c3966o2.m8616i(uri) ? 4 : 2) | (c3966o2.m8616i(onRemove) ? 32 : 16);
        if (c3966o2.m8598P(i11 & 1, (i11 & 19) != 18)) {
            Context context = (Context) c3966o2.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            boolean zM8614g = c3966o2.m8614g(uri);
            Object objM8596M = c3966o2.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (zM8614g || objM8596M == s0Var) {
                String type = context.getContentResolver().getType(uri);
                if (type == null) {
                    type = "";
                }
                objM8596M = type;
                c3966o2.j0(objM8596M);
            }
            String str = (String) objM8596M;
            boolean zM8614g2 = c3966o2.m8614g(uri);
            Object objM8596M2 = c3966o2.m8596M();
            if (zM8614g2 || objM8596M2 == s0Var) {
                try {
                    objM10796a = AbstractC5185w.m10138t(str, "image", false) ? m11844h(context, uri) : null;
                } catch (Throwable th2) {
                    objM10796a = od.m10796a(th2);
                }
                objM8596M2 = (Bitmap) (objM10796a instanceof C6363m ? null : objM10796a);
                c3966o2.j0(objM8596M2);
            }
            Bitmap bitmap = (Bitmap) objM8596M2;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o, 96);
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i12 = c3966o2.f20462P;
            k2.i1 i1VarM8620m = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM678o);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(c7637i);
            } else {
                c3966o2.m0();
            }
            C7636h c7636h = C7638j.f36925f;
            C3953b.m8521x(c7636h, j0VarM10361d, c3966o2);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o2);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o2, i12, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o2);
            C0243b c0243b = C0243b.f1966a;
            if (bitmap != null) {
                c3966o2.m8607Y(-308076902);
                C1552f c1552f = new C1552f(bitmap);
                InterfaceC7879r interfaceC7879rM678o2 = AbstractC0245d.m678o(c7876o, 80);
                C7871j c7871j = C7864c.f37646e;
                float f6 = 8;
                InterfaceC7879r interfaceC7879rM2617a = AbstractC0911f.m2617a(c0243b.m663b(c0243b.mo662a(interfaceC7879rM678o2, c7871j)), AbstractC7861e.m14841b(f6));
                boolean zM8614g3 = c3966o2.m8614g(c1552f);
                Object objM8596M3 = c3966o2.m8596M();
                if (zM8614g3 || objM8596M3 == s0Var) {
                    z6 = true;
                    objM11905a = w5.m11905a(c1552f, 1);
                    c3966o2.j0(objM11905a);
                } else {
                    objM11905a = objM8596M3;
                    z6 = true;
                }
                i0.m11693a((C3164a) objM11905a, null, interfaceC7879rM2617a, c7871j, C7022i.f34005a, 1.0f, null, c3966o2, 24624, 0);
                InterfaceC7879r interfaceC7879rM678o3 = AbstractC0245d.m678o(AbstractC0242a.m654h(c0243b.mo662a(c7876o, C7864c.f37644c), f6, -8), 40);
                boolean zM8616i = c3966o2.m8616i(uri) | ((i11 & 112) == 32);
                Object objM8596M4 = c3966o2.m8596M();
                if (zM8616i || objM8596M4 == s0Var) {
                    objM8596M4 = new bt.i0(15, onRemove, uri);
                    c3966o2.j0(objM8596M4);
                }
                InterfaceC7879r interfaceC7879rM637e = AbstractC0237a.m637e(interfaceC7879rM678o3, false, null, null, (InterfaceC2137a) objM8596M4, 7);
                t3.j0 j0VarM10361d2 = AbstractC5256o.m10361d(c7871j, false);
                int i13 = c3966o2.f20462P;
                k2.i1 i1VarM8620m2 = c3966o2.m8620m();
                InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM637e);
                c3966o2.c0();
                if (c3966o2.f20461O) {
                    c3966o2.m8619l(c7637i);
                } else {
                    c3966o2.m0();
                }
                C3953b.m8521x(c7636h, j0VarM10361d2, c3966o2);
                C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o2);
                if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i13))) {
                    AbstractC1452a.m4577x(i13, c3966o2, i13, c7636h3);
                }
                C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o2);
                g2.e6.m6132a(og.r0.m10866b(R.drawable.ic_round_remove, 0, c3966o2), "Remove Image", AbstractC0245d.m678o(c7876o, 26), C1565s.f7817j, c3966o2, 3504, 0);
                c3966o = c3966o2;
                c3966o.m8623p(true);
                c3966o.m8623p(false);
            } else {
                c3966o = c3966o2;
                c3966o.m8607Y(-307122412);
                AbstractC5256o.m10358a(AbstractC0911f.m2617a(AbstractC0237a.m633a(c0243b.m663b(c7876o), C1565s.f7811d, d3.h0.f7748a), AbstractC7861e.m14841b(8)), c3966o, 0);
                c3966o.m8623p(false);
            }
            c3966o.m8623p(true);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0403f(uri, onRemove, i10, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* renamed from: e */
    public static final void m11841e(C2729a contactUsFormState, List mediaList, InterfaceC7879r interfaceC7879r, InterfaceC2137a interfaceC2137a, InterfaceC2139c onRemove, InterfaceC3962k interfaceC3962k, int i10) {
        C2729a c2729a;
        InterfaceC7879r interfaceC7879r2;
        C3966o c3966o;
        long jM5186b;
        Context context;
        C7876o c7876o;
        k2.s0 s0Var;
        int i11;
        boolean z6;
        ?? r22;
        C3966o c3966o2;
        C3966o c3966o3;
        AbstractC4154l.m8923f(contactUsFormState, "contactUsFormState");
        boolean z10 = contactUsFormState.f15243o;
        AbstractC4154l.m8923f(mediaList, "mediaList");
        AbstractC4154l.m8923f(onRemove, "onRemove");
        C3966o c3966o4 = (C3966o) interfaceC3962k;
        c3966o4.a0(-731956668);
        int i12 = i10 | (c3966o4.m8616i(contactUsFormState) ? 4 : 2) | (c3966o4.m8616i(mediaList) ? 32 : 16) | KyberEngine.KyberPolyBytes | (c3966o4.m8616i(interfaceC2137a) ? NewHope.SENDB_BYTES : 1024) | (c3966o4.m8616i(onRemove) ? 16384 : 8192);
        if (c3966o4.m8598P(i12 & 1, (i12 & 9363) != 9362)) {
            k2.i2 i2Var = g2.y1.f13286a;
            long j6 = ((g2.v1) c3966o4.m8618k(i2Var)).f12971r;
            if (!z10) {
                c3966o4.m8607Y(964290281);
                jM5186b = ((g2.v1) c3966o4.m8618k(i2Var)).f12976w;
                c3966o4.m8623p(false);
            } else if (mediaList.isEmpty()) {
                c3966o4.m8607Y(964294326);
                jM5186b = C1565s.m5186b(0.2f, 14, ((g2.v1) c3966o4.m8618k(i2Var)).f12970q);
                c3966o4.m8623p(false);
            } else {
                c3966o4.m8607Y(964292395);
                jM5186b = ((g2.v1) c3966o4.m8618k(i2Var)).f12954a;
                c3966o4.m8623p(false);
            }
            Context context2 = (Context) c3966o4.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o4, 0);
            int i13 = c3966o4.f20462P;
            k2.i1 i1VarM8620m = c3966o4.m8620m();
            C7876o c7876o2 = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o4, c7876o2);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o4.c0();
            if (c3966o4.f20461O) {
                c3966o4.m8619l(c7637i);
            } else {
                c3966o4.m0();
            }
            C7636h c7636h = C7638j.f36925f;
            C3953b.m8521x(c7636h, c5261tM10367a, c3966o4);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o4);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o4, i13, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o4);
            float f6 = 12;
            InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(c0.m11560a(AbstractC0245d.m668e(c7876o2, 1.0f), (float) 1.5d, jM5186b, AbstractC7861e.m14841b(f6)), j6, AbstractC7861e.m14841b(f6));
            boolean z11 = (i12 & 7168) == 2048;
            Object objM8596M = c3966o4.m8596M();
            k2.s0 s0Var2 = C3961j.f20408a;
            if (z11 || objM8596M == s0Var2) {
                objM8596M = new C0440d(16, interfaceC2137a);
                c3966o4.j0(objM8596M);
            }
            InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(AbstractC0237a.m637e(interfaceC7879rM633a, false, null, null, (InterfaceC2137a) objM8596M, 7), 16);
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i14 = c3966o4.f20462P;
            k2.i1 i1VarM8620m2 = c3966o4.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o4, interfaceC7879rM656j);
            c3966o4.c0();
            if (c3966o4.f20461O) {
                c3966o4.m8619l(c7637i);
            } else {
                c3966o4.m0();
            }
            C3953b.m8521x(c7636h, j0VarM10361d, c3966o4);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o4);
            if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i14))) {
                AbstractC1452a.m4577x(i14, c3966o4, i14, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o4);
            if (mediaList.isEmpty()) {
                c3966o4.m8607Y(1863155979);
                C7870i c7870i = C7864c.f37652l;
                InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o2, 1.0f);
                o1.n1 n1VarM10357a = o1.m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o4, 48);
                int i15 = c3966o4.f20462P;
                k2.i1 i1VarM8620m3 = c3966o4.m8620m();
                InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o4, interfaceC7879rM668e);
                c3966o4.c0();
                if (c3966o4.f20461O) {
                    c3966o4.m8619l(c7637i);
                } else {
                    c3966o4.m0();
                }
                C3953b.m8521x(c7636h, n1VarM10357a, c3966o4);
                C3953b.m8521x(c7636h2, i1VarM8620m3, c3966o4);
                if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i15))) {
                    AbstractC1452a.m4577x(i15, c3966o4, i15, c7636h3);
                }
                C3953b.m8521x(c7636h4, interfaceC7879rM14845c3, c3966o4);
                AbstractC3166c abstractC3166cM10866b = og.r0.m10866b(R.drawable.ic_add_image, 0, c3966o4);
                long j10 = C1565s.f7810c;
                c7876o = c7876o2;
                r22 = 0;
                context = context2;
                g2.e6.m6132a(abstractC3166cM10866b, null, AbstractC0245d.m678o(c7876o2, 24), j10, c3966o4, 3504, 0);
                AbstractC5244c.m10322f(c3966o4, AbstractC0245d.m682s(c7876o, 8));
                s0Var = s0Var2;
                z6 = true;
                sq.b1.m13113q("Add Images", null, j10, null, null, 0, 0, 0L, null, ((vd) c3966o4.m8618k(xd.f13268a)).f13059o, c3966o4, 390, 506);
                C3966o c3966o5 = c3966o4;
                c3966o5.m8623p(true);
                c3966o5.m8623p(false);
                i11 = 1842861178;
                c3966o2 = c3966o5;
            } else {
                context = context2;
                c7876o = c7876o2;
                s0Var = s0Var2;
                i11 = 1842861178;
                z6 = true;
                r22 = 0;
                c3966o4.m8607Y(1842861178);
                c3966o4.m8623p(false);
                c3966o2 = c3966o4;
            }
            if (mediaList.isEmpty()) {
                c3966o2.m8607Y(i11);
                c3966o3 = c3966o2;
            } else {
                c3966o2.m8607Y(1863914611);
                C5248g c5248gM10351g = AbstractC5251j.m10351g(8);
                boolean zM8616i = c3966o2.m8616i(mediaList) | ((i12 & 57344) == 16384 ? z6 : r22);
                Object objM8596M2 = c3966o2.m8596M();
                if (zM8616i || objM8596M2 == s0Var) {
                    objM8596M2 = new C3027b(0, onRemove, mediaList);
                    c3966o2.j0(objM8596M2);
                }
                C3966o c3966o6 = c3966o2;
                nc.m10777d(null, null, null, c5248gM10351g, null, null, false, null, (InterfaceC2139c) objM8596M2, c3966o6, 24576, 495);
                c3966o3 = c3966o6;
            }
            c3966o3.m8623p(r22);
            c3966o3.m8623p(z6);
            int size = mediaList.size();
            c2729a = contactUsFormState;
            Long l9 = c2729a.f15244p;
            m11839c("(" + size + "/5, " + Formatter.formatShortFileSize(context, l9 != null ? l9.longValue() : 0L) + " / 10MB)", c2729a.f15242n, z10, c3966o3, r22);
            c3966o3.m8623p(z6);
            interfaceC7879r2 = c7876o;
            c3966o = c3966o3;
        } else {
            c2729a = contactUsFormState;
            c3966o4.m8601S();
            interfaceC7879r2 = interfaceC7879r;
            c3966o = c3966o4;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0760e((Object) c2729a, (Object) mediaList, (Object) interfaceC7879r2, interfaceC2137a, onRemove, i10, 1);
        }
    }

    /* renamed from: f */
    public static final void m11842f(InterfaceC2137a interfaceC2137a, C2729a c2729a, InterfaceC2137a interfaceC2137a2, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(300033432);
        int i11 = i10 | (c3966o.m8616i(interfaceC2137a) ? 4 : 2) | (c3966o.m8616i(c2729a) ? 32 : 16) | (c3966o.m8616i(interfaceC2137a2) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            Integer num = c2729a.f15246r;
            Integer num2 = c2729a.f15245q;
            if (num != null) {
                c3966o.m8607Y(469209011);
                String strM10920c = og.t0.m10920c(c3966o, c2729a.f15246r.intValue());
                boolean z6 = ((i11 & 14) == 4) | ((i11 & 896) == 256);
                Object objM8596M = c3966o.m8596M();
                if (z6 || objM8596M == C3961j.f20408a) {
                    objM8596M = new bt.i0(14, interfaceC2137a, interfaceC2137a2);
                    c3966o.j0(objM8596M);
                }
                sq.g2.m13136N(0, 0, (InterfaceC2137a) objM8596M, strM10920c, c3966o);
                c3966o.m8623p(false);
            } else {
                if (num2 != null) {
                    c3966o.m8607Y(469450625);
                    sq.g2.m13128F(og.t0.m10920c(c3966o, num2.intValue()), 0, false, false, null, interfaceC2137a2, c3966o, (i11 << 9) & 458752, 30);
                } else {
                    c3966o.m8607Y(451981226);
                }
                c3966o.m8623p(false);
            }
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0767l(interfaceC2137a, c2729a, interfaceC2137a2, i10, 11);
        }
    }

    /* renamed from: g */
    public static final void m11843g(InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC2137a interfaceC2137a2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(248838713);
        int i11 = (c3966o.m8616i(interfaceC2137a) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            String strM11629c = f9.m11629c(c3966o, R.string.permission_denied);
            String strM11629c2 = f9.m11629c(c3966o, R.string.permission_allowed_dialog_description);
            String strM11629c3 = f9.m11629c(c3966o, R.string.go_to_settings);
            boolean zM8616i = c3966o.m8616i(context) | ((i11 & 14) == 4);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C1510f(context, interfaceC2137a, 1);
                c3966o.j0(objM8596M);
            }
            interfaceC2137a2 = interfaceC2137a;
            sq.g2.m13150b(strM11629c, interfaceC2137a2, strM11629c2, strM11629c3, (InterfaceC2137a) objM8596M, f9.m11629c(c3966o, R.string.cancel), interfaceC2137a, c3966o, ((i11 << 3) & 112) | ((i11 << 18) & 3670016));
        } else {
            interfaceC2137a2 = interfaceC2137a;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0439c(i10, 4, interfaceC2137a2);
        }
    }

    /* renamed from: h */
    public static final Bitmap m11844h(Context context, Uri uri) throws IOException {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(uri, "uri");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i10 = 1;
            options.inJustDecodeBounds = true;
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    inputStreamOpenInputStream.close();
                } finally {
                }
            }
            Integer numValueOf = Integer.valueOf(options.outWidth);
            Integer numValueOf2 = Integer.valueOf(options.outHeight);
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            while (true) {
                if (iIntValue / i10 <= 512 && iIntValue2 / i10 <= 512) {
                    break;
                }
                i10 *= 2;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i10;
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options2);
                inputStreamOpenInputStream.close();
                return bitmapDecodeStream;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
