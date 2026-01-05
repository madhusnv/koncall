package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.mediarouter.media.c */
/* loaded from: classes2.dex */
public final class C2315c {

    /* renamed from: a */
    public final Bundle f9179a;

    /* renamed from: b */
    public List f9180b;

    /* renamed from: c */
    public List f9181c;

    public C2315c(Bundle bundle) {
        this.f9179a = bundle;
    }

    /* renamed from: e */
    public static C2315c m8135e(Bundle bundle) {
        if (bundle != null) {
            return new C2315c(bundle);
        }
        return null;
    }

    /* renamed from: a */
    public Bundle m8136a() {
        return this.f9179a;
    }

    /* renamed from: b */
    public boolean m8137b() {
        return this.f9179a.getBoolean("canDisconnect", false);
    }

    /* renamed from: c */
    public void m8138c() {
        if (this.f9181c == null) {
            ArrayList parcelableArrayList = this.f9179a.getParcelableArrayList("controlFilters");
            this.f9181c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.f9181c = Collections.emptyList();
            }
        }
    }

    /* renamed from: d */
    public void m8139d() {
        if (this.f9180b == null) {
            ArrayList<String> stringArrayList = this.f9179a.getStringArrayList("groupMemberIds");
            this.f9180b = stringArrayList;
            if (stringArrayList == null) {
                this.f9180b = Collections.emptyList();
            }
        }
    }

    /* renamed from: f */
    public int m8140f() {
        return this.f9179a.getInt("connectionState", 0);
    }

    /* renamed from: g */
    public List m8141g() {
        m8138c();
        return this.f9181c;
    }

    /* renamed from: h */
    public String m8142h() {
        return this.f9179a.getString("status");
    }

    /* renamed from: i */
    public int m8143i() {
        return this.f9179a.getInt("deviceType");
    }

    /* renamed from: j */
    public Bundle m8144j() {
        return this.f9179a.getBundle("extras");
    }

    /* renamed from: k */
    public List m8145k() {
        m8139d();
        return this.f9180b;
    }

    /* renamed from: l */
    public Uri m8146l() {
        String string = this.f9179a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    /* renamed from: m */
    public String m8147m() {
        return this.f9179a.getString(OutcomeConstants.OUTCOME_ID);
    }

    /* renamed from: n */
    public int m8148n() {
        return this.f9179a.getInt("maxClientVersion", Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: o */
    public int m8149o() {
        return this.f9179a.getInt("minClientVersion", 1);
    }

    /* renamed from: p */
    public String m8150p() {
        return this.f9179a.getString("name");
    }

    /* renamed from: q */
    public int m8151q() {
        return this.f9179a.getInt("playbackStream", -1);
    }

    /* renamed from: r */
    public int m8152r() {
        return this.f9179a.getInt("playbackType", 1);
    }

    /* renamed from: s */
    public int m8153s() {
        return this.f9179a.getInt("presentationDisplayId", -1);
    }

    /* renamed from: t */
    public IntentSender m8154t() {
        return (IntentSender) this.f9179a.getParcelable("settingsIntent");
    }

    public String toString() {
        return "MediaRouteDescriptor{ id=" + m8147m() + ", groupMemberIds=" + m8145k() + ", name=" + m8150p() + ", description=" + m8142h() + ", iconUri=" + m8146l() + ", isEnabled=" + m8158x() + ", connectionState=" + m8140f() + ", controlFilters=" + Arrays.toString(m8141g().toArray()) + ", playbackType=" + m8152r() + ", playbackStream=" + m8151q() + ", deviceType=" + m8143i() + ", volume=" + m8155u() + ", volumeMax=" + m8157w() + ", volumeHandling=" + m8156v() + ", presentationDisplayId=" + m8153s() + ", extras=" + m8144j() + ", isValid=" + m8159y() + ", minClientVersion=" + m8149o() + ", maxClientVersion=" + m8148n() + " }";
    }

    /* renamed from: u */
    public int m8155u() {
        return this.f9179a.getInt("volume");
    }

    /* renamed from: v */
    public int m8156v() {
        return this.f9179a.getInt("volumeHandling", 0);
    }

    /* renamed from: w */
    public int m8157w() {
        return this.f9179a.getInt("volumeMax");
    }

    /* renamed from: x */
    public boolean m8158x() {
        return this.f9179a.getBoolean("enabled", true);
    }

    /* renamed from: y */
    public boolean m8159y() {
        m8138c();
        return (TextUtils.isEmpty(m8147m()) || TextUtils.isEmpty(m8150p()) || this.f9181c.contains(null)) ? false : true;
    }

    /* renamed from: androidx.mediarouter.media.c$a */
    public static final class a {

        /* renamed from: a */
        public final Bundle f9182a;

        /* renamed from: b */
        public ArrayList f9183b;

        /* renamed from: c */
        public ArrayList f9184c;

        public a(String str, String str2) {
            this.f9182a = new Bundle();
            m8172m(str);
            m8173n(str2);
        }

        /* renamed from: a */
        public a m8160a(IntentFilter intentFilter) {
            if (intentFilter == null) {
                throw new IllegalArgumentException("filter must not be null");
            }
            if (this.f9184c == null) {
                this.f9184c = new ArrayList();
            }
            if (!this.f9184c.contains(intentFilter)) {
                this.f9184c.add(intentFilter);
            }
            return this;
        }

        /* renamed from: b */
        public a m8161b(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    IntentFilter intentFilter = (IntentFilter) it.next();
                    if (intentFilter != null) {
                        m8160a(intentFilter);
                    }
                }
            }
            return this;
        }

        /* renamed from: c */
        public a m8162c(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("groupMemberId must not be empty");
            }
            if (this.f9183b == null) {
                this.f9183b = new ArrayList();
            }
            if (!this.f9183b.contains(str)) {
                this.f9183b.add(str);
            }
            return this;
        }

        /* renamed from: d */
        public a m8163d(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("groupMemberIds must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    m8162c((String) it.next());
                }
            }
            return this;
        }

        /* renamed from: e */
        public C2315c m8164e() {
            ArrayList<? extends Parcelable> arrayList = this.f9184c;
            if (arrayList != null) {
                this.f9182a.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.f9183b;
            if (arrayList2 != null) {
                this.f9182a.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new C2315c(this.f9182a);
        }

        /* renamed from: f */
        public a m8165f(boolean z) {
            this.f9182a.putBoolean("canDisconnect", z);
            return this;
        }

        /* renamed from: g */
        public a m8166g(int i) {
            this.f9182a.putInt("connectionState", i);
            return this;
        }

        /* renamed from: h */
        public a m8167h(String str) {
            this.f9182a.putString("status", str);
            return this;
        }

        /* renamed from: i */
        public a m8168i(int i) {
            this.f9182a.putInt("deviceType", i);
            return this;
        }

        /* renamed from: j */
        public a m8169j(boolean z) {
            this.f9182a.putBoolean("enabled", z);
            return this;
        }

        /* renamed from: k */
        public a m8170k(Bundle bundle) {
            if (bundle == null) {
                this.f9182a.putBundle("extras", null);
            } else {
                this.f9182a.putBundle("extras", new Bundle(bundle));
            }
            return this;
        }

        /* renamed from: l */
        public a m8171l(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("iconUri must not be null");
            }
            this.f9182a.putString("iconUri", uri.toString());
            return this;
        }

        /* renamed from: m */
        public a m8172m(String str) {
            if (str == null) {
                throw new NullPointerException("id must not be null");
            }
            this.f9182a.putString(OutcomeConstants.OUTCOME_ID, str);
            return this;
        }

        /* renamed from: n */
        public a m8173n(String str) {
            if (str == null) {
                throw new NullPointerException("name must not be null");
            }
            this.f9182a.putString("name", str);
            return this;
        }

        /* renamed from: o */
        public a m8174o(int i) {
            this.f9182a.putInt("playbackStream", i);
            return this;
        }

        /* renamed from: p */
        public a m8175p(int i) {
            this.f9182a.putInt("playbackType", i);
            return this;
        }

        /* renamed from: q */
        public a m8176q(int i) {
            this.f9182a.putInt("presentationDisplayId", i);
            return this;
        }

        /* renamed from: r */
        public a m8177r(int i) {
            this.f9182a.putInt("volume", i);
            return this;
        }

        /* renamed from: s */
        public a m8178s(int i) {
            this.f9182a.putInt("volumeHandling", i);
            return this;
        }

        /* renamed from: t */
        public a m8179t(int i) {
            this.f9182a.putInt("volumeMax", i);
            return this;
        }

        public a(C2315c c2315c) {
            if (c2315c != null) {
                this.f9182a = new Bundle(c2315c.f9179a);
                if (!c2315c.m8145k().isEmpty()) {
                    this.f9183b = new ArrayList(c2315c.m8145k());
                }
                if (c2315c.m8141g().isEmpty()) {
                    return;
                }
                this.f9184c = new ArrayList(c2315c.f9181c);
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
