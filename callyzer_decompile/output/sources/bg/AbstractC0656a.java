package bg;

import a9.C0065d;
import al.C0174b;
import an.l2;
import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraCaptureSession;
import android.media.Image;
import android.os.Build;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.widget.TextView;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.d1;
import aq.C0403f;
import au.C0440d;
import bg.AbstractC0656a;
import bp.C0720d;
import bt.C0767l;
import bt.C0770o;
import bt.C0780y;
import com.google.mlkit.common.MlKitException;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import cv.C1506b;
import cv.C1516l;
import cv.C1524t;
import d3.C1565s;
import d3.h0;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import g2.g6;
import g2.p9;
import g2.t6;
import g2.v1;
import g2.y1;
import g4.o0;
import gc.C2557a;
import hl.C2964a;
import hq.C3009n;
import i3.AbstractC3166c;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.WeakHashMap;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.b1;
import k2.f0;
import k2.n1;
import k2.s0;
import k2.w0;
import k4.C3994o;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4167y;
import ls.C4512c;
import nt.C5138b;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5243b;
import o1.C5245d;
import o1.C5261t;
import o1.InterfaceC5262u;
import o1.i1;
import o1.m1;
import o1.p1;
import o1.w1;
import og.af;
import og.je;
import og.nc;
import og.r0;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import ot.C5738f;
import p005f.C2162k;
import p020v.a1;
import pg.b9;
import pg.i0;
import pt.C6032f;
import q1.C6097y;
import q1.b0;
import q5.C6118k;
import qw.C6360j;
import qw.a0;
import s2.AbstractC6740i;
import sf.AbstractC6840z;
import t3.j0;
import uv.AbstractC7554g;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7869h;
import w2.C7870i;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7879r;
import w3.C7892j;
import x2.C8277a;
import x2.C8287k;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bg.a */
/* loaded from: classes.dex */
public abstract class AbstractC0656a {

    /* renamed from: a */
    public static Context f4198a;

    /* renamed from: b */
    public static Boolean f4199b;

    /* renamed from: A */
    public static void m1885A(MenuItem menuItem, char c2, int i10) {
        menuItem.setNumericShortcut(c2, i10);
    }

