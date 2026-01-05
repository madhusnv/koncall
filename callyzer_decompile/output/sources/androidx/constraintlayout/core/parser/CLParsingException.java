package androidx.constraintlayout.core.parser;

import c5.AbstractC0865c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: a */
    public final String f2145a;

    /* renamed from: b */
    public final String f2146b;

    public CLParsingException(String str, AbstractC0865c abstractC0865c) {
        super(str);
        this.f2145a = str;
        if (abstractC0865c != null) {
            this.f2146b = abstractC0865c.m2330g();
        } else {
            this.f2146b = "unknown";
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CLParsingException (");
        sb2.append(hashCode());
        sb2.append(") : ");
        sb2.append(this.f2145a + " (" + this.f2146b + " at line 0)");
        return sb2.toString();
    }
}
