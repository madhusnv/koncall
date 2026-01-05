package androidx.mediarouter.media;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.mediarouter.media.e */
/* loaded from: classes2.dex */
public final class C2317e {

    /* renamed from: a */
    public Bundle f9219a;

    /* renamed from: b */
    public final List f9220b;

    /* renamed from: c */
    public final boolean f9221c;

    public C2317e(List list, boolean z) {
        this.f9220b = list == null ? Collections.emptyList() : list;
        this.f9221c = z;
    }

    /* renamed from: b */
    public static C2317e m8209b(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(C2315c.m8135e((Bundle) parcelableArrayList.get(i)));
            }
            arrayList = arrayList2;
        }
        return new C2317e(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    /* renamed from: a */
    public Bundle m8210a() {
        Bundle bundle = this.f9219a;
        if (bundle != null) {
            return bundle;
        }
        this.f9219a = new Bundle();
        List list = this.f9220b;
        if (list != null && !list.isEmpty()) {
            int size = this.f9220b.size();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(((C2315c) this.f9220b.get(i)).m8136a());
            }
            this.f9219a.putParcelableArrayList("routes", arrayList);
        }
        this.f9219a.putBoolean("supportsDynamicGroupRoute", this.f9221c);
        return this.f9219a;
    }

    /* renamed from: c */
    public List m8211c() {
        return this.f9220b;
    }

    /* renamed from: d */
    public boolean m8212d() {
        int size = m8211c().size();
        for (int i = 0; i < size; i++) {
            C2315c c2315c = (C2315c) this.f9220b.get(i);
            if (c2315c == null || !c2315c.m8159y()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public boolean m8213e() {
        return this.f9221c;
    }

    public String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(m8211c().toArray()) + ", isValid=" + m8212d() + " }";
    }

    /* renamed from: androidx.mediarouter.media.e$a */
    public static final class a {

        /* renamed from: a */
        public List f9222a;

        /* renamed from: b */
        public boolean f9223b;

        public a() {
            this.f9223b = false;
        }

        /* renamed from: a */
        public a m8214a(C2315c c2315c) {
            if (c2315c == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            List list = this.f9222a;
            if (list == null) {
                this.f9222a = new ArrayList();
            } else if (list.contains(c2315c)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.f9222a.add(c2315c);
            return this;
        }

        /* renamed from: b */
        public a m8215b(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("routes must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    m8214a((C2315c) it.next());
                }
            }
            return this;
        }

        /* renamed from: c */
        public C2317e m8216c() {
            return new C2317e(this.f9222a, this.f9223b);
        }

        /* renamed from: d */
        public a m8217d(Collection collection) {
            if (collection == null || collection.isEmpty()) {
                this.f9222a = null;
            } else {
                this.f9222a = new ArrayList(collection);
            }
            return this;
        }

        /* renamed from: e */
        public a m8218e(boolean z) {
            this.f9223b = z;
            return this;
        }

        public a(C2317e c2317e) {
            this.f9223b = false;
            if (c2317e != null) {
                this.f9222a = c2317e.f9220b;
                this.f9223b = c2317e.f9221c;
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }
    }
}
