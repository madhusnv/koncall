package p001o;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.o2c;

/* loaded from: classes2.dex */
public class s2c implements d2c {

    /* renamed from: a */
    public final Context f44598a;

    /* renamed from: b */
    public final Notification.Builder f44599b;

    /* renamed from: c */
    public final o2c.C15694f f44600c;

    /* renamed from: d */
    public RemoteViews f44601d;

    /* renamed from: e */
    public RemoteViews f44602e;

    /* renamed from: f */
    public final List f44603f = new ArrayList();

    /* renamed from: g */
    public final Bundle f44604g = new Bundle();

    /* renamed from: h */
    public int f44605h;

    /* renamed from: i */
    public RemoteViews f44606i;

    /* renamed from: o.s2c$a */
    public static class C16727a {
        /* renamed from: a */
        public static Notification.Builder m47523a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        /* renamed from: b */
        public static Notification.Action.Builder m47524b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        /* renamed from: c */
        public static Notification.Action.Builder m47525c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        /* renamed from: d */
        public static Notification.Action m47526d(Notification.Action.Builder builder) {
            return builder.build();
        }

        /* renamed from: e */
        public static Notification.Action.Builder m47527e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        /* renamed from: f */
        public static String m47528f(Notification notification) {
            return notification.getGroup();
        }

