package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.lifecycle.C2151t;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p001o.cqb;
import p001o.f1f;
import p001o.hpb;
import p001o.id5;
import p001o.in1;
import p001o.isa;
import p001o.sq8;
import p001o.vyh;

/* renamed from: androidx.lifecycle.t */
/* loaded from: classes2.dex */
public final class C2151t {

    /* renamed from: f */
    public static final a f7749f = new a(null);

    /* renamed from: g */
    public static final Class[] f7750g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    public final Map f7751a;

    /* renamed from: b */
    public final Map f7752b;

    /* renamed from: c */
    public final Map f7753c;

    /* renamed from: d */
    public final Map f7754d;

    /* renamed from: e */
    public final f1f.InterfaceC13312c f7755e;

    /* renamed from: androidx.lifecycle.t$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final C2151t m6590a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C2151t();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    sq8.m48648g(str, TransferTable.COLUMN_KEY);
                    map.put(str, bundle2.get(str));
                }
                return new C2151t(map);
            }
            ClassLoader classLoader = C2151t.class.getClassLoader();
            sq8.m48646e(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(UserMetadata.KEYDATA_FILENAME);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new C2151t(linkedHashMap);
        }

        /* renamed from: b */
        public final boolean m6591b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C2151t.f7750g) {
                sq8.m48646e(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C2151t(Map map) {
        sq8.m48649h(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f7751a = linkedHashMap;
        this.f7752b = new LinkedHashMap();
        this.f7753c = new LinkedHashMap();
        this.f7754d = new LinkedHashMap();
        this.f7755e = new f1f.InterfaceC13312c() { // from class: o.b1f
            @Override // p001o.f1f.InterfaceC13312c
            /* renamed from: a */
            public final Bundle mo3785a() {
                return C2151t.m6584i(this.f15452a);
            }
        };
        linkedHashMap.putAll(map);
    }

    /* renamed from: i */
    public static final Bundle m6584i(C2151t c2151t) {
        sq8.m48649h(c2151t, "this$0");
        for (Map.Entry entry : isa.m32693t(c2151t.f7752b).entrySet()) {
            c2151t.m6589j((String) entry.getKey(), ((f1f.InterfaceC13312c) entry.getValue()).mo3785a());
        }
        Set<String> setKeySet = c2151t.f7751a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(c2151t.f7751a.get(str));
        }
        return in1.m32435b(vyh.m53620a(UserMetadata.KEYDATA_FILENAME, arrayList), vyh.m53620a("values", arrayList2));
    }

    /* renamed from: e */
    public final hpb m6585e(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        hpb hpbVarM6586f = m6586f(str, false, null);
        sq8.m48647f(hpbVarM6586f, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return hpbVarM6586f;
    }

    /* renamed from: f */
    public final hpb m6586f(String str, boolean z, Object obj) {
        b bVar;
        Object obj2 = this.f7753c.get(str);
        hpb hpbVar = obj2 instanceof hpb ? (hpb) obj2 : null;
        if (hpbVar != null) {
            return hpbVar;
        }
        if (this.f7751a.containsKey(str)) {
            bVar = new b(this, str, this.f7751a.get(str));
        } else if (z) {
            this.f7751a.put(str, obj);
            bVar = new b(this, str, obj);
        } else {
            bVar = new b(this, str);
        }
        this.f7753c.put(str, bVar);
        return bVar;
    }

    /* renamed from: g */
    public final Object m6587g(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Object objRemove = this.f7751a.remove(str);
        b bVar = (b) this.f7753c.remove(str);
        if (bVar != null) {
            bVar.m6592c();
        }
        this.f7754d.remove(str);
        return objRemove;
    }

    /* renamed from: h */
    public final f1f.InterfaceC13312c m6588h() {
        return this.f7755e;
    }

    /* renamed from: j */
    public final void m6589j(String str, Object obj) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        if (!f7749f.m6591b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            sq8.m48646e(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f7753c.get(str);
        hpb hpbVar = obj2 instanceof hpb ? (hpb) obj2 : null;
        if (hpbVar != null) {
            hpbVar.setValue(obj);
        } else {
            this.f7751a.put(str, obj);
        }
        cqb cqbVar = (cqb) this.f7754d.get(str);
        if (cqbVar == null) {
            return;
        }
        cqbVar.setValue(obj);
    }

    /* renamed from: androidx.lifecycle.t$b */
    public static final class b extends hpb {

        /* renamed from: a */
        public String f7756a;

        /* renamed from: b */
        public C2151t f7757b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2151t c2151t, String str, Object obj) {
            super(obj);
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            this.f7756a = str;
            this.f7757b = c2151t;
        }

        /* renamed from: c */
        public final void m6592c() {
            this.f7757b = null;
        }

        @Override // p001o.hpb, androidx.lifecycle.AbstractC2145n
        public void setValue(Object obj) {
            C2151t c2151t = this.f7757b;
            if (c2151t != null) {
                c2151t.f7751a.put(this.f7756a, obj);
                cqb cqbVar = (cqb) c2151t.f7754d.get(this.f7756a);
                if (cqbVar != null) {
                    cqbVar.setValue(obj);
                }
            }
            super.setValue(obj);
        }

        public b(C2151t c2151t, String str) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            this.f7756a = str;
            this.f7757b = c2151t;
        }
    }

    public C2151t() {
        this.f7751a = new LinkedHashMap();
        this.f7752b = new LinkedHashMap();
        this.f7753c = new LinkedHashMap();
        this.f7754d = new LinkedHashMap();
        this.f7755e = new f1f.InterfaceC13312c() { // from class: o.b1f
            @Override // p001o.f1f.InterfaceC13312c
            /* renamed from: a */
            public final Bundle mo3785a() {
                return C2151t.m6584i(this.f15452a);
            }
        };
    }
}
