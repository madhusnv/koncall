package q5;

import a1.AbstractC0019r;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import b9.AbstractC0630b;
import bg.AbstractC0656a;
import c6.AbstractC0879i;
import com.websoptimization.callyzerbiz.R;
import e1.C1904f;
import i1.AbstractC3131j;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.i18n.MessageBundle;
import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q5.k */
/* loaded from: classes.dex */
public final class C6118k {

    /* renamed from: a */
    public final Context f29830a;

    /* renamed from: e */
    public CharSequence f29834e;

    /* renamed from: f */
    public CharSequence f29835f;

    /* renamed from: g */
    public PendingIntent f29836g;

    /* renamed from: h */
    public IconCompat f29837h;

    /* renamed from: i */
    public int f29838i;

    /* renamed from: j */
    public int f29839j;

    /* renamed from: l */
    public AbstractC0019r f29841l;

    /* renamed from: m */
    public int f29842m;

    /* renamed from: n */
    public int f29843n;

    /* renamed from: o */
    public boolean f29844o;

    /* renamed from: q */
    public String f29846q;

    /* renamed from: r */
    public Bundle f29847r;

    /* renamed from: u */
    public String f29850u;

    /* renamed from: v */
    public final boolean f29851v;

    /* renamed from: w */
    public final Notification f29852w;

    /* renamed from: x */
    public final ArrayList f29853x;

    /* renamed from: b */
    public final ArrayList f29831b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f29832c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f29833d = new ArrayList();

    /* renamed from: k */
    public boolean f29840k = true;

    /* renamed from: p */
    public boolean f29845p = false;

    /* renamed from: s */
    public int f29848s = 0;

    /* renamed from: t */
    public int f29849t = 0;

    public C6118k(Context context, String str) {
        Notification notification = new Notification();
        this.f29852w = notification;
        this.f29830a = context;
        this.f29850u = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f29839j = 0;
        this.f29853x = new ArrayList();
        this.f29851v = true;
    }