        /* renamed from: g */
        public static Notification.Builder m47529g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        /* renamed from: h */
        public static Notification.Builder m47530h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        /* renamed from: i */
        public static Notification.Builder m47531i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        /* renamed from: j */
        public static Notification.Builder m47532j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* renamed from: o.s2c$b */
    public static class C16728b {
        /* renamed from: a */
        public static Notification.Builder m47533a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        /* renamed from: b */
        public static Notification.Builder m47534b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        /* renamed from: c */
        public static Notification.Builder m47535c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        /* renamed from: d */
        public static Notification.Builder m47536d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        /* renamed from: e */
        public static Notification.Builder m47537e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        /* renamed from: f */
        public static Notification.Builder m47538f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* renamed from: o.s2c$c */
    public static class C16729c {
        /* renamed from: a */
        public static Notification.Action.Builder m47539a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        /* renamed from: b */
        public static Notification.Builder m47540b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        /* renamed from: c */
        public static Notification.Builder m47541c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* renamed from: o.s2c$d */
    public static class C16730d {
        /* renamed from: a */
        public static Notification.Action.Builder m47542a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        /* renamed from: b */
        public static Notification.Builder m47543b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        /* renamed from: c */
        public static Notification.Builder m47544c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        /* renamed from: d */
        public static Notification.Builder m47545d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        /* renamed from: e */
        public static Notification.Builder m47546e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* renamed from: o.s2c$e */
    public static class C16731e {
        /* renamed from: a */
        public static Notification.Builder m47547a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        /* renamed from: b */
        public static Notification.Builder m47548b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        /* renamed from: c */
        public static Notification.Builder m47549c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        /* renamed from: d */
        public static Notification.Builder m47550d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        /* renamed from: e */
        public static Notification.Builder m47551e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        /* renamed from: f */
        public static Notification.Builder m47552f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        /* renamed from: g */
        public static Notification.Builder m47553g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* renamed from: o.s2c$f */
    public static class C16732f {
        /* renamed from: a */
        public static Notification.Builder m47554a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        /* renamed from: b */
        public static Notification.Action.Builder m47555b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* renamed from: o.s2c$g */
    public static class C16733g {
        /* renamed from: a */
        public static Notification.Builder m47556a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        /* renamed from: b */
        public static Notification.Builder m47557b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        /* renamed from: c */
        public static Notification.Action.Builder m47558c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        /* renamed from: d */
        public static Notification.Builder m47559d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* renamed from: o.s2c$h */
    public static class C16734h {
        /* renamed from: a */
        public static Notification.Action.Builder m47560a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        /* renamed from: b */
        public static Notification.Builder m47561b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public s2c(o2c.C15694f c15694f) {
        int i;
        this.f44600c = c15694f;
        Context context = c15694f.f37618a;
        this.f44598a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f44599b = C16731e.m47547a(context, c15694f.f37606K);
        } else {
            this.f44599b = new Notification.Builder(c15694f.f37618a);
        }
        Notification notification = c15694f.f37614S;
        this.f44599b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, c15694f.f37626i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c15694f.f37622e).setContentText(c15694f.f37623f).setContentInfo(c15694f.f37628k).setContentIntent(c15694f.f37624g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c15694f.f37625h, (notification.flags & 128) != 0).setNumber(c15694f.f37629l).setProgress(c15694f.f37637t, c15694f.f37638u, c15694f.f37639v);
        Notification.Builder builder = this.f44599b;
        IconCompat iconCompat = c15694f.f37627j;
        C16729c.m47540b(builder, iconCompat == null ? null : iconCompat.m5869s(context));
        this.f44599b.setSubText(c15694f.f37634q).setUsesChronometer(c15694f.f37632o).setPriority(c15694f.f37630m);
        Iterator it = c15694f.f37619b.iterator();
        while (it.hasNext()) {
            m47518b((o2c.C15690b) it.next());
        }
        Bundle bundle = c15694f.f37599D;
        if (bundle != null) {
            this.f44604g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f44601d = c15694f.f37603H;
        this.f44602e = c15694f.f37604I;
        this.f44599b.setShowWhen(c15694f.f37631n);
        C16727a.m47531i(this.f44599b, c15694f.f37643z);
        C16727a.m47529g(this.f44599b, c15694f.f37640w);
        C16727a.m47532j(this.f44599b, c15694f.f37642y);
        C16727a.m47530h(this.f44599b, c15694f.f37641x);
        this.f44605h = c15694f.f37610O;
        C16728b.m47534b(this.f44599b, c15694f.f37598C);
        C16728b.m47535c(this.f44599b, c15694f.f37600E);
        C16728b.m47538f(this.f44599b, c15694f.f37601F);
        C16728b.m47536d(this.f44599b, c15694f.f37602G);
        C16728b.m47537e(this.f44599b, notification.sound, notification.audioAttributes);
        List listM47516e = i2 < 28 ? m47516e(m47517g(c15694f.f37620c), c15694f.f37617V) : c15694f.f37617V;
        if (listM47516e != null && !listM47516e.isEmpty()) {
            Iterator it2 = listM47516e.iterator();
            while (it2.hasNext()) {
                C16728b.m47533a(this.f44599b, (String) it2.next());
            }
        }
        this.f44606i = c15694f.f37605J;
        if (c15694f.f37621d.size() > 0) {
            Bundle bundle2 = c15694f.m41411e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < c15694f.f37621d.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), t2c.m49200a((o2c.C15690b) c15694f.f37621d.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            c15694f.m41411e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f44604g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = c15694f.f37616U;
        if (obj != null) {
            C16729c.m47541c(this.f44599b, obj);
        }
        this.f44599b.setExtras(c15694f.f37599D);
        C16730d.m47546e(this.f44599b, c15694f.f37636s);
        RemoteViews remoteViews = c15694f.f37603H;
        if (remoteViews != null) {
            C16730d.m47544c(this.f44599b, remoteViews);
        }
        RemoteViews remoteViews2 = c15694f.f37604I;
        if (remoteViews2 != null) {
            C16730d.m47543b(this.f44599b, remoteViews2);
        }
        RemoteViews remoteViews3 = c15694f.f37605J;
        if (remoteViews3 != null) {
            C16730d.m47545d(this.f44599b, remoteViews3);
        }
        if (i4 >= 26) {
            C16731e.m47548b(this.f44599b, c15694f.f37607L);
            C16731e.m47551e(this.f44599b, c15694f.f37635r);
            C16731e.m47552f(this.f44599b, c15694f.f37608M);
            C16731e.m47553g(this.f44599b, c15694f.f37609N);
            C16731e.m47550d(this.f44599b, c15694f.f37610O);
            if (c15694f.f37597B) {
                C16731e.m47549c(this.f44599b, c15694f.f37596A);
            }
            if (!TextUtils.isEmpty(c15694f.f37606K)) {
                this.f44599b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator it3 = c15694f.f37620c.iterator();
            while (it3.hasNext()) {
                C16732f.m47554a(this.f44599b, ((k6d) it3.next()).m35047h());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            C16733g.m47556a(this.f44599b, c15694f.f37612Q);
            C16733g.m47557b(this.f44599b, o2c.C15693e.m41378j(c15694f.f37613R));
        }
        if (i5 >= 31 && (i = c15694f.f37611P) != 0) {
            C16734h.m47561b(this.f44599b, i);
        }
        if (c15694f.f37615T) {
            if (this.f44600c.f37641x) {
                this.f44605h = 2;
            } else {
                this.f44605h = 1;
            }
            this.f44599b.setVibrate(null);
            this.f44599b.setSound(null);
            int i6 = notification.defaults & (-2) & (-3);
            notification.defaults = i6;
            this.f44599b.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f44600c.f37640w)) {
                    C16727a.m47529g(this.f44599b, "silent");
                }
                C16731e.m47550d(this.f44599b, this.f44605h);
            }
        }
    }

