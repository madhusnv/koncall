package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C1729a();

    /* renamed from: a */
    public final int f5204a;

    /* renamed from: b */
    public final long f5205b;

    /* renamed from: c */
    public final long f5206c;

    /* renamed from: d */
    public final float f5207d;

    /* renamed from: e */
    public final long f5208e;

    /* renamed from: f */
    public final int f5209f;

    /* renamed from: g */
    public final CharSequence f5210g;

    /* renamed from: h */
    public final long f5211h;

    /* renamed from: q */
    public List f5212q;

    /* renamed from: s */
    public final long f5213s;

    /* renamed from: x */
    public final Bundle f5214x;

    /* renamed from: y */
    public PlaybackState f5215y;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public class C1729a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public static class C1730b {
        /* renamed from: a */
        public static void m3662a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        /* renamed from: b */
        public static PlaybackState.CustomAction m3663b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        /* renamed from: c */
        public static PlaybackState m3664c(PlaybackState.Builder builder) {
            return builder.build();
        }

        /* renamed from: d */
        public static PlaybackState.Builder m3665d() {
            return new PlaybackState.Builder();
        }

        /* renamed from: e */
        public static PlaybackState.CustomAction.Builder m3666e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        /* renamed from: f */
        public static String m3667f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        /* renamed from: g */
        public static long m3668g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        /* renamed from: h */
        public static long m3669h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        /* renamed from: i */
        public static long m3670i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        /* renamed from: j */
        public static List<PlaybackState.CustomAction> m3671j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        /* renamed from: k */
        public static CharSequence m3672k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        /* renamed from: l */
        public static Bundle m3673l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        /* renamed from: m */
        public static int m3674m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        /* renamed from: n */
        public static long m3675n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        /* renamed from: o */
        public static CharSequence m3676o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        /* renamed from: p */
        public static float m3677p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        /* renamed from: q */
        public static long m3678q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        /* renamed from: r */
        public static int m3679r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        /* renamed from: s */
        public static void m3680s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        /* renamed from: t */
        public static void m3681t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        /* renamed from: u */
        public static void m3682u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        /* renamed from: v */
        public static void m3683v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        /* renamed from: w */
        public static void m3684w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* renamed from: x */
        public static void m3685x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    public static class C1731c {
        /* renamed from: a */
        public static Bundle m3686a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        /* renamed from: b */
        public static void m3687b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List list, long j5, Bundle bundle) {
        this.f5204a = i;
        this.f5205b = j;
        this.f5206c = j2;
        this.f5207d = f;
        this.f5208e = j3;
        this.f5209f = i2;
        this.f5210g = charSequence;
        this.f5211h = j4;
        this.f5212q = new ArrayList(list);
        this.f5213s = j5;
        this.f5214x = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m3648a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> listM3671j = C1730b.m3671j(playbackState);
        if (listM3671j != null) {
            arrayList = new ArrayList(listM3671j.size());
            Iterator<PlaybackState.CustomAction> it = listM3671j.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.m3655a(it.next()));
            }
        }
        Bundle bundleM3686a = C1731c.m3686a(playbackState);
        MediaSessionCompat.m3559a(bundleM3686a);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C1730b.m3679r(playbackState), C1730b.m3678q(playbackState), C1730b.m3670i(playbackState), C1730b.m3677p(playbackState), C1730b.m3668g(playbackState), 0, C1730b.m3672k(playbackState), C1730b.m3675n(playbackState), arrayList, C1730b.m3669h(playbackState), bundleM3686a);
        playbackStateCompat.f5215y = playbackState;
        return playbackStateCompat;
    }

    /* renamed from: b */
    public long m3649b() {
        return this.f5208e;
    }

    /* renamed from: c */
    public long m3650c() {
        return this.f5211h;
    }

    /* renamed from: d */
    public float m3651d() {
        return this.f5207d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Object m3652e() {
        if (this.f5215y == null) {
            PlaybackState.Builder builderM3665d = C1730b.m3665d();
            C1730b.m3685x(builderM3665d, this.f5204a, this.f5205b, this.f5207d, this.f5211h);
            C1730b.m3682u(builderM3665d, this.f5206c);
            C1730b.m3680s(builderM3665d, this.f5208e);
            C1730b.m3683v(builderM3665d, this.f5210g);
            Iterator it = this.f5212q.iterator();
            while (it.hasNext()) {
                C1730b.m3662a(builderM3665d, (PlaybackState.CustomAction) ((CustomAction) it.next()).m3656b());
            }
            C1730b.m3681t(builderM3665d, this.f5213s);
            C1731c.m3687b(builderM3665d, this.f5214x);
            this.f5215y = C1730b.m3664c(builderM3665d);
        }
        return this.f5215y;
    }

    /* renamed from: f */
    public long m3653f() {
        return this.f5205b;
    }

    /* renamed from: g */
    public int m3654g() {
        return this.f5204a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f5204a + ", position=" + this.f5205b + ", buffered position=" + this.f5206c + ", speed=" + this.f5207d + ", updated=" + this.f5211h + ", actions=" + this.f5208e + ", error code=" + this.f5209f + ", error message=" + this.f5210g + ", custom actions=" + this.f5212q + ", active item id=" + this.f5213s + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5204a);
        parcel.writeLong(this.f5205b);
        parcel.writeFloat(this.f5207d);
        parcel.writeLong(this.f5211h);
        parcel.writeLong(this.f5206c);
        parcel.writeLong(this.f5208e);
        TextUtils.writeToParcel(this.f5210g, parcel, i);
        parcel.writeTypedList(this.f5212q);
        parcel.writeLong(this.f5213s);
        parcel.writeBundle(this.f5214x);
        parcel.writeInt(this.f5209f);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$d */
    public static final class C1732d {

        /* renamed from: a */
        public final List f5225a;

        /* renamed from: b */
        public int f5226b;

        /* renamed from: c */
        public long f5227c;

        /* renamed from: d */
        public long f5228d;

        /* renamed from: e */
        public float f5229e;

        /* renamed from: f */
        public long f5230f;

        /* renamed from: g */
        public int f5231g;

        /* renamed from: h */
        public CharSequence f5232h;

        /* renamed from: i */
        public long f5233i;

        /* renamed from: j */
        public long f5234j;

        /* renamed from: k */
        public Bundle f5235k;

        public C1732d() {
            this.f5225a = new ArrayList();
            this.f5234j = -1L;
        }

        /* renamed from: a */
        public C1732d m3688a(CustomAction customAction) {
            if (customAction == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
            }
            this.f5225a.add(customAction);
            return this;
        }

        /* renamed from: b */
        public PlaybackStateCompat m3689b() {
            return new PlaybackStateCompat(this.f5226b, this.f5227c, this.f5228d, this.f5229e, this.f5230f, this.f5231g, this.f5232h, this.f5233i, this.f5225a, this.f5234j, this.f5235k);
        }

        /* renamed from: c */
        public C1732d m3690c(long j) {
            this.f5230f = j;
            return this;
        }

        /* renamed from: d */
        public C1732d m3691d(int i, long j, float f) {
            return m3692e(i, j, f, SystemClock.elapsedRealtime());
        }

        /* renamed from: e */
        public C1732d m3692e(int i, long j, float f, long j2) {
            this.f5226b = i;
            this.f5227c = j;
            this.f5233i = j2;
            this.f5229e = f;
            return this;
        }

        public C1732d(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f5225a = arrayList;
            this.f5234j = -1L;
            this.f5226b = playbackStateCompat.f5204a;
            this.f5227c = playbackStateCompat.f5205b;
            this.f5229e = playbackStateCompat.f5207d;
            this.f5233i = playbackStateCompat.f5211h;
            this.f5228d = playbackStateCompat.f5206c;
            this.f5230f = playbackStateCompat.f5208e;
            this.f5231g = playbackStateCompat.f5209f;
            this.f5232h = playbackStateCompat.f5210g;
            List list = playbackStateCompat.f5212q;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f5234j = playbackStateCompat.f5213s;
            this.f5235k = playbackStateCompat.f5214x;
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C1727a();

        /* renamed from: a */
        public final String f5216a;

        /* renamed from: b */
        public final CharSequence f5217b;

        /* renamed from: c */
        public final int f5218c;

        /* renamed from: d */
        public final Bundle f5219d;

        /* renamed from: e */
        public PlaybackState.CustomAction f5220e;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public class C1727a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$b */
        public static final class C1728b {

            /* renamed from: a */
            public final String f5221a;

            /* renamed from: b */
            public final CharSequence f5222b;

            /* renamed from: c */
            public final int f5223c;

            /* renamed from: d */
            public Bundle f5224d;

            public C1728b(String str, CharSequence charSequence, int i) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f5221a = str;
                this.f5222b = charSequence;
                this.f5223c = i;
            }

            /* renamed from: a */
            public CustomAction m3659a() {
                return new CustomAction(this.f5221a, this.f5222b, this.f5223c, this.f5224d);
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f5216a = str;
            this.f5217b = charSequence;
            this.f5218c = i;
            this.f5219d = bundle;
        }

        /* renamed from: a */
        public static CustomAction m3655a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle bundleM3673l = C1730b.m3673l(customAction);
            MediaSessionCompat.m3559a(bundleM3673l);
            CustomAction customAction2 = new CustomAction(C1730b.m3667f(customAction), C1730b.m3676o(customAction), C1730b.m3674m(customAction), bundleM3673l);
            customAction2.f5220e = customAction;
            return customAction2;
        }

        /* renamed from: b */
        public Object m3656b() {
            PlaybackState.CustomAction customAction = this.f5220e;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builderM3666e = C1730b.m3666e(this.f5216a, this.f5217b, this.f5218c);
            C1730b.m3684w(builderM3666e, this.f5219d);
            return C1730b.m3663b(builderM3666e);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f5217b) + ", mIcon=" + this.f5218c + ", mExtras=" + this.f5219d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5216a);
            TextUtils.writeToParcel(this.f5217b, parcel, i);
            parcel.writeInt(this.f5218c);
            parcel.writeBundle(this.f5219d);
        }

        public CustomAction(Parcel parcel) {
            this.f5216a = parcel.readString();
            this.f5217b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f5218c = parcel.readInt();
            this.f5219d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f5204a = parcel.readInt();
        this.f5205b = parcel.readLong();
        this.f5207d = parcel.readFloat();
        this.f5211h = parcel.readLong();
        this.f5206c = parcel.readLong();
        this.f5208e = parcel.readLong();
        this.f5210g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5212q = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f5213s = parcel.readLong();
        this.f5214x = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f5209f = parcel.readInt();
    }
}