    /* renamed from: B */
    public static void m1886B(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    /* renamed from: C */
    public static void m1887C(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    /* renamed from: D */
    public static void m1888D(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    /* renamed from: E */
    public static void m1889E(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    /* renamed from: F */
    public static void m1890F(Context context) {
        Object systemService = context.getSystemService("notification");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel("callyze_biz_notification_chanel", "Callyze Biz", 4));
        }
        C6118k c6118k = new C6118k(context, "callyze_biz_notification_chanel");
        c6118k.m12152c(2, true);
        c6118k.m12152c(16, false);
        c6118k.f29852w.icon = R.drawable.stat_notify_sync;
        c6118k.f29834e = C6118k.m12150b("Synchronizing your contacts");
        c6118k.f29849t = -1;
        notificationManager.notify(0, c6118k.m12151a());
    }

    /* renamed from: G */
    public static final void m1891G(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i14 = i10 / (i11 / rowStride);
        int rowStride2 = 0;
        for (int i15 = 0; i15 < rowStride; i15++) {
            int pixelStride = rowStride2;
            for (int i16 = 0; i16 < i14; i16++) {
                bArr[i12] = buffer.get(pixelStride);
                i12 += i13;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    /* renamed from: a */
    public static C0720d m1892a(Context context, C6032f c6032f, f0 DisposableEffect) {
        AbstractC4154l.m8923f(DisposableEffect, "$this$DisposableEffect");
        C0065d c0065d = new C0065d(1, c6032f);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(c0065d, intentFilter, 2);
        } else {
            context.registerReceiver(c0065d, intentFilter);
        }
        return new C0720d(11, context, c0065d);
    }

    /* renamed from: b */
    public static final void m1893b(String attachMentCount, InterfaceC2137a onClick, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(attachMentCount, "attachMentCount");
        AbstractC4154l.m8923f(onClick, "onClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1901552870);
        int i11 = (c3966o.m8614g(attachMentCount) ? 4 : 2) | i10 | (c3966o.m8616i(onClick) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            long j6 = ((v1) c3966o.m8618k(y1.f13286a)).f12969p;
            C7876o c7876o = C7876o.f37669a;
            C0174b c0174b = h0.f7748a;
            p9.m6240d(AbstractC0237a.m633a(c7876o, j6, c0174b), c0174b, null, null, null, AbstractC6740i.m12902d(248012428, new C4512c(2, onClick, attachMentCount), c3966o), c3966o, 196656, 28);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1506b(i10, 2, onClick, attachMentCount);
        }
    }

    /* renamed from: c */
    public static final void m1894c(InterfaceC2139c onPermissionResult, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC2139c interfaceC2139c;
        AbstractC4154l.m8923f(onPermissionResult, "onPermissionResult");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1278282195);
        if (c3966o.m8598P(i10 & 1, (i10 & 3) != 2)) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            d1 d1Var = new d1(5);
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = new C1516l(4, onPermissionResult);
                c3966o.j0(objM8596M);
            }
            C2162k c2162kM10719c = je.m10719c(d1Var, (InterfaceC2139c) objM8596M, c3966o, 0);
            boolean zM8616i = c3966o.m8616i(context) | c3966o.m8616i(c2162kM10719c);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8616i || objM8596M2 == s0Var) {
                interfaceC2139c = onPermissionResult;
                C5738f c5738f = new C5738f(context, interfaceC2139c, c2162kM10719c, null, 0);
                c3966o.j0(c5738f);
                objM8596M2 = c5738f;
            } else {
                interfaceC2139c = onPermissionResult;
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M2, a0.f30746a, c3966o);
        } else {
            interfaceC2139c = onPermissionResult;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2557a(i10, 1, interfaceC2139c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02bc  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1895d(l7.a0 r36, java.lang.String r37, k2.InterfaceC3962k r38, int r39) {
        /*
            Method dump skipped, instructions count: 1665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.AbstractC0656a.m1895d(l7.a0, java.lang.String, k2.k, int):void");
    }

    /* renamed from: e */
    public static final void m1896e(final List list, final boolean z6, final boolean z10, final InterfaceC2139c onChecked, final InterfaceC2139c onCopy, final InterfaceC2139c clickOnWhatsapp, final InterfaceC2139c onExpend, InterfaceC3962k interfaceC3962k, final int i10) {
        C3966o c3966o;
        Object c0780y;
        w0 w0Var;
        int i11;
        C6097y c6097y;
        float fMo10341a;
        List messageSubTemplateList = list;
        AbstractC4154l.m8923f(messageSubTemplateList, "messageSubTemplateList");
        AbstractC4154l.m8923f(onChecked, "onChecked");
        AbstractC4154l.m8923f(onCopy, "onCopy");
        AbstractC4154l.m8923f(clickOnWhatsapp, "clickOnWhatsapp");
        AbstractC4154l.m8923f(onExpend, "onExpend");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(13474775);
        int i12 = i10 | (c3966o2.m8616i(messageSubTemplateList) ? 4 : 2) | (c3966o2.m8615h(z6) ? 32 : 16) | (c3966o2.m8615h(z10) ? 256 : 128) | (c3966o2.m8616i(onChecked) ? NewHope.SENDB_BYTES : 1024) | (c3966o2.m8616i(onCopy) ? 16384 : 8192) | (c3966o2.m8616i(clickOnWhatsapp) ? 131072 : 65536) | (c3966o2.m8616i(onExpend) ? 1048576 : 524288);
        if (c3966o2.m8598P(i12 & 1, (599187 & i12) != 599186)) {
            C6097y c6097yM12082a = b0.m12082a(0, 3, c3966o2);
            Object objM8596M = c3966o2.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = C3953b.m8517t(Boolean.FALSE);
                c3966o2.j0(objM8596M);
            }
            w0 w0Var2 = (w0) objM8596M;
            boolean zM8614g = c3966o2.m8614g(c6097yM12082a) | c3966o2.m8616i(messageSubTemplateList);
            Object objM8596M2 = c3966o2.m8596M();
            if (zM8614g || objM8596M2 == s0Var) {
                w0Var = w0Var2;
                i11 = i12;
                c0780y = new C0780y(c6097yM12082a, messageSubTemplateList, w0Var, null, 1);
                c6097y = c6097yM12082a;
                messageSubTemplateList = messageSubTemplateList;
                c3966o2.j0(c0780y);
            } else {
                i11 = i12;
                c6097y = c6097yM12082a;
                c0780y = objM8596M2;
                w0Var = w0Var2;
            }
            C3953b.m8504g(c6097y, messageSubTemplateList, (InterfaceC2141e) c0780y, c3966o2);
            InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(C7876o.f37669a, ((v1) c3966o2.m8618k(y1.f13286a)).f12969p, h0.f7748a);
            if (((Boolean) w0Var.getValue()).booleanValue() && z6) {
                c3966o2.m8607Y(64394905);
                c3966o2.m8623p(false);
                fMo10341a = 150;
            } else {
                c3966o2.m8607Y(64397039);
                WeakHashMap weakHashMap = w1.f25863v;
                fMo10341a = AbstractC5244c.m10323h(C5243b.m10315e(c3966o2).f25868e, c3966o2).mo10341a();
                c3966o2.m8623p(false);
            }
            i1 i1VarM649c = AbstractC0242a.m649c(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, fMo10341a, 7);
            boolean zM8616i = c3966o2.m8616i(messageSubTemplateList) | ((i11 & 896) == 256) | ((i11 & 7168) == 2048) | ((57344 & i11) == 16384) | ((3670016 & i11) == 1048576) | ((458752 & i11) == 131072);
            Object objM8596M3 = c3966o2.m8596M();
            if (zM8616i || objM8596M3 == s0Var) {
                l2 l2Var = new l2(messageSubTemplateList, z10, onChecked, onCopy, onExpend, clickOnWhatsapp);
                c3966o2.j0(l2Var);
                objM8596M3 = l2Var;
            }
            c3966o = c3966o2;
            nc.m10775b(interfaceC7879rM633a, c6097y, i1VarM649c, null, null, null, false, null, (InterfaceC2139c) objM8596M3, c3966o, 0, 504);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new InterfaceC2141e(list, z6, z10, onChecked, onCopy, clickOnWhatsapp, onExpend, i10) { // from class: ot.d

                /* renamed from: a */
                public final /* synthetic */ List f28271a;

                /* renamed from: b */
                public final /* synthetic */ boolean f28272b;

                /* renamed from: c */
                public final /* synthetic */ boolean f28273c;

                /* renamed from: d */
                public final /* synthetic */ InterfaceC2139c f28274d;

                /* renamed from: e */
                public final /* synthetic */ InterfaceC2139c f28275e;

                /* renamed from: f */
                public final /* synthetic */ InterfaceC2139c f28276f;

                /* renamed from: g */
                public final /* synthetic */ InterfaceC2139c f28277g;

                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM8496A = C3953b.m8496A(1);
                    AbstractC0656a.m1896e(this.f28271a, this.f28272b, this.f28273c, this.f28274d, this.f28275e, this.f28276f, this.f28277g, (InterfaceC3962k) obj, iM8496A);
                    return a0.f30746a;
                }
            };
        }
    }

    /* renamed from: f */
    public static final void m1897f(final C5138b template, final boolean z6, final InterfaceC2137a onChecked, final InterfaceC2137a onCopy, final InterfaceC2137a onExpend, final InterfaceC2137a clickOnWhatsapp, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o;
        long jM5186b;
        AbstractC4154l.m8923f(template, "template");
        AbstractC4154l.m8923f(onChecked, "onChecked");
        AbstractC4154l.m8923f(onCopy, "onCopy");
        AbstractC4154l.m8923f(onExpend, "onExpend");
        AbstractC4154l.m8923f(clickOnWhatsapp, "clickOnWhatsapp");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-1976586883);
        int i11 = i10 | (c3966o2.m8616i(template) ? 4 : 2) | (c3966o2.m8615h(z6) ? 32 : 16) | (c3966o2.m8616i(onChecked) ? 256 : 128) | (c3966o2.m8616i(onCopy) ? NewHope.SENDB_BYTES : 1024) | (c3966o2.m8616i(onExpend) ? 16384 : 8192) | (c3966o2.m8616i(clickOnWhatsapp) ? 131072 : 65536);
        if (c3966o2.m8598P(i11 & 1, (74899 & i11) != 74898)) {
            Object objM8596M = c3966o2.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = new b1(0);
                c3966o2.j0(objM8596M);
            }
            final b1 b1Var = (b1) objM8596M;
            Object objM8596M2 = c3966o2.m8596M();
            if (objM8596M2 == s0Var) {
                objM8596M2 = C3953b.m8517t(Boolean.TRUE);
                c3966o2.j0(objM8596M2);
            }
            final w0 w0Var = (w0) objM8596M2;
            final C4167y c4167y = new C4167y();
            if (template.f25173e) {
                c3966o2.m8607Y(-1124437347);
                jM5186b = C1565s.m5186b(0.2f, 14, AbstractC7554g.m14301b(c3966o2).f36398j);
                c3966o2.m8623p(false);
            } else {
                c3966o2.m8607Y(-1124435324);
                jM5186b = ((v1) c3966o2.m8618k(y1.f13286a)).f12969p;
                c3966o2.m8623p(false);
            }
            c4167y.f21163a = jM5186b;
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(C7876o.f37669a, 1.0f);
            long j6 = ((v1) c3966o2.m8618k(y1.f13286a)).f12969p;
            C0174b c0174b = h0.f7748a;
            c3966o = c3966o2;
            p9.m6240d(AbstractC0237a.m633a(interfaceC7879rM668e, j6, c0174b), c0174b, null, null, null, AbstractC6740i.m12902d(-249418421, new InterfaceC2142f() { // from class: ot.a
                @Override // ex.InterfaceC2142f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C7876o c7876o;
                    C5138b c5138b;
                    C7871j c7871j;
                    float f6;
                    boolean z10;
                    Object obj4;
                    p1 p1Var;
                    C7876o c7876o2;
                    C7636h c7636h;
                    C7636h c7636h2;
                    boolean z11;
                    boolean z12;
                    C7870i c7870i;
                    float f10;
                    boolean z13;
                    C7636h c7636h3;
                    InterfaceC5262u Card = (InterfaceC5262u) obj;
                    InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    C7871j c7871j2 = C7864c.f37642a;
                    AbstractC4154l.m8923f(Card, "$this$Card");
                    C3966o c3966o3 = (C3966o) interfaceC3962k2;
                    if (c3966o3.m8598P(iIntValue & 1, (iIntValue & 17) != 16)) {
                        C7876o c7876o3 = C7876o.f37669a;
                        p9.m6245i(AbstractC0245d.m668e(c7876o3, 1.0f), 1, AbstractC7554g.m14301b(c3966o3).f36398j, c3966o3, 54, 0);
                        long j10 = t6.m6310a(c3966o3).f12969p;
                        C0174b c0174b2 = h0.f7748a;
                        InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(c7876o3, j10, c0174b2);
                        C5245d c5245d = AbstractC5251j.f25759c;
                        C7869h c7869h = C7864c.f37654n;
                        C5261t c5261tM10367a = AbstractC5260s.m10367a(c5245d, c7869h, c3966o3, 0);
                        int i12 = c3966o3.f20462P;
                        k2.i1 i1VarM8620m = c3966o3.m8620m();
                        InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o3, interfaceC7879rM633a);
                        InterfaceC7639k.V0.getClass();
                        C7637i c7637i = C7638j.f36921b;
                        c3966o3.c0();
                        if (c3966o3.f20461O) {
                            c3966o3.m8619l(c7637i);
                        } else {
                            c3966o3.m0();
                        }
                        C7636h c7636h4 = C7638j.f36925f;
                        C3953b.m8521x(c7636h4, c5261tM10367a, c3966o3);
                        C7636h c7636h5 = C7638j.f36924e;
                        C3953b.m8521x(c7636h5, i1VarM8620m, c3966o3);
                        C7636h c7636h6 = C7638j.f36926g;
                        if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i12))) {
                            AbstractC1452a.m4577x(i12, c3966o3, i12, c7636h6);
                        }
                        C7636h c7636h7 = C7638j.f36923d;
                        C3953b.m8521x(c7636h7, interfaceC7879rM14845c, c3966o3);
                        float f11 = 20;
                        float f12 = 10;
                        InterfaceC7879r interfaceC7879rM659m = AbstractC0242a.m659m(c7876o3, f11, 6, f11, f12);
                        C5261t c5261tM10367a2 = AbstractC5260s.m10367a(c5245d, c7869h, c3966o3, 0);
                        int i13 = c3966o3.f20462P;
                        k2.i1 i1VarM8620m2 = c3966o3.m8620m();
                        InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o3, interfaceC7879rM659m);
                        c3966o3.c0();
                        if (c3966o3.f20461O) {
                            c3966o3.m8619l(c7637i);
                        } else {
                            c3966o3.m0();
                        }
                        C3953b.m8521x(c7636h4, c5261tM10367a2, c3966o3);
                        C3953b.m8521x(c7636h5, i1VarM8620m2, c3966o3);
                        if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i13))) {
                            AbstractC1452a.m4577x(i13, c3966o3, i13, c7636h6);
                        }
                        C3953b.m8521x(c7636h7, interfaceC7879rM14845c2, c3966o3);
                        float f13 = 8;
                        AbstractC5244c.m10322f(c3966o3, AbstractC0245d.m670g(c7876o3, f13));
                        InterfaceC7879r interfaceC7879rM668e2 = AbstractC0245d.m668e(c7876o3, 1.0f);
                        C7870i c7870i2 = C7864c.f37651k;
                        o1.n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25763g, c7870i2, c3966o3, 54);
                        int i14 = c3966o3.f20462P;
                        k2.i1 i1VarM8620m3 = c3966o3.m8620m();
                        InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o3, interfaceC7879rM668e2);
                        c3966o3.c0();
                        if (c3966o3.f20461O) {
                            c3966o3.m8619l(c7637i);
                        } else {
                            c3966o3.m0();
                        }
                        C3953b.m8521x(c7636h4, n1VarM10357a, c3966o3);
                        C3953b.m8521x(c7636h5, i1VarM8620m3, c3966o3);
                        if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i14))) {
                            AbstractC1452a.m4577x(i14, c3966o3, i14, c7636h6);
                        }
                        C3953b.m8521x(c7636h7, interfaceC7879rM14845c3, c3966o3);
                        C5138b c5138b2 = template;
                        String str = c5138b2.f25170b;
                        String str2 = c5138b2.f25172d;
                        boolean z14 = c5138b2.f25174f;
                        o0 o0VarM6461a = o0.m6461a(t6.m6311b(c3966o3).f13052h, 0L, af.m10534c(17), null, null, null, 0L, 0L, null, 16777213);
                        p1 p1Var2 = p1.f25811a;
                        sq.b1.m13113q(str, AbstractC0242a.m660n(p1Var2.mo10364b(1.0f, c7876o3, true), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f13, DefinitionKt.NO_Float_VALUE, 11), 0L, null, null, 2, 0, 0L, null, o0VarM6461a, c3966o3, 196608, 476);
                        C3966o c3966o4 = c3966o3;
                        o1.n1 n1VarM10357a2 = m1.m10357a(AbstractC5251j.f25758b, c7870i2, c3966o4, 54);
                        int i15 = c3966o4.f20462P;
                        k2.i1 i1VarM8620m4 = c3966o4.m8620m();
                        InterfaceC7879r interfaceC7879rM14845c4 = AbstractC7862a.m14845c(c3966o4, c7876o3);
                        c3966o4.c0();
                        if (c3966o4.f20461O) {
                            c3966o4.m8619l(c7637i);
                        } else {
                            c3966o4.m0();
                        }
                        C3953b.m8521x(c7636h4, n1VarM10357a2, c3966o4);
                        C3953b.m8521x(c7636h5, i1VarM8620m4, c3966o4);
                        if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i15))) {
                            AbstractC1452a.m4577x(i15, c3966o4, i15, c7636h6);
                        }
                        C3953b.m8521x(c7636h7, interfaceC7879rM14845c4, c3966o4);
                        boolean z15 = z6;
                        if (z15) {
                            c7876o = c7876o3;
                            c5138b = c5138b2;
                            c7871j = c7871j2;
                            f6 = f11;
                            c3966o4.m8607Y(507672299);
                            c3966o4.m8623p(false);
                        } else {
                            c3966o4.m8607Y(526001452);
                            f6 = f11;
                            InterfaceC7879r interfaceC7879rM654h = AbstractC0242a.m654h(AbstractC0245d.m678o(c7876o3, f6), 0, -4);
                            c7871j = c7871j2;
                            j0 j0VarM10361d = AbstractC5256o.m10361d(c7871j, false);
                            int i16 = c3966o4.f20462P;
                            k2.i1 i1VarM8620m5 = c3966o4.m8620m();
                            InterfaceC7879r interfaceC7879rM14845c5 = AbstractC7862a.m14845c(c3966o4, interfaceC7879rM654h);
                            c3966o4.c0();
                            c7876o = c7876o3;
                            if (c3966o4.f20461O) {
                                c3966o4.m8619l(c7637i);
                            } else {
                                c3966o4.m0();
                            }
                            C3953b.m8521x(c7636h4, j0VarM10361d, c3966o4);
                            C3953b.m8521x(c7636h5, i1VarM8620m5, c3966o4);
                            if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i16))) {
                                AbstractC1452a.m4577x(i16, c3966o4, i16, c7636h6);
                            }
                            C3953b.m8521x(c7636h7, interfaceC7879rM14845c5, c3966o4);
                            c5138b = c5138b2;
                            C3953b.m8498a(g6.f11636a.mo8541a(Boolean.FALSE), AbstractC6740i.m12902d(-915226282, new C0403f(27, c5138b, onChecked), c3966o4), c3966o4, 56);
                            c3966o4.m8623p(true);
                            c3966o4.m8623p(false);
                        }
                        C7876o c7876o4 = c7876o;
                        InterfaceC7879r interfaceC7879rMo10363a = p1Var2.mo10363a(AbstractC0242a.m660n(c7876o, f13, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), c7870i2);
                        InterfaceC2137a interfaceC2137a = onCopy;
                        boolean zM8614g = c3966o4.m8614g(interfaceC2137a);
                        Object objM8596M3 = c3966o4.m8596M();
                        Object obj5 = C3961j.f20408a;
                        if (zM8614g || objM8596M3 == obj5) {
                            z10 = z15;
                            objM8596M3 = new C0440d(27, interfaceC2137a);
                            c3966o4.j0(objM8596M3);
                        } else {
                            z10 = z15;
                        }
                        InterfaceC7879r interfaceC7879rM637e = AbstractC0237a.m637e(interfaceC7879rMo10363a, false, null, null, (InterfaceC2137a) objM8596M3, 7);
                        j0 j0VarM10361d2 = AbstractC5256o.m10361d(c7871j, false);
                        int i17 = c3966o4.f20462P;
                        float f14 = f6;
                        k2.i1 i1VarM8620m6 = c3966o4.m8620m();
                        InterfaceC7879r interfaceC7879rM14845c6 = AbstractC7862a.m14845c(c3966o4, interfaceC7879rM637e);
                        c3966o4.c0();
                        C7871j c7871j3 = c7871j;
                        if (c3966o4.f20461O) {
                            c3966o4.m8619l(c7637i);
                        } else {
                            c3966o4.m0();
                        }
                        C3953b.m8521x(c7636h4, j0VarM10361d2, c3966o4);
                        C3953b.m8521x(c7636h5, i1VarM8620m6, c3966o4);
                        if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i17))) {
                            AbstractC1452a.m4577x(i17, c3966o4, i17, c7636h6);
                        }
                        C3953b.m8521x(c7636h7, interfaceC7879rM14845c6, c3966o4);
                        float f15 = 24;
                        boolean z16 = z10;
                        C5138b c5138b3 = c5138b;
                        i0.m11693a(b9.m11551a(com.websoptimization.callyzerbiz.R.drawable.ic_copy, 0, c3966o4), "Copy", AbstractC0245d.m678o(c7876o4, f15), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o4, 432, 120);
                        c3966o4.m8623p(true);
                        if (z16) {
                            obj4 = obj5;
                            p1Var = p1Var2;
                            c7876o2 = c7876o4;
                            c7636h = c7636h7;
                            c7636h2 = c7636h6;
                            z11 = true;
                            z12 = false;
                            c7870i = c7870i2;
                            f10 = f13;
                            c3966o4.m8607Y(507672299);
                        } else {
                            c3966o4.m8607Y(527745140);
                            float f16 = 2;
                            InterfaceC7879r interfaceC7879rMo10363a2 = p1Var2.mo10363a(AbstractC0242a.m660n(c7876o4, f13, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f16, 6), c7870i2);
                            InterfaceC2137a interfaceC2137a2 = clickOnWhatsapp;
                            boolean zM8614g2 = c3966o4.m8614g(interfaceC2137a2);
                            Object objM8596M4 = c3966o4.m8596M();
                            if (zM8614g2 || objM8596M4 == obj5) {
                                objM8596M4 = new C0440d(28, interfaceC2137a2);
                                c3966o4.j0(objM8596M4);
                            }
                            InterfaceC7879r interfaceC7879rM637e2 = AbstractC0237a.m637e(interfaceC7879rMo10363a2, false, null, null, (InterfaceC2137a) objM8596M4, 7);
                            j0 j0VarM10361d3 = AbstractC5256o.m10361d(c7871j3, false);
                            int i18 = c3966o4.f20462P;
                            k2.i1 i1VarM8620m7 = c3966o4.m8620m();
                            InterfaceC7879r interfaceC7879rM14845c7 = AbstractC7862a.m14845c(c3966o4, interfaceC7879rM637e2);
                            c3966o4.c0();
                            if (c3966o4.f20461O) {
                                c3966o4.m8619l(c7637i);
                            } else {
                                c3966o4.m0();
                            }
                            C3953b.m8521x(c7636h4, j0VarM10361d3, c3966o4);
                            C3953b.m8521x(c7636h5, i1VarM8620m7, c3966o4);
                            if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i18))) {
                                c7636h3 = c7636h6;
                                AbstractC1452a.m4577x(i18, c3966o4, i18, c7636h3);
                            } else {
                                c7636h3 = c7636h6;
                            }
                            C3953b.m8521x(c7636h7, interfaceC7879rM14845c7, c3966o4);
                            obj4 = obj5;
                            p1Var = p1Var2;
                            c7876o2 = c7876o4;
                            c7636h = c7636h7;
                            c7636h2 = c7636h3;
                            c7870i = c7870i2;
                            f10 = f13;
                            i0.m11693a(b9.m11551a(com.websoptimization.callyzerbiz.R.drawable.ic_wp, 0, c3966o4), "WhatsApp", AbstractC0242a.m660n(AbstractC0245d.m678o(c7876o4, f15), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f16, 7), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o4, 432, 120);
                            z11 = true;
                            c3966o4.m8623p(true);
                            z12 = false;
                        }
                        c3966o4.m8623p(z12);
                        c3966o4.m8623p(z11);
                        c3966o4.m8623p(z11);
                        if (str2 == null || AbstractC4154l.m8918a(str2, "")) {
                            z13 = false;
                            c3966o4.m8607Y(-826296429);
                            AbstractC5244c.m10322f(c3966o4, AbstractC0245d.m670g(c7876o2, f10));
                            c3966o4.m8623p(false);
                        } else {
                            c3966o4.m8607Y(-826552396);
                            sq.b1.m13113q("(" + str2 + ")", AbstractC0242a.m658l(c7876o2, DefinitionKt.NO_Float_VALUE, 4, 1), 0L, null, null, 0, 0, 0L, null, new o0(0L, 0L, null, new C3994o(1), null, 0L, 0, 0L, 16777207), c3966o4, 48, 508);
                            c3966o4 = c3966o4;
                            z13 = false;
                            c3966o4.m8623p(false);
                        }
                        c3966o4.m8623p(true);
                        InterfaceC7879r interfaceC7879rMo14852e = AbstractC0237a.m633a(c7876o2, c4167y.f21163a, c0174b2).mo14852e(AbstractC0245d.f1971c);
                        j0 j0VarM10361d4 = AbstractC5256o.m10361d(c7871j3, z13);
                        int i19 = c3966o4.f20462P;
                        k2.i1 i1VarM8620m8 = c3966o4.m8620m();
                        InterfaceC7879r interfaceC7879rM14845c8 = AbstractC7862a.m14845c(c3966o4, interfaceC7879rMo14852e);
                        c3966o4.c0();
                        if (c3966o4.f20461O) {
                            c3966o4.m8619l(c7637i);
                        } else {
                            c3966o4.m0();
                        }
                        C3953b.m8521x(c7636h4, j0VarM10361d4, c3966o4);
                        C3953b.m8521x(c7636h5, i1VarM8620m8, c3966o4);
                        if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i19))) {
                            AbstractC1452a.m4577x(i19, c3966o4, i19, c7636h2);
                        }
                        C7636h c7636h8 = c7636h;
                        C3953b.m8521x(c7636h8, interfaceC7879rM14845c8, c3966o4);
                        InterfaceC7879r interfaceC7879rM659m2 = AbstractC0242a.m659m(AbstractC0245d.m668e(c7876o2, 1.0f), f14, 5, f14, f12);
                        o1.n1 n1VarM10357a3 = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o4, 0);
                        int i20 = c3966o4.f20462P;
                        k2.i1 i1VarM8620m9 = c3966o4.m8620m();
                        InterfaceC7879r interfaceC7879rM14845c9 = AbstractC7862a.m14845c(c3966o4, interfaceC7879rM659m2);
                        c3966o4.c0();
                        if (c3966o4.f20461O) {
                            c3966o4.m8619l(c7637i);
                        } else {
                            c3966o4.m0();
                        }
                        C3953b.m8521x(c7636h4, n1VarM10357a3, c3966o4);
                        C3953b.m8521x(c7636h5, i1VarM8620m9, c3966o4);
                        if (c3966o4.f20461O || !AbstractC4154l.m8918a(c3966o4.m8596M(), Integer.valueOf(i20))) {
                            AbstractC1452a.m4577x(i20, c3966o4, i20, c7636h2);
                        }
                        C3953b.m8521x(c7636h8, interfaceC7879rM14845c9, c3966o4);
                        String str3 = c5138b3.f25171c;
                        InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(p1Var.mo10364b(1.0f, c7876o2, true), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f10, DefinitionKt.NO_Float_VALUE, 11);
                        o0 o0Var = new o0(0L, af.m10534c(15), null, null, null, 0L, 0, 0L, 16777213);
                        int i21 = z14 ? Integer.MAX_VALUE : 3;
                        Object objM8596M5 = c3966o4.m8596M();
                        b1 b1Var2 = b1Var;
                        w0 w0Var2 = w0Var;
                        Object obj6 = obj4;
                        if (objM8596M5 == obj6) {
                            objM8596M5 = new C3009n(19, b1Var2, w0Var2);
                            c3966o4.j0(objM8596M5);
                        }
                        C3966o c3966o5 = c3966o4;
                        sq.b1.m13113q(str3, interfaceC7879rM660n, 0L, null, null, 2, i21, 0L, (InterfaceC2139c) objM8596M5, o0Var, c3966o5, 906166272, 156);
                        if (((Boolean) w0Var2.getValue()).booleanValue() || b1Var2.m8526f() > 3) {
                            c3966o5.m8607Y(-1709030142);
                            AbstractC3166c abstractC3166cM10866b = r0.m10866b((!z14 || b1Var2.m8526f() <= 3) ? com.websoptimization.callyzerbiz.R.drawable.ic_thin_drop_down : com.websoptimization.callyzerbiz.R.drawable.ic_thin_drop_up, 0, c3966o5);
                            String str4 = z14 ? "Collapse" : "Expand";
                            InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o2, 15);
                            InterfaceC2137a interfaceC2137a3 = onExpend;
                            boolean zM8614g3 = c3966o5.m8614g(interfaceC2137a3);
                            Object objM8596M6 = c3966o5.m8596M();
                            if (zM8614g3 || objM8596M6 == obj6) {
                                objM8596M6 = new C0440d(29, interfaceC2137a3);
                                c3966o5.j0(objM8596M6);
                            }
                            i0.m11693a(abstractC3166cM10866b, str4, AbstractC0237a.m637e(interfaceC7879rM678o, false, null, null, (InterfaceC2137a) objM8596M6, 7), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o5, 0, 120);
                        } else {
                            c3966o5.m8607Y(-1731299209);
                        }
                        c3966o5.m8623p(false);
                        a1.m14320C(c3966o5, true, true, true);
                    } else {
                        c3966o3.m8601S();
                    }
                    return a0.f30746a;
                }
            }, c3966o2), c3966o, 196656, 28);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1524t(template, z6, onChecked, onCopy, onExpend, clickOnWhatsapp, i10);
        }
    }

    /* renamed from: g */
    public static final void m1898g(String str, String str2, InterfaceC2137a onClick, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(onClick, "onClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(407358454);
        int i11 = (c3966o.m8614g(str) ? 4 : 2) | i10 | (c3966o.m8614g(str2) ? 32 : 16) | (c3966o.m8616i(onClick) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            float f6 = 24;
            p9.m6240d(AbstractC5244c.m10330o(AbstractC0245d.m668e(C7876o.f37669a, 1.0f)), AbstractC7861e.m14842c(f6, f6), null, p9.m6254r(8, 62), null, AbstractC6740i.m12902d(-1295011352, new C0770o(7, str, str2, onClick), c3966o), c3966o, 196608, 20);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0767l(str, (Object) str2, (Object) onClick, i10, 25);
        }
    }

    /* renamed from: h */
    public static ByteBuffer m1899h(C2964a c2964a) throws MlKitException {
        int i10 = c2964a.f16028f;
        int i11 = 0;
        if (i10 != -1) {
            if (i10 == 17) {
                AbstractC6840z.m13036g(null);
                throw null;
            }
            if (i10 != 35) {
                if (i10 != 842094169) {
                    throw new MlKitException("Unsupported image format", 13);
                }
                AbstractC6840z.m13036g(null);
                throw null;
            }
            Image.Plane[] planeArrM7245a = c2964a.m7245a();
            AbstractC6840z.m13036g(planeArrM7245a);
            int i12 = c2964a.f16025c;
            int i13 = c2964a.f16026d;
            int i14 = i12 * i13;
            int i15 = i14 / 4;
            byte[] bArr = new byte[i15 + i15 + i14];
            ByteBuffer buffer = planeArrM7245a[1].getBuffer();
            ByteBuffer buffer2 = planeArrM7245a[2].getBuffer();
            int iPosition = buffer2.position();
            int iLimit = buffer.limit();
            buffer2.position(iPosition + 1);
            buffer.limit(iLimit - 1);
            int i16 = (i14 + i14) / 4;
            boolean z6 = buffer2.remaining() == i16 + (-2) && buffer2.compareTo(buffer) == 0;
            buffer2.position(iPosition);
            buffer.limit(iLimit);
            if (z6) {
                planeArrM7245a[0].getBuffer().get(bArr, 0, i14);
                ByteBuffer buffer3 = planeArrM7245a[1].getBuffer();
                planeArrM7245a[2].getBuffer().get(bArr, i14, 1);
                buffer3.get(bArr, i14 + 1, i16 - 1);
            } else {
                m1891G(planeArrM7245a[0], i12, i13, bArr, 0, 1);
                m1891G(planeArrM7245a[1], i12, i13, bArr, i14 + 1, 2);
                m1891G(planeArrM7245a[2], i12, i13, bArr, i14, 2);
            }
            return ByteBuffer.wrap(bArr);
        }
        Bitmap bitmapCopy = c2964a.f16023a;
        AbstractC6840z.m13036g(bitmapCopy);
        if (Build.VERSION.SDK_INT >= 26 && bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = width * height;
        int[] iArr = new int[i17];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(height / 2.0d);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(width / 2.0d))) + i17);
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (i18 < height) {
            int i21 = i11;
            while (i21 < width) {
                int i22 = iArr[i20];
                int i23 = i22 >> 16;
                int i24 = i22 >> 8;
                int i25 = i22 & 255;
                int i26 = i19 + 1;
                int i27 = i23 & 255;
                int i28 = i24 & 255;
                byteBufferAllocateDirect.put(i19, (byte) Math.min(255, (AbstractC5601a.m11230a(i25, 25, (i28 * 129) + (i27 * 66), 128) >> 8) + 16));
                if (i18 % 2 == 0 && i20 % 2 == 0) {
                    int i29 = ((((i27 * 112) - (i28 * 94)) - (i25 * 18)) + 128) >> 8;
                    int i30 = (((((i27 * (-38)) - (i28 * 74)) + (i25 * 112)) + 128) >> 8) + 128;
                    int i31 = i17 + 1;
                    byteBufferAllocateDirect.put(i17, (byte) Math.min(255, i29 + 128));
                    i17 += 2;
                    byteBufferAllocateDirect.put(i31, (byte) Math.min(255, i30));
                }
                i20++;
                i21++;
                i19 = i26;
            }
            i18++;
            i11 = 0;
        }
        return byteBufferAllocateDirect;
    }

    /* renamed from: i */
    public static Notification.Builder m1900i(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* renamed from: j */
    public static Icon m1901j(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    /* renamed from: k */
    public static final int m1902k(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    /* renamed from: l */
    public static AutofillId m1903l(View view) {
        return view.getAutofillId();
    }

    /* renamed from: m */
    public static float m1904m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    /* renamed from: n */
    public static float m1905n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    /* renamed from: o */
    public static final boolean m1906o(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    /* renamed from: p */
    public static synchronized boolean m1907p(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f4198a;
        if (context2 != null && (bool = f4199b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f4199b = null;
        if (AbstractC8947b.m16428e()) {
            f4199b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f4199b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f4199b = Boolean.FALSE;
            }
        }
        f4198a = applicationContext;
        return f4199b.booleanValue();
    }

    /* renamed from: q */
    public static boolean m1908q(File file, File file2) throws IOException {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: r */
    public static void m1909r(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }

    /* renamed from: s */
    public static final void m1910s(C8277a c8277a, SparseArray sparseArray) {
        if (c8277a.f39798b.f39814a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValueM14963e = C7892j.m14963e(sparseArray.get(iKeyAt));
            if (autofillValueM14963e.isText()) {
                C8287k c8287k = c8277a.f39798b;
                autofillValueM14963e.getTextValue().toString();
                if (c8287k.f39814a.get(Integer.valueOf(iKeyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (autofillValueM14963e.isDate()) {
                    throw new C6360j("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueM14963e.isList()) {
                    throw new C6360j("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueM14963e.isToggle()) {
                    throw new C6360j("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    /* renamed from: t */
    public static void m1911t(MenuItem menuItem, char c2, int i10) {
        menuItem.setAlphabeticShortcut(c2, i10);
    }

    /* renamed from: u */
    public static void m1912u(TextView textView, int i10, int i11) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, 1, 1);
    }

    /* renamed from: v */
    public static void m1913v(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    /* renamed from: w */
    public static void m1914w(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    /* renamed from: x */
    public static void m1915x(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    /* renamed from: y */
    public static void m1916y(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    /* renamed from: z */
    public static void m1917z(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }
}
