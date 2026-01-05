package zv;

import a1.AbstractC0019r;
import a2.AbstractC0030c;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import p020v.a1;
import q5.AbstractC6117j;
import q5.C6112e;
import q5.C6116i;
import q5.C6118k;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zv.a */
/* loaded from: classes3.dex */
public final class C9097a {

    /* renamed from: a */
    public final String f43629a;

    /* renamed from: b */
    public final int f43630b;

    /* renamed from: c */
    public final String f43631c;

    /* renamed from: d */
    public final String f43632d;

    /* renamed from: e */
    public final boolean f43633e;

    /* renamed from: f */
    public final int f43634f;

    /* renamed from: g */
    public final int f43635g;

    /* renamed from: h */
    public boolean f43636h;

    /* renamed from: i */
    public final int f43637i;

    /* renamed from: j */
    public final Uri f43638j;

    /* renamed from: k */
    public final int f43639k;

    /* renamed from: l */
    public final String f43640l;

    /* renamed from: m */
    public final AbstractC0019r f43641m;

    /* renamed from: n */
    public final long[] f43642n;

    /* renamed from: o */
    public final int f43643o;

    /* renamed from: p */
    public final PendingIntent f43644p;

    /* renamed from: q */
    public List f43645q;

    /* renamed from: r */
    public final Integer f43646r;

    public C9097a(String str, int i10, String str2, String titleText, boolean z6, int i11, int i12, boolean z10, int i13, Uri uri, int i14, String str3, AbstractC0019r style, long[] vibrate, int i15, PendingIntent pendingIntent, List list, Integer num) {
        AbstractC4154l.m8923f(titleText, "titleText");
        AbstractC4154l.m8923f(style, "style");
        AbstractC4154l.m8923f(vibrate, "vibrate");
        this.f43629a = str;
        this.f43630b = i10;
        this.f43631c = str2;
        this.f43632d = titleText;
        this.f43633e = z6;
        this.f43634f = i11;
        this.f43635g = i12;
        this.f43636h = z10;
        this.f43637i = i13;
        this.f43638j = uri;
        this.f43639k = i14;
        this.f43640l = str3;
        this.f43641m = style;
        this.f43642n = vibrate;
        this.f43643o = i15;
        this.f43644p = pendingIntent;
        this.f43645q = list;
        this.f43646r = num;
    }

    /* renamed from: b */
    public static C9097a m16506b(C9097a c9097a, String str, String str2, String str3, boolean z6, List list, Integer num, int i10) {
        String str4 = (i10 & 1) != 0 ? c9097a.f43629a : str;
        int i11 = (i10 & 2) != 0 ? c9097a.f43630b : 563;
        String str5 = (i10 & 4) != 0 ? c9097a.f43631c : str2;
        String titleText = (i10 & 8) != 0 ? c9097a.f43632d : str3;
        boolean z10 = c9097a.f43633e;
        int i12 = c9097a.f43634f;
        int i13 = c9097a.f43635g;
        boolean z11 = (i10 & 128) != 0 ? c9097a.f43636h : z6;
        int i14 = c9097a.f43637i;
        Uri uri = c9097a.f43638j;
        int i15 = c9097a.f43639k;
        String category = c9097a.f43640l;
        AbstractC0019r style = c9097a.f43641m;
        long[] vibrate = c9097a.f43642n;
        int i16 = c9097a.f43643o;
        c9097a.getClass();
        PendingIntent pendingIntent = c9097a.f43644p;
        List action = (i10 & 131072) != 0 ? c9097a.f43645q : list;
        String str6 = str4;
        Integer num2 = (i10 & 262144) != 0 ? c9097a.f43646r : num;
        c9097a.getClass();
        AbstractC4154l.m8923f(titleText, "titleText");
        AbstractC4154l.m8923f(category, "category");
        AbstractC4154l.m8923f(style, "style");
        AbstractC4154l.m8923f(vibrate, "vibrate");
        AbstractC4154l.m8923f(action, "action");
        return new C9097a(str6, i11, str5, titleText, z10, i12, i13, z11, i14, uri, i15, category, style, vibrate, i16, pendingIntent, action, num2);
    }

