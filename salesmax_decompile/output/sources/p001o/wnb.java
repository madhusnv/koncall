package p001o;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class wnb implements zdb {

    /* renamed from: a */
    public final String f52392a;

    /* renamed from: b */
    public final rdb f52393b;

    /* renamed from: c */
    public final ConcurrentHashMap f52394c;

    /* renamed from: d */
    public final ConcurrentHashMap f52395d;

    public wnb(String str, rdb rdbVar) {
        this.f52394c = new ConcurrentHashMap();
        this.f52395d = new ConcurrentHashMap();
        this.f52392a = str;
        this.f52393b = rdbVar;
    }

    @Override // p001o.zdb
    /* renamed from: a */
    public i7d mo54746a(String str) {
        return sdb.m48260a(str, this.f52394c, this.f52392a, this.f52393b);
    }

    @Override // p001o.zdb
    /* renamed from: b */
    public i7d mo54747b(int i) {
        if (m54748c(i)) {
            return sdb.m48260a(Integer.valueOf(i), this.f52395d, this.f52392a, this.f52393b);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m54748c(int i) {
        List list = (List) u84.m51203a().get(Integer.valueOf(i));
        return list.size() == 1 && "001".equals(list.get(0));
    }

    public wnb(rdb rdbVar) {
        this("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto", rdbVar);
    }
}
