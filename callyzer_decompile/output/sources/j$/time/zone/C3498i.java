package j$.time.zone;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: j$.time.zone.i */
/* loaded from: classes2.dex */
public final class C3498i {

    /* renamed from: b */
    public static final CopyOnWriteArrayList f18335b;

    /* renamed from: c */
    public static final ConcurrentMap f18336c;

    /* renamed from: d */
    public static volatile Set f18337d;

    /* renamed from: a */
    public final Set f18338a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f18335b = copyOnWriteArrayList;
        f18336c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C3497h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* renamed from: a */
    public static C3495f m8050a(String str) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f18336c;
        C3498i c3498i = (C3498i) concurrentHashMap.get(str);
        if (c3498i == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new C3496g("No time-zone data files registered");
            }
            throw new C3496g("Unknown time-zone ID: ".concat(str));
        }
        if (c3498i.f18338a.contains(str)) {
            return new C3495f(TimeZone.getTimeZone(str));
        }
        throw new C3496g("Not a built-in time zone: ".concat(str));
    }

    /* renamed from: b */
    public static void m8051b(C3498i c3498i) {
        Objects.requireNonNull(c3498i, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        synchronized (C3498i.class) {
            try {
                for (String str : c3498i.f18338a) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((C3498i) ((ConcurrentHashMap) f18336c).putIfAbsent(str, c3498i)) != null) {
                        throw new C3496g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + c3498i);
                    }
                }
                f18337d = Collections.unmodifiableSet(new HashSet(((ConcurrentHashMap) f18336c).keySet()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f18335b.add(c3498i);
    }

    public C3498i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f18338a = Collections.unmodifiableSet(linkedHashSet);
    }
}
