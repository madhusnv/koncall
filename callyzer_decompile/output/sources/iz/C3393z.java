package iz;

import kotlin.jvm.internal.AbstractC4154l;
import nx.C5176n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.z */
/* loaded from: classes3.dex */
public final class C3393z {

    /* renamed from: e */
    public static final C5176n f18000e = new C5176n("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f */
    public static final C5176n f18001f = new C5176n(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f18002a;

    /* renamed from: b */
    public final String f18003b;

    /* renamed from: c */
    public final String f18004c;

    /* renamed from: d */
    public final String[] f18005d;

    public C3393z(String mediaType, String str, String str2, String[] parameterNamesAndValues) {
        AbstractC4154l.m8923f(mediaType, "mediaType");
        AbstractC4154l.m8923f(parameterNamesAndValues, "parameterNamesAndValues");
        this.f18002a = mediaType;
        this.f18003b = str;
        this.f18004c = str2;
        this.f18005d = parameterNamesAndValues;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3393z) && AbstractC4154l.m8918a(((C3393z) obj).f18002a, this.f18002a);
    }

    public final int hashCode() {
        return this.f18002a.hashCode();
    }

    public final String toString() {
        return this.f18002a;
    }
}
