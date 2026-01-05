package al;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import b2.C0554l;
import hd.C2893e;
import java.util.ArrayList;
import java.util.List;
import jg.AbstractC3763b;
import ng.C5054e;
import ng.C5061l;
import pf.C5904d;
import pf.C5906f;
import pg.l8;
import ph.C5950e;
import qf.C6205d;
import qf.InterfaceC6203b;
import sf.AbstractC6840z;
import v0.C7622f;
import wf.C8027c;
import xf.C8366a;
import xf.C8372g;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.h */
/* loaded from: classes.dex */
public abstract class AbstractC0180h {

    /* renamed from: a */
    public static final C5904d[] f548a = new C5904d[0];

    /* renamed from: b */
    public static final C5904d f549b;

    /* renamed from: c */
    public static final C5061l f550c;

    /* renamed from: d */
    public static final C5061l f551d;

    static {
        C5904d c5904d = new C5904d("vision.barcode", 1L);
        f549b = c5904d;
        C5904d c5904d2 = new C5904d("vision.custom.ica", 1L);
        C5904d c5904d3 = new C5904d("vision.face", 1L);
        C5904d c5904d4 = new C5904d("vision.ica", 1L);
        C5904d c5904d5 = new C5904d("vision.ocr", 1L);
        C5904d c5904d6 = new C5904d("mlkit.langid", 1L);
        C5904d c5904d7 = new C5904d("mlkit.nlclassifier", 1L);
        C5904d c5904d8 = new C5904d("tflite_dynamite", 1L);
        C5904d c5904d9 = new C5904d("mlkit.barcode.ui", 1L);
        C5904d c5904d10 = new C5904d("mlkit.smartreply", 1L);
        C0554l c0554l = new C0554l((byte) 0, 4);
        c0554l.m1645o("barcode", c5904d);
        c0554l.m1645o("custom_ica", c5904d2);
        c0554l.m1645o("face", c5904d3);
        c0554l.m1645o("ica", c5904d4);
        c0554l.m1645o("ocr", c5904d5);
        c0554l.m1645o("langid", c5904d6);
        c0554l.m1645o("nlclassifier", c5904d7);
        c0554l.m1645o("tflite_dynamite", c5904d8);
        c0554l.m1645o("barcode_ui", c5904d9);
        c0554l.m1645o("smart_reply", c5904d10);
        C5054e c5054e = (C5054e) c0554l.f3780d;
        if (c5054e != null) {
            throw c5054e.m9994a();
        }
        C5061l c5061lM9995b = C5061l.m9995b(c0554l.f3778b, (Object[]) c0554l.f3779c, c0554l);
        C5054e c5054e2 = (C5054e) c0554l.f3780d;
        if (c5054e2 != null) {
            throw c5054e2.m9994a();
        }
        f550c = c5061lM9995b;
        C0554l c0554l2 = new C0554l((byte) 0, 4);
        c0554l2.m1645o("com.google.android.gms.vision.barcode", c5904d);
        c0554l2.m1645o("com.google.android.gms.vision.custom.ica", c5904d2);
        c0554l2.m1645o("com.google.android.gms.vision.face", c5904d3);
        c0554l2.m1645o("com.google.android.gms.vision.ica", c5904d4);
        c0554l2.m1645o("com.google.android.gms.vision.ocr", c5904d5);
        c0554l2.m1645o("com.google.android.gms.mlkit.langid", c5904d6);
        c0554l2.m1645o("com.google.android.gms.mlkit.nlclassifier", c5904d7);
        c0554l2.m1645o("com.google.android.gms.tflite_dynamite", c5904d8);
        c0554l2.m1645o("com.google.android.gms.mlkit_smartreply", c5904d10);
        C5054e c5054e3 = (C5054e) c0554l2.f3780d;
        if (c5054e3 != null) {
            throw c5054e3.m9994a();
        }
        C5061l c5061lM9995b2 = C5061l.m9995b(c0554l2.f3778b, (Object[]) c0554l2.f3779c, c0554l2);
        C5054e c5054e4 = (C5054e) c0554l2.f3780d;
        if (c5054e4 != null) {
            throw c5054e4.m9994a();
        }
        f551d = c5061lM9995b2;
    }

    /* renamed from: a */
    public static void m407a(Context context, List list) {
        C8656m c8656mM12223b;
        C5906f.f28748b.getClass();
        if (C5906f.m11514a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        C5904d[] c5904dArrM408b = m408b(f550c, list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0189q(c5904dArrM408b, 0));
        AbstractC6840z.m13030a("APIs must not be empty.", !arrayList.isEmpty());
        C8372g c8372g = new C8372g(context, null, C8372g.f40031k, InterfaceC6203b.R0, C6205d.f30184c);
        C8366a c8366aM15539b = C8366a.m15539b(arrayList, true);
        if (c8366aM15539b.f40024a.isEmpty()) {
            c8656mM12223b = l8.m11765f(new C8027c(0, false));
        } else {
            C2893e c2893eM7007b = C2893e.m7007b();
            c2893eM7007b.f15925d = new C5904d[]{AbstractC3763b.f19643c};
            c2893eM7007b.f15922a = true;
            c2893eM7007b.f15923b = 27304;
            C7622f c7622f = new C7622f();
            c7622f.f36778a = c8366aM15539b;
            c2893eM7007b.f15924c = c7622f;
            c8656mM12223b = c8372g.m12223b(0, c2893eM7007b.m7008a());
        }
        c8656mM12223b.m15978e(new C5950e(1));
    }

    /* renamed from: b */
    public static C5904d[] m408b(C5061l c5061l, List list) {
        C5904d[] c5904dArr = new C5904d[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C5904d c5904d = (C5904d) c5061l.get(list.get(i10));
            AbstractC6840z.m13036g(c5904d);
            c5904dArr[i10] = c5904d;
        }
        return c5904dArr;
    }
}