    /* renamed from: b */
    public static CharSequence m12150b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final Notification m12151a() {
        Bundle bundle;
        int i10;
        ArrayList arrayList;
        int i11;
        C8090p c8090p = new C8090p();
        new ArrayList();
        c8090p.f38726d = new Bundle();
        c8090p.f38725c = this;
        Context context = this.f29830a;
        c8090p.f38723a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            c8090p.f38724b = AbstractC0656a.m1900i(context, this.f29850u);
        } else {
            c8090p.f38724b = new Notification.Builder(context);
        }
        Notification.Builder builder = (Notification.Builder) c8090p.f38724b;
        Notification notification = this.f29852w;
        Context context2 = null;
        int i12 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f29834e).setContentText(this.f29835f).setContentInfo(null).setContentIntent(this.f29836g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.f29838i).setProgress(this.f29842m, this.f29843n, this.f29844o);
        Notification.Builder builder2 = (Notification.Builder) c8090p.f38724b;
        IconCompat iconCompat = this.f29837h;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.m762f(context));
        ((Notification.Builder) c8090p.f38724b).setSubText(null).setUsesChronometer(false).setPriority(this.f29839j);
        ArrayList arrayList2 = this.f29831b;
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            C6112e c6112e = (C6112e) obj;
            int i14 = Build.VERSION.SDK_INT;
            if (c6112e.f29820b == null && (i11 = c6112e.f29823e) != 0) {
                c6112e.f29820b = IconCompat.m758b(i11);
            }
            IconCompat iconCompat2 = c6112e.f29820b;
            boolean z6 = c6112e.f29821c;
            Bundle bundle2 = c6112e.f29819a;
            Notification.Action.Builder builder3 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.m762f(context2) : context2, c6112e.f29824f, c6112e.f29825g);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z6);
            builder3.setAllowGeneratedReplies(z6);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i14 >= 28) {
                AbstractC0879i.m2412x(builder3);
            }
            if (i14 >= 29) {
                AbstractC0630b.m1801j(builder3);
            }
            if (i14 >= 31) {
                AbstractC3131j.m7518h(builder3);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", c6112e.f29822d);
            builder3.addExtras(bundle3);
            ((Notification.Builder) c8090p.f38724b).addAction(builder3.build());
            context2 = null;
        }
        Bundle bundle4 = this.f29847r;
        if (bundle4 != null) {
            ((Bundle) c8090p.f38726d).putAll(bundle4);
        }
        int i15 = Build.VERSION.SDK_INT;
        ((Notification.Builder) c8090p.f38724b).setShowWhen(this.f29840k);
        ((Notification.Builder) c8090p.f38724b).setLocalOnly(this.f29845p);
        ((Notification.Builder) c8090p.f38724b).setGroup(null);
        ((Notification.Builder) c8090p.f38724b).setSortKey(null);
        ((Notification.Builder) c8090p.f38724b).setGroupSummary(false);
        ((Notification.Builder) c8090p.f38724b).setCategory(this.f29846q);
        ((Notification.Builder) c8090p.f38724b).setColor(this.f29848s);
        ((Notification.Builder) c8090p.f38724b).setVisibility(this.f29849t);
        ((Notification.Builder) c8090p.f38724b).setPublicVersion(null);
        ((Notification.Builder) c8090p.f38724b).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = this.f29853x;
        ArrayList arrayList4 = this.f29832c;
        if (i15 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    C1904f c1904f = new C1904f(arrayList3.size() + arrayList.size());
                    c1904f.addAll(arrayList);
                    c1904f.addAll(arrayList3);
                    arrayList3 = new ArrayList(c1904f);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList3.get(i16);
                i16++;
                ((Notification.Builder) c8090p.f38724b).addPerson((String) obj2);
            }
        }
        ArrayList arrayList5 = this.f29833d;
        if (arrayList5.size() > 0) {
            if (this.f29847r == null) {
                this.f29847r = new Bundle();
            }
            Bundle bundle5 = this.f29847r.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i17 = 0;
            while (i17 < arrayList5.size()) {
                String string = Integer.toString(i17);
                C6112e c6112e2 = (C6112e) arrayList5.get(i17);
                Bundle bundle8 = new Bundle();
                if (c6112e2.f29820b == null && (i10 = c6112e2.f29823e) != 0) {
                    c6112e2.f29820b = IconCompat.m758b(i10);
                }
                IconCompat iconCompat3 = c6112e2.f29820b;
                Bundle bundle9 = c6112e2.f29819a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.m759c() : i12);
                bundle8.putCharSequence(MessageBundle.TITLE_ENTRY, c6112e2.f29824f);
                bundle8.putParcelable("actionIntent", c6112e2.f29825g);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", c6112e2.f29821c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c6112e2.f29822d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i17++;
                i12 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f29847r == null) {
                this.f29847r = new Bundle();
            }
            this.f29847r.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) c8090p.f38726d).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i18 = Build.VERSION.SDK_INT;
        ((Notification.Builder) c8090p.f38724b).setExtras(this.f29847r);
        ((Notification.Builder) c8090p.f38724b).setRemoteInputHistory(null);
        if (i18 >= 26) {
            AbstractC0656a.m1913v((Notification.Builder) c8090p.f38724b);
            AbstractC0656a.m1886B((Notification.Builder) c8090p.f38724b);
            AbstractC0656a.m1887C((Notification.Builder) c8090p.f38724b);
            AbstractC0656a.m1888D((Notification.Builder) c8090p.f38724b);
            AbstractC0656a.m1915x((Notification.Builder) c8090p.f38724b);
            if (!TextUtils.isEmpty(this.f29850u)) {
                ((Notification.Builder) c8090p.f38724b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i18 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i18 >= 29) {
            AbstractC0630b.m1799h((Notification.Builder) c8090p.f38724b, this.f29851v);
            AbstractC0630b.m1800i((Notification.Builder) c8090p.f38724b);
        }
        C6118k c6118k = (C6118k) c8090p.f38725c;
        AbstractC0019r abstractC0019r = c6118k.f29841l;
        if (abstractC0019r != null) {
            abstractC0019r.mo100a(c8090p);
        }
        Notification.Builder builder4 = (Notification.Builder) c8090p.f38724b;
        Notification notificationBuild = Build.VERSION.SDK_INT >= 26 ? builder4.build() : builder4.build();
        if (abstractC0019r != null) {
            c6118k.f29841l.getClass();
        }
        if (abstractC0019r != null && (bundle = notificationBuild.extras) != null) {
            if (abstractC0019r.f83a) {
                bundle.putCharSequence("android.summaryText", (CharSequence) abstractC0019r.f86d);
            }
            CharSequence charSequence = (CharSequence) abstractC0019r.f85c;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", abstractC0019r.mo101b());
        }
        return notificationBuild;
    }

    /* renamed from: c */
    public final void m12152c(int i10, boolean z6) {
        Notification notification = this.f29852w;
        if (z6) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    /* renamed from: d */
    public final void m12153d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f29830a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f2201k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f2203b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f29837h = iconCompat;
    }

    /* renamed from: e */
    public final void m12154e(AbstractC0019r abstractC0019r) {
        if (this.f29841l != abstractC0019r) {
            this.f29841l = abstractC0019r;
            if (abstractC0019r == null || ((C6118k) abstractC0019r.f84b) == this) {
                return;
            }
            abstractC0019r.f84b = this;
            m12154e(abstractC0019r);
        }
    }
}