    /* renamed from: e */
    public static List m47516e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ap0 ap0Var = new ap0(list.size() + list2.size());
        ap0Var.addAll(list);
        ap0Var.addAll(list2);
        return new ArrayList(ap0Var);
    }

    /* renamed from: g */
    public static List m47517g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k6d) it.next()).m35046g());
        }
        return arrayList;
    }

    @Override // p001o.d2c
    /* renamed from: a */
    public Notification.Builder mo22276a() {
        return this.f44599b;
    }

    /* renamed from: b */
    public final void m47518b(o2c.C15690b c15690b) {
        IconCompat iconCompatM41357d = c15690b.m41357d();
        Notification.Action.Builder builderM47539a = C16729c.m47539a(iconCompatM41357d != null ? iconCompatM41357d.m5868r() : null, c15690b.m41361h(), c15690b.m41354a());
        if (c15690b.m41358e() != null) {
            for (RemoteInput remoteInput : gie.m28795b(c15690b.m41358e())) {
                C16727a.m47525c(builderM47539a, remoteInput);
            }
        }
        Bundle bundle = c15690b.m41356c() != null ? new Bundle(c15690b.m41356c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", c15690b.m41355b());
        int i = Build.VERSION.SDK_INT;
        C16730d.m47542a(builderM47539a, c15690b.m41355b());
        bundle.putInt("android.support.action.semanticAction", c15690b.m41359f());
        if (i >= 28) {
            C16732f.m47555b(builderM47539a, c15690b.m41359f());
        }
        if (i >= 29) {
            C16733g.m47558c(builderM47539a, c15690b.m41363j());
        }
        if (i >= 31) {
            C16734h.m47560a(builderM47539a, c15690b.m41362i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c15690b.m41360g());
        C16727a.m47524b(builderM47539a, bundle);
        C16727a.m47523a(this.f44599b, C16727a.m47526d(builderM47539a));
    }

    /* renamed from: c */
    public Notification m47519c() {
        Bundle bundleM41351a;
        RemoteViews remoteViewsM41464f;
        RemoteViews remoteViewsMo41462d;
        o2c.AbstractC15698j abstractC15698j = this.f44600c.f37633p;
        if (abstractC15698j != null) {
            abstractC15698j.mo41367b(this);
        }
        RemoteViews remoteViewsMo41463e = abstractC15698j != null ? abstractC15698j.mo41463e(this) : null;
        Notification notificationM47520d = m47520d();
        if (remoteViewsMo41463e != null) {
            notificationM47520d.contentView = remoteViewsMo41463e;
        } else {
            RemoteViews remoteViews = this.f44600c.f37603H;
            if (remoteViews != null) {
                notificationM47520d.contentView = remoteViews;
            }
        }
        if (abstractC15698j != null && (remoteViewsMo41462d = abstractC15698j.mo41462d(this)) != null) {
            notificationM47520d.bigContentView = remoteViewsMo41462d;
        }
        if (abstractC15698j != null && (remoteViewsM41464f = this.f44600c.f37633p.m41464f(this)) != null) {
            notificationM47520d.headsUpContentView = remoteViewsM41464f;
        }
        if (abstractC15698j != null && (bundleM41351a = o2c.m41351a(notificationM47520d)) != null) {
            abstractC15698j.mo41376a(bundleM41351a);
        }
        return notificationM47520d;
    }

    /* renamed from: d */
    public Notification m47520d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f44599b.build();
        }
        Notification notificationBuild = this.f44599b.build();
        if (this.f44605h != 0) {
            if (C16727a.m47528f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f44605h == 2) {
                m47522h(notificationBuild);
            }
            if (C16727a.m47528f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f44605h == 1) {
                m47522h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    /* renamed from: f */
    public Context m47521f() {
        return this.f44598a;
    }

    /* renamed from: h */
    public final void m47522h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }
}
