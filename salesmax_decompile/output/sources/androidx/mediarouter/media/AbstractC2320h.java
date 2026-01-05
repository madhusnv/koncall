package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Bundle;
import androidx.mediarouter.media.C2315c;
import androidx.mediarouter.media.C2318f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p001o.b5b;
import p001o.c8b;
import p001o.d8b;
import p001o.e7b;
import p001o.m7b;
import p001o.x7b;

/* renamed from: androidx.mediarouter.media.h */
/* loaded from: classes2.dex */
public abstract class AbstractC2320h {
    /* renamed from: a */
    public static List m8377a(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM18167a = b5b.m18167a(it.next());
            if (mediaRoute2InfoM18167a != null) {
                arrayList.add(mediaRoute2InfoM18167a.getId());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m8378b(String str) {
        str.hashCode();
        switch (str) {
            case "android.media.route.feature.REMOTE_PLAYBACK":
                return "android.media.intent.category.REMOTE_PLAYBACK";
            case "android.media.route.feature.LIVE_AUDIO":
                return "android.media.intent.category.LIVE_AUDIO";
            case "android.media.route.feature.LIVE_VIDEO":
                return "android.media.intent.category.LIVE_VIDEO";
            default:
                return str;
        }
    }

    /* renamed from: c */
    public static RouteDiscoveryPreference m8379c(e7b e7bVar) {
        if (e7bVar == null || !e7bVar.m24487f()) {
            x7b.m55794a();
            return m7b.m38483a(new ArrayList(), false).build();
        }
        boolean zM24486e = e7bVar.m24486e();
        ArrayList arrayList = new ArrayList();
        Iterator it = e7bVar.m24485d().m8223e().iterator();
        while (it.hasNext()) {
            arrayList.add(m8384h((String) it.next()));
        }
        return m7b.m38483a(arrayList, zM24486e).build();
    }

    /* renamed from: d */
    public static Collection m8380d(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            int iCountCategories = intentFilter.countCategories();
            for (int i = 0; i < iCountCategories; i++) {
                hashSet.add(m8384h(intentFilter.getCategory(i)));
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaRoute2Info m8381e(C2315c c2315c) {
        if (c2315c == null) {
            return null;
        }
        d8b.m22607a();
        MediaRoute2Info.Builder iconUri = c8b.m20493a(c2315c.m8147m(), c2315c.m8150p()).setDescription(c2315c.m8142h()).setConnectionState(c2315c.m8140f()).setVolumeHandling(c2315c.m8156v()).setVolume(c2315c.m8155u()).setVolumeMax(c2315c.m8157w()).addFeatures(m8380d(c2315c.m8141g())).setIconUri(c2315c.m8146l());
        int iM8143i = c2315c.m8143i();
        if (iM8143i != 1) {
            if (iM8143i == 2) {
            }
            if (!c2315c.m8145k().isEmpty()) {
                iconUri.addFeature("android.media.route.feature.REMOTE_GROUP_PLAYBACK");
            }
            Bundle bundle = new Bundle();
            bundle.putBundle("androidx.mediarouter.media.KEY_EXTRAS", c2315c.m8144j());
            bundle.putParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS", new ArrayList<>(c2315c.m8141g()));
            bundle.putInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", c2315c.m8143i());
            bundle.putInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", c2315c.m8152r());
            bundle.putString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID", c2315c.m8147m());
            iconUri.setExtras(bundle);
            if (c2315c.m8141g().isEmpty()) {
                iconUri.addFeature("android.media.route.feature.EMPTY");
            }
            return iconUri.build();
        }
        iconUri.addFeature("android.media.route.feature.REMOTE_VIDEO_PLAYBACK");
        iconUri.addFeature("android.media.route.feature.REMOTE_AUDIO_PLAYBACK");
        if (!c2315c.m8145k().isEmpty()) {
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("androidx.mediarouter.media.KEY_EXTRAS", c2315c.m8144j());
        bundle2.putParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS", new ArrayList<>(c2315c.m8141g()));
        bundle2.putInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", c2315c.m8143i());
        bundle2.putInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", c2315c.m8152r());
        bundle2.putString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID", c2315c.m8147m());
        iconUri.setExtras(bundle2);
        if (c2315c.m8141g().isEmpty()) {
        }
        return iconUri.build();
    }

    /* renamed from: f */
    public static C2315c m8382f(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        C2315c.a aVarM8165f = new C2315c.a(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString()).m8166g(mediaRoute2Info.getConnectionState()).m8178s(mediaRoute2Info.getVolumeHandling()).m8179t(mediaRoute2Info.getVolumeMax()).m8177r(mediaRoute2Info.getVolume()).m8170k(mediaRoute2Info.getExtras()).m8169j(true).m8165f(false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            aVarM8165f.m8167h(description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            aVarM8165f.m8171l(iconUri);
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null || !extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        aVarM8165f.m8170k(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        aVarM8165f.m8168i(extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        aVarM8165f.m8175p(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            aVarM8165f.m8161b(parcelableArrayList);
        }
        return aVarM8165f.m8164e();
    }

    /* renamed from: g */
    public static e7b m8383g(RouteDiscoveryPreference routeDiscoveryPreference) {
        ArrayList arrayList = new ArrayList();
        Iterator it = routeDiscoveryPreference.getPreferredFeatures().iterator();
        while (it.hasNext()) {
            arrayList.add(m8378b((String) it.next()));
        }
        return new e7b(new C2318f.a().m8227a(arrayList).m8230d(), routeDiscoveryPreference.shouldPerformActiveScan());
    }

    /* renamed from: h */
    public static String m8384h(String str) {
        str.hashCode();
        switch (str) {
            case "android.media.intent.category.REMOTE_PLAYBACK":
                return "android.media.route.feature.REMOTE_PLAYBACK";
            case "android.media.intent.category.LIVE_AUDIO":
                return "android.media.route.feature.LIVE_AUDIO";
            case "android.media.intent.category.LIVE_VIDEO":
                return "android.media.route.feature.LIVE_VIDEO";
            default:
                return str;
        }
    }
}
