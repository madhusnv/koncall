package p001o;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class o2c {

    /* renamed from: o.o2c$b */
    public static class C15690b {

        /* renamed from: a */
        public final Bundle f37554a;

        /* renamed from: b */
        public IconCompat f37555b;

        /* renamed from: c */
        public final gie[] f37556c;

        /* renamed from: d */
        public final gie[] f37557d;

        /* renamed from: e */
        public boolean f37558e;

        /* renamed from: f */
        public boolean f37559f;

        /* renamed from: g */
        public final int f37560g;

        /* renamed from: h */
        public final boolean f37561h;

        /* renamed from: i */
        public int f37562i;

        /* renamed from: j */
        public CharSequence f37563j;

        /* renamed from: k */
        public PendingIntent f37564k;

        /* renamed from: l */
        public boolean f37565l;

        /* renamed from: o.o2c$b$a */
        public static final class a {

            /* renamed from: a */
            public final IconCompat f37566a;

            /* renamed from: b */
            public final CharSequence f37567b;

            /* renamed from: c */
            public final PendingIntent f37568c;

            /* renamed from: d */
            public boolean f37569d;

            /* renamed from: e */
            public final Bundle f37570e;

            /* renamed from: f */
            public ArrayList f37571f;

            /* renamed from: g */
            public int f37572g;

            /* renamed from: h */
            public boolean f37573h;

            /* renamed from: i */
            public boolean f37574i;

            /* renamed from: j */
            public boolean f37575j;

            public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.m5857h(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            /* renamed from: a */
            public a m41364a(gie gieVar) {
                if (this.f37571f == null) {
                    this.f37571f = new ArrayList();
                }
                if (gieVar != null) {
                    this.f37571f.add(gieVar);
                }
                return this;
            }

            /* renamed from: b */
            public C15690b m41365b() {
                m41366c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = this.f37571f;
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        gie gieVar = (gie) it.next();
                        if (gieVar.m28804k()) {
                            arrayList.add(gieVar);
                        } else {
                            arrayList2.add(gieVar);
                        }
                    }
                }
                gie[] gieVarArr = arrayList.isEmpty() ? null : (gie[]) arrayList.toArray(new gie[arrayList.size()]);
                return new C15690b(this.f37566a, this.f37567b, this.f37568c, this.f37570e, arrayList2.isEmpty() ? null : (gie[]) arrayList2.toArray(new gie[arrayList2.size()]), gieVarArr, this.f37569d, this.f37572g, this.f37573h, this.f37574i, this.f37575j);
            }

            /* renamed from: c */
            public final void m41366c() {
                if (this.f37574i && this.f37568c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, gie[] gieVarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.f37569d = true;
                this.f37573h = true;
                this.f37566a = iconCompat;
                this.f37567b = C15694f.m41396f(charSequence);
                this.f37568c = pendingIntent;
                this.f37570e = bundle;
                this.f37571f = gieVarArr == null ? null : new ArrayList(Arrays.asList(gieVarArr));
                this.f37569d = z;
                this.f37572g = i;
                this.f37573h = z2;
                this.f37574i = z3;
                this.f37575j = z4;
            }
        }

        public C15690b(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m5857h(null, "", i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent m41354a() {
            return this.f37564k;
        }

        /* renamed from: b */
        public boolean m41355b() {
            return this.f37558e;
        }

        /* renamed from: c */
        public Bundle m41356c() {
            return this.f37554a;
        }

        /* renamed from: d */
        public IconCompat m41357d() {
            int i;
            if (this.f37555b == null && (i = this.f37562i) != 0) {
                this.f37555b = IconCompat.m5857h(null, "", i);
            }
            return this.f37555b;
        }

        /* renamed from: e */
        public gie[] m41358e() {
            return this.f37556c;
        }

        /* renamed from: f */
        public int m41359f() {
            return this.f37560g;
        }

        /* renamed from: g */
        public boolean m41360g() {
            return this.f37559f;
        }

        /* renamed from: h */
        public CharSequence m41361h() {
            return this.f37563j;
        }

        /* renamed from: i */
        public boolean m41362i() {
            return this.f37565l;
        }

        /* renamed from: j */
        public boolean m41363j() {
            return this.f37561h;
        }

        public C15690b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public C15690b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, gie[] gieVarArr, gie[] gieVarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f37559f = true;
            this.f37555b = iconCompat;
            if (iconCompat != null && iconCompat.m5862l() == 2) {
                this.f37562i = iconCompat.m5860j();
            }
            this.f37563j = C15694f.m41396f(charSequence);
            this.f37564k = pendingIntent;
            this.f37554a = bundle == null ? new Bundle() : bundle;
            this.f37556c = gieVarArr;
            this.f37557d = gieVarArr2;
            this.f37558e = z;
            this.f37560g = i;
            this.f37559f = z2;
            this.f37561h = z3;
            this.f37565l = z4;
        }
    }

    /* renamed from: o.o2c$c */
    public static class C15691c extends AbstractC15698j {

        /* renamed from: e */
        public IconCompat f37576e;

        /* renamed from: f */
        public IconCompat f37577f;

        /* renamed from: g */
        public boolean f37578g;

        /* renamed from: h */
        public CharSequence f37579h;

        /* renamed from: i */
        public boolean f37580i;

        /* renamed from: o.o2c$c$a */
        public static class a {
            /* renamed from: a */
            public static void m41372a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: o.o2c$c$b */
        public static class b {
            /* renamed from: a */
            public static void m41373a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            /* renamed from: b */
            public static void m41374b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            /* renamed from: c */
            public static void m41375c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // p001o.o2c.AbstractC15698j
        /* renamed from: b */
        public void mo41367b(d2c d2cVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(d2cVar.mo22276a()).setBigContentTitle(this.f37657b);
            IconCompat iconCompat = this.f37576e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.m41373a(bigContentTitle, this.f37576e.m5869s(d2cVar instanceof s2c ? ((s2c) d2cVar).m47521f() : null));
                } else if (iconCompat.m5862l() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f37576e.m5859i());
                }
            }
            if (this.f37578g) {
                if (this.f37577f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.m41372a(bigContentTitle, this.f37577f.m5869s(d2cVar instanceof s2c ? ((s2c) d2cVar).m47521f() : null));
                }
            }
            if (this.f37659d) {
                bigContentTitle.setSummaryText(this.f37658c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.m41375c(bigContentTitle, this.f37580i);
                b.m41374b(bigContentTitle, this.f37579h);
            }
        }

        @Override // p001o.o2c.AbstractC15698j
        /* renamed from: c */
        public String mo41368c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public C15691c m41369h(Bitmap bitmap) {
            this.f37577f = bitmap == null ? null : IconCompat.m5854e(bitmap);
            this.f37578g = true;
            return this;
        }

        /* renamed from: i */
        public C15691c m41370i(Bitmap bitmap) {
            this.f37576e = bitmap == null ? null : IconCompat.m5854e(bitmap);
            return this;
        }

        /* renamed from: j */
        public C15691c m41371j(CharSequence charSequence) {
            this.f37658c = C15694f.m41396f(charSequence);
            this.f37659d = true;
            return this;
        }
    }

    /* renamed from: o.o2c$d */
    public static class C15692d extends AbstractC15698j {

        /* renamed from: e */
        public CharSequence f37581e;

        @Override // p001o.o2c.AbstractC15698j
        /* renamed from: a */
        public void mo41376a(Bundle bundle) {
            super.mo41376a(bundle);
        }

        @Override // p001o.o2c.AbstractC15698j
        /* renamed from: b */
        public void mo41367b(d2c d2cVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(d2cVar.mo22276a()).setBigContentTitle(this.f37657b).bigText(this.f37581e);
            if (this.f37659d) {
                bigTextStyleBigText.setSummaryText(this.f37658c);
            }
        }

        @Override // p001o.o2c.AbstractC15698j
        /* renamed from: c */
        public String mo41368c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public C15692d m41377h(CharSequence charSequence) {
            this.f37581e = C15694f.m41396f(charSequence);
            return this;
        }
    }

    /* renamed from: o.o2c$e */
    public static final class C15693e {

        /* renamed from: a */
        public PendingIntent f37582a;

        /* renamed from: b */
        public PendingIntent f37583b;

        /* renamed from: c */
        public IconCompat f37584c;

        /* renamed from: d */
        public int f37585d;

        /* renamed from: e */
        public int f37586e;

        /* renamed from: f */
        public int f37587f;

        /* renamed from: g */
        public String f37588g;

        /* renamed from: o.o2c$e$a */
        public static class a {
            /* renamed from: a */
            public static Notification.BubbleMetadata m41388a(C15693e c15693e) {
                if (c15693e == null || c15693e.m41384f() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(c15693e.m41383e().m5868r()).setIntent(c15693e.m41384f()).setDeleteIntent(c15693e.m41380b()).setAutoExpandBubble(c15693e.m41379a()).setSuppressNotification(c15693e.m41386h());
                if (c15693e.m41381c() != 0) {
                    suppressNotification.setDesiredHeight(c15693e.m41381c());
                }
                if (c15693e.m41382d() != 0) {
                    suppressNotification.setDesiredHeightResId(c15693e.m41382d());
                }
                return suppressNotification.build();
            }
        }

        /* renamed from: o.o2c$e$b */
        public static class b {
            /* renamed from: a */
            public static Notification.BubbleMetadata m41389a(C15693e c15693e) {
                if (c15693e == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = c15693e.m41385g() != null ? new Notification.BubbleMetadata.Builder(c15693e.m41385g()) : new Notification.BubbleMetadata.Builder(c15693e.m41384f(), c15693e.m41383e().m5868r());
                builder.setDeleteIntent(c15693e.m41380b()).setAutoExpandBubble(c15693e.m41379a()).setSuppressNotification(c15693e.m41386h());
                if (c15693e.m41381c() != 0) {
                    builder.setDesiredHeight(c15693e.m41381c());
                }
                if (c15693e.m41382d() != 0) {
                    builder.setDesiredHeightResId(c15693e.m41382d());
                }
                return builder.build();
            }
        }

        /* renamed from: o.o2c$e$c */
        public static final class c {

            /* renamed from: a */
            public PendingIntent f37589a;

            /* renamed from: b */
            public IconCompat f37590b;

            /* renamed from: c */
            public int f37591c;

            /* renamed from: d */
            public int f37592d;

            /* renamed from: e */
            public int f37593e;

            /* renamed from: f */
            public PendingIntent f37594f;

            /* renamed from: g */
            public String f37595g;

            /* renamed from: a */
            public C15693e m41390a() {
                String str = this.f37595g;
                if (str == null && this.f37589a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f37590b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                C15693e c15693e = new C15693e(this.f37589a, this.f37594f, this.f37590b, this.f37591c, this.f37592d, this.f37593e, str);
                c15693e.m41387i(this.f37593e);
                return c15693e;
            }

            /* renamed from: b */
            public c m41391b(boolean z) {
                m41393d(1, z);
                return this;
            }

            /* renamed from: c */
            public c m41392c(int i) {
                this.f37591c = Math.max(i, 0);
                this.f37592d = 0;
                return this;
            }

            /* renamed from: d */
            public final c m41393d(int i, boolean z) {
                if (z) {
                    this.f37593e = i | this.f37593e;
                } else {
                    this.f37593e = (~i) & this.f37593e;
                }
                return this;
            }

            /* renamed from: e */
            public c m41394e(IconCompat iconCompat) {
                if (this.f37595g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.f37590b = iconCompat;
                return this;
            }

            /* renamed from: f */
            public c m41395f(PendingIntent pendingIntent) {
                if (this.f37595g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.f37589a = pendingIntent;
                return this;
            }
        }

        /* renamed from: j */
        public static Notification.BubbleMetadata m41378j(C15693e c15693e) {
            if (c15693e == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return b.m41389a(c15693e);
            }
            if (i == 29) {
                return a.m41388a(c15693e);
            }
            return null;
        }

        /* renamed from: a */
        public boolean m41379a() {
            return (this.f37587f & 1) != 0;
        }

        /* renamed from: b */
        public PendingIntent m41380b() {
            return this.f37583b;
        }

        /* renamed from: c */
        public int m41381c() {
            return this.f37585d;
        }

        /* renamed from: d */
        public int m41382d() {
            return this.f37586e;
        }

        /* renamed from: e */
        public IconCompat m41383e() {
            return this.f37584c;
        }

        /* renamed from: f */
        public PendingIntent m41384f() {
            return this.f37582a;
        }

        /* renamed from: g */
        public String m41385g() {
            return this.f37588g;
        }

        /* renamed from: h */
        public boolean m41386h() {
            return (this.f37587f & 2) != 0;
        }

        /* renamed from: i */
        public void m41387i(int i) {
            this.f37587f = i;
        }

        public C15693e(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i, int i2, int i3, String str) {
            this.f37582a = pendingIntent;
            this.f37584c = iconCompat;
            this.f37585d = i;
            this.f37586e = i2;
            this.f37583b = pendingIntent2;
            this.f37587f = i3;
            this.f37588g = str;
        }
    }

    /* renamed from: o.o2c$g */
    public interface InterfaceC15695g {
        /* renamed from: a */
        C15694f mo26055a(C15694f c15694f);
    }

    /* renamed from: o.o2c$h */
    public static class C15696h extends AbstractC15698j {

        /* renamed from: e */
        public ArrayList f37644e = new ArrayList();

        @Override // p001o.o2c.AbstractC15698j
        /* renamed from: b */
        public void mo41367b(d2c d2cVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(d2cVar.mo22276a()).setBigContentTitle(this.f37657b);
            if (this.f37659d) {
                bigContentTitle.setSummaryText(this.f37658c);
            }
            Iterator it = this.f37644e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // p001o.o2c.AbstractC15698j
        /* renamed from: c */
        public String mo41368c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* renamed from: h */
        public C15696h m41437h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f37644e.add(C15694f.m41396f(charSequence));
            }
            return this;
        }

        /* renamed from: i */
        public C15696h m41438i(CharSequence charSequence) {
            this.f37657b = C15694f.m41396f(charSequence);
            return this;
        }
    }

    /* renamed from: o.o2c$i */
    public static class C15697i extends AbstractC15698j {

        /* renamed from: e */
        public final List f37645e = new ArrayList();

        /* renamed from: f */
        public final List f37646f = new ArrayList();

        /* renamed from: g */
        public k6d f37647g;

        /* renamed from: h */
        public CharSequence f37648h;

        /* renamed from: i */
        public Boolean f37649i;

        /* renamed from: o.o2c$i$a */
        public static class a {
            /* renamed from: a */
            public static Notification.MessagingStyle m41444a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            /* renamed from: b */
            public static Notification.MessagingStyle m41445b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            /* renamed from: c */
            public static Notification.MessagingStyle m41446c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* renamed from: o.o2c$i$b */
        public static class b {
            /* renamed from: a */
            public static Notification.MessagingStyle m41447a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* renamed from: o.o2c$i$c */
        public static class c {
            /* renamed from: a */
            public static Notification.MessagingStyle m41448a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            /* renamed from: b */
            public static Notification.MessagingStyle m41449b(Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }

        /* renamed from: o.o2c$i$d */
        public static final class d {

            /* renamed from: a */
            public final CharSequence f37650a;

            /* renamed from: b */
            public final long f37651b;

            /* renamed from: c */
            public final k6d f37652c;

            /* renamed from: d */
            public Bundle f37653d = new Bundle();

            /* renamed from: e */
            public String f37654e;

            /* renamed from: f */
            public Uri f37655f;

            /* renamed from: o.o2c$i$d$a */
            public static class a {
                /* renamed from: a */
                public static Notification.MessagingStyle.Message m41458a(CharSequence charSequence, long j, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
                }

                /* renamed from: b */
                public static Notification.MessagingStyle.Message m41459b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* renamed from: o.o2c$i$d$b */
            public static class b {
                /* renamed from: a */
                public static Parcelable m41460a(Person person) {
                    return person;
                }

                /* renamed from: b */
                public static Notification.MessagingStyle.Message m41461b(CharSequence charSequence, long j, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }
            }

            public d(CharSequence charSequence, long j, k6d k6dVar) {
                this.f37650a = charSequence;
                this.f37651b = j;
                this.f37652c = k6dVar;
            }

            /* renamed from: a */
            public static Bundle[] m41450a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = ((d) list.get(i)).m41457h();
                }
                return bundleArr;
            }

            /* renamed from: b */
            public String m41451b() {
                return this.f37654e;
            }

            /* renamed from: c */
            public Uri m41452c() {
                return this.f37655f;
            }

            /* renamed from: d */
            public k6d m41453d() {
                return this.f37652c;
            }

            /* renamed from: e */
            public CharSequence m41454e() {
                return this.f37650a;
            }

            /* renamed from: f */
            public long m41455f() {
                return this.f37651b;
            }

            /* renamed from: g */
            public Notification.MessagingStyle.Message m41456g() {
                Notification.MessagingStyle.Message messageM41458a;
                k6d k6dVarM41453d = m41453d();
                if (Build.VERSION.SDK_INT >= 28) {
                    messageM41458a = b.m41461b(m41454e(), m41455f(), k6dVarM41453d != null ? k6dVarM41453d.m35047h() : null);
                } else {
                    messageM41458a = a.m41458a(m41454e(), m41455f(), k6dVarM41453d != null ? k6dVarM41453d.m35042c() : null);
                }
                if (m41451b() != null) {
                    a.m41459b(messageM41458a, m41451b(), m41452c());
                }
                return messageM41458a;
            }

            /* renamed from: h */
            public final Bundle m41457h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f37650a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong(InfluenceConstants.TIME, this.f37651b);
                k6d k6dVar = this.f37652c;
                if (k6dVar != null) {
                    bundle.putCharSequence("sender", k6dVar.m35042c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.m41460a(this.f37652c.m35047h()));
                    } else {
                        bundle.putBundle("person", this.f37652c.m35048i());
                    }
                }
                String str = this.f37654e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f37655f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f37653d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        public C15697i(k6d k6dVar) {
            if (TextUtils.isEmpty(k6dVar.m35042c())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f37647g = k6dVar;
        }

        @Override // p001o.o2c.AbstractC15698j
        /* renamed from: a */
        public void mo41376a(Bundle bundle) {
            super.mo41376a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f37647g.m35042c());
            bundle.putBundle("android.messagingStyleUser", this.f37647g.m35048i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f37648h);
            if (this.f37648h != null && this.f37649i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f37648h);
            }
            if (!this.f37645e.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.m41450a(this.f37645e));
            }
            if (!this.f37646f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.m41450a(this.f37646f));
            }
            Boolean bool = this.f37649i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // p001o.o2c.AbstractC15698j
        /* renamed from: b */
        public void mo41367b(d2c d2cVar) {
            m41443l(m41441j());
            Notification.MessagingStyle messagingStyleM41448a = Build.VERSION.SDK_INT >= 28 ? c.m41448a(this.f37647g.m35047h()) : a.m41445b(this.f37647g.m35042c());
            Iterator it = this.f37645e.iterator();
            while (it.hasNext()) {
                a.m41444a(messagingStyleM41448a, ((d) it.next()).m41456g());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it2 = this.f37646f.iterator();
                while (it2.hasNext()) {
                    b.m41447a(messagingStyleM41448a, ((d) it2.next()).m41456g());
                }
            }
            if (this.f37649i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.m41446c(messagingStyleM41448a, this.f37648h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.m41449b(messagingStyleM41448a, this.f37649i.booleanValue());
            }
            messagingStyleM41448a.setBuilder(d2cVar.mo22276a());
        }

        @Override // p001o.o2c.AbstractC15698j
        /* renamed from: c */
        public String mo41368c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        /* renamed from: h */
        public C15697i m41439h(CharSequence charSequence, long j, k6d k6dVar) {
            m41440i(new d(charSequence, j, k6dVar));
            return this;
        }

        /* renamed from: i */
        public C15697i m41440i(d dVar) {
            if (dVar != null) {
                this.f37645e.add(dVar);
                if (this.f37645e.size() > 25) {
                    this.f37645e.remove(0);
                }
            }
            return this;
        }

        /* renamed from: j */
        public boolean m41441j() {
            C15694f c15694f = this.f37656a;
            if (c15694f != null && c15694f.f37618a.getApplicationInfo().targetSdkVersion < 28 && this.f37649i == null) {
                return this.f37648h != null;
            }
            Boolean bool = this.f37649i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        /* renamed from: k */
        public C15697i m41442k(CharSequence charSequence) {
            this.f37648h = charSequence;
            return this;
        }

        /* renamed from: l */
        public C15697i m41443l(boolean z) {
            this.f37649i = Boolean.valueOf(z);
            return this;
        }
    }

    /* renamed from: o.o2c$j */
    public static abstract class AbstractC15698j {

        /* renamed from: a */
        public C15694f f37656a;

        /* renamed from: b */
        public CharSequence f37657b;

        /* renamed from: c */
        public CharSequence f37658c;

        /* renamed from: d */
        public boolean f37659d = false;

        /* renamed from: a */
        public void mo41376a(Bundle bundle) {
            if (this.f37659d) {
                bundle.putCharSequence("android.summaryText", this.f37658c);
            }
            CharSequence charSequence = this.f37657b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strMo41368c = mo41368c();
            if (strMo41368c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo41368c);
            }
        }

        /* renamed from: b */
        public abstract void mo41367b(d2c d2cVar);

        /* renamed from: c */
        public String mo41368c() {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo41462d(d2c d2cVar) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews mo41463e(d2c d2cVar) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews m41464f(d2c d2cVar) {
            return null;
        }

        /* renamed from: g */
        public void m41465g(C15694f c15694f) {
            if (this.f37656a != c15694f) {
                this.f37656a = c15694f;
                if (c15694f != null) {
                    c15694f.m41401E(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m41351a(Notification notification) {
        return notification.extras;
    }

    /* renamed from: b */
    public static boolean m41352b(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    /* renamed from: c */
    public static Bitmap m41353c(Context context, Bitmap bitmap) throws Resources.NotFoundException {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(d7e.compat_notification_large_icon_max_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(d7e.compat_notification_large_icon_max_height);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
    }

    /* renamed from: o.o2c$f */
    public static class C15694f {

        /* renamed from: A */
        public boolean f37596A;

        /* renamed from: B */
        public boolean f37597B;

        /* renamed from: C */
        public String f37598C;

        /* renamed from: D */
        public Bundle f37599D;

        /* renamed from: E */
        public int f37600E;

        /* renamed from: F */
        public int f37601F;

        /* renamed from: G */
        public Notification f37602G;

        /* renamed from: H */
        public RemoteViews f37603H;

        /* renamed from: I */
        public RemoteViews f37604I;

        /* renamed from: J */
        public RemoteViews f37605J;

        /* renamed from: K */
        public String f37606K;

        /* renamed from: L */
        public int f37607L;

        /* renamed from: M */
        public String f37608M;

        /* renamed from: N */
        public long f37609N;

        /* renamed from: O */
        public int f37610O;

        /* renamed from: P */
        public int f37611P;

        /* renamed from: Q */
        public boolean f37612Q;

        /* renamed from: R */
        public C15693e f37613R;

        /* renamed from: S */
        public Notification f37614S;

        /* renamed from: T */
        public boolean f37615T;

        /* renamed from: U */
        public Object f37616U;

        /* renamed from: V */
        public ArrayList f37617V;

        /* renamed from: a */
        public Context f37618a;

        /* renamed from: b */
        public ArrayList f37619b;

        /* renamed from: c */
        public ArrayList f37620c;

        /* renamed from: d */
        public ArrayList f37621d;

        /* renamed from: e */
        public CharSequence f37622e;

        /* renamed from: f */
        public CharSequence f37623f;

        /* renamed from: g */
        public PendingIntent f37624g;

        /* renamed from: h */
        public PendingIntent f37625h;

        /* renamed from: i */
        public RemoteViews f37626i;

        /* renamed from: j */
        public IconCompat f37627j;

        /* renamed from: k */
        public CharSequence f37628k;

        /* renamed from: l */
        public int f37629l;

        /* renamed from: m */
        public int f37630m;

        /* renamed from: n */
        public boolean f37631n;

        /* renamed from: o */
        public boolean f37632o;

        /* renamed from: p */
        public AbstractC15698j f37633p;

        /* renamed from: q */
        public CharSequence f37634q;

        /* renamed from: r */
        public CharSequence f37635r;

        /* renamed from: s */
        public CharSequence[] f37636s;

        /* renamed from: t */
        public int f37637t;

        /* renamed from: u */
        public int f37638u;

        /* renamed from: v */
        public boolean f37639v;

        /* renamed from: w */
        public String f37640w;

        /* renamed from: x */
        public boolean f37641x;

        /* renamed from: y */
        public String f37642y;

        /* renamed from: z */
        public boolean f37643z;

        /* renamed from: o.o2c$f$a */
        public static class a {
            /* renamed from: a */
            public static AudioAttributes m41432a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            /* renamed from: b */
            public static AudioAttributes.Builder m41433b() {
                return new AudioAttributes.Builder();
            }

            /* renamed from: c */
            public static AudioAttributes.Builder m41434c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            /* renamed from: d */
            public static AudioAttributes.Builder m41435d(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            /* renamed from: e */
            public static AudioAttributes.Builder m41436e(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        public C15694f(Context context, String str) {
            this.f37619b = new ArrayList();
            this.f37620c = new ArrayList();
            this.f37621d = new ArrayList();
            this.f37631n = true;
            this.f37643z = false;
            this.f37600E = 0;
            this.f37601F = 0;
            this.f37607L = 0;
            this.f37610O = 0;
            this.f37611P = 0;
            Notification notification = new Notification();
            this.f37614S = notification;
            this.f37618a = context;
            this.f37606K = str;
            notification.when = System.currentTimeMillis();
            this.f37614S.audioStreamType = -1;
            this.f37630m = 0;
            this.f37617V = new ArrayList();
            this.f37612Q = true;
        }

        /* renamed from: f */
        public static CharSequence m41396f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: A */
        public C15694f m41397A(String str) {
            this.f37608M = str;
            return this;
        }

        /* renamed from: B */
        public C15694f m41398B(boolean z) {
            this.f37631n = z;
            return this;
        }

        /* renamed from: C */
        public C15694f m41399C(int i) {
            this.f37614S.icon = i;
            return this;
        }

        /* renamed from: D */
        public C15694f m41400D(Uri uri) {
            Notification notification = this.f37614S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderM41436e = a.m41436e(a.m41434c(a.m41433b(), 4), 5);
            this.f37614S.audioAttributes = a.m41432a(builderM41436e);
            return this;
        }

        /* renamed from: E */
        public C15694f m41401E(AbstractC15698j abstractC15698j) {
            if (this.f37633p != abstractC15698j) {
                this.f37633p = abstractC15698j;
                if (abstractC15698j != null) {
                    abstractC15698j.m41465g(this);
                }
            }
            return this;
        }

        /* renamed from: F */
        public C15694f m41402F(CharSequence charSequence) {
            this.f37614S.tickerText = m41396f(charSequence);
            return this;
        }

        /* renamed from: G */
        public C15694f m41403G(long j) {
            this.f37609N = j;
            return this;
        }

        /* renamed from: H */
        public C15694f m41404H(long[] jArr) {
            this.f37614S.vibrate = jArr;
            return this;
        }

        /* renamed from: I */
        public C15694f m41405I(int i) {
            this.f37601F = i;
            return this;
        }

        /* renamed from: J */
        public C15694f m41406J(long j) {
            this.f37614S.when = j;
            return this;
        }

        /* renamed from: a */
        public C15694f m41407a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f37619b.add(new C15690b(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public C15694f m41408b(C15690b c15690b) {
            if (c15690b != null) {
                this.f37619b.add(c15690b);
            }
            return this;
        }

        /* renamed from: c */
        public Notification m41409c() {
            return new s2c(this).m47519c();
        }

        /* renamed from: d */
        public C15694f m41410d(InterfaceC15695g interfaceC15695g) {
            interfaceC15695g.mo26055a(this);
            return this;
        }

        /* renamed from: e */
        public Bundle m41411e() {
            if (this.f37599D == null) {
                this.f37599D = new Bundle();
            }
            return this.f37599D;
        }

        /* renamed from: g */
        public C15694f m41412g(boolean z) {
            m41421p(16, z);
            return this;
        }

        /* renamed from: h */
        public C15694f m41413h(String str) {
            this.f37606K = str;
            return this;
        }

        /* renamed from: i */
        public C15694f m41414i(int i) {
            this.f37600E = i;
            return this;
        }

        /* renamed from: j */
        public C15694f m41415j(RemoteViews remoteViews) {
            this.f37614S.contentView = remoteViews;
            return this;
        }

        /* renamed from: k */
        public C15694f m41416k(PendingIntent pendingIntent) {
            this.f37624g = pendingIntent;
            return this;
        }

        /* renamed from: l */
        public C15694f m41417l(CharSequence charSequence) {
            this.f37623f = m41396f(charSequence);
            return this;
        }

        /* renamed from: m */
        public C15694f m41418m(CharSequence charSequence) {
            this.f37622e = m41396f(charSequence);
            return this;
        }

        /* renamed from: n */
        public C15694f m41419n(int i) {
            Notification notification = this.f37614S;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: o */
        public C15694f m41420o(PendingIntent pendingIntent) {
            this.f37614S.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: p */
        public final void m41421p(int i, boolean z) {
            if (z) {
                Notification notification = this.f37614S;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.f37614S;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        /* renamed from: q */
        public C15694f m41422q(String str) {
            this.f37640w = str;
            return this;
        }

        /* renamed from: r */
        public C15694f m41423r(int i) {
            this.f37610O = i;
            return this;
        }

        /* renamed from: s */
        public C15694f m41424s(boolean z) {
            this.f37641x = z;
            return this;
        }

        /* renamed from: t */
        public C15694f m41425t(Bitmap bitmap) {
            this.f37627j = bitmap == null ? null : IconCompat.m5854e(o2c.m41353c(this.f37618a, bitmap));
            return this;
        }

        /* renamed from: u */
        public C15694f m41426u(int i, int i2, int i3) {
            Notification notification = this.f37614S;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        /* renamed from: v */
        public C15694f m41427v(boolean z) {
            this.f37643z = z;
            return this;
        }

        /* renamed from: w */
        public C15694f m41428w(int i) {
            this.f37629l = i;
            return this;
        }

        /* renamed from: x */
        public C15694f m41429x(boolean z) {
            m41421p(2, z);
            return this;
        }

        /* renamed from: y */
        public C15694f m41430y(boolean z) {
            m41421p(8, z);
            return this;
        }

        /* renamed from: z */
        public C15694f m41431z(int i) {
            this.f37630m = i;
            return this;
        }

        public C15694f(Context context) {
            this(context, null);
        }
    }
}
