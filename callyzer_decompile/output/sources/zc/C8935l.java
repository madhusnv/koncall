package zc;

import com.sun.mail.util.AbstractC1452a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import rw.AbstractC6664n;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zc.l */
/* loaded from: classes.dex */
public final class C8935l {

    /* renamed from: c */
    public static final C8935l f42908c;

    /* renamed from: d */
    public static final C8935l f42909d;

    /* renamed from: e */
    public static final LinkedHashMap f42910e;

    /* renamed from: a */
    public final String f42911a;

    /* renamed from: b */
    public final int f42912b;

    static {
        C8935l c8935l = new C8935l("https", 443);
        f42908c = c8935l;
        C8935l c8935l2 = new C8935l("http", 80);
        f42909d = c8935l2;
        List listM10834i = pe.m10834i(c8935l2, c8935l, new C8935l("ws", 80), new C8935l("wss", 443));
        int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(listM10834i, 10));
        if (iM12776d < 16) {
            iM12776d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d);
        for (Object obj : listM10834i) {
            linkedHashMap.put(((C8935l) obj).f42911a, obj);
        }
        f42910e = linkedHashMap;
    }

    public C8935l(String protocolName, int i10) {
        AbstractC4154l.m8923f(protocolName, "protocolName");
        this.f42911a = protocolName;
        this.f42912b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8935l)) {
            return false;
        }
        C8935l c8935l = (C8935l) obj;
        return AbstractC4154l.m8918a(this.f42911a, c8935l.f42911a) && this.f42912b == c8935l.f42912b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42912b) + (this.f42911a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Scheme(protocolName=");
        sb2.append(this.f42911a);
        sb2.append(", defaultPort=");
        return AbstractC1452a.m4563j(sb2, this.f42912b, ')');
    }
}
