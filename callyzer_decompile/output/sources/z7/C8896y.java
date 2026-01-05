package z7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC4154l;
import l8.InterfaceC4432f;
import l8.InterfaceC4433g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.y */
/* loaded from: classes.dex */
public final class C8896y implements InterfaceC4433g, InterfaceC4432f {

    /* renamed from: j */
    public static final TreeMap f42845j = new TreeMap();

    /* renamed from: a */
    public final int f42846a;

    /* renamed from: b */
    public volatile String f42847b;

    /* renamed from: c */
    public final long[] f42848c;

    /* renamed from: d */
    public final double[] f42849d;

    /* renamed from: e */
    public final String[] f42850e;

    /* renamed from: f */
    public final byte[][] f42851f;

    /* renamed from: g */
    public final int[] f42852g;

    /* renamed from: h */
    public int f42853h;

    public C8896y(int i10) {
        this.f42846a = i10;
        int i11 = i10 + 1;
        this.f42852g = new int[i11];
        this.f42848c = new long[i11];
        this.f42849d = new double[i11];
        this.f42850e = new String[i11];
        this.f42851f = new byte[i11][];
    }

    /* renamed from: j */
    public static final C8896y m16401j(int i10, String query) {
        AbstractC4154l.m8923f(query, "query");
        TreeMap treeMap = f42845j;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (entryCeilingEntry == null) {
                C8896y c8896y = new C8896y(i10);
                c8896y.f42847b = query;
                c8896y.f42853h = i10;
                return c8896y;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            C8896y c8896y2 = (C8896y) entryCeilingEntry.getValue();
            c8896y2.getClass();
            c8896y2.f42847b = query;
            c8896y2.f42853h = i10;
            return c8896y2;
        }
    }

    @Override // l8.InterfaceC4432f
    /* renamed from: L */
    public final void mo9274L(int i10, byte[] bArr) {
        this.f42852g[i10] = 5;
        this.f42851f[i10] = bArr;
    }

    @Override // l8.InterfaceC4432f
    /* renamed from: Z */
    public final void mo9275Z(double d2, int i10) {
        this.f42852g[i10] = 3;
        this.f42849d[i10] = d2;
    }

    @Override // l8.InterfaceC4432f
    /* renamed from: g */
    public final void mo9276g(int i10, long j6) {
        this.f42852g[i10] = 2;
        this.f42848c[i10] = j6;
    }

    @Override // l8.InterfaceC4433g
    /* renamed from: h */
    public final void mo5739h(InterfaceC4432f interfaceC4432f) {
        int i10 = this.f42853h;
        if (1 > i10) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.f42852g[i11];
            if (i12 == 1) {
                interfaceC4432f.mo9277i(i11);
            } else if (i12 == 2) {
                interfaceC4432f.mo9276g(i11, this.f42848c[i11]);
            } else if (i12 == 3) {
                interfaceC4432f.mo9275Z(this.f42849d[i11], i11);
            } else if (i12 == 4) {
                String str = this.f42850e[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC4432f.mo9278q(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.f42851f[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC4432f.mo9274L(i11, bArr);
            }
            if (i11 == i10) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // l8.InterfaceC4432f
    /* renamed from: i */
    public final void mo9277i(int i10) {
        this.f42852g[i10] = 1;
    }

    @Override // l8.InterfaceC4433g
    /* renamed from: n */
    public final String mo5740n() {
        String str = this.f42847b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // l8.InterfaceC4432f
    /* renamed from: q */
    public final void mo9278q(int i10, String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f42852g[i10] = 4;
        this.f42850e[i10] = value;
    }

    /* renamed from: u */
    public final void m16402u() {
        TreeMap treeMap = f42845j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f42846a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                AbstractC4154l.m8922e(it, "iterator(...)");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
