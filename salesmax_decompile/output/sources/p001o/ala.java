package p001o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p001o.i9g;

/* loaded from: classes3.dex */
public final class ala extends i9g implements Serializable, yka {
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f28297c = 0;
        this.f28295a = null;
        this.f28296b = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(m17348h());
    }

    @Override // p001o.yka
    /* renamed from: a */
    public void mo17346a() {
        add(1L);
    }

    @Override // p001o.yka
    public void add(long j) {
        int length;
        i9g.C14227b c14227b;
        i9g.C14227b[] c14227bArr = this.f28295a;
        if (c14227bArr == null) {
            long j2 = this.f28296b;
            if (m31776c(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = (int[]) i9g.f28289d.get();
        boolean zM31780a = true;
        if (iArr != null && c14227bArr != null && (length = c14227bArr.length) >= 1 && (c14227b = c14227bArr[(length - 1) & iArr[0]]) != null) {
            long j3 = c14227b.f28300a;
            zM31780a = c14227b.m31780a(j3, j3 + j);
            if (zM31780a) {
                return;
            }
        }
        m31778g(j, iArr, zM31780a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return m17348h();
    }

    @Override // p001o.i9g
    /* renamed from: e */
    public final long mo17347e(long j, long j2) {
        return j + j2;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return m17348h();
    }

    /* renamed from: h */
    public long m17348h() {
        long j = this.f28296b;
        i9g.C14227b[] c14227bArr = this.f28295a;
        if (c14227bArr != null) {
            for (i9g.C14227b c14227b : c14227bArr) {
                if (c14227b != null) {
                    j += c14227b.f28300a;
                }
            }
        }
        return j;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) m17348h();
    }

    @Override // java.lang.Number
    public long longValue() {
        return m17348h();
    }

    public String toString() {
        return Long.toString(m17348h());
    }
}
