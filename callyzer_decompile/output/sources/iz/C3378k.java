package iz;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.k */
/* loaded from: classes3.dex */
public final class C3378k {

    /* renamed from: a */
    public boolean f17913a;

    /* renamed from: b */
    public boolean f17914b;

    /* renamed from: c */
    public Object f17915c;

    /* renamed from: d */
    public Object f17916d;

    public C3378k() {
        this.f17913a = true;
    }

    /* renamed from: a */
    public C3379l m7733a() {
        return new C3379l(this.f17913a, this.f17914b, (String[]) this.f17915c, (String[]) this.f17916d);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l7.C4408h m7734b() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iz.C3378k.m7734b():l7.h");
    }

    /* renamed from: c */
    public void m7735c(C3376i... cipherSuites) {
        AbstractC4154l.m8923f(cipherSuites, "cipherSuites");
        if (!this.f17913a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (C3376i c3376i : cipherSuites) {
            arrayList.add(c3376i.f17888a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m7736d((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: d */
    public void m7736d(String... cipherSuites) {
        AbstractC4154l.m8923f(cipherSuites, "cipherSuites");
        if (!this.f17913a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        this.f17915c = (String[]) objArrCopyOf;
    }

    /* renamed from: e */
    public void m7737e(q0... tlsVersions) {
        AbstractC4154l.m8923f(tlsVersions, "tlsVersions");
        if (!this.f17913a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(tlsVersions.length);
        for (q0 q0Var : tlsVersions) {
            arrayList.add(q0Var.javaName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        m7738f((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: f */
    public void m7738f(String... tlsVersions) {
        AbstractC4154l.m8923f(tlsVersions, "tlsVersions");
        if (!this.f17913a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        this.f17916d = (String[]) objArrCopyOf;
    }

    public C3378k(C3379l connectionSpec) {
        AbstractC4154l.m8923f(connectionSpec, "connectionSpec");
        this.f17913a = connectionSpec.f17935a;
        this.f17915c = connectionSpec.f17937c;
        this.f17916d = connectionSpec.f17938d;
        this.f17914b = connectionSpec.f17936b;
    }
}
