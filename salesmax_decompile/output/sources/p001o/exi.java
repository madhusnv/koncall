package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class exi {

    /* renamed from: a */
    public final hhg f22362a = new hhg();

    /* renamed from: b */
    public final Map f22363b = new LinkedHashMap();

    /* renamed from: c */
    public final Set f22364c = new LinkedHashSet();

    /* renamed from: d */
    public volatile boolean f22365d;

    /* renamed from: d */
    public final void m25830d(String str, AutoCloseable autoCloseable) throws Exception {
        AutoCloseable autoCloseable2;
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(autoCloseable, "closeable");
        if (this.f22365d) {
            m25832f(autoCloseable);
            return;
        }
        synchronized (this.f22362a) {
            autoCloseable2 = (AutoCloseable) this.f22363b.put(str, autoCloseable);
        }
        m25832f(autoCloseable2);
    }

    /* renamed from: e */
    public final void m25831e() {
        if (this.f22365d) {
            return;
        }
        this.f22365d = true;
        synchronized (this.f22362a) {
            Iterator it = this.f22363b.values().iterator();
            while (it.hasNext()) {
                m25832f((AutoCloseable) it.next());
            }
            Iterator it2 = this.f22364c.iterator();
            while (it2.hasNext()) {
                m25832f((AutoCloseable) it2.next());
            }
            this.f22364c.clear();
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* renamed from: f */
    public final void m25832f(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: g */
    public final AutoCloseable m25833g(String str) {
        AutoCloseable autoCloseable;
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        synchronized (this.f22362a) {
            autoCloseable = (AutoCloseable) this.f22363b.get(str);
        }
        return autoCloseable;
    }
}
