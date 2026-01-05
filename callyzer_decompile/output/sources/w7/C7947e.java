package w7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w7.e */
/* loaded from: classes.dex */
public final class C7947e {

    /* renamed from: a */
    public final int f38227a;

    /* renamed from: b */
    public final int f38228b;

    /* renamed from: c */
    public final long f38229c;

    /* renamed from: d */
    public final long f38230d;

    public C7947e(int i10, int i11, long j6, long j10) {
        this.f38227a = i10;
        this.f38228b = i11;
        this.f38229c = j6;
        this.f38230d = j10;
    }

    /* renamed from: a */
    public static C7947e m15120a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C7947e c7947e = new C7947e(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c7947e;
        } finally {
        }
    }

    /* renamed from: b */
    public final void m15121b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f38227a);
            dataOutputStream.writeInt(this.f38228b);
            dataOutputStream.writeLong(this.f38229c);
            dataOutputStream.writeLong(this.f38230d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C7947e)) {
            C7947e c7947e = (C7947e) obj;
            if (this.f38228b == c7947e.f38228b && this.f38229c == c7947e.f38229c && this.f38227a == c7947e.f38227a && this.f38230d == c7947e.f38230d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f38228b), Long.valueOf(this.f38229c), Integer.valueOf(this.f38227a), Long.valueOf(this.f38230d));
    }
}
