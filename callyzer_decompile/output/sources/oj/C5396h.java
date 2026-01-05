package oj;

import ab.C0084b;
import android.content.Context;
import android.os.Build;
import dr.C1770t;
import gj.C2619a;
import i0.m0;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import ob.C5333a;
import og.cf;
import og.kg;
import s6.C6763b;
import s6.C6765d;
import tx.c0;
import uw.C7565i;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oj.h */
/* loaded from: classes.dex */
public final class C5396h {

    /* renamed from: b */
    public static final C6765d f27082b = cf.m10583d("fire-global");

    /* renamed from: c */
    public static final C6765d f27083c = cf.m10583d("fire-count");

    /* renamed from: d */
    public static final C6765d f27084d = cf.m10584e("last-used-date");

    /* renamed from: a */
    public final C2619a f27085a;

    public C5396h(Context context, String str) {
        this.f27085a = new C2619a(context, m0.m7378k("FirebaseHeartBeat", str));
    }

    /* renamed from: a */
    public final synchronized ArrayList m11114a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strM11115b = m11115b(System.currentTimeMillis());
            C2619a c2619a = this.f27085a;
            c2619a.getClass();
            for (Map.Entry entry : ((Map) c0.m13468D(C7565i.f36440a, new C0084b(c2619a, null, 16))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strM11115b);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C5389a(((C6765d) entry.getKey()).f32221a, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f27085a.m6594a(new C5333a(1, jCurrentTimeMillis));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized String m11115b(long j6) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j6)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j6));
    }

    /* renamed from: c */
    public final synchronized C6765d m11116c(C6763b c6763b, String str) {
        for (Map.Entry entry : c6763b.m12964a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return cf.m10585f(((C6765d) entry.getKey()).f32221a);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public final synchronized void m11117d(C6763b c6763b, String str) {
        try {
            C6765d c6765dM11116c = m11116c(c6763b, str);
            if (c6765dM11116c == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) kg.m10742b(c6763b, c6765dM11116c, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                c6763b.m12967d(c6765dM11116c);
            } else {
                c6763b.m12969f(c6765dM11116c, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: e */
    public final synchronized boolean m11118e(C6765d key, long j6) {
        InterfaceC7559c interfaceC7559c;
        C7565i c7565i;
        long jLongValue;
        C2619a c2619a = this.f27085a;
        c2619a.getClass();
        AbstractC4154l.m8923f(key, "key");
        interfaceC7559c = null;
        C1770t c1770t = new C1770t(c2619a, key, interfaceC7559c, 25);
        c7565i = C7565i.f36440a;
        jLongValue = ((Long) c0.m13468D(c7565i, c1770t)).longValue();
        synchronized (this) {
        }
        if (m11115b(jLongValue).equals(m11115b(j6))) {
            return false;
        }
        C2619a c2619a2 = this.f27085a;
        Long lValueOf = Long.valueOf(j6);
        c2619a2.getClass();
        return true;
    }
}
