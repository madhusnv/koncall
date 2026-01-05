package qe;

import a9.C0073l;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.sun.mail.util.AbstractC1452a;
import dg.C1720i;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;
import ng.C5070u;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qe.e */
/* loaded from: classes.dex */
public final class C6194e implements InterfaceC6199j {

    /* renamed from: q */
    public static final AtomicLong f30155q = new AtomicLong(1);

    /* renamed from: a */
    public final long f30156a;

    /* renamed from: b */
    public final C8989c f30157b;

    /* renamed from: c */
    public final Date f30158c;

    /* renamed from: d */
    public Date f30159d;

    /* renamed from: e */
    public Date f30160e;

    /* renamed from: f */
    public final String[] f30161f;

    /* renamed from: g */
    public final LinkedList f30162g;

    /* renamed from: h */
    public final Object f30163h;

    /* renamed from: i */
    public EnumC6200k f30164i;

    /* renamed from: j */
    public C1720i f30165j;

    /* renamed from: k */
    public String f30166k;

    /* renamed from: l */
    public final EnumC6197h f30167l;

    /* renamed from: m */
    public final C5070u f30168m;

    /* renamed from: n */
    public final C0073l f30169n;

    /* renamed from: o */
    public final LinkedList f30170o;

    /* renamed from: p */
    public final Object f30171p;

    public C6194e(String[] strArr, C0073l c0073l, C8989c c8989c, C5070u c5070u, EnumC6197h enumC6197h) {
        long andIncrement = f30155q.getAndIncrement();
        this.f30156a = andIncrement;
        this.f30157b = c8989c;
        this.f30158c = new Date();
        this.f30159d = null;
        this.f30160e = null;
        this.f30161f = strArr;
        this.f30162g = new LinkedList();
        this.f30163h = new Object();
        this.f30164i = EnumC6200k.CREATED;
        this.f30165j = null;
        this.f30166k = null;
        this.f30167l = enumC6197h;
        synchronized (FFmpegKitConfig.f5951f) {
            try {
                C6191b c6191b = FFmpegKitConfig.f5949d;
                if (!c6191b.containsKey(Long.valueOf(andIncrement))) {
                    c6191b.put(Long.valueOf(andIncrement), this);
                    FFmpegKitConfig.f5950e.add(this);
                    FFmpegKitConfig.m3079b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f30169n = c0073l;
        this.f30168m = c5070u;
        this.f30170o = new LinkedList();
        this.f30171p = new Object();
    }

    /* renamed from: a */
    public final String m12209a() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f30163h) {
            try {
                Iterator it = this.f30162g.iterator();
                while (it.hasNext()) {
                    sb2.append(((C6196g) it.next()).f30174c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sb2.toString();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FFmpegSession{sessionId=");
        sb2.append(this.f30156a);
        sb2.append(", createTime=");
        sb2.append(this.f30158c);
        sb2.append(", startTime=");
        sb2.append(this.f30159d);
        sb2.append(", endTime=");
        sb2.append(this.f30160e);
        sb2.append(", arguments=");
        sb2.append(FFmpegKitConfig.m3078a(this.f30161f));
        sb2.append(", logs=");
        sb2.append(m12209a());
        sb2.append(", state=");
        sb2.append(this.f30164i);
        sb2.append(", returnCode=");
        sb2.append(this.f30165j);
        sb2.append(", failStackTrace='");
        return AbstractC1452a.m4564k(sb2, this.f30166k, "'}");
    }
}