    /* renamed from: a */
    public final Notification m16507a(Context context) {
        C6118k c6118k;
        AbstractC4154l.m8923f(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            String str = this.f43629a;
            if (str == null) {
                str = "default";
            }
            c6118k = new C6118k(context, str);
        } else {
            c6118k = new C6118k(context, null);
        }
        c6118k.f29834e = C6118k.m12150b(this.f43632d);
        c6118k.f29835f = C6118k.m12150b(this.f43631c);
        c6118k.m12152c(16, this.f43633e);
        int i10 = this.f43634f;
        Notification notification = c6118k.f29852w;
        notification.icon = i10;
        c6118k.f29848s = context.getColor(this.f43635g);
        c6118k.m12152c(2, this.f43636h);
        c6118k.f29839j = this.f43637i;
        notification.sound = this.f43638j;
        notification.audioStreamType = -1;
        notification.audioAttributes = AbstractC6117j.m12146a(AbstractC6117j.m12149d(AbstractC6117j.m12148c(AbstractC6117j.m12147b(), 4), 5));
        int i11 = this.f43639k;
        notification.defaults = i11;
        if ((i11 & 4) != 0) {
            notification.flags |= 1;
        }
        c6118k.f29846q = this.f43640l;
        c6118k.m12154e(this.f43641m);
        notification.vibrate = this.f43642n;
        c6118k.f29849t = this.f43643o;
        c6118k.f29836g = this.f43644p;
        for (C9099c c9099c : this.f43645q) {
            c9099c.getClass();
            c6118k.f29831b.add(new C6112e(R.drawable.ic_sync_call_log, c9099c.f43649a, c9099c.f43650b));
        }
        Integer num = this.f43646r;
        if (num != null) {
            if (new C4266h(0, 100, 1).m8986h(num.intValue())) {
                int iIntValue = num.intValue();
                c6118k.f29842m = 100;
                c6118k.f29843n = iIntValue;
                c6118k.f29844o = false;
            } else {
                c6118k.f29842m = 100;
                c6118k.f29843n = 0;
                c6118k.f29844o = true;
            }
        }
        Notification notificationM12151a = c6118k.m12151a();
        AbstractC4154l.m8922e(notificationM12151a, "build(...)");
        return notificationM12151a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9097a)) {
            return false;
        }
        C9097a c9097a = (C9097a) obj;
        return AbstractC4154l.m8918a(this.f43629a, c9097a.f43629a) && this.f43630b == c9097a.f43630b && AbstractC4154l.m8918a(this.f43631c, c9097a.f43631c) && AbstractC4154l.m8918a(this.f43632d, c9097a.f43632d) && this.f43633e == c9097a.f43633e && this.f43634f == c9097a.f43634f && this.f43635g == c9097a.f43635g && this.f43636h == c9097a.f43636h && this.f43637i == c9097a.f43637i && AbstractC4154l.m8918a(this.f43638j, c9097a.f43638j) && this.f43639k == c9097a.f43639k && AbstractC4154l.m8918a(this.f43640l, c9097a.f43640l) && AbstractC4154l.m8918a(this.f43641m, c9097a.f43641m) && AbstractC4154l.m8918a(this.f43642n, c9097a.f43642n) && this.f43643o == c9097a.f43643o && AbstractC4154l.m8918a(this.f43644p, c9097a.f43644p) && AbstractC4154l.m8918a(this.f43645q, c9097a.f43645q) && AbstractC4154l.m8918a(this.f43646r, c9097a.f43646r);
    }

    public final int hashCode() {
        String str = this.f43629a;
        int iM4556c = AbstractC1452a.m4556c(this.f43630b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f43631c;
        int iM4556c2 = AbstractC1452a.m4556c(this.f43637i, AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f43635g, AbstractC1452a.m4556c(this.f43634f, AbstractC1452a.m4558e(AbstractC0030c.m113d((iM4556c + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f43632d), 31, this.f43633e), 31), 31), 31, this.f43636h), 31);
        Uri uri = this.f43638j;
        int iM4556c3 = AbstractC1452a.m4556c(this.f43643o, (Arrays.hashCode(this.f43642n) + ((this.f43641m.hashCode() + AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f43639k, (iM4556c2 + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31, this.f43640l)) * 31)) * 31, 961);
        PendingIntent pendingIntent = this.f43644p;
        int iM4559f = AbstractC1452a.m4559f(this.f43645q, (iM4556c3 + (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 31, 31);
        Integer num = this.f43646r;
        return iM4559f + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        boolean z6 = this.f43636h;
        String string = Arrays.toString(this.f43642n);
        List list = this.f43645q;
        StringBuilder sbM125p = AbstractC0030c.m125p(this.f43630b, "CallyzerNotification(channelId=", this.f43629a, ", notificationId=", ", contentText=");
        a1.m14319B(sbM125p, this.f43631c, ", titleText=", this.f43632d, ", isAutoCancel=");
        sbM125p.append(this.f43633e);
        sbM125p.append(", smallIcon=");
        sbM125p.append(this.f43634f);
        sbM125p.append(", color=");
        sbM125p.append(this.f43635g);
        sbM125p.append(", isOngoing=");
        sbM125p.append(z6);
        sbM125p.append(", priority=");
        sbM125p.append(this.f43637i);
        sbM125p.append(", sound=");
        sbM125p.append(this.f43638j);
        sbM125p.append(", defaults=");
        AbstractC1452a.m4550A(sbM125p, this.f43639k, ", category=", this.f43640l, ", style=");
        sbM125p.append(this.f43641m);
        sbM125p.append(", vibrate=");
        sbM125p.append(string);
        sbM125p.append(", visibility=");
        sbM125p.append(this.f43643o);
        sbM125p.append(", largeIcon=null, onClickIntents=");
        sbM125p.append(this.f43644p);
        sbM125p.append(", action=");
        sbM125p.append(list);
        sbM125p.append(", progressInPercentage=");
        sbM125p.append(this.f43646r);
        sbM125p.append(")");
        return sbM125p.toString();
    }

    public C9097a(String str, int i10, String str2, String str3, int i11, Uri uri, AbstractC0019r abstractC0019r, long[] jArr, PendingIntent pendingIntent, Integer num, int i12) {
        this(str, i10, str2, str3, true, 2131231076, R.color.primary, false, (i12 & 256) != 0 ? 0 : i11, (i12 & 512) != 0 ? Settings.System.DEFAULT_NOTIFICATION_URI : uri, -1, "social", (i12 & 4096) != 0 ? new C6116i() : abstractC0019r, (i12 & 8192) != 0 ? new long[]{1000, 1000, 1000, 1000, 1000} : jArr, 1, (65536 & i12) != 0 ? null : pendingIntent, C6668r.f31943a, (i12 & 262144) != 0 ? null : num);
    }
}
