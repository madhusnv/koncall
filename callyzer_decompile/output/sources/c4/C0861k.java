package c4;

import android.content.ClipData;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.CallLog;
import android.telephony.PhoneNumberUtils;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import c3.C0848c;
import c6.AbstractC0873c;
import c6.C0877g;
import c6.InterfaceC0874d;
import c6.InterfaceC0876f;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import d3.h0;
import d4.C1590r;
import ex.InterfaceC2139c;
import java.util.function.Consumer;
import k2.C3953b;
import kotlin.jvm.internal.AbstractC4154l;
import m2.C4640e;
import nx.AbstractC5178p;
import o0.C5241a;
import og.e2;
import og.ye;
import om.C5414p;
import pv.C6041a;
import s4.C6755k;
import so.C6877c;
import t3.c1;
import tx.c0;
import uw.InterfaceC7564h;
import v3.h1;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c4.k */
/* loaded from: classes.dex */
public final class C0861k implements InterfaceC0874d, InterfaceC0876f {

    /* renamed from: a */
    public final /* synthetic */ int f5402a;

    /* renamed from: b */
    public final Object f5403b;

    public C0861k(C6877c c6877c) {
        this.f5402a = 3;
        this.f5403b = c6877c;
    }

    /* renamed from: h */
    public static Cursor m2300h(Context context) {
        AbstractC4154l.m8923f(context, "context");
        Uri uri = CallLog.Calls.CONTENT_URI;
        if (Build.VERSION.SDK_INT > 29) {
            Bundle bundle = new Bundle();
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{TransferTable.COLUMN_ID});
            bundle.putInt("android:query-arg-sort-direction", 1);
            bundle.putInt("android:query-arg-limit", 1);
            return context.getContentResolver().query(uri, null, bundle, null);
        }
        try {
            return context.getContentResolver().query(uri, null, null, null, "_id DESC limit 1");
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            if (e2.getMessage() == null) {
                return null;
            }
            String message = e2.getMessage();
            AbstractC4154l.m8920c(message);
            if (!AbstractC5178p.m10116x(message, "Invalid token limit", false) || Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putStringArray("android:query-arg-sort-columns", new String[]{TransferTable.COLUMN_ID});
            bundle2.putInt("android:query-arg-sort-direction", 1);
            bundle2.putInt("android:query-arg-limit", 1);
            return context.getContentResolver().query(uri, null, bundle2, null);
        }
    }

    /* renamed from: i */
    public static boolean m2301i(String number, String calledNumber, String str) {
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(calledNumber, "calledNumber");
        return Build.VERSION.SDK_INT >= 31 ? PhoneNumberUtils.areSamePhoneNumber(number, calledNumber, str) : PhoneNumberUtils.compare(number, calledNumber);
    }

    /* renamed from: k */
    public static boolean m2302k(C5414p c5414p, C6041a phoneStateCursorCallLog) {
        AbstractC4154l.m8923f(phoneStateCursorCallLog, "phoneStateCursorCallLog");
        return m2301i(phoneStateCursorCallLog.f29496a, c5414p.f27189f, phoneStateCursorCallLog.f29498c) && phoneStateCursorCallLog.f29499d.isEqual(c5414p.f27192j);
    }

    @Override // c6.InterfaceC0876f
    /* renamed from: a */
    public ClipData mo2303a() {
        return ((ContentInfo) this.f5403b).getClip();
    }

    @Override // c6.InterfaceC0874d
    /* renamed from: b */
    public void mo2304b(Uri uri) {
        ((ContentInfo.Builder) this.f5403b).setLinkUri(uri);
    }

    @Override // c6.InterfaceC0874d
    public C0877g build() {
        return new C0877g(new C0861k(((ContentInfo.Builder) this.f5403b).build()));
    }

    @Override // c6.InterfaceC0874d
    /* renamed from: c */
    public void mo2305c(int i10) {
        ((ContentInfo.Builder) this.f5403b).setFlags(i10);
    }

    @Override // c6.InterfaceC0876f
    /* renamed from: d */
    public int mo2306d() {
        return ((ContentInfo) this.f5403b).getFlags();
    }

    @Override // c6.InterfaceC0876f
    /* renamed from: e */
    public ContentInfo mo2307e() {
        return (ContentInfo) this.f5403b;
    }

    @Override // c6.InterfaceC0876f
    /* renamed from: f */
    public int mo2308f() {
        return ((ContentInfo) this.f5403b).getSource();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2309g(android.database.Cursor r10, ww.AbstractC8193c r11) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.C0861k.m2309g(android.database.Cursor, ww.c):java.lang.Object");
    }

    /* renamed from: j */
    public void m2310j(C7904v c7904v, C1590r c1590r, InterfaceC7564h interfaceC7564h, Consumer consumer) {
        C4640e c4640e = new C4640e(new C0862l[16]);
        e2.m10625b(c1590r.m5221a(), 0, new C0860j(1, c4640e, C4640e.class, "add", "add(Ljava/lang/Object;)Z", 8, 0));
        c4640e.m9518q(new C5241a(1, new InterfaceC2139c[]{C0852b.f5376c, C0852b.f5377d}));
        int i10 = c4640e.f22886c;
        C0862l c0862l = (C0862l) (i10 == 0 ? null : c4640e.f22884a[i10 - 1]);
        if (c0862l == null) {
            return;
        }
        C6755k c6755k = c0862l.f5406c;
        ScrollCaptureCallbackC0854d scrollCaptureCallbackC0854d = new ScrollCaptureCallbackC0854d(c0862l.f5404a, c6755k, c0.m13479b(interfaceC7564h), this, c7904v);
        h1 h1Var = c0862l.f5407d;
        C0848c c0848cMo13298S = c1.m13279h(h1Var).mo13298S(h1Var, true);
        long jM12946c = c6755k.m12946c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(c7904v, h0.m5147s(ye.m11071c(c0848cMo13298S)), new Point((int) (jM12946c >> 32), (int) (jM12946c & 4294967295L)), scrollCaptureCallbackC0854d);
        scrollCaptureTarget.setScrollBounds(h0.m5147s(c6755k));
        consumer.accept(scrollCaptureTarget);
    }

    @Override // c6.InterfaceC0874d
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f5403b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f5402a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f5403b) + "}";
            default:
                return super.toString();
        }
    }

    public C0861k() {
        this.f5402a = 0;
        this.f5403b = C3953b.m8517t(Boolean.FALSE);
    }

    public C0861k(ContentInfo contentInfo) {
        this.f5402a = 2;
        contentInfo.getClass();
        this.f5403b = contentInfo;
    }

    public C0861k(ClipData clipData, int i10) {
        this.f5402a = 1;
        this.f5403b = AbstractC0873c.m2345a(clipData, i10);
    }
}
