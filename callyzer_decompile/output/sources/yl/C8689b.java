package yl;

import java.math.BigInteger;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yl.b */
/* loaded from: classes.dex */
public final class C8689b implements PublicKey {

    /* renamed from: a */
    public final PublicKey f42050a;

    /* renamed from: b */
    public final byte[] f42051b;

    /* renamed from: c */
    public final BigInteger f42052c;

    /* renamed from: d */
    public final long f42053d;

    /* renamed from: e */
    public final String f42054e;

    /* renamed from: f */
    public final ArrayList f42055f;

    /* renamed from: g */
    public final Date f42056g;

    /* renamed from: h */
    public final Date f42057h;

    /* renamed from: j */
    public final LinkedHashMap f42058j;

    /* renamed from: k */
    public final LinkedHashMap f42059k;

    /* renamed from: l */
    public final byte[] f42060l;

    /* renamed from: m */
    public final byte[] f42061m;

    public C8689b(C8688a c8688a) {
        this.f42050a = c8688a.f42038a;
        this.f42051b = c8688a.f42039b;
        this.f42052c = c8688a.f42040c;
        this.f42053d = c8688a.f42041d;
        this.f42054e = c8688a.f42042e;
        this.f42055f = c8688a.f42043f;
        this.f42056g = c8688a.f42044g;
        this.f42057h = c8688a.f42045h;
        this.f42058j = c8688a.f42046i;
        this.f42059k = c8688a.f42047j;
        this.f42060l = c8688a.f42048k;
        this.f42061m = c8688a.f42049l;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f42050a.getAlgorithm();
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.f42050a.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return this.f42050a.getFormat();
    }
}
