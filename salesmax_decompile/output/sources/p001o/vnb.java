package p001o;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class vnb implements ydb {

    /* renamed from: a */
    public final String f50591a;

    /* renamed from: b */
    public final String f50592b;

    /* renamed from: c */
    public final String f50593c;

    /* renamed from: d */
    public final tdb f50594d;

    /* renamed from: e */
    public final ConcurrentHashMap f50595e;

    /* renamed from: f */
    public final ConcurrentHashMap f50596f;

    public vnb(String str, String str2, String str3, qdb qdbVar) {
        this.f50595e = new ConcurrentHashMap();
        this.f50596f = new ConcurrentHashMap();
        this.f50591a = str;
        this.f50592b = str2;
        this.f50593c = str3;
        this.f50594d = new tdb(qdbVar);
    }

    @Override // p001o.ydb
    /* renamed from: a */
    public h7d mo53070a(String str) {
        return this.f50594d.m49754a(str, this.f50595e, this.f50591a);
    }

    @Override // p001o.ydb
    /* renamed from: b */
    public h7d mo53071b(int i) {
        if (m53072c(i)) {
            return this.f50594d.m49754a(Integer.valueOf(i), this.f50596f, this.f50591a);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m53072c(int i) {
        List list = (List) t84.m49558a().get(Integer.valueOf(i));
        return list.size() == 1 && "001".equals(list.get(0));
    }

    public vnb(qdb qdbVar) {
        this("/io/michaelrocks/libphonenumber/android/data/PhoneNumberMetadataProto", "/io/michaelrocks/libphonenumber/android/data/PhoneNumberAlternateFormatsProto", "/io/michaelrocks/libphonenumber/android/data/ShortNumberMetadataProto", qdbVar);
    }
}
